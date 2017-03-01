

/* First created by JCasGen Tue Feb 28 22:02:14 MST 2017 */
package org.cleartk.token.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.cleartk.score.type.ScoredAnnotation;


/** 
 * Updated by JCasGen Tue Feb 28 22:02:14 MST 2017
 * XML source: /home/brokenjade/IdeaProjects/cleartk/cleartk-type-system/target/jcasgen/typesystem.xml
 * @generated */
public class Subtoken extends ScoredAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Subtoken.class);
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
  protected Subtoken() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Subtoken(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Subtoken(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Subtoken(JCas jcas, int begin, int end) {
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
  //* Feature: position

  /** getter for position - gets 
   * @generated
   * @return value of the feature 
   */
  public int getPosition() {
    if (Subtoken_Type.featOkTst && ((Subtoken_Type)jcasType).casFeat_position == null)
      jcasType.jcas.throwFeatMissing("position", "org.cleartk.token.type.Subtoken");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Subtoken_Type)jcasType).casFeatCode_position);}
    
  /** setter for position - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPosition(int v) {
    if (Subtoken_Type.featOkTst && ((Subtoken_Type)jcasType).casFeat_position == null)
      jcasType.jcas.throwFeatMissing("position", "org.cleartk.token.type.Subtoken");
    jcasType.ll_cas.ll_setIntValue(addr, ((Subtoken_Type)jcasType).casFeatCode_position, v);}    
  }

    