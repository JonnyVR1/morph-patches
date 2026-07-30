package p006l;

import com.tantanapp.common.utils.NullChecker;
import l.c4g0;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class xh40 {

    /* JADX INFO: renamed from: c */
    public static xh40 f27513c;

    /* JADX INFO: renamed from: a */
    public boolean f27514a;

    /* JADX INFO: renamed from: b */
    public c4g0 f27515b;

    /* JADX INFO: renamed from: a */
    public static xh40 m27240a() {
        if (f27513c == null) {
            synchronized (xh40.class) {
                try {
                    if (f27513c == null) {
                        f27513c = new xh40();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f27513c;
    }

    /* JADX INFO: renamed from: b */
    public static void m27241b() {
        if (NullChecker.a(f27513c)) {
            mkd0.z(f27513c.f27515b);
            f27513c = null;
        }
    }
}
