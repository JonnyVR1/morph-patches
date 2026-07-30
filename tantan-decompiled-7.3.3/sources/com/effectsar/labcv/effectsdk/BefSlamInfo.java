package com.effectsar.labcv.effectsdk;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class BefSlamInfo {
    public SlamPose cameraPose;
    public Points[] featurePoints;
    public SlamCameraIntrinsic intrinsic;
    public boolean isClicked;
    public SlamPlane planeInfo;
    public SlamPose planePose;

    public static class Points {

        /* JADX INFO: renamed from: x */
        public float f5872x;

        /* JADX INFO: renamed from: y */
        public float f5873y;

        public Points(float f, float f2) {
            this.f5872x = f;
            this.f5873y = f2;
        }

        public float getX() {
            return this.f5872x;
        }

        public float getY() {
            return this.f5873y;
        }

        public void setX(float f) {
            this.f5872x = f;
        }

        public void setY(float f) {
            this.f5873y = f;
        }

        public String toString() {
            return "Points{x=" + this.f5872x + ", y=" + this.f5873y + '}';
        }
    }

    public static class SlamCameraInfo {
        public SlamCameraIntrinsic cameraIntrinsic;
        public int color;
        public int disable_internal_time_delay;
        public int easyInit;
        public int enableFusion;
        public int height;
        public float horizontal_fov;
        public int isFront;
        public int isVideo;
        public int level;
        public boolean low_texture_enhanced;
        public int orienation;
        public int resolution;
        public int runGba;
        public int width;
    }

    public static class SlamCameraIntrinsic {

        /* JADX INFO: renamed from: cx */
        public float f5874cx;

        /* JADX INFO: renamed from: cy */
        public float f5875cy;

        /* JADX INFO: renamed from: fx */
        public float f5876fx;

        /* JADX INFO: renamed from: fy */
        public float f5877fy;

        public SlamCameraIntrinsic(float f, float f2, float f3, float f4) {
            this.f5876fx = f;
            this.f5877fy = f2;
            this.f5874cx = f3;
            this.f5875cy = f4;
        }
    }

    public static class SlamClickFlag {
        public int isClicked;

        /* JADX INFO: renamed from: x */
        public float f5878x;

        /* JADX INFO: renamed from: y */
        public float f5879y;

        public int getIsClicked() {
            return this.isClicked;
        }

        public float getX() {
            return this.f5878x;
        }

        public float getY() {
            return this.f5879y;
        }

        public void setIsClicked(int i) {
            this.isClicked = i;
        }

        public void setX(float f) {
            this.f5878x = f;
        }

        public void setY(float f) {
            this.f5879y = f;
        }
    }

    public static class SlamImuData {
        public double timeStamp;

        /* JADX INFO: renamed from: x */
        public double f5880x;

        /* JADX INFO: renamed from: y */
        public double f5881y;

        /* JADX INFO: renamed from: z */
        public double f5882z;
    }

    public static class SlamImuInfo {
        int hasAccelerometer;
        int hasGravity;
        int hasGyroscope;
        int hasOrientation;

        public void setHasAccelerometer(int i) {
            this.hasAccelerometer = i;
        }

        public void setHasGravity(int i) {
            this.hasGravity = i;
        }

        public void setHasGyroscope(int i) {
            this.hasGyroscope = i;
        }

        public void setHasOrientation(int i) {
            this.hasOrientation = i;
        }
    }

    public static class SlamPlane {
        public float[] boundary;
        public int hasPlane;
        public float[] normal;
        public float offset;
        public float[] origin;
        public float[] originWorld;
        public int[] planePointsIds;

        public SlamPlane(int i, float[] fArr, float f, float[] fArr2, float[] fArr3, float[] fArr4, int[] iArr) {
            this.hasPlane = i;
            this.normal = fArr;
            this.offset = f;
            this.originWorld = fArr2;
            this.origin = fArr3;
            this.boundary = fArr4;
            this.planePointsIds = iArr;
        }
    }

    public static class SlamPose {

        /* JADX INFO: renamed from: R */
        float[] f5883R;

        /* JADX INFO: renamed from: T */
        float[] f5884T;
        int planeDetected;
        double timeStamp;
        int trackingState;

        public SlamPose(float[] fArr, float[] fArr2, int i, int i2, double d) {
            this.f5883R = fArr;
            this.f5884T = fArr2;
            this.planeDetected = i;
            this.timeStamp = d;
            this.trackingState = i2;
        }

        public int getPlaneDetected() {
            return this.planeDetected;
        }

        public float[] getR() {
            return this.f5883R;
        }

        public float[] getT() {
            return this.f5884T;
        }

        public double getTimeStamp() {
            return this.timeStamp;
        }

        public int getTrackingState() {
            return this.trackingState;
        }

        public String toString() {
            return "SlamPose{R=" + Arrays.toString(this.f5883R) + ", T=" + Arrays.toString(this.f5884T) + ", planeDetected=" + this.planeDetected + ", trackingState=" + this.trackingState + '}';
        }
    }
}
