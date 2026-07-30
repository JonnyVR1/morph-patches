package p153l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class ogv0 extends ngv0 {

    /* JADX INFO: renamed from: a */
    public final dlt0 f147315a;

    /* JADX INFO: renamed from: b */
    public final q5u0 f147316b;

    /* JADX INFO: renamed from: c */
    public final ndu0 f147317c;

    /* JADX INFO: renamed from: d */
    public final ehv0 f147318d;

    /* JADX INFO: renamed from: e */
    public final tcv0 f147319e;

    public ogv0(dlt0 dlt0Var, q5u0 q5u0Var, ndu0 ndu0Var, ehv0 ehv0Var, tcv0 tcv0Var) {
        this.f147315a = dlt0Var;
        this.f147316b = q5u0Var;
        this.f147317c = ndu0Var;
        this.f147318d = ehv0Var;
        this.f147319e = tcv0Var;
    }

    @Override // p153l.ngv0
    /* JADX INFO: renamed from: c */
    public final hpr mo97934c(o7w0 o7w0Var, Bundle bundle, q6w0 q6w0Var, b7w0 b7w0Var) {
        q5u0 q5u0Var = this.f147316b;
        q5u0Var.m175531i(o7w0Var);
        q5u0Var.m175528f(bundle);
        q5u0Var.m175529g(new z3u0(b7w0Var, q6w0Var, this.f147318d));
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168465s3)).booleanValue()) {
            this.f147316b.m175526d(this.f147319e);
        }
        dlt0 dlt0Var = this.f147315a;
        q5u0 q5u0Var2 = this.f147316b;
        yvt0 yvt0VarMo116875i = dlt0Var.mo116875i();
        yvt0VarMo116875i.mo187003d(q5u0Var2.m175532j());
        yvt0VarMo116875i.mo187002a(this.f147317c);
        z0u0 z0u0VarZzb = yvt0VarMo116875i.zze().zzb();
        return z0u0VarZzb.m218173i(z0u0VarZzb.m218174j());
    }
}
