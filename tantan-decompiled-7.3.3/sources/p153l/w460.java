package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class w460<T> implements C22421c.c<qzi0<T>, T> {

    /* JADX INFO: renamed from: a */
    public final f2e0 f187350a;

    /* JADX INFO: renamed from: l.w460$a */
    public class C21012a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public long f187351e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ gcg0 f187352f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21012a(gcg0 gcg0Var, gcg0 gcg0Var2) {
            super(gcg0Var);
            this.f187352f = gcg0Var2;
            this.f187351e = w460.this.f187350a.now();
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f187352f.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f187352f.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            long jNow = w460.this.f187350a.now();
            this.f187352f.onNext(new qzi0(jNow - this.f187351e, t));
            this.f187351e = jNow;
        }
    }

    public w460(f2e0 f2e0Var) {
        this.f187350a = f2e0Var;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super qzi0<T>> gcg0Var) {
        return new C21012a(gcg0Var, gcg0Var);
    }
}
