package p153l;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class t9c {

    /* JADX INFO: renamed from: a */
    public static final boolean f172625a;

    /* JADX INFO: renamed from: b */
    public static final boolean f172626b;

    /* JADX INFO: renamed from: c */
    public static final boolean f172627c;

    /* JADX INFO: renamed from: d */
    public static final boolean f172628d;

    /* JADX INFO: renamed from: e */
    public static final boolean f172629e;

    static {
        boolean z = im80.f115710a;
        f172625a = z;
        f172626b = z;
        f172627c = z;
        f172628d = z;
        f172629e = z;
    }

    /* JADX INFO: renamed from: a */
    public static int m189743a(String str, String str2) {
        if (f172628d) {
            return Log.d(str, str2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m189744b(String str, String str2, Object... objArr) {
        if (f172628d) {
            return Log.d(str, String.format(Locale.US, str2, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static int m189745c(String str, String str2) {
        if (f172625a) {
            return Log.e(str, str2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static int m189746d(String str, String str2, Throwable th) {
        if (f172625a) {
            return Log.e(str, str2, th);
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m189747e(String str, String str2) {
        if (f172626b) {
            return Log.i(str, str2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public static int m189748f(String str, Object obj) {
        if (!f172628d) {
            return 0;
        }
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement != null && !stackTraceElement.getFileName().contains("DebugLog.java") && !stackTraceElement.getMethodName().contains("getStackTrace") && !stackTraceElement.getMethodName().contains("getThreadStackTrace") && !stackTraceElement.getClassName().startsWith("android.os") && !stackTraceElement.getClassName().startsWith("java.") && !stackTraceElement.getFileName().contains("ZygoteInit.java")) {
                StringBuilder sb = new StringBuilder();
                sb.append(stackTraceElement.getFileName());
                sb.append("[");
                sb.append(stackTraceElement.getMethodName());
                sb.append(":");
                sb.append(stackTraceElement.getLineNumber());
                sb.append("]\n");
                return Log.d(str, (stackTraceElement.getFileName() + "[" + stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber() + "] ") + obj);
            }
        }
        return Log.d(str, "" + obj);
    }

    /* JADX INFO: renamed from: g */
    public static void m189749g(Throwable th) {
        if (f172627c) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m189750h(String str, String str2) {
        if (f172629e) {
            return Log.v(str, str2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static int m189751i(String str, String str2) {
        if (f172627c) {
            return Log.w(str, str2);
        }
        return 0;
    }
}
