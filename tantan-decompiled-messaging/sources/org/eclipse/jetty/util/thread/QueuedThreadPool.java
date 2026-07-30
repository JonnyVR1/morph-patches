package org.eclipse.jetty.util.thread;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.eclipse.jetty.util.BlockingArrayQueue;
import org.eclipse.jetty.util.component.AbstractLifeCycle;
import org.eclipse.jetty.util.component.AggregateLifeCycle;
import org.eclipse.jetty.util.component.Dumpable;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class QueuedThreadPool extends AbstractLifeCycle implements ThreadPool.SizedThreadPool, Executor, Dumpable {
    private static final Logger LOG = Log.getLogger((Class<?>) QueuedThreadPool.class);
    private boolean _daemon;
    private boolean _detailedDump;
    private BlockingQueue<Runnable> _jobs;
    private final Object _joinLock;
    private final AtomicLong _lastShrink;
    private int _maxIdleTimeMs;
    private int _maxQueued;
    private int _maxStopTime;
    private int _maxThreads;
    private int _minThreads;
    private String _name;
    private int _priority;
    private Runnable _runnable;
    private final ConcurrentLinkedQueue<Thread> _threads;
    private final AtomicInteger _threadsIdle;
    private final AtomicInteger _threadsStarted;

    public QueuedThreadPool() {
        this._threadsStarted = new AtomicInteger();
        this._threadsIdle = new AtomicInteger();
        this._lastShrink = new AtomicLong();
        this._threads = new ConcurrentLinkedQueue<>();
        this._joinLock = new Object();
        this._maxIdleTimeMs = HuiYanResultSender.TIMEOUT_MS;
        this._maxThreads = 254;
        this._minThreads = 8;
        this._maxQueued = -1;
        this._priority = 5;
        this._daemon = false;
        this._maxStopTime = 100;
        this._detailedDump = false;
        this._runnable = new Runnable() { // from class: org.eclipse.jetty.util.thread.QueuedThreadPool.3
            /* JADX WARN: Code duplicated, block: B:68:0x0118  */
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                boolean z;
                Throwable th;
                boolean z2;
                Exception e;
                InterruptedException e2;
                try {
                    try {
                        Runnable runnableIdleJobPoll = (Runnable) QueuedThreadPool.this._jobs.poll();
                        z2 = false;
                        loop0: while (true) {
                            try {
                                if (!QueuedThreadPool.this.isRunning()) {
                                    if (!z2) {
                                        break loop0;
                                    }
                                } else {
                                    while (runnableIdleJobPoll != null && QueuedThreadPool.this.isRunning()) {
                                        QueuedThreadPool.this.runJob(runnableIdleJobPoll);
                                        runnableIdleJobPoll = (Runnable) QueuedThreadPool.this._jobs.poll();
                                    }
                                    try {
                                        QueuedThreadPool.this._threadsIdle.incrementAndGet();
                                        while (QueuedThreadPool.this.isRunning() && runnableIdleJobPoll == null) {
                                            int i = QueuedThreadPool.this._maxIdleTimeMs;
                                            QueuedThreadPool queuedThreadPool = QueuedThreadPool.this;
                                            if (i <= 0) {
                                                runnableIdleJobPoll = (Runnable) queuedThreadPool._jobs.take();
                                            } else {
                                                int i2 = queuedThreadPool._threadsStarted.get();
                                                if (i2 > QueuedThreadPool.this._minThreads) {
                                                    long j = QueuedThreadPool.this._lastShrink.get();
                                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                                    if (j == 0 || jCurrentTimeMillis - j > QueuedThreadPool.this._maxIdleTimeMs) {
                                                        boolean z3 = QueuedThreadPool.this._lastShrink.compareAndSet(j, jCurrentTimeMillis) && QueuedThreadPool.this._threadsStarted.compareAndSet(i2, i2 + (-1));
                                                        if (z3) {
                                                            try {
                                                                QueuedThreadPool.this._threadsIdle.decrementAndGet();
                                                                if (!z3) {
                                                                    break loop0;
                                                                }
                                                            } catch (InterruptedException e3) {
                                                                e2 = e3;
                                                                z2 = z3;
                                                                QueuedThreadPool.LOG.ignore(e2);
                                                                if (!z2) {
                                                                    QueuedThreadPool.this._threadsStarted.decrementAndGet();
                                                                }
                                                                QueuedThreadPool.this._threads.remove(Thread.currentThread());
                                                                return;
                                                            } catch (Exception e4) {
                                                                e = e4;
                                                                z2 = z3;
                                                                QueuedThreadPool.LOG.warn(e);
                                                                if (!z2) {
                                                                    QueuedThreadPool.this._threadsStarted.decrementAndGet();
                                                                }
                                                                QueuedThreadPool.this._threads.remove(Thread.currentThread());
                                                                return;
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                z = z3;
                                                                if (!z) {
                                                                    QueuedThreadPool.this._threadsStarted.decrementAndGet();
                                                                }
                                                                QueuedThreadPool.this._threads.remove(Thread.currentThread());
                                                                throw th;
                                                            }
                                                        } else {
                                                            z2 = z3;
                                                        }
                                                    }
                                                }
                                                runnableIdleJobPoll = QueuedThreadPool.this.idleJobPoll();
                                            }
                                        }
                                        QueuedThreadPool.this._threadsIdle.decrementAndGet();
                                    } catch (Throwable th3) {
                                        QueuedThreadPool.this._threadsIdle.decrementAndGet();
                                        throw th3;
                                    }
                                }
                                QueuedThreadPool.this._threads.remove(Thread.currentThread());
                            } catch (InterruptedException e5) {
                                e2 = e5;
                            } catch (Exception e6) {
                                e = e6;
                            }
                        }
                        QueuedThreadPool.this._threadsStarted.decrementAndGet();
                        QueuedThreadPool.this._threads.remove(Thread.currentThread());
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (InterruptedException e7) {
                    z2 = false;
                    e2 = e7;
                } catch (Exception e8) {
                    z2 = false;
                    e = e8;
                } catch (Throwable th5) {
                    z = false;
                    th = th5;
                }
            }
        };
        this._name = "qtp" + super.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable idleJobPoll() throws InterruptedException {
        return this._jobs.poll(this._maxIdleTimeMs, TimeUnit.MILLISECONDS);
    }

    private boolean startThread(int i) {
        if (!this._threadsStarted.compareAndSet(i, i + 1)) {
            return false;
        }
        try {
            Thread threadNewThread = newThread(this._runnable);
            threadNewThread.setDaemon(this._daemon);
            threadNewThread.setPriority(this._priority);
            threadNewThread.setName(this._name + "-" + threadNewThread.getId());
            this._threads.add(threadNewThread);
            threadNewThread.start();
            return true;
        } catch (Throwable th) {
            this._threadsStarted.decrementAndGet();
            throw th;
        }
    }

    @Override // org.eclipse.jetty.util.thread.ThreadPool
    public boolean dispatch(Runnable runnable) {
        int i;
        if (isRunning()) {
            int size = this._jobs.size();
            int idleThreads = getIdleThreads();
            if (this._jobs.offer(runnable)) {
                if ((idleThreads != 0 && size <= idleThreads) || (i = this._threadsStarted.get()) >= this._maxThreads) {
                    return true;
                }
                startThread(i);
                return true;
            }
        }
        LOG.debug("Dispatched {} to stopped {}", runnable, this);
        return false;
    }

    @Override // org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        BlockingQueue<Runnable> blockingArrayQueue;
        super.doStart();
        this._threadsStarted.set(0);
        if (this._jobs == null) {
            if (this._maxQueued > 0) {
                blockingArrayQueue = new ArrayBlockingQueue<>(this._maxQueued);
            } else {
                int i = this._minThreads;
                blockingArrayQueue = new BlockingArrayQueue<>(i, i);
            }
            this._jobs = blockingArrayQueue;
        }
        int i2 = this._threadsStarted.get();
        while (isRunning() && i2 < this._minThreads) {
            startThread(i2);
            i2 = this._threadsStarted.get();
        }
    }

    @Override // org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        super.doStop();
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (this._threadsStarted.get() > 0 && System.currentTimeMillis() - jCurrentTimeMillis < this._maxStopTime / 2) {
            Thread.sleep(1L);
        }
        this._jobs.clear();
        Runnable runnable = new Runnable() { // from class: org.eclipse.jetty.util.thread.QueuedThreadPool.1
            @Override // java.lang.Runnable
            public void run() {
            }
        };
        int i = this._threadsIdle.get();
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            this._jobs.offer(runnable);
            i = i2;
        }
        Thread.yield();
        if (this._threadsStarted.get() > 0) {
            Iterator<Thread> it = this._threads.iterator();
            while (it.hasNext()) {
                it.next().interrupt();
            }
        }
        while (this._threadsStarted.get() > 0 && System.currentTimeMillis() - jCurrentTimeMillis < this._maxStopTime) {
            Thread.sleep(1L);
        }
        Thread.yield();
        int size = this._threads.size();
        if (size > 0) {
            Logger logger = LOG;
            logger.warn(size + " threads could not be stopped", new Object[0]);
            if (size == 1 || logger.isDebugEnabled()) {
                for (Thread thread : this._threads) {
                    LOG.info("Couldn't stop " + thread, new Object[0]);
                    for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
                        LOG.info(" at " + stackTraceElement, new Object[0]);
                    }
                }
            }
        }
        synchronized (this._joinLock) {
            this._joinLock.notifyAll();
        }
    }

    @Override // org.eclipse.jetty.util.component.Dumpable
    public void dump(Appendable appendable, String str) throws IOException {
        ArrayList arrayList = new ArrayList(getMaxThreads());
        Iterator<Thread> it = this._threads.iterator();
        while (true) {
            final boolean z = true;
            if (!it.hasNext()) {
                AggregateLifeCycle.dumpObject(appendable, this);
                AggregateLifeCycle.dump(appendable, str, arrayList);
                return;
            }
            final Thread next = it.next();
            final StackTraceElement[] stackTrace = next.getStackTrace();
            if (stackTrace == null) {
                z = false;
                break;
            }
            int length = stackTrace.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if ("idleJobPoll".equals(stackTrace[i].getMethodName())) {
                    break;
                } else {
                    i++;
                }
            }
            if (this._detailedDump) {
                arrayList.add(new Dumpable() { // from class: org.eclipse.jetty.util.thread.QueuedThreadPool.2
                    @Override // org.eclipse.jetty.util.component.Dumpable
                    public void dump(Appendable appendable2, String str2) throws IOException {
                        appendable2.append(String.valueOf(next.getId())).append(' ').append(next.getName()).append(' ').append(next.getState().toString()).append(z ? " IDLE" : "").append('\n');
                        if (z) {
                            return;
                        }
                        AggregateLifeCycle.dump(appendable2, str2, Arrays.asList(stackTrace));
                    }

                    @Override // org.eclipse.jetty.util.component.Dumpable
                    public String dump() {
                        return null;
                    }
                });
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(next.getId());
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb.append(next.getName());
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb.append(next.getState());
                sb.append(" @ ");
                sb.append(stackTrace.length > 0 ? stackTrace[0] : "???");
                sb.append(z ? " IDLE" : "");
                arrayList.add(sb.toString());
            }
        }
    }

    public String dumpThread(long j) {
        for (Thread thread : this._threads) {
            if (thread.getId() == j) {
                StringBuilder sb = new StringBuilder();
                sb.append(thread.getId());
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb.append(thread.getName());
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb.append(thread.getState());
                sb.append(":\n");
                StackTraceElement[] stackTrace = thread.getStackTrace();
                for (StackTraceElement stackTraceElement : stackTrace) {
                    sb.append("  at ");
                    sb.append(stackTraceElement.toString());
                    sb.append('\n');
                }
                return sb.toString();
            }
        }
        return null;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!dispatch(runnable)) {
            throw new RejectedExecutionException();
        }
    }

    @Override // org.eclipse.jetty.util.thread.ThreadPool
    public int getIdleThreads() {
        return this._threadsIdle.get();
    }

    public int getMaxIdleTimeMs() {
        return this._maxIdleTimeMs;
    }

    public int getMaxQueued() {
        return this._maxQueued;
    }

    public int getMaxStopTimeMs() {
        return this._maxStopTime;
    }

    @Override // org.eclipse.jetty.util.thread.ThreadPool.SizedThreadPool
    public int getMaxThreads() {
        return this._maxThreads;
    }

    @Override // org.eclipse.jetty.util.thread.ThreadPool.SizedThreadPool
    public int getMinThreads() {
        return this._minThreads;
    }

    public String getName() {
        return this._name;
    }

    public BlockingQueue<Runnable> getQueue() {
        return this._jobs;
    }

    @Override // org.eclipse.jetty.util.thread.ThreadPool
    public int getThreads() {
        return this._threadsStarted.get();
    }

    public int getThreadsPriority() {
        return this._priority;
    }

    public boolean interruptThread(long j) {
        for (Thread thread : this._threads) {
            if (thread.getId() == j) {
                thread.interrupt();
                return true;
            }
        }
        return false;
    }

    public boolean isDaemon() {
        return this._daemon;
    }

    public boolean isDetailedDump() {
        return this._detailedDump;
    }

    @Override // org.eclipse.jetty.util.thread.ThreadPool
    public boolean isLowOnThreads() {
        return this._threadsStarted.get() == this._maxThreads && this._jobs.size() >= this._threadsIdle.get();
    }

    @Override // org.eclipse.jetty.util.thread.ThreadPool
    public void join() throws InterruptedException {
        synchronized (this._joinLock) {
            while (isRunning()) {
                try {
                    this._joinLock.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        while (isStopping()) {
            Thread.sleep(1L);
        }
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable);
    }

    public void runJob(Runnable runnable) {
        runnable.run();
    }

    public void setDaemon(boolean z) {
        this._daemon = z;
    }

    public void setDetailedDump(boolean z) {
        this._detailedDump = z;
    }

    public void setMaxIdleTimeMs(int i) {
        this._maxIdleTimeMs = i;
    }

    public void setMaxQueued(int i) {
        if (isRunning()) {
            qkq0.m175383a("started");
        } else {
            this._maxQueued = i;
        }
    }

    public void setMaxStopTimeMs(int i) {
        this._maxStopTime = i;
    }

    @Override // org.eclipse.jetty.util.thread.ThreadPool.SizedThreadPool
    public void setMaxThreads(int i) {
        this._maxThreads = i;
        if (this._minThreads > i) {
            this._minThreads = i;
        }
    }

    @Override // org.eclipse.jetty.util.thread.ThreadPool.SizedThreadPool
    public void setMinThreads(int i) {
        this._minThreads = i;
        if (i > this._maxThreads) {
            this._maxThreads = i;
        }
        int i2 = this._threadsStarted.get();
        while (isStarted() && i2 < this._minThreads) {
            startThread(i2);
            i2 = this._threadsStarted.get();
        }
    }

    public void setName(String str) {
        if (isRunning()) {
            qkq0.m175383a("started");
        } else {
            this._name = str;
        }
    }

    public void setThreadsPriority(int i) {
        this._priority = i;
    }

    @Deprecated
    public boolean stopThread(long j) {
        for (Thread thread : this._threads) {
            if (thread.getId() == j) {
                thread.stop();
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this._name);
        sb.append("{");
        sb.append(getMinThreads());
        sb.append("<=");
        sb.append(getIdleThreads());
        sb.append("<=");
        sb.append(getThreads());
        sb.append("/");
        sb.append(getMaxThreads());
        sb.append(Constants.SEPARATOR_COMMA);
        BlockingQueue<Runnable> blockingQueue = this._jobs;
        sb.append(blockingQueue == null ? -1 : blockingQueue.size());
        sb.append("}");
        return sb.toString();
    }

    public QueuedThreadPool(int i) {
        this();
        setMaxThreads(i);
    }

    public QueuedThreadPool(BlockingQueue<Runnable> blockingQueue) {
        this();
        this._jobs = blockingQueue;
        blockingQueue.clear();
    }

    @Override // org.eclipse.jetty.util.component.Dumpable
    public String dump() {
        return AggregateLifeCycle.dump(this);
    }
}
