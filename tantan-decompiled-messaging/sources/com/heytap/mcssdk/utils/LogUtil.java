package com.heytap.mcssdk.utils;

import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public class LogUtil {
    public static final String TAG = "mcssdk---";

    /* JADX INFO: renamed from: sD */
    private static boolean f11825sD = true;

    /* JADX INFO: renamed from: sE */
    private static boolean f11826sE = true;

    /* JADX INFO: renamed from: sI */
    private static boolean f11827sI = false;
    private static boolean sIsDebug = true;
    private static String sSeparator = "-->";

    /* JADX INFO: renamed from: sV */
    private static boolean f11828sV = false;

    /* JADX INFO: renamed from: sW */
    private static boolean f11829sW = true;
    private static String special = "MCS";

    /* JADX INFO: renamed from: d */
    public static void m17465d(String str) {
    }

    /* JADX INFO: renamed from: e */
    public static void m17468e(String str) {
        if (f11826sE && sIsDebug) {
            Log.e(TAG, special + sSeparator + str);
        }
    }

    public static String getSeprateor() {
        return sSeparator;
    }

    public static String getSpecial() {
        return special;
    }

    /* JADX INFO: renamed from: i */
    public static void m17471i(String str) {
    }

    public static boolean isD() {
        return f11825sD;
    }

    public static boolean isDebugs() {
        return sIsDebug;
    }

    public static boolean isE() {
        return f11826sE;
    }

    public static boolean isI() {
        return f11827sI;
    }

    public static boolean isV() {
        return f11828sV;
    }

    public static boolean isW() {
        return f11829sW;
    }

    public static void setD(boolean z) {
        f11825sD = z;
    }

    public static void setDebugs(boolean z) {
        sIsDebug = z;
        boolean z2 = z;
        f11828sV = z2;
        f11825sD = z2;
        f11827sI = z2;
        f11829sW = z2;
        f11826sE = z2;
    }

    public static void setE(boolean z) {
        f11826sE = z;
    }

    public static void setI(boolean z) {
        f11827sI = z;
    }

    public static void setSeprateor(String str) {
        sSeparator = str;
    }

    public static void setSpecial(String str) {
        special = str;
    }

    public static void setV(boolean z) {
        f11828sV = z;
    }

    public static void setW(boolean z) {
        f11829sW = z;
    }

    /* JADX INFO: renamed from: v */
    public static void m17473v(String str) {
    }

    /* JADX INFO: renamed from: w */
    public static void m17475w(String str) {
    }

    /* JADX INFO: renamed from: d */
    public static void m17466d(String str, String str2) {
    }

    /* JADX INFO: renamed from: e */
    public static void m17467e(Exception exc) {
        if (f11826sE) {
            exc.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m17472i(String str, String str2) {
    }

    /* JADX INFO: renamed from: v */
    public static void m17474v(String str, String str2) {
    }

    /* JADX INFO: renamed from: w */
    public static void m17476w(String str, String str2) {
    }

    /* JADX INFO: renamed from: e */
    public static void m17469e(String str, String str2) {
        if (f11826sE && sIsDebug) {
            Log.e(str, special + sSeparator + str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m17470e(String str, Throwable th) {
        if (f11826sE) {
            Log.e(str, th.toString());
        }
    }
}
