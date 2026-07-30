package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class jg50<T> implements C1099c.a<T> {

    /* JADX INFO: renamed from: a */
    public final Throwable f4638a;

    public jg50(Throwable th) {
        this.f4638a = th;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        z3g0Var.onError(this.f4638a);
    }
}
