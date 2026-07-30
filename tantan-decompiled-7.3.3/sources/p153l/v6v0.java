package p153l;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class v6v0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f182695a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f182696b;

    public v6v0(kqx0 kqx0Var, kqx0 kqx0Var2) {
        this.f182695a = kqx0Var;
        this.f182696b = kqx0Var2;
    }

    @Override // p153l.kqx0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final u6v0 zzb() {
        return new u6v0(((jlt0) this.f182695a).m146114a(), (ScheduledExecutorService) this.f182696b.zzb());
    }
}
