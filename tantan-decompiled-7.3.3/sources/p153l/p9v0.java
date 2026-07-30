package p153l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class p9v0 extends gdt0 implements Future {
    /* JADX INFO: renamed from: b */
    public abstract Future mo171392b();

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return mo171392b().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return mo171392b().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return mo171392b().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return mo171392b().get(j, timeUnit);
    }
}
