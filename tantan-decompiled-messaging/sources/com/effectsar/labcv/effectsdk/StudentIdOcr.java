package com.effectsar.labcv.effectsdk;

import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class StudentIdOcr {
    private volatile boolean mInitialized = false;
    private long mNativePtr;

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeCheckLicense(String str);

    private native int nativeCreateHandle();

    private native int nativeDetect(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, BefStudentIdOcrInfo befStudentIdOcrInfo);

    private native int nativeRelease();

    private native int nativeSetModel(int i, String str);

    public BefStudentIdOcrInfo detect(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, EffectsSDKEffectConstants.Rotation rotation) {
        if (!this.mInitialized) {
            return null;
        }
        BefStudentIdOcrInfo befStudentIdOcrInfo = new BefStudentIdOcrInfo();
        int iNativeDetect = nativeDetect(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5853id, befStudentIdOcrInfo);
        if (iNativeDetect == 0) {
            return befStudentIdOcrInfo;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "native detect return " + iNativeDetect);
        return null;
    }

    public int init(String str) {
        int iNativeCreateHandle = nativeCreateHandle();
        if (iNativeCreateHandle != 0) {
            this.mInitialized = false;
            return iNativeCreateHandle;
        }
        int iNativeCheckLicense = nativeCheckLicense(str);
        if (iNativeCheckLicense != 0) {
            this.mInitialized = false;
            return iNativeCheckLicense;
        }
        this.mInitialized = true;
        return iNativeCheckLicense;
    }

    public boolean isInitialized() {
        return this.mInitialized;
    }

    public int release() {
        if (!this.mInitialized) {
            return 0;
        }
        this.mInitialized = false;
        return nativeRelease();
    }

    public int setModel(EffectsSDKEffectConstants.StudentIdOcrModelType studentIdOcrModelType, String str) {
        return nativeSetModel(studentIdOcrModelType.getValue(), str);
    }
}
