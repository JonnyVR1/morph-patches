package p149l;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class n8c {

    /* JADX INFO: renamed from: a */
    public static final boolean f137612a;

    /* JADX INFO: renamed from: b */
    public static final boolean f137613b;

    /* JADX INFO: renamed from: c */
    public static final boolean f137614c;

    /* JADX INFO: renamed from: d */
    public static final boolean f137615d;

    /* JADX INFO: renamed from: e */
    public static final boolean f137616e;

    static {
        boolean z = be80.f75125a;
        f137612a = z;
        f137613b = z;
        f137614c = z;
        f137615d = z;
        f137616e = z;
    }

    /* JADX INFO: renamed from: a */
    public static int m158483a(String str, String str2) {
        if (f137615d) {
            return Log.d(str, str2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m158484b(String str, String str2, Object... objArr) {
        if (f137615d) {
            return Log.d(str, String.format(Locale.US, str2, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static int m158485c(String str, String str2) {
        if (f137612a) {
            return Log.e(str, str2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static int m158486d(String str, String str2, Throwable th) {
        if (f137612a) {
            return Log.e(str, str2, th);
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m158487e(String str, String str2) {
        if (f137613b) {
            return Log.i(str, str2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public static int m158488f(String str, Object obj) {
        if (!f137615d) {
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
    public static void m158489g(Throwable th) {
        if (f137614c) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m158490h(String str, String str2) {
        if (f137616e) {
            return Log.v(str, str2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static int m158491i(String str, String str2) {
        if (f137614c) {
            return Log.w(str, str2);
        }
        return 0;
    }
}
