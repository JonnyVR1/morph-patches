package com.tencent.liteav.basic.log;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.liteav.basic.util.C14215f;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes2.dex */
public class TXCLog {
    public static final int LOG_ASYNC = 0;
    public static final int LOG_DEBUG = 1;
    public static final int LOG_ERROR = 4;
    public static final int LOG_FATAL = 5;
    public static final int LOG_INFO = 2;
    public static final int LOG_NONE = 6;
    public static final int LOG_SYNC = 1;
    public static final int LOG_VERBOSE = 0;
    public static final int LOG_WARNING = 3;
    private static boolean mEnableCallback = false;
    private static boolean mEnableCompress = true;
    private static boolean mEnableConsole = true;
    private static boolean mHasInit = false;
    private static InterfaceC14201a mListener = null;
    private static String mLogCacheDir = "";
    public static String mLogDir = "";
    private static int mLogLevel;
    private static final Object mLogLock = new Object();

    /* JADX INFO: renamed from: com.tencent.liteav.basic.log.TXCLog$a */
    public interface InterfaceC14201a {
        /* JADX INFO: renamed from: a */
        void mo84158a(int i, String str, String str2);
    }

    /* JADX INFO: renamed from: d */
    public static void m84148d(String str, String str2, Object... objArr) {
        log(1, str, String.format(str2, objArr));
    }

    /* JADX INFO: renamed from: e */
    public static void m84150e(String str, String str2, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
        }
        printWriter.close();
        m84149e(str, str2 + SignParameters.NEW_LINE + stringWriter.toString());
    }

    /* JADX INFO: renamed from: i */
    public static void m84153i(String str, String str2, Object... objArr) {
        log(2, str, String.format(str2, objArr));
    }

    public static boolean init() {
        File externalFilesDir;
        if (mHasInit) {
            return true;
        }
        synchronized (mLogLock) {
            try {
                if (mHasInit) {
                    return true;
                }
                boolean zM84239f = C14215f.m84239f();
                Context appContext = TXCCommonUtil.getAppContext();
                if (zM84239f && appContext != null) {
                    if (TextUtils.isEmpty(mLogDir) && (externalFilesDir = appContext.getExternalFilesDir(null)) != null) {
                        mLogDir = externalFilesDir.getAbsolutePath() + "/log/tencent/liteav";
                    }
                    mLogCacheDir = appContext.getFilesDir().getAbsolutePath() + "/log/tencent/liteav";
                    nativeLogInit();
                    nativeLogSetLevel(mLogLevel);
                    nativeLogSetConsole(mEnableConsole);
                    nativeLogOpen(0, mLogDir, mLogCacheDir, "LiteAV", mEnableCompress);
                    nativeEnableCallback(mEnableCallback);
                    mHasInit = true;
                }
                return mHasInit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void log(int i, String str, String str2) {
        int i2;
        String str3;
        String str4;
        if (init()) {
            i2 = i;
            str3 = str;
            str4 = str2;
            nativeLog(i2, str3, "", 0, "", str4);
        } else {
            i2 = i;
            str3 = str;
            str4 = str2;
        }
        log_callback(i2, str3, str4);
    }

    private static void log_callback(int i, String str, String str2) {
        InterfaceC14201a interfaceC14201a = mListener;
        if (interfaceC14201a != null) {
            interfaceC14201a.mo84158a(i, str, str2);
        }
    }

    private static native void nativeEnableCallback(boolean z);

    private static native void nativeLog(int i, String str, String str2, int i2, String str3, String str4);

    private static native void nativeLogClose();

    private static native void nativeLogInit();

    private static native void nativeLogOpen(int i, String str, String str2, String str3, boolean z);

    private static native void nativeLogSetConsole(boolean z);

    private static native void nativeLogSetLevel(int i);

    public static void setConsoleEnabled(boolean z) {
        mEnableConsole = z;
        if (mHasInit) {
            nativeLogSetConsole(z);
        }
    }

    public static void setLevel(int i) {
        mLogLevel = i;
        if (mHasInit) {
            nativeLogSetLevel(i);
        }
    }

    public static void setListener(InterfaceC14201a interfaceC14201a) {
        mListener = interfaceC14201a;
        boolean z = interfaceC14201a != null;
        mEnableCallback = z;
        if (mHasInit) {
            nativeEnableCallback(z);
        }
    }

    public static void setLogCompressEnabled(boolean z) {
        if (mEnableCompress != z) {
            mEnableCompress = z;
            if (mHasInit) {
                nativeLogClose();
                nativeLogOpen(0, mLogDir, mLogCacheDir, "LiteAV", mEnableCompress);
            }
        }
    }

    public static void setLogDirPath(String str) {
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase(mLogDir)) {
            return;
        }
        mLogDir = str;
        if (mHasInit) {
            nativeLogClose();
            nativeLogOpen(0, mLogDir, mLogCacheDir, "LiteAV", mEnableCompress);
        }
    }

    public static void sliceLogFile() {
        if (mHasInit) {
            nativeLogOpen(0, mLogDir, mLogCacheDir, "LiteAV", mEnableCompress);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m84155v(String str, String str2, Object... objArr) {
        log(0, str, String.format(str2, objArr));
    }

    /* JADX INFO: renamed from: w */
    public static void m84157w(String str, String str2, Object... objArr) {
        log(3, str, String.format(str2, objArr));
    }

    /* JADX INFO: renamed from: d */
    public static void m84147d(String str, String str2) {
        log(1, str, str2);
    }

    /* JADX INFO: renamed from: i */
    public static void m84152i(String str, String str2) {
        log(2, str, str2);
    }

    /* JADX INFO: renamed from: v */
    public static void m84154v(String str, String str2) {
        log(0, str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m84156w(String str, String str2) {
        log(3, str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m84149e(String str, String str2) {
        log(4, str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m84151e(String str, String str2, Object... objArr) {
        log(4, str, String.format(str2, objArr));
    }
}
