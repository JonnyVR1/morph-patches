package com.cosmos.photon.push.util;

import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.log.LogTag;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class ThreadUtils {
    private static final long DEFAULT_KEEP_ALIVE_TIME = 30;
    private static final int DEFAULT_KEEP_CORE_SIZE = 0;
    private static final int DEFAULT_KEEP_MAX_SIZE = 10;
    private static final TimeUnit DEFAULT_UNIT = TimeUnit.SECONDS;
    private static ScheduledThreadPoolExecutor rightNowPool;

    public static class PhotonThreadFactory implements ThreadFactory {
        private final AtomicInteger mCount = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            String str = "MMPush-" + this.mCount.getAndIncrement();
            MDLog.m7450i(LogTag.COMMON, "PhotonThreadFactory -> newThread : %s", str);
            return new Thread(runnable, str);
        }
    }

    public static synchronized void execute(final Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            initPool();
            if (AppContext.DEBUGGABLE) {
                rightNowPool.schedule(new Runnable() { // from class: com.cosmos.photon.push.util.ThreadUtils.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Thread threadCurrentThread = Thread.currentThread();
                        String currentProcessName = AppContext.getCurrentProcessName();
                        String name = threadCurrentThread.getName();
                        long id = threadCurrentThread.getId();
                        String name2 = runnable.getClass().getName();
                        MDLog.m7444d(LogTag.COMMON, "--> Thread start: [%s][%s][%s][%s]", name, Long.valueOf(id), currentProcessName, name2);
                        runnable.run();
                        MDLog.m7444d(LogTag.COMMON, "--> Thread end: [%s][%s][%s][%s]", name, Long.valueOf(id), currentProcessName, name2);
                    }
                }, j, timeUnit);
            } else {
                rightNowPool.schedule(runnable, j, timeUnit);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static synchronized void initPool() {
        if (rightNowPool == null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new PhotonThreadFactory(), new RejectedExecutionHandler() { // from class: com.cosmos.photon.push.util.ThreadUtils.2
                @Override // java.util.concurrent.RejectedExecutionHandler
                public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                    MDLog.m7445e(LogTag.COMMON, "PhotonThreadFactory -> rejectedExecution");
                }
            });
            rightNowPool = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.setMaximumPoolSize(10);
            rightNowPool.setKeepAliveTime(DEFAULT_KEEP_ALIVE_TIME, DEFAULT_UNIT);
        }
    }

    public static <V> Future<V> submit(Callable<V> callable) {
        initPool();
        return rightNowPool.submit(callable);
    }

    public static synchronized void execute(Runnable runnable) {
        execute(runnable, 0L, TimeUnit.NANOSECONDS);
    }
}
