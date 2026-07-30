package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class e360<T, U> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final qcj<? super T, ? extends C22421c<U>> f91930a;

    /* JADX INFO: renamed from: l.e360$a */
    public class C16692a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final f360.C16882b<T> f91931e;

        /* JADX INFO: renamed from: f */
        public final gcg0<?> f91932f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ are0 f91933g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ wqe0 f91934h;

        /* JADX INFO: renamed from: l.e360$a$a */
        public class a extends gcg0<U> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ int f91936e;

            public a(int i) {
                this.f91936e = i;
            }

            @Override // p153l.bb50
            public void onCompleted() {
                C16692a c16692a = C16692a.this;
                c16692a.f91931e.m123717b(this.f91936e, c16692a.f91933g, c16692a.f91932f);
                unsubscribe();
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                C16692a.this.f91932f.onError(th);
            }

            @Override // p153l.bb50
            public void onNext(U u) {
                onCompleted();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16692a(gcg0 gcg0Var, are0 are0Var, wqe0 wqe0Var) {
            super(gcg0Var);
            this.f91933g = are0Var;
            this.f91934h = wqe0Var;
            this.f91931e = new f360.C16882b<>();
            this.f91932f = this;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            m129868e(Long.MAX_VALUE);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f91931e.m123718c(this.f91933g, this);
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f91933g.onError(th);
            unsubscribe();
            this.f91931e.m123716a();
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            try {
                C22421c<U> c22421cCall = e360.this.f91930a.call(t);
                a aVar = new a(this.f91931e.m123719d(t));
                this.f91934h.m207511b(aVar);
                c22421cCall.unsafeSubscribe(aVar);
            } catch (Throwable th) {
                j6f.m143664f(th, this);
            }
        }
    }

    public e360(qcj<? super T, ? extends C22421c<U>> qcjVar) {
        this.f91930a = qcjVar;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        are0 are0Var = new are0(gcg0Var);
        wqe0 wqe0Var = new wqe0();
        gcg0Var.m129866b(wqe0Var);
        return new C16692a(gcg0Var, are0Var, wqe0Var);
    }
}
