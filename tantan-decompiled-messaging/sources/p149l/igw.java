package p149l;

import android.content.Context;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes7.dex */
public class igw {

    /* JADX INFO: renamed from: a */
    public static Context f113187a;

    /* JADX INFO: renamed from: a */
    public static String m136176a(String str) {
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
    public static Context m136177b() {
        return f113187a;
    }

    /* JADX INFO: renamed from: c */
    public static void m136178c(Context context) {
        if (f113187a == null) {
            f113187a = context;
        }
    }
}
