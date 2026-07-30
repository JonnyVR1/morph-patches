package p153l;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class tev0 implements pcv0 {

    /* JADX INFO: renamed from: a */
    public final zxt0 f173898a;

    /* JADX INFO: renamed from: b */
    public final vdv0 f173899b;

    /* JADX INFO: renamed from: c */
    public final xvw0 f173900c;

    /* JADX INFO: renamed from: d */
    public final k6u0 f173901d;

    /* JADX INFO: renamed from: e */
    public final ScheduledExecutorService f173902e;

    /* JADX INFO: renamed from: f */
    public final swu0 f173903f;

    public tev0(zxt0 zxt0Var, vdv0 vdv0Var, k6u0 k6u0Var, ScheduledExecutorService scheduledExecutorService, xvw0 xvw0Var, swu0 swu0Var) {
        this.f173898a = zxt0Var;
        this.f173899b = vdv0Var;
        this.f173901d = k6u0Var;
        this.f173902e = scheduledExecutorService;
        this.f173900c = xvw0Var;
        this.f173903f = swu0Var;
    }

    @Override // p153l.pcv0
    /* JADX INFO: renamed from: a */
    public final boolean mo98488a(b7w0 b7w0Var, q6w0 q6w0Var) {
        ins0 ins0VarM166385a = b7w0Var.f75342a.f197721a.m166385a();
        boolean zMo98488a = this.f173899b.mo98488a(b7w0Var, q6w0Var);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168447qb)).booleanValue()) {
            this.f173903f.m188363a().put("has_dbl", ins0VarM166385a != null ? "1" : "0");
            this.f173903f.m188363a().put("crdb", true == zMo98488a ? "1" : "0");
        }
        return ins0VarM166385a != null && zMo98488a;
    }

    @Override // p153l.pcv0
    /* JADX INFO: renamed from: b */
    public final hpr mo98489b(final b7w0 b7w0Var, final q6w0 q6w0Var) {
        return this.f173900c.mo155969R(new Callable() { // from class: l.rev0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f162702a.m190898c(b7w0Var, q6w0Var);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uwt0 m190898c(final b7w0 b7w0Var, final q6w0 q6w0Var) throws Exception {
        return this.f173898a.mo121815b(new a0u0(b7w0Var, q6w0Var, null), new myt0(b7w0Var.f75342a.f197721a.m166385a(), new Runnable() { // from class: l.qev0
            @Override // java.lang.Runnable
            public final void run() {
                this.f157218a.m190899f(b7w0Var, q6w0Var);
            }
        })).zza();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m190899f(b7w0 b7w0Var, q6w0 q6w0Var) {
        pvw0.m173991r(pvw0.m173988o(this.f173899b.mo98489b(b7w0Var, q6w0Var), q6w0Var.f155865S, TimeUnit.SECONDS, this.f173902e), new sev0(this), this.f173900c);
    }
}
