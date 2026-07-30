package p153l;

import android.content.Context;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes7.dex */
public class giw {

    /* JADX INFO: renamed from: a */
    public static Context f104531a;

    /* JADX INFO: renamed from: a */
    public static String m130384a(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Context m130385b() {
        return f104531a;
    }

    /* JADX INFO: renamed from: c */
    public static void m130386c(Context context) {
        if (f104531a == null) {
            f104531a = context;
        }
    }
}
