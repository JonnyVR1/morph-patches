package com.effectsar.labcv.effectsdk;

import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class VideoClsDetect {
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

    private native int nativeDetect(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, boolean z, BefVideoClsInfo befVideoClsInfo);

    private native int nativeRelease();

    private native int nativeSetParam(int i, float f);

    public BefVideoClsInfo detect(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, boolean z, EffectsSDKEffectConstants.Rotation rotation) {
        if (!this.mInited) {
            return null;
        }
        BefVideoClsInfo befVideoClsInfo = new BefVideoClsInfo();
        int iNativeDetect = nativeDetect(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5853id, z, befVideoClsInfo);
        if (iNativeDetect == 0) {
            return befVideoClsInfo;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "native detect return " + iNativeDetect);
        return null;
    }

    public int init(EffectsSDKEffectConstants.VideoClsModelType videoClsModelType, String str, String str2, boolean z) {
        int iNativeCreate = nativeCreate(videoClsModelType.getValue(), str, str2, z);
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

    public int setParam(EffectsSDKEffectConstants.VideoClsParamType videoClsParamType, float f) {
        if (this.mInited) {
            return nativeSetParam(videoClsParamType.getValue(), f);
        }
        return -1;
    }

    public int init(EffectsSDKEffectConstants.VideoClsModelType videoClsModelType, String str, String str2) {
        return init(videoClsModelType, str, str2, false);
    }
}
