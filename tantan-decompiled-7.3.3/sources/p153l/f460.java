package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class f460<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final int f97053a;

    /* JADX INFO: renamed from: l.f460$a */
    public class C16889a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public int f97054e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ gcg0 f97055f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16889a(gcg0 gcg0Var, gcg0 gcg0Var2) {
            super(gcg0Var);
            this.f97055f = gcg0Var2;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: f */
        public void mo95773f(vk90 vk90Var) {
            this.f97055f.mo95773f(vk90Var);
            vk90Var.request(f460.this.f97053a);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f97055f.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f97055f.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            int i = this.f97054e;
            if (i >= f460.this.f97053a) {
                this.f97055f.onNext(t);
            } else {
                this.f97054e = i + 1;
            }
        }
    }

    public f460(int i) {
        if (i >= 0) {
            this.f97053a = i;
        } else {
            za50.m219101a("n >= 0 required but it was ", i);
            throw null;
        }
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        return new C16889a(gcg0Var, gcg0Var);
    }
}
