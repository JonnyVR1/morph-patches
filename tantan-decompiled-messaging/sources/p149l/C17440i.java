package p149l;

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
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: renamed from: l.i */
/* JADX INFO: loaded from: classes7.dex */
public class C17440i implements h050 {

    /* JADX INFO: renamed from: c */
    public static final byte[] f110239c = {Tnaf.POW_2_WIDTH, 74, 71, -80, HttpTokens.SPACE, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74};

    /* JADX INFO: renamed from: a */
    public Cipher f110240a;

    /* JADX INFO: renamed from: b */
    public Cipher f110241b;

    public C17440i(byte[] bArr, String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBEWITHSHAAND256BITAES-CBC-BC").generateSecret(new PBEKeySpec((str + str2).toCharArray(), bArr, 1024, 256)).getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f110240a = cipher;
            byte[] bArr2 = f110239c;
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
            Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f110241b = cipher2;
            cipher2.init(2, secretKeySpec, new IvParameterSpec(bArr2));
        } catch (GeneralSecurityException e) {
            pkq0.m170054a("Invalid environment", e);
            throw null;
        }
    }

    @Override // p149l.h050
    /* JADX INFO: renamed from: a */
    public String mo128944a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return ge2.m125604e(this.f110240a.doFinal(("com.android.vending.licensing.AESObfuscator-1|" + str2 + str).getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            pkq0.m170054a("Invalid environment", e);
            return null;
        } catch (GeneralSecurityException e2) {
            pkq0.m170054a("Invalid environment", e2);
            return null;
        }
    }

    @Override // p149l.h050
    /* JADX INFO: renamed from: b */
    public String mo128945b(String str, String str2) throws ValidationException {
        if (str == null) {
            return null;
        }
        try {
            String str3 = new String(this.f110241b.doFinal(ge2.m125600a(str)), "UTF-8");
            if (str3.indexOf("com.android.vending.licensing.AESObfuscator-1|" + str2) == 0) {
                return str3.substring(46 + str2.length(), str3.length());
            }
            throw new ValidationException("Header not found (invalid data or key):".concat(str));
        } catch (Base64DecoderException e) {
            throw new ValidationException(e.getMessage() + ":" + str);
        } catch (UnsupportedEncodingException e2) {
            pkq0.m170054a("Invalid environment", e2);
            return null;
        } catch (BadPaddingException e3) {
            throw new ValidationException(e3.getMessage() + ":" + str);
        } catch (IllegalBlockSizeException e4) {
            throw new ValidationException(e4.getMessage() + ":" + str);
        }
    }
}
