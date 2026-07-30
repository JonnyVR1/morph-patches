package com.effectsar.labcv.effectsdk;

import android.content.Context;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class FaceVerify {
    public static final Double SAME_FACE_SCORE = Double.valueOf(67.6d);
    private volatile boolean mInited = false;
    private long mNativeFacePtr;
    private long mNativeVerifyPtr;

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeCheckLicense(Context context, String str, boolean z);

    private native int nativeCreateHandle(String str, String str2, int i);

    private native double nativeDistanceToScore(double d);

    private native int nativeExtractFeature(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, BefFaceFeature befFaceFeature);

    private native int nativeExtractFeatureSingle(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, BefFaceFeature befFaceFeature);

    private native void nativeRelease();

    private native double nativeVerify(float[] fArr, float[] fArr2);

    public double distToScore(double d) {
        return nativeDistanceToScore(d);
    }

    public BefFaceFeature extractFeature(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, EffectsSDKEffectConstants.Rotation rotation) {
        if (!this.mInited) {
            return null;
        }
        BefFaceFeature befFaceFeature = new BefFaceFeature();
        int iNativeExtractFeature = nativeExtractFeature(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5853id, befFaceFeature);
        if (iNativeExtractFeature == 0) {
            return befFaceFeature;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "nativeVerifyFace return " + iNativeExtractFeature);
        return null;
    }

    public BefFaceFeature extractFeatureSingle(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, EffectsSDKEffectConstants.Rotation rotation) {
        if (!this.mInited) {
            return null;
        }
        BefFaceFeature befFaceFeature = new BefFaceFeature();
        int iNativeExtractFeatureSingle = nativeExtractFeatureSingle(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5853id, befFaceFeature);
        if (iNativeExtractFeatureSingle == 0) {
            return befFaceFeature;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "nativeVerifyFace return " + iNativeExtractFeatureSingle);
        return null;
    }

    public int init(Context context, String str, String str2, int i, String str3, boolean z) {
        if (this.mInited) {
            return 0;
        }
        int iNativeCreateHandle = nativeCreateHandle(str, str2, i);
        if (iNativeCreateHandle != 0) {
            this.mInited = false;
            return iNativeCreateHandle;
        }
        int iNativeCheckLicense = nativeCheckLicense(context, str3, z);
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

    public double verify(float[] fArr, float[] fArr2) {
        return nativeVerify(fArr, fArr2);
    }

    public int init(Context context, String str, String str2, int i, String str3) {
        return init(context, str, str2, i, str3, false);
    }
}
