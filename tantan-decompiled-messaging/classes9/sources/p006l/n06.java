package p006l;

import com.tantanapp.common.utils.CrashHelper;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Deprecated
public abstract class n06 {
    /* JADX INFO: renamed from: a */
    public static String m19621a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            CrashHelper.c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m19622b(String str) {
        return m19621a(m19623c(str, 11));
    }

    /* JADX INFO: renamed from: c */
    public static String m19623c(String str, int i) {
        return str.length() < i ? str : str.substring(str.length() - i);
    }
}
