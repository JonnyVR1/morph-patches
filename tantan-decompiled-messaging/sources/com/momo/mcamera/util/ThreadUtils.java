package com.momo.mcamera.util;

import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p149l.qkq0;

/* JADX INFO: loaded from: classes7.dex */
public class ThreadUtils {

    /* JADX INFO: renamed from: com.momo.mcamera.util.ThreadUtils$1Result, reason: invalid class name */
    public class C1Result {
        public V value;
    }

    public interface BlockingOperation {
        void run() throws InterruptedException;
    }

    public static class ThreadChecker {
        private Thread thread = Thread.currentThread();

        public void checkIsOnValidThread() {
            if (this.thread == null) {
                this.thread = Thread.currentThread();
            }
            if (Thread.currentThread() == this.thread) {
                return;
            }
            qkq0.m175383a("Wrong thread");
        }

        public void detachThread() {
            this.thread = null;
        }
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zAwait = false;
        long jElapsedRealtime2 = j;
        boolean z = false;
        while (true) {
            try {
                zAwait = countDownLatch.await(jElapsedRealtime2, TimeUnit.MILLISECONDS);
                break;
            } catch (InterruptedException unused) {
                jElapsedRealtime2 = j - (SystemClock.elapsedRealtime() - jElapsedRealtime);
                if (jElapsedRealtime2 <= 0) {
                    z = true;
                    break;
                }
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return zAwait;
    }

    public static void executeUninterruptibly(BlockingOperation blockingOperation) {
        boolean z = false;
        while (true) {
            try {
                blockingOperation.run();
                break;
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static <V> V invokeUninterruptibly(Handler handler, final Callable<V> callable) {
        final C1Result c1Result = new C1Result();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new Runnable() { // from class: com.momo.mcamera.util.ThreadUtils.3
            /* JADX WARN: Type inference failed for: r1v3, types: [V, java.lang.Object] */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    c1Result.value = callable.call();
                    countDownLatch.countDown();
                } catch (Exception e) {
                    RuntimeException runtimeException = new RuntimeException("Callable threw exception: " + e);
                    runtimeException.setStackTrace(e.getStackTrace());
                    throw runtimeException;
                }
            }
        });
        awaitUninterruptibly(countDownLatch);
        return c1Result.value;
    }

    public static boolean joinUninterruptibly(Thread thread, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long jElapsedRealtime2 = j;
        while (jElapsedRealtime2 > 0) {
            try {
                thread.join(jElapsedRealtime2);
                break;
            } catch (InterruptedException unused) {
                jElapsedRealtime2 = j - (SystemClock.elapsedRealtime() - jElapsedRealtime);
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return !thread.isAlive();
    }

    public static void invokeUninterruptibly(Handler handler, final Runnable runnable) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new Runnable() { // from class: com.momo.mcamera.util.ThreadUtils.4
            @Override // java.lang.Runnable
            public void run() {
                runnable.run();
                countDownLatch.countDown();
            }
        });
        awaitUninterruptibly(countDownLatch);
    }

    public static void awaitUninterruptibly(final CountDownLatch countDownLatch) {
        executeUninterruptibly(new BlockingOperation() { // from class: com.momo.mcamera.util.ThreadUtils.2
            @Override // com.momo.mcamera.util.ThreadUtils.BlockingOperation
            public void run() throws InterruptedException {
                countDownLatch.await();
            }
        });
    }

    public static void joinUninterruptibly(final Thread thread) {
        executeUninterruptibly(new BlockingOperation() { // from class: com.momo.mcamera.util.ThreadUtils.1
            @Override // com.momo.mcamera.util.ThreadUtils.BlockingOperation
            public void run() throws InterruptedException {
                thread.join();
            }
        });
    }
}
