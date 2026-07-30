package com.cosmos.codedlib;

import p149l.ke2;

/* JADX INFO: loaded from: classes.dex */
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
        System.loadLibrary("coded");
    }

    private Coded() {
    }

    public static native int g234cpu43xc(byte[] bArr, int i, byte[] bArr2, int i2, int i3);

    public static Coded getInstance() {
        Coded coded;
        synchronized (Coded.class) {
            try {
                if (instance == null) {
                    instance = new Coded();
                }
                coded = instance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return coded;
    }

    private byte[] getServerSK(int i, int i2) {
        return ggug8Shj3S0(i, i2);
    }

    private int serverSecretGen(byte[] bArr, byte[] bArr2, int i, int i2) {
        return s729dS782nGoo(bArr, bArr2, i, i2);
    }

    public native int a49kdEba83h(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3);

    public native int a9ehcDdu3j8(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3);

    public int aesDecode(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr3 == null) {
            return -1;
        }
        return a9ehcDdu3j8(bArr, i, bArr2, i2, bArr3);
    }

    public int aesEncode(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3) {
        return a49kdEba83h(bArr, i, bArr2, i2, bArr3);
    }

    public int base64Decode(byte[] bArr, byte[] bArr2) {
        return bsuh37Dhjaw(bArr, bArr2);
    }

    public native int bsuh37Dhjaw(byte[] bArr, byte[] bArr2);

    public native int c789Sju7G87(byte[] bArr, byte[] bArr2, int i, byte[] bArr3);

    public int clientSecretGen(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        int iC789Sju7G87;
        synchronized (Coded.class) {
            iC789Sju7G87 = c789Sju7G87(bArr, bArr2, i, bArr3);
        }
        return iC789Sju7G87;
    }

    public int computeOutputLength(int i, int i2) {
        return csjh7OhLe86(i, i2);
    }

    public native int csjh7OhLe86(int i, int i2);

    public native byte[] g7673Shg3P9(int i, int i2);

    public byte[] getServerPK(int i, int i2) {
        return g7673Shg3P9(i, i2);
    }

    public native byte[] ggug8Shj3S0(int i, int i2);

    public native int s729dS782nGoo(byte[] bArr, byte[] bArr2, int i, int i2);

    public native int sdbyecbu37x(byte[] bArr, byte[] bArr2, byte[] bArr3, int i);

    public String sign(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return "";
        }
        byte[] bArr3 = new byte[20];
        sdbyecbu37x(bArr, bArr2, bArr3, bArr.length);
        try {
            return ke2.m145713b(bArr3);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean verifySignToken(String str, String str2, int i) {
        int iG234cpu43xc;
        try {
            byte[] bytes = str.getBytes();
            byte[] bArrM145712a = ke2.m145712a(str2.getBytes());
            iG234cpu43xc = g234cpu43xc(bytes, bytes.length, bArrM145712a, bArrM145712a.length, i);
        } catch (Exception e) {
            e.printStackTrace();
            iG234cpu43xc = 0;
        }
        return iG234cpu43xc > 0;
    }
}
