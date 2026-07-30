package com.google.android.datatransport.runtime.logging;

import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public final class Logging {
    private static final String LOG_PREFIX = "TRuntime.";
    private static final int MAX_LOG_TAG_SIZE_IN_SDK_N = 23;

    private Logging() {
    }

    private static String concatTag(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    /* JADX INFO: renamed from: d */
    public static void m9352d(String str, String str2, Object obj) {
        if (Log.isLoggable(getTag(str), 3)) {
            String.format(str2, obj);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m9355e(String str, String str2, Throwable th) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 6)) {
            Log.e(tag, str2, th);
        }
    }

    private static String getTag(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return concatTag(LOG_PREFIX, str);
        }
        return LOG_PREFIX + str;
    }

    /* JADX INFO: renamed from: i */
    public static void m9356i(String str, String str2, Object obj) {
        if (Log.isLoggable(getTag(str), 4)) {
            String.format(str2, obj);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m9357w(String str, String str2, Object obj) {
        if (Log.isLoggable(getTag(str), 5)) {
            String.format(str2, obj);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m9351d(String str, String str2) {
        Log.isLoggable(getTag(str), 3);
    }

    /* JADX INFO: renamed from: d */
    public static void m9353d(String str, String str2, Object obj, Object obj2) {
        if (Log.isLoggable(getTag(str), 3)) {
            String.format(str2, obj, obj2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m9354d(String str, String str2, Object... objArr) {
        if (Log.isLoggable(getTag(str), 3)) {
            String.format(str2, objArr);
        }
    }
}
