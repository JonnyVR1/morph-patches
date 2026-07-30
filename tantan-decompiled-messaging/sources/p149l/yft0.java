package p149l;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class yft0 implements hpu0 {

    /* JADX INFO: renamed from: a */
    public final Context f198085a;

    /* JADX INFO: renamed from: b */
    public final ais0 f198086b;

    /* JADX INFO: renamed from: c */
    public final iet0 f198087c;

    /* JADX INFO: renamed from: d */
    public final yft0 f198088d = this;

    /* JADX INFO: renamed from: e */
    public final xgx0 f198089e;

    /* JADX INFO: renamed from: f */
    public final xgx0 f198090f;

    /* JADX INFO: renamed from: g */
    public final xgx0 f198091g;

    /* JADX INFO: renamed from: h */
    public final xgx0 f198092h;

    public /* synthetic */ yft0(iet0 iet0Var, Context context, ais0 ais0Var, xft0 xft0Var) {
        this.f198087c = iet0Var;
        this.f198085a = context;
        this.f198086b = ais0Var;
        ogx0 ogx0VarM168925a = pgx0.m168925a(this);
        this.f198089e = ogx0VarM168925a;
        ogx0 ogx0VarM168925a2 = pgx0.m168925a(ais0Var);
        this.f198090f = ogx0VarM168925a2;
        dpu0 dpu0Var = new dpu0(ogx0VarM168925a2);
        this.f198091g = dpu0Var;
        this.f198092h = ngx0.m159364b(new fpu0(ogx0VarM168925a, dpu0Var));
    }

    @Override // p149l.hpu0
    public final you0 zzb() {
        return new sft0(this.f198087c, this.f198088d, null);
    }

    @Override // p149l.hpu0
    public final epu0 zzd() {
        return (epu0) this.f198092h.zzb();
    }
}
