package p153l;

import com.google.android.vending.licensing.ValidationException;
import com.google.android.vending.licensing.util.Base64DecoderException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: renamed from: l.i */
/* JADX INFO: loaded from: classes7.dex */
public class C17606i implements w850 {

    /* JADX INFO: renamed from: c */
    public static final byte[] f112317c = {Tnaf.POW_2_WIDTH, 74, 71, -80, HttpTokens.SPACE, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74};

    /* JADX INFO: renamed from: a */
    public Cipher f112318a;

    /* JADX INFO: renamed from: b */
    public Cipher f112319b;

    public C17606i(byte[] bArr, String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBEWITHSHAAND256BITAES-CBC-BC").generateSecret(new PBEKeySpec((str + str2).toCharArray(), bArr, 1024, 256)).getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f112318a = cipher;
            byte[] bArr2 = f112317c;
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
            Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f112319b = cipher2;
            cipher2.init(2, secretKeySpec, new IvParameterSpec(bArr2));
        } catch (GeneralSecurityException e) {
            vtq0.m202761a("Invalid environment", e);
            throw null;
        }
    }

    @Override // p153l.w850
    /* JADX INFO: renamed from: a */
    public String mo137945a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return ne2.m162811e(this.f112318a.doFinal(("com.android.vending.licensing.AESObfuscator-1|" + str2 + str).getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            vtq0.m202761a("Invalid environment", e);
            return null;
        } catch (GeneralSecurityException e2) {
            vtq0.m202761a("Invalid environment", e2);
            return null;
        }
    }

    @Override // p153l.w850
    /* JADX INFO: renamed from: b */
    public String mo137946b(String str, String str2) throws ValidationException {
        if (str == null) {
            return null;
        }
        try {
            String str3 = new String(this.f112319b.doFinal(ne2.m162807a(str)), "UTF-8");
            if (str3.indexOf("com.android.vending.licensing.AESObfuscator-1|" + str2) == 0) {
                return str3.substring(46 + str2.length(), str3.length());
            }
            throw new ValidationException("Header not found (invalid data or key):".concat(str));
        } catch (Base64DecoderException e) {
            throw new ValidationException(e.getMessage() + ":" + str);
        } catch (UnsupportedEncodingException e2) {
            vtq0.m202761a("Invalid environment", e2);
            return null;
        } catch (BadPaddingException e3) {
            throw new ValidationException(e3.getMessage() + ":" + str);
        } catch (IllegalBlockSizeException e4) {
            throw new ValidationException(e4.getMessage() + ":" + str);
        }
    }
}
