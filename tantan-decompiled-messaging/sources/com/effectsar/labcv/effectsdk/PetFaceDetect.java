package com.effectsar.labcv.effectsdk;

import android.content.Context;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class PetFaceDetect {
    public static final int MAX_PET_FACE_NUM = 10;
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

    private native int nativeCreateHandle(String str, long j, int i);

    private native int nativeDetect(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, BefPetFaceInfo befPetFaceInfo);

    private native void nativeRelease();

    public BefPetFaceInfo detectFace(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, EffectsSDKEffectConstants.Rotation rotation) {
        if (!this.mInited) {
            return null;
        }
        BefPetFaceInfo befPetFaceInfo = new BefPetFaceInfo();
        int iNativeDetect = nativeDetect(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5853id, befPetFaceInfo);
        if (iNativeDetect == 0) {
            return befPetFaceInfo;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "nativeDetect return " + iNativeDetect);
        return null;
    }

    public int init(Context context, String str, int i, String str2, boolean z) {
        int iNativeCreateHandle = nativeCreateHandle(str, i, 10);
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

    public int init(Context context, String str, int i, String str2) {
        return init(context, str, i, str2, false);
    }
}
