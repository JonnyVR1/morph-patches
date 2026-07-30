package p153l;

import androidx.annotation.VisibleForTesting;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final class mbw0 implements hpr {

    /* JADX INFO: renamed from: a */
    public final Object f135770a;

    /* JADX INFO: renamed from: b */
    public final String f135771b;

    /* JADX INFO: renamed from: c */
    public final hpr f135772c;

    @VisibleForTesting(otherwise = 3)
    public mbw0(Object obj, String str, hpr hprVar) {
        this.f135770a = obj;
        this.f135771b = str;
        this.f135772c = hprVar;
    }

    /* JADX INFO: renamed from: a */
    public final Object m157898a() {
        return this.f135770a;
    }

    @Override // p153l.hpr
    public final void addListener(Runnable runnable, Executor executor) {
        this.f135772c.addListener(runnable, executor);
    }

    /* JADX INFO: renamed from: b */
    public final String m157899b() {
        return this.f135771b;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f135772c.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.f135772c.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f135772c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f135772c.isDone();
    }

    public final String toString() {
        return this.f135771b + "@" + System.identityHashCode(this);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f135772c.get(j, timeUnit);
    }
}
