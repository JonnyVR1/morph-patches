package com.effectsar.labcv.effectsdk;

import android.content.Context;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ActionRecognition {
    private boolean mInited;
    private long mNativePtr;

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nDestroy();

    private native int nDetect(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, int i6, BefActionRecognitionInfo befActionRecognitionInfo);

    private native int nDetectPose(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, int i6, BefActionRecognitionInfo.PoseDetectResult poseDetectResult);

    private native int nInit(Context context, String str, String str2, boolean z);

    private native int nSetTemplate(String str);

    private native int nSetTemplateThreshold(float f);

    public void destroy() {
        if (this.mInited) {
            nDestroy();
        }
        this.mInited = false;
    }

    public BefActionRecognitionInfo detect(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, EffectsSDKEffectConstants.Rotation rotation, int i4) {
        if (!this.mInited) {
            return null;
        }
        BefActionRecognitionInfo befActionRecognitionInfo = new BefActionRecognitionInfo();
        if (nDetect(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5890id, i4, befActionRecognitionInfo) != 0) {
            return null;
        }
        return befActionRecognitionInfo;
    }

    public BefActionRecognitionInfo.PoseDetectResult detectPose(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, BefActionRecognitionInfo.ActionRecognitionPoseType actionRecognitionPoseType, EffectsSDKEffectConstants.Rotation rotation) {
        if (!this.mInited) {
            return null;
        }
        BefActionRecognitionInfo.PoseDetectResult poseDetectResult = new BefActionRecognitionInfo.PoseDetectResult();
        if (nDetectPose(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5890id, actionRecognitionPoseType.f5849id, poseDetectResult) != 0) {
            return null;
        }
        return poseDetectResult;
    }

    public int init(Context context, String str, String str2, boolean z) {
        int iNInit = nInit(context, str, str2, z);
        if (iNInit != 0) {
            this.mInited = false;
            return iNInit;
        }
        this.mInited = true;
        return iNInit;
    }

    public int setTemplate(String str) {
        if (this.mInited) {
            return nSetTemplate(str);
        }
        return -1;
    }

    public int setThreshold(float f) {
        if (this.mInited) {
            return nSetTemplateThreshold(f);
        }
        return -1;
    }

    public int init(Context context, String str, String str2) {
        return init(context, str, str2, false);
    }
}
