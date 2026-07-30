package p153l;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class znu0 implements j7u0 {

    /* JADX INFO: renamed from: a */
    public final ulu0 f205253a;

    /* JADX INFO: renamed from: b */
    public final zlu0 f205254b;

    /* JADX INFO: renamed from: c */
    public final Executor f205255c;

    /* JADX INFO: renamed from: d */
    public final Executor f205256d;

    public znu0(ulu0 ulu0Var, zlu0 zlu0Var, Executor executor, Executor executor2) {
        this.f205253a = ulu0Var;
        this.f205254b = zlu0Var;
        this.f205255c = executor;
        this.f205256d = executor2;
    }

    @Override // p153l.j7u0
    /* JADX INFO: renamed from: a */
    public final void mo106809a() {
        if (this.f205254b.mo216636d()) {
            ulu0 ulu0Var = this.f205253a;
            hfw0 hfw0VarM196605h0 = ulu0Var.m196605h0();
            if (hfw0VarM196605h0 == null && ulu0Var.m196609j0() != null && ((Boolean) jas0.m144075c().m176505a(sgs0.f168233a5)).booleanValue()) {
                ulu0 ulu0Var2 = this.f205253a;
                hpr hprVarM196609j0 = ulu0Var2.m196609j0();
                tct0 tct0VarM196596c0 = ulu0Var2.m196596c0();
                if (hprVarM196609j0 == null || tct0VarM196596c0 == null) {
                    return;
                }
                pvw0.m173991r(pvw0.m173985l(hprVarM196609j0, tct0VarM196596c0), new ynu0(this), this.f205256d);
                return;
            }
            if (hfw0VarM196605h0 != null) {
                ulu0 ulu0Var3 = this.f205253a;
                wit0 wit0VarM196600e0 = ulu0Var3.m196600e0();
                wit0 wit0VarM196602f0 = ulu0Var3.m196602f0();
                if (wit0VarM196600e0 == null) {
                    wit0VarM196600e0 = wit0VarM196602f0 != null ? wit0VarM196602f0 : null;
                }
                if (wit0VarM196600e0 != null) {
                    m220677c(wit0VarM196600e0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m220677c(final wit0 wit0Var) {
        this.f205255c.execute(new Runnable() { // from class: l.xnu0
            @Override // java.lang.Runnable
            public final void run() {
                wit0Var.mo13728Z("onSdkImpression", new l01());
            }
        });
    }
}
