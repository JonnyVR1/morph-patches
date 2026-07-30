package p003l;

import java.util.concurrent.Callable;
import p014rx.C1099c;
import p014rx.internal.producers.SingleDelayedProducer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class yf50<T> implements C1099c.a<T> {

    /* JADX INFO: renamed from: a */
    public final Callable<? extends T> f9065a;

    public yf50(Callable<? extends T> callable) {
        this.f9065a = callable;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(z3g0Var);
        z3g0Var.mo3257f(singleDelayedProducer);
        try {
            singleDelayedProducer.setValue(this.f9065a.call());
        } catch (Throwable th) {
            f5f.m3965f(th, z3g0Var);
        }
    }
}
