package p153l;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class w3v0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f187172a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f187173b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f187174c;

    /* JADX INFO: renamed from: d */
    public final kqx0 f187175d;

    /* JADX INFO: renamed from: e */
    public final kqx0 f187176e;

    public w3v0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3, kqx0 kqx0Var4, kqx0 kqx0Var5) {
        this.f187172a = kqx0Var;
        this.f187173b = kqx0Var2;
        this.f187174c = kqx0Var3;
        this.f187175d = kqx0Var4;
        this.f187176e = kqx0Var5;
    }

    @Override // p153l.kqx0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v3v0 zzb() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f187172a.zzb();
        xvw0 xvw0Var = oct0.f146733a;
        cqx0.m111999b(xvw0Var);
        xvw0 xvw0Var2 = oct0.f146734b;
        cqx0.m111999b(xvw0Var2);
        return new v3v0(scheduledExecutorService, xvw0Var, xvw0Var2, ((n4v0) this.f187175d).zzb(), tpx0.m192217a(fqx0.m126819a(this.f187176e)));
    }
}
