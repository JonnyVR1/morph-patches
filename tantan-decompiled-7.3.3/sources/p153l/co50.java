package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class co50<T, U> implements C22421c.a<T> {

    /* JADX INFO: renamed from: a */
    public final C22421c<? extends T> f82810a;

    /* JADX INFO: renamed from: b */
    public final pcj<? extends C22421c<U>> f82811b;

    public co50(C22421c<? extends T> c22421c, pcj<? extends C22421c<U>> pcjVar) {
        this.f82810a = c22421c;
        this.f82811b = pcjVar;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super T> gcg0Var) {
        try {
            this.f82811b.call().take(1).unsafeSubscribe(new C16323a(gcg0Var));
        } catch (Throwable th) {
            j6f.m143664f(th, gcg0Var);
        }
    }

    /* JADX INFO: renamed from: l.co50$a */
    public class C16323a extends gcg0<U> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ gcg0 f82812e;

        public C16323a(gcg0 gcg0Var) {
            this.f82812e = gcg0Var;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            co50.this.f82810a.unsafeSubscribe(icg0.m139436c(this.f82812e));
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f82812e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(U u) {
        }
    }
}
