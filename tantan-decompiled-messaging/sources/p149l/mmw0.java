package p149l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes6.dex */
public final class mmw0 implements gnr {

    /* JADX INFO: renamed from: b */
    public static final gnr f134708b = new mmw0(null);

    /* JADX INFO: renamed from: c */
    public static final qmw0 f134709c = new qmw0(mmw0.class);

    /* JADX INFO: renamed from: a */
    public final Object f134710a;

    public mmw0(Object obj) {
        this.f134710a = obj;
    }

    @Override // p149l.gnr
    public final void addListener(Runnable runnable, Executor executor) {
        nfw0.m159281c(runnable, "Runnable was null.");
        nfw0.m159281c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f134709c.m175582a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.f134710a;
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
        Object obj = this.f134710a;
        return super.toString() + "[status=SUCCESS, result=[" + String.valueOf(obj) + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f134710a;
    }
}
