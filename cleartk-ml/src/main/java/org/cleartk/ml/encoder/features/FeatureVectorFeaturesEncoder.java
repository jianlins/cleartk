/** 
 * Copyright (c) 2009, Regents of the University of Colorado 
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
package org.cleartk.ml.encoder.features;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.cleartk.ml.Feature;
import org.cleartk.ml.encoder.CleartkEncoderException;
import org.cleartk.ml.encoder.features.normalizer.NameNumberNormalizer;
import org.cleartk.ml.encoder.features.normalizer.NoOpNormalizer;
import org.cleartk.ml.util.featurevector.FeatureVector;
import org.cleartk.ml.util.featurevector.InvalidFeatureVectorValueException;
import org.cleartk.ml.util.featurevector.SparseFeatureVector;
import org.cleartk.util.collection.GenericStringMapper;
import org.cleartk.util.collection.StringMapper;
import org.cleartk.util.collection.UnknownKeyException;
import org.cleartk.util.collection.Writable;

/**
 * <br>
 * Copyright (c) 2009, Regents of the University of Colorado <br>
 * All rights reserved.
 * 
 * @author Philipp Wetzler
 */
public class FeatureVectorFeaturesEncoder extends
    FeaturesEncoder_ImplBase<FeatureVector, NameNumber> {

  private static final long serialVersionUID = 6714456694285732480L;

  public static final String LOOKUP_FILE_NAME = "features-lookup.txt";

  public FeatureVectorFeaturesEncoder(int cutoff, NameNumberNormalizer normalizer) {
    this.normalizer = normalizer;
    this.stringMapper = new GenericStringMapper(cutoff);
  }

  public FeatureVectorFeaturesEncoder(int cutoff) {
    this(cutoff, new NoOpNormalizer());
  }

  public FeatureVectorFeaturesEncoder() {
    this(0, new NoOpNormalizer());
  }

  @Override
  public FeatureVector encodeAll(Iterable<Feature> features) throws CleartkEncoderException {
    List<NameNumber> fves = new ArrayList<NameNumber>();
    for (Feature feature : features) {
      fves.addAll(this.encode(feature));
    }

    normalizer.normalize(fves);

    SparseFeatureVector fv = new SparseFeatureVector();
    for (NameNumber fve : fves) {
      String name = fve.name;
      Number value = fve.number;

      if (value.doubleValue() == 0.0)
        continue;

      try {
        if (expandIndex) {
          int i = stringMapper.getOrGenerateInteger(name);
          double v = fv.get(i) + value.doubleValue();
          fv.set(i, v);
        } else {
          try {
            int i = stringMapper.getInteger(name);
            double v = fv.get(i) + value.doubleValue();
            fv.set(i, v);
          } catch (UnknownKeyException e) {
          }
        }
      } catch (InvalidFeatureVectorValueException e) {
        throw CleartkEncoderException.invalidFeatureVectorValue(e, e.getIndex(), e.getValue());
      }
    }

    return fv;
  }

  @Override
  public void finalizeFeatureSet(File outputDirectory) throws IOException {
    expandIndex = false;
    stringMapper.finalizeMap();

    if (stringMapper instanceof Writable) {
      Writable writableMap = (Writable) stringMapper;
      File outputFile = new File(outputDirectory, LOOKUP_FILE_NAME);
      writableMap.write(outputFile);
    }
  }

  public void setNormalizer(NameNumberNormalizer normalizer) {
    this.normalizer = normalizer;
  }

  private boolean expandIndex = true;

  private StringMapper stringMapper;

  private NameNumberNormalizer normalizer;

}
