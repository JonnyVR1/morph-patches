package p153l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ivw0 extends iqw0 implements Future {
    /* JADX INFO: renamed from: b */
    public abstract Future mo142363b();

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return mo142363b().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return mo142363b().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return mo142363b().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return mo142363b().get(j, timeUnit);
    }
}
