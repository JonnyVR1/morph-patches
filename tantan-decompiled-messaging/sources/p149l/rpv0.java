package p149l;

import com.google.android.gms.internal.play_billing.RunnableC2407r;
import com.google.android.gms.internal.play_billing.RunnableFutureC2413u;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class rpv0 extends xkv0 implements rjv0 {

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f160569b;

    public rpv0(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.f160569b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.f160569b;
        RunnableFutureC2413u runnableFutureC2413uM14943A = RunnableFutureC2413u.m14943A(runnable, null);
        return new dmv0(runnableFutureC2413uM14943A, scheduledExecutorService.schedule(runnableFutureC2413uM14943A, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC2407r runnableC2407r = new RunnableC2407r(runnable);
        return new dmv0(runnableC2407r, this.f160569b.scheduleAtFixedRate(runnableC2407r, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC2407r runnableC2407r = new RunnableC2407r(runnable);
        return new dmv0(runnableC2407r, this.f160569b.scheduleWithFixedDelay(runnableC2407r, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        RunnableFutureC2413u runnableFutureC2413u = new RunnableFutureC2413u(callable);
        return new dmv0(runnableFutureC2413u, this.f160569b.schedule(runnableFutureC2413u, j, timeUnit));
    }
}
