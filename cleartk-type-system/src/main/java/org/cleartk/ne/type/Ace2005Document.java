

/* First created by JCasGen Tue Feb 28 22:02:14 MST 2017 */
package org.cleartk.ne.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.cleartk.score.type.ScoredAnnotation;


/** 
 * Updated by JCasGen Tue Feb 28 22:02:14 MST 2017
 * XML source: /home/brokenjade/IdeaProjects/cleartk/cleartk-type-system/target/jcasgen/typesystem.xml
 * @generated */
public class Ace2005Document extends ScoredAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Ace2005Document.class);
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
  protected Ace2005Document() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Ace2005Document(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Ace2005Document(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Ace2005Document(JCas jcas, int begin, int end) {
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
  //* Feature: aceSource

  /** getter for aceSource - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAceSource() {
    if (Ace2005Document_Type.featOkTst && ((Ace2005Document_Type)jcasType).casFeat_aceSource == null)
      jcasType.jcas.throwFeatMissing("aceSource", "org.cleartk.ne.type.Ace2005Document");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Ace2005Document_Type)jcasType).casFeatCode_aceSource);}
    
  /** setter for aceSource - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAceSource(String v) {
    if (Ace2005Document_Type.featOkTst && ((Ace2005Document_Type)jcasType).casFeat_aceSource == null)
      jcasType.jcas.throwFeatMissing("aceSource", "org.cleartk.ne.type.Ace2005Document");
    jcasType.ll_cas.ll_setStringValue(addr, ((Ace2005Document_Type)jcasType).casFeatCode_aceSource, v);}    
   
    
  //*--------------*
  //* Feature: aceUri

  /** getter for aceUri - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAceUri() {
    if (Ace2005Document_Type.featOkTst && ((Ace2005Document_Type)jcasType).casFeat_aceUri == null)
      jcasType.jcas.throwFeatMissing("aceUri", "org.cleartk.ne.type.Ace2005Document");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Ace2005Document_Type)jcasType).casFeatCode_aceUri);}
    
  /** setter for aceUri - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAceUri(String v) {
    if (Ace2005Document_Type.featOkTst && ((Ace2005Document_Type)jcasType).casFeat_aceUri == null)
      jcasType.jcas.throwFeatMissing("aceUri", "org.cleartk.ne.type.Ace2005Document");
    jcasType.ll_cas.ll_setStringValue(addr, ((Ace2005Document_Type)jcasType).casFeatCode_aceUri, v);}    
   
    
  //*--------------*
  //* Feature: aceType

  /** getter for aceType - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAceType() {
    if (Ace2005Document_Type.featOkTst && ((Ace2005Document_Type)jcasType).casFeat_aceType == null)
      jcasType.jcas.throwFeatMissing("aceType", "org.cleartk.ne.type.Ace2005Document");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Ace2005Document_Type)jcasType).casFeatCode_aceType);}
    
  /** setter for aceType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAceType(String v) {
    if (Ace2005Document_Type.featOkTst && ((Ace2005Document_Type)jcasType).casFeat_aceType == null)
      jcasType.jcas.throwFeatMissing("aceType", "org.cleartk.ne.type.Ace2005Document");
    jcasType.ll_cas.ll_setStringValue(addr, ((Ace2005Document_Type)jcasType).casFeatCode_aceType, v);}    
  }

    