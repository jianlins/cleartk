

/* First created by JCasGen Tue Feb 28 22:02:14 MST 2017 */
package org.cleartk.timeml.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.cleartk.score.type.ScoredAnnotation;


/** 
 * Updated by JCasGen Tue Feb 28 22:02:14 MST 2017
 * XML source: /home/brokenjade/IdeaProjects/cleartk/cleartk-type-system/target/jcasgen/typesystem.xml
 * @generated */
public class TemporalLink extends ScoredAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TemporalLink.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected TemporalLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TemporalLink(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TemporalLink(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public TemporalLink(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: relationType

  /** getter for relationType - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRelationType() {
    if (TemporalLink_Type.featOkTst && ((TemporalLink_Type)jcasType).casFeat_relationType == null)
      jcasType.jcas.throwFeatMissing("relationType", "org.cleartk.timeml.type.TemporalLink");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TemporalLink_Type)jcasType).casFeatCode_relationType);}
    
  /** setter for relationType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelationType(String v) {
    if (TemporalLink_Type.featOkTst && ((TemporalLink_Type)jcasType).casFeat_relationType == null)
      jcasType.jcas.throwFeatMissing("relationType", "org.cleartk.timeml.type.TemporalLink");
    jcasType.ll_cas.ll_setStringValue(addr, ((TemporalLink_Type)jcasType).casFeatCode_relationType, v);}    
   
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets 
   * @generated
   * @return value of the feature 
   */
  public Anchor getSource() {
    if (TemporalLink_Type.featOkTst && ((TemporalLink_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "org.cleartk.timeml.type.TemporalLink");
    return (Anchor)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TemporalLink_Type)jcasType).casFeatCode_source)));}
    
  /** setter for source - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(Anchor v) {
    if (TemporalLink_Type.featOkTst && ((TemporalLink_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "org.cleartk.timeml.type.TemporalLink");
    jcasType.ll_cas.ll_setRefValue(addr, ((TemporalLink_Type)jcasType).casFeatCode_source, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: target

  /** getter for target - gets 
   * @generated
   * @return value of the feature 
   */
  public Anchor getTarget() {
    if (TemporalLink_Type.featOkTst && ((TemporalLink_Type)jcasType).casFeat_target == null)
      jcasType.jcas.throwFeatMissing("target", "org.cleartk.timeml.type.TemporalLink");
    return (Anchor)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TemporalLink_Type)jcasType).casFeatCode_target)));}
    
  /** setter for target - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTarget(Anchor v) {
    if (TemporalLink_Type.featOkTst && ((TemporalLink_Type)jcasType).casFeat_target == null)
      jcasType.jcas.throwFeatMissing("target", "org.cleartk.timeml.type.TemporalLink");
    jcasType.ll_cas.ll_setRefValue(addr, ((TemporalLink_Type)jcasType).casFeatCode_target, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: id

  /** getter for id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (TemporalLink_Type.featOkTst && ((TemporalLink_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.cleartk.timeml.type.TemporalLink");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TemporalLink_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (TemporalLink_Type.featOkTst && ((TemporalLink_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.cleartk.timeml.type.TemporalLink");
    jcasType.ll_cas.ll_setStringValue(addr, ((TemporalLink_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: signalID

  /** getter for signalID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSignalID() {
    if (TemporalLink_Type.featOkTst && ((TemporalLink_Type)jcasType).casFeat_signalID == null)
      jcasType.jcas.throwFeatMissing("signalID", "org.cleartk.timeml.type.TemporalLink");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TemporalLink_Type)jcasType).casFeatCode_signalID);}
    
  /** setter for signalID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSignalID(String v) {
    if (TemporalLink_Type.featOkTst && ((TemporalLink_Type)jcasType).casFeat_signalID == null)
      jcasType.jcas.throwFeatMissing("signalID", "org.cleartk.timeml.type.TemporalLink");
    jcasType.ll_cas.ll_setStringValue(addr, ((TemporalLink_Type)jcasType).casFeatCode_signalID, v);}    
  }

    