package com.tencent.liteav.basic.p089d;

import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: renamed from: com.tencent.liteav.basic.d.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C14023a {

    /* JADX INFO: renamed from: a */
    private static String f58235a = "RSA";

    /* JADX INFO: renamed from: a */
    public static byte[] m82843a(byte[] bArr, PrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, privateKey);
        int length = bArr.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int blockSize = 0;
        while (true) {
            int i = length - blockSize;
            if (i <= 0) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
            byteArrayOutputStream.write(i >= cipher.getBlockSize() ? cipher.doFinal(bArr, blockSize, cipher.getBlockSize()) : cipher.doFinal(bArr, blockSize, i));
            blockSize += cipher.getBlockSize();
        }
    }

    /* JADX INFO: renamed from: a */
    public static PrivateKey m82842a(byte[] bArr) throws InvalidKeySpecException, NoSuchAlgorithmException {
        return KeyFactory.getInstance(f58235a).generatePrivate(new PKCS8EncodedKeySpec(bArr));
    }
}
