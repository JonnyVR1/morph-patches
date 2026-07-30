package org.greenrobot.greendao;

import android.util.Log;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DaoLog {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    private static final String TAG = "greenDAO";
    public static final int VERBOSE = 2;
    public static final int WARN = 5;

    /* JADX INFO: renamed from: d */
    public static int m9556d(String str) {
        return Log.d(TAG, str);
    }

    /* JADX INFO: renamed from: e */
    public static int m9558e(String str) {
        return Log.w(TAG, str);
    }

    public static String getStackTraceString(Throwable th) {
        return Log.getStackTraceString(th);
    }

    /* JADX INFO: renamed from: i */
    public static int m9560i(String str) {
        return Log.i(TAG, str);
    }

    public static boolean isLoggable(int i) {
        return Log.isLoggable(TAG, i);
    }

    public static int println(int i, String str) {
        return Log.println(i, TAG, str);
    }

    /* JADX INFO: renamed from: v */
    public static int m9562v(String str) {
        return Log.v(TAG, str);
    }

    /* JADX INFO: renamed from: w */
    public static int m9564w(String str) {
        return Log.w(TAG, str);
    }

    /* JADX INFO: renamed from: d */
    public static int m9557d(String str, Throwable th) {
        return Log.d(TAG, str, th);
    }

    /* JADX INFO: renamed from: e */
    public static int m9559e(String str, Throwable th) {
        return Log.e(TAG, str, th);
    }

    /* JADX INFO: renamed from: i */
    public static int m9561i(String str, Throwable th) {
        return Log.i(TAG, str, th);
    }

    /* JADX INFO: renamed from: v */
    public static int m9563v(String str, Throwable th) {
        return Log.v(TAG, str, th);
    }

    /* JADX INFO: renamed from: w */
    public static int m9565w(String str, Throwable th) {
        return Log.w(TAG, str, th);
    }

    /* JADX INFO: renamed from: w */
    public static int m9566w(Throwable th) {
        return Log.w(TAG, th);
    }
}
