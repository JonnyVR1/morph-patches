package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class gfu0 implements vhu0 {

    /* JADX INFO: renamed from: a */
    public olu0 f103955a;

    /* JADX INFO: renamed from: a */
    public static void m130120a(olu0 olu0Var, olu0 olu0Var2) {
        gfu0 gfu0Var = (gfu0) olu0Var;
        if (gfu0Var.f103955a == null) {
            gfu0Var.f103955a = olu0Var2;
        } else {
            wpg0.m207458a();
        }
    }

    @Override // p153l.bou0
    public final Object zza() {
        olu0 olu0Var = this.f103955a;
        if (olu0Var != null) {
            return olu0Var.zza();
        }
        wpg0.m207458a();
        return null;
    }
}
