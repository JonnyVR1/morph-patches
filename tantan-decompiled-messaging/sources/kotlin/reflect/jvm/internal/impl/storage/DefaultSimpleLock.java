package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultSimpleLock implements SimpleLock {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lock f66163a;

    public /* synthetic */ DefaultSimpleLock(Lock lock, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ReentrantLock() : lock);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Lock m92436a() {
        return this.f66163a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
        this.f66163a.lock();
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void unlock() {
        this.f66163a.unlock();
    }

    public DefaultSimpleLock(@NotNull Lock lock) {
        lock.getClass();
        this.f66163a = lock;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultSimpleLock() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
