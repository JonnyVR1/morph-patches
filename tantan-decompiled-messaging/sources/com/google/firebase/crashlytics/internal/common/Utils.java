package com.google.firebase.crashlytics.internal.common;

import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.Utils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p149l.n16;
import p149l.phg0;

/* JADX INFO: loaded from: classes7.dex */
public final class Utils {
    private static final int BACKGROUND_TIMEOUT_MILLIS = 4000;
    private static final int MAIN_TIMEOUT_MILLIS = 3000;
    private static final ExecutorService TASK_CONTINUATION_EXECUTOR_SERVICE = ExecutorUtils.buildSingleThreadExecutorService("awaitEvenIfOnMainThread task continuation executor");

    private Utils() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m16750a(CountDownLatch countDownLatch, Task task) {
        countDownLatch.countDown();
        return null;
    }

    @Deprecated
    public static <T> T awaitEvenIfOnMainThread(Task<T> task) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.mo15368g(TASK_CONTINUATION_EXECUTOR_SERVICE, new n16() { // from class: l.qdk0
            @Override // p149l.n16
            public final Object then(Task task2) {
                return Utils.m16750a(countDownLatch, task2);
            }
        });
        Looper mainLooper = Looper.getMainLooper();
        Looper looperMyLooper = Looper.myLooper();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (mainLooper == looperMyLooper) {
            countDownLatch.await(3000L, timeUnit);
        } else {
            countDownLatch.await(4000L, timeUnit);
        }
        if (task.mo15377p()) {
            return task.mo15373l();
        }
        if (task.mo15375n()) {
            throw new CancellationException("Task is already canceled");
        }
        if (!task.mo15376o()) {
            throw new TimeoutException();
        }
        phg0.m168968a(task.mo15372k());
        return null;
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j, TimeUnit timeUnit) {
        boolean zAwait;
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwait = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return zAwait;
        } catch (Throwable th) {
            if (z) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }
}
