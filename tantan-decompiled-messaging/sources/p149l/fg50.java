package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class fg50<T, R> implements C22306c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C22306c<T> f97335a;

    /* JADX INFO: renamed from: b */
    public final R f97336b;

    /* JADX INFO: renamed from: c */
    public final x9j<R, ? super T, R> f97337c;

    /* JADX INFO: renamed from: l.fg50$a */
    public static final class C16818a<T, R> extends msd<T, R> {

        /* JADX INFO: renamed from: i */
        public final x9j<R, ? super T, R> f97338i;

        public C16818a(z3g0<? super R> z3g0Var, R r, x9j<R, ? super T, R> x9jVar) {
            super(z3g0Var);
            this.f135466g = r;
            this.f135465f = true;
            this.f97338i = x9jVar;
        }

        @Override // p149l.m250
        public void onNext(T t) {
            try {
                this.f135466g = this.f97338i.call(this.f135466g, t);
            } catch (Throwable th) {
                f5f.m119491e(th);
                unsubscribe();
                this.f135464e.onError(th);
            }
        }
    }

    public fg50(C22306c<T> c22306c, R r, x9j<R, ? super T, R> x9jVar) {
        this.f97335a = c22306c;
        this.f97336b = r;
        this.f97337c = x9jVar;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super R> z3g0Var) {
        new C16818a(z3g0Var, this.f97336b, this.f97337c).m156127k(this.f97335a);
    }
}
