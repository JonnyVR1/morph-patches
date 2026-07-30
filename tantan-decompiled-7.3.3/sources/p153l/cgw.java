package p153l;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.DisplayMetrics;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes8.dex */
public class cgw {

    /* JADX INFO: renamed from: a */
    public static Boolean f81741a;

    /* JADX INFO: renamed from: b */
    public static q3d0 f81742b;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ npy m109757a(int i) {
        return new npy(i, 128, i / 2, 64, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ npy m109758b(int i, int i2) {
        return new npy(i, i2, i / 2, i2 / 2, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: c */
    public static a7h0<npy> m109759c(ActivityManager activityManager) {
        final int iM109761e = m109761e(activityManager);
        return new a7h0() { // from class: l.bgw
            @Override // p153l.a7h0
            public final Object get() {
                return cgw.m109757a(iM109761e);
            }
        };
    }

    /* JADX INFO: renamed from: d */
    public static a7h0<npy> m109760d(ActivityManager activityManager) {
        final int iM109761e = m109761e(activityManager) / 2;
        final int i = 64;
        return new a7h0() { // from class: l.agw
            @Override // p153l.a7h0
            public final Object get() {
                return cgw.m109758b(iM109761e, i);
            }
        };
    }

    /* JADX INFO: renamed from: e */
    public static int m109761e(ActivityManager activityManager) {
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
    public static q3d0 m109762f(Context context) {
        if (f81742b == null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f81742b = new q3d0(displayMetrics.widthPixels / 2, displayMetrics.heightPixels / 2);
        }
        return f81742b;
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: g */
    public static long m109763g(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: h */
    public static boolean m109764h(Context context) {
        if (f81741a == null) {
            f81741a = Boolean.valueOf(m109763g(context) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED <= 2048 || Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED <= 128);
        }
        return f81741a.booleanValue() && Build.VERSION.SDK_INT <= 26;
    }
}
