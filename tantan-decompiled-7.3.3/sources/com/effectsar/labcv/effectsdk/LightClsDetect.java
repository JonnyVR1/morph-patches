package com.effectsar.labcv.effectsdk;

import android.content.Context;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class LightClsDetect {
    private volatile boolean mInited = false;
    private long mNativePtr;

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeCheckLicense(Context context, String str, boolean z);

    private native int nativeCreateHandle(String str, int i);

    private native int nativeDetect(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, BefLightclsInfo befLightclsInfo);

    private native void nativeRelease();

    public BefLightclsInfo detectLightCls(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, EffectsSDKEffectConstants.Rotation rotation) {
        if (!this.mInited) {
            return null;
        }
        BefLightclsInfo befLightclsInfo = new BefLightclsInfo();
        int iNativeDetect = nativeDetect(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5890id, befLightclsInfo);
        if (iNativeDetect == 0) {
            return befLightclsInfo;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "nativeDetect return " + iNativeDetect);
        return null;
    }

    public int init(Context context, String str, String str2, int i, boolean z) {
        int iNativeCreateHandle = nativeCreateHandle(str, i);
        if (iNativeCreateHandle != 0) {
            this.mInited = false;
            return iNativeCreateHandle;
        }
        int iNativeCheckLicense = nativeCheckLicense(context, str2, z);
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

    public void setmInited(boolean z) {
        this.mInited = z;
    }

    public int init(Context context, String str, String str2, int i) {
        return init(context, str, str2, i, false);
    }
}
