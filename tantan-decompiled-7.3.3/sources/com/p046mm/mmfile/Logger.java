package com.p046mm.mmfile;

import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public class Logger {
    /* JADX INFO: renamed from: d */
    public static void m20636d(String str, String str2, Object... objArr) {
        if (objArr == null) {
            return;
        }
        String.format(str2, objArr);
    }

    /* JADX INFO: renamed from: e */
    public static void m20637e(String str, String str2, Object... objArr) {
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        Log.e(str, str2);
    }

    /* JADX INFO: renamed from: f */
    public static void m20638f(String str, String str2, Object... objArr) {
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        Log.e(str, str2);
    }

    /* JADX INFO: renamed from: i */
    public static void m20639i(String str, String str2, Object... objArr) {
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
    public static void m20640v(String str, String str2, Object... objArr) {
        if (objArr == null) {
            return;
        }
        String.format(str2, objArr);
    }

    /* JADX INFO: renamed from: w */
    public static void m20641w(String str, String str2, Object... objArr) {
        if (objArr == null) {
            return;
        }
        String.format(str2, objArr);
    }

    public static void printErrStackTrace(String str, Throwable th) {
        printErrStackTrace(str, th, "", new Object[0]);
    }
}
