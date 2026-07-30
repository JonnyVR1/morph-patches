package p149l;

import java.util.concurrent.atomic.AtomicInteger;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class msd<T, R> extends z3g0<T> {

    /* JADX INFO: renamed from: e */
    public final z3g0<? super R> f135464e;

    /* JADX INFO: renamed from: f */
    public boolean f135465f;

    /* JADX INFO: renamed from: g */
    public R f135466g;

    /* JADX INFO: renamed from: h */
    public final AtomicInteger f135467h = new AtomicInteger();

    /* JADX INFO: renamed from: l.msd$a */
    public static final class C18547a implements rc90 {

        /* JADX INFO: renamed from: a */
        public final msd<?, ?> f135468a;

        public C18547a(msd<?, ?> msdVar) {
            this.f135468a = msdVar;
        }

        @Override // p149l.rc90
        public void request(long j) {
            this.f135468a.m156125i(j);
        }
    }

    public msd(z3g0<? super R> z3g0Var) {
        this.f135464e = z3g0Var;
    }

    @Override // p149l.z3g0
    /* JADX INFO: renamed from: f */
    public final void mo106696f(rc90 rc90Var) {
        rc90Var.request(Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: g */
    public final void m156123g() {
        this.f135464e.onCompleted();
    }

    /* JADX INFO: renamed from: h */
    public final void m156124h(R r) {
        z3g0<? super R> z3g0Var = this.f135464e;
        do {
            int i = this.f135467h.get();
            if (i == 2 || i == 3 || z3g0Var.isUnsubscribed()) {
                return;
            }
            if (i == 1) {
                z3g0Var.onNext(r);
                if (!z3g0Var.isUnsubscribed()) {
                    z3g0Var.onCompleted();
                }
                this.f135467h.lazySet(3);
                return;
            }
            this.f135466g = r;
        } while (!this.f135467h.compareAndSet(0, 2));
    }

    /* JADX INFO: renamed from: i */
    public final void m156125i(long j) {
        AtomicInteger atomicInteger;
        if (j < 0) {
            y3g0.m212802a("n >= 0 required but it was ", j);
            return;
        }
        if (j != 0) {
            z3g0<? super R> z3g0Var = this.f135464e;
            do {
                int i = this.f135467h.get();
                if (i == 1 || i == 3 || z3g0Var.isUnsubscribed()) {
                    return;
                }
                atomicInteger = this.f135467h;
                if (i == 2) {
                    if (atomicInteger.compareAndSet(2, 3)) {
                        z3g0Var.onNext(this.f135466g);
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
    public final void m156126j() {
        z3g0<? super R> z3g0Var = this.f135464e;
        z3g0Var.m217046b(this);
        z3g0Var.mo106696f(new C18547a(this));
    }

    /* JADX INFO: renamed from: k */
    public final void m156127k(C22306c<? extends T> c22306c) {
        m156126j();
        c22306c.unsafeSubscribe(this);
    }

    @Override // p149l.m250
    public void onCompleted() {
        if (this.f135465f) {
            m156124h(this.f135466g);
        } else {
            m156123g();
        }
    }

    @Override // p149l.m250
    public void onError(Throwable th) {
        this.f135466g = null;
        this.f135464e.onError(th);
    }
}
