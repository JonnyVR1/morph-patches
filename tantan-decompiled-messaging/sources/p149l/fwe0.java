package p149l;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes13.dex */
public class fwe0 {

    /* JADX INFO: renamed from: a */
    private static SharedPreferences f99646a;

    static {
        Context contextM188869d = th50.m188869d();
        if (contextM188869d != null) {
            f99646a = contextM188869d.getSharedPreferences("shared_preference_oneid", 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m123512a() {
        return f99646a.getString("update_day", "");
    }

    /* JADX INFO: renamed from: b */
    public static long m123513b() {
        return f99646a.getLong("update_mills", 0L);
    }

    /* JADX INFO: renamed from: c */
    public static String m123514c() {
        return f99646a.getString("one_id", "");
    }

    /* JADX INFO: renamed from: d */
    public static void m123515d(String str) {
        f99646a.edit().putString("update_day", str).apply();
    }

    /* JADX INFO: renamed from: e */
    public static void m123516e(long j) {
        f99646a.edit().putLong("update_mills", j).apply();
    }

    /* JADX INFO: renamed from: f */
    public static void m123517f(String str) {
        f99646a.edit().putString("one_id", str).apply();
    }
}
