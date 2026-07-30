package p153l;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class xsq0 {
    /* JADX INFO: renamed from: a */
    public static void m212996a() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        azk0.m101074a("can't do this on ui thread");
    }
}
