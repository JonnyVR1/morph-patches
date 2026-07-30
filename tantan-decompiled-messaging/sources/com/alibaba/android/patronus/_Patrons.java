package com.alibaba.android.patronus;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class _Patrons {
    private static final int ANDROID_VERSION_NOT_SUPPORT = 2001;
    private static final int ERROR_READ_VSS_FAILED = 1001;

    /* JADX INFO: renamed from: GB */
    private static final long f3848GB = 1073741824;
    private static final int HEAP_SIZE_IS_NOT_BIG_ENOUGH = 2002;

    /* JADX INFO: renamed from: KB */
    private static final long f3849KB = 1024;
    private static final int LOWER_LIMIT_IS_TOO_SMALL = 2003;
    private static final int MAX_CHECK_OF_STRICT_MODE = 5;

    /* JADX INFO: renamed from: MB */
    private static final long f3850MB = 1048576;
    private static boolean NATIVE_LIB_LOADED = false;

    /* JADX INFO: renamed from: S */
    private static final long f3851S = 1000;
    public static final String TAG = "Patrons";
    private static final float VSS_MAX_IN_V7A = 4.2949673E9f;
    private static long currentRegionSpaces = 0;
    private static final String numRegEx = "[^0-9]";
    private static final Pattern numPattern = Pattern.compile(numRegEx);
    private static Patrons.PatronsConfig config = new Patrons.PatronsConfig();
    private static Timer autoCheckVssTimer = null;
    private static final AtomicInteger strictCount = new AtomicInteger(0);

    public static class AutoCheckerTask extends TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (_Patrons.strictCount.get() != 0 && _Patrons.strictCount.addAndGet(1) > 5) {
                _Patrons.strictCount.set(0);
                _Patrons._start(_Patrons.config.periodOfCheck);
            }
            float vssSize = _Patrons.readVssSize() / _Patrons.VSS_MAX_IN_V7A;
            if (_Patrons.currentRegionSpaces - ((long) _Patrons.config.shrinkStep) < _Patrons.config.lowerLimit) {
                Log.e(_Patrons.TAG, "vss has no space to resize, stop watching. current space = " + _Patrons.currentRegionSpaces);
                _Patrons.stop();
                return;
            }
            if (vssSize > _Patrons.config.periodOfShrink) {
                if (!_Patrons.shrinkRegionSpace((int) _Patrons.currentRegionSpaces -= (long) _Patrons.config.shrinkStep)) {
                    Log.e(_Patrons.TAG, "vss resize failed, stop watching.");
                    _Patrons.stop();
                    return;
                } else {
                    _Patrons.readVssSize();
                    int i = _Patrons.config.shrinkStep;
                    _Patrons.strictCount.set(1);
                    _Patrons._start(_Patrons.config.periodOfCheck / 2);
                    return;
                }
            }
            if (_Patrons.getCurrentRegionSpaceSize() / 1048576 >= _Patrons.config.lowerLimit) {
                if (_Patrons.config.debuggable) {
                    _Patrons.strictCount.get();
                    _Patrons.getCurrentRegionSpaceSize();
                    return;
                }
                return;
            }
            Log.e(_Patrons.TAG, "current heap size (" + (_Patrons.getCurrentRegionSpaceSize() / 1048576) + ") less than lower limit (" + _Patrons.config.lowerLimit + ") stop watching.");
            _Patrons.stop();
        }
    }

    static {
        NATIVE_LIB_LOADED = false;
        if (isSupport()) {
            System.loadLibrary("patrons");
            NATIVE_LIB_LOADED = true;
        }
    }

    private _Patrons() {
    }

    public static synchronized int __init() {
        if (!isSupport()) {
            Log.e(TAG, "patrons init failed, android version or abi not match !");
            return 2001;
        }
        Patrons.PatronsConfig patronsConfig = config;
        int i__init = __init(true, patronsConfig.debuggable, patronsConfig.fixHuaweiBinderAbort);
        if (i__init != 0) {
            Log.e(TAG, "patrons native init failed !");
            return i__init;
        }
        long currentRegionSpaceSize = getCurrentRegionSpaceSize() / 1048576;
        currentRegionSpaces = currentRegionSpaceSize;
        if (currentRegionSpaceSize > 0 && currentRegionSpaceSize <= 1024) {
            Patrons.PatronsConfig patronsConfig2 = config;
            if (currentRegionSpaceSize < patronsConfig2.lowerLimit) {
                return 2003;
            }
            if (patronsConfig2.auto) {
                if (readVssSize() < 0) {
                    Log.e(TAG, "patrons read vss failed !");
                    return 1001;
                }
                toForeground();
            }
            readVssSize();
            return 0;
        }
        return 2002;
    }

    private static native int __init(boolean z, boolean z2, boolean z3);

    /* JADX INFO: Access modifiers changed from: private */
    public static void _start(int i) {
        if (config.auto) {
            Timer timer = autoCheckVssTimer;
            if (timer != null) {
                timer.cancel();
                autoCheckVssTimer = null;
            }
            Timer timer2 = new Timer();
            autoCheckVssTimer = timer2;
            long j = ((long) i) * 1000;
            timer2.schedule(new AutoCheckerTask(), j, j);
        }
    }

    private static void asyncWriteInitResultToFile(final Context context, final int i) {
        new Thread(new Runnable() { // from class: com.alibaba.android.patronus._Patrons.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String str = context.getDir("patrons", 0).getAbsolutePath() + File.separator;
                    _Patrons.stringToFile(String.valueOf(i), str.concat("code.txt"));
                    if (i != 0) {
                        _Patrons.stringToFile(_Patrons.dumpNativeLogs(false), str.concat("msg.txt"));
                    }
                } catch (Exception e) {
                    Log.e(_Patrons.TAG, "record init result failed, code = " + i, e);
                }
            }
        }).start();
    }

    public static native String dumpLogs(boolean z);

    public static String dumpNativeLogs(boolean z) {
        return NATIVE_LIB_LOADED ? dumpLogs(z) : "can not dump logs without native libs";
    }

    public static native long getCurrentRegionSpaceSize();

    public static void inBackground() {
        Timer timer;
        if (!config.auto || (timer = autoCheckVssTimer) == null) {
            return;
        }
        timer.cancel();
        autoCheckVssTimer = null;
    }

    public static synchronized int init(Context context, Patrons.PatronsConfig patronsConfig) {
        int i__init;
        if (patronsConfig != null) {
            try {
                config = patronsConfig;
            } catch (Throwable th) {
                throw th;
            }
        }
        config.toString();
        i__init = __init();
        if (config.recordInitResult && context != null) {
            asyncWriteInitResultToFile(context, i__init);
        }
        return i__init;
    }

    private static boolean isSupport() {
        int i = Build.VERSION.SDK_INT;
        return i >= 26 && i <= 31 && !Process.is64Bit();
    }

    public static long readVssSize() {
        String lowerCase;
        long j = -1;
        try {
            FileInputStream fileInputStream = new FileInputStream("/proc/" + Process.myPid() + "/status");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            do {
                String line = bufferedReader.readLine();
                if (line != null) {
                    lowerCase = line.toLowerCase();
                }
                fileInputStream.close();
                bufferedReader.close();
                return j;
            } while (!lowerCase.contains("vmsize"));
            j = ((long) Integer.parseInt(numPattern.matcher(lowerCase).replaceAll("").trim())) * 1024;
            fileInputStream.close();
            bufferedReader.close();
            return j;
        } catch (Exception unused) {
            Log.e(TAG, "read current status failed.");
            return j;
        }
    }

    public static native boolean shrinkRegionSpace(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static void stop() {
        inBackground();
        config.auto = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void stringToFile(String str, String str2) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str2));
            try {
                fileOutputStream.write((str + "\n\n").getBytes());
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "write content to file: " + str2 + " failed.", e);
        }
    }

    public static void toForeground() {
        strictCount.set(0);
        _start(config.periodOfCheck);
    }
}
