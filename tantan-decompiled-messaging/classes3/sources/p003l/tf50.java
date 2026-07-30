package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class tf50<T> implements C1099c.a<T> {

    /* JADX INFO: renamed from: a */
    public final v9j<? extends C1099c<? extends T>> f7460a;

    public tf50(v9j<? extends C1099c<? extends T>> v9jVar) {
        this.f7460a = v9jVar;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        try {
            this.f7460a.call().unsafeSubscribe(a4g0.m2743c(z3g0Var));
        } catch (Throwable th) {
            f5f.m3965f(th, z3g0Var);
        }
    }
}
