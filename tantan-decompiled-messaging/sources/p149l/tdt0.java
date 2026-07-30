package p149l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzflg;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class tdt0 extends onv0 {

    /* JADX INFO: renamed from: a */
    public final eqv0 f169754a;

    /* JADX INFO: renamed from: b */
    public final iet0 f169755b;

    /* JADX INFO: renamed from: c */
    public final tdt0 f169756c = this;

    /* JADX INFO: renamed from: d */
    public final xgx0 f169757d;

    /* JADX INFO: renamed from: e */
    public final xgx0 f169758e;

    /* JADX INFO: renamed from: f */
    public final xgx0 f169759f;

    /* JADX INFO: renamed from: g */
    public final xgx0 f169760g;

    /* JADX INFO: renamed from: h */
    public final xgx0 f169761h;

    /* JADX INFO: renamed from: i */
    public final xgx0 f169762i;

    /* JADX INFO: renamed from: j */
    public final xgx0 f169763j;

    /* JADX INFO: renamed from: k */
    public final xgx0 f169764k;

    /* JADX INFO: renamed from: l */
    public final xgx0 f169765l;

    /* JADX INFO: renamed from: m */
    public final xgx0 f169766m;

    /* JADX INFO: renamed from: n */
    public final xgx0 f169767n;

    public /* synthetic */ tdt0(iet0 iet0Var, eqv0 eqv0Var, sdt0 sdt0Var) {
        this.f169755b = iet0Var;
        this.f169754a = eqv0Var;
        gqv0 gqv0Var = new gqv0(eqv0Var);
        this.f169757d = gqv0Var;
        xgx0 xgx0VarM159364b = ngx0.m159364b(lmu0.m150618a());
        this.f169758e = xgx0VarM159364b;
        xgx0 xgx0VarM159364b2 = ngx0.m159364b(jmu0.m142227a());
        this.f169759f = xgx0VarM159364b2;
        xgx0 xgx0VarM159364b3 = ngx0.m159364b(nmu0.m160160a());
        this.f169760g = xgx0VarM159364b3;
        xgx0 xgx0VarM159364b4 = ngx0.m159364b(pmu0.m170377a());
        this.f169761h = xgx0VarM159364b4;
        rgx0 rgx0VarM184138b = sgx0.m184138b(4);
        rgx0VarM184138b.m179266b(zzflg.GMS_SIGNALS, xgx0VarM159364b);
        rgx0VarM184138b.m179266b(zzflg.BUILD_URL, xgx0VarM159364b2);
        rgx0VarM184138b.m179266b(zzflg.HTTP, xgx0VarM159364b3);
        rgx0VarM184138b.m179266b(zzflg.PRE_PROCESS, xgx0VarM159364b4);
        sgx0 sgx0VarM179267c = rgx0VarM184138b.m179267c();
        this.f169762i = sgx0VarM179267c;
        xgx0 xgx0VarM159364b5 = ngx0.m159364b(new qmu0(gqv0Var, iet0Var.f112888h, w1w0.m200981a(), sgx0VarM179267c));
        this.f169763j = xgx0VarM159364b5;
        bhx0 bhx0VarM107025a = chx0.m107025a(0, 1);
        bhx0VarM107025a.m101949a(xgx0VarM159364b5);
        chx0 chx0VarM101951c = bhx0VarM107025a.m101951c();
        this.f169764k = chx0VarM101951c;
        i3w0 i3w0Var = new i3w0(chx0VarM101951c);
        this.f169765l = i3w0Var;
        this.f169766m = ngx0.m159364b(new h3w0(w1w0.m200981a(), iet0Var.f112900n, i3w0Var));
        this.f169767n = ngx0.m159364b(new z4w0(iet0Var.f112849H));
    }

    @Override // p149l.onv0
    /* JADX INFO: renamed from: a */
    public final tlv0 mo165229a() {
        Context contextM95836a = this.f169755b.f112876b.m95836a();
        wgx0.m203089b(contextM95836a);
        d1t0 d1t0Var = new d1t0();
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        ypv0 ypv0Var = new ypv0(d1t0Var, rmw0Var, fqv0.m122768a(this.f169754a));
        wgx0.m203089b(rmw0Var);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f169755b.f112900n.zzb();
        w4w0 w4w0Var = (w4w0) this.f169767n.zzb();
        rnu0 rnu0Var = (rnu0) this.f169755b.f112875a0.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add(new mjv0(ypv0Var, 0L, scheduledExecutorService));
        return new tlv0(contextM95836a, rmw0Var, hashSet, w4w0Var, rnu0Var);
    }

    @Override // p149l.onv0
    /* JADX INFO: renamed from: b */
    public final f3w0 mo165230b() {
        return (f3w0) this.f169766m.zzb();
    }
}
