package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class yu50<T, U> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, ? extends C22306c<U>> f200043a;

    /* JADX INFO: renamed from: l.yu50$a */
    public class C21513a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final zu50.C21771b<T> f200044e;

        /* JADX INFO: renamed from: f */
        public final z3g0<?> f200045f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ vie0 f200046g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ rie0 f200047h;

        /* JADX INFO: renamed from: l.yu50$a$a */
        public class a extends z3g0<U> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ int f200049e;

            public a(int i) {
                this.f200049e = i;
            }

            @Override // p149l.m250
            public void onCompleted() {
                C21513a c21513a = C21513a.this;
                c21513a.f200044e.m220198b(this.f200049e, c21513a.f200046g, c21513a.f200045f);
                unsubscribe();
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                C21513a.this.f200045f.onError(th);
            }

            @Override // p149l.m250
            public void onNext(U u) {
                onCompleted();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21513a(z3g0 z3g0Var, vie0 vie0Var, rie0 rie0Var) {
            super(z3g0Var);
            this.f200046g = vie0Var;
            this.f200047h = rie0Var;
            this.f200044e = new zu50.C21771b<>();
            this.f200045f = this;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo99382d() {
            m217048e(Long.MAX_VALUE);
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f200044e.m220199c(this.f200046g, this);
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f200046g.onError(th);
            unsubscribe();
            this.f200044e.m220197a();
        }

        @Override // p149l.m250
        public void onNext(T t) {
            try {
                C22306c<U> c22306cCall = yu50.this.f200043a.call(t);
                a aVar = new a(this.f200044e.m220200d(t));
                this.f200047h.m179504b(aVar);
                c22306cCall.unsafeSubscribe(aVar);
            } catch (Throwable th) {
                f5f.m119492f(th, this);
            }
        }
    }

    public yu50(w9j<? super T, ? extends C22306c<U>> w9jVar) {
        this.f200043a = w9jVar;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        vie0 vie0Var = new vie0(z3g0Var);
        rie0 rie0Var = new rie0();
        z3g0Var.m217046b(rie0Var);
        return new C21513a(z3g0Var, vie0Var, rie0Var);
    }
}
