package p149l;

import android.os.Trace;

/* JADX INFO: loaded from: classes11.dex */
public class wjh0 {

    /* JADX INFO: renamed from: a */
    private static boolean f186654a = false;

    /* JADX INFO: renamed from: a */
    public static void m203445a(String str) {
        if (f186654a) {
            Trace.beginSection(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m203446b() {
        if (f186654a) {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m203447c(boolean z) {
        f186654a = z;
    }
}
