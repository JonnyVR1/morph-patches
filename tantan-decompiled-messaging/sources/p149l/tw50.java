package p149l;

import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes3.dex */
public class tw50<T, U, V> extends sw50<T> {

    /* JADX INFO: renamed from: l.tw50$a */
    public class C20301a implements sw50.InterfaceC20044a<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ v9j f172361a;

        /* JADX INFO: renamed from: l.tw50$a$a */
        public class a extends z3g0<U> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ sw50.C20046c f172362e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ Long f172363f;

            public a(sw50.C20046c c20046c, Long l2) {
                this.f172362e = c20046c;
                this.f172363f = l2;
            }

            @Override // p149l.m250
            public void onCompleted() {
                this.f172362e.m186125g(this.f172363f.longValue());
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                this.f172362e.onError(th);
            }

            @Override // p149l.m250
            public void onNext(U u) {
                this.f172362e.m186125g(this.f172363f.longValue());
            }
        }

        public C20301a(v9j v9jVar) {
            this.f172361a = v9jVar;
        }

        @Override // p149l.y9j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c4g0 mo94599a(sw50.C20046c<T> c20046c, Long l2, bud0.AbstractC15976a abstractC15976a) {
            v9j v9jVar = this.f172361a;
            if (v9jVar == null) {
                return h4g0.m129243d();
            }
            try {
                return ((C22306c) v9jVar.call()).unsafeSubscribe(new a(c20046c, l2));
            } catch (Throwable th) {
                f5f.m119492f(th, c20046c);
                return h4g0.m129243d();
            }
        }
    }

    /* JADX INFO: renamed from: l.tw50$b */
    public class C20302b implements sw50.InterfaceC20045b<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ w9j f172365a;

        /* JADX INFO: renamed from: l.tw50$b$a */
        public class a extends z3g0<V> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ sw50.C20046c f172366e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ Long f172367f;

            public a(sw50.C20046c c20046c, Long l2) {
                this.f172366e = c20046c;
                this.f172367f = l2;
            }

            @Override // p149l.m250
            public void onCompleted() {
                this.f172366e.m186125g(this.f172367f.longValue());
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                this.f172366e.onError(th);
            }

            @Override // p149l.m250
            public void onNext(V v2) {
                this.f172366e.m186125g(this.f172367f.longValue());
            }
        }

        public C20302b(w9j w9jVar) {
            this.f172365a = w9jVar;
        }

        @Override // p149l.z9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c4g0 mo100621b(sw50.C20046c<T> c20046c, Long l2, T t, bud0.AbstractC15976a abstractC15976a) {
            try {
                return ((C22306c) this.f172365a.call(t)).unsafeSubscribe(new a(c20046c, l2));
            } catch (Throwable th) {
                f5f.m119492f(th, c20046c);
                return h4g0.m129243d();
            }
        }
    }

    public tw50(v9j<? extends C22306c<U>> v9jVar, w9j<? super T, ? extends C22306c<V>> w9jVar, C22306c<? extends T> c22306c) {
        super(new C20301a(v9jVar), new C20302b(w9jVar), c22306c, Schedulers.immediate());
    }

    @Override // p149l.sw50
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ z3g0 call(z3g0 z3g0Var) {
        return super.call(z3g0Var);
    }
}
