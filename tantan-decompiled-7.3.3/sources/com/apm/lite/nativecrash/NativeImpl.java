package com.apm.lite.nativecrash;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import p153l.b6r0;
import p153l.fuq0;
import p153l.j5r0;
import p153l.n0r0;
import p153l.n6r0;
import p153l.pwq0;

/* JADX INFO: loaded from: classes.dex */
public class NativeImpl {
    private static boolean sResendSigQuit = true;
    private static volatile boolean soLoaded = false;
    private static volatile boolean soLoadedSuccess = false;

    /* JADX INFO: renamed from: com.apm.lite.nativecrash.NativeImpl$a */
    public static class RunnableC0928a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                NativeImpl.m5184v();
            } catch (Throwable th) {
                try {
                    pwq0.m174076c(th, "NPTH_ANR_MONITOR_ERROR");
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m5164b(int i) {
        if (soLoadedSuccess) {
            try {
                doCloseFile(i);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m5165c() {
        if (soLoadedSuccess) {
            return doCreateCallbackThread();
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static void m5166d(String str) {
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
    public static int m5167e(String str) {
        if (soLoadedSuccess && !TextUtils.isEmpty(str)) {
            try {
                return doLock(str, -1);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static void m5168f(String str) {
        if (soLoadedSuccess) {
            try {
                doDumpFds(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m5169g(String str, String str2, String str3) {
        if (soLoadedSuccess) {
            try {
                doDumpLogcat(str, str2, str3);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m5170h(String str) {
        if (soLoadedSuccess) {
            try {
                doDumpMaps(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m5171i(String str) {
        if (soLoadedSuccess) {
            try {
                doDumpMemInfo(str);
            } catch (Throwable unused) {
            }
        }
    }

    private static native boolean is64Bit();

    /* JADX INFO: renamed from: j */
    public static void m5172j(String str) {
        if (soLoadedSuccess) {
            try {
                doDumpThreads(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m5173k() {
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
    public static String m5174l(String str) {
        if (soLoadedSuccess) {
            return doGetCrashHeader(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static void m5175m() {
        if (soLoadedSuccess) {
            doInitThreadDump();
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m5176n() {
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
    public static boolean m5177o() {
        return sResendSigQuit;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m5178p() {
        if (soLoaded) {
            return soLoadedSuccess;
        }
        soLoaded = true;
        if (!soLoadedSuccess) {
            soLoadedSuccess = b6r0.m102795a("apmlitea");
        }
        return soLoadedSuccess;
    }

    /* JADX INFO: renamed from: q */
    public static int m5179q(String str) {
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
    public static void m5180r(File file) {
        if (soLoadedSuccess) {
            doRebuildTombstone(j5r0.m143577m(file).getAbsolutePath(), j5r0.m143573i(file).getAbsolutePath(), j5r0.m143580p(file).getAbsolutePath());
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m5181s() {
        if (soLoadedSuccess) {
            doSignalMainThread();
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m5182t(boolean z) {
        sResendSigQuit = z;
        if (soLoadedSuccess) {
            doSetResendSigQuit(z ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m5183u() {
        if (soLoadedSuccess) {
            doSetUploadEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static void m5184v() {
        if (soLoadedSuccess) {
            try {
                doStartAnrMonitor(Build.VERSION.SDK_INT);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static boolean m5185w(Context context) {
        String strM127524a;
        boolean zM5178p = m5178p();
        if (zM5178p) {
            String str = j5r0.m143557E(context) + "/apmlite";
            new File(str).mkdirs();
            if (new File(context.getApplicationInfo().nativeLibraryDir, "libapmliteb.so").exists()) {
                strM127524a = context.getApplicationInfo().nativeLibraryDir;
            } else {
                strM127524a = fuq0.m127524a();
                fuq0.m127527d("apmliteb");
            }
            doStart(Build.VERSION.SDK_INT, strM127524a, str, n0r0.m161021h(), n0r0.m161027n());
        }
        return zM5178p;
    }

    /* JADX INFO: renamed from: x */
    public static void m5186x() {
        n6r0.m161797a(new RunnableC0928a(), "NPTH-AnrMonitor");
    }

    /* JADX INFO: renamed from: y */
    public static int m5187y(int i) {
        if (soLoadedSuccess && i >= 0) {
            try {
                return doLock("", i);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public static void m5188z(int i, String str) {
        if (!soLoadedSuccess || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            doWriteFile(i, str, str.length());
        } catch (Throwable unused) {
        }
    }
}
