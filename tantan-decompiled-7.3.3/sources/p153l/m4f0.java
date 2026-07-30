package p153l;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes11.dex */
public class m4f0 {

    /* JADX INFO: renamed from: a */
    private static SharedPreferences f134790a;

    static {
        Context contextM220815d = zp50.m220815d();
        if (contextM220815d != null) {
            f134790a = contextM220815d.getSharedPreferences("shared_preference_oneid", 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m157008a() {
        return f134790a.getString("update_day", "");
    }

    /* JADX INFO: renamed from: b */
    public static long m157009b() {
        return f134790a.getLong("update_mills", 0L);
    }

    /* JADX INFO: renamed from: c */
    public static String m157010c() {
        return f134790a.getString("one_id", "");
    }

    /* JADX INFO: renamed from: d */
    public static void m157011d(String str) {
        f134790a.edit().putString("update_day", str).apply();
    }

    /* JADX INFO: renamed from: e */
    public static void m157012e(long j) {
        f134790a.edit().putLong("update_mills", j).apply();
    }

    /* JADX INFO: renamed from: f */
    public static void m157013f(String str) {
        f134790a.edit().putString("one_id", str).apply();
    }
}
