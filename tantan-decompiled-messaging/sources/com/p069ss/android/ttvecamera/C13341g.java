package com.p069ss.android.ttvecamera;

import android.util.Log;

/* JADX INFO: renamed from: com.ss.android.ttvecamera.g */
/* JADX INFO: loaded from: classes11.dex */
public class C13341g {

    /* JADX INFO: renamed from: a */
    private static String f55566a = "VESDK-";

    /* JADX INFO: renamed from: b */
    private static byte f55567b = 3;

    /* JADX INFO: renamed from: c */
    private static volatile b f55568c = new a();

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.g$a */
    public static class a implements b {
        @Override // com.p069ss.android.ttvecamera.C13341g.b
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
    public static void m80814a(String str, String str2) {
        if ((f55567b & 8) != 0) {
            f55568c.Log((byte) 8, f55566a + str, str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m80815b(String str, String str2) {
        if ((f55567b & 1) != 0) {
            f55568c.Log((byte) 1, f55566a + str, str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m80816c(String str, String str2, Throwable th) {
        if ((f55567b & 1) != 0) {
            String str3 = f55566a + str;
            f55568c.Log((byte) 1, str3, str2 + "\n***StackTrace***\n" + Log.getStackTraceString(th));
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m80817d() {
        return Log.getStackTraceString(new Throwable());
    }

    /* JADX INFO: renamed from: e */
    public static void m80818e(String str, String str2) {
        if ((f55567b & 4) != 0) {
            f55568c.Log((byte) 4, f55566a + str, str2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m80819f(String str, Object obj) {
        if ((f55567b & 8) != 0) {
            obj.toString();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m80820g() {
        m80814a("Debug", m80817d());
    }

    /* JADX INFO: renamed from: h */
    public static void m80821h(b bVar) {
        if (bVar != null) {
            f55568c = bVar;
        } else {
            f55568c = new a();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m80822i(String str, byte b2) {
        if (str != null && str.length() > 0) {
            f55566a = str.concat("-");
        }
        f55567b = b2;
    }

    /* JADX INFO: renamed from: j */
    public static void m80823j(String str, String str2) {
        if ((f55567b & 2) != 0) {
            f55568c.Log((byte) 2, f55566a + str, str2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m80824k(String str, String str2, Throwable th) {
        if ((f55567b & 2) != 0) {
            String str3 = f55566a + str;
            f55568c.Log((byte) 2, str3, str2 + "\n***StackTrace***\n" + Log.getStackTraceString(th));
        }
    }
}
