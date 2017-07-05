/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter extends OpenSimObject {
  private transient long swigCPtr;

  public Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_specific_tension(Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter source) {
    opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_copyProperty_specific_tension(swigCPtr, this, Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter.getCPtr(source), source);
  }

  public double get_specific_tension(int i) {
    return opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_get_specific_tension__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_specific_tension(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_specific_tension__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_specific_tension(int i, double value) {
    opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_set_specific_tension__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_specific_tension(double value) {
    return opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_append_specific_tension(swigCPtr, this, value);
  }

  public void constructProperty_specific_tension(double initValue) {
    opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_constructProperty_specific_tension(swigCPtr, this, initValue);
  }

  public double get_specific_tension() {
    return opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_get_specific_tension__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_specific_tension() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_specific_tension__SWIG_1(swigCPtr, this), false);
  }

  public void set_specific_tension(double value) {
    opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_set_specific_tension__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_density(Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter source) {
    opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_copyProperty_density(swigCPtr, this, Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter.getCPtr(source), source);
  }

  public double get_density(int i) {
    return opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_get_density__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_density(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_density__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_density(int i, double value) {
    opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_set_density__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_density(double value) {
    return opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_append_density(swigCPtr, this, value);
  }

  public void constructProperty_density(double initValue) {
    opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_constructProperty_density(swigCPtr, this, initValue);
  }

  public double get_density() {
    return opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_get_density__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_density() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_density__SWIG_1(swigCPtr, this), false);
  }

  public void set_density(double value) {
    opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_set_density__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_ratio_slow_twitch_fibers(Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter source) {
    opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_copyProperty_ratio_slow_twitch_fibers(swigCPtr, this, Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter.getCPtr(source), source);
  }

  public double get_ratio_slow_twitch_fibers(int i) {
    return opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_get_ratio_slow_twitch_fibers__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_ratio_slow_twitch_fibers(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_ratio_slow_twitch_fibers__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_ratio_slow_twitch_fibers(int i, double value) {
    opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_set_ratio_slow_twitch_fibers__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_ratio_slow_twitch_fibers(double value) {
    return opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_append_ratio_slow_twitch_fibers(swigCPtr, this, value);
  }

  public void constructProperty_ratio_slow_twitch_fibers(double initValue) {
    opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_constructProperty_ratio_slow_twitch_fibers(swigCPtr, this, initValue);
  }

  public double get_ratio_slow_twitch_fibers() {
    return opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_get_ratio_slow_twitch_fibers__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_ratio_slow_twitch_fibers() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_ratio_slow_twitch_fibers__SWIG_1(swigCPtr, this), false);
  }

  public void set_ratio_slow_twitch_fibers(double value) {
    opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_set_ratio_slow_twitch_fibers__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_use_provided_muscle_mass(Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter source) {
    opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_copyProperty_use_provided_muscle_mass(swigCPtr, this, Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter.getCPtr(source), source);
  }

  public boolean get_use_provided_muscle_mass(int i) {
    return opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_get_use_provided_muscle_mass__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_use_provided_muscle_mass(int i) {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_use_provided_muscle_mass__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_use_provided_muscle_mass(int i, boolean value) {
    opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_set_use_provided_muscle_mass__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_use_provided_muscle_mass(boolean value) {
    return opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_append_use_provided_muscle_mass(swigCPtr, this, value);
  }

  public void constructProperty_use_provided_muscle_mass(boolean initValue) {
    opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_constructProperty_use_provided_muscle_mass(swigCPtr, this, initValue);
  }

  public boolean get_use_provided_muscle_mass() {
    return opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_get_use_provided_muscle_mass__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_use_provided_muscle_mass() {
    return new SWIGTYPE_p_bool(opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_use_provided_muscle_mass__SWIG_1(swigCPtr, this), false);
  }

  public void set_use_provided_muscle_mass(boolean value) {
    opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_set_use_provided_muscle_mass__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_provided_muscle_mass(Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter source) {
    opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_copyProperty_provided_muscle_mass(swigCPtr, this, Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter.getCPtr(source), source);
  }

  public double get_provided_muscle_mass(int i) {
    return opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_get_provided_muscle_mass__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_provided_muscle_mass(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_provided_muscle_mass__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_provided_muscle_mass(int i, double value) {
    opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_set_provided_muscle_mass__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_provided_muscle_mass(double value) {
    return opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_append_provided_muscle_mass(swigCPtr, this, value);
  }

  public void constructProperty_provided_muscle_mass(double initValue) {
    opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_constructProperty_provided_muscle_mass(swigCPtr, this, initValue);
  }

  public double get_provided_muscle_mass() {
    return opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_get_provided_muscle_mass__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_provided_muscle_mass() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_provided_muscle_mass__SWIG_1(swigCPtr, this), false);
  }

  public void set_provided_muscle_mass(double value) {
    opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_set_provided_muscle_mass__SWIG_1(swigCPtr, this, value);
  }

  public Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter() {
    this(opensimSimulationJNI.new_Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter__SWIG_0(), true);
  }

  public Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter(String muscleName, double ratio_slow_twitch_fibers, double muscle_mass) {
    this(opensimSimulationJNI.new_Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter__SWIG_1(muscleName, ratio_slow_twitch_fibers, muscle_mass), true);
  }

  public Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter(String muscleName, double ratio_slow_twitch_fibers) {
    this(opensimSimulationJNI.new_Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter__SWIG_2(muscleName, ratio_slow_twitch_fibers), true);
  }

  public double getMuscleMass() {
    return opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_getMuscleMass(swigCPtr, this);
  }

  public void setMuscleMass() {
    opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_setMuscleMass(swigCPtr, this);
  }

  public Muscle getMuscle() {
    long cPtr = opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_getMuscle(swigCPtr, this);
    return (cPtr == 0) ? null : new Muscle(cPtr, false);
  }

  public void setMuscle(Muscle m) {
    opensimSimulationJNI.Umberger2010MuscleMetabolicsProbe_MetabolicMuscleParameter_setMuscle(swigCPtr, this, Muscle.getCPtr(m), m);
  }

}
