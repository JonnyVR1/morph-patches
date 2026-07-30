package p153l;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class x3s0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final ThreadFactory f192293a = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f192294b = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f192294b;
        Thread threadNewThread = this.f192293a.newThread(runnable);
        threadNewThread.setName("gads-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }
}
