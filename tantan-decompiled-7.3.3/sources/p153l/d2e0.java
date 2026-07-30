package p153l;

import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J!\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\"\u0004\b\u0000\u0010\u001b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J-\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\"\u0004\b\u0000\u0010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001f\u0010\"J\u001d\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001f\u0010#J9\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u000e\"\u0004\b\u0000\u0010\u001b2\u0016\u0010%\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'JK\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u000e\"\u0004\b\u0000\u0010\u001b2\u0016\u0010%\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0018\u00010$2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b&\u0010(J-\u0010)\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001b2\u0016\u0010%\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0018\u00010$H\u0016¢\u0006\u0004\b)\u0010*J?\u0010)\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001b2\u0016\u0010%\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0018\u00010$2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b)\u0010+J/\u0010.\u001a\u0006\u0012\u0002\b\u00030-2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010,\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b.\u0010/J=\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-\"\u0004\b\u0000\u001002\u000e\u00101\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001c2\u0006\u0010,\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b.\u00102J7\u00105\u001a\u0006\u0012\u0002\b\u00030-2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b5\u00106J7\u00107\u001a\u0006\u0012\u0002\b\u00030-2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u00103\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b7\u00106R\u001b\u0010<\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006="}, m88121d2 = {"Ll/d2e0;", "", "Ljava/util/concurrent/ScheduledExecutorService;", "", "executorType", "<init>", "(I)V", "Ljava/lang/Runnable;", CommandMessage.COMMAND, "", "execute", "(Ljava/lang/Runnable;)V", "shutdown", "()V", "", "shutdownNow", "()Ljava/util/List;", "", "isShutdown", "()Z", "isTerminated", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "awaitTermination", "(JLjava/util/concurrent/TimeUnit;)Z", p7f.GPS_DIRECTION_TRUE, "Ljava/util/concurrent/Callable;", "task", "Ljava/util/concurrent/Future;", "submit", "(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;", LovePlanetStage.result, "(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;", "(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "", "tasks", "invokeAll", "(Ljava/util/Collection;)Ljava/util/List;", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/util/List;", "invokeAny", "(Ljava/util/Collection;)Ljava/lang/Object;", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "delay", "Ljava/util/concurrent/ScheduledFuture;", "schedule", "(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", p7f.GPS_MEASUREMENT_INTERRUPTED, "callable", "(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "initialDelay", "period", "scheduleAtFixedRate", "(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "scheduleWithFixedDelay", "a", "Ll/y6f;", "k", "()Ljava/util/concurrent/ScheduledExecutorService;", "delegate", "mwc_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class d2e0 implements Executor, ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: b */
    static final /* synthetic */ KProperty[] f84779b = {Reflection.m88403i(new PropertyReference1Impl(Reflection.m88396b(d2e0.class), "delegate", "getDelegate()Ljava/util/concurrent/ScheduledExecutorService;"))};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final y6f delegate;

    public d2e0(int i) {
        this.delegate = new y6f(i);
    }

    /* JADX INFO: renamed from: k */
    private final ScheduledExecutorService m113689k() {
        return this.delegate.m214483a(this, f84779b[0]);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long timeout, @Nullable TimeUnit unit) {
        return m113689k().awaitTermination(timeout, unit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        zmg0.m220382a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@Nullable Runnable command) {
        m113689k().execute(command);
    }

    @Override // java.util.concurrent.ExecutorService
    @NotNull
    public <T> List<Future<T>> invokeAll(@Nullable Collection<? extends Callable<T>> tasks) throws InterruptedException {
        List<Future<T>> listInvokeAll = m113689k().invokeAll(tasks);
        listInvokeAll.getClass();
        return listInvokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@Nullable Collection<? extends Callable<T>> tasks) {
        return (T) m113689k().invokeAny(tasks);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return m113689k().isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return m113689k().isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    @NotNull
    public ScheduledFuture<?> schedule(@Nullable Runnable command, long delay, @Nullable TimeUnit unit) {
        ScheduledFuture<?> scheduledFutureSchedule = m113689k().schedule(command, delay, unit);
        scheduledFutureSchedule.getClass();
        return scheduledFutureSchedule;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    @NotNull
    public ScheduledFuture<?> scheduleAtFixedRate(@Nullable Runnable command, long initialDelay, long period, @Nullable TimeUnit unit) {
        ScheduledFuture<?> scheduledFutureScheduleAtFixedRate = m113689k().scheduleAtFixedRate(command, initialDelay, period, unit);
        scheduledFutureScheduleAtFixedRate.getClass();
        return scheduledFutureScheduleAtFixedRate;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    @NotNull
    public ScheduledFuture<?> scheduleWithFixedDelay(@Nullable Runnable command, long initialDelay, long delay, @Nullable TimeUnit unit) {
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay = m113689k().scheduleWithFixedDelay(command, initialDelay, delay, unit);
        scheduledFutureScheduleWithFixedDelay.getClass();
        return scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() throws IllegalAccessException {
        throw new IllegalAccessException("shutdown is not allowed outside ThreadUtils");
    }

    @Override // java.util.concurrent.ExecutorService
    @NotNull
    public List<Runnable> shutdownNow() throws IllegalAccessException {
        throw new IllegalAccessException("shutdownNow is not allowed outside ThreadUtils");
    }

    @Override // java.util.concurrent.ExecutorService
    @NotNull
    public <T> Future<T> submit(@Nullable Callable<T> task) {
        Future<T> futureSubmit = m113689k().submit(task);
        futureSubmit.getClass();
        return futureSubmit;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@Nullable Collection<? extends Callable<T>> tasks, long timeout, @Nullable TimeUnit unit) {
        return (T) m113689k().invokeAny(tasks, timeout, unit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NotNull
    public <T> List<Future<T>> invokeAll(@Nullable Collection<? extends Callable<T>> tasks, long timeout, @Nullable TimeUnit unit) throws InterruptedException {
        List<Future<T>> listInvokeAll = m113689k().invokeAll(tasks, timeout, unit);
        listInvokeAll.getClass();
        return listInvokeAll;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    @NotNull
    public <V> ScheduledFuture<V> schedule(@Nullable Callable<V> callable, long delay, @Nullable TimeUnit unit) {
        ScheduledFuture<V> scheduledFutureSchedule = m113689k().schedule(callable, delay, unit);
        scheduledFutureSchedule.getClass();
        return scheduledFutureSchedule;
    }

    @Override // java.util.concurrent.ExecutorService
    @NotNull
    public <T> Future<T> submit(@Nullable Runnable task, T result) {
        Future<T> futureSubmit = m113689k().submit(task, result);
        futureSubmit.getClass();
        return futureSubmit;
    }

    @Override // java.util.concurrent.ExecutorService
    @NotNull
    public Future<?> submit(@Nullable Runnable task) {
        Future<?> futureSubmit = m113689k().submit(task);
        futureSubmit.getClass();
        return futureSubmit;
    }
}
