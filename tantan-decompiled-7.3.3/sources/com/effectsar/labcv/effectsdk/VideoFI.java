package com.effectsar.labcv.effectsdk;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class VideoFI {
    private ByteBuffer buffer;
    private int bufferHeight;
    private int bufferWidth;
    private boolean mInited = false;
    private long mNativePtr;
    private String mRwDir;

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeCheckLicense(String str, boolean z);

    private native int nativeCreate(String str, int i, int i2, int i3, int i4);

    private native void nativeDestroy();

    private native int nativeProcessTexture(int i, int i2, int i3, int i4, int i5, float f, float f2, float f3);

    public int checkLicense(String str, boolean z) {
        int iNativeCheckLicense = nativeCheckLicense(str, z);
        if (iNativeCheckLicense == 0) {
            this.mInited = true;
            return iNativeCheckLicense;
        }
        this.mInited = false;
        return iNativeCheckLicense;
    }

    public int create(String str, EffectsSDKEffectConstants.ImageQualityVfiType imageQualityVfiType, EffectsSDKEffectConstants.ImageQualityVfiDataType imageQualityVfiDataType, int i, EffectsSDKEffectConstants.ImageQulityPowerLevel imageQulityPowerLevel) {
        if (nativeCreate(str, imageQualityVfiDataType.getValue(), imageQualityVfiType.getValue(), imageQulityPowerLevel.getLevel(), i) != 0) {
            return 0;
        }
        this.mInited = true;
        return 0;
    }

    public void destroy() {
        nativeDestroy();
    }

    public int processTexture(int i, int i2, int i3, int i4, int i5, float f, float f2, float f3) {
        return nativeProcessTexture(i, i2, i3, i4, i5, f, f2, f3);
    }
}
