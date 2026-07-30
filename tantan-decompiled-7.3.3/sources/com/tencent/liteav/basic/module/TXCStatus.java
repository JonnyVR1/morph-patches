package com.tencent.liteav.basic.module;

/* JADX INFO: loaded from: classes2.dex */
public class TXCStatus {
    /* JADX INFO: renamed from: a */
    public static boolean m84177a(String str, int i, int i2, Object obj) {
        if (str == null || str.length() == 0 || obj == null) {
            return false;
        }
        if (obj instanceof Double) {
            return nativeStatusSetDoubleValue(str, i, i2, ((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return nativeStatusSetStrValue(str, i, i2, (String) obj);
        }
        return obj instanceof Long ? nativeStatusSetIntValue(str, i, i2, ((Long) obj).longValue()) : nativeStatusSetIntValue(str, i, i2, ((Integer) obj).intValue());
    }

    /* JADX INFO: renamed from: b */
    public static String m84179b(String str, int i) {
        return m84180b(str, i, 0);
    }

    /* JADX INFO: renamed from: c */
    public static int m84182c(String str, int i) {
        return m84183c(str, i, 0);
    }

    /* JADX INFO: renamed from: d */
    public static double m84184d(String str, int i) {
        return m84185d(str, i, 0);
    }

    private static native double nativeStatusGetDoubleValue(String str, int i, int i2);

    private static native long nativeStatusGetIntValue(String str, int i, int i2);

    private static native String nativeStatusGetStrValue(String str, int i, int i2);

    private static native boolean nativeStatusSetDoubleValue(String str, int i, int i2, double d);

    private static native boolean nativeStatusSetIntValue(String str, int i, int i2, long j);

    private static native boolean nativeStatusSetStrValue(String str, int i, int i2, String str2);

    private static native void nativeStatusStartRecord(String str);

    private static native void nativeStatusStopRecord(String str);

    /* JADX INFO: renamed from: b */
    public static void m84181b(String str) {
        nativeStatusStopRecord(str);
    }

    /* JADX INFO: renamed from: c */
    public static int m84183c(String str, int i, int i2) {
        return (int) nativeStatusGetIntValue(str, i, i2);
    }

    /* JADX INFO: renamed from: d */
    public static double m84185d(String str, int i, int i2) {
        return nativeStatusGetDoubleValue(str, i, i2);
    }

    /* JADX INFO: renamed from: b */
    public static String m84180b(String str, int i, int i2) {
        return nativeStatusGetStrValue(str, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m84178a(String str, int i, Object obj) {
        return m84177a(str, i, 0, obj);
    }

    /* JADX INFO: renamed from: a */
    public static void m84176a(String str) {
        nativeStatusStartRecord(str);
    }

    /* JADX INFO: renamed from: a */
    public static long m84174a(String str, int i) {
        return m84175a(str, i, 0);
    }

    /* JADX INFO: renamed from: a */
    public static long m84175a(String str, int i, int i2) {
        return nativeStatusGetIntValue(str, i, i2);
    }
}
