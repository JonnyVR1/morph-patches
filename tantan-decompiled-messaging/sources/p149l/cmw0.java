package p149l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class cmw0 extends chw0 implements Future {
    /* JADX INFO: renamed from: b */
    public abstract Future mo107700b();

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return mo107700b().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return mo107700b().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return mo107700b().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return mo107700b().get(j, timeUnit);
    }
}
