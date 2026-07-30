package p153l;

import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes8.dex */
public class m8g0 {
    /* JADX INFO: renamed from: a */
    public static String m157376a(byte[] bArr) {
        return bArr != null ? new String(bArr) : hmw.m136007a(new byte[]{89, 8, 71, 86, HttpTokens.CARRIAGE_RETURN, 15, 84});
    }

    /* JADX INFO: renamed from: b */
    public static boolean m157377b(String str) {
        return str == null || str.length() <= 0;
    }
}
