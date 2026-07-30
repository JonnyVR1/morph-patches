package p149l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class mwr0 extends rwr0 {

    /* JADX INFO: renamed from: i */
    public static volatile Long f136084i;

    /* JADX INFO: renamed from: j */
    public static final Object f136085j = new Object();

    public mwr0(vur0 vur0Var, String str, String str2, zpr0 zpr0Var, int i, int i2) {
        super(vur0Var, "nKZwK8oioxkTwDfG9V2sR2xNb9GbO72JaQ9OaUpmWGl7ZX+EiCwiESnhzEGly7cm", "WIPKXsZv2l0NBmLvWdV3TkucPJ5dkfbRYYrTASAxFfQ=", zpr0Var, i, 33);
    }

    @Override // p149l.rwr0
    /* JADX INFO: renamed from: a */
    public final void mo99305a() throws IllegalAccessException, InvocationTargetException {
        if (f136084i == null) {
            synchronized (f136085j) {
                try {
                    if (f136084i == null) {
                        f136084i = (Long) this.f161372f.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (this.f161371e) {
            this.f161371e.m219753P(f136084i.longValue());
        }
    }
}
