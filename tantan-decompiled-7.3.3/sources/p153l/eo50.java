package p153l;

import java.util.concurrent.Callable;
import p137rx.C22421c;
import p137rx.internal.producers.SingleDelayedProducer;

/* JADX INFO: loaded from: classes3.dex */
public final class eo50<T> implements C22421c.a<T> {

    /* JADX INFO: renamed from: a */
    public final Callable<? extends T> f94871a;

    public eo50(Callable<? extends T> callable) {
        this.f94871a = callable;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super T> gcg0Var) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(gcg0Var);
        gcg0Var.mo95773f(singleDelayedProducer);
        try {
            singleDelayedProducer.setValue(this.f94871a.call());
        } catch (Throwable th) {
            j6f.m143664f(th, gcg0Var);
        }
    }
}
