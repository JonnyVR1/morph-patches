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
import p149l.AbstractC17712j8;
import p149l.C17950k8;
import p149l.bf4;
import p149l.d4e;
import p149l.g5f;
import p149l.gnq;
import p149l.k4e;
import p149l.ks5;
import p149l.l4e;
import p149l.uxc0;

/* JADX INFO: renamed from: kotlinx.coroutines.m */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J5\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010&*\u00020%2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, m87232d2 = {"Lkotlinx/coroutines/m;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/h;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "timeMillis", "Ll/bf4;", "continuation", "scheduleResumeAfterDelay", "(JLl/bf4;)V", "Ll/l4e;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Ll/l4e;", "close", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ScheduledFuture;", "c0", "(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;J)Ljava/util/concurrent/ScheduledFuture;", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "Z", "(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/RejectedExecutionException;)V", "b", "Ljava/util/concurrent/Executor;", "Y", "()Ljava/util/concurrent/Executor;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class C15484m extends ExecutorCoroutineDispatcher implements InterfaceC15477h {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Executor executor;

    public C15484m(@NotNull Executor executor) {
        this.executor = executor;
        ks5.m147036a(getExecutor());
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @NotNull
    /* JADX INFO: renamed from: Y, reason: from getter */
    public Executor getExecutor() {
        return this.executor;
    }

    /* JADX INFO: renamed from: Z */
    public final void m94243Z(CoroutineContext context, RejectedExecutionException exception) {
        gnq.m127162c(context, g5f.m124517a("The task was rejected", exception));
    }

    /* JADX INFO: renamed from: c0 */
    public final ScheduledFuture<?> m94244c0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            m94243Z(coroutineContext, e);
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executor = getExecutor();
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        Runnable runnableM140181h;
        try {
            Executor executor = getExecutor();
            AbstractC17712j8 abstractC17712j8 = C17950k8.f121709a;
            if (abstractC17712j8 == null || (runnableM140181h = abstractC17712j8.m140181h(block)) == null) {
                runnableM140181h = block;
            }
            executor.execute(runnableM140181h);
        } catch (RejectedExecutionException e) {
            AbstractC17712j8 abstractC17712j9 = C17950k8.f121709a;
            if (abstractC17712j9 != null) {
                abstractC17712j9.m140178e();
            }
            m94243Z(context, e);
            d4e.m109981b().dispatch(context, block);
        }
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof C15484m) && ((C15484m) other).getExecutor() == getExecutor();
    }

    public int hashCode() {
        return System.identityHashCode(getExecutor());
    }

    @Override // kotlinx.coroutines.InterfaceC15477h
    @NotNull
    public l4e invokeOnTimeout(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context) {
        long j;
        Runnable runnable;
        CoroutineContext coroutineContext;
        Executor executor = getExecutor();
        ScheduledFuture<?> scheduledFutureM94244c0 = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            j = timeMillis;
            runnable = block;
            coroutineContext = context;
            scheduledFutureM94244c0 = m94244c0(scheduledExecutorService, runnable, coroutineContext, j);
        } else {
            j = timeMillis;
            runnable = block;
            coroutineContext = context;
        }
        return scheduledFutureM94244c0 != null ? new k4e(scheduledFutureM94244c0) : RunnableC15476g.INSTANCE.invokeOnTimeout(j, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.InterfaceC15477h
    public void scheduleResumeAfterDelay(long timeMillis, @NotNull bf4<? super Unit> continuation) {
        long j;
        Executor executor = getExecutor();
        ScheduledFuture<?> scheduledFutureM94244c0 = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            j = timeMillis;
            scheduledFutureM94244c0 = m94244c0(scheduledExecutorService, new uxc0(this, continuation), continuation.getContext(), j);
        } else {
            j = timeMillis;
        }
        if (scheduledFutureM94244c0 != null) {
            gnq.m127167h(continuation, scheduledFutureM94244c0);
        } else {
            RunnableC15476g.INSTANCE.scheduleResumeAfterDelay(j, continuation);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        return getExecutor().toString();
    }
}
