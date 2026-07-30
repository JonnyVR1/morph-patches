package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class spx0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public dqx0 f170114a;

    /* JADX INFO: renamed from: a */
    public static void m187486a(dqx0 dqx0Var, dqx0 dqx0Var2) {
        spx0 spx0Var = (spx0) dqx0Var;
        if (spx0Var.f170114a == null) {
            spx0Var.f170114a = dqx0Var2;
        } else {
            wpg0.m207458a();
        }
    }

    @Override // p153l.kqx0
    public final Object zzb() {
        dqx0 dqx0Var = this.f170114a;
        if (dqx0Var != null) {
            return dqx0Var.zzb();
        }
        wpg0.m207458a();
        return null;
    }
}
