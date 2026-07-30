package com.cmic.sso.sdk.p022e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.k */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ApplySharedPref"})
public class C1371k {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    private static Context f5712a;

    /* JADX INFO: renamed from: a */
    public static void m7279a(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = f5712a.getSharedPreferences("ssoconfigs", 0).edit();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            String strM7235a = C1364d.m7235a(str);
            if (obj instanceof String) {
                editorEdit.putString(strM7235a, (String) obj);
            } else if (obj instanceof Integer) {
                editorEdit.putInt(strM7235a, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                editorEdit.putLong(strM7235a, ((Long) obj).longValue());
            } else if (obj instanceof Boolean) {
                editorEdit.putBoolean(strM7235a, ((Boolean) obj).booleanValue());
            }
        }
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: b */
    public static String m7281b(String str, String str2) {
        return f5712a.getSharedPreferences("ssoconfigs", 0).getString(C1364d.m7235a(str), str2);
    }

    /* JADX INFO: renamed from: com.cmic.sso.sdk.e.k$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final SharedPreferences.Editor f5713a;

        public a(SharedPreferences.Editor editor) {
            this.f5713a = editor;
        }

        /* JADX INFO: renamed from: a */
        public void m7286a(String str, String str2) {
            this.f5713a.putString(C1364d.m7235a(str), str2);
        }

        /* JADX INFO: renamed from: b */
        public void m7287b() {
            this.f5713a.commit();
        }

        /* JADX INFO: renamed from: c */
        public void m7288c() {
            this.f5713a.clear();
        }

        /* JADX INFO: renamed from: a */
        public void m7285a(String str, long j) {
            this.f5713a.putLong(C1364d.m7235a(str), j);
        }

        /* JADX INFO: renamed from: a */
        public void m7284a(String str, int i) {
            this.f5713a.putInt(C1364d.m7235a(str), i);
        }

        /* JADX INFO: renamed from: a */
        public void m7282a() {
            this.f5713a.apply();
        }

        /* JADX INFO: renamed from: a */
        public void m7283a(String str) {
            this.f5713a.remove(C1364d.m7235a(str));
        }
    }

    /* JADX INFO: renamed from: b */
    public static a m7280b(String str) {
        return new a(f5712a.getSharedPreferences(str, 0).edit());
    }

    /* JADX INFO: renamed from: a */
    public static int m7270a(String str, int i) {
        return f5712a.getSharedPreferences("ssoconfigs", 0).getInt(C1364d.m7235a(str), i);
    }

    /* JADX INFO: renamed from: a */
    public static int m7271a(String str, String str2, int i) {
        return f5712a.getSharedPreferences(str, 0).getInt(C1364d.m7235a(str2), i);
    }

    /* JADX INFO: renamed from: a */
    public static long m7272a(String str, long j) {
        return f5712a.getSharedPreferences("ssoconfigs", 0).getLong(C1364d.m7235a(str), j);
    }

    /* JADX INFO: renamed from: a */
    public static long m7273a(String str, String str2, long j) {
        return f5712a.getSharedPreferences(str, 0).getLong(C1364d.m7235a(str2), j);
    }

    /* JADX INFO: renamed from: a */
    public static void m7278a(String str, String str2) {
        SharedPreferences sharedPreferences = f5712a.getSharedPreferences("ssoconfigs", 0);
        sharedPreferences.edit().putString(C1364d.m7235a(str), str2).commit();
    }

    /* JADX INFO: renamed from: a */
    public static void m7276a(Context context) {
        f5712a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public static String m7275a(String str, String str2, String str3) {
        return f5712a.getSharedPreferences(str, 0).getString(C1364d.m7235a(str2), str3);
    }

    /* JADX INFO: renamed from: a */
    public static void m7277a(String str) {
        SharedPreferences sharedPreferences = f5712a.getSharedPreferences("ssoconfigs", 0);
        sharedPreferences.edit().remove(C1364d.m7235a(str)).commit();
    }

    /* JADX INFO: renamed from: a */
    public static a m7274a() {
        return new a(f5712a.getSharedPreferences("ssoconfigs", 0).edit());
    }
}
