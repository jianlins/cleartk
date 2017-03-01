
/* First created by JCasGen Tue Feb 28 22:02:14 MST 2017 */
package org.cleartk.timeml.type;

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
public class TemporalLink_Type extends ScoredAnnotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TemporalLink_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TemporalLink_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TemporalLink(addr, TemporalLink_Type.this);
  			   TemporalLink_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TemporalLink(addr, TemporalLink_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TemporalLink.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.cleartk.timeml.type.TemporalLink");
 
  /** @generated */
  final Feature casFeat_relationType;
  /** @generated */
  final int     casFeatCode_relationType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRelationType(int addr) {
        if (featOkTst && casFeat_relationType == null)
      jcas.throwFeatMissing("relationType", "org.cleartk.timeml.type.TemporalLink");
    return ll_cas.ll_getStringValue(addr, casFeatCode_relationType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRelationType(int addr, String v) {
        if (featOkTst && casFeat_relationType == null)
      jcas.throwFeatMissing("relationType", "org.cleartk.timeml.type.TemporalLink");
    ll_cas.ll_setStringValue(addr, casFeatCode_relationType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_source;
  /** @generated */
  final int     casFeatCode_source;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSource(int addr) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "org.cleartk.timeml.type.TemporalLink");
    return ll_cas.ll_getRefValue(addr, casFeatCode_source);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSource(int addr, int v) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "org.cleartk.timeml.type.TemporalLink");
    ll_cas.ll_setRefValue(addr, casFeatCode_source, v);}
    
  
 
  /** @generated */
  final Feature casFeat_target;
  /** @generated */
  final int     casFeatCode_target;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTarget(int addr) {
        if (featOkTst && casFeat_target == null)
      jcas.throwFeatMissing("target", "org.cleartk.timeml.type.TemporalLink");
    return ll_cas.ll_getRefValue(addr, casFeatCode_target);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTarget(int addr, int v) {
        if (featOkTst && casFeat_target == null)
      jcas.throwFeatMissing("target", "org.cleartk.timeml.type.TemporalLink");
    ll_cas.ll_setRefValue(addr, casFeatCode_target, v);}
    
  
 
  /** @generated */
  final Feature casFeat_id;
  /** @generated */
  final int     casFeatCode_id;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getId(int addr) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "org.cleartk.timeml.type.TemporalLink");
    return ll_cas.ll_getStringValue(addr, casFeatCode_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setId(int addr, String v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "org.cleartk.timeml.type.TemporalLink");
    ll_cas.ll_setStringValue(addr, casFeatCode_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_signalID;
  /** @generated */
  final int     casFeatCode_signalID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSignalID(int addr) {
        if (featOkTst && casFeat_signalID == null)
      jcas.throwFeatMissing("signalID", "org.cleartk.timeml.type.TemporalLink");
    return ll_cas.ll_getStringValue(addr, casFeatCode_signalID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSignalID(int addr, String v) {
        if (featOkTst && casFeat_signalID == null)
      jcas.throwFeatMissing("signalID", "org.cleartk.timeml.type.TemporalLink");
    ll_cas.ll_setStringValue(addr, casFeatCode_signalID, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TemporalLink_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_relationType = jcas.getRequiredFeatureDE(casType, "relationType", "uima.cas.String", featOkTst);
    casFeatCode_relationType  = (null == casFeat_relationType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_relationType).getCode();

 
    casFeat_source = jcas.getRequiredFeatureDE(casType, "source", "org.cleartk.timeml.type.Anchor", featOkTst);
    casFeatCode_source  = (null == casFeat_source) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_source).getCode();

 
    casFeat_target = jcas.getRequiredFeatureDE(casType, "target", "org.cleartk.timeml.type.Anchor", featOkTst);
    casFeatCode_target  = (null == casFeat_target) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_target).getCode();

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.String", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

 
    casFeat_signalID = jcas.getRequiredFeatureDE(casType, "signalID", "uima.cas.String", featOkTst);
    casFeatCode_signalID  = (null == casFeat_signalID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_signalID).getCode();

  }
}



    