package p153l;

import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public class jzv {

    /* JADX INFO: renamed from: a */
    private static boolean f123323a = false;

    /* JADX INFO: renamed from: b */
    public static void m147729b(String str, String str2) {
        if (f123323a) {
            Log.e(str, "mk---" + str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m147730c(String str, String str2, Throwable th) {
        if (!f123323a || th == null) {
            return;
        }
        th.printStackTrace();
    }

    /* JADX INFO: renamed from: d */
    public static void m147731d(String str, Throwable th) {
        m147730c("", "", th);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m147733f() {
        return f123323a;
    }

    /* JADX INFO: renamed from: h */
    public static void m147735h(boolean z) {
        f123323a = z;
    }

    /* JADX INFO: renamed from: a */
    public static void m147728a(String str, String str2) {
    }

    /* JADX INFO: renamed from: e */
    public static void m147732e(String str, String str2) {
    }

    /* JADX INFO: renamed from: g */
    public static void m147734g(String str, String str2) {
    }
}
