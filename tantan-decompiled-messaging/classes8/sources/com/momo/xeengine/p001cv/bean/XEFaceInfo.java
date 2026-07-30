package com.momo.xeengine.p001cv.bean;

import androidx.annotation.Keep;
import com.momo.xeengine.sensor.Vector3f;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
@Deprecated
public class XEFaceInfo {
    public float[] cameraMatrix;
    public float[] dst_warp_points;
    public int expression;
    public float[] faceBounds;
    public XEFaceMask faceMask;
    public Vector3f faceRigEulerVector;
    public float[] facerigStates;
    public float[] landmarks106;

    @Deprecated
    public float[] landmarks137;
    public float[] landmarks222;
    public float[] landmarks68;
    public float[] landmarks96;
    public List<XEFaceLiquefy> liquefyInfos;
    public int meType;
    public float[] modelViewMatrix;
    public XEFaceMask mouthMask;
    public float pitch;

    @Deprecated
    public float[] projectionMatrix;
    public float roll;
    public float[] rotationMatrix;
    public float[] rotationVector;
    public float[] skin_threshold;
    public float[] src_warp_points;
    public int trackId;
    public float[] translationVector;
    public float yaw;

    public float[] getCameraMatrix() {
        return this.cameraMatrix;
    }

    public float[] getDst_warp_points() {
        return this.dst_warp_points;
    }

    public int getExpression() {
        return this.expression;
    }

    public float[] getFaceBounds() {
        return this.faceBounds;
    }

    public XEFaceMask getFaceMask() {
        return this.faceMask;
    }

    public Vector3f getFaceRigEulerVector() {
        return this.faceRigEulerVector;
    }

    public float[] getFacerigStates() {
        return this.facerigStates;
    }

    public float[] getLandmarks137() {
        return this.landmarks137;
    }

    public float[] getLandmarks68() {
        return this.landmarks68;
    }

    public float[] getLandmarks96() {
        return this.landmarks96;
    }

    public List<XEFaceLiquefy> getLiquefyInfos() {
        return this.liquefyInfos;
    }

    public int getMeType() {
        return this.meType;
    }

    public float[] getModelViewMatrix() {
        return this.modelViewMatrix;
    }

    public XEFaceMask getMouthMask() {
        return this.mouthMask;
    }

    public float getPitch() {
        return this.pitch;
    }

    public float[] getProjectionMatrix() {
        return this.projectionMatrix;
    }

    public float getRoll() {
        return this.roll;
    }

    public float[] getRotationMatrix() {
        return this.rotationMatrix;
    }

    public float[] getRotationVector() {
        return this.rotationVector;
    }

    public float[] getSkin_threshold() {
        return this.skin_threshold;
    }

    public float[] getSrc_warp_points() {
        return this.src_warp_points;
    }

    public int getTrackId() {
        return this.trackId;
    }

    public float[] getTranslationVector() {
        return this.translationVector;
    }

    public float getYaw() {
        return this.yaw;
    }

    public void setCameraMatrix(float[] fArr) {
        this.cameraMatrix = fArr;
    }

    public void setDst_warp_points(float[] fArr) {
        this.dst_warp_points = fArr;
    }

    public void setExpression(int i) {
        this.expression = i;
    }

    public void setFaceBounds(float[] fArr) {
        this.faceBounds = fArr;
    }

    public void setFaceMask(XEFaceMask xEFaceMask) {
        this.faceMask = xEFaceMask;
    }

    public void setFaceRigEulerVector(Vector3f vector3f) {
        this.faceRigEulerVector = vector3f;
    }

    public void setFacerigStates(float[] fArr) {
        this.facerigStates = fArr;
    }

    public void setLandmarks137(float[] fArr) {
        this.landmarks137 = fArr;
    }

    public void setLandmarks68(float[] fArr) {
        this.landmarks68 = fArr;
    }

    public void setLandmarks96(float[] fArr) {
        this.landmarks96 = fArr;
    }

    public void setLiquefyInfos(List<XEFaceLiquefy> list) {
        this.liquefyInfos = list;
    }

    public void setMeType(int i) {
        this.meType = i;
    }

    public void setModelViewMatrix(float[] fArr) {
        this.modelViewMatrix = fArr;
    }

    public void setMouthMask(XEFaceMask xEFaceMask) {
        this.mouthMask = xEFaceMask;
    }

    public void setPitch(float f) {
        this.pitch = f;
    }

    public void setProjectionMatrix(float[] fArr) {
        this.projectionMatrix = fArr;
    }

    public void setRoll(float f) {
        this.roll = f;
    }

    public void setRotationMatrix(float[] fArr) {
        this.rotationMatrix = fArr;
    }

    public void setRotationVector(float[] fArr) {
        this.rotationVector = fArr;
    }

    public void setSkin_threshold(float[] fArr) {
        this.skin_threshold = fArr;
    }

    public void setSrc_warp_points(float[] fArr) {
        this.src_warp_points = fArr;
    }

    public void setTrackId(int i) {
        this.trackId = i;
    }

    public void setTranslationVector(float[] fArr) {
        this.translationVector = fArr;
    }

    public void setYaw(float f) {
        this.yaw = f;
    }

    public String toString() {
        return "XEFaceInfo{modelViewMatrix=" + Arrays.toString(this.modelViewMatrix) + '}';
    }
}
