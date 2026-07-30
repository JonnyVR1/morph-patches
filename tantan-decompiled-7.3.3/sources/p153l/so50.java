package p153l;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.internal.producers.SingleProducer;

/* JADX INFO: loaded from: classes3.dex */
public final class so50 {
    /* JADX INFO: renamed from: a */
    public static <T> C22421c.a<T> m187156a(Future<? extends T> future) {
        return new C20123a(future);
    }

    /* JADX INFO: renamed from: b */
    public static <T> C22421c.a<T> m187157b(Future<? extends T> future, long j, TimeUnit timeUnit) {
        return new C20123a(future, j, timeUnit);
    }

    /* JADX INFO: renamed from: l.so50$a */
    public static class C20123a<T> implements C22421c.a<T> {

        /* JADX INFO: renamed from: a */
        public final Future<? extends T> f169845a;

        /* JADX INFO: renamed from: b */
        public final long f169846b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f169847c;

        /* JADX INFO: renamed from: l.so50$a$a */
        public class a implements x20 {
            public a() {
            }

            @Override // p153l.x20
            public void call() {
                C20123a.this.f169845a.cancel(true);
            }
        }

        public C20123a(Future<? extends T> future) {
            this.f169845a = future;
            this.f169846b = 0L;
            this.f169847c = null;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super T> gcg0Var) {
            gcg0Var.m129866b(pcg0.m171648a(new a()));
            try {
                if (gcg0Var.isUnsubscribed()) {
                    return;
                }
                TimeUnit timeUnit = this.f169847c;
                Future<? extends T> future = this.f169845a;
                gcg0Var.mo95773f(new SingleProducer(gcg0Var, timeUnit == null ? future.get() : future.get(this.f169846b, timeUnit)));
            } catch (Throwable th) {
                if (gcg0Var.isUnsubscribed()) {
                    return;
                }
                j6f.m143664f(th, gcg0Var);
            }
        }

        public C20123a(Future<? extends T> future, long j, TimeUnit timeUnit) {
            this.f169845a = future;
            this.f169846b = j;
            this.f169847c = timeUnit;
        }
    }
}
