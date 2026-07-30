package com.p008ss.android.ttvecamera;

import android.util.Log;

/* JADX INFO: renamed from: com.ss.android.ttvecamera.g */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0743g {

    /* JADX INFO: renamed from: a */
    private static String f9172a = "VESDK-";

    /* JADX INFO: renamed from: b */
    private static byte f9173b = 3;

    /* JADX INFO: renamed from: c */
    private static volatile b f9174c = new a();

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.g$a */
    public static class a implements b {
        @Override // com.p008ss.android.ttvecamera.C0743g.b
        public void Log(byte b, String str, String str2) {
            if (b == 16 || b == 8 || b == 4 || b == 2 || b != 1) {
                return;
            }
            Log.e(str, str2);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.g$b */
    public interface b {
        void Log(byte b, String str, String str2);
    }

    /* JADX INFO: renamed from: a */
    public static void m11165a(String str, String str2) {
        if ((f9173b & 8) != 0) {
            f9174c.Log((byte) 8, f9172a + str, str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m11166b(String str, String str2) {
        if ((f9173b & 1) != 0) {
            f9174c.Log((byte) 1, f9172a + str, str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m11167c(String str, String str2, Throwable th) {
        if ((f9173b & 1) != 0) {
            String str3 = f9172a + str;
            f9174c.Log((byte) 1, str3, str2 + "\n***StackTrace***\n" + Log.getStackTraceString(th));
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m11168d() {
        return Log.getStackTraceString(new Throwable());
    }

    /* JADX INFO: renamed from: e */
    public static void m11169e(String str, String str2) {
        if ((f9173b & 4) != 0) {
            f9174c.Log((byte) 4, f9172a + str, str2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m11170f(String str, Object obj) {
        if ((f9173b & 8) != 0) {
            obj.toString();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m11171g() {
        m11165a("Debug", m11168d());
    }

    /* JADX INFO: renamed from: h */
    public static void m11172h(b bVar) {
        if (bVar != null) {
            f9174c = bVar;
        } else {
            f9174c = new a();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m11173i(String str, byte b2) {
        if (str != null && str.length() > 0) {
            f9172a = str.concat("-");
        }
        f9173b = b2;
    }

    /* JADX INFO: renamed from: j */
    public static void m11174j(String str, String str2) {
        if ((f9173b & 2) != 0) {
            f9174c.Log((byte) 2, f9172a + str, str2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m11175k(String str, String str2, Throwable th) {
        if ((f9173b & 2) != 0) {
            String str3 = f9172a + str;
            f9174c.Log((byte) 2, str3, str2 + "\n***StackTrace***\n" + Log.getStackTraceString(th));
        }
    }
}
