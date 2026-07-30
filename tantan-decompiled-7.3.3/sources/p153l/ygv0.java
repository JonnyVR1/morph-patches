package p153l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class ygv0 extends ngv0 {

    /* JADX INFO: renamed from: a */
    public final dlt0 f199880a;

    /* JADX INFO: renamed from: b */
    public final q5u0 f199881b;

    /* JADX INFO: renamed from: c */
    public final ujv0 f199882c;

    /* JADX INFO: renamed from: d */
    public final ndu0 f199883d;

    /* JADX INFO: renamed from: e */
    public final ehv0 f199884e;

    /* JADX INFO: renamed from: f */
    public final tcv0 f199885f;

    public ygv0(dlt0 dlt0Var, q5u0 q5u0Var, ujv0 ujv0Var, ndu0 ndu0Var, ehv0 ehv0Var, tcv0 tcv0Var) {
        this.f199880a = dlt0Var;
        this.f199881b = q5u0Var;
        this.f199882c = ujv0Var;
        this.f199883d = ndu0Var;
        this.f199884e = ehv0Var;
        this.f199885f = tcv0Var;
    }

    @Override // p153l.ngv0
    /* JADX INFO: renamed from: c */
    public final hpr mo97934c(o7w0 o7w0Var, Bundle bundle, q6w0 q6w0Var, b7w0 b7w0Var) {
        q5u0 q5u0Var = this.f199881b;
        q5u0Var.m175531i(o7w0Var);
        q5u0Var.m175528f(bundle);
        q5u0Var.m175529g(new z3u0(b7w0Var, q6w0Var, this.f199884e));
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168465s3)).booleanValue()) {
            this.f199881b.m175526d(this.f199885f);
        }
        dlt0 dlt0Var = this.f199880a;
        q5u0 q5u0Var2 = this.f199881b;
        oiu0 oiu0VarMo116878l = dlt0Var.mo116878l();
        oiu0VarMo116878l.mo141542n(q5u0Var2.m175532j());
        oiu0VarMo116878l.mo141540i(this.f199883d);
        oiu0VarMo116878l.mo141541m(this.f199882c);
        z0u0 z0u0VarMo150793a = oiu0VarMo116878l.zzf().mo150793a();
        return z0u0VarMo150793a.m218173i(z0u0VarMo150793a.m218174j());
    }
}
