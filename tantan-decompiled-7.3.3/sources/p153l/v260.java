package p153l;

import p137rx.C22421c;
import p137rx.internal.producers.SingleDelayedProducer;

/* JADX INFO: loaded from: classes3.dex */
public final class v260<T> implements C22421c.c<Boolean, T> {

    /* JADX INFO: renamed from: a */
    public final qcj<? super T, Boolean> f182070a;

    /* JADX INFO: renamed from: b */
    public final boolean f182071b;

    /* JADX INFO: renamed from: l.v260$a */
    public class C20724a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f182072e;

        /* JADX INFO: renamed from: f */
        public boolean f182073f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ SingleDelayedProducer f182074g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ gcg0 f182075h;

        public C20724a(SingleDelayedProducer singleDelayedProducer, gcg0 gcg0Var) {
            this.f182074g = singleDelayedProducer;
            this.f182075h = gcg0Var;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f182073f) {
                return;
            }
            this.f182073f = true;
            boolean z = this.f182072e;
            SingleDelayedProducer singleDelayedProducer = this.f182074g;
            if (z) {
                singleDelayedProducer.setValue(Boolean.FALSE);
            } else {
                singleDelayedProducer.setValue(Boolean.valueOf(v260.this.f182071b));
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f182075h.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f182072e = true;
            try {
                if (!v260.this.f182070a.call(t).booleanValue() || this.f182073f) {
                    return;
                }
                this.f182073f = true;
                this.f182074g.setValue(Boolean.valueOf(true ^ v260.this.f182071b));
                unsubscribe();
            } catch (Throwable th) {
                j6f.m143665g(th, this, t);
            }
        }
    }

    public v260(qcj<? super T, Boolean> qcjVar, boolean z) {
        this.f182070a = qcjVar;
        this.f182071b = z;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super Boolean> gcg0Var) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(gcg0Var);
        C20724a c20724a = new C20724a(singleDelayedProducer, gcg0Var);
        gcg0Var.m129866b(c20724a);
        gcg0Var.mo95773f(singleDelayedProducer);
        return c20724a;
    }
}
