package p149l;

import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public class vie {

    /* JADX INFO: renamed from: c */
    private static vie f181598c;

    /* JADX INFO: renamed from: d */
    private static char[] f181599d = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /* JADX INFO: renamed from: e */
    private static Random f181600e = new Random();

    /* JADX INFO: renamed from: a */
    private IvParameterSpec f181601a = new IvParameterSpec("GUgemWNhGTrh6kSM".getBytes());

    /* JADX INFO: renamed from: b */
    private Cipher f181602b = Cipher.getInstance("AES/CBC/PKCS7Padding");

    private vie() throws NoSuchPaddingException, NoSuchAlgorithmException {
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m198554a(byte[] bArr) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, m198556e("MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKbj7WvmhEVXZbeqvMGXdMDvGlD6/Aa/MRxkhtUzdMBtB1FzUGOs77Yo7Es3cxt4HQGrioAaPXCyNC4KX1L8qdcCAwEAAQ=="));
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: renamed from: d */
    public static vie m198555d() throws NoSuchPaddingException, NoSuchAlgorithmException {
        if (f181598c == null) {
            f181598c = new vie();
        }
        return f181598c;
    }

    /* JADX INFO: renamed from: e */
    public static PublicKey m198556e(String str) throws Exception {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(ie2.m135654a(str.getBytes())));
    }

    /* JADX INFO: renamed from: f */
    private static byte[] m198557f(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m198558g(int i) {
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = f181599d[f181600e.nextInt(62)];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: b */
    public String m198559b(String str, String str2) throws Exception {
        if (str == null || str.length() == 0) {
            whq0.m203241a("Empty string");
            return null;
        }
        try {
            this.f181602b.init(2, new SecretKeySpec(m198557f(str2), "AES"), this.f181601a);
            return new String(this.f181602b.doFinal(ie2.m135654a(str.getBytes())));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public String m198560c(String str, String str2) {
        try {
            this.f181602b.init(1, new SecretKeySpec(m198557f(str2), "AES"), this.f181601a);
            return ie2.m135655b(this.f181602b.doFinal(str.getBytes()));
        } catch (Exception unused) {
            return null;
        }
    }
}
