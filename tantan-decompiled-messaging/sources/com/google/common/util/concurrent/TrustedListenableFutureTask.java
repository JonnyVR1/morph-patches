package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import p149l.g21;
import p149l.gnr;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
public class TrustedListenableFutureTask<V> extends AbstractC3079d.a<V> implements RunnableFuture<V> {

    public final class TrustedFutureInterruptibleTask extends InterruptibleTask<V> {
        private final Callable<V> callable;
        final /* synthetic */ TrustedListenableFutureTask this$0;

        public TrustedFutureInterruptibleTask(TrustedListenableFutureTask trustedListenableFutureTask, Callable<V> callable) {
            this.callable = (Callable) sf80.m183894p(callable);
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

    public final class TrustedFutureInterruptibleAsyncTask extends InterruptibleTask<gnr<V>> {
        private final g21<V> callable;
        final /* synthetic */ TrustedListenableFutureTask this$0;

        public TrustedFutureInterruptibleAsyncTask(TrustedListenableFutureTask trustedListenableFutureTask, g21<V> g21Var) {
            this.callable = (g21) sf80.m183894p(g21Var);
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
        public gnr<V> runInterruptibly() throws Exception {
            return (gnr) sf80.m183896r(this.callable.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.callable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public String toPendingString() {
            return this.callable.toString();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public void afterRanInterruptiblySuccess(gnr<V> gnrVar) {
            throw null;
        }
    }
}
