package p149l;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class ayx {
    /* JADX INFO: renamed from: a */
    public static boolean m99587a(Uri uri) {
        return m99588b(uri) && !m99591e(uri);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m99588b(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m99589c(Uri uri) {
        return m99588b(uri) && m99591e(uri);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m99590d(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m99591e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
