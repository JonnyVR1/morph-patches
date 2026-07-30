package com.tencent.p106mm.opensdk.utils;

/* JADX INFO: loaded from: classes2.dex */
public class Log {
    private static ILog logImpl;

    /* JADX INFO: renamed from: d */
    public static void m85357d(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            return;
        }
        iLog.m85352d(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m85358e(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            android.util.Log.e(str, str2);
        } else {
            iLog.m85353e(str, str2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m85359i(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            return;
        }
        iLog.m85354i(str, str2);
    }

    public static void setLogImpl(ILog iLog) {
        logImpl = iLog;
    }

    /* JADX INFO: renamed from: v */
    public static void m85360v(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            return;
        }
        iLog.m85355v(str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m85361w(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            return;
        }
        iLog.m85356w(str, str2);
    }
}
