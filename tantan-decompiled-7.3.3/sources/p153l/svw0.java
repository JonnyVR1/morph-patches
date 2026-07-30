package p153l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes6.dex */
public final class svw0 implements hpr {

    /* JADX INFO: renamed from: b */
    public static final hpr f170875b = new svw0(null);

    /* JADX INFO: renamed from: c */
    public static final wvw0 f170876c = new wvw0(svw0.class);

    /* JADX INFO: renamed from: a */
    public final Object f170877a;

    public svw0(Object obj) {
        this.f170877a = obj;
    }

    @Override // p153l.hpr
    public final void addListener(Runnable runnable, Executor executor) {
        tow0.m192088c(runnable, "Runnable was null.");
        tow0.m192088c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f170876c.m208109a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.f170877a;
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
        Object obj = this.f170877a;
        return super.toString() + "[status=SUCCESS, result=[" + String.valueOf(obj) + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f170877a;
    }
}
