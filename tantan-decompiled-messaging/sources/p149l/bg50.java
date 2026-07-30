package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class bg50<T, R> implements C22306c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C22306c.a<T> f75406a;

    /* JADX INFO: renamed from: b */
    public final C22306c.c<? extends R, ? super T> f75407b;

    public bg50(C22306c.a<T> aVar, C22306c.c<? extends R, ? super T> cVar) {
        this.f75406a = aVar;
        this.f75407b = cVar;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super R> z3g0Var) {
        try {
            z3g0<? super T> z3g0VarCall = ejd0.m116797n(this.f75407b).call(z3g0Var);
            try {
                z3g0VarCall.mo99382d();
                this.f75406a.call(z3g0VarCall);
            } catch (Throwable th) {
                f5f.m119491e(th);
                z3g0VarCall.onError(th);
            }
        } catch (Throwable th2) {
            f5f.m119491e(th2);
            z3g0Var.onError(th2);
        }
    }
}
