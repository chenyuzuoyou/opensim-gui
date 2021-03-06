/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ToyPropMyoController extends Controller {
  private transient long swigCPtr;

  public ToyPropMyoController(long cPtr, boolean cMemoryOwn) {
    super(opensimExampleComponentsJNI.ToyPropMyoController_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ToyPropMyoController obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimExampleComponentsJNI.delete_ToyPropMyoController(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ToyPropMyoController safeDownCast(OpenSimObject obj) {
    long cPtr = opensimExampleComponentsJNI.ToyPropMyoController_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ToyPropMyoController(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimExampleComponentsJNI.ToyPropMyoController_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimExampleComponentsJNI.ToyPropMyoController_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimExampleComponentsJNI.ToyPropMyoController_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ToyPropMyoController(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimExampleComponentsJNI.ToyPropMyoController_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_gain(ToyPropMyoController source) {
    opensimExampleComponentsJNI.ToyPropMyoController_copyProperty_gain(swigCPtr, this, ToyPropMyoController.getCPtr(source), source);
  }

  public double get_gain(int i) {
    return opensimExampleComponentsJNI.ToyPropMyoController_get_gain__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_gain(int i) {
    return new SWIGTYPE_p_double(opensimExampleComponentsJNI.ToyPropMyoController_upd_gain__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_gain(int i, double value) {
    opensimExampleComponentsJNI.ToyPropMyoController_set_gain__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_gain(double value) {
    return opensimExampleComponentsJNI.ToyPropMyoController_append_gain(swigCPtr, this, value);
  }

  public void constructProperty_gain(double initValue) {
    opensimExampleComponentsJNI.ToyPropMyoController_constructProperty_gain(swigCPtr, this, initValue);
  }

  public double get_gain() {
    return opensimExampleComponentsJNI.ToyPropMyoController_get_gain__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_gain() {
    return new SWIGTYPE_p_double(opensimExampleComponentsJNI.ToyPropMyoController_upd_gain__SWIG_1(swigCPtr, this), false);
  }

  public void set_gain(double value) {
    opensimExampleComponentsJNI.ToyPropMyoController_set_gain__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_socket_actuator_connectee_name(SWIGTYPE_p_PropertyIndex value) {
    opensimExampleComponentsJNI.ToyPropMyoController_PropertyIndex_socket_actuator_connectee_name_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_socket_actuator_connectee_name() {
    return new SWIGTYPE_p_PropertyIndex(opensimExampleComponentsJNI.ToyPropMyoController_PropertyIndex_socket_actuator_connectee_name_get(swigCPtr, this), true);
  }

  public void connectSocket_actuator(OpenSimObject object) {
    opensimExampleComponentsJNI.ToyPropMyoController_connectSocket_actuator(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  public void setPropertyIndex_input_activation_connectee_name(SWIGTYPE_p_PropertyIndex value) {
    opensimExampleComponentsJNI.ToyPropMyoController_PropertyIndex_input_activation_connectee_name_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_input_activation_connectee_name() {
    return new SWIGTYPE_p_PropertyIndex(opensimExampleComponentsJNI.ToyPropMyoController_PropertyIndex_input_activation_connectee_name_get(swigCPtr, this), true);
  }

  public void connectInput_activation(AbstractOutput output, String alias) {
    opensimExampleComponentsJNI.ToyPropMyoController_connectInput_activation__SWIG_0(swigCPtr, this, AbstractOutput.getCPtr(output), output, alias);
  }

  public void connectInput_activation(AbstractOutput output) {
    opensimExampleComponentsJNI.ToyPropMyoController_connectInput_activation__SWIG_1(swigCPtr, this, AbstractOutput.getCPtr(output), output);
  }

  public void connectInput_activation(AbstractChannel channel, String alias) {
    opensimExampleComponentsJNI.ToyPropMyoController_connectInput_activation__SWIG_2(swigCPtr, this, AbstractChannel.getCPtr(channel), channel, alias);
  }

  public void connectInput_activation(AbstractChannel channel) {
    opensimExampleComponentsJNI.ToyPropMyoController_connectInput_activation__SWIG_3(swigCPtr, this, AbstractChannel.getCPtr(channel), channel);
  }

  public void set_has_output_myo_control(boolean value) {
    opensimExampleComponentsJNI.ToyPropMyoController__has_output_myo_control_set(swigCPtr, this, value);
  }

  public boolean get_has_output_myo_control() {
    return opensimExampleComponentsJNI.ToyPropMyoController__has_output_myo_control_get(swigCPtr, this);
  }

  public ToyPropMyoController() {
    this(opensimExampleComponentsJNI.new_ToyPropMyoController(), true);
  }

  public double computeControl(State s) {
    return opensimExampleComponentsJNI.ToyPropMyoController_computeControl(swigCPtr, this, State.getCPtr(s), s);
  }

  public void computeControls(State s, Vector controls) {
    opensimExampleComponentsJNI.ToyPropMyoController_computeControls(swigCPtr, this, State.getCPtr(s), s, Vector.getCPtr(controls), controls);
  }

}
