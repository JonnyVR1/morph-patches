package p153l;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class qzv0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f160308a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f160309b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f160310c;

    public qzv0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3) {
        this.f160308a = kqx0Var;
        this.f160309b = kqx0Var2;
        this.f160310c = kqx0Var3;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ozv0(new v1t0(), (ScheduledExecutorService) this.f160309b.zzb(), ((jlt0) this.f160310c).m146114a());
    }
}
