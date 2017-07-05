/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ReporterVector extends AbstractReporter {
  private transient long swigCPtr;

  public ReporterVector(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.ReporterVector_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ReporterVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ReporterVector safeDownCast(OpenSimObject obj) {
    long cPtr = opensimCommonJNI.ReporterVector_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ReporterVector(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.ReporterVector_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimCommonJNI.ReporterVector_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimCommonJNI.ReporterVector_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ReporterVector(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.ReporterVector_getConcreteClassName(swigCPtr, this);
  }

  public void setPropertyIndex_input_inputs_connectee_names(SWIGTYPE_p_PropertyIndex value) {
    opensimCommonJNI.ReporterVector_PropertyIndex_input_inputs_connectee_names_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_input_inputs_connectee_names() {
    return new SWIGTYPE_p_PropertyIndex(opensimCommonJNI.ReporterVector_PropertyIndex_input_inputs_connectee_names_get(swigCPtr, this), true);
  }

  public void connectInput_inputs(AbstractOutput output, String alias) {
    opensimCommonJNI.ReporterVector_connectInput_inputs__SWIG_0(swigCPtr, this, AbstractOutput.getCPtr(output), output, alias);
  }

  public void connectInput_inputs(AbstractOutput output) {
    opensimCommonJNI.ReporterVector_connectInput_inputs__SWIG_1(swigCPtr, this, AbstractOutput.getCPtr(output), output);
  }

  public void connectInput_inputs(AbstractChannel channel, String alias) {
    opensimCommonJNI.ReporterVector_connectInput_inputs__SWIG_2(swigCPtr, this, AbstractChannel.getCPtr(channel), channel, alias);
  }

  public void connectInput_inputs(AbstractChannel channel) {
    opensimCommonJNI.ReporterVector_connectInput_inputs__SWIG_3(swigCPtr, this, AbstractChannel.getCPtr(channel), channel);
  }

  public void addToReport(AbstractOutput output, String alias) {
    opensimCommonJNI.ReporterVector_addToReport__SWIG_0(swigCPtr, this, AbstractOutput.getCPtr(output), output, alias);
  }

  public void addToReport(AbstractOutput output) {
    opensimCommonJNI.ReporterVector_addToReport__SWIG_1(swigCPtr, this, AbstractOutput.getCPtr(output), output);
  }

  public void addToReport(AbstractChannel channel, String alias) {
    opensimCommonJNI.ReporterVector_addToReport__SWIG_2(swigCPtr, this, AbstractChannel.getCPtr(channel), channel, alias);
  }

  public void addToReport(AbstractChannel channel) {
    opensimCommonJNI.ReporterVector_addToReport__SWIG_3(swigCPtr, this, AbstractChannel.getCPtr(channel), channel);
  }

}
