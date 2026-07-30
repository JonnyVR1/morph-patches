package com.immomo.mediabase;

/* JADX INFO: loaded from: classes7.dex */
public class Nalu {
    static {
        try {
            System.loadLibrary("mediabase");
        } catch (UnsatisfiedLinkError e) {
            Log4Cam.printStackTrace(e);
        }
    }

    public static int getNaluType(byte[] bArr, int i) {
        return nativeNaluType(bArr, i);
    }

    private static native int nativeNaluType(byte[] bArr, int i);
}
