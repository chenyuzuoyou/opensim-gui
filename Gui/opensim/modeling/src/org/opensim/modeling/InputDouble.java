/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class InputDouble extends AbstractInput {
  private transient long swigCPtr;

  public InputDouble(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.InputDouble_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(InputDouble obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_InputDouble(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public AbstractConnector clone() {
    long cPtr = opensimModelCommonJNI.InputDouble_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new InputDouble(cPtr, true);
  }

  public void connect(AbstractOutput output, String alias) {
    opensimModelCommonJNI.InputDouble_connect__SWIG_0(swigCPtr, this, AbstractOutput.getCPtr(output), output, alias);
  }

  public void connect(AbstractOutput output) {
    opensimModelCommonJNI.InputDouble_connect__SWIG_1(swigCPtr, this, AbstractOutput.getCPtr(output), output);
  }

  public void connect(AbstractChannel channel, String alias) {
    opensimModelCommonJNI.InputDouble_connect__SWIG_2(swigCPtr, this, AbstractChannel.getCPtr(channel), channel, alias);
  }

  public void connect(AbstractChannel channel) {
    opensimModelCommonJNI.InputDouble_connect__SWIG_3(swigCPtr, this, AbstractChannel.getCPtr(channel), channel);
  }

  public void findAndConnect(Component root) {
    opensimModelCommonJNI.InputDouble_findAndConnect(swigCPtr, this, Component.getCPtr(root), root);
  }

  public void disconnect() {
    opensimModelCommonJNI.InputDouble_disconnect(swigCPtr, this);
  }

  public boolean isConnected() {
    return opensimModelCommonJNI.InputDouble_isConnected(swigCPtr, this);
  }

  public double getValue(State state) {
    return opensimModelCommonJNI.InputDouble_getValue__SWIG_0(swigCPtr, this, State.getCPtr(state), state);
  }

  public double getValue(State state, long index) {
    return opensimModelCommonJNI.InputDouble_getValue__SWIG_1(swigCPtr, this, State.getCPtr(state), state, index);
  }

  public SWIGTYPE_p_OpenSim__OutputT_double_t__Channel getChannel() {
    return new SWIGTYPE_p_OpenSim__OutputT_double_t__Channel(opensimModelCommonJNI.InputDouble_getChannel__SWIG_0(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__OutputT_double_t__Channel getChannel(long index) {
    return new SWIGTYPE_p_OpenSim__OutputT_double_t__Channel(opensimModelCommonJNI.InputDouble_getChannel__SWIG_1(swigCPtr, this, index), false);
  }

  public String getAlias() {
    return opensimModelCommonJNI.InputDouble_getAlias__SWIG_0(swigCPtr, this);
  }

  public String getAlias(long index) {
    return opensimModelCommonJNI.InputDouble_getAlias__SWIG_1(swigCPtr, this, index);
  }

  public void setAlias(String alias) {
    opensimModelCommonJNI.InputDouble_setAlias__SWIG_0(swigCPtr, this, alias);
  }

  public void setAlias(long index, String alias) {
    opensimModelCommonJNI.InputDouble_setAlias__SWIG_1(swigCPtr, this, index, alias);
  }

  public String getLabel() {
    return opensimModelCommonJNI.InputDouble_getLabel__SWIG_0(swigCPtr, this);
  }

  public String getLabel(long index) {
    return opensimModelCommonJNI.InputDouble_getLabel__SWIG_1(swigCPtr, this, index);
  }

  public Vector getVector(State state) {
    return new Vector(opensimModelCommonJNI.InputDouble_getVector(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public SWIGTYPE_p_std__vectorT_SimTK__ReferencePtrT_OpenSim__OutputT_double_t__Channel_const_t_t getChannels() {
    return new SWIGTYPE_p_std__vectorT_SimTK__ReferencePtrT_OpenSim__OutputT_double_t__Channel_const_t_t(opensimModelCommonJNI.InputDouble_getChannels(swigCPtr, this), false);
  }

  public String getConnecteeTypeName() {
    return opensimModelCommonJNI.InputDouble_getConnecteeTypeName(swigCPtr, this);
  }

  public static boolean isA(AbstractInput p) {
    return opensimModelCommonJNI.InputDouble_isA(AbstractInput.getCPtr(p), p);
  }

  public static InputDouble downcast(AbstractInput p) {
    return new InputDouble(opensimModelCommonJNI.InputDouble_downcast(AbstractInput.getCPtr(p), p), false);
  }

  public static InputDouble updDowncast(AbstractInput p) {
    return new InputDouble(opensimModelCommonJNI.InputDouble_updDowncast(AbstractInput.getCPtr(p), p), false);
  }

  public static InputDouble safeDownCast(AbstractInput base) {
    long cPtr = opensimModelCommonJNI.InputDouble_safeDownCast(AbstractInput.getCPtr(base), base);
    return (cPtr == 0) ? null : new InputDouble(cPtr, false);
  }

}