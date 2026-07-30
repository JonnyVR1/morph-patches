package p153l;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class iis0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f115123a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f115124b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f115125c;

    /* JADX INFO: renamed from: d */
    public final kqx0 f115126d;

    public iis0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3, kqx0 kqx0Var4) {
        this.f115123a = kqx0Var;
        this.f115124b = kqx0Var2;
        this.f115125c = kqx0Var3;
        this.f115126d = kqx0Var4;
    }

    @Override // p153l.kqx0
    public final /* synthetic */ Object zzb() {
        return new his0(((jlt0) this.f115123a).m146114a(), (ScheduledExecutorService) this.f115124b.zzb(), new jis0(), (cew0) this.f115126d.zzb());
    }
}
