package com.immomo.resdownloader.log;

import android.util.Log;
import androidx.annotation.Keep;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
@Keep
public class MLog {
    private static String TAG = "CVSDK_LOG_TAG";
    private static boolean TOGGLE = false;

    private MLog() {
    }

    /* JADX INFO: renamed from: d */
    public static void m19459d(String str, String str2, Object... objArr) {
        if (TOGGLE) {
            Log.e(TAG + "_debug", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str + String.format(str2, objArr));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m19462e(String str, String str2, Object... objArr) {
        Log.e(TAG + "_error", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str + String.format(str2, objArr));
    }

    public static void printErrStackTrace(String str, Throwable th) {
        Log.e(TAG, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + th);
    }

    public static void printStakeTrace(IOException iOException) {
        if (TOGGLE) {
            Log.e(TAG, "printStakeTrace: ", iOException);
        }
    }

    public static void setEnable(boolean z) {
        TOGGLE = z;
    }

    /* JADX INFO: renamed from: w */
    public static void m19463w(String str, String str2) {
    }

    /* JADX INFO: renamed from: e */
    public static void m19461e(String str, String str2) {
        Log.e(TAG + "_error", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2);
    }

    /* JADX INFO: renamed from: d */
    public static void m19460d(String str, Object... objArr) {
        if (TOGGLE) {
            Log.e(TAG + "_debug", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str + objArr);
        }
    }
}
