package p153l;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes7.dex */
public class npr<V> extends FutureTask<V> implements hpr<V> {

    /* JADX INFO: renamed from: a */
    public final u6f f143123a;

    public npr(Callable<V> callable) {
        super(callable);
        this.f143123a = new u6f();
    }

    /* JADX INFO: renamed from: a */
    public static <V> npr<V> m164245a(Callable<V> callable) {
        return new npr<>(callable);
    }

    @Override // p153l.hpr
    public void addListener(Runnable runnable, Executor executor) {
        this.f143123a.m194683a(runnable, executor);
    }

    @Override // java.util.concurrent.FutureTask
    public void done() {
        this.f143123a.m194684b();
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        return nanos <= 2147483647999999999L ? (V) super.get(j, timeUnit) : (V) super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }
}
