package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p149l.g21;
import p149l.gnr;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public final class CombinedFuture<V> extends AggregateFuture<Object, V> {

    public final class CallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<V> {
        private final Callable<V> callable;
        final /* synthetic */ CombinedFuture this$0;

        public CallableInterruptibleTask(CombinedFuture combinedFuture, Callable<V> callable, Executor executor) {
            super(combinedFuture, executor);
            this.callable = (Callable) sf80.m183894p(callable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public V runInterruptibly() throws Exception {
            return this.callable.call();
        }

        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        public void setValue(V v2) {
            throw null;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public String toPendingString() {
            return this.callable.toString();
        }
    }

    public abstract class CombinedFutureInterruptibleTask<T> extends InterruptibleTask<T> {
        private final Executor listenerExecutor;
        final /* synthetic */ CombinedFuture this$0;

        public CombinedFutureInterruptibleTask(CombinedFuture combinedFuture, Executor executor) {
            this.listenerExecutor = (Executor) sf80.m183894p(executor);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void afterRanInterruptiblyFailure(Throwable th) {
            CombinedFuture.m16637H(null, null);
            if (th instanceof ExecutionException) {
                ((ExecutionException) th).getCause();
                throw null;
            }
            if (!(th instanceof CancellationException)) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void afterRanInterruptiblySuccess(T t) {
            CombinedFuture.m16637H(null, null);
            setValue(t);
        }

        public final void execute() {
            try {
                this.listenerExecutor.execute(this);
            } catch (RejectedExecutionException unused) {
                throw null;
            }
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean isDone() {
            throw null;
        }

        public abstract void setValue(T t);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ CombinedFutureInterruptibleTask m16637H(CombinedFuture combinedFuture, CombinedFutureInterruptibleTask combinedFutureInterruptibleTask) {
        throw null;
    }

    public final class AsyncCallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<gnr<V>> {
        private final g21<V> callable;
        final /* synthetic */ CombinedFuture this$0;

        public AsyncCallableInterruptibleTask(CombinedFuture combinedFuture, g21<V> g21Var, Executor executor) {
            super(combinedFuture, executor);
            this.callable = (g21) sf80.m183894p(g21Var);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public gnr<V> runInterruptibly() throws Exception {
            return (gnr) sf80.m183896r(this.callable.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.callable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public String toPendingString() {
            return this.callable.toString();
        }

        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        public void setValue(gnr<V> gnrVar) {
            throw null;
        }
    }
}
