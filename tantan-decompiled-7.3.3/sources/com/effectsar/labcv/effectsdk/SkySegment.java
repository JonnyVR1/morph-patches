package com.effectsar.labcv.effectsdk;

import android.content.Context;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class SkySegment {
    private long mNativePtr;
    private boolean inited = false;
    private boolean hasSky = false;

    public class SkyMask {
        private byte[] buffer;
        private int channel;
        private int height;
        private int width;

        public SkyMask() {
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

    private native int nativeDetect(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, byte[] bArr);

    private native int nativeGetShape(int[] iArr);

    private native int nativeInit(String str);

    private native void nativeRelease();

    private native int nativeSetParam(int i, int i2);

    public BefSkyInfo detectSky(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, EffectsSDKEffectConstants.Rotation rotation, boolean z, boolean z2) {
        if (!this.inited) {
            return null;
        }
        BefSkyInfo befSkyInfo = new BefSkyInfo();
        SkyMask skyMask = new SkyMask();
        int[] iArr = new int[3];
        int iNativeGetShape = nativeGetShape(iArr);
        if (iNativeGetShape != 0) {
            Log.e(EffectsSDKEffectConstants.TAG, "nativeDetect return " + iNativeGetShape);
            return null;
        }
        skyMask.width = iArr[0];
        skyMask.height = iArr[1];
        skyMask.channel = iArr[2];
        skyMask.buffer = new byte[skyMask.width * skyMask.height * skyMask.channel];
        Arrays.fill(skyMask.buffer, (byte) 0);
        int iNativeDetect = nativeDetect(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5890id, z, z2, skyMask.buffer);
        if (iNativeDetect == 0) {
            befSkyInfo.setSkyMask(skyMask);
            befSkyInfo.setHasSky(this.hasSky);
            return befSkyInfo;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "nativeDetect return " + iNativeDetect);
        return null;
    }

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

    public void release() {
        if (this.inited) {
            nativeRelease();
        }
        this.inited = false;
    }

    public int setParam(int i, int i2) {
        return nativeSetParam(i, i2);
    }

    public int init(Context context, String str, String str2) {
        return init(context, str, str2, false);
    }
}
