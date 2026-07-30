package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class a6u0 implements p8u0 {

    /* JADX INFO: renamed from: a */
    public icu0 f67802a;

    /* JADX INFO: renamed from: a */
    public static void m95160a(icu0 icu0Var, icu0 icu0Var2) {
        a6u0 a6u0Var = (a6u0) icu0Var;
        if (a6u0Var.f67802a == null) {
            a6u0Var.f67802a = icu0Var2;
        } else {
            ohg0.m164364a();
        }
    }

    @Override // p149l.veu0
    public final Object zza() {
        icu0 icu0Var = this.f67802a;
        if (icu0Var != null) {
            return icu0Var.zza();
        }
        ohg0.m164364a();
        return null;
    }
}
