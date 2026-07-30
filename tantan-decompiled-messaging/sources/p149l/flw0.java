package p149l;

import com.google.android.gms.internal.ads.RunnableFutureC2292y3;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes6.dex */
public abstract class flw0 extends AbstractExecutorService implements rmw0, AutoCloseable {
    @Override // p149l.rmw0
    /* JADX INFO: renamed from: R */
    public final gnr mo122102R(Callable callable) {
        return (gnr) super.submit(callable);
    }

    @Override // p149l.rmw0
    /* JADX INFO: renamed from: a */
    public final gnr mo122103a(Runnable runnable) {
        return (gnr) super.submit(runnable);
    }

    @Override // p149l.rmw0, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        reg0.m179043a(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC2292y3(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (gnr) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return RunnableFutureC2292y3.m13486D(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (gnr) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (gnr) super.submit(callable);
    }
}
