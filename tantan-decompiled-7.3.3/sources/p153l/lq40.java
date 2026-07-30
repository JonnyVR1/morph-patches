package p153l;

import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class lq40 {

    /* JADX INFO: renamed from: c */
    public static lq40 f133142c;

    /* JADX INFO: renamed from: a */
    public boolean f133143a;

    /* JADX INFO: renamed from: b */
    public kcg0 f133144b;

    /* JADX INFO: renamed from: a */
    public static lq40 m155316a() {
        if (f133142c == null) {
            synchronized (lq40.class) {
                try {
                    if (f133142c == null) {
                        f133142c = new lq40();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f133142c;
    }

    /* JADX INFO: renamed from: b */
    public static void m155317b() {
        if (NullChecker.m82486a(f133142c)) {
            psd0.m173633z(f133142c.f133144b);
            f133142c = null;
        }
    }
}
