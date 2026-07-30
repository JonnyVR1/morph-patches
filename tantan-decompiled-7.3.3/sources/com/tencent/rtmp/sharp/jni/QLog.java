package com.tencent.rtmp.sharp.jni;

import android.content.Context;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.tencent.liteav.basic.log.TXCLog;

/* JADX INFO: loaded from: classes2.dex */
public class QLog {
    public static final int CLR = 2;
    public static final int DEV = 4;
    public static final String ERR_KEY = "qq_error|";
    public static final int LOG_ITEM_MAX_CACHE_SIZE = 50;
    public static final String TAG_REPORTLEVEL_COLORUSER = "W";
    public static final String TAG_REPORTLEVEL_DEVELOPER = "D";
    public static final String TAG_REPORTLEVEL_USER = "E";
    public static final int USR = 1;
    public static String sBuildNumber = "";

    /* JADX INFO: renamed from: d */
    public static void m85771d(String str, int i, String str2) {
        TXCLog.m84147d(str, "[" + getReportLevel(i) + Constants.AES_SUFFIX + str2);
    }

    public static void dumpCacheToFile() {
    }

    /* JADX INFO: renamed from: e */
    public static void m85773e(String str, int i, String str2) {
        TXCLog.m84149e(str, "[" + getReportLevel(i) + Constants.AES_SUFFIX + str2);
    }

    public static String getReportLevel(int i) {
        if (i != 2) {
            return i != 4 ? "E" : "D";
        }
        return "W";
    }

    public static String getStackTraceString(Throwable th) {
        return Log.getStackTraceString(th);
    }

    /* JADX INFO: renamed from: i */
    public static void m85775i(String str, int i, String str2) {
        TXCLog.m84152i(str, "[" + getReportLevel(i) + Constants.AES_SUFFIX + str2);
    }

    public static void init(Context context) {
    }

    public static boolean isColorLevel() {
        return true;
    }

    public static boolean isDevelopLevel() {
        return true;
    }

    /* JADX INFO: renamed from: p */
    public static void m85777p(String str, String str2) {
    }

    /* JADX INFO: renamed from: w */
    public static void m85778w(String str, int i, String str2) {
        TXCLog.m84156w(str, "[" + getReportLevel(i) + Constants.AES_SUFFIX + str2);
    }

    /* JADX INFO: renamed from: d */
    public static void m85772d(String str, int i, String str2, Throwable th) {
        TXCLog.m84147d(str, "[" + getReportLevel(i) + Constants.AES_SUFFIX + str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m85774e(String str, int i, String str2, Throwable th) {
        m85773e(str, i, str2);
    }

    /* JADX INFO: renamed from: i */
    public static void m85776i(String str, int i, String str2, Throwable th) {
        TXCLog.m84152i(str, "[" + getReportLevel(i) + Constants.AES_SUFFIX + str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m85779w(String str, int i, String str2, Throwable th) {
        TXCLog.m84156w(str, "[" + getReportLevel(i) + Constants.AES_SUFFIX + str2);
    }
}
