package com.momo.xeengine.utils;

import android.util.Log;
import androidx.annotation.Keep;
import com.momo.xeengine.XELogger;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public class CipherUtil {
    private static final String[] ALGORITHM = {"AES", "DES", "DESede", "RSA"};
    private static final String[] MODE = {"ECB", "CBC"};
    private static final String[] PADDING = {"NoPadding", "PKCS5Padding"};
    private static final int[] OPERATION = {1, 2};

    public static byte[] crypt(int i, int i2, int i3, int i4, byte[] bArr, byte[] bArr2) {
        try {
            String[] strArr = ALGORITHM;
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(strArr[i2]);
            if (secretKeyFactory == null) {
                return null;
            }
            Cipher cipher = Cipher.getInstance(strArr[i2] + '/' + MODE[i3] + '/' + PADDING[i4]);
            if (cipher == null) {
                return null;
            }
            cipher.init(OPERATION[i], secretKeyFactory.generateSecret(new DESKeySpec(bArr)));
            return cipher.doFinal(bArr2);
        } catch (Throwable th) {
            Log.e(XELogger.ENGINE_TAG, "crypt: " + th);
            return null;
        }
    }
}
