package tech.sud.gip.logger;

import p149l.uag0;
import tech.sud.gip.core.ISudLogger;

/* JADX INFO: loaded from: classes3.dex */
public class SudLogger {
    private static ISudLogger impl = new uag0();

    private SudLogger() {
    }

    /* JADX INFO: renamed from: d */
    public static void m221565d(String str, String str2) {
        impl.log(3, str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m221567e(String str, String str2) {
        impl.log(6, str, str2);
    }

    /* JADX INFO: renamed from: i */
    public static void m221569i(String str, String str2) {
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
    public static void m221571v(String str, String str2) {
        impl.log(2, str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m221573w(String str, String str2) {
        impl.log(5, str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static void m221566d(String str, String str2, Throwable th) {
        impl.log(3, str, str2, th);
    }

    /* JADX INFO: renamed from: e */
    public static void m221568e(String str, String str2, Throwable th) {
        impl.log(6, str, str2, th);
    }

    /* JADX INFO: renamed from: i */
    public static void m221570i(String str, String str2, Throwable th) {
        impl.log(4, str, str2, th);
    }

    /* JADX INFO: renamed from: v */
    public static void m221572v(String str, String str2, Throwable th) {
        impl.log(2, str, str2, th);
    }

    /* JADX INFO: renamed from: w */
    public static void m221574w(String str, String str2, Throwable th) {
        impl.log(5, str, str2, th);
    }
}
