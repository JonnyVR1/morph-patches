package p153l;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public final class slk0 {
    /* JADX INFO: renamed from: a */
    public static String m186592a(byte[] bArr) {
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
    public static byte[] m186593b(String str) {
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
    public static int m186594c(String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8").length;
            } catch (UnsupportedEncodingException unused) {
                olk0.m168132a();
            }
        }
        return 0;
    }
}
