
/* First created by JCasGen Tue Feb 28 22:02:14 MST 2017 */
package org.cleartk.ne.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.cleartk.score.type.ScoredAnnotation_Type;

/** 
 * Updated by JCasGen Tue Feb 28 22:02:14 MST 2017
 * @generated */
public class Ace2005Document_Type extends ScoredAnnotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Ace2005Document_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Ace2005Document_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Ace2005Document(addr, Ace2005Document_Type.this);
  			   Ace2005Document_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Ace2005Document(addr, Ace2005Document_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Ace2005Document.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.cleartk.ne.type.Ace2005Document");
 
  /** @generated */
  final Feature casFeat_aceSource;
  /** @generated */
  final int     casFeatCode_aceSource;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAceSource(int addr) {
        if (featOkTst && casFeat_aceSource == null)
      jcas.throwFeatMissing("aceSource", "org.cleartk.ne.type.Ace2005Document");
    return ll_cas.ll_getStringValue(addr, casFeatCode_aceSource);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAceSource(int addr, String v) {
        if (featOkTst && casFeat_aceSource == null)
      jcas.throwFeatMissing("aceSource", "org.cleartk.ne.type.Ace2005Document");
    ll_cas.ll_setStringValue(addr, casFeatCode_aceSource, v);}
    
  
 
  /** @generated */
  final Feature casFeat_aceUri;
  /** @generated */
  final int     casFeatCode_aceUri;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAceUri(int addr) {
        if (featOkTst && casFeat_aceUri == null)
      jcas.throwFeatMissing("aceUri", "org.cleartk.ne.type.Ace2005Document");
    return ll_cas.ll_getStringValue(addr, casFeatCode_aceUri);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAceUri(int addr, String v) {
        if (featOkTst && casFeat_aceUri == null)
      jcas.throwFeatMissing("aceUri", "org.cleartk.ne.type.Ace2005Document");
    ll_cas.ll_setStringValue(addr, casFeatCode_aceUri, v);}
    
  
 
  /** @generated */
  final Feature casFeat_aceType;
  /** @generated */
  final int     casFeatCode_aceType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAceType(int addr) {
        if (featOkTst && casFeat_aceType == null)
      jcas.throwFeatMissing("aceType", "org.cleartk.ne.type.Ace2005Document");
    return ll_cas.ll_getStringValue(addr, casFeatCode_aceType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAceType(int addr, String v) {
        if (featOkTst && casFeat_aceType == null)
      jcas.throwFeatMissing("aceType", "org.cleartk.ne.type.Ace2005Document");
    ll_cas.ll_setStringValue(addr, casFeatCode_aceType, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Ace2005Document_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_aceSource = jcas.getRequiredFeatureDE(casType, "aceSource", "uima.cas.String", featOkTst);
    casFeatCode_aceSource  = (null == casFeat_aceSource) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_aceSource).getCode();

 
    casFeat_aceUri = jcas.getRequiredFeatureDE(casType, "aceUri", "uima.cas.String", featOkTst);
    casFeatCode_aceUri  = (null == casFeat_aceUri) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_aceUri).getCode();

 
    casFeat_aceType = jcas.getRequiredFeatureDE(casType, "aceType", "uima.cas.String", featOkTst);
    casFeatCode_aceType  = (null == casFeat_aceType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_aceType).getCode();

  }
}



    