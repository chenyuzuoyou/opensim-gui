/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ObjectGroup extends OpenSimObject {
  private transient long swigCPtr;

  public ObjectGroup(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.ObjectGroup_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ObjectGroup obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_ObjectGroup(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ObjectGroup safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelCommonJNI.ObjectGroup_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelCommonJNI.ObjectGroup_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelCommonJNI.ObjectGroup_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelCommonJNI.ObjectGroup_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelCommonJNI.ObjectGroup_getConcreteClassName(swigCPtr, this);
  }

  public ObjectGroup() {
    this(opensimModelCommonJNI.new_ObjectGroup__SWIG_0(), true);
  }

  public ObjectGroup(String aName) {
    this(opensimModelCommonJNI.new_ObjectGroup__SWIG_1(aName), true);
  }

  public ObjectGroup(ObjectGroup aGroup) {
    this(opensimModelCommonJNI.new_ObjectGroup__SWIG_2(ObjectGroup.getCPtr(aGroup), aGroup), true);
  }

  public void copyData(ObjectGroup aGroup) {
    opensimModelCommonJNI.ObjectGroup_copyData(swigCPtr, this, ObjectGroup.getCPtr(aGroup), aGroup);
  }

  public boolean contains(String aName) {
    return opensimModelCommonJNI.ObjectGroup_contains(swigCPtr, this, aName);
  }

  public void add(OpenSimObject aObject) {
    opensimModelCommonJNI.ObjectGroup_add(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public void remove(OpenSimObject aObject) {
    opensimModelCommonJNI.ObjectGroup_remove(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public void replace(OpenSimObject aOldObject, OpenSimObject aNewObject) {
    opensimModelCommonJNI.ObjectGroup_replace(swigCPtr, this, OpenSimObject.getCPtr(aOldObject), aOldObject, OpenSimObject.getCPtr(aNewObject), aNewObject);
  }

  public void setupGroup(ArrayPtrsObj aObjects) {
    opensimModelCommonJNI.ObjectGroup_setupGroup(swigCPtr, this, ArrayPtrsObj.getCPtr(aObjects), aObjects);
  }

  public ArrayConstObjPtr getMembers() {
    return new ArrayConstObjPtr(opensimModelCommonJNI.ObjectGroup_getMembers(swigCPtr, this), false);
  }

}
