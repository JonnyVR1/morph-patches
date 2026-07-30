package p149l;

import com.google.android.gms.internal.ads.RunnableC2252t3;
import com.google.android.gms.internal.ads.RunnableFutureC2292y3;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class xmw0 extends vmw0 implements ScheduledExecutorService, rmw0, AutoCloseable {

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f193585b;

    public xmw0(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.f193585b = scheduledExecutorService;
    }

    @Override // p149l.flw0, p149l.rmw0, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        reg0.m179043a(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.f193585b;
        RunnableFutureC2292y3 runnableFutureC2292y3M13486D = RunnableFutureC2292y3.m13486D(runnable, null);
        return new wmw0(runnableFutureC2292y3M13486D, scheduledExecutorService.schedule(runnableFutureC2292y3M13486D, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC2252t3 runnableC2252t3 = new RunnableC2252t3(runnable);
        return new wmw0(runnableC2252t3, this.f193585b.scheduleAtFixedRate(runnableC2252t3, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC2252t3 runnableC2252t3 = new RunnableC2252t3(runnable);
        return new wmw0(runnableC2252t3, this.f193585b.scheduleWithFixedDelay(runnableC2252t3, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        RunnableFutureC2292y3 runnableFutureC2292y3 = new RunnableFutureC2292y3(callable);
        return new wmw0(runnableFutureC2292y3, this.f193585b.schedule(runnableFutureC2292y3, j, timeUnit));
    }
}
