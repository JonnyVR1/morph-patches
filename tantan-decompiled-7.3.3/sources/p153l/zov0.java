package p153l;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class zov0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f205394a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f205395b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f205396c;

    /* JADX INFO: renamed from: d */
    public final kqx0 f205397d;

    public zov0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3, kqx0 kqx0Var4) {
        this.f205394a = kqx0Var;
        this.f205395b = kqx0Var2;
        this.f205396c = kqx0Var3;
        this.f205397d = kqx0Var4;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextM146114a = ((jlt0) this.f205394a).m146114a();
        ebt0 ebt0Var = (ebt0) this.f205395b.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f205396c.zzb();
        xvw0 xvw0Var = oct0.f146733a;
        cqx0.m111999b(xvw0Var);
        return new xov0(contextM146114a, ebt0Var, scheduledExecutorService, xvw0Var);
    }
}
