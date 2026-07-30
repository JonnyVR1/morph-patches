package p014rx.internal.producers;

import java.util.concurrent.atomic.AtomicBoolean;
import l.ig3;
import p003l.f5f;
import p003l.rc90;
import p003l.z3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class SingleProducer<T> extends AtomicBoolean implements rc90 {
    private static final long serialVersionUID = -3353584923995471404L;
    final z3g0<? super T> child;
    final T value;

    public SingleProducer(z3g0<? super T> z3g0Var, T t) {
        this.child = z3g0Var;
        this.value = t;
    }

    @Override // p003l.rc90
    public void request(long j) {
        if (j < 0) {
            ig3.a("n >= 0 required");
            return;
        }
        if (j != 0 && compareAndSet(false, true)) {
            z3g0<? super T> z3g0Var = this.child;
            if (z3g0Var.isUnsubscribed()) {
                return;
            }
            T t = this.value;
            try {
                z3g0Var.onNext(t);
                if (z3g0Var.isUnsubscribed()) {
                    return;
                }
                z3g0Var.onCompleted();
            } catch (Throwable th) {
                f5f.m3966g(th, z3g0Var, t);
            }
        }
    }
}
