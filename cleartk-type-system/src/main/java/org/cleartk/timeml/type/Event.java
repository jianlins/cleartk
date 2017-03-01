

/* First created by JCasGen Tue Feb 28 22:02:14 MST 2017 */
package org.cleartk.timeml.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Feb 28 22:02:14 MST 2017
 * XML source: /home/brokenjade/IdeaProjects/cleartk/cleartk-type-system/target/jcasgen/typesystem.xml
 * @generated */
public class Event extends Anchor {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Event.class);
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
  protected Event() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Event(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Event(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Event(JCas jcas, int begin, int end) {
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
  //* Feature: eventClass

  /** getter for eventClass - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEventClass() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_eventClass == null)
      jcasType.jcas.throwFeatMissing("eventClass", "org.cleartk.timeml.type.Event");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Event_Type)jcasType).casFeatCode_eventClass);}
    
  /** setter for eventClass - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEventClass(String v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_eventClass == null)
      jcasType.jcas.throwFeatMissing("eventClass", "org.cleartk.timeml.type.Event");
    jcasType.ll_cas.ll_setStringValue(addr, ((Event_Type)jcasType).casFeatCode_eventClass, v);}    
   
    
  //*--------------*
  //* Feature: eventInstanceID

  /** getter for eventInstanceID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEventInstanceID() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_eventInstanceID == null)
      jcasType.jcas.throwFeatMissing("eventInstanceID", "org.cleartk.timeml.type.Event");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Event_Type)jcasType).casFeatCode_eventInstanceID);}
    
  /** setter for eventInstanceID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEventInstanceID(String v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_eventInstanceID == null)
      jcasType.jcas.throwFeatMissing("eventInstanceID", "org.cleartk.timeml.type.Event");
    jcasType.ll_cas.ll_setStringValue(addr, ((Event_Type)jcasType).casFeatCode_eventInstanceID, v);}    
   
    
  //*--------------*
  //* Feature: signalID

  /** getter for signalID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSignalID() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_signalID == null)
      jcasType.jcas.throwFeatMissing("signalID", "org.cleartk.timeml.type.Event");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Event_Type)jcasType).casFeatCode_signalID);}
    
  /** setter for signalID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSignalID(String v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_signalID == null)
      jcasType.jcas.throwFeatMissing("signalID", "org.cleartk.timeml.type.Event");
    jcasType.ll_cas.ll_setStringValue(addr, ((Event_Type)jcasType).casFeatCode_signalID, v);}    
   
    
  //*--------------*
  //* Feature: stem

  /** getter for stem - gets 
   * @generated
   * @return value of the feature 
   */
  public String getStem() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_stem == null)
      jcasType.jcas.throwFeatMissing("stem", "org.cleartk.timeml.type.Event");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Event_Type)jcasType).casFeatCode_stem);}
    
  /** setter for stem - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStem(String v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_stem == null)
      jcasType.jcas.throwFeatMissing("stem", "org.cleartk.timeml.type.Event");
    jcasType.ll_cas.ll_setStringValue(addr, ((Event_Type)jcasType).casFeatCode_stem, v);}    
   
    
  //*--------------*
  //* Feature: pos

  /** getter for pos - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPos() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_pos == null)
      jcasType.jcas.throwFeatMissing("pos", "org.cleartk.timeml.type.Event");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Event_Type)jcasType).casFeatCode_pos);}
    
  /** setter for pos - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPos(String v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_pos == null)
      jcasType.jcas.throwFeatMissing("pos", "org.cleartk.timeml.type.Event");
    jcasType.ll_cas.ll_setStringValue(addr, ((Event_Type)jcasType).casFeatCode_pos, v);}    
   
    
  //*--------------*
  //* Feature: tense

  /** getter for tense - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTense() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_tense == null)
      jcasType.jcas.throwFeatMissing("tense", "org.cleartk.timeml.type.Event");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Event_Type)jcasType).casFeatCode_tense);}
    
  /** setter for tense - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTense(String v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_tense == null)
      jcasType.jcas.throwFeatMissing("tense", "org.cleartk.timeml.type.Event");
    jcasType.ll_cas.ll_setStringValue(addr, ((Event_Type)jcasType).casFeatCode_tense, v);}    
   
    
  //*--------------*
  //* Feature: aspect

  /** getter for aspect - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAspect() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_aspect == null)
      jcasType.jcas.throwFeatMissing("aspect", "org.cleartk.timeml.type.Event");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Event_Type)jcasType).casFeatCode_aspect);}
    
  /** setter for aspect - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAspect(String v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_aspect == null)
      jcasType.jcas.throwFeatMissing("aspect", "org.cleartk.timeml.type.Event");
    jcasType.ll_cas.ll_setStringValue(addr, ((Event_Type)jcasType).casFeatCode_aspect, v);}    
   
    
  //*--------------*
  //* Feature: cardinality

  /** getter for cardinality - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCardinality() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_cardinality == null)
      jcasType.jcas.throwFeatMissing("cardinality", "org.cleartk.timeml.type.Event");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Event_Type)jcasType).casFeatCode_cardinality);}
    
  /** setter for cardinality - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCardinality(String v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_cardinality == null)
      jcasType.jcas.throwFeatMissing("cardinality", "org.cleartk.timeml.type.Event");
    jcasType.ll_cas.ll_setStringValue(addr, ((Event_Type)jcasType).casFeatCode_cardinality, v);}    
   
    
  //*--------------*
  //* Feature: polarity

  /** getter for polarity - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPolarity() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "org.cleartk.timeml.type.Event");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Event_Type)jcasType).casFeatCode_polarity);}
    
  /** setter for polarity - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPolarity(String v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "org.cleartk.timeml.type.Event");
    jcasType.ll_cas.ll_setStringValue(addr, ((Event_Type)jcasType).casFeatCode_polarity, v);}    
   
    
  //*--------------*
  //* Feature: modality

  /** getter for modality - gets 
   * @generated
   * @return value of the feature 
   */
  public String getModality() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_modality == null)
      jcasType.jcas.throwFeatMissing("modality", "org.cleartk.timeml.type.Event");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Event_Type)jcasType).casFeatCode_modality);}
    
  /** setter for modality - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModality(String v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_modality == null)
      jcasType.jcas.throwFeatMissing("modality", "org.cleartk.timeml.type.Event");
    jcasType.ll_cas.ll_setStringValue(addr, ((Event_Type)jcasType).casFeatCode_modality, v);}    
  }

    