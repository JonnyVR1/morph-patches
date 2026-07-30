package p149l;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class bx00 extends ScheduledThreadPoolExecutor implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    private String f77724a;

    public bx00(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, threadFactory, rejectedExecutionHandler);
        setMaximumPoolSize(i2);
        setKeepAliveTime(j, timeUnit);
        this.f77724a = str;
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        reg0.m179043a(this);
    }
}
