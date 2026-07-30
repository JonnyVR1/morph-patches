package com.effectsar.labcv.effectsdk;

import android.content.Context;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class HandDetect {
    static final String TAG = "HandDetect";
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

    private native int nativeCheckLicense(Context context, String str, boolean z);

    private native int nativeCreateHandler();

    private native int nativeDetect(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, long j, BefHandInfo befHandInfo, int i6);

    private native void nativeRelease();

    private native int nativeSetModel(long j, String str);

    private native int nativeSetParam(int i, float f);

    public int createHandle(Context context, String str, boolean z) {
        if (this.inited) {
            return 0;
        }
        if (nativeCreateHandler() != 0) {
            return -4;
        }
        int iNativeCheckLicense = nativeCheckLicense(context, str, z);
        if (iNativeCheckLicense != 0) {
            return iNativeCheckLicense;
        }
        this.inited = true;
        return iNativeCheckLicense;
    }

    public BefHandInfo detectHand(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, EffectsSDKEffectConstants.Rotation rotation, int i4, int i5) {
        BefHandInfo befHandInfo = new BefHandInfo();
        int iNativeDetect = nativeDetect(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5853id, i4, befHandInfo, i5);
        if (iNativeDetect == 0) {
            return befHandInfo;
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

    public int setModel(EffectsSDKEffectConstants.HandModelType handModelType, String str) {
        return nativeSetModel(handModelType.getValue(), str);
    }

    public int setParam(EffectsSDKEffectConstants.HandParamType handParamType, float f) {
        return nativeSetParam(handParamType.getValue(), f);
    }

    public int createHandle(Context context, String str) {
        return createHandle(context, str, false);
    }
}
