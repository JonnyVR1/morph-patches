package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CancellableSimpleLock extends DefaultSimpleLock {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Runnable f66835b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Function1<InterruptedException, Unit> f66836c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CancellableSimpleLock(@NotNull Lock lock, @NotNull Runnable runnable, @NotNull Function1<? super InterruptedException, Unit> function1) {
        super(lock);
        lock.getClass();
        runnable.getClass();
        function1.getClass();
        this.f66835b = runnable;
        this.f66836c = function1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.DefaultSimpleLock, kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
        while (!m93327a().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f66835b.run();
            } catch (InterruptedException e) {
                this.f66836c.invoke(e);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CancellableSimpleLock(@NotNull Runnable runnable, @NotNull Function1<? super InterruptedException, Unit> function1) {
        this(new ReentrantLock(), runnable, function1);
        runnable.getClass();
        function1.getClass();
    }
}
