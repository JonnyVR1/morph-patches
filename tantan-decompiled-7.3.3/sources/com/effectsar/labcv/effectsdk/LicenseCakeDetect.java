package com.effectsar.labcv.effectsdk;

import android.content.Context;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class LicenseCakeDetect {
    private final int MaxGestureNum = 10;
    private boolean mInited;
    private long mNativePtr;

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeCreate(Context context, String str, String str2, boolean z);

    private native int nativeDetect(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, BefLicenseCakeInfo befLicenseCakeInfo);

    private native int nativeRelease();

    private native int nativeSetParamF(int i, float f);

    private native int nativeSetParamI(int i, int i2);

    private native int nativeSetParamS(int i, String str);

    public BefLicenseCakeInfo detect(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, EffectsSDKEffectConstants.Rotation rotation) {
        if (!this.mInited) {
            return null;
        }
        BefLicenseCakeInfo befLicenseCakeInfo = new BefLicenseCakeInfo();
        int iNativeDetect = nativeDetect(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5890id, befLicenseCakeInfo);
        if (iNativeDetect == 0) {
            return befLicenseCakeInfo;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "native detect return " + iNativeDetect);
        return null;
    }

    public int init(Context context, String str, String str2, boolean z) {
        int iNativeCreate = nativeCreate(context, str, str2, z);
        this.mInited = iNativeCreate == 0;
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

    public int setParamF(EffectsSDKEffectConstants.LicenseCakeParamType licenseCakeParamType, float f) {
        if (this.mInited) {
            return nativeSetParamF(licenseCakeParamType.getValue(), f);
        }
        return -1;
    }

    public int setParamI(EffectsSDKEffectConstants.LicenseCakeParamType licenseCakeParamType, int i) {
        if (this.mInited) {
            return nativeSetParamI(licenseCakeParamType.getValue(), i);
        }
        return -1;
    }

    public int setParamS(EffectsSDKEffectConstants.LicenseCakeParamType licenseCakeParamType, String str) {
        if (this.mInited) {
            return nativeSetParamS(licenseCakeParamType.getValue(), str);
        }
        return -1;
    }
}
