package p149l;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class h0t0 extends n0t0 {

    /* JADX INFO: renamed from: b */
    public final Clock f105245b;

    /* JADX INFO: renamed from: c */
    public final h0t0 f105246c = this;

    /* JADX INFO: renamed from: d */
    public final xgx0 f105247d;

    /* JADX INFO: renamed from: e */
    public final xgx0 f105248e;

    /* JADX INFO: renamed from: f */
    public final xgx0 f105249f;

    /* JADX INFO: renamed from: g */
    public final xgx0 f105250g;

    /* JADX INFO: renamed from: h */
    public final xgx0 f105251h;

    /* JADX INFO: renamed from: i */
    public final xgx0 f105252i;

    /* JADX INFO: renamed from: j */
    public final xgx0 f105253j;

    /* JADX INFO: renamed from: k */
    public final xgx0 f105254k;

    public /* synthetic */ h0t0(Context context, Clock clock, aiw0 aiw0Var, m0t0 m0t0Var, g0t0 g0t0Var) {
        this.f105245b = clock;
        ogx0 ogx0VarM168925a = pgx0.m168925a(context);
        this.f105247d = ogx0VarM168925a;
        ogx0 ogx0VarM168925a2 = pgx0.m168925a(aiw0Var);
        this.f105248e = ogx0VarM168925a2;
        ogx0 ogx0VarM168925a3 = pgx0.m168925a(m0t0Var);
        this.f105249f = ogx0VarM168925a3;
        this.f105250g = ngx0.m159364b(new szs0(ogx0VarM168925a, ogx0VarM168925a2, ogx0VarM168925a3));
        ogx0 ogx0VarM168925a4 = pgx0.m168925a(clock);
        this.f105251h = ogx0VarM168925a4;
        xgx0 xgx0VarM159364b = ngx0.m159364b(new uzs0(ogx0VarM168925a4, ogx0VarM168925a2, ogx0VarM168925a3));
        this.f105252i = xgx0VarM159364b;
        wzs0 wzs0Var = new wzs0(ogx0VarM168925a4, xgx0VarM159364b);
        this.f105253j = wzs0Var;
        this.f105254k = ngx0.m159364b(new s0t0(ogx0VarM168925a, wzs0Var));
    }

    @Override // p149l.n0t0
    /* JADX INFO: renamed from: a */
    public final rzs0 mo128975a() {
        return (rzs0) this.f105250g.zzb();
    }

    @Override // p149l.n0t0
    /* JADX INFO: renamed from: b */
    public final vzs0 mo128976b() {
        return new vzs0(this.f105245b, (tzs0) this.f105252i.zzb());
    }

    @Override // p149l.n0t0
    /* JADX INFO: renamed from: c */
    public final r0t0 mo128977c() {
        return (r0t0) this.f105254k.zzb();
    }
}
