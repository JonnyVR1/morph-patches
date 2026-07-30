package com.cosmos.mdlog;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import android.widget.Toast;
import com.clevertap.android.sdk.Constants;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MDLog {
    private static boolean DEBUG_MODE = false;
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_ERROR = 5;
    public static final int LEVEL_EVENT = 3;
    public static final int LEVEL_FATAL = 6;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_NONE = 7;
    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_WARNING = 4;
    public static final int STACK_OFFSET = 4;
    private static final String SYS_INFO;
    private static LogImp debugLog = null;
    private static boolean isOpenStackInfo = false;
    private static int level = 7;
    private static LogImp logImp;
    private static Class<?> logWrapperClass;
    private static IMDLogHook mdLogHook;
    public static Context toastSupportContext;

    public interface LogImp {
        void appenderClose();

        void appenderFlush(boolean z);

        void clearAllWhiteList();

        int getLevel();

        List<String> getWhiteListTags();

        boolean isLogcatOpen();

        void logD(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);

        void logE(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);

        void logEvent(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);

        void logF(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);

        void logI(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);

        void logV(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);

        void logW(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);

        void registerWhiteList(List<String> list);

        void setLevel(int i);

        void setLogcatOpen(boolean z);
    }

    static {
        LogImp logImp2 = new LogImp() { // from class: com.cosmos.mdlog.MDLog.1
            private Handler handler = new Handler(Looper.getMainLooper());

            @Override // com.cosmos.mdlog.MDLog.LogImp
            public void appenderClose() {
            }

            @Override // com.cosmos.mdlog.MDLog.LogImp
            public void appenderFlush(boolean z) {
            }

            @Override // com.cosmos.mdlog.MDLog.LogImp
            public void clearAllWhiteList() {
            }

            @Override // com.cosmos.mdlog.MDLog.LogImp
            public int getLevel() {
                return MDLog.level;
            }

            @Override // com.cosmos.mdlog.MDLog.LogImp
            public List<String> getWhiteListTags() {
                return null;
            }

            @Override // com.cosmos.mdlog.MDLog.LogImp
            public boolean isLogcatOpen() {
                return false;
            }

            @Override // com.cosmos.mdlog.MDLog.LogImp
            public void logD(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
                int unused = MDLog.level;
            }

            @Override // com.cosmos.mdlog.MDLog.LogImp
            public void logE(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
                if (MDLog.level <= 5) {
                    Log.e(str, str4);
                }
            }

            @Override // com.cosmos.mdlog.MDLog.LogImp
            public void logEvent(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
                int unused = MDLog.level;
            }

            @Override // com.cosmos.mdlog.MDLog.LogImp
            public void logF(String str, String str2, String str3, int i, int i2, long j, long j2, final String str4) {
                if (MDLog.level > 6) {
                    return;
                }
                Log.e(str, str4);
                if (MDLog.toastSupportContext != null) {
                    this.handler.post(new Runnable() { // from class: com.cosmos.mdlog.MDLog.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Toast.makeText(MDLog.toastSupportContext, str4, 1).show();
                        }
                    });
                }
            }

            @Override // com.cosmos.mdlog.MDLog.LogImp
            public void logI(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
                int unused = MDLog.level;
            }

            @Override // com.cosmos.mdlog.MDLog.LogImp
            public void logV(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
                int unused = MDLog.level;
            }

            @Override // com.cosmos.mdlog.MDLog.LogImp
            public void logW(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
                int unused = MDLog.level;
            }

            @Override // com.cosmos.mdlog.MDLog.LogImp
            public void registerWhiteList(List<String> list) {
            }

            @Override // com.cosmos.mdlog.MDLog.LogImp
            public void setLevel(int i) {
            }

            @Override // com.cosmos.mdlog.MDLog.LogImp
            public void setLogcatOpen(boolean z) {
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

    public static void clearAllWhiteList() {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.clearAllWhiteList();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m7444d(String str, String str2, Object... objArr) {
        int lineNumber;
        String str3;
        String str4;
        StackTraceElement invokeStack;
        if (level > 1 || logImp == null || isWhiteListIntercept(str)) {
            return;
        }
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        String str5 = str2 == null ? "" : str2;
        IMDLogHook iMDLogHook = mdLogHook;
        if (iMDLogHook == null || !iMDLogHook.onLogPrint(1, str, str5)) {
            if (!isOpenStackInfo || (invokeStack = getInvokeStack()) == null) {
                lineNumber = 0;
                str3 = "";
                str4 = str3;
            } else {
                String fileName = invokeStack.getFileName();
                String methodName = invokeStack.getMethodName();
                lineNumber = invokeStack.getLineNumber();
                str3 = fileName;
                str4 = methodName;
            }
            logImp.logD(str, str3, str4, lineNumber, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str5);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m7446e(String str, String str2, Object... objArr) {
        int lineNumber;
        String str3;
        String str4;
        StackTraceElement invokeStack;
        if (level > 5 || logImp == null || isWhiteListIntercept(str)) {
            return;
        }
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        String str5 = str2 == null ? "" : str2;
        IMDLogHook iMDLogHook = mdLogHook;
        if (iMDLogHook == null || !iMDLogHook.onLogPrint(5, str, str5)) {
            if (!isOpenStackInfo || (invokeStack = getInvokeStack()) == null) {
                lineNumber = 0;
                str3 = "";
                str4 = str3;
            } else {
                String fileName = invokeStack.getFileName();
                String methodName = invokeStack.getMethodName();
                lineNumber = invokeStack.getLineNumber();
                str3 = fileName;
                str4 = methodName;
            }
            logImp.logE(str, str3, str4, lineNumber, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str5);
        }
    }

    public static void event(String str, String str2, Object... objArr) {
        int lineNumber;
        String str3;
        String str4;
        StackTraceElement invokeStack;
        if (level > 3 || logImp == null || isWhiteListIntercept(str)) {
            return;
        }
        String str5 = objArr == null ? str2 : String.format(str2, objArr);
        String str6 = str5 == null ? "" : str5;
        IMDLogHook iMDLogHook = mdLogHook;
        if (iMDLogHook == null || !iMDLogHook.onLogPrint(3, str, String.format(str2, objArr))) {
            if (!isOpenStackInfo || (invokeStack = getInvokeStack()) == null) {
                lineNumber = 0;
                str3 = "";
                str4 = str3;
            } else {
                String fileName = invokeStack.getFileName();
                String methodName = invokeStack.getMethodName();
                lineNumber = invokeStack.getLineNumber();
                str4 = methodName;
                str3 = fileName;
            }
            logImp.logEvent(str, str3, str4, lineNumber, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str6);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m7448f(String str, String str2, Object... objArr) {
        int lineNumber;
        String str3;
        String str4;
        StackTraceElement invokeStack;
        if (level > 6 || logImp == null || isWhiteListIntercept(str)) {
            return;
        }
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        String str5 = str2;
        IMDLogHook iMDLogHook = mdLogHook;
        if (iMDLogHook == null || !iMDLogHook.onLogPrint(6, str, str5)) {
            if (!isOpenStackInfo || (invokeStack = getInvokeStack()) == null) {
                lineNumber = 0;
                str3 = "";
                str4 = str3;
            } else {
                String fileName = invokeStack.getFileName();
                String methodName = invokeStack.getMethodName();
                lineNumber = invokeStack.getLineNumber();
                str3 = fileName;
                str4 = methodName;
            }
            logImp.logF(str, str3, str4, lineNumber, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str5);
        }
    }

    public static LogImp getImpl() {
        return logImp;
    }

    private static StackTraceElement getInvokeStack() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (logWrapperClass == null) {
            return MDLog.class.getName().equals(stackTrace[4].getClassName()) ? stackTrace[5] : stackTrace[4];
        }
        String className = stackTrace[4].getClassName();
        String className2 = 5 < stackTrace.length - 1 ? stackTrace[5].getClassName() : null;
        if (!logWrapperClass.getName().equals(className) && !MDLog.class.getName().equals(className)) {
            return stackTrace[4];
        }
        if (!logWrapperClass.getName().equals(className2) && !MDLog.class.getName().equals(className2)) {
            return stackTrace[5];
        }
        int length = stackTrace.length;
        boolean z = false;
        for (int i = 4; i < length; i++) {
            if (logWrapperClass.getName().equals(stackTrace[i].getClassName())) {
                z = true;
            } else if (z) {
                return stackTrace[i];
            }
        }
        return null;
    }

    public static int getLogLevel() {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            return logImp2.getLevel();
        }
        return 7;
    }

    public static void getLogWrapperClass() {
        getLogWrapperClass();
    }

    public static IMDLogHook getMdLogHook() {
        return mdLogHook;
    }

    public static String getSysInfo() {
        return SYS_INFO;
    }

    public static List<String> getWhiteListTags() {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            return logImp2.getWhiteListTags();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static void m7450i(String str, String str2, Object... objArr) {
        int lineNumber;
        String str3;
        String str4;
        StackTraceElement invokeStack;
        if (level > 2 || logImp == null || isWhiteListIntercept(str)) {
            return;
        }
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        String str5 = str2 == null ? "" : str2;
        IMDLogHook iMDLogHook = mdLogHook;
        if (iMDLogHook == null || !iMDLogHook.onLogPrint(2, str, str5)) {
            if (!isOpenStackInfo || (invokeStack = getInvokeStack()) == null) {
                lineNumber = 0;
                str3 = "";
                str4 = str3;
            } else {
                String fileName = invokeStack.getFileName();
                String methodName = invokeStack.getMethodName();
                lineNumber = invokeStack.getLineNumber();
                str3 = fileName;
                str4 = methodName;
            }
            logImp.logI(str, str3, str4, lineNumber, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str5);
        }
    }

    public static boolean isConsoleLogOpen() {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            return logImp2.isLogcatOpen();
        }
        return false;
    }

    public static boolean isOpenStackInfo() {
        return isOpenStackInfo;
    }

    public static boolean isWhiteListIntercept(String str) {
        LogImp logImp2;
        List<String> whiteListTags;
        return (DEBUG_MODE || (logImp2 = logImp) == null || (whiteListTags = logImp2.getWhiteListTags()) == null || whiteListTags.size() <= 0 || whiteListTags.contains(str)) ? false : true;
    }

    public static void openFileWrite(String str, String str2) {
        XLogImpl.open(true, 0, str, str2, "mdlog_");
        XLogImpl.appenderSetMaxFileSize(307200L);
        setLogImp(new XLogImpl());
    }

    public static void printErrStackTrace(String str, Throwable th, String str2, Object... objArr) {
        int lineNumber;
        String str3;
        String str4;
        StackTraceElement invokeStack;
        if (level > 5 || logImp == null || isWhiteListIntercept(str)) {
            return;
        }
        String str5 = str2 == null ? "" : str2;
        if (objArr != null) {
            str5 = String.format(str5, objArr);
        }
        if (!isOpenStackInfo || (invokeStack = getInvokeStack()) == null) {
            lineNumber = 0;
            str3 = "";
            str4 = str3;
        } else {
            String fileName = invokeStack.getFileName();
            String methodName = invokeStack.getMethodName();
            lineNumber = invokeStack.getLineNumber();
            str3 = fileName;
            str4 = methodName;
        }
        int i = lineNumber;
        String str6 = str5 + "  " + Log.getStackTraceString(th);
        IMDLogHook iMDLogHook = mdLogHook;
        if (iMDLogHook == null || !iMDLogHook.onLogPrint(5, str, str6)) {
            logImp.logE(str, str3, str4, i, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str6);
        }
    }

    public static void registerWhiteList(List<String> list) {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.registerWhiteList(list);
        }
    }

    public static void setConsoleLogOpen(boolean z) {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.setLogcatOpen(z);
        }
    }

    public static void setDebugMode() {
        DEBUG_MODE = true;
    }

    public static void setLevel(int i) {
        level = i;
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.setLevel(i);
        }
    }

    public static void setLogImp(LogImp logImp2) {
        logImp = logImp2;
    }

    public static void setLogWrapperClass(Class<?> cls) {
        logWrapperClass = cls;
    }

    public static void setMdLogHook(IMDLogHook iMDLogHook) {
        mdLogHook = iMDLogHook;
    }

    public static void setOpenStackInfo(boolean z) {
        isOpenStackInfo = z;
    }

    /* JADX INFO: renamed from: v */
    public static void m7452v(String str, String str2, Object... objArr) {
        String str3;
        String str4;
        int lineNumber;
        StackTraceElement invokeStack;
        if (level > 0 || logImp == null || isWhiteListIntercept(str)) {
            return;
        }
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        String str5 = str2 == null ? "" : str2;
        IMDLogHook iMDLogHook = mdLogHook;
        if (iMDLogHook == null || !iMDLogHook.onLogPrint(0, str, str5)) {
            if (!isOpenStackInfo || (invokeStack = getInvokeStack()) == null) {
                str3 = "";
                str4 = str3;
                lineNumber = 0;
            } else {
                String fileName = invokeStack.getFileName();
                String methodName = invokeStack.getMethodName();
                lineNumber = invokeStack.getLineNumber();
                str3 = fileName;
                str4 = methodName;
            }
            logImp.logV(str, str3, str4, lineNumber, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str5);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m7454w(String str, String str2, Object... objArr) {
        int lineNumber;
        String str3;
        String str4;
        StackTraceElement invokeStack;
        if (level > 4 || logImp == null || isWhiteListIntercept(str)) {
            return;
        }
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        String str5 = str2 == null ? "" : str2;
        IMDLogHook iMDLogHook = mdLogHook;
        if (iMDLogHook == null || !iMDLogHook.onLogPrint(4, str, str5)) {
            if (!isOpenStackInfo || (invokeStack = getInvokeStack()) == null) {
                lineNumber = 0;
                str3 = "";
                str4 = str3;
            } else {
                String fileName = invokeStack.getFileName();
                String methodName = invokeStack.getMethodName();
                lineNumber = invokeStack.getLineNumber();
                str3 = fileName;
                str4 = methodName;
            }
            logImp.logW(str, str3, str4, lineNumber, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str5);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m7447f(String str, String str2) {
        m7448f(str, str2, null);
    }

    /* JADX INFO: renamed from: v */
    public static void m7451v(String str, String str2) {
        m7452v(str, str2, null);
    }

    /* JADX INFO: renamed from: d */
    public static void m7443d(String str, String str2) {
        m7444d(str, str2, null);
    }

    /* JADX INFO: renamed from: e */
    public static void m7445e(String str, String str2) {
        m7446e(str, str2, null);
    }

    /* JADX INFO: renamed from: i */
    public static void m7449i(String str, String str2) {
        m7450i(str, str2, null);
    }

    /* JADX INFO: renamed from: w */
    public static void m7453w(String str, String str2) {
        m7454w(str, str2, null);
    }

    public static void printErrStackTrace(String str, Throwable th) {
        printErrStackTrace(str, th, "", new Object[0]);
    }
}
