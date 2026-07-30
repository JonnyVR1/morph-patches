package p149l;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public final class mck0 {
    /* JADX INFO: renamed from: a */
    public static String m154016a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new Error(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m154017b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new Error(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m154018c(String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8").length;
            } catch (UnsupportedEncodingException unused) {
                ick0.m135358a();
            }
        }
        return 0;
    }
}
