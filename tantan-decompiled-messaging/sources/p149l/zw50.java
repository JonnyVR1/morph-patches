package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class zw50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final bud0 f205149a;

    /* JADX INFO: renamed from: l.zw50$a */
    public class C21792a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f205150e;

        public C21792a(z3g0 z3g0Var) {
            this.f205150e = z3g0Var;
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f205150e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f205150e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f205150e.onNext(t);
        }
    }

    /* JADX INFO: renamed from: l.zw50$b */
    public class C21793b implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f205152a;

        /* JADX INFO: renamed from: l.zw50$b$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ bud0.AbstractC15976a f205154a;

            public a(bud0.AbstractC15976a abstractC15976a) {
                this.f205154a = abstractC15976a;
            }

            @Override // p149l.d30
            public void call() {
                C21793b.this.f205152a.unsubscribe();
                this.f205154a.unsubscribe();
            }
        }

        public C21793b(z3g0 z3g0Var) {
            this.f205152a = z3g0Var;
        }

        @Override // p149l.d30
        public void call() {
            bud0.AbstractC15976a abstractC15976aCreateWorker = zw50.this.f205149a.createWorker();
            abstractC15976aCreateWorker.mo99201b(new a(abstractC15976aCreateWorker));
        }
    }

    public zw50(bud0 bud0Var) {
        this.f205149a = bud0Var;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        C21792a c21792a = new C21792a(z3g0Var);
        z3g0Var.m217046b(h4g0.m129240a(new C21793b(c21792a)));
        return c21792a;
    }
}
