package p153l;

import p137rx.C22421c;
import p137rx.internal.producers.SingleDelayedProducer;

/* JADX INFO: loaded from: classes3.dex */
public final class u260<T> implements C22421c.c<Boolean, T> {

    /* JADX INFO: renamed from: a */
    public final qcj<? super T, Boolean> f177181a;

    /* JADX INFO: renamed from: l.u260$a */
    public class C20468a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f177182e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ SingleDelayedProducer f177183f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ gcg0 f177184g;

        public C20468a(SingleDelayedProducer singleDelayedProducer, gcg0 gcg0Var) {
            this.f177183f = singleDelayedProducer;
            this.f177184g = gcg0Var;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f177182e) {
                return;
            }
            this.f177182e = true;
            this.f177183f.setValue(Boolean.TRUE);
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f177184g.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            try {
                if (u260.this.f177181a.call(t).booleanValue() || this.f177182e) {
                    return;
                }
                this.f177182e = true;
                this.f177183f.setValue(Boolean.FALSE);
                unsubscribe();
            } catch (Throwable th) {
                j6f.m143665g(th, this, t);
            }
        }
    }

    public u260(qcj<? super T, Boolean> qcjVar) {
        this.f177181a = qcjVar;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super Boolean> gcg0Var) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(gcg0Var);
        C20468a c20468a = new C20468a(singleDelayedProducer, gcg0Var);
        gcg0Var.m129866b(c20468a);
        gcg0Var.mo95773f(singleDelayedProducer);
        return c20468a;
    }
}
