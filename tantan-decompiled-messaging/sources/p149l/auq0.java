package p149l;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes2.dex */
public class auq0 {

    /* JADX INFO: renamed from: a */
    private static final byte[] f71850a = {100, 23, 84, 114, 72, 0, 4, 97, 73, 97, 2, 52, 84, 102, 18, HttpTokens.SPACE};

    /* JADX INFO: renamed from: a */
    private static Cipher m99034a(byte[] bArr, int i) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(f71850a);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(i, secretKeySpec, ivParameterSpec);
        return cipher;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m99035b(byte[] bArr, byte[] bArr2) {
        return m99034a(bArr, 2).doFinal(bArr2);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m99036c(byte[] bArr, byte[] bArr2) {
        return m99034a(bArr, 1).doFinal(bArr2);
    }
}
