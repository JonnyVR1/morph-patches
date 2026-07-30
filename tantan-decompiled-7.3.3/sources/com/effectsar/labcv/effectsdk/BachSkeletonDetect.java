package com.effectsar.labcv.effectsdk;

import android.content.Context;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class BachSkeletonDetect {
    private final int MaxSkeletonNum = 2;
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

    private native int nativeDetect(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, BefBachSkeletonInfo befBachSkeletonInfo);

    private native int nativeRelease();

    private native int nativeSetParamI(int i, int i2);

    public BefBachSkeletonInfo detect(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, EffectsSDKEffectConstants.Rotation rotation) {
        if (!this.mInited) {
            return null;
        }
        BefBachSkeletonInfo befBachSkeletonInfo = new BefBachSkeletonInfo();
        int iNativeDetect = nativeDetect(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5890id, befBachSkeletonInfo);
        if (iNativeDetect == 0) {
            return befBachSkeletonInfo;
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

    public int setParamI(EffectsSDKEffectConstants.BachSkeletonParamType bachSkeletonParamType, int i) {
        if (this.mInited) {
            return nativeSetParamI(bachSkeletonParamType.getValue(), i);
        }
        return -1;
    }
}
