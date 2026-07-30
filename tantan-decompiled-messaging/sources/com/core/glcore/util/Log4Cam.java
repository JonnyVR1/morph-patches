package com.core.glcore.util;

import com.cosmos.mdlog.MDLog;

/* JADX INFO: loaded from: classes.dex */
public class Log4Cam {
    public static final boolean ENABLE_INFO = false;
    public static final String TagDef = "Log4Cam";

    /* JADX INFO: renamed from: d */
    public static int m7320d(String str) {
        MDLog.m7389d("Log4Cam", str);
        return 0;
    }

    public static int dfmt(String str, String str2, Object... objArr) {
        MDLog.m7390d(str, str2, objArr);
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m7322e(String str) {
        MDLog.m7391e("Log4Cam", str);
        return 0;
    }

    public static int efmt(String str, String str2, Object... objArr) {
        MDLog.m7392e(str, str2, objArr);
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static int m7325i(String str) {
        MDLog.m7395i("Log4Cam", str);
        return 0;
    }

    public static int ifmt(String str, String str2, Object... objArr) {
        MDLog.m7396i(str, str2, objArr);
        return 0;
    }

    public static void printCause(Throwable th) {
        MDLog.printErrStackTrace("Log4Cam", th);
    }

    public static void printStackTrace(Throwable th) {
        MDLog.printErrStackTrace("Log4Cam", th);
    }

    /* JADX INFO: renamed from: v */
    public static int m7327v(String str, String str2) {
        MDLog.m7397v(str, str2);
        return 0;
    }

    public static int vfmt(String str, String str2, Object... objArr) {
        MDLog.m7398v(str, str2, objArr);
        return 0;
    }

    /* JADX INFO: renamed from: w */
    public static int m7328w(String str, String str2) {
        MDLog.m7399w(str, str2);
        return 0;
    }

    public static int wfmt(String str, String str2, Object... objArr) {
        MDLog.m7400w(str, str2, objArr);
        return 0;
    }

    public static void printStackTrace(String str, Throwable th) {
        MDLog.printErrStackTrace(str, th);
    }

    /* JADX INFO: renamed from: d */
    public static int m7321d(String str, String str2) {
        MDLog.m7389d(str, str2);
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m7323e(String str, String str2) {
        MDLog.m7391e(str, str2);
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static int m7326i(String str, String str2) {
        MDLog.m7395i(str, str2);
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m7324e(String str, String str2, Throwable th) {
        MDLog.printErrStackTrace(str, th, str2, new Object[0]);
        return 0;
    }
}
