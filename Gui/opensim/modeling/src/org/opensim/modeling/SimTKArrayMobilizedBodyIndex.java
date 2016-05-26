/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SimTKArrayMobilizedBodyIndex {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SimTKArrayMobilizedBodyIndex(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SimTKArrayMobilizedBodyIndex obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_SimTKArrayMobilizedBodyIndex(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SimTKArrayMobilizedBodyIndex() {
    this(opensimSimbodyJNI.new_SimTKArrayMobilizedBodyIndex__SWIG_0(), true);
  }

  public SimTKArrayMobilizedBodyIndex(long n) {
    this(opensimSimbodyJNI.new_SimTKArrayMobilizedBodyIndex__SWIG_1(n), true);
  }

  public SimTKArrayMobilizedBodyIndex(long n, int initVal) {
    this(opensimSimbodyJNI.new_SimTKArrayMobilizedBodyIndex__SWIG_2(n, initVal), true);
  }

  public SimTKArrayMobilizedBodyIndex(SimTKArrayMobilizedBodyIndex src) {
    this(opensimSimbodyJNI.new_SimTKArrayMobilizedBodyIndex__SWIG_3(SimTKArrayMobilizedBodyIndex.getCPtr(src), src), true);
  }

  public SimTKArrayMobilizedBodyIndex(SWIGTYPE_p_int first, SWIGTYPE_p_int last1, DontCopy arg2) {
    this(opensimSimbodyJNI.new_SimTKArrayMobilizedBodyIndex__SWIG_4(SWIGTYPE_p_int.getCPtr(first), SWIGTYPE_p_int.getCPtr(last1), DontCopy.getCPtr(arg2), arg2), true);
  }

  public SimTKArrayMobilizedBodyIndex deallocate() {
    return new SimTKArrayMobilizedBodyIndex(opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_deallocate(swigCPtr, this), false);
  }

  public void assign(long n, int fillValue) {
    opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_assign(swigCPtr, this, n, fillValue);
  }

  public void fill(int fillValue) {
    opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_fill(swigCPtr, this, fillValue);
  }

  public void swap(SimTKArrayMobilizedBodyIndex other) {
    opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_swap(swigCPtr, this, SimTKArrayMobilizedBodyIndex.getCPtr(other), other);
  }

  public SimTKArrayMobilizedBodyIndex adoptData(SWIGTYPE_p_int newData, long dataSize, long dataCapacity) {
    return new SimTKArrayMobilizedBodyIndex(opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_adoptData__SWIG_0(swigCPtr, this, SWIGTYPE_p_int.getCPtr(newData), dataSize, dataCapacity), false);
  }

  public SimTKArrayMobilizedBodyIndex adoptData(SWIGTYPE_p_int newData, long dataSize) {
    return new SimTKArrayMobilizedBodyIndex(opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_adoptData__SWIG_1(swigCPtr, this, SWIGTYPE_p_int.getCPtr(newData), dataSize), false);
  }

  public SimTKArrayMobilizedBodyIndex shareData(SWIGTYPE_p_int newData, long dataSize) {
    return new SimTKArrayMobilizedBodyIndex(opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_shareData__SWIG_0(swigCPtr, this, SWIGTYPE_p_int.getCPtr(newData), dataSize), false);
  }

  public SimTKArrayMobilizedBodyIndex shareData(SWIGTYPE_p_int first, SWIGTYPE_p_int last1) {
    return new SimTKArrayMobilizedBodyIndex(opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_shareData__SWIG_1(swigCPtr, this, SWIGTYPE_p_int.getCPtr(first), SWIGTYPE_p_int.getCPtr(last1)), false);
  }

  public long size() {
    return opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_size(swigCPtr, this);
  }

  public long max_size() {
    return opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_max_size(swigCPtr, this);
  }

  public boolean empty() {
    return opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_empty(swigCPtr, this);
  }

  public long capacity() {
    return opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_capacity(swigCPtr, this);
  }

  public void resize(long n) {
    opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_resize__SWIG_0(swigCPtr, this, n);
  }

  public void resize(long n, int initVal) {
    opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_resize__SWIG_1(swigCPtr, this, n, initVal);
  }

  public void reserve(long n) {
    opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_reserve(swigCPtr, this, n);
  }

  public void shrink_to_fit() {
    opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_shrink_to_fit(swigCPtr, this);
  }

  public long allocated() {
    return opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_allocated(swigCPtr, this);
  }

  public boolean isOwner() {
    return opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_isOwner(swigCPtr, this);
  }

  public SWIGTYPE_p_int cbegin() {
    long cPtr = opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_cbegin(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public SWIGTYPE_p_int begin() {
    long cPtr = opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_begin__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public SWIGTYPE_p_int cend() {
    long cPtr = opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_cend(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public SWIGTYPE_p_int end() {
    long cPtr = opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_end__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public SWIGTYPE_p_std__reverse_iteratorT_int_const_p_t crbegin() {
    return new SWIGTYPE_p_std__reverse_iteratorT_int_const_p_t(opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_crbegin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__reverse_iteratorT_int_const_p_t rbegin() {
    return new SWIGTYPE_p_std__reverse_iteratorT_int_const_p_t(opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_rbegin__SWIG_0(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__reverse_iteratorT_int_const_p_t crend() {
    return new SWIGTYPE_p_std__reverse_iteratorT_int_const_p_t(opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_crend(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__reverse_iteratorT_int_const_p_t rend() {
    return new SWIGTYPE_p_std__reverse_iteratorT_int_const_p_t(opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_rend__SWIG_0(swigCPtr, this), true);
  }

  public SWIGTYPE_p_int cdata() {
    long cPtr = opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_cdata(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public SWIGTYPE_p_int data() {
    long cPtr = opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_data__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public int at(long i) {
    return opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_at__SWIG_0(swigCPtr, this, i);
  }

  public int getElt(long i) {
    return opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_getElt(swigCPtr, this, i);
  }

  public SWIGTYPE_p_int updElt(long i) {
    return new SWIGTYPE_p_int(opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_updElt(swigCPtr, this, i), false);
  }

  public int front() {
    return opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_front__SWIG_0(swigCPtr, this);
  }

  public int back() {
    return opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_back__SWIG_0(swigCPtr, this);
  }

  public void push_back(int value) {
    opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_push_back__SWIG_0(swigCPtr, this, value);
  }

  public void push_back() {
    opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_push_back__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_int raw_push_back() {
    long cPtr = opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_raw_push_back(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public void pop_back() {
    opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_pop_back(swigCPtr, this);
  }

  public SWIGTYPE_p_int erase(SWIGTYPE_p_int first, SWIGTYPE_p_int last1) {
    long cPtr = opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_erase__SWIG_0(swigCPtr, this, SWIGTYPE_p_int.getCPtr(first), SWIGTYPE_p_int.getCPtr(last1));
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public SWIGTYPE_p_int erase(SWIGTYPE_p_int p) {
    long cPtr = opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_erase__SWIG_1(swigCPtr, this, SWIGTYPE_p_int.getCPtr(p));
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public SWIGTYPE_p_int eraseFast(SWIGTYPE_p_int p) {
    long cPtr = opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_eraseFast(swigCPtr, this, SWIGTYPE_p_int.getCPtr(p));
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public void clear() {
    opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_int insert(SWIGTYPE_p_int p, long n, int value) {
    long cPtr = opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_insert__SWIG_0(swigCPtr, this, SWIGTYPE_p_int.getCPtr(p), n, value);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public SWIGTYPE_p_int insert(SWIGTYPE_p_int p, int value) {
    long cPtr = opensimSimbodyJNI.SimTKArrayMobilizedBodyIndex_insert__SWIG_1(swigCPtr, this, SWIGTYPE_p_int.getCPtr(p), value);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

}
