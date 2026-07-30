package com.tenpay.utils;

/* JADX INFO: loaded from: classes2.dex */
public class SMUtils {
    public static boolean isLoadSuccess = false;
    public static SMUtils mInstance;

    public static SMUtils getInstance() {
        if (mInstance == null) {
            synchronized (SMUtils.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new SMUtils();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mInstance;
    }

    public static boolean isLoadOK() {
        return isLoadSuccess;
    }

    public native byte[] SM2Decrypt(long j, byte[] bArr, String str);

    public native byte[] SM2Encrypt(long j, byte[] bArr, String str);

    public native void SM2FreeCtx(long j);

    public native Object[] SM2GenKeyPair(long j);

    public native long SM2InitCtx();

    public native long SM2InitCtxWithPubKey(String str);

    public native int SM2ReSeed(long j, byte[] bArr);

    public native byte[] SM2Sign(long j, byte[] bArr, byte[] bArr2, String str, String str2);

    public native int SM2Verify(long j, byte[] bArr, byte[] bArr2, String str, byte[] bArr3);

    public native byte[] SM3(byte[] bArr);

    public native byte[] SM3Final(long j);

    public native void SM3Free(long j);

    public native long SM3Init();

    public native void SM3Update(long j, byte[] bArr);

    public native byte[] SM4CBCDecrypt(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] SM4CBCDecryptNoPadding(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] SM4CBCEncrypt(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] SM4CBCEncryptNoPadding(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] SM4ECBDecrypt(byte[] bArr, byte[] bArr2);

    public native byte[] SM4ECBDecryptNoPadding(byte[] bArr, byte[] bArr2);

    public native byte[] SM4ECBEncrypt(byte[] bArr, byte[] bArr2);

    public native byte[] SM4ECBEncryptNoPadding(byte[] bArr, byte[] bArr2);

    public native byte[] SM4GenKey();

    public native byte[] sm4GCMDecryptNoPadding(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5);

    public native byte[] sm4GCMEncryptNoPadding(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public native String version();
}
