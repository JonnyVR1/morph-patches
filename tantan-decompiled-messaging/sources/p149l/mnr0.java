package p149l;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class mnr0 {

    /* JADX INFO: renamed from: a */
    public static final String f134786a = "Volley";

    /* JADX INFO: renamed from: b */
    public static final boolean f134787b = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: c */
    public static final String f134788c = mnr0.class.getName();

    /* JADX INFO: renamed from: a */
    public static void m155557a(String str, Object... objArr) {
        m155561e(str, objArr);
    }

    /* JADX INFO: renamed from: b */
    public static void m155558b(String str, Object... objArr) {
        Log.e(f134786a, m155561e(str, objArr));
    }

    /* JADX INFO: renamed from: c */
    public static void m155559c(Throwable th, String str, Object... objArr) {
        Log.e(f134786a, m155561e(str, objArr), th);
    }

    /* JADX INFO: renamed from: d */
    public static void m155560d(String str, Object... objArr) {
        if (f134787b) {
            m155561e(str, objArr);
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m155561e(String str, Object... objArr) {
        String str2;
        String str3 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClassName().equals(f134788c)) {
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
