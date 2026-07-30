package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class bo50<T, U> implements C22421c.a<T> {

    /* JADX INFO: renamed from: a */
    public final C22421c<? extends T> f77613a;

    /* JADX INFO: renamed from: b */
    public final C22421c<U> f77614b;

    /* JADX INFO: renamed from: l.bo50$a */
    public class C16070a extends gcg0<U> {

        /* JADX INFO: renamed from: e */
        public boolean f77615e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ gcg0 f77616f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ wqe0 f77617g;

        public C16070a(gcg0 gcg0Var, wqe0 wqe0Var) {
            this.f77616f = gcg0Var;
            this.f77617g = wqe0Var;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f77615e) {
                return;
            }
            this.f77615e = true;
            this.f77617g.m207511b(pcg0.m171651d());
            bo50.this.f77613a.unsafeSubscribe(this.f77616f);
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (this.f77615e) {
                hrd0.m136792j(th);
            } else {
                this.f77615e = true;
                this.f77616f.onError(th);
            }
        }

        @Override // p153l.bb50
        public void onNext(U u) {
            onCompleted();
        }
    }

    public bo50(C22421c<? extends T> c22421c, C22421c<U> c22421c2) {
        this.f77613a = c22421c;
        this.f77614b = c22421c2;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super T> gcg0Var) {
        wqe0 wqe0Var = new wqe0();
        gcg0Var.m129866b(wqe0Var);
        C16070a c16070a = new C16070a(icg0.m139436c(gcg0Var), wqe0Var);
        wqe0Var.m207511b(c16070a);
        this.f77614b.unsafeSubscribe(c16070a);
    }
}
