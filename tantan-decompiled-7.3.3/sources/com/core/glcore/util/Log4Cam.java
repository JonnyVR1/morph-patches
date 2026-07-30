package com.core.glcore.util;

import com.cosmos.mdlog.MDLog;

/* JADX INFO: loaded from: classes.dex */
public class Log4Cam {
    public static final boolean ENABLE_INFO = false;
    public static final String TagDef = "Log4Cam";

    /* JADX INFO: renamed from: d */
    public static int m7374d(String str) {
        MDLog.m7443d("Log4Cam", str);
        return 0;
    }

    public static int dfmt(String str, String str2, Object... objArr) {
        MDLog.m7444d(str, str2, objArr);
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m7376e(String str) {
        MDLog.m7445e("Log4Cam", str);
        return 0;
    }

    public static int efmt(String str, String str2, Object... objArr) {
        MDLog.m7446e(str, str2, objArr);
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static int m7379i(String str) {
        MDLog.m7449i("Log4Cam", str);
        return 0;
    }

    public static int ifmt(String str, String str2, Object... objArr) {
        MDLog.m7450i(str, str2, objArr);
        return 0;
    }

    public static void printCause(Throwable th) {
        MDLog.printErrStackTrace("Log4Cam", th);
    }

    public static void printStackTrace(Throwable th) {
        MDLog.printErrStackTrace("Log4Cam", th);
    }

    /* JADX INFO: renamed from: v */
    public static int m7381v(String str, String str2) {
        MDLog.m7451v(str, str2);
        return 0;
    }

    public static int vfmt(String str, String str2, Object... objArr) {
        MDLog.m7452v(str, str2, objArr);
        return 0;
    }

    /* JADX INFO: renamed from: w */
    public static int m7382w(String str, String str2) {
        MDLog.m7453w(str, str2);
        return 0;
    }

    public static int wfmt(String str, String str2, Object... objArr) {
        MDLog.m7454w(str, str2, objArr);
        return 0;
    }

    public static void printStackTrace(String str, Throwable th) {
        MDLog.printErrStackTrace(str, th);
    }

    /* JADX INFO: renamed from: d */
    public static int m7375d(String str, String str2) {
        MDLog.m7443d(str, str2);
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m7377e(String str, String str2) {
        MDLog.m7445e(str, str2);
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static int m7380i(String str, String str2) {
        MDLog.m7449i(str, str2);
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m7378e(String str, String str2, Throwable th) {
        MDLog.printErrStackTrace(str, th, str2, new Object[0]);
        return 0;
    }
}
