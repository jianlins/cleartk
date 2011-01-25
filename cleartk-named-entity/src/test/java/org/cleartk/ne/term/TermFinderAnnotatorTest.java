/** 
 * Copyright (c) 2007-2008, Regents of the University of Colorado 
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer. 
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution. 
 * Neither the name of the University of Colorado at Boulder nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission. 
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE. 
 */
package org.cleartk.ne.term;

import java.io.IOException;
import java.util.List;

import org.apache.uima.UIMAException;
import org.apache.uima.analysis_engine.AnalysisEngine;
import org.cleartk.ne.NeTestBase;
import org.cleartk.ne.type.NamedEntityMention;
import org.cleartk.token.type.Token;
import org.cleartk.util.AnnotationRetrieval;
import org.junit.Assert;
import org.junit.Test;
import org.uimafit.factory.AnalysisEngineFactory;

/**
 * <br>
 * Copyright (c) 2007-2008, Regents of the University of Colorado <br>
 * All rights reserved.
 * 
 * 
 * @author Steven Bethard
 */
public class TermFinderAnnotatorTest extends NeTestBase {

  @Test
  public void test() throws UIMAException, IOException {
    AnalysisEngine engine = AnalysisEngineFactory.createPrimitive(TermFinderAnnotator.class,
            typeSystemDescription, TermFinderAnnotator.PARAM_TERM_LIST_FILE_NAMES_FILE_NAME,
            "src/test/resources/data/term/termlist/termlist.txt",
            TermFinderAnnotator.PARAM_TOKEN_CLASS_NAME, Token.class.getName(),
            TermFinderAnnotator.PARAM_TERM_MATCH_ANNOTATION_CLASS_NAME,
            NamedEntityMention.class.getName());
    tokenBuilder.buildTokens(jCas, "I would like to visit Alaska.",
            "I would like to visit Alaska .");
    engine.process(jCas);
    engine.collectionProcessComplete();
    List<NamedEntityMention> mentions = AnnotationRetrieval.getAnnotations(jCas,
            NamedEntityMention.class);
    Assert.assertEquals(mentions.size(), 1);
    NamedEntityMention mention = mentions.get(0);
    Assert.assertEquals("Alaska", mention.getCoveredText());
  }

}