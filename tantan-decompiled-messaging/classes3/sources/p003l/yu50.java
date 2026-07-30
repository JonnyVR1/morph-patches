package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class yu50<T, U> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, ? extends C1099c<U>> f9145a;

    /* JADX INFO: renamed from: l.yu50$a */
    public class C0665a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final zu50.C0679b<T> f9146e;

        /* JADX INFO: renamed from: f */
        public final z3g0<?> f9147f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ vie0 f9148g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ rie0 f9149h;

        /* JADX INFO: renamed from: l.yu50$a$a */
        public class a extends z3g0<U> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ int f9151e;

            public a(int i) {
                this.f9151e = i;
            }

            @Override // p003l.m250
            public void onCompleted() {
                C0665a c0665a = C0665a.this;
                c0665a.f9146e.m9481b(this.f9151e, c0665a.f9148g, c0665a.f9147f);
                unsubscribe();
            }

            @Override // p003l.m250
            public void onError(Throwable th) {
                C0665a.this.f9147f.onError(th);
            }

            @Override // p003l.m250
            public void onNext(U u) {
                onCompleted();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0665a(z3g0 z3g0Var, vie0 vie0Var, rie0 rie0Var) {
            super(z3g0Var);
            this.f9148g = vie0Var;
            this.f9149h = rie0Var;
            this.f9146e = new zu50.C0679b<>();
            this.f9147f = this;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            m9242e(Long.MAX_VALUE);
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f9146e.m9482c(this.f9148g, this);
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f9148g.onError(th);
            unsubscribe();
            this.f9146e.m9480a();
        }

        @Override // p003l.m250
        public void onNext(T t) {
            try {
                C1099c<U> c1099cCall = yu50.this.f9145a.call(t);
                a aVar = new a(this.f9146e.m9483d(t));
                this.f9149h.m7260b(aVar);
                c1099cCall.unsafeSubscribe(aVar);
            } catch (Throwable th) {
                f5f.m3965f(th, this);
            }
        }
    }

    public yu50(w9j<? super T, ? extends C1099c<U>> w9jVar) {
        this.f9145a = w9jVar;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        vie0 vie0Var = new vie0(z3g0Var);
        rie0 rie0Var = new rie0();
        z3g0Var.m9240b(rie0Var);
        return new C0665a(z3g0Var, vie0Var, rie0Var);
    }
}
