package p003l;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class uv50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f8101a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f8102b;

    /* JADX INFO: renamed from: c */
    public final bud0 f8103c;

    /* JADX INFO: renamed from: l.uv50$a */
    public static final class C0585a<T> extends z3g0<T> implements d30 {

        /* JADX INFO: renamed from: g */
        public static final Object f8104g = new Object();

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f8105e;

        /* JADX INFO: renamed from: f */
        public final AtomicReference<Object> f8106f = new AtomicReference<>(f8104g);

        public C0585a(z3g0<? super T> z3g0Var) {
            this.f8105e = z3g0Var;
        }

        @Override // p003l.d30
        public void call() {
            m8251g();
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            m9242e(Long.MAX_VALUE);
        }

        /* JADX INFO: renamed from: g */
        public final void m8251g() {
            AtomicReference<Object> atomicReference = this.f8106f;
            Object obj = f8104g;
            Object andSet = atomicReference.getAndSet(obj);
            if (andSet != obj) {
                try {
                    this.f8105e.onNext(andSet);
                } catch (Throwable th) {
                    f5f.m3965f(th, this);
                }
            }
        }

        @Override // p003l.m250
        public void onCompleted() {
            m8251g();
            this.f8105e.onCompleted();
            unsubscribe();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f8105e.onError(th);
            unsubscribe();
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f8106f.set(t);
        }
    }

    public uv50(long j, TimeUnit timeUnit, bud0 bud0Var) {
        this.f8101a = j;
        this.f8102b = timeUnit;
        this.f8103c = bud0Var;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        vie0 vie0Var = new vie0(z3g0Var);
        bud0.AbstractC0185a abstractC0185aCreateWorker = this.f8103c.createWorker();
        z3g0Var.m9240b(abstractC0185aCreateWorker);
        C0585a c0585a = new C0585a(vie0Var);
        z3g0Var.m9240b(c0585a);
        long j = this.f8101a;
        abstractC0185aCreateWorker.m3172d(c0585a, j, j, this.f8102b);
        return c0585a;
    }
}
