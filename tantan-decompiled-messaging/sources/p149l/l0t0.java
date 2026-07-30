package p149l;

import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class l0t0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f125573a = new AtomicInteger(1);

    public l0t0(m0t0 m0t0Var) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@NonNull Runnable runnable) {
        return new Thread(runnable, "AdWorker(SCION_TASK_EXECUTOR) #" + this.f125573a.getAndIncrement());
    }
}
