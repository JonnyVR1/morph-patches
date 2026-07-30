package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.AbstractC16728e8;
import p153l.C16923f8;
import p153l.ag4;
import p153l.fpq;
import p153l.k6f;
import p153l.ot5;
import p153l.r5e;
import p153l.x5d0;
import p153l.y5e;
import p153l.z5e;

/* JADX INFO: renamed from: kotlinx.coroutines.m */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J5\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010&*\u00020%2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, m88121d2 = {"Lkotlinx/coroutines/m;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/h;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "timeMillis", "Ll/ag4;", "continuation", "scheduleResumeAfterDelay", "(JLl/ag4;)V", "Ll/z5e;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Ll/z5e;", "close", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ScheduledFuture;", "d0", "(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;J)Ljava/util/concurrent/ScheduledFuture;", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "a0", "(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/RejectedExecutionException;)V", "b", "Ljava/util/concurrent/Executor;", "Z", "()Ljava/util/concurrent/Executor;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class C15591m extends ExecutorCoroutineDispatcher implements InterfaceC15584h {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Executor executor;

    public C15591m(@NotNull Executor executor) {
        this.executor = executor;
        ot5.m169077a(getExecutor());
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @NotNull
    /* JADX INFO: renamed from: Z, reason: from getter */
    public Executor getExecutor() {
        return this.executor;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m95136a0(CoroutineContext context, RejectedExecutionException exception) {
        fpq.m126704c(context, k6f.m148513a("The task was rejected", exception));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executor = getExecutor();
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final ScheduledFuture<?> m95137d0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            m95136a0(coroutineContext, e);
            return null;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        Runnable runnableM119788h;
        try {
            Executor executor = getExecutor();
            AbstractC16728e8 abstractC16728e8 = C16923f8.f97691a;
            if (abstractC16728e8 == null || (runnableM119788h = abstractC16728e8.m119788h(block)) == null) {
                runnableM119788h = block;
            }
            executor.execute(runnableM119788h);
        } catch (RejectedExecutionException e) {
            AbstractC16728e8 abstractC16728e9 = C16923f8.f97691a;
            if (abstractC16728e9 != null) {
                abstractC16728e9.m119785e();
            }
            m95136a0(context, e);
            r5e.m179861b().dispatch(context, block);
        }
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof C15591m) && ((C15591m) other).getExecutor() == getExecutor();
    }

    public int hashCode() {
        return System.identityHashCode(getExecutor());
    }

    @Override // kotlinx.coroutines.InterfaceC15584h
    @NotNull
    public z5e invokeOnTimeout(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context) {
        long j;
        Runnable runnable;
        CoroutineContext coroutineContext;
        Executor executor = getExecutor();
        ScheduledFuture<?> scheduledFutureM95137d0 = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            j = timeMillis;
            runnable = block;
            coroutineContext = context;
            scheduledFutureM95137d0 = m95137d0(scheduledExecutorService, runnable, coroutineContext, j);
        } else {
            j = timeMillis;
            runnable = block;
            coroutineContext = context;
        }
        return scheduledFutureM95137d0 != null ? new y5e(scheduledFutureM95137d0) : RunnableC15583g.INSTANCE.invokeOnTimeout(j, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.InterfaceC15584h
    public void scheduleResumeAfterDelay(long timeMillis, @NotNull ag4<? super Unit> continuation) {
        long j;
        Executor executor = getExecutor();
        ScheduledFuture<?> scheduledFutureM95137d0 = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            j = timeMillis;
            scheduledFutureM95137d0 = m95137d0(scheduledExecutorService, new x5d0(this, continuation), continuation.getContext(), j);
        } else {
            j = timeMillis;
        }
        if (scheduledFutureM95137d0 != null) {
            fpq.m126709h(continuation, scheduledFutureM95137d0);
        } else {
            RunnableC15583g.INSTANCE.scheduleResumeAfterDelay(j, continuation);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        return getExecutor().toString();
    }
}
