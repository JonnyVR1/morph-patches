package p153l;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class esx {

    /* JADX INFO: renamed from: a */
    public static final boolean f95661a;

    /* JADX INFO: renamed from: b */
    public static final boolean f95662b;

    /* JADX INFO: renamed from: c */
    public static final boolean f95663c;

    /* JADX INFO: renamed from: d */
    public static final boolean f95664d;

    /* JADX INFO: renamed from: e */
    public static final boolean f95665e;

    static {
        boolean zM197959d = ut0.m197956a().m197959d();
        f95661a = zM197959d;
        f95662b = zM197959d;
        f95663c = zM197959d;
        f95664d = zM197959d;
        f95665e = zM197959d;
    }

    /* JADX INFO: renamed from: a */
    public static int m122396a(String str, String str2) {
        if (f95664d) {
            return Log.d(str, str2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m122397b(String str, String str2) {
        if (f95661a) {
            return Log.e(str, str2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static int m122398c(String str, String str2, Object... objArr) {
        if (f95662b) {
            return Log.i(str, String.format(Locale.US, str2, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static int m122399d(String str, Object obj) {
        if (!f95664d) {
            return 0;
        }
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (!stackTraceElement.getFileName().contains("MediaDebugLog.java") && !stackTraceElement.getMethodName().contains("getStackTrace") && !stackTraceElement.getMethodName().contains("getThreadStackTrace") && !stackTraceElement.getClassName().startsWith("android.os") && !stackTraceElement.getClassName().startsWith("java.") && !stackTraceElement.getFileName().contains("ZygoteInit.java")) {
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

    /* JADX INFO: renamed from: e */
    public static int m122400e(String str, String str2) {
        if (f95665e) {
            return Log.v(str, str2);
        }
        return 0;
    }
}
