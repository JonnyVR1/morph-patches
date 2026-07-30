package com.immomo.mediabase;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class Log4Cam {
    public static final boolean ENABLE_INFO = true;
    public static final boolean ENABLE_WARN = false;
    public static final String TagDef = "Log4Cam";

    /* JADX INFO: renamed from: d */
    public static int m19384d(String str) {
        return 0;
    }

    public static int dfmt(String str, String str2, Object... objArr) {
        String.format(Locale.US, str2, objArr);
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m19387e(String str) {
        Log.e("Log4Cam", str);
        return 0;
    }

    public static int efmt(String str, String str2, Object... objArr) {
        Log.e(str, String.format(Locale.US, str2, objArr));
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static int m19390i(String str) {
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
    public static int m19393v(String str, String str2) {
        return 0;
    }

    public static int vfmt(String str, String str2, Object... objArr) {
        String.format(Locale.US, str2, objArr);
        return 0;
    }

    /* JADX INFO: renamed from: w */
    public static int m19395w(String str, String str2) {
        return 0;
    }

    public static int wfmt(String str, String str2, Object... objArr) {
        String.format(Locale.US, str2, objArr);
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static int m19385d(String str, String str2) {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static int m19391i(String str, String str2) {
        return 0;
    }

    /* JADX INFO: renamed from: v */
    public static int m19394v(String str, String str2, Throwable th) {
        return 0;
    }

    /* JADX INFO: renamed from: w */
    public static int m19396w(String str, String str2, Throwable th) {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static int m19386d(String str, String str2, Throwable th) {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static int m19392i(String str, String str2, Throwable th) {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m19388e(String str, String str2) {
        Log.e(str, str2);
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m19389e(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
        return 0;
    }
}
