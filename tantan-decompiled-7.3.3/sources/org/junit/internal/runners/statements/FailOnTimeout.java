package org.junit.internal.runners.statements;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.runners.model.MultipleFailureException;
import org.junit.runners.model.Statement;
import org.junit.runners.model.TestTimedOutException;
import p153l.mnd0;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class FailOnTimeout extends Statement {
    private final boolean lookForStuckThread;
    private final Statement originalStatement;
    private volatile ThreadGroup threadGroup;
    private final TimeUnit timeUnit;
    private final long timeout;

    public static class Builder {
        private boolean lookForStuckThread;
        private long timeout;
        private TimeUnit unit;

        private Builder() {
            this.lookForStuckThread = false;
            this.timeout = 0L;
            this.unit = TimeUnit.SECONDS;
        }

        public FailOnTimeout build(Statement statement) {
            if (statement != null) {
                return new FailOnTimeout(this, statement);
            }
            mnd0.m159157a("statement cannot be null");
            return null;
        }

        public Builder withLookingForStuckThread(boolean z) {
            this.lookForStuckThread = z;
            return this;
        }

        public Builder withTimeout(long j, TimeUnit timeUnit) {
            if (j < 0) {
                wg3.m206174a("timeout must be non-negative");
                return null;
            }
            if (timeUnit == null) {
                mnd0.m159157a("TimeUnit cannot be null");
                return null;
            }
            this.timeout = j;
            this.unit = timeUnit;
            return this;
        }
    }

    public class CallableStatement implements Callable<Throwable> {
        private final CountDownLatch startLatch;

        private CallableStatement() {
            this.startLatch = new CountDownLatch(1);
        }

        public void awaitStarted() throws InterruptedException {
            this.startLatch.await();
        }

        @Override // java.util.concurrent.Callable
        public Throwable call() throws Exception {
            try {
                this.startLatch.countDown();
                FailOnTimeout.this.originalStatement.evaluate();
                return null;
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                return th;
            }
        }
    }

    private FailOnTimeout(Builder builder, Statement statement) {
        this.threadGroup = null;
        this.originalStatement = statement;
        this.timeout = builder.timeout;
        this.timeUnit = builder.unit;
        this.lookForStuckThread = builder.lookForStuckThread;
    }

    public static Builder builder() {
        return new Builder();
    }

    private Thread[] copyThreads(Thread[] threadArr, int i) {
        int iMin = Math.min(i, threadArr.length);
        Thread[] threadArr2 = new Thread[iMin];
        for (int i2 = 0; i2 < iMin; i2++) {
            threadArr2[i2] = threadArr[i2];
        }
        return threadArr2;
    }

    private long cpuTime(Thread thread) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        if (!threadMXBean.isThreadCpuTimeSupported()) {
            return 0L;
        }
        try {
            return threadMXBean.getThreadCpuTime(thread.getId());
        } catch (UnsupportedOperationException unused) {
            return 0L;
        }
    }

    private Exception createTimeoutException(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        Thread stuckThread = this.lookForStuckThread ? getStuckThread(thread) : null;
        TestTimedOutException testTimedOutException = new TestTimedOutException(this.timeout, this.timeUnit);
        if (stackTrace != null) {
            testTimedOutException.setStackTrace(stackTrace);
            thread.interrupt();
        }
        if (stuckThread == null) {
            return testTimedOutException;
        }
        Exception exc = new Exception("Appears to be stuck in thread " + stuckThread.getName());
        exc.setStackTrace(getStackTrace(stuckThread));
        return new MultipleFailureException(Arrays.asList(testTimedOutException, exc));
    }

    private Throwable getResult(FutureTask<Throwable> futureTask, Thread thread) {
        try {
            long j = this.timeout;
            return j > 0 ? futureTask.get(j, this.timeUnit) : futureTask.get();
        } catch (InterruptedException e) {
            return e;
        } catch (ExecutionException e2) {
            return e2.getCause();
        } catch (TimeoutException unused) {
            return createTimeoutException(thread);
        }
    }

    private StackTraceElement[] getStackTrace(Thread thread) {
        try {
            return thread.getStackTrace();
        } catch (SecurityException unused) {
            return new StackTraceElement[0];
        }
    }

    private Thread getStuckThread(Thread thread) {
        Thread[] threadArray;
        if (this.threadGroup == null || (threadArray = getThreadArray(this.threadGroup)) == null) {
            return null;
        }
        long j = 0;
        Thread thread2 = null;
        for (Thread thread3 : threadArray) {
            if (thread3.getState() == Thread.State.RUNNABLE) {
                long jCpuTime = cpuTime(thread3);
                if (thread2 == null || jCpuTime > j) {
                    thread2 = thread3;
                    j = jCpuTime;
                }
            }
        }
        if (thread2 == thread) {
            return null;
        }
        return thread2;
    }

    private Thread[] getThreadArray(ThreadGroup threadGroup) {
        int iMax = Math.max(threadGroup.activeCount() * 2, 100);
        int i = 0;
        do {
            Thread[] threadArr = new Thread[iMax];
            int iEnumerate = threadGroup.enumerate(threadArr);
            if (iEnumerate < iMax) {
                return copyThreads(threadArr, iEnumerate);
            }
            iMax += 100;
            i++;
        } while (i < 5);
        return null;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Throwable {
        CallableStatement callableStatement = new CallableStatement();
        FutureTask<Throwable> futureTask = new FutureTask<>(callableStatement);
        this.threadGroup = new ThreadGroup("FailOnTimeoutGroup");
        Thread thread = new Thread(this.threadGroup, futureTask, "Time-limited test");
        thread.setDaemon(true);
        thread.start();
        callableStatement.awaitStarted();
        Throwable result = getResult(futureTask, thread);
        if (result != null) {
            throw result;
        }
    }

    @Deprecated
    public FailOnTimeout(Statement statement, long j) {
        this(builder().withTimeout(j, TimeUnit.MILLISECONDS), statement);
    }
}
