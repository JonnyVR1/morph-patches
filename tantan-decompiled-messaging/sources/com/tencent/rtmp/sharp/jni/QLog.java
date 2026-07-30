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
    public static void m84588d(String str, int i, String str2) {
        TXCLog.m82964d(str, "[" + getReportLevel(i) + Constants.AES_SUFFIX + str2);
    }

    public static void dumpCacheToFile() {
    }

    /* JADX INFO: renamed from: e */
    public static void m84590e(String str, int i, String str2) {
        TXCLog.m82966e(str, "[" + getReportLevel(i) + Constants.AES_SUFFIX + str2);
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
    public static void m84592i(String str, int i, String str2) {
        TXCLog.m82969i(str, "[" + getReportLevel(i) + Constants.AES_SUFFIX + str2);
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
    public static void m84594p(String str, String str2) {
    }

    /* JADX INFO: renamed from: w */
    public static void m84595w(String str, int i, String str2) {
        TXCLog.m82973w(str, "[" + getReportLevel(i) + Constants.AES_SUFFIX + str2);
    }

    /* JADX INFO: renamed from: d */
    public static void m84589d(String str, int i, String str2, Throwable th) {
        TXCLog.m82964d(str, "[" + getReportLevel(i) + Constants.AES_SUFFIX + str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m84591e(String str, int i, String str2, Throwable th) {
        m84590e(str, i, str2);
    }

    /* JADX INFO: renamed from: i */
    public static void m84593i(String str, int i, String str2, Throwable th) {
        TXCLog.m82969i(str, "[" + getReportLevel(i) + Constants.AES_SUFFIX + str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m84596w(String str, int i, String str2, Throwable th) {
        TXCLog.m82973w(str, "[" + getReportLevel(i) + Constants.AES_SUFFIX + str2);
    }
}
