package p153l;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class wcw0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f188513a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f188514b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f188515c;

    public wcw0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3) {
        this.f188513a = kqx0Var;
        this.f188514b = kqx0Var2;
        this.f188515c = kqx0Var3;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        kpx0 kpx0VarM192217a = tpx0.m192217a(fqx0.m126819a(this.f188513a));
        kpx0 kpx0VarM192217a2 = tpx0.m192217a(fqx0.m126819a(this.f188514b));
        Object ycw0Var = ((Boolean) jas0.m144075c().m176505a(sgs0.f167924A8)).booleanValue() ? new ycw0((vcw0) kpx0VarM192217a.zzb(), (ScheduledExecutorService) this.f188515c.zzb()) : (vcw0) kpx0VarM192217a2.zzb();
        cqx0.m111999b(ycw0Var);
        return ycw0Var;
    }
}
