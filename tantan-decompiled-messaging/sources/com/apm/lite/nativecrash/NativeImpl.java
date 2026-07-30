package com.apm.lite.nativecrash;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import p149l.dwq0;
import p149l.hrq0;
import p149l.hxq0;
import p149l.jnq0;
import p149l.vwq0;
import p149l.zkq0;

/* JADX INFO: loaded from: classes.dex */
public class NativeImpl {
    private static boolean sResendSigQuit = true;
    private static volatile boolean soLoaded = false;
    private static volatile boolean soLoadedSuccess = false;

    /* JADX INFO: renamed from: com.apm.lite.nativecrash.NativeImpl$a */
    public static class RunnableC0924a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                NativeImpl.m5174v();
            } catch (Throwable th) {
                try {
                    jnq0.m142385c(th, "NPTH_ANR_MONITOR_ERROR");
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m5154b(int i) {
        if (soLoadedSuccess) {
            try {
                doCloseFile(i);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m5155c() {
        if (soLoadedSuccess) {
            return doCreateCallbackThread();
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static void m5156d(String str) {
        if (soLoadedSuccess) {
            doDump(str);
        }
    }

    private static native boolean doCheckNativeCrash();

    private static native void doCloseFile(int i);

    private static native int doCreateCallbackThread();

    private static native void doDump(String str);

    private static native void doDumpFds(String str);

    private static native void doDumpHprof(String str);

    private static native void doDumpLogcat(String str, String str2, String str3);

    private static native void doDumpMaps(String str);

    private static native void doDumpMemInfo(String str);

    private static native void doDumpThreads(String str);

    private static native long doGetAppCpuTime();

    private static native long doGetChildCpuTime();

    private static native String doGetCrashHeader(String str);

    private static native long doGetDeviceCpuTime();

    private static native int doGetFDCount();

    private static native String[] doGetFdDump(int i, int i2, int[] iArr, String[] strArr);

    private static native long doGetFreeMemory();

    private static native long doGetThreadCpuTime(int i);

    private static native int doGetThreadsCount();

    private static native long doGetTotalMemory();

    private static native long doGetVMSize();

    private static native void doInitThreadDump();

    private static native int doLock(String str, int i);

    private static native int doOpenFile(String str);

    private static native void doRebuildTombstone(String str, String str2, String str3);

    private static native void doSetAlogConfigPath(String str);

    private static native void doSetAlogFlushAddr(long j);

    private static native void doSetAlogLogDirAddr(long j);

    private static native void doSetResendSigQuit(int i);

    private static native void doSetUploadEnd();

    private static native void doSignalMainThread();

    private static native int doStart(int i, String str, String str2, String str3, int i2);

    private static native void doStartAnrMonitor(int i);

    private static native void doWriteFile(int i, String str, int i2);

    /* JADX INFO: renamed from: e */
    public static int m5157e(String str) {
        if (soLoadedSuccess && !TextUtils.isEmpty(str)) {
            try {
                return doLock(str, -1);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static void m5158f(String str) {
        if (soLoadedSuccess) {
            try {
                doDumpFds(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m5159g(String str, String str2, String str3) {
        if (soLoadedSuccess) {
            try {
                doDumpLogcat(str, str2, str3);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m5160h(String str) {
        if (soLoadedSuccess) {
            try {
                doDumpMaps(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m5161i(String str) {
        if (soLoadedSuccess) {
            try {
                doDumpMemInfo(str);
            } catch (Throwable unused) {
            }
        }
    }

    private static native boolean is64Bit();

    /* JADX INFO: renamed from: j */
    public static void m5162j(String str) {
        if (soLoadedSuccess) {
            try {
                doDumpThreads(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m5163k() {
        if (!soLoadedSuccess) {
            return false;
        }
        try {
            return doCheckNativeCrash();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m5164l(String str) {
        if (soLoadedSuccess) {
            return doGetCrashHeader(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static void m5165m() {
        if (soLoadedSuccess) {
            doInitThreadDump();
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m5166n() {
        if (!soLoadedSuccess) {
            return false;
        }
        try {
            return is64Bit();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: o */
    public static boolean m5167o() {
        return sResendSigQuit;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m5168p() {
        if (soLoaded) {
            return soLoadedSuccess;
        }
        soLoaded = true;
        if (!soLoadedSuccess) {
            soLoadedSuccess = vwq0.m200436a("apmlitea");
        }
        return soLoadedSuccess;
    }

    /* JADX INFO: renamed from: q */
    public static int m5169q(String str) {
        if (!soLoadedSuccess) {
            return -1;
        }
        try {
            return doOpenFile(str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m5170r(File file) {
        if (soLoadedSuccess) {
            doRebuildTombstone(dwq0.m113925m(file).getAbsolutePath(), dwq0.m113921i(file).getAbsolutePath(), dwq0.m113928p(file).getAbsolutePath());
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m5171s() {
        if (soLoadedSuccess) {
            doSignalMainThread();
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m5172t(boolean z) {
        sResendSigQuit = z;
        if (soLoadedSuccess) {
            doSetResendSigQuit(z ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m5173u() {
        if (soLoadedSuccess) {
            doSetUploadEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static void m5174v() {
        if (soLoadedSuccess) {
            try {
                doStartAnrMonitor(Build.VERSION.SDK_INT);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static boolean m5175w(Context context) {
        String strM219196a;
        boolean zM5168p = m5168p();
        if (zM5168p) {
            String str = dwq0.m113905E(context) + "/apmlite";
            new File(str).mkdirs();
            if (new File(context.getApplicationInfo().nativeLibraryDir, "libapmliteb.so").exists()) {
                strM219196a = context.getApplicationInfo().nativeLibraryDir;
            } else {
                strM219196a = zkq0.m219196a();
                zkq0.m219199d("apmliteb");
            }
            doStart(Build.VERSION.SDK_INT, strM219196a, str, hrq0.m132699h(), hrq0.m132705n());
        }
        return zM5168p;
    }

    /* JADX INFO: renamed from: x */
    public static void m5176x() {
        hxq0.m133368a(new RunnableC0924a(), "NPTH-AnrMonitor");
    }

    /* JADX INFO: renamed from: y */
    public static int m5177y(int i) {
        if (soLoadedSuccess && i >= 0) {
            try {
                return doLock("", i);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public static void m5178z(int i, String str) {
        if (!soLoadedSuccess || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            doWriteFile(i, str, str.length());
        } catch (Throwable unused) {
        }
    }
}
