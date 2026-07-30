package com.effectsar.labcv.effectsdk;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class VideoSR {
    private boolean mInited;
    private int mMaxHeight;
    private int mMaxWidth;
    private long mNativePtr;
    private int mPowerLevel;
    private String mRwDir;

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeCreate(String str, String str2, int i, int i2, int i3, boolean z, boolean z2, int i4);

    private native int nativeProcess(int i, int i2, int i3, BefVideoSRInfo befVideoSRInfo);

    private native int nativeRelease();

    public int getmMaxHeight() {
        return this.mMaxHeight;
    }

    public int getmMaxWidth() {
        return this.mMaxWidth;
    }

    public int getmPowerLevel() {
        return this.mPowerLevel;
    }

    public int init(String str, String str2, int i, int i2, EffectsSDKEffectConstants.ImageQulityPowerLevel imageQulityPowerLevel, boolean z, boolean z2, EffectsSDKEffectConstants.LensVideoAlgType lensVideoAlgType) {
        this.mRwDir = str2;
        this.mMaxHeight = i;
        this.mMaxWidth = i2;
        this.mPowerLevel = imageQulityPowerLevel.getLevel();
        int iNativeCreate = nativeCreate(str, this.mRwDir, this.mMaxHeight, this.mMaxWidth, imageQulityPowerLevel.getLevel(), z, z2, lensVideoAlgType.getValue());
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

    public BefVideoSRInfo process(int i, int i2, int i3) {
        if (!this.mInited) {
            return null;
        }
        BefVideoSRInfo befVideoSRInfo = new BefVideoSRInfo();
        int iNativeProcess = nativeProcess(i, i2, i3, befVideoSRInfo);
        if (iNativeProcess == 0) {
            return befVideoSRInfo;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "nativeVideoSrProcess " + iNativeProcess);
        return null;
    }

    public void release() {
        if (this.mInited) {
            nativeRelease();
        }
        this.mInited = false;
    }

    public void setmMaxHeight(int i) {
        this.mMaxHeight = i;
    }

    public void setmMaxWidth(int i) {
        this.mMaxWidth = i;
    }

    public void setmPowerLevel(int i) {
        this.mPowerLevel = i;
    }

    public int init(String str, String str2, int i, int i2, EffectsSDKEffectConstants.ImageQulityPowerLevel imageQulityPowerLevel, boolean z, EffectsSDKEffectConstants.LensVideoAlgType lensVideoAlgType) {
        return init(str, str2, i, i2, imageQulityPowerLevel, false, z, lensVideoAlgType);
    }
}
