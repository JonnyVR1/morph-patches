package com.uraroji.garage.android.lame;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleLame {
    static {
        System.loadLibrary("mp3lame");
    }

    /* JADX INFO: renamed from: a */
    public static void m85859a(int i, int i2, int i3, int i4) {
        init(i, i2, i3, i4, 7);
    }

    public static native void close();

    public static native int encode(short[] sArr, short[] sArr2, int i, byte[] bArr);

    public static native int flush(byte[] bArr);

    public static native void init(int i, int i2, int i3, int i4, int i5);
}
