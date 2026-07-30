package p153l;

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
public class zje {

    /* JADX INFO: renamed from: c */
    private static zje f204659c;

    /* JADX INFO: renamed from: d */
    private static char[] f204660d = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /* JADX INFO: renamed from: e */
    private static Random f204661e = new Random();

    /* JADX INFO: renamed from: a */
    private IvParameterSpec f204662a = new IvParameterSpec("GUgemWNhGTrh6kSM".getBytes());

    /* JADX INFO: renamed from: b */
    private Cipher f204663b = Cipher.getInstance("AES/CBC/PKCS7Padding");

    private zje() throws NoSuchPaddingException, NoSuchAlgorithmException {
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m219969a(byte[] bArr) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, m219971e("MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKbj7WvmhEVXZbeqvMGXdMDvGlD6/Aa/MRxkhtUzdMBtB1FzUGOs77Yo7Es3cxt4HQGrioAaPXCyNC4KX1L8qdcCAwEAAQ=="));
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: renamed from: d */
    public static zje m219970d() throws NoSuchPaddingException, NoSuchAlgorithmException {
        if (f204659c == null) {
            f204659c = new zje();
        }
        return f204659c;
    }

    /* JADX INFO: renamed from: e */
    public static PublicKey m219971e(String str) throws Exception {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(qe2.m176218a(str.getBytes())));
    }

    /* JADX INFO: renamed from: f */
    private static byte[] m219972f(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m219973g(int i) {
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = f204660d[f204661e.nextInt(62)];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: b */
    public String m219974b(String str, String str2) throws Exception {
        if (str == null || str.length() == 0) {
            brq0.m106161a("Empty string");
            return null;
        }
        try {
            this.f204663b.init(2, new SecretKeySpec(m219972f(str2), "AES"), this.f204662a);
            return new String(this.f204663b.doFinal(qe2.m176218a(str.getBytes())));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public String m219975c(String str, String str2) {
        try {
            this.f204663b.init(1, new SecretKeySpec(m219972f(str2), "AES"), this.f204662a);
            return qe2.m176219b(this.f204663b.doFinal(str.getBytes()));
        } catch (Exception unused) {
            return null;
        }
    }
}
