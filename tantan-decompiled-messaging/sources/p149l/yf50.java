package p149l;

import java.util.concurrent.Callable;
import p133rx.C22306c;
import p133rx.internal.producers.SingleDelayedProducer;

/* JADX INFO: loaded from: classes3.dex */
public final class yf50<T> implements C22306c.a<T> {

    /* JADX INFO: renamed from: a */
    public final Callable<? extends T> f197986a;

    public yf50(Callable<? extends T> callable) {
        this.f197986a = callable;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(z3g0Var);
        z3g0Var.mo106696f(singleDelayedProducer);
        try {
            singleDelayedProducer.setValue(this.f197986a.call());
        } catch (Throwable th) {
            f5f.m119492f(th, z3g0Var);
        }
    }
}
