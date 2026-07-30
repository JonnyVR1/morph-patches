package p149l;

import android.text.TextUtils;
import android.util.Base64;
import com.immomo.mmutil.log.Log4Android;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public class c0f {

    /* JADX INFO: renamed from: a */
    public static final byte[] f78141a = "#PART#".getBytes();

    /* JADX INFO: renamed from: a */
    public static String m104747a(byte[] bArr, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bArrM104748b = m104748b(str);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrM104748b, 0, 32);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrM104748b, 32, 48);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArrCopyOfRange, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrCopyOfRange2);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            String str2 = new String(cipher.doFinal(bArr));
            mxv.m156926a("EncryptUtils", "tang------字符串解密 耗时 " + (System.currentTimeMillis() - jCurrentTimeMillis));
            return str2;
        } catch (Throwable th) {
            Log4Android.m18417f().m18422e(th);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static byte[] m104748b(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        return MessageDigest.getInstance("SHA-384").digest(str.getBytes());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m104749c(String str, byte[] bArr, String str2) {
        if (str != null && bArr != null && !TextUtils.isEmpty(str2)) {
            try {
                PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 2)));
                Signature signature = Signature.getInstance("SHA256withRSA");
                signature.initVerify(publicKeyGeneratePublic);
                signature.update(str.getBytes());
                return signature.verify(Base64.decode(bArr, 2));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
