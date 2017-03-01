

/* First created by JCasGen Tue Feb 28 22:02:14 MST 2017 */
package org.cleartk.ne.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.cleartk.score.type.ScoredAnnotation;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Feb 28 22:02:14 MST 2017
 * XML source: /home/brokenjade/IdeaProjects/cleartk/cleartk-type-system/target/jcasgen/typesystem.xml
 * @generated */
public class NamedEntityMention extends ScoredAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NamedEntityMention.class);
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
  protected NamedEntityMention() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public NamedEntityMention(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public NamedEntityMention(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public NamedEntityMention(JCas jcas, int begin, int end) {
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
  //* Feature: mentionType

  /** getter for mentionType - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMentionType() {
    if (NamedEntityMention_Type.featOkTst && ((NamedEntityMention_Type)jcasType).casFeat_mentionType == null)
      jcasType.jcas.throwFeatMissing("mentionType", "org.cleartk.ne.type.NamedEntityMention");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NamedEntityMention_Type)jcasType).casFeatCode_mentionType);}
    
  /** setter for mentionType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMentionType(String v) {
    if (NamedEntityMention_Type.featOkTst && ((NamedEntityMention_Type)jcasType).casFeat_mentionType == null)
      jcasType.jcas.throwFeatMissing("mentionType", "org.cleartk.ne.type.NamedEntityMention");
    jcasType.ll_cas.ll_setStringValue(addr, ((NamedEntityMention_Type)jcasType).casFeatCode_mentionType, v);}    
   
    
  //*--------------*
  //* Feature: mentionedEntity

  /** getter for mentionedEntity - gets 
   * @generated
   * @return value of the feature 
   */
  public NamedEntity getMentionedEntity() {
    if (NamedEntityMention_Type.featOkTst && ((NamedEntityMention_Type)jcasType).casFeat_mentionedEntity == null)
      jcasType.jcas.throwFeatMissing("mentionedEntity", "org.cleartk.ne.type.NamedEntityMention");
    return (NamedEntity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NamedEntityMention_Type)jcasType).casFeatCode_mentionedEntity)));}
    
  /** setter for mentionedEntity - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMentionedEntity(NamedEntity v) {
    if (NamedEntityMention_Type.featOkTst && ((NamedEntityMention_Type)jcasType).casFeat_mentionedEntity == null)
      jcasType.jcas.throwFeatMissing("mentionedEntity", "org.cleartk.ne.type.NamedEntityMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((NamedEntityMention_Type)jcasType).casFeatCode_mentionedEntity, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: annotation

  /** getter for annotation - gets 
   * @generated
   * @return value of the feature 
   */
  public Annotation getAnnotation() {
    if (NamedEntityMention_Type.featOkTst && ((NamedEntityMention_Type)jcasType).casFeat_annotation == null)
      jcasType.jcas.throwFeatMissing("annotation", "org.cleartk.ne.type.NamedEntityMention");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NamedEntityMention_Type)jcasType).casFeatCode_annotation)));}
    
  /** setter for annotation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnnotation(Annotation v) {
    if (NamedEntityMention_Type.featOkTst && ((NamedEntityMention_Type)jcasType).casFeat_annotation == null)
      jcasType.jcas.throwFeatMissing("annotation", "org.cleartk.ne.type.NamedEntityMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((NamedEntityMention_Type)jcasType).casFeatCode_annotation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: head

  /** getter for head - gets 
   * @generated
   * @return value of the feature 
   */
  public Annotation getHead() {
    if (NamedEntityMention_Type.featOkTst && ((NamedEntityMention_Type)jcasType).casFeat_head == null)
      jcasType.jcas.throwFeatMissing("head", "org.cleartk.ne.type.NamedEntityMention");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NamedEntityMention_Type)jcasType).casFeatCode_head)));}
    
  /** setter for head - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHead(Annotation v) {
    if (NamedEntityMention_Type.featOkTst && ((NamedEntityMention_Type)jcasType).casFeat_head == null)
      jcasType.jcas.throwFeatMissing("head", "org.cleartk.ne.type.NamedEntityMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((NamedEntityMention_Type)jcasType).casFeatCode_head, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: mentionId

  /** getter for mentionId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMentionId() {
    if (NamedEntityMention_Type.featOkTst && ((NamedEntityMention_Type)jcasType).casFeat_mentionId == null)
      jcasType.jcas.throwFeatMissing("mentionId", "org.cleartk.ne.type.NamedEntityMention");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NamedEntityMention_Type)jcasType).casFeatCode_mentionId);}
    
  /** setter for mentionId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMentionId(String v) {
    if (NamedEntityMention_Type.featOkTst && ((NamedEntityMention_Type)jcasType).casFeat_mentionId == null)
      jcasType.jcas.throwFeatMissing("mentionId", "org.cleartk.ne.type.NamedEntityMention");
    jcasType.ll_cas.ll_setStringValue(addr, ((NamedEntityMention_Type)jcasType).casFeatCode_mentionId, v);}    
  }

    