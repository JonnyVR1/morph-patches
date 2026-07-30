package p153l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes6.dex */
public final class ejv0 implements lqv0 {

    /* JADX INFO: renamed from: b */
    public static final fpv0 f94322b = new fpv0(ejv0.class);

    /* JADX INFO: renamed from: a */
    public final Object f94323a;

    public ejv0(Object obj) {
        this.f94323a = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.f94323a;
    }

    @Override // p153l.lqv0
    /* JADX INFO: renamed from: h */
    public final void mo14948h(Runnable runnable, Executor executor) {
        ses0.m185568c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f94322b.m126720a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + String.valueOf(executor), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.f94323a;
        return super.toString() + "[status=SUCCESS, result=[" + obj.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f94323a;
    }
}
