package com.tencent.p101mm.opensdk.utils;

/* JADX INFO: loaded from: classes2.dex */
public class Log {
    private static ILog logImpl;

    /* JADX INFO: renamed from: d */
    public static void m84174d(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            return;
        }
        iLog.m84169d(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m84175e(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            android.util.Log.e(str, str2);
        } else {
            iLog.m84170e(str, str2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m84176i(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            return;
        }
        iLog.m84171i(str, str2);
    }

    public static void setLogImpl(ILog iLog) {
        logImpl = iLog;
    }

    /* JADX INFO: renamed from: v */
    public static void m84177v(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            return;
        }
        iLog.m84172v(str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m84178w(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            return;
        }
        iLog.m84173w(str, str2);
    }
}
