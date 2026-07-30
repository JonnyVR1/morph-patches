package com.google.common.util.concurrent;

import com.google.common.base.C2677a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p153l.adj;
import p153l.hpr;
import p153l.kwk;
import p153l.mdj;
import p153l.nzm;
import p153l.ozm;
import p153l.qxj0;
import p153l.xn80;

/* JADX INFO: renamed from: com.google.common.util.concurrent.e */
/* JADX INFO: loaded from: classes7.dex */
public final class C3103e extends kwk {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.e$a */
    public static final class a<V> implements Runnable {

        /* JADX INFO: renamed from: a */
        public final Future<V> f11417a;

        /* JADX INFO: renamed from: b */
        public final mdj<? super V> f11418b;

        public a(Future<V> future, mdj<? super V> mdjVar) {
            this.f11417a = future;
            this.f11418b = mdjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable thM169985a;
            Future<V> future = this.f11417a;
            if ((future instanceof nzm) && (thM169985a = ozm.m169985a((nzm) future)) != null) {
                this.f11418b.onFailure(thM169985a);
                return;
            }
            try {
                this.f11418b.onSuccess(C3103e.m16710b(this.f11417a));
            } catch (Error e) {
                e = e;
                this.f11418b.onFailure(e);
            } catch (RuntimeException e2) {
                e = e2;
                this.f11418b.onFailure(e);
            } catch (ExecutionException e3) {
                this.f11418b.onFailure(e3.getCause());
            }
        }

        public String toString() {
            return C2677a.m15481b(this).m15492j(this.f11418b).toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public static <V> void m16709a(hpr<V> hprVar, mdj<? super V> mdjVar, Executor executor) {
        xn80.m212111p(mdjVar);
        hprVar.addListener(new a(hprVar, mdjVar), executor);
    }

    /* JADX INFO: renamed from: b */
    public static <V> V m16710b(Future<V> future) throws ExecutionException {
        xn80.m212121z(future.isDone(), "Future was expected to be done: %s", future);
        return (V) qxj0.m178604a(future);
    }

    /* JADX INFO: renamed from: c */
    public static <V> hpr<V> m16711c(Throwable th) {
        xn80.m212111p(th);
        return new C3104f.a(th);
    }

    /* JADX INFO: renamed from: d */
    public static <V> hpr<V> m16712d(V v2) {
        return v2 == null ? (hpr<V>) C3104f.f11419b : new C3104f(v2);
    }

    /* JADX INFO: renamed from: e */
    public static <I, O> hpr<O> m16713e(hpr<I> hprVar, adj<? super I, ? extends O> adjVar, Executor executor) {
        return AbstractRunnableC3099a.m16705G(hprVar, adjVar, executor);
    }
}
