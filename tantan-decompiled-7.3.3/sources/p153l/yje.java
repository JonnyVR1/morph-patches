package p153l;

import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public class yje {

    /* JADX INFO: renamed from: b */
    private static yje f200290b;

    /* JADX INFO: renamed from: c */
    private static final char[] f200291c = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /* JADX INFO: renamed from: d */
    private static final Random f200292d = new Random();

    /* JADX INFO: renamed from: a */
    private final IvParameterSpec f200293a = new IvParameterSpec("GUgemWNhGTrh6kSM".getBytes());

    private yje() {
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m216400a(byte[] bArr) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, m216402e("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCxe05SaRevxo8JnNeRlpLIz3gi\nniJQ08ldb9NsH6F4dJYbaS3mbYGbkz4ODJVtFjhQeD9aY+Ew5olK0pY4wepT3an8\nikIOdkfwJaU6QfICATBtkV7G4Vqx8wSAT884iolboABSaGRnrFvXa7NtOOcIVePO\nsSiVg61iJH0BAmpGqQIDAQAB\n"));
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: renamed from: d */
    public static yje m216401d() {
        if (f200290b == null) {
            f200290b = new yje();
        }
        return f200290b;
    }

    /* JADX INFO: renamed from: e */
    public static PublicKey m216402e(String str) throws Exception {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(re2.m180958a(str.getBytes())));
    }

    /* JADX INFO: renamed from: f */
    private static byte[] m216403f(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m216404g(int i) {
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = f200291c[f200292d.nextInt(62)];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: b */
    public String m216405b(String str, String str2) throws Exception {
        if (str == null || str.length() == 0) {
            brq0.m106161a("Empty string");
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(2, new SecretKeySpec(m216403f(str2), "AES"), this.f200293a);
            return new String(cipher.doFinal(re2.m180958a(str.getBytes())));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public String m216406c(String str, String str2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, new SecretKeySpec(m216403f(str2), "AES"), this.f200293a);
            return re2.m180959b(cipher.doFinal(str.getBytes()));
        } catch (Exception unused) {
            return null;
        }
    }
}
