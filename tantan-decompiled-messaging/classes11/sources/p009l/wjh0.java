package p009l;

import android.os.Trace;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wjh0 {

    /* JADX INFO: renamed from: a */
    private static boolean f22167a = false;

    /* JADX INFO: renamed from: a */
    public static void m24289a(String str) {
        if (f22167a) {
            Trace.beginSection(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m24290b() {
        if (f22167a) {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m24291c(boolean z) {
        f22167a = z;
    }
}
