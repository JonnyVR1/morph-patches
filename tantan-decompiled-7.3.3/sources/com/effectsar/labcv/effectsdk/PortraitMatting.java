package com.effectsar.labcv.effectsdk;

import android.content.Context;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class PortraitMatting {
    private boolean inited = false;
    private long mNativePtr;

    public class MattingMask {
        private byte[] buffer;
        private int height;
        private int width;

        public MattingMask() {
        }

        public byte[] getBuffer() {
            return this.buffer;
        }

        public int getHeight() {
            return this.height;
        }

        public int getWidth() {
            return this.width;
        }

        public String toString() {
            return String.format("l: %d w:%d, h:%d", Integer.valueOf(this.buffer.length), Integer.valueOf(this.width), Integer.valueOf(this.height));
        }
    }

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeCheckLicense(Context context, String str, boolean z);

    private native int nativeCreateHandle();

    private native int nativeInit(String str, int i);

    private native int nativeMatting(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, boolean z, MattingMask mattingMask);

    private native int nativeRelease();

    private native int nativeSetParam(int i, int i2);

    public MattingMask detectMatting(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, EffectsSDKEffectConstants.Rotation rotation, boolean z) {
        MattingMask mattingMask = new MattingMask();
        int iNativeMatting = nativeMatting(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5890id, z, mattingMask);
        if (iNativeMatting == 0) {
            return mattingMask;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "nativeMatting return " + iNativeMatting);
        return null;
    }

    public int init(Context context, String str, EffectsSDKEffectConstants.PortraitMatting portraitMatting, String str2, boolean z) {
        if (this.inited) {
            return -1;
        }
        int iNativeCreateHandle = nativeCreateHandle();
        if (iNativeCreateHandle == 0) {
            iNativeCreateHandle = nativeCheckLicense(context, str2, z);
        }
        if (iNativeCreateHandle == 0) {
            iNativeCreateHandle = nativeInit(str, portraitMatting.getValue());
            setParam(EffectsSDKEffectConstants.PorraitMattingParamType.BEF_MP_EdgeMode, 1);
        }
        this.inited = iNativeCreateHandle == 0;
        return iNativeCreateHandle;
    }

    public boolean isInited() {
        return this.inited;
    }

    public void release() {
        if (this.inited) {
            nativeRelease();
        }
        this.inited = false;
    }

    public int setParam(EffectsSDKEffectConstants.PorraitMattingParamType porraitMattingParamType, int i) {
        return nativeSetParam(porraitMattingParamType.getValue(), i);
    }

    public int init(Context context, String str, EffectsSDKEffectConstants.PortraitMatting portraitMatting, String str2) {
        return init(context, str, portraitMatting, str2, false);
    }
}
