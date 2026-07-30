package p153l;

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
import p004H.Sudnew;

/* JADX INFO: loaded from: classes.dex */
public abstract class avg0 {

    /* JADX INFO: renamed from: a */
    public static final HashMap f73619a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static String m100463a(String str, String str2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (str2 == null || "".equals(str2)) {
            return str2;
        }
        epg0 epg0Var = (epg0) f73619a.get(str);
        byte[] bArrDoFinal = null;
        bArrDoFinal = null;
        byte[] bArr = epg0Var == null ? null : epg0Var.f95249a;
        if (bArr == null || bArr.length == 0) {
            String string = qlg0.m177003a().f158229a.getString("key_aes_key_prefix_" + str, null);
            if (string == null || "".equals(string)) {
                bArr = null;
            } else {
                byte[] bArrM98822b = amg0.m98822b(string);
                for (int i = 0; i < bArrM98822b.length; i++) {
                    bArrM98822b[i] = (byte) (bArrM98822b[i] ^ 2);
                }
                bArr = bArrM98822b;
            }
            if (bArr != null && bArr.length > 0) {
                epg0 epg0Var2 = new epg0();
                epg0Var2.f95249a = bArr;
                f73619a.put(str, epg0Var2);
            }
        }
        if (bArr == null || bArr.length == 0) {
            throw new Sudnew();
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        if (bytes != null && bytes.length != 0) {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(jrg0.f122350a);
            Cipher cipher = Cipher.getInstance("AES/CFB/PKCS5Padding");
            cipher.init(1, bArr.length != 0 ? new SecretKeySpec(bArr, "AES") : null, ivParameterSpec);
            bArrDoFinal = cipher.doFinal(bytes);
        }
        return amg0.m98821a(bArrDoFinal);
    }
}
