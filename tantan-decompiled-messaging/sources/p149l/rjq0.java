package p149l;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class rjq0 {
    /* JADX INFO: renamed from: a */
    public static void m179663a() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        upk0.m194883a("can't do this on ui thread");
    }
}
