package p153l;

import android.os.Looper;

/* JADX INFO: loaded from: classes11.dex */
public class v11 {
    /* JADX INFO: renamed from: a */
    public static void m198965a(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (i4g0.m138514l()) {
                azk0.m101074a("should use PageHelper in MainThread");
                return;
            }
            i4g0.m138494C("NotInUIThread:" + str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m198966b() {
        if (!i4g0.m138514l() || tsd0.m192578e().m192580d().getLooper().getThread().getId() == Thread.currentThread().getId()) {
            return;
        }
        azk0.m101074a("call this method should in StatisticsHandlerThread");
    }

    /* JADX INFO: renamed from: c */
    public static void m198967c() {
        if (!i4g0.m138514l() || r660.m179993e().m179995d().getLooper().getThread().getId() == Thread.currentThread().getId()) {
            return;
        }
        azk0.m101074a("call this method should in StatisticsHandlerThread");
    }
}
