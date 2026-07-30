package com.immomo.mmutil.task;

import com.clevertap.android.sdk.Constants;
import com.heytap.mcssdk.mode.CommandMessage;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;
import p149l.reg0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 92\u00020\u0001:\u00025:B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016Jä\u0001\u0010\u001e\u001a^\u0012(\u0012&\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u001c0\u001c \u0012*.\u0012(\u0012&\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u001c0\u001c\u0018\u00010\u001d0\f\"\u0010\b\u0000\u0010\u0018*\n \u0012*\u0004\u0018\u00010\u00170\u00172d\u0010\u0010\u001a`\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u001a0\u001a \u0012*.\u0012(\u0012&\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u001a0\u001a\u0018\u00010\u001b0\u0019H\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJü\u0001\u0010\u001e\u001a^\u0012(\u0012&\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u001c0\u001c \u0012*.\u0012(\u0012&\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u001c0\u001c\u0018\u00010\u001d0\f\"\u0010\b\u0000\u0010\u0018*\n \u0012*\u0004\u0018\u00010\u00170\u00172d\u0010\u0010\u001a`\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u001a0\u001a \u0012*.\u0012(\u0012&\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u001a0\u001a\u0018\u00010\u001b0\u00192\u0006\u0010\u0013\u001a\u00020\u000f2\u000e\u0010 \u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011H\u0096\u0001¢\u0006\u0004\b\u001e\u0010!J\u0090\u0001\u0010\"\u001a\n \u0012*\u0004\u0018\u00018\u00008\u0000\"\u0010\b\u0000\u0010\u0018*\n \u0012*\u0004\u0018\u00010\u00170\u00172d\u0010\u0010\u001a`\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u001a0\u001a \u0012*.\u0012(\u0012&\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u001a0\u001a\u0018\u00010\u001b0\u0019H\u0096\u0001¢\u0006\u0004\b\"\u0010#J¨\u0001\u0010\"\u001a\n \u0012*\u0004\u0018\u00018\u00008\u0000\"\u0010\b\u0000\u0010\u0018*\n \u0012*\u0004\u0018\u00010\u00170\u00172d\u0010\u0010\u001a`\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u001a0\u001a \u0012*.\u0012(\u0012&\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u001a0\u001a\u0018\u00010\u001b0\u00192\u0006\u0010\u0013\u001a\u00020\u000f2\u000e\u0010 \u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011H\u0096\u0001¢\u0006\u0004\b\"\u0010$J\u0010\u0010%\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b'\u0010&JH\u0010)\u001a\u0012\u0012\u0002\b\u0003 \u0012*\b\u0012\u0002\b\u0003\u0018\u00010(0(2\u000e\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00050\u00052\u0006\u0010\u0013\u001a\u00020\u000f2\u000e\u0010 \u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011H\u0096\u0001¢\u0006\u0004\b)\u0010*J\u008a\u0001\u0010)\u001a&\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000\u0018\u00010(0(\"\u0010\b\u0000\u0010+*\n \u0012*\u0004\u0018\u00010\u00170\u00172*\u0010\u0010\u001a&\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u001a0\u001a2\u0006\u0010\u0013\u001a\u00020\u000f2\u000e\u0010 \u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011H\u0096\u0001¢\u0006\u0004\b)\u0010,JP\u0010.\u001a\u0012\u0012\u0002\b\u0003 \u0012*\b\u0012\u0002\b\u0003\u0018\u00010(0(2\u000e\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00050\u00052\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u000e\u0010-\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011H\u0096\u0001¢\u0006\u0004\b.\u0010/JP\u00100\u001a\u0012\u0012\u0002\b\u0003 \u0012*\b\u0012\u0002\b\u0003\u0018\u00010(0(2\u000e\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00050\u00052\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u000e\u0010-\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011H\u0096\u0001¢\u0006\u0004\b0\u0010/J0\u00101\u001a\u0012\u0012\u0002\b\u0003 \u0012*\b\u0012\u0002\b\u0003\u0018\u00010\u001c0\u001c2\u000e\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00050\u0005H\u0096\u0001¢\u0006\u0004\b1\u00102Jf\u00101\u001a&\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u001c0\u001c\"\u0010\b\u0000\u0010\u0018*\n \u0012*\u0004\u0018\u00010\u00170\u00172\u000e\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00050\u00052\u000e\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00018\u00008\u0000H\u0096\u0001¢\u0006\u0004\b1\u00103Jr\u00101\u001a&\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u001c0\u001c\"\u0010\b\u0000\u0010\u0018*\n \u0012*\u0004\u0018\u00010\u00170\u00172*\u0010\u0010\u001a&\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u001a0\u001aH\u0096\u0001¢\u0006\u0004\b1\u00104R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006;"}, m87232d2 = {"Lcom/immomo/mmutil/task/SafeExecutor;", "Ljava/util/concurrent/ScheduledExecutorService;", "delegate", "<init>", "(Ljava/util/concurrent/ScheduledExecutorService;)V", "Ljava/lang/Runnable;", CommandMessage.COMMAND, "", "execute", "(Ljava/lang/Runnable;)V", "shutdown", "()V", "", "shutdownNow", "()Ljava/util/List;", "", "p0", "Ljava/util/concurrent/TimeUnit;", "kotlin.jvm.PlatformType", "p1", "", "awaitTermination", "(JLjava/util/concurrent/TimeUnit;)Z", "", j6f.GPS_DIRECTION_TRUE, "", "Ljava/util/concurrent/Callable;", "", "Ljava/util/concurrent/Future;", "", "invokeAll", "(Ljava/util/Collection;)Ljava/util/List;", "p2", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/util/List;", "invokeAny", "(Ljava/util/Collection;)Ljava/lang/Object;", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "isShutdown", "()Z", "isTerminated", "Ljava/util/concurrent/ScheduledFuture;", "schedule", "(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", j6f.GPS_MEASUREMENT_INTERRUPTED, "(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "p3", "scheduleAtFixedRate", "(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "scheduleWithFixedDelay", "submit", "(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;", "(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;", "a", "Ljava/util/concurrent/ScheduledExecutorService;", "getDelegate", "()Ljava/util/concurrent/ScheduledExecutorService;", "Companion", "b", "mm-util_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class SafeExecutor implements ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    private static final Lazy f12987b = LazyKt__LazyJVMKt.m87229b(new Function0<Field>() { // from class: com.immomo.mmutil.task.SafeExecutor$Companion$callableField$2
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Field invoke() {
            try {
                Field declaredField = FutureTask.class.getDeclaredField("callable");
                declaredField.getClass();
                declaredField.setAccessible(true);
                return declaredField;
            } catch (Exception unused) {
                return null;
            }
        }
    });

    /* JADX INFO: renamed from: c */
    private static final Lazy f12988c = LazyKt__LazyJVMKt.m87229b(new Function0<Class<Callable<Object>>>() { // from class: com.immomo.mmutil.task.SafeExecutor$Companion$runnableAdapterClass$2

        /* JADX INFO: renamed from: com.immomo.mmutil.task.SafeExecutor$Companion$runnableAdapterClass$2$a */
        @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m87232d2 = {"<anonymous>", "", "run"}, m87233k = 3, m87234mv = {1, 1, 16})
        public static final class RunnableC3799a implements Runnable {
            public static final RunnableC3799a INSTANCE = new RunnableC3799a();

            @Override // java.lang.Runnable
            public final void run() {
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Class<Callable<Object>> invoke() {
            return java.util.concurrent.Executors.callable(RunnableC3799a.INSTANCE).getClass();
        }
    });

    /* JADX INFO: renamed from: d */
    private static final Lazy f12989d = LazyKt__LazyJVMKt.m87229b(new Function0<Field>() { // from class: com.immomo.mmutil.task.SafeExecutor$Companion$taskField$2
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Field invoke() {
            try {
                Field declaredField = SafeExecutor.INSTANCE.m18438d().getDeclaredField("task");
                declaredField.getClass();
                declaredField.setAccessible(true);
                return declaredField;
            } catch (Exception unused) {
                return null;
            }
        }
    });

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ScheduledExecutorService delegate;

    /* JADX INFO: renamed from: com.immomo.mmutil.task.SafeExecutor$b */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"Lcom/immomo/mmutil/task/SafeExecutor$b;", "Ljava/lang/Runnable;", "delegate", "<init>", "(Ljava/lang/Runnable;)V", "", "run", "()V", "mm-util_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public static final class RunnableC3801b implements Runnable {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Runnable f12991a;

        public RunnableC3801b(@NotNull Runnable runnable) {
            runnable.getClass();
            this.f12991a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12991a.run();
        }
    }

    public SafeExecutor(@NotNull ScheduledExecutorService scheduledExecutorService) {
        scheduledExecutorService.getClass();
        this.delegate = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long p0, TimeUnit p1) {
        return this.delegate.awaitTermination(p0, p1);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        reg0.m179043a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@Nullable Runnable command) {
        ScheduledExecutorService scheduledExecutorService = this.delegate;
        if (command == null) {
            scheduledExecutorService.execute(command);
        } else {
            scheduledExecutorService.execute(new RunnableC3801b(command));
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> p0) {
        return this.delegate.invokeAll(p0);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> p0) {
        return (T) this.delegate.invokeAny(p0);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.delegate.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.delegate.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable p0, long p1, TimeUnit p2) {
        return this.delegate.schedule(p0, p1, p2);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable p0, long p1, long p2, TimeUnit p3) {
        return this.delegate.scheduleAtFixedRate(p0, p1, p2, p3);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable p0, long p1, long p2, TimeUnit p3) {
        return this.delegate.scheduleWithFixedDelay(p0, p1, p2, p3);
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
    public Future<?> submit(Runnable p0) {
        return this.delegate.submit(p0);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> p0, long p1, TimeUnit p2) {
        return this.delegate.invokeAll(p0, p1, p2);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> p0, long p1, TimeUnit p2) {
        return (T) this.delegate.invokeAny(p0, p1, p2);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> p0, long p1, TimeUnit p2) {
        return this.delegate.schedule(p0, p1, p2);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable p0, T p1) {
        return this.delegate.submit(p0, p1);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> p0) {
        return this.delegate.submit(p0);
    }

    /* JADX INFO: renamed from: com.immomo.mmutil.task.SafeExecutor$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\r¨\u0006\u0017"}, m87232d2 = {"Lcom/immomo/mmutil/task/SafeExecutor$a;", "", "<init>", "()V", "Ljava/lang/Runnable;", "runnable", "", "b", "(Ljava/lang/Runnable;)Z", "Ljava/lang/reflect/Field;", "callableField$delegate", "Lkotlin/Lazy;", "c", "()Ljava/lang/reflect/Field;", "callableField", "Ljava/lang/Class;", "runnableAdapterClass$delegate", Constants.INAPP_DATA_TAG, "()Ljava/lang/Class;", "runnableAdapterClass", "taskField$delegate", "e", "taskField", "mm-util_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: c */
        private final Field m18437c() {
            return (Field) SafeExecutor.f12987b.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public final Class<?> m18438d() {
            return (Class) SafeExecutor.f12988c.getValue();
        }

        /* JADX INFO: renamed from: e */
        private final Field m18439e() {
            return (Field) SafeExecutor.f12989d.getValue();
        }

        /* JADX INFO: renamed from: b */
        public final boolean m18440b(@NotNull Runnable runnable) {
            Object obj;
            Field fieldM18439e;
            Object obj2;
            runnable.getClass();
            if (!(runnable instanceof FutureTask)) {
                return false;
            }
            try {
                Field fieldM18437c = m18437c();
                if (fieldM18437c != null && (obj = fieldM18437c.get(runnable)) != null && m18438d().isInstance(obj) && (fieldM18439e = m18439e()) != null && (obj2 = fieldM18439e.get(obj)) != null) {
                    return obj2 instanceof RunnableC3801b;
                }
            } catch (Exception unused) {
            }
            return false;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
