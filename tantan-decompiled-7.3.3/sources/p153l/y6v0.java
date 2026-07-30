package p153l;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class y6v0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f197718a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f197719b;

    public y6v0(kqx0 kqx0Var, kqx0 kqx0Var2) {
        this.f197718a = kqx0Var;
        this.f197719b = kqx0Var2;
    }

    @Override // p153l.kqx0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x6v0 zzb() {
        return new x6v0(((jlt0) this.f197718a).m146114a(), (ScheduledExecutorService) this.f197719b.zzb());
    }
}
