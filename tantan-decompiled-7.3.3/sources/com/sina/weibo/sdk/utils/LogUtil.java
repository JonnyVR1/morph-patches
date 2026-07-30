package com.sina.weibo.sdk.utils;

import android.util.Log;

/* JADX INFO: loaded from: classes11.dex */
public class LogUtil {
    public static boolean sIsLogEnable = false;

    /* JADX INFO: renamed from: d */
    public static void m81661d(String str, String str2) {
        if (sIsLogEnable) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            StringBuilder sb = new StringBuilder();
            sb.append(stackTraceElement.getFileName());
            sb.append("(");
            sb.append(stackTraceElement.getLineNumber());
            sb.append(") ");
            sb.append(stackTraceElement.getMethodName());
        }
    }

    public static void disableLog() {
        sIsLogEnable = false;
    }

    /* JADX INFO: renamed from: e */
    public static void m81662e(String str, String str2) {
        if (sIsLogEnable) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            Log.e(str, (stackTraceElement.getFileName() + "(" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + ": " + str2);
        }
    }

    public static void enableLog() {
        sIsLogEnable = true;
    }

    public static String getStackTraceMsg() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        return stackTraceElement.getFileName() + "(" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName();
    }

    /* JADX INFO: renamed from: i */
    public static void m81663i(String str, String str2) {
        if (sIsLogEnable) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            StringBuilder sb = new StringBuilder();
            sb.append(stackTraceElement.getFileName());
            sb.append("(");
            sb.append(stackTraceElement.getLineNumber());
            sb.append(") ");
            sb.append(stackTraceElement.getMethodName());
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m81664v(String str, String str2) {
        if (sIsLogEnable) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            StringBuilder sb = new StringBuilder();
            sb.append(stackTraceElement.getFileName());
            sb.append("(");
            sb.append(stackTraceElement.getLineNumber());
            sb.append(") ");
            sb.append(stackTraceElement.getMethodName());
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m81665w(String str, String str2) {
        if (sIsLogEnable) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            StringBuilder sb = new StringBuilder();
            sb.append(stackTraceElement.getFileName());
            sb.append("(");
            sb.append(stackTraceElement.getLineNumber());
            sb.append(") ");
            sb.append(stackTraceElement.getMethodName());
        }
    }
}
