package com.tantanapp.ijk.media.player.pragma;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class DebugLog {
    public static final boolean ENABLE_DEBUG = true;
    public static final boolean ENABLE_ERROR = true;
    public static final boolean ENABLE_INFO = true;
    public static final boolean ENABLE_VERBOSE = true;
    public static final boolean ENABLE_WARN = true;

    /* JADX INFO: renamed from: d */
    public static void m81341d(String str, String str2) {
    }

    public static void dfmt(String str, String str2, Object... objArr) {
        String.format(Locale.US, str2, objArr);
    }

    /* JADX INFO: renamed from: e */
    public static void m81343e(String str, String str2) {
        Log.e(str, str2);
    }

    public static void efmt(String str, String str2, Object... objArr) {
        Log.e(str, String.format(Locale.US, str2, objArr));
    }

    /* JADX INFO: renamed from: i */
    public static void m81345i(String str, String str2) {
    }

    public static void ifmt(String str, String str2, Object... objArr) {
        String.format(Locale.US, str2, objArr);
    }

    public static void printCause(Throwable th) {
        Throwable cause = th.getCause();
        if (cause != null) {
            th = cause;
        }
        printStackTrace(th);
    }

    public static void printStackTrace(Throwable th) {
        th.printStackTrace();
    }

    /* JADX INFO: renamed from: v */
    public static void m81347v(String str, String str2) {
    }

    public static void vfmt(String str, String str2, Object... objArr) {
        String.format(Locale.US, str2, objArr);
    }

    /* JADX INFO: renamed from: w */
    public static void m81349w(String str, String str2) {
    }

    public static void wfmt(String str, String str2, Object... objArr) {
        String.format(Locale.US, str2, objArr);
    }

    /* JADX INFO: renamed from: d */
    public static void m81342d(String str, String str2, Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static void m81346i(String str, String str2, Throwable th) {
    }

    /* JADX INFO: renamed from: v */
    public static void m81348v(String str, String str2, Throwable th) {
    }

    /* JADX INFO: renamed from: w */
    public static void m81350w(String str, String str2, Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static void m81344e(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }
}
