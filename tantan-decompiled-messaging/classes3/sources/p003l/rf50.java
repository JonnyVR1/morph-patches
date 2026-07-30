package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class rf50<T, R> implements C1099c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C1099c<T> f6898a;

    /* JADX INFO: renamed from: b */
    public final v9j<R> f6899b;

    /* JADX INFO: renamed from: c */
    public final f30<R, ? super T> f6900c;

    /* JADX INFO: renamed from: l.rf50$a */
    public static final class C0503a<T, R> extends msd<T, R> {

        /* JADX INFO: renamed from: i */
        public final f30<R, ? super T> f6901i;

        public C0503a(z3g0<? super R> z3g0Var, R r, f30<R, ? super T> f30Var) {
            super(z3g0Var);
            this.f5753g = r;
            this.f5752f = true;
            this.f6901i = f30Var;
        }

        @Override // p003l.m250
        public void onNext(T t) {
            try {
                this.f6901i.call(this.f5753g, t);
            } catch (Throwable th) {
                f5f.m3964e(th);
                unsubscribe();
                this.f5751e.onError(th);
            }
        }
    }

    public rf50(C1099c<T> c1099c, v9j<R> v9jVar, f30<R, ? super T> f30Var) {
        this.f6898a = c1099c;
        this.f6899b = v9jVar;
        this.f6900c = f30Var;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super R> z3g0Var) {
        try {
            new C0503a(z3g0Var, this.f6899b.call(), this.f6900c).m6468k(this.f6898a);
        } catch (Throwable th) {
            f5f.m3964e(th);
            z3g0Var.onError(th);
        }
    }
}
