package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class tf50<T> implements C22306c.a<T> {

    /* JADX INFO: renamed from: a */
    public final v9j<? extends C22306c<? extends T>> f169946a;

    public tf50(v9j<? extends C22306c<? extends T>> v9jVar) {
        this.f169946a = v9jVar;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        try {
            this.f169946a.call().unsafeSubscribe(a4g0.m94919c(z3g0Var));
        } catch (Throwable th) {
            f5f.m119492f(th, z3g0Var);
        }
    }
}
