package p149l;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public class piq0 {

    /* JADX INFO: renamed from: c */
    private static piq0 f149673c;

    /* JADX INFO: renamed from: d */
    private static char[] f149674d = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /* JADX INFO: renamed from: e */
    private static Random f149675e = new Random();

    /* JADX INFO: renamed from: a */
    private IvParameterSpec f149676a = new IvParameterSpec("GUgemWNhGTrh6kSM".getBytes());

    /* JADX INFO: renamed from: b */
    private Cipher f149677b = Cipher.getInstance("AES/CBC/PKCS7Padding");

    private piq0() throws NoSuchPaddingException, NoSuchAlgorithmException {
    }

    /* JADX INFO: renamed from: a */
    public static String m169753a(int i) {
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = f149674d[f149675e.nextInt(62)];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: c */
    public static PublicKey m169754c(String str) throws Exception {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(oiq0.m164545a(str.getBytes())));
    }

    /* JADX INFO: renamed from: d */
    public static piq0 m169755d() throws NoSuchPaddingException, NoSuchAlgorithmException {
        if (f149673c == null) {
            f149673c = new piq0();
        }
        return f149673c;
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m169756e(byte[] bArr) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, m169754c("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCyWR4IsVvIvr5hjtWkuuQJFukDRrb+KZ97LMcLtr09HaKxMpXX22IPyHrojmR7uLSaYETfFLp4LMR3JGm1LiXhlYsaKWwI68eO85cM+5yndqOcGMliKCQ6ns0m2UAVsmry3SGljjzMfzCT9C0ChkWUgkM7WU1yUd6XZMIVkOnUdQIDAQAB"));
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: renamed from: b */
    public String m169757b(String str, String str2) {
        try {
            this.f149677b.init(1, new SecretKeySpec(str2.getBytes(), "AES"), this.f149676a);
            return oiq0.m164546b(this.f149677b.doFinal(str.getBytes()));
        } catch (Exception unused) {
            return null;
        }
    }
}
