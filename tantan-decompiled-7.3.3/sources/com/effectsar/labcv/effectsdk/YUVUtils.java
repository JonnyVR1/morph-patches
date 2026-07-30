package com.effectsar.labcv.effectsdk;

import java.nio.Buffer;

/* JADX INFO: loaded from: classes.dex */
public class YUVUtils {
    public static final int NV12 = 6;
    public static final int NV21 = 7;
    public static final int ORIENTATION_0 = 0;
    public static final int ORIENTATION_180 = 2;
    public static final int ORIENTATION_270 = 3;
    public static final int ORIENTATION_90 = 1;
    public static final int RGBA = 0;
    public static final int YUV420P = 5;

    public static native void BGR2RGBA(Buffer buffer, Buffer buffer2, int i, int i2, int i3);

    public static native void I420ToBGRA(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, byte[] bArr4, int i4, int i5, int i6);

    public static native void I420ToRGBA(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, byte[] bArr4, int i4, int i5, int i6);

    public static native void NV12ToBGRA(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4, int i5);

    public static native void NV12ToRGBA(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4, int i5);

    public static native void NV21ToBGRA(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4, int i5);

    public static native void NV21ToRGBA(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4, int i5);

    public static native void RGBA2BGR(Buffer buffer, Buffer buffer2, int i, int i2, int i3);

    public static native void RGBA2YUV(byte[] bArr, byte[] bArr2, int i, int i2, int i3);

    public static native void Rotate(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4);

    public static native void YUV2RGBA(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, int i5, int i6, boolean z);

    public static native void YUVRESIZE(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, int i5);
}
