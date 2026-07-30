package com.tencent.rtmp;

import com.tencent.liteav.basic.log.TXCLog;

/* JADX INFO: loaded from: classes2.dex */
public class TXLog {
    /* JADX INFO: renamed from: d */
    public static void m84525d(String str, String str2) {
        wrietLogMessage(1, str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m84526e(String str, String str2) {
        wrietLogMessage(4, str, str2);
    }

    /* JADX INFO: renamed from: i */
    public static void m84527i(String str, String str2) {
        wrietLogMessage(2, str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m84528w(String str, String str2) {
        wrietLogMessage(3, str, str2);
    }

    private static void wrietLogMessage(int i, String str, String str2) {
        TXCLog.log(i, str, "thread ID:" + Thread.currentThread().getId() + "|line:-1|" + str2);
    }
}
