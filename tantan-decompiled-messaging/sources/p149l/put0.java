package p149l;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class put0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f151351a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f151352b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f151353c;

    /* JADX INFO: renamed from: d */
    public final ehx0 f151354d;

    /* JADX INFO: renamed from: e */
    public final ehx0 f151355e;

    public put0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3, ehx0 ehx0Var4, ehx0 ehx0Var5) {
        this.f151351a = ehx0Var;
        this.f151352b = ehx0Var2;
        this.f151353c = ehx0Var3;
        this.f151354d = ehx0Var4;
        this.f151355e = ehx0Var5;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        byt0 byt0Var = (byt0) this.f151351a.zzb();
        kxv0 kxv0VarM199592a = ((vqt0) this.f151352b).m199592a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f151353c.zzb();
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        return new out0(byt0Var, kxv0VarM199592a, scheduledExecutorService, rmw0Var, ((wqt0) this.f151355e).m205071a());
    }
}
