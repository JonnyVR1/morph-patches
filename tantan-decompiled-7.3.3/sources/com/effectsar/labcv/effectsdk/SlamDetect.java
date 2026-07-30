package com.effectsar.labcv.effectsdk;

import android.content.Context;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class SlamDetect {
    private long mNativePtr;
    private volatile boolean mInited = false;
    private volatile boolean mCreateSuc = false;

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeChecklicense(Context context, String str, boolean z);

    private native void nativeDestroy();

    private native BefSlamInfo.SlamPose nativeDetect(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, double d, BefSlamInfo.SlamClickFlag slamClickFlag);

    private native BefSlamInfo.Points[] nativeGetFeaturePoints();

    private native BefSlamInfo.SlamCameraIntrinsic nativeGetIntrinsic(String str, String str2, int i, int i2);

    private native BefSlamInfo.SlamPlane nativeGetPlane(BefSlamInfo.SlamPose slamPose, int i, BefSlamInfo.SlamClickFlag slamClickFlag);

    private native BefSlamInfo.SlamPose nativeGetPlanePose(BefSlamInfo.SlamPose slamPose, int i, BefSlamInfo.SlamClickFlag slamClickFlag);

    private native int nativeInit(String str, String str2, BefSlamInfo.SlamCameraInfo slamCameraInfo, BefSlamInfo.SlamImuInfo slamImuInfo, int i);

    private native void nativeInitCameraInfo(BefSlamInfo.SlamCameraInfo slamCameraInfo);

    private native int nativeResetStatues();

    private native int nativeSetImuData(int i, BefSlamInfo.SlamImuData slamImuData);

    private native int nativeSetRotationVector(double[] dArr, double d);

    private native int nativeSetVersion(int i);

    public int checklicense(Context context, String str, boolean z) {
        if (!this.mCreateSuc) {
            return -1;
        }
        int iNativeChecklicense = nativeChecklicense(context, str, z);
        if (iNativeChecklicense != 0) {
            this.mInited = false;
            return iNativeChecklicense;
        }
        this.mInited = true;
        return iNativeChecklicense;
    }

    public void destory() {
        if (this.mInited) {
            nativeDestroy();
        }
    }

    public BefSlamInfo.SlamCameraIntrinsic getCameraIntrinsic(String str, String str2, int i, int i2) {
        if (this.mInited) {
            return nativeGetIntrinsic(str, str2, i, i2);
        }
        return null;
    }

    public BefSlamInfo.Points[] getFeaturePoints() {
        if (this.mInited) {
            return nativeGetFeaturePoints();
        }
        return null;
    }

    public BefSlamInfo.SlamPlane getPlane(BefSlamInfo.SlamPose slamPose, int i, BefSlamInfo.SlamClickFlag slamClickFlag) {
        if (this.mInited && slamPose != null) {
            return nativeGetPlane(slamPose, i, slamClickFlag);
        }
        return null;
    }

    public BefSlamInfo.SlamPose getPlanePose(BefSlamInfo.SlamPose slamPose, int i, BefSlamInfo.SlamClickFlag slamClickFlag) {
        if (this.mInited && slamPose != null) {
            return nativeGetPlanePose(slamPose, i, slamClickFlag);
        }
        return null;
    }

    public int init(String str, String str2, BefSlamInfo.SlamImuInfo slamImuInfo, BefSlamInfo.SlamCameraInfo slamCameraInfo, EffectsSDKEffectConstants.SlamVersion slamVersion) {
        int iNativeInit = nativeInit(str, str2, slamCameraInfo, slamImuInfo, slamVersion.getValue());
        if (iNativeInit != 0) {
            this.mCreateSuc = false;
            return iNativeInit;
        }
        this.mCreateSuc = true;
        return iNativeInit;
    }

    public void initCameraInfo(BefSlamInfo.SlamCameraInfo slamCameraInfo) {
        nativeInitCameraInfo(slamCameraInfo);
    }

    public int resetStatues() {
        if (this.mInited) {
            return nativeResetStatues();
        }
        return 0;
    }

    public int setImuData(EffectsSDKEffectConstants.SlamImuDataType slamImuDataType, BefSlamInfo.SlamImuData slamImuData) {
        if (slamImuData == null || !this.mInited) {
            return -1;
        }
        return nativeSetImuData(slamImuDataType.getValue(), slamImuData);
    }

    public int setRotationVector(double[] dArr, double d) {
        if (dArr == null || !this.mInited) {
            return -1;
        }
        return nativeSetRotationVector(dArr, d);
    }

    public int setVersion(EffectsSDKEffectConstants.SlamVersion slamVersion) {
        if (this.mInited) {
            return nativeSetVersion(slamVersion.getValue());
        }
        return 0;
    }

    public BefSlamInfo.SlamPose slamDetect(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, EffectsSDKEffectConstants.SlamDeviceOrientation slamDeviceOrientation, double d, BefSlamInfo.SlamClickFlag slamClickFlag) {
        if (this.mInited && byteBuffer != null) {
            return nativeDetect(byteBuffer, i, i2, i3, i4, slamDeviceOrientation.getValue(), d, slamClickFlag);
        }
        return null;
    }
}
