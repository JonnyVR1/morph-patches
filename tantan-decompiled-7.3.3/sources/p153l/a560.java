package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class a560<T> implements C22421c.c<k0j0<T>, T> {

    /* JADX INFO: renamed from: a */
    public final f2e0 f68508a;

    /* JADX INFO: renamed from: l.a560$a */
    public class C15648a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ gcg0 f68509e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15648a(gcg0 gcg0Var, gcg0 gcg0Var2) {
            super(gcg0Var);
            this.f68509e = gcg0Var2;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f68509e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f68509e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f68509e.onNext(new k0j0(a560.this.f68508a.now(), t));
        }
    }

    public a560(f2e0 f2e0Var) {
        this.f68508a = f2e0Var;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super k0j0<T>> gcg0Var) {
        return new C15648a(gcg0Var, gcg0Var);
    }
}
