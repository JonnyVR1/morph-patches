package com.p074ss.android.ttvecamera;

import android.util.Log;

/* JADX INFO: renamed from: com.ss.android.ttvecamera.g */
/* JADX INFO: loaded from: classes11.dex */
public class C13504g {

    /* JADX INFO: renamed from: a */
    private static String f56414a = "VESDK-";

    /* JADX INFO: renamed from: b */
    private static byte f56415b = 3;

    /* JADX INFO: renamed from: c */
    private static volatile b f56416c = new a();

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.g$a */
    public static class a implements b {
        @Override // com.p074ss.android.ttvecamera.C13504g.b
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
    public static void m81997a(String str, String str2) {
        if ((f56415b & 8) != 0) {
            f56416c.Log((byte) 8, f56414a + str, str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m81998b(String str, String str2) {
        if ((f56415b & 1) != 0) {
            f56416c.Log((byte) 1, f56414a + str, str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m81999c(String str, String str2, Throwable th) {
        if ((f56415b & 1) != 0) {
            String str3 = f56414a + str;
            f56416c.Log((byte) 1, str3, str2 + "\n***StackTrace***\n" + Log.getStackTraceString(th));
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m82000d() {
        return Log.getStackTraceString(new Throwable());
    }

    /* JADX INFO: renamed from: e */
    public static void m82001e(String str, String str2) {
        if ((f56415b & 4) != 0) {
            f56416c.Log((byte) 4, f56414a + str, str2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m82002f(String str, Object obj) {
        if ((f56415b & 8) != 0) {
            obj.toString();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m82003g() {
        m81997a("Debug", m82000d());
    }

    /* JADX INFO: renamed from: h */
    public static void m82004h(b bVar) {
        if (bVar != null) {
            f56416c = bVar;
        } else {
            f56416c = new a();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m82005i(String str, byte b2) {
        if (str != null && str.length() > 0) {
            f56414a = str.concat("-");
        }
        f56415b = b2;
    }

    /* JADX INFO: renamed from: j */
    public static void m82006j(String str, String str2) {
        if ((f56415b & 2) != 0) {
            f56416c.Log((byte) 2, f56414a + str, str2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m82007k(String str, String str2, Throwable th) {
        if ((f56415b & 2) != 0) {
            String str3 = f56414a + str;
            f56416c.Log((byte) 2, str3, str2 + "\n***StackTrace***\n" + Log.getStackTraceString(th));
        }
    }
}
