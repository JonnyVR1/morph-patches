package p153l;

import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class r9t0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f161869a = new AtomicInteger(1);

    public r9t0(s9t0 s9t0Var) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@NonNull Runnable runnable) {
        return new Thread(runnable, "AdWorker(SCION_TASK_EXECUTOR) #" + this.f161869a.getAndIncrement());
    }
}
