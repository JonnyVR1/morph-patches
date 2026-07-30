package p153l;

import com.google.android.gms.internal.ads.RunnableFutureC2315y3;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes6.dex */
public abstract class luw0 extends AbstractExecutorService implements xvw0, AutoCloseable {
    @Override // p153l.xvw0
    /* JADX INFO: renamed from: R */
    public final hpr mo155969R(Callable callable) {
        return (hpr) super.submit(callable);
    }

    @Override // p153l.xvw0
    /* JADX INFO: renamed from: a */
    public final hpr mo155970a(Runnable runnable) {
        return (hpr) super.submit(runnable);
    }

    public /* synthetic */ void close() {
        zmg0.m220382a(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC2315y3(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (hpr) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return RunnableFutureC2315y3.m13540D(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (hpr) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (hpr) super.submit(callable);
    }
}
