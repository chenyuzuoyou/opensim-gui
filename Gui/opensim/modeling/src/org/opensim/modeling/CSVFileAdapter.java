/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class CSVFileAdapter {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected CSVFileAdapter(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CSVFileAdapter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_CSVFileAdapter(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CSVFileAdapter() {
    this(opensimCommonJNI.new_CSVFileAdapter__SWIG_0(), true);
  }

  public CSVFileAdapter(CSVFileAdapter arg0) {
    this(opensimCommonJNI.new_CSVFileAdapter__SWIG_1(CSVFileAdapter.getCPtr(arg0), arg0), true);
  }

  public CSVFileAdapter clone() {
    long cPtr = opensimCommonJNI.CSVFileAdapter_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new CSVFileAdapter(cPtr, true);
  }

  public static TimeSeriesTable read(String fileName) {
    return new TimeSeriesTable(opensimCommonJNI.CSVFileAdapter_read(fileName), true);
  }

  public static void write(TimeSeriesTable table, String fileName) {
    opensimCommonJNI.CSVFileAdapter_write(TimeSeriesTable.getCPtr(table), table, fileName);
  }

}
