package com.core.glcore.yuvutil;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class YuvTools {
    static {
        System.loadLibrary("yuvutils");
        System.loadLibrary("yuvtools");
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m7383a(byte[] bArr, int i, int i2, byte[] bArr2) {
        return nativeRGBA2NV21(bArr, i, i2, bArr2);
    }

    private static native boolean nativeARGBToNV21ByArray(int[] iArr, int i, int i2, byte[] bArr);

    private static native byte[] nativeArgb2Nv21(int[] iArr, int i, int i2);

    private static native byte[] nativeCovertYUV420888ToNV21(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4, ByteBuffer byteBuffer3, int i5, int i6, int i7, int i8, byte[] bArr);

    private static native byte[] nativeNV21toARGB(byte[] bArr, int i, int i2);

    private static native boolean nativeNV21toARGBByArray(byte[] bArr, int i, int i2, byte[] bArr2);

    private static native byte[] nativeRGBA2NV21(byte[] bArr, int i, int i2, byte[] bArr2);
}
