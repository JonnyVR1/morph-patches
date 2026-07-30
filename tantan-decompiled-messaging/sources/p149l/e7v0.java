package p149l;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class e7v0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f89755a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f89756b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f89757c;

    /* JADX INFO: renamed from: d */
    public final ehx0 f89758d;

    /* JADX INFO: renamed from: e */
    public final ehx0 f89759e;

    public e7v0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3, ehx0 ehx0Var4, ehx0 ehx0Var5) {
        this.f89755a = ehx0Var;
        this.f89756b = ehx0Var2;
        this.f89757c = ehx0Var3;
        this.f89758d = ehx0Var4;
        this.f89759e = ehx0Var5;
    }

    @Override // p149l.ehx0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c7v0 zzb() {
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        return new c7v0(rmw0Var, (ScheduledExecutorService) this.f89756b.zzb(), (hqt0) this.f89757c.zzb(), (y7v0) this.f89758d.zzb(), (o5w0) this.f89759e.zzb());
    }
}
