package com.tantanapp.media.ttmediautils.task;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p149l.reg0;

/* JADX INFO: loaded from: classes13.dex */
public class MonitorThreadPoolExecutor extends ThreadPoolExecutor implements AutoCloseable {
    private static final int DEFAULT_CORE_THREAD_COUNT = 1;
    private static final int DEFAULT_MAX_THREAD_COUNT = 2;
    private static final int MAX_CORE_THREAD_COUNT = 3;
    private static final int MAX_MAX_THREAD_COUNT = 5;
    public static final String TAG = "MonitorThreadPoolExecutor";
    private static final boolean isDebug = true;
    private static ThreadLocal<String> sThreadPoolName = new ThreadLocal<>();
    private String mName;
    private BlockingQueue mWorkQueue;

    public MonitorThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, String str) {
        super(i > 3 ? 1 : i, i2 > 5 ? 2 : i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.mWorkQueue = blockingQueue;
        this.mName = str;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        Thread.currentThread().setName(sThreadPoolName.get());
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        sThreadPoolName.set(thread.getName());
        if (runnable instanceof INamedRunnable) {
            thread.setName(((INamedRunnable) runnable).getName());
        }
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        reg0.m179043a(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        super.execute(runnable);
    }
}
