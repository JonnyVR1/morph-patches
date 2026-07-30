package p153l;

import com.google.android.gms.internal.play_billing.RunnableC2430r;
import com.google.android.gms.internal.play_billing.RunnableFutureC2436u;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class xyv0 extends duv0 implements xsv0 {

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f196792b;

    public xyv0(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.f196792b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.f196792b;
        RunnableFutureC2436u runnableFutureC2436uM14997A = RunnableFutureC2436u.m14997A(runnable, null);
        return new jvv0(runnableFutureC2436uM14997A, scheduledExecutorService.schedule(runnableFutureC2436uM14997A, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC2430r runnableC2430r = new RunnableC2430r(runnable);
        return new jvv0(runnableC2430r, this.f196792b.scheduleAtFixedRate(runnableC2430r, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC2430r runnableC2430r = new RunnableC2430r(runnable);
        return new jvv0(runnableC2430r, this.f196792b.scheduleWithFixedDelay(runnableC2430r, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        RunnableFutureC2436u runnableFutureC2436u = new RunnableFutureC2436u(callable);
        return new jvv0(runnableFutureC2436u, this.f196792b.schedule(runnableFutureC2436u, j, timeUnit));
    }
}
