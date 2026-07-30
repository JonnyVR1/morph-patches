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
import p153l.du2;
import p153l.f610;
import p153l.m1m;

/* JADX INFO: loaded from: classes11.dex */
public class DeviceUtil {

    /* JADX INFO: renamed from: a */
    public static long f56842a;

    /* JADX INFO: renamed from: b */
    public static long f56843b;

    /* JADX INFO: renamed from: c */
    public static int f56844c;

    /* JADX INFO: renamed from: d */
    public static double f56845d;

    /* JADX INFO: renamed from: e */
    public static ActivityManager.MemoryInfo f56846e;

    /* JADX INFO: renamed from: f */
    public static C13727b f56847f;

    /* JADX INFO: renamed from: g */
    public static final FileFilter f56848g = new C13726a();

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
    public class C13726a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.beatles.utils.DeviceUtil$b */
    public static class C13727b {

        /* JADX INFO: renamed from: a */
        public int f56849a;

        /* JADX INFO: renamed from: b */
        public int f56850b;

        /* JADX INFO: renamed from: c */
        public float f56851c;

        /* JADX INFO: renamed from: d */
        public int f56852d;
    }

    /* JADX INFO: renamed from: a */
    public static String m82391a() {
        return Build.CPU_ABI;
    }

    /* JADX INFO: renamed from: b */
    public static float m82392b(Context context) {
        C13727b c13727b = f56847f;
        if (c13727b != null) {
            float f = c13727b.f56851c;
            if (f > 0.0f) {
                return f;
            }
        }
        C13727b c13727bM82404n = m82404n(context);
        f56847f = c13727bM82404n;
        return c13727bM82404n.f56851c;
    }

    /* JADX INFO: renamed from: c */
    public static int m82393c(Context context) {
        int i;
        C13727b c13727b = f56847f;
        if (c13727b != null && (i = c13727b.f56852d) > 0) {
            return i;
        }
        C13727b c13727bM82404n = m82404n(context);
        f56847f = c13727bM82404n;
        return c13727bM82404n.f56852d;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static String m82394d() {
        try {
            return Build.MODEL.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, -1)[0];
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m82395e() {
        return Build.MANUFACTURER;
    }

    /* JADX INFO: renamed from: f */
    public static ActivityManager.MemoryInfo m82396f(Context context) {
        ActivityManager.MemoryInfo memoryInfo = f56846e;
        if (memoryInfo != null) {
            return memoryInfo;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo2);
                f56846e = memoryInfo2;
                return memoryInfo2;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static String m82397g() {
        return Build.MODEL;
    }

    /* JADX INFO: renamed from: h */
    public static String m82398h() {
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
            f610.m124266d("Util getProcessMemoryInfo failed -> e = " + th.getMessage(), new Object[0]);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static int m82399i(Context context) {
        int i;
        C13727b c13727b = f56847f;
        if (c13727b != null && (i = c13727b.f56849a) > 0) {
            return i;
        }
        C13727b c13727bM82404n = m82404n(context);
        f56847f = c13727bM82404n;
        return c13727bM82404n.f56849a;
    }

    /* JADX INFO: renamed from: j */
    public static int m82400j(Context context) {
        int i;
        C13727b c13727b = f56847f;
        if (c13727b != null && (i = c13727b.f56850b) > 0) {
            return i;
        }
        C13727b c13727bM82404n = m82404n(context);
        f56847f = c13727bM82404n;
        return c13727bM82404n.f56850b;
    }

    /* JADX INFO: renamed from: k */
    public static String m82401k() {
        return Build.VERSION.RELEASE;
    }

    /* JADX INFO: renamed from: l */
    public static long m82402l(Context context) {
        long j = f56842a;
        if (0 != j) {
            return j;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            activityManager.getMemoryInfo(memoryInfo);
            f56842a = memoryInfo.totalMem;
            f56843b = memoryInfo.threshold;
            long jMaxMemory = Runtime.getRuntime().maxMemory();
            if (jMaxMemory == Long.MAX_VALUE) {
                f56844c = activityManager.getMemoryClass();
            } else {
                f56844c = (int) (jMaxMemory / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            }
            f610.m124266d("getTotalMemory cost:" + (System.currentTimeMillis() - jCurrentTimeMillis) + ", total_mem:" + f56842a + ", LowMemoryThresold:" + f56843b + ", Memory Class:" + f56844c, new Object[0]);
        } catch (Throwable th) {
            du2.m118062v("[beatles]", "[getTotalMemory] exception:" + th.getClass().getName() + " message:" + th.getMessage());
        }
        return f56842a;
    }

    /* JADX INFO: renamed from: m */
    public static double m82403m(Context context) throws Throwable {
        BufferedReader bufferedReader;
        double d = f56845d;
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
                    f56845d = Double.valueOf(String.format("%.2f", Double.valueOf(str != null ? Float.valueOf(str).floatValue() / 1048576.0f : 0.0d))).doubleValue();
                    m1m.m156698a(fileReader2);
                } catch (Exception unused) {
                    fileReader = fileReader2;
                    m1m.m156698a(fileReader);
                } catch (Throwable th) {
                    th = th;
                    fileReader = fileReader2;
                    m1m.m156698a(fileReader);
                    m1m.m156698a(bufferedReader);
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
        m1m.m156698a(bufferedReader);
        if (f56845d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            f56845d = Double.valueOf(String.format("%.2f", Double.valueOf((m82402l(context) * 1.0d) / 1.073741824E9d))).doubleValue();
        }
        return f56845d;
    }

    /* JADX INFO: renamed from: n */
    public static C13727b m82404n(Context context) {
        DisplayMetrics displayMetrics;
        C13727b c13727b = new C13727b();
        if (context instanceof Activity) {
            displayMetrics = new DisplayMetrics();
            ((Activity) context).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            displayMetrics = context.getResources().getDisplayMetrics();
        }
        c13727b.f56849a = displayMetrics.heightPixels;
        c13727b.f56850b = displayMetrics.widthPixels;
        c13727b.f56851c = displayMetrics.density;
        c13727b.f56852d = displayMetrics.densityDpi;
        return c13727b;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    @Nullable
    /* JADX INFO: renamed from: o */
    public static Boolean m82405o() {
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
