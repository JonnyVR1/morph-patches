package p153l;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class kgv0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f126654a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f126655b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f126656c;

    /* JADX INFO: renamed from: d */
    public final kqx0 f126657d;

    /* JADX INFO: renamed from: e */
    public final kqx0 f126658e;

    public kgv0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3, kqx0 kqx0Var4, kqx0 kqx0Var5) {
        this.f126654a = kqx0Var;
        this.f126655b = kqx0Var2;
        this.f126656c = kqx0Var3;
        this.f126657d = kqx0Var4;
        this.f126658e = kqx0Var5;
    }

    @Override // p153l.kqx0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final igv0 zzb() {
        xvw0 xvw0Var = oct0.f146733a;
        cqx0.m111999b(xvw0Var);
        return new igv0(xvw0Var, (ScheduledExecutorService) this.f126655b.zzb(), (nzt0) this.f126656c.zzb(), (ehv0) this.f126657d.zzb(), (uew0) this.f126658e.zzb());
    }
}
