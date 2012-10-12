package org.cleartk.plugin;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.maven.artifact.DependencyResolutionRequiredException;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;
import org.apache.uima.UIMAFramework;
import org.apache.uima.tools.jcasgen.IError;
import org.apache.uima.tools.jcasgen.Jg;
import org.apache.uima.util.Level;
import org.apache.uima.util.Logger;

/**
 * Applies JCasGen to create Java files from XML type system descriptions.
 * 
 * Note that by default this runs at the process-resources phase because it requires the XML
 * descriptor files to already be at the appropriate places on the classpath, and the
 * generate-resources phase runs before resources are copied.
 * 
 * @goal generate
 * @phase process-resources
 * @requiresDependencyResolution compile
 */
public class JCasGenMojo extends AbstractMojo {

  /**
   * The path to the XML type system description.
   * 
   * @parameter
   * @required
   * @readonly
   */
  private String typeSystem;

  /**
   * The directory where the generated sources will be written.
   * 
   * @parameter default-value="${project.build.directory}/generated-sources/jcasgen"
   * @required
   * @readonly
   */
  private File outputDirectory;

  /**
   * The Maven Project.
   * 
   * @parameter property="project"
   * @required
   * @readonly
   */
  private MavenProject project;

  public void execute() throws MojoExecutionException, MojoFailureException {

    // determine path to type system
    String typeSystemPath = this.typeSystem;
    boolean isFile = false;
    try {
      URL url = new URL(this.typeSystem);
      url.toURI();
    } catch (MalformedURLException e) {
      isFile = true;
    } catch (URISyntaxException e) {
      isFile = true;
    }
    if (isFile) {
      typeSystemPath = new File(this.project.getBasedir(), this.typeSystem).getAbsolutePath();
    }

    // assemble classpath for JCasGen
    StringBuilder classpath = new StringBuilder();
    try {
      for (String element : this.project.getCompileClasspathElements()) {
        if (classpath.length() > 0) {
          classpath.append(File.pathSeparatorChar);
        }
        classpath.append(element);
      }
    } catch (DependencyResolutionRequiredException e) {
      throw new MojoExecutionException("could not resolve classpath", e);
    }

    // run JCasGen to generate the Java sources
    JCasGenErrors error = new JCasGenErrors();
    Jg jCasGen = new Jg();
    jCasGen.error = error;
    String[] args = new String[] {
        "-jcasgeninput",
        typeSystemPath,
        "-jcasgenoutput",
        this.outputDirectory.getAbsolutePath(),
        "=jcasgenclasspath",
        classpath.toString() };
    try {
      jCasGen.main1(args);
    } catch (JCasGenException e) {
      throw new MojoExecutionException(e.getMessage(), e.getCause());
    }

    // add the generated sources to the build
    this.project.addCompileSourceRoot(this.outputDirectory.getPath());
  }

  static class JCasGenErrors implements IError {

    private static Level logLevels[] = new Level[3];
    static {
      logLevels[IError.INFO] = Level.INFO;
      logLevels[IError.WARN] = Level.WARNING;
      logLevels[IError.ERROR] = Level.SEVERE;
    }

    @Override
    public void newError(int severity, String message, Exception exception) {
      Logger log = UIMAFramework.getLogger();
      log.log(logLevels[severity], "JCasGen: " + message, exception);
      if (severity >= IError.ERROR) {
        throw new JCasGenException(exception);
      }
    }
  }

  static class JCasGenException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public JCasGenException(Throwable cause) {
      super(cause);
    }
  }
}