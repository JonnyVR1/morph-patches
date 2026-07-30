package p153l;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class ncw0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f141407a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f141408b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f141409c;

    public ncw0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3) {
        this.f141407a = kqx0Var;
        this.f141408b = kqx0Var2;
        this.f141409c = kqx0Var3;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        xvw0 xvw0Var = oct0.f146733a;
        cqx0.m111999b(xvw0Var);
        return new lcw0(xvw0Var, (ScheduledExecutorService) this.f141408b.zzb(), ((ocw0) this.f141409c).zzb());
    }
}
