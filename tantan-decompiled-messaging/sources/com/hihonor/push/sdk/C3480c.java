package com.hihonor.push.sdk;

import com.tencent.liteav.TXLiteAVCode;

/* JADX INFO: renamed from: com.hihonor.push.sdk.c */
/* JADX INFO: loaded from: classes7.dex */
public class C3480c {
    /* JADX INFO: renamed from: a */
    public static void m17503a(String str) {
        String strSubstring;
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClass().equals(C3480c.class)) {
                String className = stackTrace[i].getClassName();
                strSubstring = className.substring(className.lastIndexOf(46) + 1);
                m17504a("HonorPush_".concat(strSubstring), str, null);
            }
        }
        strSubstring = "";
        m17504a("HonorPush_".concat(strSubstring), str, null);
    }

    /* JADX INFO: renamed from: a */
    public static void m17504a(String str, String str2, Throwable th) {
        if (str2.length() > 4000) {
            int i = 0;
            while (i < str2.length()) {
                int length = str2.length();
                int i2 = i + TXLiteAVCode.WARNING_START_CAPTURE_IGNORED;
                if (length > i2) {
                    str2.substring(i, i2);
                } else {
                    str2.substring(i);
                }
                i = i2;
            }
        }
    }
}
