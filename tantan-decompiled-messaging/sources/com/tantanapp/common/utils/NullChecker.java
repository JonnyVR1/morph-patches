package com.tantanapp.common.utils;

/* JADX INFO: loaded from: classes13.dex */
public class NullChecker {

    public static class TantanNullException extends Exception {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m81303a(Object obj) {
        return obj != null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m81304b(Object obj) {
        if (obj != null) {
            return true;
        }
        CrashHelper.m81296c(new TantanNullException());
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m81305c(Object obj, String str, CrashHelper.ReportLevel reportLevel) {
        if (obj != null) {
            return true;
        }
        CrashHelper.m81298e(new TantanNullException(), str, reportLevel);
        return false;
    }
}
