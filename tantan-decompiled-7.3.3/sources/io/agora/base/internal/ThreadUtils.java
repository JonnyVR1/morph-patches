package io.agora.base.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p153l.iig0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
public class ThreadUtils {

    /* JADX INFO: renamed from: io.agora.base.internal.ThreadUtils$1CaughtException, reason: invalid class name */
    public class C1CaughtException {

        /* JADX INFO: renamed from: e */
        Exception f64010e;
    }

    /* JADX INFO: renamed from: io.agora.base.internal.ThreadUtils$1Result, reason: invalid class name */
    public class C1Result {
        public V value;
    }

    public interface BlockingOperation {
        void run() throws InterruptedException;
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

    public static void checkIsOnMainThread() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return;
        }
        wtq0.m207906a("Not on main thread!");
    }

    public static StackTraceElement[] concatStackTraces(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[stackTraceElementArr.length + stackTraceElementArr2.length];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, 0, stackTraceElementArr.length);
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, stackTraceElementArr.length, stackTraceElementArr2.length);
        return stackTraceElementArr3;
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

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, long j, final Callable<V> callable) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Exception e) {
                iig0.m140070a(e);
                return null;
            }
        }
        final C1Result c1Result = new C1Result();
        final C1CaughtException c1CaughtException = new C1CaughtException();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (!handler.post(new Runnable() { // from class: io.agora.base.internal.ThreadUtils.3
            /* JADX WARN: Type inference failed for: r1v2, types: [V, java.lang.Object] */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    c1Result.value = callable.call();
                } catch (Exception e2) {
                    c1CaughtException.f64010e = e2;
                }
                countDownLatch.countDown();
            }
        })) {
            c1CaughtException.f64010e = new Exception("handler post fail at invokeAtFrontUninterruptibly !");
        } else if (j <= 0) {
            awaitUninterruptibly(countDownLatch);
        } else {
            awaitUninterruptibly(countDownLatch, j);
        }
        Exception exc = c1CaughtException.f64010e;
        if (exc == null) {
            return c1Result.value;
        }
        RuntimeException runtimeException = new RuntimeException(exc);
        runtimeException.setStackTrace(concatStackTraces(c1CaughtException.f64010e.getStackTrace(), runtimeException.getStackTrace()));
        throw runtimeException;
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

    public static class ThreadChecker {

        @Nullable
        private Thread thread;

        public ThreadChecker() {
            this.thread = Thread.currentThread();
        }

        public void checkIsOnValidThread() {
            if (this.thread == null) {
                this.thread = Thread.currentThread();
            }
            if (Thread.currentThread() == this.thread) {
                return;
            }
            wtq0.m207906a("Wrong thread");
        }

        public void detachThread() {
            this.thread = null;
        }

        public ThreadChecker(@Nullable Thread thread) {
            Thread.currentThread();
            this.thread = thread;
        }
    }

    public static class ConditionVariable {
        private final Object lock;
        private volatile boolean mCondition;

        public ConditionVariable() {
            this.lock = new Object();
            this.mCondition = false;
        }

        public boolean block(long j) {
            boolean z;
            if (j == 0) {
                block();
                return true;
            }
            synchronized (this.lock) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = j + jElapsedRealtime;
                while (!this.mCondition && jElapsedRealtime < j2) {
                    try {
                        wait(j2 - jElapsedRealtime);
                    } catch (InterruptedException unused) {
                    }
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                }
                z = this.mCondition;
            }
            return z;
        }

        public void close() {
            synchronized (this.lock) {
                this.mCondition = false;
            }
        }

        public void open() {
            synchronized (this.lock) {
                try {
                    boolean z = this.mCondition;
                    this.mCondition = true;
                    if (!z) {
                        this.lock.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean opened() {
            return this.mCondition;
        }

        public ConditionVariable(boolean z) {
            this.lock = new Object();
            this.mCondition = z;
        }

        public void block() {
            synchronized (this.lock) {
                while (!this.mCondition) {
                    try {
                        this.lock.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    public static void awaitUninterruptibly(final CountDownLatch countDownLatch) {
        executeUninterruptibly(new BlockingOperation() { // from class: io.agora.base.internal.ThreadUtils.2
            @Override // io.agora.base.internal.ThreadUtils.BlockingOperation
            public void run() throws InterruptedException {
                countDownLatch.await();
            }
        });
    }

    public static void joinUninterruptibly(final Thread thread) {
        executeUninterruptibly(new BlockingOperation() { // from class: io.agora.base.internal.ThreadUtils.1
            @Override // io.agora.base.internal.ThreadUtils.BlockingOperation
            public void run() throws InterruptedException {
                thread.join();
            }
        });
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, Callable<V> callable) {
        return (V) invokeAtFrontUninterruptibly(handler, 0L, callable);
    }

    public static void invokeAtFrontUninterruptibly(Handler handler, final Runnable runnable) {
        invokeAtFrontUninterruptibly(handler, new Callable<Void>() { // from class: io.agora.base.internal.ThreadUtils.4
            @Override // java.util.concurrent.Callable
            public Void call() {
                runnable.run();
                return null;
            }
        });
    }
}
