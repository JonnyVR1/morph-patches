package com.tantanapp.media.ttmediautils.log;

import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;

/* JADX INFO: loaded from: classes13.dex */
public class SLog {
    private static boolean ISDEBUG = false;
    private static final boolean IS_LOG_RUNTIME_INFO = true;
    private static final String TTMEDIA = "TTMEDIA";

    /* JADX INFO: renamed from: d */
    public static void m81407d(String str, String str2, Object... objArr) {
        if (ISDEBUG) {
            String.format(str2, objArr);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m81411e(String str, String str2, Object... objArr) {
        if (ISDEBUG) {
            Log.e(str, String.format(str2, objArr));
        }
    }

    private static String getStackString(Exception exc) {
        StringBuilder sb = new StringBuilder();
        if (ISDEBUG) {
            try {
                for (StackTraceElement stackTraceElement : exc.getStackTrace()) {
                    sb.append(SignParameters.NEW_LINE);
                    sb.append(stackTraceElement.toString());
                }
            } catch (Exception unused) {
            }
        }
        return sb.toString();
    }

    public static String getStackTraceString(Throwable th) {
        return ISDEBUG ? Log.getStackTraceString(th) : "";
    }

    public static String getTraceInfo() {
        if (!ISDEBUG) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer("[file:");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        stringBuffer.append(stackTrace[1].getFileName());
        stringBuffer.append(",line:");
        stringBuffer.append(stackTrace[1].getLineNumber());
        stringBuffer.append(",method:");
        stringBuffer.append(stackTrace[1].getMethodName() + "];");
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: i */
    public static void m81414i(String str) {
    }

    public static void printStackTrace(Throwable th) {
        if (ISDEBUG) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m81417v(String str) {
    }

    /* JADX INFO: renamed from: w */
    public static void m81419w(String str) {
    }

    /* JADX INFO: renamed from: i */
    public static void m81415i(String str, String str2) {
    }

    /* JADX INFO: renamed from: v */
    public static void m81418v(String str, String str2) {
    }

    /* JADX INFO: renamed from: w */
    public static void m81420w(String str, String str2) {
    }

    /* JADX INFO: renamed from: i */
    public static void m81416i(String str, String str2, Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static void m81406d(String str, String str2) {
    }

    /* JADX INFO: renamed from: d */
    public static void m81405d(String str) {
    }

    /* JADX INFO: renamed from: e */
    public static void m81409e(String str, String str2) {
        if (ISDEBUG) {
            Log.e(str, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m81412e(String str, Throwable th) {
        if (ISDEBUG) {
            Log.e(TTMEDIA, str, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m81410e(String str, String str2, Throwable th) {
        if (ISDEBUG) {
            Log.e(str, str2, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m81408e(String str) {
        if (ISDEBUG) {
            Log.e(TTMEDIA, str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m81413e(String str, Throwable th, String str2, Object... objArr) {
        if (ISDEBUG) {
            Log.e(str, String.format(str2, objArr), th);
        }
    }
}
