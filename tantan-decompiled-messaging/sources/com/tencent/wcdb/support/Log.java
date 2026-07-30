package com.tencent.wcdb.support;

/* JADX INFO: loaded from: classes2.dex */
public class Log {
    public static final int LOGGER_DEFAULT = 1;
    public static final int LOGGER_NONE = 0;
    private static LogCallback mCallback;

    public interface LogCallback {
        void println(int i, String str, String str2);
    }

    private Log() {
    }

    /* JADX INFO: renamed from: d */
    public static void m84618d(String str, String str2, Object... objArr) {
        println(3, str, String.format(str2, objArr));
    }

    /* JADX INFO: renamed from: e */
    public static void m84620e(String str, String str2, Object... objArr) {
        println(6, str, String.format(str2, objArr));
    }

    /* JADX INFO: renamed from: f */
    public static void m84622f(String str, String str2, Object... objArr) {
        println(7, str, String.format(str2, objArr));
    }

    /* JADX INFO: renamed from: i */
    public static void m84624i(String str, String str2, Object... objArr) {
        println(4, str, String.format(str2, objArr));
    }

    private static native void nativePrintLn(int i, String str, String str2);

    private static native void nativeSetLogger(int i, LogCallback logCallback);

    public static void println(int i, String str, String str2) {
        LogCallback logCallback = mCallback;
        if (logCallback != null) {
            logCallback.println(i, str, str2);
        } else {
            nativePrintLn(i, str, str2);
        }
    }

    public static void setLogger(int i) {
        mCallback = null;
        nativeSetLogger(i, null);
    }

    /* JADX INFO: renamed from: v */
    public static void m84626v(String str, String str2, Object... objArr) {
        println(2, str, String.format(str2, objArr));
    }

    /* JADX INFO: renamed from: w */
    public static void m84628w(String str, String str2, Object... objArr) {
        println(5, str, String.format(str2, objArr));
    }

    public static void setLogger(LogCallback logCallback) {
        mCallback = logCallback;
        nativeSetLogger(-1, logCallback);
    }

    /* JADX INFO: renamed from: d */
    public static void m84617d(String str, String str2) {
        println(3, str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m84619e(String str, String str2) {
        println(6, str, str2);
    }

    /* JADX INFO: renamed from: f */
    public static void m84621f(String str, String str2) {
        println(7, str, str2);
    }

    /* JADX INFO: renamed from: i */
    public static void m84623i(String str, String str2) {
        println(4, str, str2);
    }

    /* JADX INFO: renamed from: v */
    public static void m84625v(String str, String str2) {
        println(2, str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m84627w(String str, String str2) {
        println(5, str, str2);
    }
}
