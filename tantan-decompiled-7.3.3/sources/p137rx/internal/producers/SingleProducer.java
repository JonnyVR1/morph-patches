package p137rx.internal.producers;

import java.util.concurrent.atomic.AtomicBoolean;
import p153l.gcg0;
import p153l.j6f;
import p153l.vk90;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleProducer<T> extends AtomicBoolean implements vk90 {
    private static final long serialVersionUID = -3353584923995471404L;
    final gcg0<? super T> child;
    final T value;

    public SingleProducer(gcg0<? super T> gcg0Var, T t) {
        this.child = gcg0Var;
        this.value = t;
    }

    @Override // p153l.vk90
    public void request(long j) {
        if (j < 0) {
            wg3.m206174a("n >= 0 required");
            return;
        }
        if (j != 0 && compareAndSet(false, true)) {
            gcg0<? super T> gcg0Var = this.child;
            if (gcg0Var.isUnsubscribed()) {
                return;
            }
            T t = this.value;
            try {
                gcg0Var.onNext(t);
                if (gcg0Var.isUnsubscribed()) {
                    return;
                }
                gcg0Var.onCompleted();
            } catch (Throwable th) {
                j6f.m143665g(th, gcg0Var, t);
            }
        }
    }
}
