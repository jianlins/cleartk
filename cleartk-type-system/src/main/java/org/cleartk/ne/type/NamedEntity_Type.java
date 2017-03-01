
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
import org.cleartk.score.type.ScoredTOP_Type;

/** 
 * Updated by JCasGen Tue Feb 28 22:02:14 MST 2017
 * @generated */
public class NamedEntity_Type extends ScoredTOP_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NamedEntity_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NamedEntity_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NamedEntity(addr, NamedEntity_Type.this);
  			   NamedEntity_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NamedEntity(addr, NamedEntity_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NamedEntity.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.cleartk.ne.type.NamedEntity");
 
  /** @generated */
  final Feature casFeat_entityType;
  /** @generated */
  final int     casFeatCode_entityType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getEntityType(int addr) {
        if (featOkTst && casFeat_entityType == null)
      jcas.throwFeatMissing("entityType", "org.cleartk.ne.type.NamedEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_entityType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEntityType(int addr, String v) {
        if (featOkTst && casFeat_entityType == null)
      jcas.throwFeatMissing("entityType", "org.cleartk.ne.type.NamedEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_entityType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_entitySubtype;
  /** @generated */
  final int     casFeatCode_entitySubtype;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getEntitySubtype(int addr) {
        if (featOkTst && casFeat_entitySubtype == null)
      jcas.throwFeatMissing("entitySubtype", "org.cleartk.ne.type.NamedEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_entitySubtype);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEntitySubtype(int addr, String v) {
        if (featOkTst && casFeat_entitySubtype == null)
      jcas.throwFeatMissing("entitySubtype", "org.cleartk.ne.type.NamedEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_entitySubtype, v);}
    
  
 
  /** @generated */
  final Feature casFeat_entityClass;
  /** @generated */
  final int     casFeatCode_entityClass;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getEntityClass(int addr) {
        if (featOkTst && casFeat_entityClass == null)
      jcas.throwFeatMissing("entityClass", "org.cleartk.ne.type.NamedEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_entityClass);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEntityClass(int addr, String v) {
        if (featOkTst && casFeat_entityClass == null)
      jcas.throwFeatMissing("entityClass", "org.cleartk.ne.type.NamedEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_entityClass, v);}
    
  
 
  /** @generated */
  final Feature casFeat_entityId;
  /** @generated */
  final int     casFeatCode_entityId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getEntityId(int addr) {
        if (featOkTst && casFeat_entityId == null)
      jcas.throwFeatMissing("entityId", "org.cleartk.ne.type.NamedEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_entityId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEntityId(int addr, String v) {
        if (featOkTst && casFeat_entityId == null)
      jcas.throwFeatMissing("entityId", "org.cleartk.ne.type.NamedEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_entityId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_mentions;
  /** @generated */
  final int     casFeatCode_mentions;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMentions(int addr) {
        if (featOkTst && casFeat_mentions == null)
      jcas.throwFeatMissing("mentions", "org.cleartk.ne.type.NamedEntity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_mentions);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMentions(int addr, int v) {
        if (featOkTst && casFeat_mentions == null)
      jcas.throwFeatMissing("mentions", "org.cleartk.ne.type.NamedEntity");
    ll_cas.ll_setRefValue(addr, casFeatCode_mentions, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getMentions(int addr, int i) {
        if (featOkTst && casFeat_mentions == null)
      jcas.throwFeatMissing("mentions", "org.cleartk.ne.type.NamedEntity");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mentions), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_mentions), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mentions), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setMentions(int addr, int i, int v) {
        if (featOkTst && casFeat_mentions == null)
      jcas.throwFeatMissing("mentions", "org.cleartk.ne.type.NamedEntity");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mentions), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_mentions), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mentions), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public NamedEntity_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_entityType = jcas.getRequiredFeatureDE(casType, "entityType", "uima.cas.String", featOkTst);
    casFeatCode_entityType  = (null == casFeat_entityType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_entityType).getCode();

 
    casFeat_entitySubtype = jcas.getRequiredFeatureDE(casType, "entitySubtype", "uima.cas.String", featOkTst);
    casFeatCode_entitySubtype  = (null == casFeat_entitySubtype) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_entitySubtype).getCode();

 
    casFeat_entityClass = jcas.getRequiredFeatureDE(casType, "entityClass", "uima.cas.String", featOkTst);
    casFeatCode_entityClass  = (null == casFeat_entityClass) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_entityClass).getCode();

 
    casFeat_entityId = jcas.getRequiredFeatureDE(casType, "entityId", "uima.cas.String", featOkTst);
    casFeatCode_entityId  = (null == casFeat_entityId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_entityId).getCode();

 
    casFeat_mentions = jcas.getRequiredFeatureDE(casType, "mentions", "uima.cas.FSArray", featOkTst);
    casFeatCode_mentions  = (null == casFeat_mentions) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mentions).getCode();

  }
}



    