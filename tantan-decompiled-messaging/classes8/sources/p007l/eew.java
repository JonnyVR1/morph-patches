package p007l;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import l.nvc0;
import l.qgy;
import l.syg0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class eew {

    /* JADX INFO: renamed from: a */
    public static Boolean f2620a;

    /* JADX INFO: renamed from: b */
    public static nvc0 f2621b;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ qgy m9061a(int i) {
        return new qgy(i, 128, i / 2, 64, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ qgy m9062b(int i, int i2) {
        return new qgy(i, i2, i / 2, i2 / 2, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: c */
    public static syg0<qgy> m9063c(ActivityManager activityManager) {
        final int iM9065e = m9065e(activityManager);
        return new syg0() { // from class: l.dew
            public final Object get() {
                return eew.m9061a(iM9065e);
            }
        };
    }

    /* JADX INFO: renamed from: d */
    public static syg0<qgy> m9064d(ActivityManager activityManager) {
        final int iM9065e = m9065e(activityManager) / 2;
        final int i = 64;
        return new syg0() { // from class: l.cew
            public final Object get() {
                return eew.m9062b(iM9065e, i);
            }
        };
    }

    /* JADX INFO: renamed from: e */
    public static int m9065e(ActivityManager activityManager) {
        int iMin = Math.min(activityManager.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (iMin <= 33554432) {
            return 4194304;
        }
        if (iMin <= 67108864) {
            return 8388608;
        }
        return iMin / 4;
    }

    /* JADX INFO: renamed from: f */
    public static nvc0 m9066f(Context context) {
        if (f2621b == null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f2621b = new nvc0(displayMetrics.widthPixels / 2, displayMetrics.heightPixels / 2);
        }
        return f2621b;
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: g */
    public static long m9067g(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: h */
    public static boolean m9068h(Context context) {
        if (f2620a == null) {
            f2620a = Boolean.valueOf(m9067g(context) / 1048576 <= 2048 || Runtime.getRuntime().maxMemory() / 1048576 <= 128);
        }
        return f2620a.booleanValue() && Build.VERSION.SDK_INT <= 26;
    }
}
