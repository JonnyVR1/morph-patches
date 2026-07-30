package p149l;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class h3w0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f105768a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f105769b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f105770c;

    public h3w0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3) {
        this.f105768a = ehx0Var;
        this.f105769b = ehx0Var2;
        this.f105770c = ehx0Var3;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        return new f3w0(rmw0Var, (ScheduledExecutorService) this.f105769b.zzb(), ((i3w0) this.f105770c).zzb());
    }
}
