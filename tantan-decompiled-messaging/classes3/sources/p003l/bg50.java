package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class bg50<T, R> implements C1099c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C1099c.a<T> f2389a;

    /* JADX INFO: renamed from: b */
    public final C1099c.c<? extends R, ? super T> f2390b;

    public bg50(C1099c.a<T> aVar, C1099c.c<? extends R, ? super T> cVar) {
        this.f2389a = aVar;
        this.f2390b = cVar;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super R> z3g0Var) {
        try {
            z3g0<? super T> z3g0VarCall = ejd0.m3868n(this.f2390b).call(z3g0Var);
            try {
                z3g0VarCall.mo2918d();
                this.f2389a.call(z3g0VarCall);
            } catch (Throwable th) {
                f5f.m3964e(th);
                z3g0VarCall.onError(th);
            }
        } catch (Throwable th2) {
            f5f.m3964e(th2);
            z3g0Var.onError(th2);
        }
    }
}
