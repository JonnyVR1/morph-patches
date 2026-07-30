package p149l;

import android.util.Base64;
import com.tantanapp.common.utils.CrashHelper;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.eclipse.jetty.util.StringUtil;

/* JADX INFO: renamed from: l.j */
/* JADX INFO: loaded from: classes8.dex */
public class C17657j {
    /* JADX INFO: renamed from: a */
    public static String m139080a(String str, String str2, String str3, String str4, String str5) throws Exception {
        Cipher cipher = Cipher.getInstance(str3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(str4.getBytes(str2), "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(str5.getBytes(str2));
        if (str3.contains("CBC")) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(1, secretKeySpec);
        }
        return Base64.encodeToString(cipher.doFinal(str.getBytes(str2)), 2);
    }

    /* JADX INFO: renamed from: b */
    public static String m139081b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return m139080a(str, StringUtil.__UTF8Alt, "AES/CBC/PKCS7Padding", "4c7a3b36502375d8", "4c7a3b36502375d8");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return "";
        }
    }
}
