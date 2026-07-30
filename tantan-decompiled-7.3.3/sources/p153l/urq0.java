package p153l;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class urq0 {

    /* JADX INFO: renamed from: c */
    private static urq0 f180671c;

    /* JADX INFO: renamed from: d */
    private static char[] f180672d = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /* JADX INFO: renamed from: e */
    private static Random f180673e = new Random();

    /* JADX INFO: renamed from: a */
    private IvParameterSpec f180674a = new IvParameterSpec("GUgemWNhGTrh6kSM".getBytes());

    /* JADX INFO: renamed from: b */
    private Cipher f180675b = Cipher.getInstance("AES/CBC/PKCS7Padding");

    private urq0() throws NoSuchPaddingException, NoSuchAlgorithmException {
    }

    /* JADX INFO: renamed from: a */
    public static String m197646a(int i) {
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = f180672d[f180673e.nextInt(62)];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: c */
    public static PublicKey m197647c(String str) throws Exception {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(trq0.m192523a(str.getBytes())));
    }

    /* JADX INFO: renamed from: d */
    public static urq0 m197648d() throws NoSuchPaddingException, NoSuchAlgorithmException {
        if (f180671c == null) {
            f180671c = new urq0();
        }
        return f180671c;
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m197649e(byte[] bArr) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, m197647c("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCyWR4IsVvIvr5hjtWkuuQJFukDRrb+KZ97LMcLtr09HaKxMpXX22IPyHrojmR7uLSaYETfFLp4LMR3JGm1LiXhlYsaKWwI68eO85cM+5yndqOcGMliKCQ6ns0m2UAVsmry3SGljjzMfzCT9C0ChkWUgkM7WU1yUd6XZMIVkOnUdQIDAQAB"));
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: renamed from: b */
    public String m197650b(String str, String str2) {
        try {
            this.f180675b.init(1, new SecretKeySpec(str2.getBytes(), "AES"), this.f180674a);
            return trq0.m192524b(this.f180675b.doFinal(str.getBytes()));
        } catch (Exception unused) {
            return null;
        }
    }
}
