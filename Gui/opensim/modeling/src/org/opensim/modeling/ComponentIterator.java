/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ComponentIterator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ComponentIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ComponentIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_ComponentIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(ComponentIterator other) {
    return opensimModelCommonJNI.ComponentIterator_equals(swigCPtr, this, ComponentIterator.getCPtr(other), other);
  }

  public Component __ref__() {
    return new Component(opensimModelCommonJNI.ComponentIterator___ref__(swigCPtr, this), false);
  }

  public Component __deref__() {
    long cPtr = opensimModelCommonJNI.ComponentIterator___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new Component(cPtr, false);
  }

  public ComponentIterator next() {
    return new ComponentIterator(opensimModelCommonJNI.ComponentIterator_next(swigCPtr, this), false);
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelCommonJNI.ComponentIterator_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Component(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelCommonJNI.ComponentIterator_getConcreteClassName(swigCPtr, this);
  }

  public void addToSystem(SWIGTYPE_p_SimTK__MultibodySystem system) {
    opensimModelCommonJNI.ComponentIterator_addToSystem(swigCPtr, this, SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(system));
  }

  public void initStateFromProperties(State state) {
    opensimModelCommonJNI.ComponentIterator_initStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimModelCommonJNI.ComponentIterator_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

  public SWIGTYPE_p_SimTK__MultibodySystem getSystem() {
    return new SWIGTYPE_p_SimTK__MultibodySystem(opensimModelCommonJNI.ComponentIterator_getSystem(swigCPtr, this), false);
  }

  public boolean hasSystem() {
    return opensimModelCommonJNI.ComponentIterator_hasSystem(swigCPtr, this);
  }

  public String getFullPathName() {
    return opensimModelCommonJNI.ComponentIterator_getFullPathName(swigCPtr, this);
  }

  public String getRelativePathName(Component wrt) {
    return opensimModelCommonJNI.ComponentIterator_getRelativePathName(swigCPtr, this, Component.getCPtr(wrt), wrt);
  }

  public boolean hasComponent(String pathname) {
    return opensimModelCommonJNI.ComponentIterator_hasComponent(swigCPtr, this, pathname);
  }

  public Component getComponent(String pathname) {
    return new Component(opensimModelCommonJNI.ComponentIterator_getComponent(swigCPtr, this, pathname), false);
  }

  public long printComponentsMatching(String substring) {
    return opensimModelCommonJNI.ComponentIterator_printComponentsMatching(swigCPtr, this, substring);
  }

  public int getNumStateVariables() {
    return opensimModelCommonJNI.ComponentIterator_getNumStateVariables(swigCPtr, this);
  }

  public ArrayStr getStateVariableNames() {
    return new ArrayStr(opensimModelCommonJNI.ComponentIterator_getStateVariableNames(swigCPtr, this), true);
  }

  public int getNumConnectors() {
    return opensimModelCommonJNI.ComponentIterator_getNumConnectors(swigCPtr, this);
  }

  public OpenSimObject getConnectee(String name) {
    return new OpenSimObject(opensimModelCommonJNI.ComponentIterator_getConnectee(swigCPtr, this, name), false);
  }

  public AbstractConnector getConnector(String name) {
    return new AbstractConnector(opensimModelCommonJNI.ComponentIterator_getConnector__SWIG_0(swigCPtr, this, name), false);
  }

  public AbstractConnector getConnector(int i) {
    return new AbstractConnector(opensimModelCommonJNI.ComponentIterator_getConnector__SWIG_2(swigCPtr, this, i), false);
  }

  public int getNumInputs() {
    return opensimModelCommonJNI.ComponentIterator_getNumInputs(swigCPtr, this);
  }

  public int getNumOutputs() {
    return opensimModelCommonJNI.ComponentIterator_getNumOutputs(swigCPtr, this);
  }

  public StdVectorString getInputNames() {
    return new StdVectorString(opensimModelCommonJNI.ComponentIterator_getInputNames(swigCPtr, this), true);
  }

  public StdVectorString getOutputNames() {
    return new StdVectorString(opensimModelCommonJNI.ComponentIterator_getOutputNames(swigCPtr, this), true);
  }

  public AbstractInput getInput(String name) {
    return new AbstractInput(opensimModelCommonJNI.ComponentIterator_getInput(swigCPtr, this, name), false);
  }

  public AbstractOutput getOutput(String name) {
    return new AbstractOutput(opensimModelCommonJNI.ComponentIterator_getOutput(swigCPtr, this, name), false);
  }

  public int getModelingOption(State state, String name) {
    return opensimModelCommonJNI.ComponentIterator_getModelingOption(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setModelingOption(State state, String name, int flag) {
    opensimModelCommonJNI.ComponentIterator_setModelingOption(swigCPtr, this, State.getCPtr(state), state, name, flag);
  }

  public double getStateVariableValue(State state, String name) {
    return opensimModelCommonJNI.ComponentIterator_getStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setStateVariableValue(State state, String name, double value) {
    opensimModelCommonJNI.ComponentIterator_setStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public Vector getStateVariableValues(State state) {
    return new Vector(opensimModelCommonJNI.ComponentIterator_getStateVariableValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public double getStateVariableDerivativeValue(State state, String name) {
    return opensimModelCommonJNI.ComponentIterator_getStateVariableDerivativeValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public double getDiscreteVariableValue(State state, String name) {
    return opensimModelCommonJNI.ComponentIterator_getDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setDiscreteVariableValue(State state, String name, double value) {
    opensimModelCommonJNI.ComponentIterator_setDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public void markCacheVariableValid(State state, String name) {
    opensimModelCommonJNI.ComponentIterator_markCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void markCacheVariableInvalid(State state, String name) {
    opensimModelCommonJNI.ComponentIterator_markCacheVariableInvalid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public boolean isCacheVariableValid(State state, String name) {
    return opensimModelCommonJNI.ComponentIterator_isCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void dumpSubcomponents(int depth) {
    opensimModelCommonJNI.ComponentIterator_dumpSubcomponents__SWIG_0(swigCPtr, this, depth);
  }

  public void dumpSubcomponents() {
    opensimModelCommonJNI.ComponentIterator_dumpSubcomponents__SWIG_1(swigCPtr, this);
  }

  public void dumpConnections() {
    opensimModelCommonJNI.ComponentIterator_dumpConnections(swigCPtr, this);
  }

  public AbstractConnector findConnector(String name) {
    long cPtr = opensimModelCommonJNI.ComponentIterator_findConnector(swigCPtr, this, name);
    return (cPtr == 0) ? null : new AbstractConnector(cPtr, false);
  }

  public Component getParent() {
    return new Component(opensimModelCommonJNI.ComponentIterator_getParent(swigCPtr, this), false);
  }

  public boolean hasParent() {
    return opensimModelCommonJNI.ComponentIterator_hasParent(swigCPtr, this);
  }

  public ComponentsList getComponentsList() {
    return new ComponentsList(opensimModelCommonJNI.ComponentIterator_getComponentsList(swigCPtr, this), true);
  }

  public boolean isEqualTo(OpenSimObject aObject) {
    return opensimModelCommonJNI.ComponentIterator_isEqualTo(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public String getName() {
    return opensimModelCommonJNI.ComponentIterator_getName(swigCPtr, this);
  }

  public String getDescription() {
    return opensimModelCommonJNI.ComponentIterator_getDescription(swigCPtr, this);
  }

  public String getAuthors() {
    return opensimModelCommonJNI.ComponentIterator_getAuthors(swigCPtr, this);
  }

  public String getReferences() {
    return opensimModelCommonJNI.ComponentIterator_getReferences(swigCPtr, this);
  }

  public int getNumProperties() {
    return opensimModelCommonJNI.ComponentIterator_getNumProperties(swigCPtr, this);
  }

  public AbstractProperty getPropertyByIndex(int propertyIndex) {
    return new AbstractProperty(opensimModelCommonJNI.ComponentIterator_getPropertyByIndex(swigCPtr, this, propertyIndex), false);
  }

  public boolean hasProperty(String name) {
    return opensimModelCommonJNI.ComponentIterator_hasProperty(swigCPtr, this, name);
  }

  public AbstractProperty getPropertyByName(String name) {
    return new AbstractProperty(opensimModelCommonJNI.ComponentIterator_getPropertyByName(swigCPtr, this, name), false);
  }

  public boolean isObjectUpToDateWithProperties() {
    return opensimModelCommonJNI.ComponentIterator_isObjectUpToDateWithProperties(swigCPtr, this);
  }

  public void updateXMLNode(SWIGTYPE_p_SimTK__Xml__Element parent) {
    opensimModelCommonJNI.ComponentIterator_updateXMLNode(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(parent));
  }

  public boolean getInlined() {
    return opensimModelCommonJNI.ComponentIterator_getInlined(swigCPtr, this);
  }

  public String getDocumentFileName() {
    return opensimModelCommonJNI.ComponentIterator_getDocumentFileName(swigCPtr, this);
  }

  public boolean print(String fileName) {
    return opensimModelCommonJNI.ComponentIterator_print(swigCPtr, this, fileName);
  }

  public boolean isA(String type) {
    return opensimModelCommonJNI.ComponentIterator_isA(swigCPtr, this, type);
  }

  public String toString() {
    return opensimModelCommonJNI.ComponentIterator_toString(swigCPtr, this);
  }

}
