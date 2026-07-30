package p149l;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class quu0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f156542a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f156543b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f156544c;

    /* JADX INFO: renamed from: d */
    public final ehx0 f156545d;

    /* JADX INFO: renamed from: e */
    public final ehx0 f156546e;

    public quu0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3, ehx0 ehx0Var4, ehx0 ehx0Var5) {
        this.f156542a = ehx0Var;
        this.f156543b = ehx0Var2;
        this.f156544c = ehx0Var3;
        this.f156545d = ehx0Var4;
        this.f156546e = ehx0Var5;
    }

    @Override // p149l.ehx0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final puu0 zzb() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f156542a.zzb();
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        rmw0 rmw0Var2 = i3t0.f111373b;
        wgx0.m203089b(rmw0Var2);
        return new puu0(scheduledExecutorService, rmw0Var, rmw0Var2, ((hvu0) this.f156545d).zzb(), ngx0.m159363a(zgx0.m218724a(this.f156546e)));
    }
}
