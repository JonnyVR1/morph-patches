package com.effectsar.labcv.effectsdk;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class NightScene {
    private boolean mInited;
    private long mNativePtr;

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeCreate(String str, boolean z);

    private native int nativeProcess(int i, Integer num, int i2, int i3);

    private native int nativeRelease();

    public int init(String str, boolean z) {
        int iNativeCreate = nativeCreate(str, z);
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

    public int process(int i, Integer num, int i2, int i3) {
        if (!this.mInited) {
            return -1;
        }
        int iNativeProcess = nativeProcess(i, num, i2, i3);
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

    public int init(String str) {
        return init(str, false);
    }
}
