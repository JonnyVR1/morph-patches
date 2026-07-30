package p149l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class j0v0 extends a4t0 implements Future {
    /* JADX INFO: renamed from: b */
    public abstract Future mo139204b();

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return mo139204b().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return mo139204b().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return mo139204b().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return mo139204b().get(j, timeUnit);
    }
}
