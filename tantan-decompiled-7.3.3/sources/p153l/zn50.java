package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class zn50<T> implements C22421c.a<T> {

    /* JADX INFO: renamed from: a */
    public final pcj<? extends C22421c<? extends T>> f205180a;

    public zn50(pcj<? extends C22421c<? extends T>> pcjVar) {
        this.f205180a = pcjVar;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super T> gcg0Var) {
        try {
            this.f205180a.call().unsafeSubscribe(icg0.m139436c(gcg0Var));
        } catch (Throwable th) {
            j6f.m143664f(th, gcg0Var);
        }
    }
}
