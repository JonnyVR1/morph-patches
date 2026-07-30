package p153l;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes11.dex */
public class n4f0 {

    /* JADX INFO: renamed from: a */
    public static SharedPreferences f140228a;

    static {
        Context contextM138507e = i4g0.m138507e();
        if (contextM138507e != null) {
            f140228a = contextM138507e.getSharedPreferences("shared_preference_statistics", 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m161558a() {
        return f140228a.getLong("gseq", 0L);
    }

    /* JADX INFO: renamed from: b */
    public static String m161559b() {
        return f140228a.getString("local_id", "");
    }

    /* JADX INFO: renamed from: c */
    public static String m161560c() {
        return f140228a.getString("session_uuid", "");
    }

    /* JADX INFO: renamed from: d */
    public static void m161561d(long j) {
        f140228a.edit().putLong("gseq", j).commit();
    }

    /* JADX INFO: renamed from: e */
    public static void m161562e(String str) {
        f140228a.edit().putString("local_id", str).apply();
    }

    /* JADX INFO: renamed from: f */
    public static void m161563f(String str) {
        f140228a.edit().putString("session_uuid", str).apply();
    }
}
