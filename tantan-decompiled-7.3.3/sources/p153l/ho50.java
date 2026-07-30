package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class ho50<T, R> implements C22421c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C22421c.a<T> f110869a;

    /* JADX INFO: renamed from: b */
    public final C22421c.c<? extends R, ? super T> f110870b;

    public ho50(C22421c.a<T> aVar, C22421c.c<? extends R, ? super T> cVar) {
        this.f110869a = aVar;
        this.f110870b = cVar;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super R> gcg0Var) {
        try {
            gcg0<? super T> gcg0VarCall = hrd0.m136796n(this.f110870b).call(gcg0Var);
            try {
                gcg0VarCall.mo95884d();
                this.f110869a.call(gcg0VarCall);
            } catch (Throwable th) {
                j6f.m143663e(th);
                gcg0VarCall.onError(th);
            }
        } catch (Throwable th2) {
            j6f.m143663e(th2);
            gcg0Var.onError(th2);
        }
    }
}
