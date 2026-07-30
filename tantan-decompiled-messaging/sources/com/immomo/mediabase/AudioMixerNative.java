package com.immomo.mediabase;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class AudioMixerNative {
    static {
        System.loadLibrary("mediabase");
    }

    public static int mixPcmData_Native(byte[] bArr, float f, byte[] bArr2, float f2, int i, ByteBuffer byteBuffer) {
        return nativeMixPcmData(bArr, f, bArr2, f2, i, byteBuffer.array());
    }

    public static int monoToStereo(byte[] bArr, int i, byte[] bArr2) {
        return nativeMonoToStereo(bArr, i, bArr2);
    }

    private static native int nativeMixPcmData(byte[] bArr, float f, byte[] bArr2, float f2, int i, byte[] bArr3);

    private static native int nativeMonoToStereo(byte[] bArr, int i, byte[] bArr2);

    private static native int nativeSetVolume(byte[] bArr, int i, float f, byte[] bArr2);

    private static native int nativeStereoToMono(byte[] bArr, int i, byte[] bArr2);

    public static int setVolume_Native(byte[] bArr, int i, float f, byte[] bArr2) {
        return nativeSetVolume(bArr, i, f, bArr2);
    }

    public static int stereoToMono(byte[] bArr, int i, byte[] bArr2) {
        return nativeStereoToMono(bArr, i, bArr2);
    }
}
