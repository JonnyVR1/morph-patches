package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class n460<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final C22421c<? extends T> f140195a;

    /* JADX INFO: renamed from: l.n460$a */
    public static final class C18793a<T> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final xk90 f140196e;

        /* JADX INFO: renamed from: f */
        public final gcg0<? super T> f140197f;

        public C18793a(gcg0<? super T> gcg0Var, xk90 xk90Var) {
            this.f140197f = gcg0Var;
            this.f140196e = xk90Var;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: f */
        public void mo95773f(vk90 vk90Var) {
            this.f140196e.m211356c(vk90Var);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f140197f.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f140197f.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f140197f.onNext(t);
            this.f140196e.m211355b(1L);
        }
    }

    /* JADX INFO: renamed from: l.n460$b */
    public static final class C18794b<T> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f140198e = true;

        /* JADX INFO: renamed from: f */
        public final gcg0<? super T> f140199f;

        /* JADX INFO: renamed from: g */
        public final wqe0 f140200g;

        /* JADX INFO: renamed from: h */
        public final xk90 f140201h;

        /* JADX INFO: renamed from: i */
        public final C22421c<? extends T> f140202i;

        public C18794b(gcg0<? super T> gcg0Var, wqe0 wqe0Var, xk90 xk90Var, C22421c<? extends T> c22421c) {
            this.f140199f = gcg0Var;
            this.f140200g = wqe0Var;
            this.f140201h = xk90Var;
            this.f140202i = c22421c;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: f */
        public void mo95773f(vk90 vk90Var) {
            this.f140201h.m211356c(vk90Var);
        }

        /* JADX INFO: renamed from: g */
        public final void m161555g() {
            C18793a c18793a = new C18793a(this.f140199f, this.f140201h);
            this.f140200g.m207511b(c18793a);
            this.f140202i.unsafeSubscribe(c18793a);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            boolean z = this.f140198e;
            gcg0<? super T> gcg0Var = this.f140199f;
            if (!z) {
                gcg0Var.onCompleted();
            } else {
                if (gcg0Var.isUnsubscribed()) {
                    return;
                }
                m161555g();
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f140199f.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f140198e = false;
            this.f140199f.onNext(t);
            this.f140201h.m211355b(1L);
        }
    }

    public n460(C22421c<? extends T> c22421c) {
        this.f140195a = c22421c;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        wqe0 wqe0Var = new wqe0();
        xk90 xk90Var = new xk90();
        C18794b c18794b = new C18794b(gcg0Var, wqe0Var, xk90Var, this.f140195a);
        wqe0Var.m207511b(c18794b);
        gcg0Var.m129866b(wqe0Var);
        gcg0Var.mo95773f(xk90Var);
        return c18794b;
    }
}
