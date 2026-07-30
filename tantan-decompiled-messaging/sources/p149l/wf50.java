package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class wf50<T, U> implements C22306c.a<T> {

    /* JADX INFO: renamed from: a */
    public final C22306c<? extends T> f186013a;

    /* JADX INFO: renamed from: b */
    public final v9j<? extends C22306c<U>> f186014b;

    public wf50(C22306c<? extends T> c22306c, v9j<? extends C22306c<U>> v9jVar) {
        this.f186013a = c22306c;
        this.f186014b = v9jVar;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        try {
            this.f186014b.call().take(1).unsafeSubscribe(new C20864a(z3g0Var));
        } catch (Throwable th) {
            f5f.m119492f(th, z3g0Var);
        }
    }

    /* JADX INFO: renamed from: l.wf50$a */
    public class C20864a extends z3g0<U> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f186015e;

        public C20864a(z3g0 z3g0Var) {
            this.f186015e = z3g0Var;
        }

        @Override // p149l.m250
        public void onCompleted() {
            wf50.this.f186013a.unsafeSubscribe(a4g0.m94919c(this.f186015e));
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f186015e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(U u) {
        }
    }
}
