package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class rf50<T, R> implements C22306c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C22306c<T> f159104a;

    /* JADX INFO: renamed from: b */
    public final v9j<R> f159105b;

    /* JADX INFO: renamed from: c */
    public final f30<R, ? super T> f159106c;

    /* JADX INFO: renamed from: l.rf50$a */
    public static final class C19690a<T, R> extends msd<T, R> {

        /* JADX INFO: renamed from: i */
        public final f30<R, ? super T> f159107i;

        public C19690a(z3g0<? super R> z3g0Var, R r, f30<R, ? super T> f30Var) {
            super(z3g0Var);
            this.f135466g = r;
            this.f135465f = true;
            this.f159107i = f30Var;
        }

        @Override // p149l.m250
        public void onNext(T t) {
            try {
                this.f159107i.call(this.f135466g, t);
            } catch (Throwable th) {
                f5f.m119491e(th);
                unsubscribe();
                this.f135464e.onError(th);
            }
        }
    }

    public rf50(C22306c<T> c22306c, v9j<R> v9jVar, f30<R, ? super T> f30Var) {
        this.f159104a = c22306c;
        this.f159105b = v9jVar;
        this.f159106c = f30Var;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super R> z3g0Var) {
        try {
            new C19690a(z3g0Var, this.f159105b.call(), this.f159106c).m156127k(this.f159104a);
        } catch (Throwable th) {
            f5f.m119491e(th);
            z3g0Var.onError(th);
        }
    }
}
