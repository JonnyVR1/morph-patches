package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class mgx0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public xgx0 f133742a;

    /* JADX INFO: renamed from: a */
    public static void m154585a(xgx0 xgx0Var, xgx0 xgx0Var2) {
        mgx0 mgx0Var = (mgx0) xgx0Var;
        if (mgx0Var.f133742a == null) {
            mgx0Var.f133742a = xgx0Var2;
        } else {
            ohg0.m164364a();
        }
    }

    @Override // p149l.ehx0
    public final Object zzb() {
        xgx0 xgx0Var = this.f133742a;
        if (xgx0Var != null) {
            return xgx0Var.zzb();
        }
        ohg0.m164364a();
        return null;
    }
}
