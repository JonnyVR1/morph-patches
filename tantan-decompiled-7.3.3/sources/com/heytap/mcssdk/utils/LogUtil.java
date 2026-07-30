package com.heytap.mcssdk.utils;

import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public class LogUtil {
    public static final String TAG = "mcssdk---";

    /* JADX INFO: renamed from: sD */
    private static boolean f12566sD = true;

    /* JADX INFO: renamed from: sE */
    private static boolean f12567sE = true;

    /* JADX INFO: renamed from: sI */
    private static boolean f12568sI = false;
    private static boolean sIsDebug = true;
    private static String sSeparator = "-->";

    /* JADX INFO: renamed from: sV */
    private static boolean f12569sV = false;

    /* JADX INFO: renamed from: sW */
    private static boolean f12570sW = true;
    private static String special = "MCS";

    /* JADX INFO: renamed from: d */
    public static void m18542d(String str) {
    }

    /* JADX INFO: renamed from: e */
    public static void m18545e(String str) {
        if (f12567sE && sIsDebug) {
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
    public static void m18548i(String str) {
    }

    public static boolean isD() {
        return f12566sD;
    }

    public static boolean isDebugs() {
        return sIsDebug;
    }

    public static boolean isE() {
        return f12567sE;
    }

    public static boolean isI() {
        return f12568sI;
    }

    public static boolean isV() {
        return f12569sV;
    }

    public static boolean isW() {
        return f12570sW;
    }

    public static void setD(boolean z) {
        f12566sD = z;
    }

    public static void setDebugs(boolean z) {
        sIsDebug = z;
        boolean z2 = z;
        f12569sV = z2;
        f12566sD = z2;
        f12568sI = z2;
        f12570sW = z2;
        f12567sE = z2;
    }

    public static void setE(boolean z) {
        f12567sE = z;
    }

    public static void setI(boolean z) {
        f12568sI = z;
    }

    public static void setSeprateor(String str) {
        sSeparator = str;
    }

    public static void setSpecial(String str) {
        special = str;
    }

    public static void setV(boolean z) {
        f12569sV = z;
    }

    public static void setW(boolean z) {
        f12570sW = z;
    }

    /* JADX INFO: renamed from: v */
    public static void m18550v(String str) {
    }

    /* JADX INFO: renamed from: w */
    public static void m18552w(String str) {
    }

    /* JADX INFO: renamed from: d */
    public static void m18543d(String str, String str2) {
    }

    /* JADX INFO: renamed from: e */
    public static void m18544e(Exception exc) {
        if (f12567sE) {
            exc.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m18549i(String str, String str2) {
    }

    /* JADX INFO: renamed from: v */
    public static void m18551v(String str, String str2) {
    }

    /* JADX INFO: renamed from: w */
    public static void m18553w(String str, String str2) {
    }

    /* JADX INFO: renamed from: e */
    public static void m18546e(String str, String str2) {
        if (f12567sE && sIsDebug) {
            Log.e(str, special + sSeparator + str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m18547e(String str, Throwable th) {
        if (f12567sE) {
            Log.e(str, th.toString());
        }
    }
}
