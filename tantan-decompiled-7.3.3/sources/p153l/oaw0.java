package p153l;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class oaw0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f145763a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(NG) #" + this.f145763a.getAndIncrement());
    }
}
