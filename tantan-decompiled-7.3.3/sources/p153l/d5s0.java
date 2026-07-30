package p153l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class d5s0 extends x5s0 {

    /* JADX INFO: renamed from: i */
    public final c4s0 f85188i;

    public d5s0(b4s0 b4s0Var, String str, String str2, fzr0 fzr0Var, int i, int i2, c4s0 c4s0Var) {
        super(b4s0Var, "Srq4/7DDafVhhxKPQvFzGwPCcbAxjsRhBUoTZMyZ8i1elMwCHCPiECib9I+dpg+U", "+ExOXtPxYV6dYowx9W8QaGOBr19dRESYWAuzCGJGeu8=", fzr0Var, i, 85);
        this.f85188i = c4s0Var;
    }

    @Override // p153l.x5s0
    /* JADX INFO: renamed from: a */
    public final void mo96251a() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = (long[]) this.f192523f.invoke(null, Long.valueOf(this.f85188i.m107963d()), Long.valueOf(this.f85188i.m107967h()), Long.valueOf(this.f85188i.m107961b()), Long.valueOf(this.f85188i.m107965f()));
        synchronized (this.f192522e) {
            this.f192522e.m128328w0(jArr[0]);
            this.f192522e.m128326v0(jArr[1]);
        }
    }
}
