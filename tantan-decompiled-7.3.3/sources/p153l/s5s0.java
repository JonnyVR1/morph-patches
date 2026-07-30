package p153l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class s5s0 extends x5s0 {

    /* JADX INFO: renamed from: i */
    public static volatile Long f166506i;

    /* JADX INFO: renamed from: j */
    public static final Object f166507j = new Object();

    public s5s0(b4s0 b4s0Var, String str, String str2, fzr0 fzr0Var, int i, int i2) {
        super(b4s0Var, "nKZwK8oioxkTwDfG9V2sR2xNb9GbO72JaQ9OaUpmWGl7ZX+EiCwiESnhzEGly7cm", "WIPKXsZv2l0NBmLvWdV3TkucPJ5dkfbRYYrTASAxFfQ=", fzr0Var, i, 33);
    }

    @Override // p153l.x5s0
    /* JADX INFO: renamed from: a */
    public final void mo96251a() throws IllegalAccessException, InvocationTargetException {
        if (f166506i == null) {
            synchronized (f166507j) {
                try {
                    if (f166506i == null) {
                        f166506i = (Long) this.f192523f.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (this.f192522e) {
            this.f192522e.m128288P(f166506i.longValue());
        }
    }
}
