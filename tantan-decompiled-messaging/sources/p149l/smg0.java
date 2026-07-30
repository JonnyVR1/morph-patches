package p149l;

import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p003H.Sudnew;

/* JADX INFO: loaded from: classes.dex */
public abstract class smg0 {

    /* JADX INFO: renamed from: a */
    public static final HashMap f165343a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static String m184949a(String str, String str2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (str2 == null || "".equals(str2)) {
            return str2;
        }
        wgg0 wgg0Var = (wgg0) f165343a.get(str);
        byte[] bArrDoFinal = null;
        bArrDoFinal = null;
        byte[] bArr = wgg0Var == null ? null : wgg0Var.f186193a;
        if (bArr == null || bArr.length == 0) {
            String string = idg0.m135446a().f112553a.getString("key_aes_key_prefix_" + str, null);
            if (string == null || "".equals(string)) {
                bArr = null;
            } else {
                byte[] bArrM183493b = sdg0.m183493b(string);
                for (int i = 0; i < bArrM183493b.length; i++) {
                    bArrM183493b[i] = (byte) (bArrM183493b[i] ^ 2);
                }
                bArr = bArrM183493b;
            }
            if (bArr != null && bArr.length > 0) {
                wgg0 wgg0Var2 = new wgg0();
                wgg0Var2.f186193a = bArr;
                f165343a.put(str, wgg0Var2);
            }
        }
        if (bArr == null || bArr.length == 0) {
            throw new Sudnew();
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        if (bytes != null && bytes.length != 0) {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bjg0.f75902a);
            Cipher cipher = Cipher.getInstance("AES/CFB/PKCS5Padding");
            cipher.init(1, bArr.length != 0 ? new SecretKeySpec(bArr, "AES") : null, ivParameterSpec);
            bArrDoFinal = cipher.doFinal(bytes);
        }
        return sdg0.m183492a(bArrDoFinal);
    }
}
