package p153l;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class e7u0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f92465a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f92466b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f92467c;

    /* JADX INFO: renamed from: d */
    public final kqx0 f92468d;

    public e7u0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3, kqx0 kqx0Var4) {
        this.f92465a = kqx0Var;
        this.f92466b = kqx0Var2;
        this.f92467c = kqx0Var3;
        this.f92468d = kqx0Var4;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        b7u0 b7u0VarZzb = ((d7u0) this.f92465a).zzb();
        Set setZzb = ((iqx0) this.f92466b).zzb();
        xvw0 xvw0Var = oct0.f146733a;
        cqx0.m111999b(xvw0Var);
        return new c7u0(b7u0VarZzb, setZzb, xvw0Var, (ScheduledExecutorService) this.f92468d.zzb());
    }
}
