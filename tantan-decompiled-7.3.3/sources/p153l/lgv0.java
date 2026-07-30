package p153l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class lgv0 extends ngv0 {

    /* JADX INFO: renamed from: a */
    public final dlt0 f132011a;

    /* JADX INFO: renamed from: b */
    public final lju0 f132012b;

    /* JADX INFO: renamed from: c */
    public final q5u0 f132013c;

    /* JADX INFO: renamed from: d */
    public final ndu0 f132014d;

    /* JADX INFO: renamed from: e */
    public final ehv0 f132015e;

    /* JADX INFO: renamed from: f */
    public final tcv0 f132016f;

    public lgv0(dlt0 dlt0Var, lju0 lju0Var, q5u0 q5u0Var, ndu0 ndu0Var, ehv0 ehv0Var, tcv0 tcv0Var) {
        this.f132011a = dlt0Var;
        this.f132012b = lju0Var;
        this.f132013c = q5u0Var;
        this.f132014d = ndu0Var;
        this.f132015e = ehv0Var;
        this.f132016f = tcv0Var;
    }

    @Override // p153l.ngv0
    /* JADX INFO: renamed from: c */
    public final hpr mo97934c(o7w0 o7w0Var, Bundle bundle, q6w0 q6w0Var, b7w0 b7w0Var) {
        q5u0 q5u0Var = this.f132013c;
        q5u0Var.m175531i(o7w0Var);
        q5u0Var.m175528f(bundle);
        q5u0Var.m175529g(new z3u0(b7w0Var, q6w0Var, this.f132015e));
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168465s3)).booleanValue()) {
            this.f132013c.m175526d(this.f132016f);
        }
        dlt0 dlt0Var = this.f132011a;
        q5u0 q5u0Var2 = this.f132013c;
        pju0 pju0VarMo116879m = dlt0Var.mo116879m();
        pju0VarMo116879m.mo172530l(q5u0Var2.m175532j());
        pju0VarMo116879m.mo172529h(this.f132014d);
        pju0VarMo116879m.mo172528c(this.f132012b);
        pju0VarMo116879m.mo172527b(new rwt0(null));
        z0u0 z0u0VarMo176884a = pju0VarMo116879m.zzg().mo176884a();
        return z0u0VarMo176884a.m218173i(z0u0VarMo176884a.m218174j());
    }
}
