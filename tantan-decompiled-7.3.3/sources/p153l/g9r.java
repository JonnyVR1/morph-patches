package p153l;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes11.dex */
public class g9r {

    /* JADX INFO: renamed from: a */
    public static long f102874a = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: b */
    public static boolean f102875b = true;

    /* JADX INFO: renamed from: c */
    public static long f102876c = -1;

    /* JADX INFO: renamed from: a */
    public static void m129598a() {
        f102875b = true;
        f102874a = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: b */
    public static void m129599b() {
        f102875b = false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m129600c() {
        return f102875b || f102876c - f102874a <= 6000;
    }

    /* JADX INFO: renamed from: d */
    public static void m129601d() {
        f102876c = SystemClock.elapsedRealtime();
    }
}
