package com.tantanapp.common.utils;

/* JADX INFO: loaded from: classes11.dex */
public class NullChecker {

    public static class TantanNullException extends Exception {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m82486a(Object obj) {
        return obj != null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m82487b(Object obj) {
        if (obj != null) {
            return true;
        }
        CrashHelper.m82479c(new TantanNullException());
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m82488c(Object obj, String str, CrashHelper.ReportLevel reportLevel) {
        if (obj != null) {
            return true;
        }
        CrashHelper.m82481e(new TantanNullException(), str, reportLevel);
        return false;
    }
}
