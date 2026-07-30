package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class jg50<T> implements C22306c.a<T> {

    /* JADX INFO: renamed from: a */
    public final Throwable f117725a;

    public jg50(Throwable th) {
        this.f117725a = th;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        z3g0Var.onError(this.f117725a);
    }
}
