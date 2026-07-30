package p153l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class i5s0 extends x5s0 {

    /* JADX INFO: renamed from: i */
    public final y2s0 f113094i;

    /* JADX INFO: renamed from: j */
    public final long f113095j;

    /* JADX INFO: renamed from: k */
    public final long f113096k;

    public i5s0(b4s0 b4s0Var, String str, String str2, fzr0 fzr0Var, int i, int i2, y2s0 y2s0Var, long j, long j2) {
        super(b4s0Var, "ChMYhePBDqkXl5DeRTg9cgSXXNPVEcIqgEVciYHEVlkZyx/HkVQXSnen8aw33G2s", "tJ+SvALjKnpAv9FF8u56pKKRS55/vzUDe+m9ct97Lx4=", fzr0Var, i, 11);
        this.f113094i = y2s0Var;
        this.f113095j = j;
        this.f113096k = j2;
    }

    @Override // p153l.x5s0
    /* JADX INFO: renamed from: a */
    public final void mo96251a() throws IllegalAccessException, InvocationTargetException {
        y2s0 y2s0Var = this.f113094i;
        if (y2s0Var != null) {
            w2s0 w2s0Var = new w2s0((String) this.f192523f.invoke(null, y2s0Var.m214103b(), Long.valueOf(this.f113095j), Long.valueOf(this.f113096k)));
            synchronized (this.f192522e) {
                try {
                    this.f192522e.m128277A0(w2s0Var.f186929a.longValue());
                    if (w2s0Var.f186930b.longValue() >= 0) {
                        this.f192522e.m128283K(w2s0Var.f186930b.longValue());
                    }
                    if (w2s0Var.f186931c.longValue() >= 0) {
                        this.f192522e.m128305g0(w2s0Var.f186931c.longValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
