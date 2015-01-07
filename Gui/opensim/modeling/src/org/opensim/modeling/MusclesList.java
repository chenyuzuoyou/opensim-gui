/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MusclesList {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public MusclesList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(MusclesList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_MusclesList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MusclesList(Component root, ComponentFilter f) {
    this(opensimModelJNI.new_MusclesList__SWIG_0(Component.getCPtr(root), root, ComponentFilter.getCPtr(f), f), true);
  }

  public MusclesList(Component root) {
    this(opensimModelJNI.new_MusclesList__SWIG_1(Component.getCPtr(root), root), true);
  }

  public MuscleIterator begin() {
    return new MuscleIterator(opensimModelJNI.MusclesList_begin(swigCPtr, this), true);
  }

  public void setFilter(ComponentFilter filter) {
    opensimModelJNI.MusclesList_setFilter(swigCPtr, this, ComponentFilter.getCPtr(filter), filter);
  }

  public MuscleIterator end() {
    return new MuscleIterator(opensimModelJNI.MusclesList_end(swigCPtr, this), true);
  }

}