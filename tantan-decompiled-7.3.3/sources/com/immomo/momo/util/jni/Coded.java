package com.immomo.momo.util.jni;

import p153l.C18520m1;
import p153l.k0f;

/* JADX INFO: loaded from: classes7.dex */
public class Coded {
    public static final int ENC_OUTPUT_TYPE_AES_DEC = 2;
    public static final int ENC_OUTPUT_TYPE_AES_ENC = 1;
    public static final int ENC_OUTPUT_TYPE_ECDH_SHARED_SECRET = 3;
    public static final int ENC_OUTPUT_TYPE_GROUP_CURVE192 = 5;
    public static final int ENC_OUTPUT_TYPE_KEY_CURVE192 = 7;
    public static final int ENC_OUTPUT_TYPE_PUBLIC_KEY_CURVE192 = 6;
    public static final int ENC_OUTPUT_TYPE_SHA1_OUTPUT = 4;
    private static final int SHA_DIGEST_LENGTH = 20;
    private static Coded instance;

    static {
        if (C18520m1.f134376a) {
            k0f.m147784a().loadLibrary("testcoded");
            return;
        }
        k0f.m147784a().loadLibrary("mmcrypto");
        k0f.m147784a().loadLibrary("mmssl");
        k0f.m147784a().loadLibrary("coded");
        k0f.m147784a().loadLibrary("coded_jni");
    }

    private Coded() {
    }

    public static native int g234cpu43xc(byte[] bArr, int i, byte[] bArr2, int i2, int i3);

    public native int a49kdEba83h(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3);

    public native int a9ehcDdu3j8(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3);

    public native int bsuh37Dhjaw(byte[] bArr, byte[] bArr2);

    public native int c789Sju7G87(byte[] bArr, byte[] bArr2, int i, byte[] bArr3);

    public native int csjh7OhLe86(int i, int i2);

    public native byte[] g7673Shg3P9(int i, int i2);

    public native byte[] ggug8Shj3S0(int i, int i2);

    public native int s729dS782nGoo(byte[] bArr, byte[] bArr2, int i, int i2);

    public native int sdbyecbu37x(byte[] bArr, byte[] bArr2, byte[] bArr3, int i);
}
