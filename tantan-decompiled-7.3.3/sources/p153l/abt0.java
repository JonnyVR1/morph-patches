package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class abt0 extends aas0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ebt0 f69651c;

    public abt0(ebt0 ebt0Var) {
        this.f69651c = ebt0Var;
    }

    @Override // p153l.aas0
    /* JADX INFO: renamed from: a */
    public final void mo96666a() {
        ebt0 ebt0Var = this.f69651c;
        ygs0 ygs0Var = new ygs0(ebt0Var.f92976e, ebt0Var.f92977f.zza);
        synchronized (this.f69651c.f92972a) {
            try {
                bxy0.m106923g();
                bhs0.m104367a(this.f69651c.f92979h, ygs0Var);
            } catch (IllegalArgumentException e) {
                dct0.m115299h("Cannot config CSI reporter.", e);
            }
        }
    }
}
