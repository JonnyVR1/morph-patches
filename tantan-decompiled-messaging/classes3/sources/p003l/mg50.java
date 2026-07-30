package p003l;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p014rx.C1099c;
import p014rx.internal.producers.SingleProducer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class mg50 {
    /* JADX INFO: renamed from: a */
    public static <T> C1099c.a<T> m6394a(Future<? extends T> future) {
        return new C0427a(future);
    }

    /* JADX INFO: renamed from: b */
    public static <T> C1099c.a<T> m6395b(Future<? extends T> future, long j, TimeUnit timeUnit) {
        return new C0427a(future, j, timeUnit);
    }

    /* JADX INFO: renamed from: l.mg50$a */
    public static class C0427a<T> implements C1099c.a<T> {

        /* JADX INFO: renamed from: a */
        public final Future<? extends T> f5626a;

        /* JADX INFO: renamed from: b */
        public final long f5627b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f5628c;

        /* JADX INFO: renamed from: l.mg50$a$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p003l.d30
            public void call() {
                C0427a.this.f5626a.cancel(true);
            }
        }

        public C0427a(Future<? extends T> future) {
            this.f5626a = future;
            this.f5627b = 0L;
            this.f5628c = null;
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            z3g0Var.m9240b(h4g0.m4914a(new a()));
            try {
                if (z3g0Var.isUnsubscribed()) {
                    return;
                }
                TimeUnit timeUnit = this.f5628c;
                Future<? extends T> future = this.f5626a;
                z3g0Var.mo3257f(new SingleProducer(z3g0Var, timeUnit == null ? future.get() : future.get(this.f5627b, timeUnit)));
            } catch (Throwable th) {
                if (z3g0Var.isUnsubscribed()) {
                    return;
                }
                f5f.m3965f(th, z3g0Var);
            }
        }

        public C0427a(Future<? extends T> future, long j, TimeUnit timeUnit) {
            this.f5626a = future;
            this.f5627b = j;
            this.f5628c = timeUnit;
        }
    }
}
