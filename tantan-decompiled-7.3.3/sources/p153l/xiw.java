package p153l;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public class xiw {

    /* JADX INFO: renamed from: b */
    private static final String f194523b = riw.m181611a(new byte[]{2, 72, 2, 25, 80});

    /* JADX INFO: renamed from: c */
    private static final String f194524c = riw.m181611a(new byte[]{99, 35, 114, 104, 50, 34, 123});

    /* JADX INFO: renamed from: a */
    private static volatile Context f194522a = null;

    /* JADX INFO: renamed from: d */
    public static boolean f194525d = false;

    /* JADX INFO: renamed from: a */
    public static Context m211170a() {
        return f194522a;
    }

    /* JADX INFO: renamed from: b */
    public static String m211171b() {
        return f194523b;
    }

    /* JADX INFO: renamed from: c */
    public static String m211172c() {
        return f194524c;
    }

    /* JADX INFO: renamed from: d */
    public static int m211173d() {
        return 30;
    }

    /* JADX INFO: renamed from: e */
    public static void m211174e(Context context) {
        if (f194522a == null) {
            synchronized (xiw.class) {
                try {
                    if (f194522a == null) {
                        f194522a = context.getApplicationContext();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
