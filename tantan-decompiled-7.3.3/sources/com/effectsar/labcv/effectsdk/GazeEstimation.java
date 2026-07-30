package com.effectsar.labcv.effectsdk;

import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class GazeEstimation {
    private boolean mInited;
    private long mNativePtr;

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeCreate(String str, boolean z);

    private native int nativeDetect(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, BefFaceInfo befFaceInfo, float f, BefGazeEstimationInfo befGazeEstimationInfo);

    private native int nativeRelease();

    private native int nativeSetModel(int i, String str);

    private native int nativeSetParam(int i, float f);

    public BefGazeEstimationInfo detect(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, EffectsSDKEffectConstants.Rotation rotation, BefFaceInfo befFaceInfo, float f) {
        if (!this.mInited) {
            return null;
        }
        BefGazeEstimationInfo befGazeEstimationInfo = new BefGazeEstimationInfo();
        int iNativeDetect = nativeDetect(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5890id, befFaceInfo, f, befGazeEstimationInfo);
        if (iNativeDetect == 0) {
            return befGazeEstimationInfo;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "native detect return " + iNativeDetect);
        return null;
    }

    public int init(String str, boolean z) {
        int iNativeCreate = nativeCreate(str, z);
        if (iNativeCreate != 0) {
            this.mInited = false;
            return iNativeCreate;
        }
        this.mInited = true;
        return iNativeCreate;
    }

    public boolean isInited() {
        return this.mInited;
    }

    public void release() {
        if (this.mInited) {
            nativeRelease();
        }
        this.mInited = false;
    }

    public int setModel(EffectsSDKEffectConstants.GazeEstimationModelType gazeEstimationModelType, String str) {
        return nativeSetModel(gazeEstimationModelType.getValue(), str);
    }

    public int setParam(EffectsSDKEffectConstants.GazeEstimationParamType gazeEstimationParamType, float f) {
        return nativeSetParam(gazeEstimationParamType.getValue(), f);
    }

    public int init(String str) {
        return init(str, false);
    }
}
