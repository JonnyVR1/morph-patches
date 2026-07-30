package com.effectsar.labcv.effectsdk;

import android.content.Context;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class SkeletonDetect {
    private long mNativePtr;
    private volatile boolean mInited = false;
    private final int MaxSkeletonNum = 1;

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeCheckLicense(Context context, String str, boolean z);

    private native int nativeDetect(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, BefSkeletonInfo befSkeletonInfo);

    private native int nativeDetectImageMode(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, BefSkeletonInfo befSkeletonInfo);

    private native int nativeInit(String str);

    private native void nativeRelease();

    private native int nativeSetDetectionInput(int i, int i2);

    private native int nativeSetTrackingInput(int i, int i2);

    private native int nativeTargetNum(int i);

    public BefSkeletonInfo detectSkeleton(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, EffectsSDKEffectConstants.Rotation rotation) {
        if (!this.mInited) {
            return null;
        }
        BefSkeletonInfo befSkeletonInfo = new BefSkeletonInfo();
        int iNativeDetect = nativeDetect(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5890id, befSkeletonInfo);
        if (iNativeDetect == 0) {
            return befSkeletonInfo;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "nativeDetect return " + iNativeDetect);
        return null;
    }

    public BefSkeletonInfo detectSkeletonImageMode(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, EffectsSDKEffectConstants.Rotation rotation) {
        if (!this.mInited) {
            return null;
        }
        BefSkeletonInfo befSkeletonInfo = new BefSkeletonInfo();
        int iNativeDetectImageMode = nativeDetectImageMode(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5890id, befSkeletonInfo);
        if (iNativeDetectImageMode == 0) {
            return befSkeletonInfo;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "nativeDetect return " + iNativeDetectImageMode);
        return null;
    }

    public int init(Context context, String str, String str2, boolean z) {
        int iNativeInit = nativeInit(str);
        if (iNativeInit != 0) {
            this.mInited = false;
            return iNativeInit;
        }
        if (iNativeInit != 0) {
            this.mInited = false;
        }
        int iNativeCheckLicense = nativeCheckLicense(context, str2, z);
        if (iNativeCheckLicense != 0) {
            this.mInited = false;
            return iNativeCheckLicense;
        }
        int iNativeTargetNum = nativeTargetNum(1);
        if (iNativeTargetNum != 0) {
            this.mInited = false;
            return iNativeTargetNum;
        }
        this.mInited = true;
        return iNativeTargetNum;
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

    public int setDetectionInput(int i, int i2) {
        return nativeSetDetectionInput(i, i2);
    }

    public int setTargetNum(int i) {
        return nativeTargetNum(i);
    }

    public int setTrackingInput(int i, int i2) {
        return nativeSetTrackingInput(i, i2);
    }

    public int init(Context context, String str, String str2) {
        return init(context, str, str2, false);
    }
}
