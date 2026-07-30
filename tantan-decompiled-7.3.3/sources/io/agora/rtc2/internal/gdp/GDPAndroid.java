package io.agora.rtc2.internal.gdp;

import android.app.ActivityManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.opengl.GLES20;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.momo.mcamera.mask.BigEyeFilter;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.ThreadUtils;
import io.agora.utils2.internal.CommonUtility;
import io.agora.utils2.internal.Logging;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class GDPAndroid {
    private static final FileFilter CPU_FILTER = new FileFilter() { // from class: io.agora.rtc2.internal.gdp.GDPAndroid.2
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };
    private static final List<String> CPU_TEMP_FILE_PATHS = Arrays.asList("/sys/devices/system/cpu/cpu0/cpufreq/cpu_temp", "/sys/devices/system/cpu/cpu0/cpufreq/FakeShmoo_cpu_temp", "/sys/class/thermal/thermal_zone0/temp", "/sys/class/i2c-adapter/i2c-4/4-004c/temperature", "/sys/devices/platform/tegra-i2c.3/i2c-4/4-004c/temperature", "/sys/devices/platform/omap/omap_temp_sensor.0/temperature", "/sys/devices/platform/tegra_tmon/temp1_input", "/sys/kernel/debug/tegra_thermal/temp_tj", "/sys/devices/platform/s5p-tmu/temperature", "/sys/class/thermal/thermal_zone1/temp", "/sys/class/hwmon/hwmon0/device/temp1_input", "/sys/devices/virtual/thermal/thermal_zone1/temp", "/sys/devices/virtual/thermal/thermal_zone0/temp", "/sys/class/thermal/thermal_zone3/temp", "/sys/class/thermal/thermal_zone4/temp", "/sys/class/hwmon/hwmonX/temp1_input", "/sys/devices/platform/s5p-tmu/curr_temp");
    private static final int DEVICEINFO_UNKNOWN = -1;
    private static final int OP_TIMEOUT_MS = 100;
    private static final String TAG = "GDPAndroid";
    private static boolean mockGDPAndroid = false;
    private String mGpuVendor = "unkown";
    private String mGpuRenderer = "unkown";

    public static class BackGround implements Runnable {

        /* JADX INFO: renamed from: bg */
        static boolean f64038bg = false;
        final CountDownLatch runDone = new CountDownLatch(1);

        public boolean checkBackgroundSafe() {
            new Thread(this).start();
            if (!ThreadUtils.awaitUninterruptibly(this.runDone, 100L)) {
                Logging.m88108e(GDPAndroid.TAG, "checkBackgroundSafe timeout");
            }
            return f64038bg;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            int i = runningAppProcessInfo.importance;
            f64038bg = (i == 100 || i == 200) ? false : true;
            this.runDone.countDown();
        }
    }

    public static class BatteryLevel implements Runnable {
        static int batt;
        final CountDownLatch runDone = new CountDownLatch(1);

        public int getBatteryLevelSafe() {
            new Thread(this).start();
            if (!ThreadUtils.awaitUninterruptibly(this.runDone, 100L)) {
                Logging.m88108e(GDPAndroid.TAG, "getBatteryLevelSafe timeout");
            }
            return batt;
        }

        @Override // java.lang.Runnable
        public void run() {
            batt = GDPAndroid.getBatteryLevel();
            this.runDone.countDown();
        }
    }

    public static class CPUMaxFreqKHz implements Runnable {
        static int freq = -1;
        final CountDownLatch runDone = new CountDownLatch(1);

        public int getCPUMaxFreqKHzSafe() {
            new Thread(this).start();
            if (!ThreadUtils.awaitUninterruptibly(this.runDone, 100L)) {
                Logging.m88108e(GDPAndroid.TAG, "getCPUMaxFreqKHzSafe timeout");
            }
            return freq;
        }

        @Override // java.lang.Runnable
        public void run() {
            freq = GDPAndroid.getCPUMaxFreqKHz();
            this.runDone.countDown();
        }
    }

    public static class CPUTemperature implements Runnable {
        static double currentTemp;
        final CountDownLatch runDone = new CountDownLatch(1);

        public int getCpuTemperatureSafe() {
            new Thread(this).start();
            if (!ThreadUtils.awaitUninterruptibly(this.runDone, 100L)) {
                Logging.m88108e(GDPAndroid.TAG, "getCpuTemperatureSafe timeout");
            }
            return (int) (currentTemp * 1000.0d);
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            StringBuilder sb;
            for (int i = 0; i < GDPAndroid.CPU_TEMP_FILE_PATHS.size(); i++) {
                String str = (String) GDPAndroid.CPU_TEMP_FILE_PATHS.get(i);
                double oneLine = GDPAndroid.readOneLine(new File(str));
                if (GDPAndroid.isTemperatureValid(oneLine) || GDPAndroid.mockGDPAndroid) {
                    currentTemp = oneLine;
                    sb = new StringBuilder("getCpuTemperature valid path:");
                } else {
                    double d = oneLine / 1000.0d;
                    if (GDPAndroid.isTemperatureValid(d)) {
                        currentTemp = d;
                        sb = new StringBuilder("getCpuTemperature valid path:");
                    }
                }
                sb.append(str);
                Logging.m88105d(GDPAndroid.TAG, sb.toString());
            }
            this.runDone.countDown();
        }
    }

    public static class NumberOfCpuCores implements Runnable {
        static int cores = -1;
        final CountDownLatch runDone = new CountDownLatch(1);

        public int getNumberOfCpuCoresSafe() {
            new Thread(this).start();
            if (!ThreadUtils.awaitUninterruptibly(this.runDone, 100L)) {
                Logging.m88108e(GDPAndroid.TAG, "getNumberOfCpuCoresSafe timeout");
            }
            return cores;
        }

        @Override // java.lang.Runnable
        public void run() {
            cores = GDPAndroid.getNumberOfCPUCores();
            this.runDone.countDown();
        }
    }

    public static class TotalMemory implements Runnable {
        static int mem;
        final CountDownLatch runDone = new CountDownLatch(1);

        public int getTotalMemorySafe() {
            new Thread(this).start();
            if (!ThreadUtils.awaitUninterruptibly(this.runDone, 100L)) {
                Logging.m88108e(GDPAndroid.TAG, "getTotalMemorySafe timeout");
            }
            return mem;
        }

        @Override // java.lang.Runnable
        public void run() {
            mem = (int) (GDPAndroid.getTotalMemory(ContextUtils.getApplicationContext()) / 1024);
            this.runDone.countDown();
        }
    }

    @CalledByNative
    public GDPAndroid() {
        if (!isEGL14SupportedHere() || CommonUtility.isSimulator()) {
            return;
        }
        gatherGlInfo();
    }

    private static int extractValue(byte[] bArr, int i) {
        byte b;
        while (i < bArr.length && (b = bArr[i]) != 10) {
            if (Character.isDigit(b)) {
                int i2 = i + 1;
                while (i2 < bArr.length && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return Integer.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }

    private void gatherGlInfo() {
        try {
            HandlerThread handlerThread = new HandlerThread("Get_GL_info_thread");
            handlerThread.start();
            ThreadUtils.invokeAtFrontUninterruptibly(new Handler(handlerThread.getLooper()), new Runnable() { // from class: io.agora.rtc2.internal.gdp.GDPAndroid.1
                @Override // java.lang.Runnable
                public void run() {
                    EglCore eglCore = new EglCore(null, 2);
                    OffscreenSurface offscreenSurface = new OffscreenSurface(eglCore, 1, 1);
                    offscreenSurface.makeCurrent();
                    GDPAndroid.this.mGpuVendor = GLES20.glGetString(7936);
                    GDPAndroid.this.mGpuRenderer = GLES20.glGetString(7937);
                    offscreenSurface.release();
                    eglCore.release();
                }
            });
            handlerThread.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getBatteryLevel() {
        if (ContextUtils.getApplicationContext() == null) {
            return 0;
        }
        if (mockGDPAndroid) {
            Intent intentRegisterReceiver = new ContextWrapper(ContextUtils.getApplicationContext()).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                return (intentRegisterReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) * 100) / intentRegisterReceiver.getIntExtra(BigEyeFilter.UNIFORM_SCALE, -1);
            }
            return 0;
        }
        BatteryManager batteryManager = (BatteryManager) ContextUtils.getApplicationContext().getSystemService("batterymanager");
        if (batteryManager != null) {
            return batteryManager.getIntProperty(4);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getCPUMaxFreqKHz() {
        int unknowCPUMax = -1;
        int maxFreq = -1;
        for (int i = 0; i < getNumberOfCPUCores(); i++) {
            try {
                maxFreq = getMaxFreq(i, maxFreq);
            } catch (IOException unused) {
            }
        }
        unknowCPUMax = (maxFreq == -1 || mockGDPAndroid) ? getUnknowCPUMax(maxFreq) : maxFreq;
        Logging.m88105d(TAG, "max freq:" + unknowCPUMax);
        return unknowCPUMax;
    }

    private static int getCoresFromCPUFileList() {
        return new File("/sys/devices/system/cpu/").listFiles(CPU_FILTER).length;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040 A[Catch: IOException -> 0x003c, TRY_LEAVE, TryCatch #7 {IOException -> 0x003c, blocks: (B:21:0x0038, B:25:0x0040), top: B:43:0x0038 }] */
    private static int getCoresFromFileInfo(String str) throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        BufferedReader bufferedReader;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                try {
                    int coresFromFileString = getCoresFromFileString(bufferedReader.readLine());
                    try {
                        fileInputStream.close();
                        bufferedReader.close();
                        return coresFromFileString;
                    } catch (IOException e) {
                        e.printStackTrace();
                        return coresFromFileString;
                    }
                } catch (IOException unused) {
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                            return -1;
                        }
                    }
                    if (bufferedReader == null) {
                        return -1;
                    }
                    bufferedReader.close();
                    return -1;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                        } catch (IOException e3) {
                            e3.printStackTrace();
                            throw th;
                        }
                    } else if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            } catch (IOException unused2) {
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (IOException unused3) {
            bufferedReader = null;
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
            bufferedReader = null;
        }
    }

    private static int getCoresFromFileString(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    private static int getMaxFreq(int i, int i2) throws IOException {
        File file = new File("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_max_freq");
        if (file.exists() && file.canRead()) {
            byte[] bArr = new byte[128];
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    int i3 = fileInputStream.read(bArr);
                    int i4 = 0;
                    while (Character.isDigit(bArr[i4]) && i4 < i3) {
                        i4++;
                    }
                    int i5 = Integer.parseInt(new String(bArr, 0, i4));
                    if (i5 > i2) {
                        i2 = i5;
                    }
                    return i2;
                } finally {
                    fileInputStream.close();
                }
            } catch (FileNotFoundException | NumberFormatException | SecurityException unused) {
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getNumberOfCPUCores() {
        AtomicInteger atomicInteger = new AtomicInteger();
        try {
            atomicInteger.set(getCoresFromFileInfo("/sys/devices/system/cpu/possible"));
            if (atomicInteger.get() == -1 || mockGDPAndroid) {
                atomicInteger.set(getCoresFromFileInfo("/sys/devices/system/cpu/present"));
            }
            if (atomicInteger.get() == -1 || mockGDPAndroid) {
                atomicInteger.set(getCoresFromCPUFileList());
            }
        } catch (NullPointerException | SecurityException unused) {
            atomicInteger.set(-1);
        }
        Logging.m88105d(TAG, "cores:" + atomicInteger);
        return atomicInteger.get();
    }

    public static String getSocName() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Method method = cls.getMethod("get", String.class);
            return ((String) method.invoke(cls, "ro.soc.manufacturer")) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((String) method.invoke(cls, "ro.soc.model"));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getTotalMemory(Context context) {
        if (context == null) {
            return 0L;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        Logging.m88105d(TAG, "total mem:" + memoryInfo.totalMem);
        return memoryInfo.totalMem;
    }

    public static int getUnknowCPUMax(int i) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream("/proc/cpuinfo");
            int fileForValue = parseFileForValue("cpu MHz", fileInputStream);
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int i2 = fileForValue * 1000;
            if (i2 > i) {
                return i2;
            }
            return -1;
        } catch (IOException | SecurityException unused) {
            return -1;
        }
    }

    private boolean isEGL14SupportedHere() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isTemperatureValid(double d) {
        return d >= -30.0d && d <= 250.0d;
    }

    private static int match(int i, String str, int i2, byte[] bArr) {
        for (int i3 = i; i3 < i2; i3++) {
            int i4 = i3 - i;
            if (bArr[i3] != str.charAt(i4)) {
                return -1;
            }
            if (i4 == str.length() - 1) {
                return extractValue(bArr, i3);
            }
        }
        return -1;
    }

    private static int parseFileForValue(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[1024];
        try {
            int i = fileInputStream.read(bArr);
            int i2 = 0;
            while (i2 < i) {
                byte b = bArr[i2];
                if (b == 10 || i2 == 0) {
                    if (b == 10) {
                        i2++;
                    }
                    int iMatch = match(i2, str, i, bArr);
                    if (iMatch > 0) {
                        return iMatch;
                    }
                }
                i2++;
            }
            return -1;
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x0031 A[Catch: IOException -> 0x0036, PHI: r1 r3 r4 r6
      0x0031: PHI (r1v7 double) = (r1v0 double), (r1v0 double), (r1v0 double), (r1v13 double) binds: [B:52:0x0086, B:59:0x0096, B:66:0x00a6, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0031: PHI (r3v13 java.io.FileInputStream) = 
      (r3v14 java.io.FileInputStream)
      (r3v10 java.io.FileInputStream)
      (r3v11 java.io.FileInputStream)
      (r3v14 java.io.FileInputStream)
     binds: [B:52:0x0086, B:59:0x0096, B:66:0x00a6, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0031: PHI (r4v13 java.io.BufferedReader) = 
      (r4v9 java.io.BufferedReader)
      (r4v10 java.io.BufferedReader)
      (r4v11 java.io.BufferedReader)
      (r4v25 java.io.BufferedReader)
     binds: [B:52:0x0086, B:59:0x0096, B:66:0x00a6, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0031: PHI (r6v19 ??) = (r6v15 ??), (r6v16 ??), (r6v17 ??), (r6v25 ??) binds: [B:52:0x0086, B:59:0x0096, B:66:0x00a6, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {IOException -> 0x0036, blocks: (B:12:0x002b, B:13:0x0031, B:49:0x007e, B:51:0x0083, B:56:0x008e, B:58:0x0093, B:63:0x009e, B:65:0x00a3), top: B:82:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x008e A[Catch: IOException -> 0x0036, TRY_ENTER, TryCatch #0 {IOException -> 0x0036, blocks: (B:12:0x002b, B:13:0x0031, B:49:0x007e, B:51:0x0083, B:56:0x008e, B:58:0x0093, B:63:0x009e, B:65:0x00a3), top: B:82:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0093 A[Catch: IOException -> 0x0036, TRY_LEAVE, TryCatch #0 {IOException -> 0x0036, blocks: (B:12:0x002b, B:13:0x0031, B:49:0x007e, B:51:0x0083, B:56:0x008e, B:58:0x0093, B:63:0x009e, B:65:0x00a3), top: B:82:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x009e A[Catch: IOException -> 0x0036, TRY_ENTER, TryCatch #0 {IOException -> 0x0036, blocks: (B:12:0x002b, B:13:0x0031, B:49:0x007e, B:51:0x0083, B:56:0x008e, B:58:0x0093, B:63:0x009e, B:65:0x00a3), top: B:82:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00a3 A[Catch: IOException -> 0x0036, TRY_LEAVE, TryCatch #0 {IOException -> 0x0036, blocks: (B:12:0x002b, B:13:0x0031, B:49:0x007e, B:51:0x0083, B:56:0x008e, B:58:0x0093, B:63:0x009e, B:65:0x00a3), top: B:82:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00b4 A[Catch: IOException -> 0x00b0, TryCatch #6 {IOException -> 0x00b0, blocks: (B:70:0x00ac, B:74:0x00b4, B:76:0x00b9), top: B:84:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00b9 A[Catch: IOException -> 0x00b0, TRY_LEAVE, TryCatch #6 {IOException -> 0x00b0, blocks: (B:70:0x00ac, B:74:0x00b4, B:76:0x00b9), top: B:84:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0086, code lost:
    
        if (r4 != null) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.io.InputStreamReader, java.io.Reader] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static double readOneLine(File file) throws Throwable {
        BufferedReader bufferedReader;
        FileInputStream fileInputStream;
        IOException e;
        FileNotFoundException e2;
        double d = -100000.0d;
        if (!file.exists() || !file.canRead()) {
            return -100000.0d;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    fileInputStream = new FileInputStream((File) file);
                    try {
                        file = new InputStreamReader(fileInputStream);
                        try {
                            bufferedReader = new BufferedReader(file);
                            try {
                                d = Double.parseDouble(bufferedReader.readLine());
                                fileInputStream.close();
                                file.close();
                            } catch (FileNotFoundException e3) {
                                e2 = e3;
                                e2.printStackTrace();
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (file != 0) {
                                    file.close();
                                }
                                if (bufferedReader != null) {
                                }
                                return d;
                            } catch (IOException e4) {
                                e = e4;
                                e.printStackTrace();
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (file != 0) {
                                    file.close();
                                }
                                if (bufferedReader != null) {
                                }
                                return d;
                            } catch (SecurityException unused) {
                                fileInputStream2 = fileInputStream;
                                file = file;
                                if (fileInputStream2 != null) {
                                    fileInputStream2.close();
                                }
                                if (file != 0) {
                                    file.close();
                                }
                            }
                        } catch (FileNotFoundException e5) {
                            bufferedReader = null;
                            e2 = e5;
                        } catch (IOException e6) {
                            bufferedReader = null;
                            e = e6;
                        } catch (SecurityException unused2) {
                            bufferedReader = null;
                        } catch (Throwable th) {
                            bufferedReader = null;
                            th = th;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                    if (file != 0) {
                                        file.close();
                                    }
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                } catch (IOException e7) {
                                    e7.printStackTrace();
                                    throw th;
                                }
                            } else {
                                if (file != 0) {
                                    file.close();
                                }
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException e8) {
                        e = e8;
                        bufferedReader = null;
                        e2 = e;
                        file = bufferedReader;
                        e2.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (file != 0) {
                            file.close();
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return d;
                    } catch (IOException e9) {
                        e = e9;
                        bufferedReader = null;
                        e = e;
                        file = bufferedReader;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (file != 0) {
                            file.close();
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return d;
                    } catch (SecurityException unused3) {
                        file = 0;
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = null;
                        th = th;
                        file = bufferedReader;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                            if (file != 0) {
                                file.close();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                        } else {
                            if (file != 0) {
                                file.close();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            } catch (FileNotFoundException e11) {
                e = e11;
                fileInputStream = null;
                bufferedReader = null;
            } catch (IOException e12) {
                e = e12;
                fileInputStream = null;
                bufferedReader = null;
            } catch (SecurityException unused4) {
                file = 0;
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
                bufferedReader = null;
            }
            bufferedReader.close();
            return d;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static void setMockGDPAndroid(boolean z) {
        mockGDPAndroid = z;
    }

    @CalledByNative
    public boolean checkBackground() {
        return new BackGround().checkBackgroundSafe();
    }

    @CalledByNative
    public int getBattery() {
        return new BatteryLevel().getBatteryLevelSafe();
    }

    @CalledByNative
    public int getCpuClock() {
        return new CPUMaxFreqKHz().getCPUMaxFreqKHzSafe();
    }

    @CalledByNative
    public int getCpuCores() {
        return new NumberOfCpuCores().getNumberOfCpuCoresSafe();
    }

    public int getCpuTemperature() {
        return new CPUTemperature().getCpuTemperatureSafe();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x002b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:13:0x002b */
    @CalledByNative
    public String getCpuVendor() throws Throwable {
        FileReader fileReader;
        IOException e;
        FileNotFoundException e2;
        Reader reader;
        String str = "";
        Reader reader2 = null;
        try {
            try {
                fileReader = new FileReader("/proc/cpuinfo");
                try {
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            if (!line.contains("Hardware") && !line.contains("hardware")) {
                            }
                            str = line.split(":\\s+", 2)[1];
                            break;
                        }
                        break;
                    }
                    fileReader.close();
                } catch (FileNotFoundException e3) {
                    e2 = e3;
                    Logging.m88109e(TAG, "getCpuName failed, no /proc/cpuinfo found in system", e2);
                    if (fileReader != null) {
                    }
                    return (getSocName() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + Build.HARDWARE).trim().toLowerCase();
                } catch (IOException e4) {
                    e = e4;
                    Logging.m88109e(TAG, "getCpuName failed,", e);
                    if (fileReader != null) {
                    }
                    return (getSocName() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + Build.HARDWARE).trim().toLowerCase();
                }
            } catch (Throwable th) {
                th = th;
                reader2 = reader;
                if (reader2 != null) {
                    try {
                        reader2.close();
                    } catch (IOException e5) {
                        Logging.m88109e(TAG, "failed to close proc file", e5);
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e6) {
            fileReader = null;
            e2 = e6;
        } catch (IOException e7) {
            fileReader = null;
            e = e7;
        } catch (Throwable th2) {
            th = th2;
            if (reader2 != null) {
                reader2.close();
            }
            throw th;
        }
        try {
            fileReader.close();
        } catch (IOException e8) {
            Logging.m88109e(TAG, "failed to close proc file", e8);
        }
        return (getSocName() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + Build.HARDWARE).trim().toLowerCase();
    }

    @CalledByNative
    public String getGpuRenderer() {
        return this.mGpuRenderer;
    }

    @CalledByNative
    public String getGpuVendor() {
        return this.mGpuVendor;
    }

    @CalledByNative
    public int getOsVersion() {
        return Build.VERSION.SDK_INT;
    }

    @CalledByNative
    public int getRam() {
        return new TotalMemory().getTotalMemorySafe();
    }
}
