package p153l;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class a460<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f68353a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f68354b;

    /* JADX INFO: renamed from: c */
    public final f2e0 f68355c;

    /* JADX INFO: renamed from: l.a460$a */
    public static final class C15633a<T> extends gcg0<T> implements x20 {

        /* JADX INFO: renamed from: g */
        public static final Object f68356g = new Object();

        /* JADX INFO: renamed from: e */
        public final gcg0<? super T> f68357e;

        /* JADX INFO: renamed from: f */
        public final AtomicReference<Object> f68358f = new AtomicReference<>(f68356g);

        public C15633a(gcg0<? super T> gcg0Var) {
            this.f68357e = gcg0Var;
        }

        @Override // p153l.x20
        public void call() {
            m95885g();
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            m129868e(Long.MAX_VALUE);
        }

        /* JADX INFO: renamed from: g */
        public final void m95885g() {
            AtomicReference<Object> atomicReference = this.f68358f;
            Object obj = f68356g;
            Object andSet = atomicReference.getAndSet(obj);
            if (andSet != obj) {
                try {
                    this.f68357e.onNext(andSet);
                } catch (Throwable th) {
                    j6f.m143664f(th, this);
                }
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
            m95885g();
            this.f68357e.onCompleted();
            unsubscribe();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f68357e.onError(th);
            unsubscribe();
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f68358f.set(t);
        }
    }

    public a460(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        this.f68353a = j;
        this.f68354b = timeUnit;
        this.f68355c = f2e0Var;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        are0 are0Var = new are0(gcg0Var);
        f2e0.AbstractC16877a abstractC16877aCreateWorker = this.f68355c.createWorker();
        gcg0Var.m129866b(abstractC16877aCreateWorker);
        C15633a c15633a = new C15633a(are0Var);
        gcg0Var.m129866b(c15633a);
        long j = this.f68353a;
        abstractC16877aCreateWorker.m123611d(c15633a, j, j, this.f68354b);
        return c15633a;
    }
}
