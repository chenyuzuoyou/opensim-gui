/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelComponentList {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ModelComponentList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelComponentList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_ModelComponentList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ModelComponentList(Component root, ComponentFilter f) {
    this(opensimModelSimulationJNI.new_ModelComponentList__SWIG_0(Component.getCPtr(root), root, ComponentFilter.getCPtr(f), f), true);
  }

  public ModelComponentList(Component root) {
    this(opensimModelSimulationJNI.new_ModelComponentList__SWIG_1(Component.getCPtr(root), root), true);
  }

  public ModelComponentIterator begin() {
    return new ModelComponentIterator(opensimModelSimulationJNI.ModelComponentList_begin__SWIG_0(swigCPtr, this), true);
  }

  public SWIGTYPE_p_OpenSim__ComponentListIteratorT_OpenSim__ModelComponent_const_const_t cbegin() {
    return new SWIGTYPE_p_OpenSim__ComponentListIteratorT_OpenSim__ModelComponent_const_const_t(opensimModelSimulationJNI.ModelComponentList_cbegin(swigCPtr, this), true);
  }

  public ModelComponentIterator end() {
    return new ModelComponentIterator(opensimModelSimulationJNI.ModelComponentList_end__SWIG_0(swigCPtr, this), true);
  }

  public SWIGTYPE_p_OpenSim__ComponentListIteratorT_OpenSim__ModelComponent_const_const_t cend() {
    return new SWIGTYPE_p_OpenSim__ComponentListIteratorT_OpenSim__ModelComponent_const_const_t(opensimModelSimulationJNI.ModelComponentList_cend(swigCPtr, this), true);
  }

  public void setFilter(ComponentFilter filter) {
    opensimModelSimulationJNI.ModelComponentList_setFilter(swigCPtr, this, ComponentFilter.getCPtr(filter), filter);
  }

}
