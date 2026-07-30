package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class fg50<T, R> implements C1099c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C1099c<T> f3601a;

    /* JADX INFO: renamed from: b */
    public final R f3602b;

    /* JADX INFO: renamed from: c */
    public final x9j<R, ? super T, R> f3603c;

    /* JADX INFO: renamed from: l.fg50$a */
    public static final class C0290a<T, R> extends msd<T, R> {

        /* JADX INFO: renamed from: i */
        public final x9j<R, ? super T, R> f3604i;

        public C0290a(z3g0<? super R> z3g0Var, R r, x9j<R, ? super T, R> x9jVar) {
            super(z3g0Var);
            this.f5753g = r;
            this.f5752f = true;
            this.f3604i = x9jVar;
        }

        @Override // p003l.m250
        public void onNext(T t) {
            try {
                this.f5753g = this.f3604i.call(this.f5753g, t);
            } catch (Throwable th) {
                f5f.m3964e(th);
                unsubscribe();
                this.f5751e.onError(th);
            }
        }
    }

    public fg50(C1099c<T> c1099c, R r, x9j<R, ? super T, R> x9jVar) {
        this.f3601a = c1099c;
        this.f3602b = r;
        this.f3603c = x9jVar;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super R> z3g0Var) {
        new C0290a(z3g0Var, this.f3602b, this.f3603c).m6468k(this.f3601a);
    }
}
