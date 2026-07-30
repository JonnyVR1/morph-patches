package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class vf50<T, U> implements C1099c.a<T> {

    /* JADX INFO: renamed from: a */
    public final C1099c<? extends T> f8324a;

    /* JADX INFO: renamed from: b */
    public final C1099c<U> f8325b;

    /* JADX INFO: renamed from: l.vf50$a */
    public class C0598a extends z3g0<U> {

        /* JADX INFO: renamed from: e */
        public boolean f8326e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ z3g0 f8327f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ rie0 f8328g;

        public C0598a(z3g0 z3g0Var, rie0 rie0Var) {
            this.f8327f = z3g0Var;
            this.f8328g = rie0Var;
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f8326e) {
                return;
            }
            this.f8326e = true;
            this.f8328g.m7260b(h4g0.m4917d());
            vf50.this.f8324a.unsafeSubscribe(this.f8327f);
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            if (this.f8326e) {
                ejd0.m3864j(th);
            } else {
                this.f8326e = true;
                this.f8327f.onError(th);
            }
        }

        @Override // p003l.m250
        public void onNext(U u) {
            onCompleted();
        }
    }

    public vf50(C1099c<? extends T> c1099c, C1099c<U> c1099c2) {
        this.f8324a = c1099c;
        this.f8325b = c1099c2;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        rie0 rie0Var = new rie0();
        z3g0Var.m9240b(rie0Var);
        C0598a c0598a = new C0598a(a4g0.m2743c(z3g0Var), rie0Var);
        rie0Var.m7260b(c0598a);
        this.f8325b.unsafeSubscribe(c0598a);
    }
}
