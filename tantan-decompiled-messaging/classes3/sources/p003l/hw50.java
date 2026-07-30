package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class hw50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final C1099c<? extends T> f4293a;

    /* JADX INFO: renamed from: l.hw50$a */
    public static final class C0339a<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final tc90 f4294e;

        /* JADX INFO: renamed from: f */
        public final z3g0<? super T> f4295f;

        public C0339a(z3g0<? super T> z3g0Var, tc90 tc90Var) {
            this.f4295f = z3g0Var;
            this.f4294e = tc90Var;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo3257f(rc90 rc90Var) {
            this.f4294e.m7738c(rc90Var);
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f4295f.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f4295f.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f4295f.onNext(t);
            this.f4294e.m7737b(1L);
        }
    }

    /* JADX INFO: renamed from: l.hw50$b */
    public static final class C0340b<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f4296e = true;

        /* JADX INFO: renamed from: f */
        public final z3g0<? super T> f4297f;

        /* JADX INFO: renamed from: g */
        public final rie0 f4298g;

        /* JADX INFO: renamed from: h */
        public final tc90 f4299h;

        /* JADX INFO: renamed from: i */
        public final C1099c<? extends T> f4300i;

        public C0340b(z3g0<? super T> z3g0Var, rie0 rie0Var, tc90 tc90Var, C1099c<? extends T> c1099c) {
            this.f4297f = z3g0Var;
            this.f4298g = rie0Var;
            this.f4299h = tc90Var;
            this.f4300i = c1099c;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo3257f(rc90 rc90Var) {
            this.f4299h.m7738c(rc90Var);
        }

        /* JADX INFO: renamed from: g */
        public final void m5002g() {
            C0339a c0339a = new C0339a(this.f4297f, this.f4299h);
            this.f4298g.m7260b(c0339a);
            this.f4300i.unsafeSubscribe(c0339a);
        }

        @Override // p003l.m250
        public void onCompleted() {
            boolean z = this.f4296e;
            z3g0<? super T> z3g0Var = this.f4297f;
            if (!z) {
                z3g0Var.onCompleted();
            } else {
                if (z3g0Var.isUnsubscribed()) {
                    return;
                }
                m5002g();
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f4297f.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f4296e = false;
            this.f4297f.onNext(t);
            this.f4299h.m7737b(1L);
        }
    }

    public hw50(C1099c<? extends T> c1099c) {
        this.f4293a = c1099c;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        rie0 rie0Var = new rie0();
        tc90 tc90Var = new tc90();
        C0340b c0340b = new C0340b(z3g0Var, rie0Var, tc90Var, this.f4293a);
        rie0Var.m7260b(c0340b);
        z3g0Var.m9240b(rie0Var);
        z3g0Var.mo3257f(tc90Var);
        return c0340b;
    }
}
