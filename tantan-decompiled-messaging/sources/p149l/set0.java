package p149l;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class set0 implements nrv0 {

    /* JADX INFO: renamed from: a */
    public final iet0 f164059a;

    /* JADX INFO: renamed from: b */
    public final set0 f164060b = this;

    /* JADX INFO: renamed from: c */
    public final xgx0 f164061c;

    /* JADX INFO: renamed from: d */
    public final xgx0 f164062d;

    /* JADX INFO: renamed from: e */
    public final xgx0 f164063e;

    /* JADX INFO: renamed from: f */
    public final xgx0 f164064f;

    /* JADX INFO: renamed from: g */
    public final xgx0 f164065g;

    /* JADX INFO: renamed from: h */
    public final xgx0 f164066h;

    public /* synthetic */ set0(iet0 iet0Var, Context context, String str, ret0 ret0Var) {
        this.f164059a = iet0Var;
        ogx0 ogx0VarM168925a = pgx0.m168925a(context);
        this.f164061c = ogx0VarM168925a;
        ogx0 ogx0VarM168925a2 = pgx0.m168925a(str);
        this.f164062d = ogx0VarM168925a2;
        uuv0 uuv0Var = new uuv0(ogx0VarM168925a, iet0Var.f112854J0, iet0Var.f112856K0);
        this.f164063e = uuv0Var;
        xgx0 xgx0VarM159364b = ngx0.m159364b(new qsv0(iet0Var.f112854J0));
        this.f164064f = xgx0VarM159364b;
        xgx0 xgx0VarM159364b2 = ngx0.m159364b(new ssv0(ogx0VarM168925a, iet0Var.f112904p, iet0Var.f112870V, uuv0Var, xgx0VarM159364b, kyv0.m147901a(), iet0Var.f112890i));
        this.f164065g = xgx0VarM159364b2;
        this.f164066h = ngx0.m159364b(new ysv0(iet0Var.f112870V, ogx0VarM168925a, ogx0VarM168925a2, xgx0VarM159364b2, xgx0VarM159364b, iet0Var.f112890i, iet0Var.f112875a0));
    }

    @Override // p149l.nrv0
    public final xsv0 zza() {
        return (xsv0) this.f164066h.zzb();
    }
}
