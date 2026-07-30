package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class f560<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final f2e0 f97194a;

    /* JADX INFO: renamed from: l.f560$a */
    public class C16899a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ gcg0 f97195e;

        public C16899a(gcg0 gcg0Var) {
            this.f97195e = gcg0Var;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f97195e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f97195e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f97195e.onNext(t);
        }
    }

    /* JADX INFO: renamed from: l.f560$b */
    public class C16900b implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gcg0 f97197a;

        /* JADX INFO: renamed from: l.f560$b$a */
        public class a implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ f2e0.AbstractC16877a f97199a;

            public a(f2e0.AbstractC16877a abstractC16877a) {
                this.f97199a = abstractC16877a;
            }

            @Override // p153l.x20
            public void call() {
                C16900b.this.f97197a.unsubscribe();
                this.f97199a.unsubscribe();
            }
        }

        public C16900b(gcg0 gcg0Var) {
            this.f97197a = gcg0Var;
        }

        @Override // p153l.x20
        public void call() {
            f2e0.AbstractC16877a abstractC16877aCreateWorker = f560.this.f97194a.createWorker();
            abstractC16877aCreateWorker.mo102836b(new a(abstractC16877aCreateWorker));
        }
    }

    public f560(f2e0 f2e0Var) {
        this.f97194a = f2e0Var;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        C16899a c16899a = new C16899a(gcg0Var);
        gcg0Var.m129866b(pcg0.m171648a(new C16900b(c16899a)));
        return c16899a;
    }
}
