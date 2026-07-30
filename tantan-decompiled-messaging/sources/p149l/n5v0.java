package p149l;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class n5v0 implements j3v0 {

    /* JADX INFO: renamed from: a */
    public final tot0 f137249a;

    /* JADX INFO: renamed from: b */
    public final p4v0 f137250b;

    /* JADX INFO: renamed from: c */
    public final rmw0 f137251c;

    /* JADX INFO: renamed from: d */
    public final ext0 f137252d;

    /* JADX INFO: renamed from: e */
    public final ScheduledExecutorService f137253e;

    /* JADX INFO: renamed from: f */
    public final mnu0 f137254f;

    public n5v0(tot0 tot0Var, p4v0 p4v0Var, ext0 ext0Var, ScheduledExecutorService scheduledExecutorService, rmw0 rmw0Var, mnu0 mnu0Var) {
        this.f137249a = tot0Var;
        this.f137250b = p4v0Var;
        this.f137252d = ext0Var;
        this.f137253e = scheduledExecutorService;
        this.f137251c = rmw0Var;
        this.f137254f = mnu0Var;
    }

    @Override // p149l.j3v0
    /* JADX INFO: renamed from: a */
    public final boolean mo120127a(vxv0 vxv0Var, kxv0 kxv0Var) {
        ces0 ces0VarM139021a = vxv0Var.f183477a.f166831a.m139021a();
        boolean zMo120127a = this.f137250b.mo120127a(vxv0Var, kxv0Var);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132376qb)).booleanValue()) {
            this.f137254f.m155566a().put("has_dbl", ces0VarM139021a != null ? "1" : "0");
            this.f137254f.m155566a().put("crdb", true == zMo120127a ? "1" : "0");
        }
        return ces0VarM139021a != null && zMo120127a;
    }

    @Override // p149l.j3v0
    /* JADX INFO: renamed from: b */
    public final gnr mo120128b(final vxv0 vxv0Var, final kxv0 kxv0Var) {
        return this.f137251c.mo122102R(new Callable() { // from class: l.l5v0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f126207a.m158018c(vxv0Var, kxv0Var);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ont0 m158018c(final vxv0 vxv0Var, final kxv0 kxv0Var) throws Exception {
        return this.f137249a.mo189929b(new uqt0(vxv0Var, kxv0Var, null), new gpt0(vxv0Var.f183477a.f166831a.m139021a(), new Runnable() { // from class: l.k5v0
            @Override // java.lang.Runnable
            public final void run() {
                this.f121237a.m158019f(vxv0Var, kxv0Var);
            }
        })).zza();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m158019f(vxv0 vxv0Var, kxv0 kxv0Var) {
        jmw0.m142245r(jmw0.m142242o(this.f137250b.mo120128b(vxv0Var, kxv0Var), kxv0Var.f125175S, TimeUnit.SECONDS, this.f137253e), new m5v0(this), this.f137251c);
    }
}
