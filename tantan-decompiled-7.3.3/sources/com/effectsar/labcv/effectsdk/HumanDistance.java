package com.effectsar.labcv.effectsdk;

import android.content.Context;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class HumanDistance {
    private boolean inited = false;
    private long mNativeDistPtr;
    private long mNativeFaceAttrPtr;
    private long mNativeFacePtr;

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeCheckLicense(Context context, String str, boolean z);

    private native int nativeCreateHandle(String str, String str2);

    private native int nativeDetect(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, String str, boolean z, BefDistanceInfo befDistanceInfo);

    private native int nativeLoadModel(int i, String str);

    private native void nativeRelease();

    private native int nativeSetParam(int i, float f);

    public BefDistanceInfo detectDistance(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, String str, boolean z, EffectsSDKEffectConstants.Rotation rotation) {
        BefDistanceInfo befDistanceInfo = new BefDistanceInfo();
        int iNativeDetect = nativeDetect(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5890id, str, z, befDistanceInfo);
        if (iNativeDetect == 0) {
            return befDistanceInfo;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "nativeDetect return " + iNativeDetect);
        return null;
    }

    public int init(Context context, String str, String str2, String str3, String str4, boolean z) {
        if (this.inited) {
            return -1;
        }
        int iNativeCreateHandle = nativeCreateHandle(str, str2);
        if (iNativeCreateHandle != 0) {
            Log.e(EffectsSDKEffectConstants.TAG, "nativeCreateHandle fail!! return " + iNativeCreateHandle);
            return iNativeCreateHandle;
        }
        int iNativeCheckLicense = nativeCheckLicense(context, str4, z);
        if (iNativeCheckLicense != 0) {
            Log.e(EffectsSDKEffectConstants.TAG, "nativeCheckLicense fail!! return " + iNativeCheckLicense);
            return iNativeCheckLicense;
        }
        int iNativeLoadModel = nativeLoadModel(EffectsSDKEffectConstants.HumanDistanceModelType.BEF_HUMAN_DISTANCE_MODEL1.getValue(), str3);
        if (iNativeLoadModel == 0) {
            this.inited = iNativeLoadModel == 0;
            return iNativeLoadModel;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "nativeLoadModel fail!! return " + iNativeLoadModel);
        return iNativeLoadModel;
    }

    public boolean isInited() {
        return this.inited;
    }

    public void release() {
        if (this.inited) {
            nativeRelease();
        }
        this.inited = false;
    }

    public int setParam(int i, float f) {
        if (!this.inited) {
            return -1;
        }
        int iNativeSetParam = nativeSetParam(i, f);
        if (iNativeSetParam != 0) {
            Log.e(EffectsSDKEffectConstants.TAG, "nativeSetParam return " + iNativeSetParam);
        }
        return iNativeSetParam;
    }

    public int init(Context context, String str, String str2, String str3, String str4) {
        return init(context, str, str2, str3, str4, false);
    }
}
