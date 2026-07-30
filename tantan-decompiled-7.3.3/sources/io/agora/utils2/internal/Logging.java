package io.agora.utils2.internal;

import io.agora.base.internal.CalledByNative;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes2.dex */
public class Logging {
    private static final int AGORA_LOG_DEBUG = 2048;
    private static final int AGORA_LOG_ERROR = 4;
    private static final int AGORA_LOG_INFO = 1;
    private static final int AGORA_LOG_WARN = 2;
    private static int nativeLogLevel = 2055;

    /* JADX INFO: renamed from: d */
    public static void m88106d(String str, String str2, Throwable th) {
        log(2048, str, str2);
        log(2048, str, th.toString());
        log(2048, str, getStackTraceString(th));
    }

    /* JADX INFO: renamed from: e */
    public static void m88109e(String str, String str2, Throwable th) {
        log(4, str, str2);
        log(4, str, th.toString());
        log(4, str, getStackTraceString(th));
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        try {
            th.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        } catch (Throwable unused) {
            String message = th.getMessage();
            return message == null ? "" : message;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m88110i(String str) {
        if ((nativeLogLevel & 1) != 0) {
            nativeLog(1, str);
        }
    }

    public static void log(int i, String str, String str2) {
        if ((nativeLogLevel & i) != 0) {
            nativeLog(i, "[" + str + "] " + str2);
        }
    }

    public static native int nativeLog(int i, String str);

    @CalledByNative
    public static void setNativeLogLevel(int i) {
        nativeLogLevel = i;
        io.agora.base.internal.Logging.setNativeLogLevel(i);
    }

    /* JADX INFO: renamed from: w */
    public static void m88114w(String str, String str2, Throwable th) {
        log(2, str, str2);
        log(2, str, th.toString());
        log(2, str, getStackTraceString(th));
    }

    /* JADX INFO: renamed from: d */
    public static void m88105d(String str, String str2) {
        log(2048, str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m88108e(String str, String str2) {
        log(4, str, str2);
    }

    /* JADX INFO: renamed from: i */
    public static void m88111i(String str, String str2) {
        log(1, str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m88113w(String str, String str2) {
        log(2, str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static void m88104d(String str) {
        if ((nativeLogLevel & 2048) != 0) {
            nativeLog(2048, str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m88107e(String str) {
        if ((nativeLogLevel & 4) != 0) {
            nativeLog(4, str);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m88112w(String str) {
        if ((nativeLogLevel & 2) != 0) {
            nativeLog(2, str);
        }
    }
}
