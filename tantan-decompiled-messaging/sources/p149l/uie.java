package p149l;

import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public class uie {

    /* JADX INFO: renamed from: b */
    private static uie f176643b;

    /* JADX INFO: renamed from: c */
    private static final char[] f176644c = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /* JADX INFO: renamed from: d */
    private static final Random f176645d = new Random();

    /* JADX INFO: renamed from: a */
    private final IvParameterSpec f176646a = new IvParameterSpec("GUgemWNhGTrh6kSM".getBytes());

    private uie() {
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m193869a(byte[] bArr) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, m193871e("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCxe05SaRevxo8JnNeRlpLIz3gi\nniJQ08ldb9NsH6F4dJYbaS3mbYGbkz4ODJVtFjhQeD9aY+Ew5olK0pY4wepT3an8\nikIOdkfwJaU6QfICATBtkV7G4Vqx8wSAT884iolboABSaGRnrFvXa7NtOOcIVePO\nsSiVg61iJH0BAmpGqQIDAQAB\n"));
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: renamed from: d */
    public static uie m193870d() {
        if (f176643b == null) {
            f176643b = new uie();
        }
        return f176643b;
    }

    /* JADX INFO: renamed from: e */
    public static PublicKey m193871e(String str) throws Exception {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(je2.m141097a(str.getBytes())));
    }

    /* JADX INFO: renamed from: f */
    private static byte[] m193872f(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m193873g(int i) {
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = f176644c[f176645d.nextInt(62)];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: b */
    public String m193874b(String str, String str2) throws Exception {
        if (str == null || str.length() == 0) {
            whq0.m203241a("Empty string");
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(2, new SecretKeySpec(m193872f(str2), "AES"), this.f176646a);
            return new String(cipher.doFinal(je2.m141097a(str.getBytes())));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public String m193875c(String str, String str2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, new SecretKeySpec(m193872f(str2), "AES"), this.f176646a);
            return je2.m141098b(cipher.doFinal(str.getBytes()));
        } catch (Exception unused) {
            return null;
        }
    }
}
