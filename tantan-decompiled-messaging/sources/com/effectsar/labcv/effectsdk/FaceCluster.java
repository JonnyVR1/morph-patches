package com.effectsar.labcv.effectsdk;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class FaceCluster {
    private volatile boolean mInited = false;
    private long mNativeClusterPtr;

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeCheckLicense(Context context, String str, boolean z);

    private native int nativeCluster(float[] fArr, int i, int[] iArr);

    private native int nativeCreateHandle();

    private native void nativeRelease();

    private native int nativeSetParam(int i, int i2);

    public int[] cluster(float[][] fArr, int i) {
        if (!this.mInited) {
            Log.e(EffectsSDKEffectConstants.TAG, "FaceCluster is not inited, please init it first");
            return null;
        }
        int[] iArr = new int[i];
        int length = 0;
        for (float[] fArr2 : fArr) {
            length += fArr2.length;
        }
        float[] fArr3 = new float[length];
        int length2 = 0;
        for (float[] fArr4 : fArr) {
            System.arraycopy(fArr4, 0, fArr3, length2, fArr4.length);
            length2 += fArr4.length;
        }
        int iNativeCluster = nativeCluster(fArr3, i, iArr);
        if (iNativeCluster == 0) {
            return iArr;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "nativeCluster return " + iNativeCluster);
        return null;
    }

    public int init(Context context, String str, boolean z) {
        if (this.mInited) {
            return 0;
        }
        int iNativeCreateHandle = nativeCreateHandle();
        if (iNativeCreateHandle != 0) {
            this.mInited = false;
            return iNativeCreateHandle;
        }
        int iNativeCheckLicense = nativeCheckLicense(context, str, z);
        if (iNativeCheckLicense != 0) {
            this.mInited = false;
            return iNativeCheckLicense;
        }
        this.mInited = true;
        return iNativeCheckLicense;
    }

    public void release() {
        if (this.mInited) {
            nativeRelease();
        }
        this.mInited = false;
    }

    public int setDetectParam(int i, int i2) {
        return nativeSetParam(i, i2);
    }

    public int init(Context context, String str) {
        return init(context, str, false);
    }
}
