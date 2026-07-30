package p149l;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.DisplayMetrics;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes8.dex */
public class eew {

    /* JADX INFO: renamed from: a */
    public static Boolean f90786a;

    /* JADX INFO: renamed from: b */
    public static nvc0 f90787b;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ qgy m116005a(int i) {
        return new qgy(i, 128, i / 2, 64, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ qgy m116006b(int i, int i2) {
        return new qgy(i, i2, i / 2, i2 / 2, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: c */
    public static syg0<qgy> m116007c(ActivityManager activityManager) {
        final int iM116009e = m116009e(activityManager);
        return new syg0() { // from class: l.dew
            @Override // p149l.syg0
            public final Object get() {
                return eew.m116005a(iM116009e);
            }
        };
    }

    /* JADX INFO: renamed from: d */
    public static syg0<qgy> m116008d(ActivityManager activityManager) {
        final int iM116009e = m116009e(activityManager) / 2;
        final int i = 64;
        return new syg0() { // from class: l.cew
            @Override // p149l.syg0
            public final Object get() {
                return eew.m116006b(iM116009e, i);
            }
        };
    }

    /* JADX INFO: renamed from: e */
    public static int m116009e(ActivityManager activityManager) {
        int iMin = Math.min(activityManager.getMemoryClass() * 1048576, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (iMin <= 33554432) {
            return 4194304;
        }
        if (iMin <= 67108864) {
            return 8388608;
        }
        return iMin / 4;
    }

    /* JADX INFO: renamed from: f */
    public static nvc0 m116010f(Context context) {
        if (f90787b == null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f90787b = new nvc0(displayMetrics.widthPixels / 2, displayMetrics.heightPixels / 2);
        }
        return f90787b;
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: g */
    public static long m116011g(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: h */
    public static boolean m116012h(Context context) {
        if (f90786a == null) {
            f90786a = Boolean.valueOf(m116011g(context) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED <= 2048 || Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED <= 128);
        }
        return f90786a.booleanValue() && Build.VERSION.SDK_INT <= 26;
    }
}
