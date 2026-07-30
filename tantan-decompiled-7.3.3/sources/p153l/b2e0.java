package p153l;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class b2e0<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* JADX INFO: renamed from: a */
    public final Handler f74605a;

    /* JADX INFO: renamed from: b */
    public final FutureTask<V> f74606b;

    public b2e0(Handler handler, Callable<V> callable) {
        this.f74605a = handler;
        this.f74606b = new FutureTask<>(callable);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f74606b.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        return this.f74606b.get();
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f74606b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f74606b.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f74606b.run();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f74606b.get(j, timeUnit);
    }

    public b2e0(Handler handler, Runnable runnable, V v2) {
        this.f74605a = handler;
        this.f74606b = new FutureTask<>(runnable, v2);
    }
}
