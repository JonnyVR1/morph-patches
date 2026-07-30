package p149l;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class rur0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final ThreadFactory f161135a = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f161136b = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f161136b;
        Thread threadNewThread = this.f161135a.newThread(runnable);
        threadNewThread.setName("gads-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }
}
