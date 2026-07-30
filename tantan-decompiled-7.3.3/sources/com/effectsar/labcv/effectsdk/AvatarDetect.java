package com.effectsar.labcv.effectsdk;

import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class AvatarDetect {
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

    private native int nativeDetect(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, BefAvatarInfo befAvatarInfo);

    private native int nativeDetect(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, BefFaceInfo befFaceInfo, BefAvatarInfo befAvatarInfo);

    private native int nativeRelease();

    private native int nativeSetEscale(int i);

    private native int nativeSetModel(String str, int i, int i2);

    public BefAvatarInfo detect(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, EffectsSDKEffectConstants.Rotation rotation, BefFaceInfo befFaceInfo) {
        if (!this.mInited) {
            return null;
        }
        BefAvatarInfo befAvatarInfo = new BefAvatarInfo();
        int iNativeDetect = nativeDetect(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5890id, befFaceInfo, befAvatarInfo);
        if (iNativeDetect == 0) {
            return befAvatarInfo;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "native detect return " + iNativeDetect);
        return null;
    }

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

    public void release() {
        if (this.mInited) {
            nativeRelease();
        }
        this.mInited = false;
    }

    public int setEscale(int i) {
        return nativeSetEscale(i);
    }

    public int setModel(String str, int i, int i2) {
        return nativeSetModel(str, i, i2);
    }

    public int init(String str) {
        return init(str, false);
    }

    public BefAvatarInfo detect(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, EffectsSDKEffectConstants.Rotation rotation) {
        if (!this.mInited) {
            return null;
        }
        BefAvatarInfo befAvatarInfo = new BefAvatarInfo();
        int iNativeDetect = nativeDetect(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5890id, befAvatarInfo);
        if (iNativeDetect == 0) {
            return befAvatarInfo;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "native detect return " + iNativeDetect);
        return null;
    }
}
