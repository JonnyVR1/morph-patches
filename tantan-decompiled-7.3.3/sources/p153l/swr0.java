package p153l;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class swr0 {

    /* JADX INFO: renamed from: a */
    public static final String f171001a = "Volley";

    /* JADX INFO: renamed from: b */
    public static final boolean f171002b = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: c */
    public static final String f171003c = swr0.class.getName();

    /* JADX INFO: renamed from: a */
    public static void m188357a(String str, Object... objArr) {
        m188361e(str, objArr);
    }

    /* JADX INFO: renamed from: b */
    public static void m188358b(String str, Object... objArr) {
        Log.e(f171001a, m188361e(str, objArr));
    }

    /* JADX INFO: renamed from: c */
    public static void m188359c(Throwable th, String str, Object... objArr) {
        Log.e(f171001a, m188361e(str, objArr), th);
    }

    /* JADX INFO: renamed from: d */
    public static void m188360d(String str, Object... objArr) {
        if (f171002b) {
            m188361e(str, objArr);
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m188361e(String str, Object... objArr) {
        String str2;
        String str3 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClassName().equals(f171003c)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str3);
            }
        }
        str2 = "<unknown>";
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str3);
    }
}
