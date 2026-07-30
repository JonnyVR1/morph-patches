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
        public float f5835x;

        /* JADX INFO: renamed from: y */
        public float f5836y;

        public Points(float f, float f2) {
            this.f5835x = f;
            this.f5836y = f2;
        }

        public float getX() {
            return this.f5835x;
        }

        public float getY() {
            return this.f5836y;
        }

        public void setX(float f) {
            this.f5835x = f;
        }

        public void setY(float f) {
            this.f5836y = f;
        }

        public String toString() {
            return "Points{x=" + this.f5835x + ", y=" + this.f5836y + '}';
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
        public float f5837cx;

        /* JADX INFO: renamed from: cy */
        public float f5838cy;

        /* JADX INFO: renamed from: fx */
        public float f5839fx;

        /* JADX INFO: renamed from: fy */
        public float f5840fy;

        public SlamCameraIntrinsic(float f, float f2, float f3, float f4) {
            this.f5839fx = f;
            this.f5840fy = f2;
            this.f5837cx = f3;
            this.f5838cy = f4;
        }
    }

    public static class SlamClickFlag {
        public int isClicked;

        /* JADX INFO: renamed from: x */
        public float f5841x;

        /* JADX INFO: renamed from: y */
        public float f5842y;

        public int getIsClicked() {
            return this.isClicked;
        }

        public float getX() {
            return this.f5841x;
        }

        public float getY() {
            return this.f5842y;
        }

        public void setIsClicked(int i) {
            this.isClicked = i;
        }

        public void setX(float f) {
            this.f5841x = f;
        }

        public void setY(float f) {
            this.f5842y = f;
        }
    }

    public static class SlamImuData {
        public double timeStamp;

        /* JADX INFO: renamed from: x */
        public double f5843x;

        /* JADX INFO: renamed from: y */
        public double f5844y;

        /* JADX INFO: renamed from: z */
        public double f5845z;
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
        float[] f5846R;

        /* JADX INFO: renamed from: T */
        float[] f5847T;
        int planeDetected;
        double timeStamp;
        int trackingState;

        public SlamPose(float[] fArr, float[] fArr2, int i, int i2, double d) {
            this.f5846R = fArr;
            this.f5847T = fArr2;
            this.planeDetected = i;
            this.timeStamp = d;
            this.trackingState = i2;
        }

        public int getPlaneDetected() {
            return this.planeDetected;
        }

        public float[] getR() {
            return this.f5846R;
        }

        public float[] getT() {
            return this.f5847T;
        }

        public double getTimeStamp() {
            return this.timeStamp;
        }

        public int getTrackingState() {
            return this.trackingState;
        }

        public String toString() {
            return "SlamPose{R=" + Arrays.toString(this.f5846R) + ", T=" + Arrays.toString(this.f5847T) + ", planeDetected=" + this.planeDetected + ", trackingState=" + this.trackingState + '}';
        }
    }
}
