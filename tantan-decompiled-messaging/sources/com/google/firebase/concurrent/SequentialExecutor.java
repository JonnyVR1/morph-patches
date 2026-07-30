package com.google.firebase.concurrent;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
final class SequentialExecutor implements Executor {
    private static final Logger log = Logger.getLogger(SequentialExecutor.class.getName());
    private final Executor executor;

    @GuardedBy("queue")
    private final Deque<Runnable> queue = new ArrayDeque();

    @GuardedBy("queue")
    private WorkerRunningState workerRunningState = WorkerRunningState.IDLE;

    @GuardedBy("queue")
    private long workerRunCount = 0;
    private final QueueWorker worker = new QueueWorker();

    public final class QueueWorker implements Runnable {
        Runnable task;

        private QueueWorker() {
        }

        /* JADX WARN: Code duplicated, block: B:46:0x003d A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        
            r8.task.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        
            com.google.firebase.concurrent.SequentialExecutor.log.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.task, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        
            r8.task = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void workOnQueue() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                com.google.firebase.concurrent.SequentialExecutor r2 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L58
                java.util.Deque r2 = com.google.firebase.concurrent.SequentialExecutor.access$100(r2)     // Catch: java.lang.Throwable -> L58
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
                if (r0 != 0) goto L2d
                com.google.firebase.concurrent.SequentialExecutor r0 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L20
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r0 = com.google.firebase.concurrent.SequentialExecutor.access$200(r0)     // Catch: java.lang.Throwable -> L20
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
            L18:
                java.lang.Thread r8 = java.lang.Thread.currentThread()
                r8.interrupt()
                goto L48
            L20:
                r8 = move-exception
                goto L7d
            L22:
                com.google.firebase.concurrent.SequentialExecutor r0 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L20
                com.google.firebase.concurrent.SequentialExecutor.access$308(r0)     // Catch: java.lang.Throwable -> L20
                com.google.firebase.concurrent.SequentialExecutor r0 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L20
                com.google.firebase.concurrent.SequentialExecutor.access$202(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                com.google.firebase.concurrent.SequentialExecutor r3 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = com.google.firebase.concurrent.SequentialExecutor.access$100(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.task = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L49
                com.google.firebase.concurrent.SequentialExecutor r8 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L20
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r0 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L20
                com.google.firebase.concurrent.SequentialExecutor.access$202(r8, r0)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
                goto L18
            L48:
                return
            L49:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.task     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
                r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            L55:
                r8.task = r2     // Catch: java.lang.Throwable -> L58
                goto L2
            L58:
                r8 = move-exception
                goto L7f
            L5a:
                r0 = move-exception
                goto L7a
            L5c:
                r3 = move-exception
                java.util.logging.Logger r4 = com.google.firebase.concurrent.SequentialExecutor.access$400()     // Catch: java.lang.Throwable -> L5a
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
                r6.<init>()     // Catch: java.lang.Throwable -> L5a
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.Runnable r7 = r8.task     // Catch: java.lang.Throwable -> L5a
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
                goto L55
            L7a:
                r8.task = r2     // Catch: java.lang.Throwable -> L58
                throw r0     // Catch: java.lang.Throwable -> L58
            L7d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r8     // Catch: java.lang.Throwable -> L58
            L7f:
                if (r1 == 0) goto L88
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L88:
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.SequentialExecutor.QueueWorker.workOnQueue():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                workOnQueue();
            } catch (Error e) {
                synchronized (SequentialExecutor.this.queue) {
                    SequentialExecutor.this.workerRunningState = WorkerRunningState.IDLE;
                    throw e;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.task;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + SequentialExecutor.this.workerRunningState + "}";
        }
    }

    public enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public SequentialExecutor(Executor executor) {
        this.executor = (Executor) Preconditions.checkNotNull(executor);
    }

    public static /* synthetic */ long access$308(SequentialExecutor sequentialExecutor) {
        long j = sequentialExecutor.workerRunCount;
        sequentialExecutor.workerRunCount = 1 + j;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        WorkerRunningState workerRunningState;
        boolean z;
        Preconditions.checkNotNull(runnable);
        synchronized (this.queue) {
            WorkerRunningState workerRunningState2 = this.workerRunningState;
            if (workerRunningState2 != WorkerRunningState.RUNNING && workerRunningState2 != (workerRunningState = WorkerRunningState.QUEUED)) {
                long j = this.workerRunCount;
                Runnable runnable2 = new Runnable() { // from class: com.google.firebase.concurrent.SequentialExecutor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        runnable.run();
                    }

                    public String toString() {
                        return runnable.toString();
                    }
                };
                this.queue.add(runnable2);
                WorkerRunningState workerRunningState3 = WorkerRunningState.QUEUING;
                this.workerRunningState = workerRunningState3;
                try {
                    this.executor.execute(this.worker);
                    if (this.workerRunningState != workerRunningState3) {
                        return;
                    }
                    synchronized (this.queue) {
                        try {
                            if (this.workerRunCount == j && this.workerRunningState == workerRunningState3) {
                                this.workerRunningState = workerRunningState;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.queue) {
                        try {
                            WorkerRunningState workerRunningState4 = this.workerRunningState;
                            if (workerRunningState4 != WorkerRunningState.IDLE && workerRunningState4 != WorkerRunningState.QUEUING) {
                                z = false;
                            } else if (this.queue.removeLastOccurrence(runnable2)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.queue.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.executor + "}";
    }
}
