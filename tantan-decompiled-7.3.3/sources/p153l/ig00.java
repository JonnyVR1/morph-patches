package p153l;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public class ig00 extends ThreadPoolExecutor implements AutoCloseable {

    /* JADX INFO: renamed from: b */
    private static final AtomicLong f114727b = new AtomicLong();

    /* JADX INFO: renamed from: a */
    private String f114728a;

    public ig00(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.f114728a = str;
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        zmg0.m220382a(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        super.execute(new av80(runnable, f114727b.getAndIncrement()));
    }
}
