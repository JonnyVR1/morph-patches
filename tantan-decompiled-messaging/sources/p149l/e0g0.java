package p149l;

import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes8.dex */
public class e0g0 {
    /* JADX INFO: renamed from: a */
    public static String m114180a(byte[] bArr) {
        return bArr != null ? new String(bArr) : ijw.m136753a(new byte[]{89, 8, 71, 86, HttpTokens.CARRIAGE_RETURN, 15, 84});
    }

    /* JADX INFO: renamed from: b */
    public static boolean m114181b(String str) {
        return str == null || str.length() <= 0;
    }
}
