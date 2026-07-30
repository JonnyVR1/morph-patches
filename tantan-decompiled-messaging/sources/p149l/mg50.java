package p149l;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.internal.producers.SingleProducer;

/* JADX INFO: loaded from: classes3.dex */
public final class mg50 {
    /* JADX INFO: renamed from: a */
    public static <T> C22306c.a<T> m154500a(Future<? extends T> future) {
        return new C18454a(future);
    }

    /* JADX INFO: renamed from: b */
    public static <T> C22306c.a<T> m154501b(Future<? extends T> future, long j, TimeUnit timeUnit) {
        return new C18454a(future, j, timeUnit);
    }

    /* JADX INFO: renamed from: l.mg50$a */
    public static class C18454a<T> implements C22306c.a<T> {

        /* JADX INFO: renamed from: a */
        public final Future<? extends T> f133643a;

        /* JADX INFO: renamed from: b */
        public final long f133644b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f133645c;

        /* JADX INFO: renamed from: l.mg50$a$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p149l.d30
            public void call() {
                C18454a.this.f133643a.cancel(true);
            }
        }

        public C18454a(Future<? extends T> future) {
            this.f133643a = future;
            this.f133644b = 0L;
            this.f133645c = null;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            z3g0Var.m217046b(h4g0.m129240a(new a()));
            try {
                if (z3g0Var.isUnsubscribed()) {
                    return;
                }
                TimeUnit timeUnit = this.f133645c;
                Future<? extends T> future = this.f133643a;
                z3g0Var.mo106696f(new SingleProducer(z3g0Var, timeUnit == null ? future.get() : future.get(this.f133644b, timeUnit)));
            } catch (Throwable th) {
                if (z3g0Var.isUnsubscribed()) {
                    return;
                }
                f5f.m119492f(th, z3g0Var);
            }
        }

        public C18454a(Future<? extends T> future, long j, TimeUnit timeUnit) {
            this.f133643a = future;
            this.f133644b = j;
            this.f133645c = timeUnit;
        }
    }
}
