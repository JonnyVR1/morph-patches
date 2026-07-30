package p149l;

import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public abstract class sdg0 {
    /* JADX INFO: renamed from: a */
    public static String m183492a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return Base64.encodeToString(bArr, 2);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m183493b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return Base64.decode(str, 2);
    }
}
