package com.effectsar.labcv.effectsdk;

import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class SaliencyMatting {
    private static String TAG;
    private long mHandle;

    public static class MattingMask {
        private byte[] buffer;
        private int height;
        private int width;

        public byte[] getBuffer() {
            return this.buffer;
        }

        public int getHeight() {
            return this.height;
        }

        public int getWidth() {
            return this.width;
        }

        public void setBuffer(byte[] bArr) {
            this.buffer = bArr;
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
        TAG = "SaliencyMattingJNI";
    }

    private native int nativeCheckOfflineLicense(String str);

    private native int nativeCheckOnlineLicense(String str);

    private native int nativeCreateHandle();

    private native int nativeMatting(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, MattingMask mattingMask);

    private native int nativeRelease();

    private native int nativeSetModel(String str, int i);

    public int checkOfflineLicense(String str) {
        return nativeCheckOfflineLicense(str);
    }

    public int checkOnlineLicense(String str) {
        return nativeCheckOnlineLicense(str);
    }

    public int init() {
        return nativeCreateHandle();
    }

    public MattingMask process(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, EffectsSDKEffectConstants.Rotation rotation) {
        MattingMask mattingMask = new MattingMask();
        int iNativeMatting = nativeMatting(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5853id, mattingMask);
        if (iNativeMatting != 0) {
            Log.e(TAG, String.format("process: native process failed, code: %d", Integer.valueOf(iNativeMatting)));
        }
        return mattingMask;
    }

    public int release() {
        if (this.mHandle == 0) {
            return 0;
        }
        int iNativeRelease = nativeRelease();
        this.mHandle = 0L;
        return iNativeRelease;
    }

    public int setModel(String str, EffectsSDKEffectConstants.SaliencyMattingModelType saliencyMattingModelType) {
        return nativeSetModel(str, saliencyMattingModelType.getValue());
    }
}
