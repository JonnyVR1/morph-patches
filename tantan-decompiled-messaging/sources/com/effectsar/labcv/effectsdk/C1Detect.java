package com.effectsar.labcv.effectsdk;

import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class C1Detect {
    private boolean mInited;
    private long mNativePtr;

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeCreate(int i, String str, String str2, boolean z);

    private native int nativeDetect(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, BefC1Info befC1Info);

    private native int nativeRelease();

    private native int nativeSetParam(int i, float f);

    public BefC1Info detect(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, EffectsSDKEffectConstants.Rotation rotation) {
        if (!this.mInited) {
            return null;
        }
        BefC1Info befC1Info = new BefC1Info();
        int iNativeDetect = nativeDetect(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5853id, befC1Info);
        if (iNativeDetect == 0) {
            return befC1Info;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "native detect return " + iNativeDetect);
        return null;
    }

    public int init(EffectsSDKEffectConstants.C1ModelType c1ModelType, String str, String str2, boolean z) {
        int iNativeCreate = nativeCreate(c1ModelType.getValue(), str, str2, z);
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

    public int setParam(EffectsSDKEffectConstants.C1ParamType c1ParamType, float f) {
        if (this.mInited) {
            return nativeSetParam(c1ParamType.getValue(), f);
        }
        return -1;
    }

    public int init(EffectsSDKEffectConstants.C1ModelType c1ModelType, String str, String str2) {
        return init(c1ModelType, str, str2, false);
    }
}
