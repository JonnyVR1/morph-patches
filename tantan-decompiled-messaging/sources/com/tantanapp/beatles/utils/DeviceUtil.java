package com.tantanapp.beatles.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.DisplayMetrics;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.util.Locale;
import java.util.regex.Pattern;
import p149l.nt2;
import p149l.ryl;
import p149l.vx00;

/* JADX INFO: loaded from: classes13.dex */
public class DeviceUtil {

    /* JADX INFO: renamed from: a */
    public static long f55994a;

    /* JADX INFO: renamed from: b */
    public static long f55995b;

    /* JADX INFO: renamed from: c */
    public static int f55996c;

    /* JADX INFO: renamed from: d */
    public static double f55997d;

    /* JADX INFO: renamed from: e */
    public static ActivityManager.MemoryInfo f55998e;

    /* JADX INFO: renamed from: f */
    public static C13564b f55999f;

    /* JADX INFO: renamed from: g */
    public static final FileFilter f56000g = new C13563a();

    public enum LEVEL {
        BEST(5),
        HIGH(4),
        MIDDLE(3),
        LOW(2),
        BAD(1),
        UN_KNOW(-1);

        int value;

        LEVEL(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.beatles.utils.DeviceUtil$a */
    public class C13563a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.beatles.utils.DeviceUtil$b */
    public static class C13564b {

        /* JADX INFO: renamed from: a */
        public int f56001a;

        /* JADX INFO: renamed from: b */
        public int f56002b;

        /* JADX INFO: renamed from: c */
        public float f56003c;

        /* JADX INFO: renamed from: d */
        public int f56004d;
    }

    /* JADX INFO: renamed from: a */
    public static String m81208a() {
        return Build.CPU_ABI;
    }

    /* JADX INFO: renamed from: b */
    public static float m81209b(Context context) {
        C13564b c13564b = f55999f;
        if (c13564b != null) {
            float f = c13564b.f56003c;
            if (f > 0.0f) {
                return f;
            }
        }
        C13564b c13564bM81221n = m81221n(context);
        f55999f = c13564bM81221n;
        return c13564bM81221n.f56003c;
    }

    /* JADX INFO: renamed from: c */
    public static int m81210c(Context context) {
        int i;
        C13564b c13564b = f55999f;
        if (c13564b != null && (i = c13564b.f56004d) > 0) {
            return i;
        }
        C13564b c13564bM81221n = m81221n(context);
        f55999f = c13564bM81221n;
        return c13564bM81221n.f56004d;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static String m81211d() {
        try {
            return Build.MODEL.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, -1)[0];
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m81212e() {
        return Build.MANUFACTURER;
    }

    /* JADX INFO: renamed from: f */
    public static ActivityManager.MemoryInfo m81213f(Context context) {
        ActivityManager.MemoryInfo memoryInfo = f55998e;
        if (memoryInfo != null) {
            return memoryInfo;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo2);
                f55998e = memoryInfo2;
                return memoryInfo2;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static String m81214g() {
        return Build.MODEL;
    }

    /* JADX INFO: renamed from: h */
    public static String m81215h() {
        StringBuilder sb = new StringBuilder(" Process Summary (From: android.os.Debug.MemoryInfo)\n");
        Locale locale = Locale.US;
        sb.append(String.format(locale, "%21s %8s\n", "", "Pss(KB)"));
        sb.append(String.format(locale, "%21s %8s\n", "", "------"));
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            sb.append(String.format(locale, "%21s %8s\n", "Java Heap:", memoryInfo.getMemoryStat("summary.java-heap")));
            sb.append(String.format(locale, "%21s %8s\n", "Native Heap:", memoryInfo.getMemoryStat("summary.native-heap")));
            sb.append(String.format(locale, "%21s %8s\n", "Code:", memoryInfo.getMemoryStat("summary.code")));
            sb.append(String.format(locale, "%21s %8s\n", "Stack:", memoryInfo.getMemoryStat("summary.stack")));
            sb.append(String.format(locale, "%21s %8s\n", "Graphics:", memoryInfo.getMemoryStat("summary.graphics")));
            sb.append(String.format(locale, "%21s %8s\n", "Private Other:", memoryInfo.getMemoryStat("summary.private-other")));
            sb.append(String.format(locale, "%21s %8s\n", "System:", memoryInfo.getMemoryStat("summary.system")));
            sb.append(String.format(locale, "%21s %8s %21s %8s\n", "TOTAL:", memoryInfo.getMemoryStat("summary.total-pss"), "TOTAL SWAP:", memoryInfo.getMemoryStat("summary.total-swap")));
        } catch (Throwable th) {
            vx00.m200474d("Util getProcessMemoryInfo failed -> e = " + th.getMessage(), new Object[0]);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static int m81216i(Context context) {
        int i;
        C13564b c13564b = f55999f;
        if (c13564b != null && (i = c13564b.f56001a) > 0) {
            return i;
        }
        C13564b c13564bM81221n = m81221n(context);
        f55999f = c13564bM81221n;
        return c13564bM81221n.f56001a;
    }

    /* JADX INFO: renamed from: j */
    public static int m81217j(Context context) {
        int i;
        C13564b c13564b = f55999f;
        if (c13564b != null && (i = c13564b.f56002b) > 0) {
            return i;
        }
        C13564b c13564bM81221n = m81221n(context);
        f55999f = c13564bM81221n;
        return c13564bM81221n.f56002b;
    }

    /* JADX INFO: renamed from: k */
    public static String m81218k() {
        return Build.VERSION.RELEASE;
    }

    /* JADX INFO: renamed from: l */
    public static long m81219l(Context context) {
        long j = f55994a;
        if (0 != j) {
            return j;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            activityManager.getMemoryInfo(memoryInfo);
            f55994a = memoryInfo.totalMem;
            f55995b = memoryInfo.threshold;
            long jMaxMemory = Runtime.getRuntime().maxMemory();
            if (jMaxMemory == Long.MAX_VALUE) {
                f55996c = activityManager.getMemoryClass();
            } else {
                f55996c = (int) (jMaxMemory / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            }
            vx00.m200474d("getTotalMemory cost:" + (System.currentTimeMillis() - jCurrentTimeMillis) + ", total_mem:" + f55994a + ", LowMemoryThresold:" + f55995b + ", Memory Class:" + f55996c, new Object[0]);
        } catch (Throwable th) {
            nt2.m160831v("[beatles]", "[getTotalMemory] exception:" + th.getClass().getName() + " message:" + th.getMessage());
        }
        return f55994a;
    }

    /* JADX INFO: renamed from: m */
    public static double m81220m(Context context) throws Throwable {
        BufferedReader bufferedReader;
        double d = f55997d;
        if (d != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return d;
        }
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader("/proc/meminfo");
            try {
                bufferedReader = new BufferedReader(fileReader2, 8192);
                try {
                    String str = bufferedReader.readLine().split("\\s+")[1];
                    f55997d = Double.valueOf(String.format("%.2f", Double.valueOf(str != null ? Float.valueOf(str).floatValue() / 1048576.0f : 0.0d))).doubleValue();
                    ryl.m181666a(fileReader2);
                } catch (Exception unused) {
                    fileReader = fileReader2;
                    ryl.m181666a(fileReader);
                } catch (Throwable th) {
                    th = th;
                    fileReader = fileReader2;
                    ryl.m181666a(fileReader);
                    ryl.m181666a(bufferedReader);
                    throw th;
                }
            } catch (Exception unused2) {
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Exception unused3) {
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
        ryl.m181666a(bufferedReader);
        if (f55997d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            f55997d = Double.valueOf(String.format("%.2f", Double.valueOf((m81219l(context) * 1.0d) / 1.073741824E9d))).doubleValue();
        }
        return f55997d;
    }

    /* JADX INFO: renamed from: n */
    public static C13564b m81221n(Context context) {
        DisplayMetrics displayMetrics;
        C13564b c13564b = new C13564b();
        if (context instanceof Activity) {
            displayMetrics = new DisplayMetrics();
            ((Activity) context).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            displayMetrics = context.getResources().getDisplayMetrics();
        }
        c13564b.f56001a = displayMetrics.heightPixels;
        c13564b.f56002b = displayMetrics.widthPixels;
        c13564b.f56003c = displayMetrics.density;
        c13564b.f56004d = displayMetrics.densityDpi;
        return c13564b;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    @Nullable
    /* JADX INFO: renamed from: o */
    public static Boolean m81222o() {
        boolean z;
        try {
            if (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) {
                z = true;
            } else {
                String str = Build.FINGERPRINT;
                if (str.startsWith("generic") || str.startsWith("unknown")) {
                    z = true;
                } else {
                    String str2 = Build.HARDWARE;
                    if (str2.contains("goldfish") || str2.contains("ranchu")) {
                        z = true;
                    } else {
                        String str3 = Build.MODEL;
                        if (str3.contains("google_sdk") || str3.contains("Emulator") || str3.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
                            z = true;
                        } else {
                            String str4 = Build.PRODUCT;
                            if (str4.contains("sdk_google") || str4.contains("google_sdk") || str4.contains("sdk") || str4.contains("sdk_x86") || str4.contains("vbox86p") || str4.contains("emulator") || str4.contains("simulator")) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                    }
                }
            }
            return Boolean.valueOf(z);
        } catch (Exception unused) {
            return null;
        }
    }
}
