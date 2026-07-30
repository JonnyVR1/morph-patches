package p149l;

import android.os.Looper;

/* JADX INFO: loaded from: classes13.dex */
public class o11 {
    /* JADX INFO: renamed from: a */
    public static void m162219a(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (zvf0.m220390l()) {
                upk0.m194883a("should use PageHelper in MainThread");
                return;
            }
            zvf0.m220370C("NotInUIThread:" + str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m162220b() {
        if (!zvf0.m220390l() || qkd0.m175359e().m175361d().getLooper().getThread().getId() == Thread.currentThread().getId()) {
            return;
        }
        upk0.m194883a("call this method should in StatisticsHandlerThread");
    }

    /* JADX INFO: renamed from: c */
    public static void m162221c() {
        if (!zvf0.m220390l() || my50.m156954e().m156956d().getLooper().getThread().getId() == Thread.currentThread().getId()) {
            return;
        }
        upk0.m194883a("call this method should in StatisticsHandlerThread");
    }
}
