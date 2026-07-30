package com.immomo.mediabase;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class Log4Cam {
    public static final boolean ENABLE_INFO = true;
    public static final boolean ENABLE_WARN = false;
    public static final String TagDef = "Log4Cam";

    /* JADX INFO: renamed from: d */
    public static int m18375d(String str) {
        return 0;
    }

    public static int dfmt(String str, String str2, Object... objArr) {
        String.format(Locale.US, str2, objArr);
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m18378e(String str) {
        Log.e("Log4Cam", str);
        return 0;
    }

    public static int efmt(String str, String str2, Object... objArr) {
        Log.e(str, String.format(Locale.US, str2, objArr));
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static int m18381i(String str) {
        return 0;
    }

    public static int ifmt(String str, String str2, Object... objArr) {
        String.format(Locale.US, str2, objArr);
        return 0;
    }

    public static void printCause(Throwable th) {
    }

    public static void printStackTrace(Throwable th) {
    }

    /* JADX INFO: renamed from: v */
    public static int m18384v(String str, String str2) {
        return 0;
    }

    public static int vfmt(String str, String str2, Object... objArr) {
        String.format(Locale.US, str2, objArr);
        return 0;
    }

    /* JADX INFO: renamed from: w */
    public static int m18386w(String str, String str2) {
        return 0;
    }

    public static int wfmt(String str, String str2, Object... objArr) {
        String.format(Locale.US, str2, objArr);
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static int m18376d(String str, String str2) {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static int m18382i(String str, String str2) {
        return 0;
    }

    /* JADX INFO: renamed from: v */
    public static int m18385v(String str, String str2, Throwable th) {
        return 0;
    }

    /* JADX INFO: renamed from: w */
    public static int m18387w(String str, String str2, Throwable th) {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static int m18377d(String str, String str2, Throwable th) {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static int m18383i(String str, String str2, Throwable th) {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m18379e(String str, String str2) {
        Log.e(str, str2);
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m18380e(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
        return 0;
    }
}
