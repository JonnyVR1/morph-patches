package p149l;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class znv0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f204022a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f204023b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f204024c;

    /* JADX INFO: renamed from: d */
    public final ehx0 f204025d;

    /* JADX INFO: renamed from: e */
    public final ehx0 f204026e;

    public znv0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3, ehx0 ehx0Var4, ehx0 ehx0Var5) {
        this.f204022a = ehx0Var;
        this.f204023b = ehx0Var2;
        this.f204024c = ehx0Var3;
        this.f204025d = ehx0Var4;
        this.f204026e = ehx0Var5;
    }

    /* JADX INFO: renamed from: a */
    public static xnv0 m219494a(String str, w1s0 w1s0Var, y1t0 y1t0Var, ScheduledExecutorService scheduledExecutorService, rmw0 rmw0Var) {
        return new xnv0(str, w1s0Var, y1t0Var, scheduledExecutorService, rmw0Var);
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        String strM156007a = ((mqv0) this.f204022a).m156007a();
        w1s0 w1s0Var = new w1s0();
        y1t0 y1t0Var = (y1t0) this.f204024c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f204025d.zzb();
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        return new xnv0(strM156007a, w1s0Var, y1t0Var, scheduledExecutorService, rmw0Var);
    }
}
