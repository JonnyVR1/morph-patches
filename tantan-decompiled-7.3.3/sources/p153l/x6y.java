package p153l;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class x6y {
    /* JADX INFO: renamed from: a */
    public static boolean m209563a(Uri uri) {
        return m209564b(uri) && !m209567e(uri);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m209564b(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m209565c(Uri uri) {
        return m209564b(uri) && m209567e(uri);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m209566d(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m209567e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
