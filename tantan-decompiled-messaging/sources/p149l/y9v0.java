package p149l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes6.dex */
public final class y9v0 implements fhv0 {

    /* JADX INFO: renamed from: b */
    public static final zfv0 f196992b = new zfv0(y9v0.class);

    /* JADX INFO: renamed from: a */
    public final Object f196993a;

    public y9v0(Object obj) {
        this.f196993a = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.f196993a;
    }

    @Override // p149l.fhv0
    /* JADX INFO: renamed from: h */
    public final void mo14894h(Runnable runnable, Executor executor) {
        m5s0.m153144c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f196992b.m218623a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + String.valueOf(executor), (Throwable) e);
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
        Object obj = this.f196993a;
        return super.toString() + "[status=SUCCESS, result=[" + obj.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f196993a;
    }
}
