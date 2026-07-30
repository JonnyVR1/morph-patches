package p153l;

import android.os.Trace;

/* JADX INFO: loaded from: classes11.dex */
public class dsh0 {

    /* JADX INFO: renamed from: a */
    private static boolean f90484a = false;

    /* JADX INFO: renamed from: a */
    public static void m117758a(String str) {
        if (f90484a) {
            Trace.beginSection(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m117759b() {
        if (f90484a) {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m117760c(boolean z) {
        f90484a = z;
    }
}
