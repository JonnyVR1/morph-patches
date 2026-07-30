package com.p041mm.mmfile;

import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public class Logger {
    /* JADX INFO: renamed from: d */
    public static void m19637d(String str, String str2, Object... objArr) {
        if (objArr == null) {
            return;
        }
        String.format(str2, objArr);
    }

    /* JADX INFO: renamed from: e */
    public static void m19638e(String str, String str2, Object... objArr) {
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        Log.e(str, str2);
    }

    /* JADX INFO: renamed from: f */
    public static void m19639f(String str, String str2, Object... objArr) {
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        Log.e(str, str2);
    }

    /* JADX INFO: renamed from: i */
    public static void m19640i(String str, String str2, Object... objArr) {
        if (objArr == null) {
            return;
        }
        String.format(str2, objArr);
    }

    public static void printErrStackTrace(String str, Throwable th, String str2, Object... objArr) {
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        Log.e(str, str2);
        Log.e(str, Log.getStackTraceString(th));
    }

    /* JADX INFO: renamed from: v */
    public static void m19641v(String str, String str2, Object... objArr) {
        if (objArr == null) {
            return;
        }
        String.format(str2, objArr);
    }

    /* JADX INFO: renamed from: w */
    public static void m19642w(String str, String str2, Object... objArr) {
        if (objArr == null) {
            return;
        }
        String.format(str2, objArr);
    }

    public static void printErrStackTrace(String str, Throwable th) {
        printErrStackTrace(str, th, "", new Object[0]);
    }
}
