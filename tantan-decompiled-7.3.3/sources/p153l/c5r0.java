package p153l;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public class c5r0 {

    /* JADX INFO: renamed from: a */
    private static volatile r5r0 f79893a;

    /* JADX INFO: renamed from: a */
    public static HandlerThread m108079a() {
        if (f79893a == null) {
            synchronized (c5r0.class) {
                try {
                    if (f79893a == null) {
                        f79893a = new r5r0("default_npth_thread");
                        f79893a.m179947i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f79893a.m179950l();
    }

    /* JADX INFO: renamed from: b */
    public static r5r0 m108080b() {
        if (f79893a == null) {
            m108079a();
        }
        return f79893a;
    }
}
