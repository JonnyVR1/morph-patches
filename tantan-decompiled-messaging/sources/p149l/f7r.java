package p149l;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes13.dex */
public class f7r {

    /* JADX INFO: renamed from: a */
    public static long f96277a = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: b */
    public static boolean f96278b = true;

    /* JADX INFO: renamed from: c */
    public static long f96279c = -1;

    /* JADX INFO: renamed from: a */
    public static void m119817a() {
        f96278b = true;
        f96277a = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: b */
    public static void m119818b() {
        f96278b = false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m119819c() {
        return f96278b || f96279c - f96277a <= 6000;
    }

    /* JADX INFO: renamed from: d */
    public static void m119820d() {
        f96279c = SystemClock.elapsedRealtime();
    }
}
