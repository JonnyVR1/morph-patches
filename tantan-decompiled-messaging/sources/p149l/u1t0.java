package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class u1t0 extends u0s0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ y1t0 f173046c;

    public u1t0(y1t0 y1t0Var) {
        this.f173046c = y1t0Var;
    }

    @Override // p149l.u0s0
    /* JADX INFO: renamed from: a */
    public final void mo123689a() {
        y1t0 y1t0Var = this.f173046c;
        s7s0 s7s0Var = new s7s0(y1t0Var.f195451e, y1t0Var.f195452f.zza);
        synchronized (this.f173046c.f195447a) {
            try {
                vny0.m199069g();
                v7s0.m197385a(this.f173046c.f195454h, s7s0Var);
            } catch (IllegalArgumentException e) {
                x2t0.m206870h("Cannot config CSI reporter.", e);
            }
        }
    }
}
