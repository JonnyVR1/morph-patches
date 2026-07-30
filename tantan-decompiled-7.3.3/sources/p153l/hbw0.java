package p153l;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes6.dex */
public final class hbw0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f108659a;

    public hbw0(kqx0 kqx0Var) {
        this.f108659a = kqx0Var;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        ThreadFactory threadFactory = (ThreadFactory) this.f108659a.zzb();
        tkw0.m191601a();
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
        cqx0.m111999b(scheduledExecutorServiceUnconfigurableScheduledExecutorService);
        return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }
}
