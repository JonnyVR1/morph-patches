package p153l;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.f */
/* JADX INFO: loaded from: classes7.dex */
public class C16872f {
    /* JADX INFO: renamed from: a */
    public static byte[] m123434a(byte[] bArr, byte[] bArr2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec("2819674267512132".getBytes());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(bArr2, "AES"), ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
