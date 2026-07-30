package p153l;

import com.apm.lite.CrashType;

/* JADX INFO: loaded from: classes.dex */
public class bsq0 {

    /* JADX INFO: renamed from: a */
    private static volatile bsq0 f78186a;

    private bsq0() {
    }

    /* JADX INFO: renamed from: a */
    public static bsq0 m106310a() {
        if (f78186a == null) {
            synchronized (bsq0.class) {
                try {
                    if (f78186a == null) {
                        f78186a = new bsq0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f78186a;
    }

    /* JADX INFO: renamed from: c */
    public void m106312c(String str) {
    }

    /* JADX INFO: renamed from: b */
    public void m106311b(CrashType crashType, long j, String str) {
    }
}
