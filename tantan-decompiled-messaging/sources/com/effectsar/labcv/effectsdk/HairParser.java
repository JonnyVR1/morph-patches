package com.effectsar.labcv.effectsdk;

import android.content.Context;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class HairParser {
    private boolean inited = false;
    private long mNativePtr;

    public class HairMask {
        private byte[] buffer;
        private int channel;
        private int height;
        private int width;

        public HairMask() {
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

    private native int nativeGetShape(int[] iArr);

    private native int nativeInit(String str);

    private native int nativeParse(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, boolean z, byte[] bArr);

    private native int nativeRelease();

    private native int nativeSetParam(int i, int i2, boolean z, boolean z2);

    public int init(Context context, String str, String str2, boolean z) {
        if (this.inited) {
            return -1;
        }
        int iNativeCreateHandle = nativeCreateHandle();
        if (iNativeCreateHandle == 0) {
            iNativeCreateHandle = nativeCheckLicense(context, str2, z);
        }
        if (iNativeCreateHandle == 0) {
            iNativeCreateHandle = nativeInit(str);
        }
        this.inited = iNativeCreateHandle == 0;
        return iNativeCreateHandle;
    }

    public boolean isInited() {
        return this.inited;
    }

    public HairMask parseHair(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, EffectsSDKEffectConstants.Rotation rotation, boolean z) {
        HairMask hairMask = new HairMask();
        int[] iArr = new int[3];
        int iNativeGetShape = nativeGetShape(iArr);
        if (iNativeGetShape != 0) {
            Log.e(EffectsSDKEffectConstants.TAG, "nativeDetect return " + iNativeGetShape);
            return null;
        }
        hairMask.width = iArr[0];
        hairMask.height = iArr[1];
        hairMask.channel = iArr[2];
        hairMask.buffer = new byte[hairMask.width * hairMask.height * hairMask.channel];
        Arrays.fill(hairMask.buffer, (byte) 0);
        int iNativeParse = nativeParse(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5853id, z, hairMask.buffer);
        if (iNativeParse == 0) {
            return hairMask;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "nativeDetect return " + iNativeParse);
        return null;
    }

    public void release() {
        if (this.inited) {
            nativeRelease();
        }
        this.inited = false;
    }

    public int setParam(int i, int i2, boolean z, boolean z2) {
        return nativeSetParam(i, i2, z, z2);
    }

    public int init(Context context, String str, String str2) {
        return init(context, str, str2, false);
    }
}
