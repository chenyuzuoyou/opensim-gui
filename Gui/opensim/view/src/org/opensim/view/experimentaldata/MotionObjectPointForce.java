/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensim.view.experimentaldata;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import org.opensim.utils.Vec3;

/**
 *
 * @author ayman
 * Copyright (c)  2005-2012, Stanford University, Ayman Habib
 * Use of the OpenSim software in source form is permitted provided that the following
 * conditions are met:
 * 	1. The software is used only for non-commercial research and education. It may not
 *     be used in relation to any commercial activity.
 * 	2. The software is not distributed or redistributed.  Software distribution is allowed
 *     only through https://simtk.org/home/opensim.
 * 	3. Use of the OpenSim software or derivatives must be acknowledged in all publications,
 *      presentations, or documents describing work in which OpenSim or derivatives are used.
 * 	4. Credits to developers may not be removed from executables
 *     created from modifications of the source.
 * 	5. Modifications of source code must retain the above copyright notice, this list of
 *     conditions and the following disclaimer.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 *  EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT
 *  SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 *  TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 *  HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 *  OR BUSINESS INTERRUPTION) OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
 *  WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
public class MotionObjectPointForce extends MotionObjectBodyPoint {

    double[] offset = new double[]{0, 0, 0};
    String forceIdentifier="";
    String forceExpressedInBodyName = "ground";
    private String forceAppliedToBody = "ground";

    private boolean specifyPoint;
    private String forceComponent = "All";
    private String torqueIdentifier="";
    private boolean specifyTorque=false;

    public MotionObjectPointForce(ExperimentalDataItemType objectType, String baseName, int forceIndex) {
        super(objectType, baseName, forceIndex);
        setForceIdentifier(baseName);
   }

    MotionObjectPointForce(MotionObjectPointForce pf) {
        this(pf.getObjectType(), pf.getName(), pf.getStartIndexInFileNotIncludingTime());
        offset = pf.offset;
        forceIdentifier = pf.forceIdentifier;
        forceExpressedInBodyName = pf.forceExpressedInBodyName;
        forceAppliedToBody = pf.forceAppliedToBody;
        specifyPoint = pf.specifyPoint;
        forceComponent = pf.forceComponent;
        torqueIdentifier = pf.torqueIdentifier;
        specifyTorque = pf.specifyTorque;
    }

    void setForceExpressedInBodyName(String selected) {
        forceExpressedInBodyName = selected;
    }

    public void setForceIdentifier(String makeIdentifier) {
        forceIdentifier = makeIdentifier;
    }

    String getForceExpressedInBodyName() {
        return forceExpressedInBodyName;
    }

    boolean appliesForce() {
        return true;
    }

    public String getForceIdentifier() {
        return forceIdentifier;
    }

    
    boolean specifiesPoint() {
        return specifyPoint;
    }

    @Override
    public void setObjectType(ExperimentalDataItemType objectType) {
        super.setObjectType(objectType);
        if (objectType==ExperimentalDataItemType.BodyForceData)
            specifyPoint = false;
        else
            specifyPoint = true;
    }

    /**
     * @return the forceComponent
     */
    public String getForceComponent() {
        return forceComponent;
    }

    /**
     * @param forceComponent the forceComponent to set
     */
    public void setForceComponent(String forceComponent) {
        this.forceComponent = forceComponent;
    }

    /**
     * @return the forceAppliedToBody
     */
    public String getForceAppliedToBody() {
        return forceAppliedToBody;
    }

    /**
     * @param forceAppliedToBody the forceAppliedToBody to set
     */
    public void setForceAppliedToBody(String forceAppliedToBody) {
        this.forceAppliedToBody = forceAppliedToBody;
    }

    /**
     * @return the specifyTorque
     */
    public boolean isSpecifyTorque() {
        return specifyTorque;
    }

    /**
     * @param specifyTorque the specifyTorque to set
     */
    public void setSpecifyTorque(boolean specifyTorque) {
        this.specifyTorque = specifyTorque;
    }

    /**
     * @return the torqueIdentifier
     */
    public String getTorqueIdentifier() {
        return torqueIdentifier;
    }

    /**
     * @param torqueIdentifier the torqueIdentifier to set
     */
    public void setTorqueIdentifier(String torqueIdentifier) {
        this.torqueIdentifier = torqueIdentifier;
    }
 
}
