package com.google.common.util.concurrent;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p149l.s5f;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public final class ExecutionSequencer {

    /* JADX INFO: renamed from: a */
    public C3073a f11368a;

    public enum RunningState {
        NOT_RUN,
        CANCELLED,
        STARTED
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ExecutionSequencer$a */
    public static final class C3073a {

        /* JADX INFO: renamed from: a */
        public Thread f11369a;

        /* JADX INFO: renamed from: b */
        public Runnable f11370b;

        /* JADX INFO: renamed from: c */
        public Executor f11371c;

        public C3073a() {
        }

        public /* synthetic */ C3073a(s5f s5fVar) {
            this();
        }
    }

    public static final class TaskNonReentrantExecutor extends AtomicReference<RunningState> implements Executor, Runnable {
        Executor delegate;
        ExecutionSequencer sequencer;
        Thread submitting;
        Runnable task;

        private TaskNonReentrantExecutor(Executor executor, ExecutionSequencer executionSequencer) {
            super(RunningState.NOT_RUN);
            this.delegate = executor;
            this.sequencer = executionSequencer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean trySetCancelled() {
            return compareAndSet(RunningState.NOT_RUN, RunningState.CANCELLED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean trySetStarted() {
            return compareAndSet(RunningState.NOT_RUN, RunningState.STARTED);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (get() == RunningState.CANCELLED) {
                this.delegate = null;
                this.sequencer = null;
                return;
            }
            this.submitting = Thread.currentThread();
            try {
                ExecutionSequencer executionSequencer = this.sequencer;
                Objects.requireNonNull(executionSequencer);
                C3073a c3073a = executionSequencer.f11368a;
                if (c3073a.f11369a == this.submitting) {
                    this.sequencer = null;
                    sf80.m183900v(c3073a.f11370b == null);
                    c3073a.f11370b = runnable;
                    Executor executor = this.delegate;
                    Objects.requireNonNull(executor);
                    c3073a.f11371c = executor;
                    this.delegate = null;
                } else {
                    Executor executor2 = this.delegate;
                    Objects.requireNonNull(executor2);
                    this.delegate = null;
                    this.task = runnable;
                    executor2.execute(this);
                }
            } finally {
                this.submitting = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executor;
            Thread threadCurrentThread = Thread.currentThread();
            s5f s5fVar = null;
            if (threadCurrentThread != this.submitting) {
                Runnable runnable = this.task;
                Objects.requireNonNull(runnable);
                this.task = null;
                runnable.run();
                return;
            }
            C3073a c3073a = new C3073a(s5fVar);
            c3073a.f11369a = threadCurrentThread;
            ExecutionSequencer executionSequencer = this.sequencer;
            Objects.requireNonNull(executionSequencer);
            executionSequencer.f11368a = c3073a;
            this.sequencer = null;
            try {
                Runnable runnable2 = this.task;
                Objects.requireNonNull(runnable2);
                this.task = null;
                runnable2.run();
                while (true) {
                    Runnable runnable3 = c3073a.f11370b;
                    if (runnable3 == null || (executor = c3073a.f11371c) == null) {
                        break;
                    }
                    c3073a.f11370b = null;
                    c3073a.f11371c = null;
                    executor.execute(runnable3);
                }
                c3073a.f11369a = null;
            } catch (Throwable th) {
                c3073a.f11369a = null;
                throw th;
            }
        }

        public /* synthetic */ TaskNonReentrantExecutor(Executor executor, ExecutionSequencer executionSequencer, s5f s5fVar) {
            this(executor, executionSequencer);
        }
    }
}
