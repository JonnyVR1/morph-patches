package p149l;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public class ygw {

    /* JADX INFO: renamed from: b */
    private static final String f198253b = sgw.m184137a(new byte[]{2, 72, 2, 25, 80});

    /* JADX INFO: renamed from: c */
    private static final String f198254c = sgw.m184137a(new byte[]{99, 35, 114, 104, 50, 34, 123});

    /* JADX INFO: renamed from: a */
    private static volatile Context f198252a = null;

    /* JADX INFO: renamed from: d */
    public static boolean f198255d = false;

    /* JADX INFO: renamed from: a */
    public static Context m214775a() {
        return f198252a;
    }

    /* JADX INFO: renamed from: b */
    public static String m214776b() {
        return f198253b;
    }

    /* JADX INFO: renamed from: c */
    public static String m214777c() {
        return f198254c;
    }

    /* JADX INFO: renamed from: d */
    public static int m214778d() {
        return 30;
    }

    /* JADX INFO: renamed from: e */
    public static void m214779e(Context context) {
        if (f198252a == null) {
            synchronized (ygw.class) {
                try {
                    if (f198252a == null) {
                        f198252a = context.getApplicationContext();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
