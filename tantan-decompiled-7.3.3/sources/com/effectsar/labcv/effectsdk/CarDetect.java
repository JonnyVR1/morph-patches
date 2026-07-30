package com.effectsar.labcv.effectsdk;

import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class CarDetect {
    static final String TAG = "CarDetect";
    private boolean inited;
    private long mNativePtr;

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            System.err.println("WARNING: Could not load library!");
            System.err.print(e);
        }
    }

    private native int nativeCheckLicense(String str, boolean z);

    private native int nativeCreateHandler();

    private native int nativeDetect(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, BefCarDetectInfo befCarDetectInfo);

    private native void nativeRelease();

    private native int nativeSetModel(long j, String str);

    private native int nativeSetParam(int i, float f);

    public int createHandle(String str, boolean z) {
        if (this.inited) {
            return 0;
        }
        if (nativeCreateHandler() != 0) {
            return -4;
        }
        int iNativeCheckLicense = nativeCheckLicense(str, z);
        if (iNativeCheckLicense != 0) {
            return iNativeCheckLicense;
        }
        this.inited = true;
        return iNativeCheckLicense;
    }

    public BefCarDetectInfo detect(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, EffectsSDKEffectConstants.Rotation rotation) {
        BefCarDetectInfo befCarDetectInfo = new BefCarDetectInfo();
        int iNativeDetect = nativeDetect(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5890id, befCarDetectInfo);
        if (iNativeDetect == 0) {
            return befCarDetectInfo;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "nativeDetect return " + iNativeDetect);
        return null;
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

    public int setModel(EffectsSDKEffectConstants.CarModelType carModelType, String str) {
        return nativeSetModel(carModelType.getValue(), str);
    }

    public int setParam(EffectsSDKEffectConstants.CarParamType carParamType, float f) {
        return nativeSetParam(carParamType.getValue(), f);
    }

    public int createHandle(String str) {
        return createHandle(str, false);
    }
}
