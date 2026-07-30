package com.google.common.util.concurrent;

import com.google.common.base.C2654a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p149l.gaj;
import p149l.gnr;
import p149l.noj0;
import p149l.nxm;
import p149l.oxm;
import p149l.saj;
import p149l.sf80;
import p149l.utk;

/* JADX INFO: renamed from: com.google.common.util.concurrent.e */
/* JADX INFO: loaded from: classes7.dex */
public final class C3080e extends utk {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.e$a */
    public static final class a<V> implements Runnable {

        /* JADX INFO: renamed from: a */
        public final Future<V> f11380a;

        /* JADX INFO: renamed from: b */
        public final saj<? super V> f11381b;

        public a(Future<V> future, saj<? super V> sajVar) {
            this.f11380a = future;
            this.f11381b = sajVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable thM166571a;
            Future<V> future = this.f11380a;
            if ((future instanceof nxm) && (thM166571a = oxm.m166571a((nxm) future)) != null) {
                this.f11381b.onFailure(thM166571a);
                return;
            }
            try {
                this.f11381b.onSuccess(C3080e.m16655b(this.f11380a));
            } catch (Error e) {
                e = e;
                this.f11381b.onFailure(e);
            } catch (RuntimeException e2) {
                e = e2;
                this.f11381b.onFailure(e);
            } catch (ExecutionException e3) {
                this.f11381b.onFailure(e3.getCause());
            }
        }

        public String toString() {
            return C2654a.m15427b(this).m15438j(this.f11381b).toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public static <V> void m16654a(gnr<V> gnrVar, saj<? super V> sajVar, Executor executor) {
        sf80.m183894p(sajVar);
        gnrVar.addListener(new a(gnrVar, sajVar), executor);
    }

    /* JADX INFO: renamed from: b */
    public static <V> V m16655b(Future<V> future) throws ExecutionException {
        sf80.m183904z(future.isDone(), "Future was expected to be done: %s", future);
        return (V) noj0.m160415a(future);
    }

    /* JADX INFO: renamed from: c */
    public static <V> gnr<V> m16656c(Throwable th) {
        sf80.m183894p(th);
        return new C3081f.a(th);
    }

    /* JADX INFO: renamed from: d */
    public static <V> gnr<V> m16657d(V v2) {
        return v2 == null ? (gnr<V>) C3081f.f11382b : new C3081f(v2);
    }

    /* JADX INFO: renamed from: e */
    public static <I, O> gnr<O> m16658e(gnr<I> gnrVar, gaj<? super I, ? extends O> gajVar, Executor executor) {
        return AbstractRunnableC3076a.m16650G(gnrVar, gajVar, executor);
    }
}
