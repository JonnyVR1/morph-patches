package p149l;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes13.dex */
public class gwe0 {

    /* JADX INFO: renamed from: a */
    public static SharedPreferences f104701a;

    static {
        Context contextM220383e = zvf0.m220383e();
        if (contextM220383e != null) {
            f104701a = contextM220383e.getSharedPreferences("shared_preference_statistics", 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m128396a() {
        return f104701a.getLong("gseq", 0L);
    }

    /* JADX INFO: renamed from: b */
    public static String m128397b() {
        return f104701a.getString("local_id", "");
    }

    /* JADX INFO: renamed from: c */
    public static String m128398c() {
        return f104701a.getString("session_uuid", "");
    }

    /* JADX INFO: renamed from: d */
    public static void m128399d(long j) {
        f104701a.edit().putLong("gseq", j).commit();
    }

    /* JADX INFO: renamed from: e */
    public static void m128400e(String str) {
        f104701a.edit().putString("local_id", str).apply();
    }

    /* JADX INFO: renamed from: f */
    public static void m128401f(String str) {
        f104701a.edit().putString("session_uuid", str).apply();
    }
}
