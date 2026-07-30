package com.immomo.moment.mediautils;

import java.nio.ByteBuffer;
import p153l.n7y;

/* JADX INFO: loaded from: classes7.dex */
public class AudioMixerNative extends n7y {
    public static int mixPcmData_Native(byte[] bArr, float f, byte[] bArr2, float f2, int i, ByteBuffer byteBuffer) {
        return nativeMixPcmData(bArr, f, bArr2, f2, i, byteBuffer.array());
    }

    private static native int nativeMixPcmData(byte[] bArr, float f, byte[] bArr2, float f2, int i, byte[] bArr3);

    private static native int nativeSetVolume(byte[] bArr, int i, float f, byte[] bArr2);

    public static int setVolume_Native(byte[] bArr, int i, float f, byte[] bArr2) {
        return nativeSetVolume(bArr, i, f, bArr2);
    }
}
