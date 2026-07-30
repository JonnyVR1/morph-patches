package p153l;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class qgv0 extends ngv0 {

    /* JADX INFO: renamed from: a */
    public final dlt0 f157475a;

    /* JADX INFO: renamed from: b */
    public final q5u0 f157476b;

    /* JADX INFO: renamed from: c */
    public final ujv0 f157477c;

    /* JADX INFO: renamed from: d */
    public final ndu0 f157478d;

    /* JADX INFO: renamed from: e */
    public final lju0 f157479e;

    /* JADX INFO: renamed from: f */
    public final r9u0 f157480f;

    /* JADX INFO: renamed from: g */
    public final ViewGroup f157481g;

    /* JADX INFO: renamed from: h */
    public final lcu0 f157482h;

    /* JADX INFO: renamed from: i */
    public final ehv0 f157483i;

    /* JADX INFO: renamed from: j */
    public final tcv0 f157484j;

    public qgv0(dlt0 dlt0Var, q5u0 q5u0Var, ujv0 ujv0Var, ndu0 ndu0Var, lju0 lju0Var, r9u0 r9u0Var, @Nullable ViewGroup viewGroup, @Nullable lcu0 lcu0Var, ehv0 ehv0Var, tcv0 tcv0Var) {
        this.f157475a = dlt0Var;
        this.f157476b = q5u0Var;
        this.f157477c = ujv0Var;
        this.f157478d = ndu0Var;
        this.f157479e = lju0Var;
        this.f157480f = r9u0Var;
        this.f157481g = viewGroup;
        this.f157482h = lcu0Var;
        this.f157483i = ehv0Var;
        this.f157484j = tcv0Var;
    }

    @Override // p153l.ngv0
    /* JADX INFO: renamed from: c */
    public final hpr mo97934c(o7w0 o7w0Var, Bundle bundle, q6w0 q6w0Var, b7w0 b7w0Var) {
        q5u0 q5u0Var = this.f157476b;
        q5u0Var.m175531i(o7w0Var);
        q5u0Var.m175528f(bundle);
        q5u0Var.m175529g(new z3u0(b7w0Var, q6w0Var, this.f157483i));
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168465s3)).booleanValue()) {
            this.f157476b.m175526d(this.f157484j);
        }
        dlt0 dlt0Var = this.f157475a;
        q5u0 q5u0Var2 = this.f157476b;
        yxt0 yxt0VarMo116876j = dlt0Var.mo116876j();
        yxt0VarMo116876j.mo111697o(q5u0Var2.m175532j());
        yxt0VarMo116876j.mo111694g(this.f157478d);
        yxt0VarMo116876j.mo111698p(this.f157477c);
        yxt0VarMo116876j.mo111691c(this.f157479e);
        yxt0VarMo116876j.mo111692e(new vyt0(this.f157480f, this.f157482h));
        yxt0VarMo116876j.mo111690b(new rwt0(this.f157481g));
        z0u0 z0u0VarMo121817d = yxt0VarMo116876j.zzk().mo121817d();
        return z0u0VarMo121817d.m218173i(z0u0VarMo121817d.m218174j());
    }
}
