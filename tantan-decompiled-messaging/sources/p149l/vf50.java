package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class vf50<T, U> implements C22306c.a<T> {

    /* JADX INFO: renamed from: a */
    public final C22306c<? extends T> f181243a;

    /* JADX INFO: renamed from: b */
    public final C22306c<U> f181244b;

    /* JADX INFO: renamed from: l.vf50$a */
    public class C20628a extends z3g0<U> {

        /* JADX INFO: renamed from: e */
        public boolean f181245e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ z3g0 f181246f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ rie0 f181247g;

        public C20628a(z3g0 z3g0Var, rie0 rie0Var) {
            this.f181246f = z3g0Var;
            this.f181247g = rie0Var;
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f181245e) {
                return;
            }
            this.f181245e = true;
            this.f181247g.m179504b(h4g0.m129243d());
            vf50.this.f181243a.unsafeSubscribe(this.f181246f);
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            if (this.f181245e) {
                ejd0.m116793j(th);
            } else {
                this.f181245e = true;
                this.f181246f.onError(th);
            }
        }

        @Override // p149l.m250
        public void onNext(U u) {
            onCompleted();
        }
    }

    public vf50(C22306c<? extends T> c22306c, C22306c<U> c22306c2) {
        this.f181243a = c22306c;
        this.f181244b = c22306c2;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        rie0 rie0Var = new rie0();
        z3g0Var.m217046b(rie0Var);
        C20628a c20628a = new C20628a(a4g0.m94919c(z3g0Var), rie0Var);
        rie0Var.m179504b(c20628a);
        this.f181244b.unsafeSubscribe(c20628a);
    }
}
