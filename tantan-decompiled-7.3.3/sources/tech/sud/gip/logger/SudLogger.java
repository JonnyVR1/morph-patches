package tech.sud.gip.logger;

import p153l.cjg0;
import tech.sud.gip.core.ISudLogger;

/* JADX INFO: loaded from: classes3.dex */
public class SudLogger {
    private static ISudLogger impl = new cjg0();

    private SudLogger() {
    }

    /* JADX INFO: renamed from: d */
    public static void m222811d(String str, String str2) {
        impl.log(3, str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m222813e(String str, String str2) {
        impl.log(6, str, str2);
    }

    /* JADX INFO: renamed from: i */
    public static void m222815i(String str, String str2) {
        impl.log(4, str, str2);
    }

    public static void setLogLevel(int i) {
        impl.setLogLevel(i);
    }

    public static void setLogger(ISudLogger iSudLogger) {
        if (iSudLogger != null) {
            impl = iSudLogger;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m222817v(String str, String str2) {
        impl.log(2, str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m222819w(String str, String str2) {
        impl.log(5, str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static void m222812d(String str, String str2, Throwable th) {
        impl.log(3, str, str2, th);
    }

    /* JADX INFO: renamed from: e */
    public static void m222814e(String str, String str2, Throwable th) {
        impl.log(6, str, str2, th);
    }

    /* JADX INFO: renamed from: i */
    public static void m222816i(String str, String str2, Throwable th) {
        impl.log(4, str, str2, th);
    }

    /* JADX INFO: renamed from: v */
    public static void m222818v(String str, String str2, Throwable th) {
        impl.log(2, str, str2, th);
    }

    /* JADX INFO: renamed from: w */
    public static void m222820w(String str, String str2, Throwable th) {
        impl.log(5, str, str2, th);
    }
}
