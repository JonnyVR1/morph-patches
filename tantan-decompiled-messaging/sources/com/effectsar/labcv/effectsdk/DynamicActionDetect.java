package com.effectsar.labcv.effectsdk;

import android.content.Context;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class DynamicActionDetect {
    private boolean mInited;
    private long mNativePtr;

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeCheckLicense(Context context, String str, boolean z);

    private native int nativeCreateHandle(int i);

    private native int nativeDetect(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, long j, int i6, BefDynamicActionInfo befDynamicActionInfo);

    private native int nativeRelease();

    private native int nativeSetModel(int i, String str);

    private native int nativeSetParam(int i, float f);

    public BefDynamicActionInfo detectDynamicAction(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, EffectsSDKEffectConstants.Rotation rotation, long j, int i4) {
        if (!this.mInited) {
            return null;
        }
        BefDynamicActionInfo befDynamicActionInfo = new BefDynamicActionInfo();
        int iNativeDetect = nativeDetect(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5853id, j, i4, befDynamicActionInfo);
        if (iNativeDetect == 0) {
            return befDynamicActionInfo;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "nativeDetect return " + iNativeDetect);
        return null;
    }

    public int init(Context context, int i, String str, boolean z) {
        int iNativeCreateHandle = nativeCreateHandle(i);
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

    public boolean isInited() {
        return this.mInited;
    }

    public void release() {
        if (this.mInited) {
            nativeRelease();
        }
        this.mInited = false;
    }

    public int setModel(EffectsSDKEffectConstants.DynamicActionModelType dynamicActionModelType, String str) {
        if (this.mInited) {
            return nativeSetModel(dynamicActionModelType.getValue(), str);
        }
        return -1;
    }

    public int setParam(EffectsSDKEffectConstants.DynamicActionParamType dynamicActionParamType, float f) {
        if (this.mInited) {
            return nativeSetParam(dynamicActionParamType.getValue(), f);
        }
        return -1;
    }
}
