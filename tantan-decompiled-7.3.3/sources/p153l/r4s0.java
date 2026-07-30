package p153l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class r4s0 extends x5s0 {

    /* JADX INFO: renamed from: i */
    public static volatile Long f161241i;

    /* JADX INFO: renamed from: j */
    public static final Object f161242j = new Object();

    public r4s0(b4s0 b4s0Var, String str, String str2, fzr0 fzr0Var, int i, int i2) {
        super(b4s0Var, "L1KomYFd7sBH8JLOTR3glPup1jq/oqWyQJNU/5dJtxixjKQHD3ZBhAic9dH4TZgA", "m4uJd6hJYeAUgFAUB1OT370Awen8YINd4hKC7XM/6ec=", fzr0Var, i, 44);
    }

    @Override // p153l.x5s0
    /* JADX INFO: renamed from: a */
    public final void mo96251a() throws IllegalAccessException, InvocationTargetException {
        if (f161241i == null) {
            synchronized (f161242j) {
                try {
                    if (f161241i == null) {
                        f161241i = (Long) this.f192523f.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (this.f192522e) {
            this.f192522e.m128314p0(f161241i.longValue());
        }
    }
}
