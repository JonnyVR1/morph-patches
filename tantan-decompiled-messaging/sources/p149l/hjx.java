package p149l;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class hjx {

    /* JADX INFO: renamed from: a */
    public static final boolean f108129a;

    /* JADX INFO: renamed from: b */
    public static final boolean f108130b;

    /* JADX INFO: renamed from: c */
    public static final boolean f108131c;

    /* JADX INFO: renamed from: d */
    public static final boolean f108132d;

    /* JADX INFO: renamed from: e */
    public static final boolean f108133e;

    static {
        boolean zM165922d = ot0.m165919a().m165922d();
        f108129a = zM165922d;
        f108130b = zM165922d;
        f108131c = zM165922d;
        f108132d = zM165922d;
        f108133e = zM165922d;
    }

    /* JADX INFO: renamed from: a */
    public static int m131418a(String str, String str2) {
        if (f108132d) {
            return Log.d(str, str2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m131419b(String str, String str2) {
        if (f108129a) {
            return Log.e(str, str2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static int m131420c(String str, String str2, Object... objArr) {
        if (f108130b) {
            return Log.i(str, String.format(Locale.US, str2, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static int m131421d(String str, Object obj) {
        if (!f108132d) {
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
    public static int m131422e(String str, String str2) {
        if (f108133e) {
            return Log.v(str, str2);
        }
        return 0;
    }
}
