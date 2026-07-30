package p003l;

import java.util.concurrent.atomic.AtomicInteger;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class msd<T, R> extends z3g0<T> {

    /* JADX INFO: renamed from: e */
    public final z3g0<? super R> f5751e;

    /* JADX INFO: renamed from: f */
    public boolean f5752f;

    /* JADX INFO: renamed from: g */
    public R f5753g;

    /* JADX INFO: renamed from: h */
    public final AtomicInteger f5754h = new AtomicInteger();

    /* JADX INFO: renamed from: l.msd$a */
    public static final class C0431a implements rc90 {

        /* JADX INFO: renamed from: a */
        public final msd<?, ?> f5755a;

        public C0431a(msd<?, ?> msdVar) {
            this.f5755a = msdVar;
        }

        @Override // p003l.rc90
        public void request(long j) {
            this.f5755a.m6466i(j);
        }
    }

    public msd(z3g0<? super R> z3g0Var) {
        this.f5751e = z3g0Var;
    }

    @Override // p003l.z3g0
    /* JADX INFO: renamed from: f */
    public final void mo3257f(rc90 rc90Var) {
        rc90Var.request(Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: g */
    public final void m6464g() {
        this.f5751e.onCompleted();
    }

    /* JADX INFO: renamed from: h */
    public final void m6465h(R r) {
        z3g0<? super R> z3g0Var = this.f5751e;
        do {
            int i = this.f5754h.get();
            if (i == 2 || i == 3 || z3g0Var.isUnsubscribed()) {
                return;
            }
            if (i == 1) {
                z3g0Var.onNext(r);
                if (!z3g0Var.isUnsubscribed()) {
                    z3g0Var.onCompleted();
                }
                this.f5754h.lazySet(3);
                return;
            }
            this.f5753g = r;
        } while (!this.f5754h.compareAndSet(0, 2));
    }

    /* JADX INFO: renamed from: i */
    public final void m6466i(long j) {
        AtomicInteger atomicInteger;
        if (j < 0) {
            y3g0.m8887a("n >= 0 required but it was ", j);
            return;
        }
        if (j != 0) {
            z3g0<? super R> z3g0Var = this.f5751e;
            do {
                int i = this.f5754h.get();
                if (i == 1 || i == 3 || z3g0Var.isUnsubscribed()) {
                    return;
                }
                atomicInteger = this.f5754h;
                if (i == 2) {
                    if (atomicInteger.compareAndSet(2, 3)) {
                        z3g0Var.onNext(this.f5753g);
                        if (z3g0Var.isUnsubscribed()) {
                            return;
                        }
                        z3g0Var.onCompleted();
                        return;
                    }
                    return;
                }
            } while (!atomicInteger.compareAndSet(0, 1));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m6467j() {
        z3g0<? super R> z3g0Var = this.f5751e;
        z3g0Var.m9240b(this);
        z3g0Var.mo3257f(new C0431a(this));
    }

    /* JADX INFO: renamed from: k */
    public final void m6468k(C1099c<? extends T> c1099c) {
        m6467j();
        c1099c.unsafeSubscribe(this);
    }

    @Override // p003l.m250
    public void onCompleted() {
        if (this.f5752f) {
            m6465h(this.f5753g);
        } else {
            m6464g();
        }
    }

    @Override // p003l.m250
    public void onError(Throwable th) {
        this.f5753g = null;
        this.f5751e.onError(th);
    }
}
