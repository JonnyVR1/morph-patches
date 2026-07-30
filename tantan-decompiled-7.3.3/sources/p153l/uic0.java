package p153l;

import android.util.Base64;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes7.dex */
public class uic0 {

    /* JADX INFO: renamed from: a */
    private static final char[] f179089a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};

    /* JADX INFO: renamed from: a */
    public static byte[] m196151a(RSAPublicKey rSAPublicKey, byte[] bArr) throws Exception {
        if (rSAPublicKey == null) {
            brq0.m106161a("加密公钥为空, 请设置");
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, rSAPublicKey);
            return cipher.doFinal(bArr);
        } catch (InvalidKeyException unused) {
            brq0.m106161a("加密公钥非法,请检查");
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            brq0.m106161a("无此加密算法");
            return null;
        } catch (BadPaddingException unused3) {
            brq0.m106161a("明文数据已损坏");
            return null;
        } catch (IllegalBlockSizeException unused4) {
            brq0.m106161a("明文长度非法");
            return null;
        } catch (NoSuchPaddingException unused5) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static RSAPublicKey m196152b(String str) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split(SignParameters.NEW_LINE)) {
            if (str2.charAt(0) != '-') {
                sb.append(str2);
                sb.append('\r');
            }
        }
        try {
            return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(sb.toString(), 0)));
        } catch (NullPointerException unused) {
            brq0.m106161a("公钥数据为空");
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            brq0.m106161a("无此算法");
            return null;
        } catch (InvalidKeySpecException unused3) {
            brq0.m106161a("公钥非法");
            return null;
        }
    }
}
