package com.cmic.sso.sdk.p023e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.k */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ApplySharedPref"})
public class C1394k {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    private static Context f5749a;

    /* JADX INFO: renamed from: a */
    public static void m7333a(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = f5749a.getSharedPreferences("ssoconfigs", 0).edit();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            String strM7289a = C1387d.m7289a(str);
            if (obj instanceof String) {
                editorEdit.putString(strM7289a, (String) obj);
            } else if (obj instanceof Integer) {
                editorEdit.putInt(strM7289a, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                editorEdit.putLong(strM7289a, ((Long) obj).longValue());
            } else if (obj instanceof Boolean) {
                editorEdit.putBoolean(strM7289a, ((Boolean) obj).booleanValue());
            }
        }
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: b */
    public static String m7335b(String str, String str2) {
        return f5749a.getSharedPreferences("ssoconfigs", 0).getString(C1387d.m7289a(str), str2);
    }

    /* JADX INFO: renamed from: com.cmic.sso.sdk.e.k$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final SharedPreferences.Editor f5750a;

        public a(SharedPreferences.Editor editor) {
            this.f5750a = editor;
        }

        /* JADX INFO: renamed from: a */
        public void m7340a(String str, String str2) {
            this.f5750a.putString(C1387d.m7289a(str), str2);
        }

        /* JADX INFO: renamed from: b */
        public void m7341b() {
            this.f5750a.commit();
        }

        /* JADX INFO: renamed from: c */
        public void m7342c() {
            this.f5750a.clear();
        }

        /* JADX INFO: renamed from: a */
        public void m7339a(String str, long j) {
            this.f5750a.putLong(C1387d.m7289a(str), j);
        }

        /* JADX INFO: renamed from: a */
        public void m7338a(String str, int i) {
            this.f5750a.putInt(C1387d.m7289a(str), i);
        }

        /* JADX INFO: renamed from: a */
        public void m7336a() {
            this.f5750a.apply();
        }

        /* JADX INFO: renamed from: a */
        public void m7337a(String str) {
            this.f5750a.remove(C1387d.m7289a(str));
        }
    }

    /* JADX INFO: renamed from: b */
    public static a m7334b(String str) {
        return new a(f5749a.getSharedPreferences(str, 0).edit());
    }

    /* JADX INFO: renamed from: a */
    public static int m7324a(String str, int i) {
        return f5749a.getSharedPreferences("ssoconfigs", 0).getInt(C1387d.m7289a(str), i);
    }

    /* JADX INFO: renamed from: a */
    public static int m7325a(String str, String str2, int i) {
        return f5749a.getSharedPreferences(str, 0).getInt(C1387d.m7289a(str2), i);
    }

    /* JADX INFO: renamed from: a */
    public static long m7326a(String str, long j) {
        return f5749a.getSharedPreferences("ssoconfigs", 0).getLong(C1387d.m7289a(str), j);
    }

    /* JADX INFO: renamed from: a */
    public static long m7327a(String str, String str2, long j) {
        return f5749a.getSharedPreferences(str, 0).getLong(C1387d.m7289a(str2), j);
    }

    /* JADX INFO: renamed from: a */
    public static void m7332a(String str, String str2) {
        SharedPreferences sharedPreferences = f5749a.getSharedPreferences("ssoconfigs", 0);
        sharedPreferences.edit().putString(C1387d.m7289a(str), str2).commit();
    }

    /* JADX INFO: renamed from: a */
    public static void m7330a(Context context) {
        f5749a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public static String m7329a(String str, String str2, String str3) {
        return f5749a.getSharedPreferences(str, 0).getString(C1387d.m7289a(str2), str3);
    }

    /* JADX INFO: renamed from: a */
    public static void m7331a(String str) {
        SharedPreferences sharedPreferences = f5749a.getSharedPreferences("ssoconfigs", 0);
        sharedPreferences.edit().remove(C1387d.m7289a(str)).commit();
    }

    /* JADX INFO: renamed from: a */
    public static a m7328a() {
        return new a(f5749a.getSharedPreferences("ssoconfigs", 0).edit());
    }
}
