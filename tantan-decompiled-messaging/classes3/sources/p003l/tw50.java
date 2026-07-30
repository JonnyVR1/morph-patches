package p003l;

import p014rx.C1099c;
import p014rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class tw50<T, U, V> extends sw50<T> {

    /* JADX INFO: renamed from: l.tw50$a */
    public class C0572a implements sw50.InterfaceC0539a<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ v9j f7810a;

        /* JADX INFO: renamed from: l.tw50$a$a */
        public class a extends z3g0<U> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ sw50.C0541c f7811e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ Long f7812f;

            public a(sw50.C0541c c0541c, Long l2) {
                this.f7811e = c0541c;
                this.f7812f = l2;
            }

            @Override // p003l.m250
            public void onCompleted() {
                this.f7811e.m7647g(this.f7812f.longValue());
            }

            @Override // p003l.m250
            public void onError(Throwable th) {
                this.f7811e.onError(th);
            }

            @Override // p003l.m250
            public void onNext(U u) {
                this.f7811e.m7647g(this.f7812f.longValue());
            }
        }

        public C0572a(v9j v9jVar) {
            this.f7810a = v9jVar;
        }

        @Override // p003l.y9j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c4g0 mo2764a(sw50.C0541c<T> c0541c, Long l2, bud0.AbstractC0185a abstractC0185a) {
            v9j v9jVar = this.f7810a;
            if (v9jVar == null) {
                return h4g0.m4917d();
            }
            try {
                return ((C1099c) v9jVar.call()).unsafeSubscribe(new a(c0541c, l2));
            } catch (Throwable th) {
                f5f.m3965f(th, c0541c);
                return h4g0.m4917d();
            }
        }
    }

    /* JADX INFO: renamed from: l.tw50$b */
    public class C0573b implements sw50.InterfaceC0540b<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ w9j f7814a;

        /* JADX INFO: renamed from: l.tw50$b$a */
        public class a extends z3g0<V> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ sw50.C0541c f7815e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ Long f7816f;

            public a(sw50.C0541c c0541c, Long l2) {
                this.f7815e = c0541c;
                this.f7816f = l2;
            }

            @Override // p003l.m250
            public void onCompleted() {
                this.f7815e.m7647g(this.f7816f.longValue());
            }

            @Override // p003l.m250
            public void onError(Throwable th) {
                this.f7815e.onError(th);
            }

            @Override // p003l.m250
            public void onNext(V v2) {
                this.f7815e.m7647g(this.f7816f.longValue());
            }
        }

        public C0573b(w9j w9jVar) {
            this.f7814a = w9jVar;
        }

        @Override // p003l.z9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c4g0 mo6904b(sw50.C0541c<T> c0541c, Long l2, T t, bud0.AbstractC0185a abstractC0185a) {
            try {
                return ((C1099c) this.f7814a.call(t)).unsafeSubscribe(new a(c0541c, l2));
            } catch (Throwable th) {
                f5f.m3965f(th, c0541c);
                return h4g0.m4917d();
            }
        }
    }

    public tw50(v9j<? extends C1099c<U>> v9jVar, w9j<? super T, ? extends C1099c<V>> w9jVar, C1099c<? extends T> c1099c) {
        super(new C0572a(v9jVar), new C0573b(w9jVar), c1099c, Schedulers.immediate());
    }

    @Override // p003l.sw50
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ z3g0 call(z3g0 z3g0Var) {
        return super.call(z3g0Var);
    }
}
