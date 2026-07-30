package p149l;

import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class xh40 {

    /* JADX INFO: renamed from: c */
    public static xh40 f192856c;

    /* JADX INFO: renamed from: a */
    public boolean f192857a;

    /* JADX INFO: renamed from: b */
    public c4g0 f192858b;

    /* JADX INFO: renamed from: a */
    public static xh40 m208751a() {
        if (f192856c == null) {
            synchronized (xh40.class) {
                try {
                    if (f192856c == null) {
                        f192856c = new xh40();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f192856c;
    }

    /* JADX INFO: renamed from: b */
    public static void m208752b() {
        if (NullChecker.m81303a(f192856c)) {
            mkd0.m154992z(f192856c.f192858b);
            f192856c = null;
        }
    }
}
