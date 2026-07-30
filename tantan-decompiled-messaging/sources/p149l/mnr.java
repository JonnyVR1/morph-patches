package p149l;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes7.dex */
public class mnr<V> extends FutureTask<V> implements gnr<V> {

    /* JADX INFO: renamed from: a */
    public final q5f f134785a;

    public mnr(Callable<V> callable) {
        super(callable);
        this.f134785a = new q5f();
    }

    /* JADX INFO: renamed from: a */
    public static <V> mnr<V> m155556a(Callable<V> callable) {
        return new mnr<>(callable);
    }

    @Override // p149l.gnr
    public void addListener(Runnable runnable, Executor executor) {
        this.f134785a.m173004a(runnable, executor);
    }

    @Override // java.util.concurrent.FutureTask
    public void done() {
        this.f134785a.m173005b();
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        return nanos <= 2147483647999999999L ? (V) super.get(j, timeUnit) : (V) super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }
}
