package p133rx.internal.producers;

import java.util.concurrent.atomic.AtomicBoolean;
import p149l.f5f;
import p149l.ig3;
import p149l.rc90;
import p149l.z3g0;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleProducer<T> extends AtomicBoolean implements rc90 {
    private static final long serialVersionUID = -3353584923995471404L;
    final z3g0<? super T> child;
    final T value;

    public SingleProducer(z3g0<? super T> z3g0Var, T t) {
        this.child = z3g0Var;
        this.value = t;
    }

    @Override // p149l.rc90
    public void request(long j) {
        if (j < 0) {
            ig3.m135964a("n >= 0 required");
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
                f5f.m119493g(th, z3g0Var, t);
            }
        }
    }
}
