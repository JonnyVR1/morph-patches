package p153l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class ahv0 extends ngv0 {

    /* JADX INFO: renamed from: a */
    public final dlt0 f71428a;

    /* JADX INFO: renamed from: b */
    public final q5u0 f71429b;

    /* JADX INFO: renamed from: c */
    public final ndu0 f71430c;

    /* JADX INFO: renamed from: d */
    public final ehv0 f71431d;

    /* JADX INFO: renamed from: e */
    public final c7w0 f71432e;

    /* JADX INFO: renamed from: f */
    public final tcv0 f71433f;

    public ahv0(dlt0 dlt0Var, q5u0 q5u0Var, ndu0 ndu0Var, c7w0 c7w0Var, ehv0 ehv0Var, tcv0 tcv0Var) {
        this.f71428a = dlt0Var;
        this.f71429b = q5u0Var;
        this.f71430c = ndu0Var;
        this.f71432e = c7w0Var;
        this.f71431d = ehv0Var;
        this.f71433f = tcv0Var;
    }

    @Override // p153l.ngv0
    /* JADX INFO: renamed from: c */
    public final hpr mo97934c(o7w0 o7w0Var, Bundle bundle, q6w0 q6w0Var, b7w0 b7w0Var) {
        c7w0 c7w0Var;
        q5u0 q5u0Var = this.f71429b;
        q5u0Var.m175531i(o7w0Var);
        q5u0Var.m175528f(bundle);
        q5u0Var.m175529g(new z3u0(b7w0Var, q6w0Var, this.f71431d));
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168452r3)).booleanValue() && (c7w0Var = this.f71432e) != null) {
            this.f71429b.m175530h(c7w0Var);
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168465s3)).booleanValue()) {
            this.f71429b.m175526d(this.f71433f);
        }
        dlt0 dlt0Var = this.f71428a;
        q5u0 q5u0Var2 = this.f71429b;
        osu0 osu0VarMo116880n = dlt0Var.mo116880n();
        osu0VarMo116880n.mo122066d(q5u0Var2.m175532j());
        osu0VarMo116880n.mo122065a(this.f71430c);
        z0u0 z0u0VarZzb = osu0VarMo116880n.zze().zzb();
        return z0u0VarZzb.m218173i(z0u0VarZzb.m218174j());
    }
}
