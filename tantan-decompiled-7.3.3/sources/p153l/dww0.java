package p153l;

import com.google.android.gms.internal.ads.RunnableC2275t3;
import com.google.android.gms.internal.ads.RunnableFutureC2315y3;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class dww0 extends bww0 implements ScheduledExecutorService, xvw0, AutoCloseable {

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f91051b;

    public dww0(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.f91051b = scheduledExecutorService;
    }

    @Override // p153l.luw0, p153l.xvw0, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        zmg0.m220382a(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.f91051b;
        RunnableFutureC2315y3 runnableFutureC2315y3M13540D = RunnableFutureC2315y3.m13540D(runnable, null);
        return new cww0(runnableFutureC2315y3M13540D, scheduledExecutorService.schedule(runnableFutureC2315y3M13540D, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC2275t3 runnableC2275t3 = new RunnableC2275t3(runnable);
        return new cww0(runnableC2275t3, this.f91051b.scheduleAtFixedRate(runnableC2275t3, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC2275t3 runnableC2275t3 = new RunnableC2275t3(runnable);
        return new cww0(runnableC2275t3, this.f91051b.scheduleWithFixedDelay(runnableC2275t3, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        RunnableFutureC2315y3 runnableFutureC2315y3 = new RunnableFutureC2315y3(callable);
        return new cww0(runnableFutureC2315y3, this.f91051b.schedule(runnableFutureC2315y3, j, timeUnit));
    }
}
