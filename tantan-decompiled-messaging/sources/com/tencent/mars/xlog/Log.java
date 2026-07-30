package com.tencent.mars.xlog;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.widget.Toast;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes2.dex */
public class Log {
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_ERROR = 4;
    public static final int LEVEL_FATAL = 5;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_NONE = 6;
    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_WARNING = 3;
    private static final String SYS_INFO;
    private static final String TAG = "mars.xlog.log";
    private static LogImp debugLog = null;
    private static int level = 6;
    private static LogImp logImp;
    public static Context toastSupportContext;

    public interface LogImp {
        void appenderClose();

        void appenderFlush(boolean z);

        int getLogLevel();

        void logD(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);

        void logE(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);

        void logF(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);

        void logI(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);

        void logV(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);

        void logW(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);
    }

    static {
        LogImp logImp2 = new LogImp() { // from class: com.tencent.mars.xlog.Log.1
            private Handler handler = new Handler(Looper.getMainLooper());

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void appenderClose() {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void appenderFlush(boolean z) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public int getLogLevel() {
                return Log.level;
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logD(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
                int unused = Log.level;
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logE(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
                if (Log.level <= 4) {
                    android.util.Log.e(str, str4);
                }
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logF(String str, String str2, String str3, int i, int i2, long j, long j2, final String str4) {
                if (Log.level > 5) {
                    return;
                }
                android.util.Log.e(str, str4);
                if (Log.toastSupportContext != null) {
                    this.handler.post(new Runnable() { // from class: com.tencent.mars.xlog.Log.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Toast.makeText(Log.toastSupportContext, str4, 1).show();
                        }
                    });
                }
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logI(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
                int unused = Log.level;
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logV(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
                int unused = Log.level;
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logW(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
                int unused = Log.level;
            }
        };
        debugLog = logImp2;
        logImp = logImp2;
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("VERSION.RELEASE:[" + Build.VERSION.RELEASE);
            sb.append("] VERSION.CODENAME:[" + Build.VERSION.CODENAME);
            sb.append("] VERSION.INCREMENTAL:[" + Build.VERSION.INCREMENTAL);
            sb.append("] BOARD:[" + Build.BOARD);
            sb.append("] DEVICE:[" + Build.DEVICE);
            sb.append("] DISPLAY:[" + Build.DISPLAY);
            sb.append("] FINGERPRINT:[" + Build.FINGERPRINT);
            sb.append("] HOST:[" + Build.HOST);
            sb.append("] MANUFACTURER:[" + Build.MANUFACTURER);
            sb.append("] MODEL:[" + Build.MODEL);
            sb.append("] PRODUCT:[" + Build.PRODUCT);
            sb.append("] TAGS:[" + Build.TAGS);
            sb.append("] TYPE:[" + Build.TYPE);
            sb.append("] USER:[" + Build.USER + Constants.AES_SUFFIX);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        SYS_INFO = sb.toString();
    }

    public static void appenderClose() {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderClose();
        }
    }

    public static void appenderFlush(boolean z) {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderFlush(z);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m84146d(String str, String str2, Object... objArr) {
        if (logImp != null) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            logImp.logD(str, "", "", 0, Process.myPid(), Process.myTid(), Looper.getMainLooper().getThread().getId(), str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m84148e(String str, String str2, Object... objArr) {
        if (logImp != null) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            logImp.logE(str, "", "", 0, Process.myPid(), Process.myTid(), Looper.getMainLooper().getThread().getId(), str2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m84150f(String str, String str2, Object... objArr) {
        if (logImp != null) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            logImp.logF(str, "", "", 0, Process.myPid(), Process.myTid(), Looper.getMainLooper().getThread().getId(), str2);
        }
    }

    public static LogImp getImpl() {
        return logImp;
    }

    public static int getLogLevel() {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            return logImp2.getLogLevel();
        }
        return 6;
    }

    public static String getSysInfo() {
        return SYS_INFO;
    }

    /* JADX INFO: renamed from: i */
    public static void m84152i(String str, String str2, Object... objArr) {
        if (logImp != null) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            logImp.logI(str, "", "", 0, Process.myPid(), Process.myTid(), Looper.getMainLooper().getThread().getId(), str2);
        }
    }

    public static void printErrStackTrace(String str, Throwable th, String str2, Object... objArr) {
        if (logImp != null) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            logImp.logE(str, "", "", 0, Process.myPid(), Process.myTid(), Looper.getMainLooper().getThread().getId(), str2 + "  " + android.util.Log.getStackTraceString(th));
        }
    }

    public static void setLevel(int i, boolean z) {
        level = i;
        if (z) {
            Xlog.setLogLevel(i);
        }
    }

    public static void setLogImp(LogImp logImp2) {
        logImp = logImp2;
    }

    /* JADX INFO: renamed from: v */
    public static void m84154v(String str, String str2, Object... objArr) {
        if (logImp != null) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            logImp.logV(str, "", "", 0, Process.myPid(), Process.myTid(), Looper.getMainLooper().getThread().getId(), str2);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m84156w(String str, String str2, Object... objArr) {
        if (logImp != null) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            logImp.logW(str, "", "", 0, Process.myPid(), Process.myTid(), Looper.getMainLooper().getThread().getId(), str2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m84149f(String str, String str2) {
        m84150f(str, str2, null);
    }

    /* JADX INFO: renamed from: d */
    public static void m84145d(String str, String str2) {
        m84146d(str, str2, null);
    }

    /* JADX INFO: renamed from: e */
    public static void m84147e(String str, String str2) {
        m84148e(str, str2, null);
    }

    /* JADX INFO: renamed from: i */
    public static void m84151i(String str, String str2) {
        m84152i(str, str2, null);
    }

    /* JADX INFO: renamed from: v */
    public static void m84153v(String str, String str2) {
        m84154v(str, str2, null);
    }

    /* JADX INFO: renamed from: w */
    public static void m84155w(String str, String str2) {
        m84156w(str, str2, null);
    }
}
