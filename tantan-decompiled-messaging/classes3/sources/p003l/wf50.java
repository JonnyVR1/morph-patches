package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class wf50<T, U> implements C1099c.a<T> {

    /* JADX INFO: renamed from: a */
    public final C1099c<? extends T> f8539a;

    /* JADX INFO: renamed from: b */
    public final v9j<? extends C1099c<U>> f8540b;

    public wf50(C1099c<? extends T> c1099c, v9j<? extends C1099c<U>> v9jVar) {
        this.f8539a = c1099c;
        this.f8540b = v9jVar;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        try {
            this.f8540b.call().take(1).unsafeSubscribe(new C0616a(z3g0Var));
        } catch (Throwable th) {
            f5f.m3965f(th, z3g0Var);
        }
    }

    /* JADX INFO: renamed from: l.wf50$a */
    public class C0616a extends z3g0<U> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f8541e;

        public C0616a(z3g0 z3g0Var) {
            this.f8541e = z3g0Var;
        }

        @Override // p003l.m250
        public void onCompleted() {
            wf50.this.f8539a.unsafeSubscribe(a4g0.m2743c(this.f8541e));
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f8541e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(U u) {
        }
    }
}
