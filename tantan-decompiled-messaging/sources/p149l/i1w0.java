package p149l;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class i1w0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f110506a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(NG) #" + this.f110506a.getAndIncrement());
    }
}
