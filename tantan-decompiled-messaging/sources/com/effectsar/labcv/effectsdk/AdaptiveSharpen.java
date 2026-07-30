package com.effectsar.labcv.effectsdk;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class AdaptiveSharpen {
    private float mAmount;
    private int mDiffImgSmoothEnable;
    private float mEdgeWeightGamma;
    private boolean mInited;
    private int mMaxHeight;
    private int mMaxWidth;
    private long mNativePtr;
    private float mOverRatio;
    private int mPowerLevel;
    private int mSceneMode;
    private int mFrameWidth = 0;
    private int mFrameHeight = 0;

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeCreate(String str, int i, int i2, int i3, int i4, float f, float f2, float f3, int i5, boolean z);

    private native int nativeProcess(int i, BefTextureResultInfo befTextureResultInfo);

    private native int nativeRelease();

    private native int nativeSetProperty(int i, int i2, int i3, int i4, float f, float f2, float f3, int i5);

    public float getmAmount() {
        return this.mAmount;
    }

    public int getmDiffImgSmoothEnable() {
        return this.mDiffImgSmoothEnable;
    }

    public float getmEdgeWeightGamma() {
        return this.mEdgeWeightGamma;
    }

    public int getmMaxHeight() {
        return this.mMaxHeight;
    }

    public int getmMaxWidth() {
        return this.mMaxWidth;
    }

    public float getmOverRatio() {
        return this.mOverRatio;
    }

    public int getmPowerLevel() {
        return this.mPowerLevel;
    }

    public int getmSceneMode() {
        return this.mSceneMode;
    }

    public int init(String str, int i, int i2, int i3, int i4, float f, float f2, float f3, int i5, boolean z) {
        this.mMaxHeight = i;
        this.mMaxWidth = i2;
        this.mSceneMode = i3;
        this.mPowerLevel = i4;
        this.mAmount = f;
        this.mOverRatio = f2;
        this.mEdgeWeightGamma = f3;
        this.mDiffImgSmoothEnable = i5;
        int iNativeCreate = nativeCreate(str, i3, i4, i2, i, f, f2, f3, i5, z);
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

    public int process(int i, BefTextureResultInfo befTextureResultInfo) {
        if (!this.mInited) {
            return -1;
        }
        int iNativeProcess = nativeProcess(i, befTextureResultInfo);
        if (iNativeProcess != 0) {
            Log.e(EffectsSDKEffectConstants.TAG, "nativeNightSceneProcess " + iNativeProcess);
        }
        return iNativeProcess;
    }

    public void release() {
        if (this.mInited) {
            nativeRelease();
        }
        this.mInited = false;
    }

    public int setProperty(int i, int i2, int i3, int i4, float f, float f2, float f3, int i5) {
        if (!this.mInited) {
            return -1;
        }
        int iNativeSetProperty = nativeSetProperty(i, i2, i3, i4, f, f2, f3, i5);
        if (iNativeSetProperty != 0) {
            Log.e(EffectsSDKEffectConstants.TAG, "nativeSetProperty " + iNativeSetProperty);
            return iNativeSetProperty;
        }
        this.mFrameHeight = i4;
        this.mFrameWidth = i3;
        this.mSceneMode = i;
        this.mPowerLevel = i2;
        this.mAmount = f;
        this.mOverRatio = f2;
        this.mEdgeWeightGamma = f3;
        this.mDiffImgSmoothEnable = i5;
        return iNativeSetProperty;
    }

    public void setmAmount(float f) {
        this.mAmount = f;
    }

    public void setmDiffImgSmoothEnable(int i) {
        this.mDiffImgSmoothEnable = i;
    }

    public void setmEdgeWeightGamma(float f) {
        this.mEdgeWeightGamma = f;
    }

    public void setmMaxHeight(int i) {
        this.mMaxHeight = i;
    }

    public void setmMaxWidth(int i) {
        this.mMaxWidth = i;
    }

    public void setmOverRatio(float f) {
        this.mOverRatio = f;
    }

    public void setmPowerLevel(int i) {
        this.mPowerLevel = i;
    }

    public void setmSceneMode(int i) {
        this.mSceneMode = i;
    }

    public int init(String str, int i, int i2, int i3, int i4, float f, float f2, float f3, int i5) {
        return init(str, i, i2, i3, i4, f, f2, f3, i5, false);
    }
}
