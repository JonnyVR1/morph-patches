package p153l;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class uev0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f178694a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f178695b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f178696c;

    /* JADX INFO: renamed from: d */
    public final kqx0 f178697d;

    /* JADX INFO: renamed from: e */
    public final kqx0 f178698e;

    /* JADX INFO: renamed from: f */
    public final kqx0 f178699f;

    public uev0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3, kqx0 kqx0Var4, kqx0 kqx0Var5, kqx0 kqx0Var6) {
        this.f178694a = kqx0Var;
        this.f178695b = kqx0Var2;
        this.f178696c = kqx0Var3;
        this.f178697d = kqx0Var4;
        this.f178698e = kqx0Var5;
        this.f178699f = kqx0Var6;
    }

    @Override // p153l.kqx0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tev0 zzb() {
        zxt0 zxt0Var = (zxt0) this.f178694a.zzb();
        vdv0 vdv0VarZzb = ((wdv0) this.f178695b).zzb();
        k6u0 k6u0Var = (k6u0) this.f178696c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f178697d.zzb();
        xvw0 xvw0Var = oct0.f146733a;
        cqx0.m111999b(xvw0Var);
        return new tev0(zxt0Var, vdv0VarZzb, k6u0Var, scheduledExecutorService, xvw0Var, (swu0) this.f178699f.zzb());
    }
}
