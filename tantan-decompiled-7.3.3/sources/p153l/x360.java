package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class x360<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final qcj<Throwable, ? extends C22421c<? extends T>> f192220a;

    /* JADX INFO: renamed from: l.x360$a */
    public static class C21237a implements qcj<Throwable, C22421c<? extends T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qcj f192221a;

        public C21237a(qcj qcjVar) {
            this.f192221a = qcjVar;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22421c<? extends T> call(Throwable th) {
            return C22421c.just(this.f192221a.call(th));
        }
    }

    /* JADX INFO: renamed from: l.x360$b */
    public static class C21238b implements qcj<Throwable, C22421c<? extends T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C22421c f192222a;

        public C21238b(C22421c c22421c) {
            this.f192222a = c22421c;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22421c<? extends T> call(Throwable th) {
            return this.f192222a;
        }
    }

    /* JADX INFO: renamed from: l.x360$c */
    public static class C21239c implements qcj<Throwable, C22421c<? extends T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C22421c f192223a;

        public C21239c(C22421c c22421c) {
            this.f192223a = c22421c;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22421c<? extends T> call(Throwable th) {
            return th instanceof Exception ? this.f192223a : C22421c.error(th);
        }
    }

    /* JADX INFO: renamed from: l.x360$d */
    public class C21240d extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f192224e;

        /* JADX INFO: renamed from: f */
        public long f192225f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ gcg0 f192226g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ xk90 f192227h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ wqe0 f192228i;

        /* JADX INFO: renamed from: l.x360$d$a */
        public class a extends gcg0<T> {
            public a() {
            }

            @Override // p153l.gcg0
            /* JADX INFO: renamed from: f */
            public void mo95773f(vk90 vk90Var) {
                C21240d.this.f192227h.m211356c(vk90Var);
            }

            @Override // p153l.bb50
            public void onCompleted() {
                C21240d.this.f192226g.onCompleted();
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                C21240d.this.f192226g.onError(th);
            }

            @Override // p153l.bb50
            public void onNext(T t) {
                C21240d.this.f192226g.onNext(t);
            }
        }

        public C21240d(gcg0 gcg0Var, xk90 xk90Var, wqe0 wqe0Var) {
            this.f192226g = gcg0Var;
            this.f192227h = xk90Var;
            this.f192228i = wqe0Var;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: f */
        public void mo95773f(vk90 vk90Var) {
            this.f192227h.m211356c(vk90Var);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f192224e) {
                return;
            }
            this.f192224e = true;
            this.f192226g.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (this.f192224e) {
                j6f.m143663e(th);
                hrd0.m136792j(th);
                return;
            }
            this.f192224e = true;
            try {
                unsubscribe();
                a aVar = new a();
                this.f192228i.m207511b(aVar);
                long j = this.f192225f;
                if (j != 0) {
                    this.f192227h.m211355b(j);
                }
                x360.this.f192220a.call(th).unsafeSubscribe(aVar);
            } catch (Throwable th2) {
                j6f.m143664f(th2, this.f192226g);
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            if (this.f192224e) {
                return;
            }
            this.f192225f++;
            this.f192226g.onNext(t);
        }
    }

    public x360(qcj<Throwable, ? extends C22421c<? extends T>> qcjVar) {
        this.f192220a = qcjVar;
    }

    /* JADX INFO: renamed from: b */
    public static <T> x360<T> m209194b(C22421c<? extends T> c22421c) {
        return new x360<>(new C21239c(c22421c));
    }

    /* JADX INFO: renamed from: c */
    public static <T> x360<T> m209195c(C22421c<? extends T> c22421c) {
        return new x360<>(new C21238b(c22421c));
    }

    /* JADX INFO: renamed from: d */
    public static <T> x360<T> m209196d(qcj<Throwable, ? extends T> qcjVar) {
        return new x360<>(new C21237a(qcjVar));
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        xk90 xk90Var = new xk90();
        wqe0 wqe0Var = new wqe0();
        C21240d c21240d = new C21240d(gcg0Var, xk90Var, wqe0Var);
        wqe0Var.m207511b(c21240d);
        gcg0Var.m129866b(wqe0Var);
        gcg0Var.mo95773f(xk90Var);
        return c21240d;
    }
}
