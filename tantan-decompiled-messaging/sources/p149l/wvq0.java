package p149l;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public class wvq0 {

    /* JADX INFO: renamed from: a */
    private static volatile lwq0 f188278a;

    /* JADX INFO: renamed from: a */
    public static HandlerThread m205757a() {
        if (f188278a == null) {
            synchronized (wvq0.class) {
                try {
                    if (f188278a == null) {
                        f188278a = new lwq0("default_npth_thread");
                        f188278a.m151994i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f188278a.m151997l();
    }

    /* JADX INFO: renamed from: b */
    public static lwq0 m205758b() {
        if (f188278a == null) {
            m205757a();
        }
        return f188278a;
    }
}
