package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class zw50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final bud0 f9456a;

    /* JADX INFO: renamed from: l.zw50$a */
    public class C0681a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f9457e;

        public C0681a(z3g0 z3g0Var) {
            this.f9457e = z3g0Var;
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f9457e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f9457e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f9457e.onNext(t);
        }
    }

    /* JADX INFO: renamed from: l.zw50$b */
    public class C0682b implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f9459a;

        /* JADX INFO: renamed from: l.zw50$b$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ bud0.AbstractC0185a f9461a;

            public a(bud0.AbstractC0185a abstractC0185a) {
                this.f9461a = abstractC0185a;
            }

            @Override // p003l.d30
            public void call() {
                C0682b.this.f9459a.unsubscribe();
                this.f9461a.unsubscribe();
            }
        }

        public C0682b(z3g0 z3g0Var) {
            this.f9459a = z3g0Var;
        }

        @Override // p003l.d30
        public void call() {
            bud0.AbstractC0185a abstractC0185aCreateWorker = zw50.this.f9456a.createWorker();
            abstractC0185aCreateWorker.mo2914b(new a(abstractC0185aCreateWorker));
        }
    }

    public zw50(bud0 bud0Var) {
        this.f9456a = bud0Var;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        C0681a c0681a = new C0681a(z3g0Var);
        z3g0Var.m9240b(h4g0.m4914a(new C0682b(c0681a)));
        return c0681a;
    }
}
