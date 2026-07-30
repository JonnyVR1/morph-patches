package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import p153l.hpr;
import p153l.n21;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public class TrustedListenableFutureTask<V> extends AbstractC3102d.a<V> implements RunnableFuture<V> {

    public final class TrustedFutureInterruptibleTask extends InterruptibleTask<V> {
        private final Callable<V> callable;
        final /* synthetic */ TrustedListenableFutureTask this$0;

        public TrustedFutureInterruptibleTask(TrustedListenableFutureTask trustedListenableFutureTask, Callable<V> callable) {
            this.callable = (Callable) xn80.m212111p(callable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public void afterRanInterruptiblyFailure(Throwable th) {
            throw null;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public void afterRanInterruptiblySuccess(V v2) {
            throw null;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean isDone() {
            throw null;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public V runInterruptibly() throws Exception {
            return this.callable.call();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public String toPendingString() {
            return this.callable.toString();
        }
    }

    public final class TrustedFutureInterruptibleAsyncTask extends InterruptibleTask<hpr<V>> {
        private final n21<V> callable;
        final /* synthetic */ TrustedListenableFutureTask this$0;

        public TrustedFutureInterruptibleAsyncTask(TrustedListenableFutureTask trustedListenableFutureTask, n21<V> n21Var) {
            this.callable = (n21) xn80.m212111p(n21Var);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public void afterRanInterruptiblyFailure(Throwable th) {
            throw null;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean isDone() {
            throw null;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public hpr<V> runInterruptibly() throws Exception {
            return (hpr) xn80.m212113r(this.callable.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.callable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public String toPendingString() {
            return this.callable.toString();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public void afterRanInterruptiblySuccess(hpr<V> hprVar) {
            throw null;
        }
    }
}
