package p137rx.internal.producers;

import java.util.concurrent.atomic.AtomicInteger;
import p153l.gcg0;
import p153l.j6f;
import p153l.vk90;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleDelayedProducer<T> extends AtomicInteger implements vk90 {
    static final int HAS_REQUEST_HAS_VALUE = 3;
    static final int HAS_REQUEST_NO_VALUE = 2;
    static final int NO_REQUEST_HAS_VALUE = 1;
    static final int NO_REQUEST_NO_VALUE = 0;
    private static final long serialVersionUID = -2873467947112093874L;
    final gcg0<? super T> child;
    T value;

    public SingleDelayedProducer(gcg0<? super T> gcg0Var) {
        this.child = gcg0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void emit(gcg0<? super T> gcg0Var, T t) {
        if (gcg0Var.isUnsubscribed()) {
            return;
        }
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

    @Override // p153l.vk90
    public void request(long j) {
        if (j < 0) {
            wg3.m206174a("n >= 0 required");
            return;
        }
        if (j == 0) {
            return;
        }
        do {
            int i = get();
            if (i != 0) {
                if (i == 1 && compareAndSet(1, 3)) {
                    emit(this.child, this.value);
                    return;
                }
                return;
            }
        } while (!compareAndSet(0, 2));
    }

    public void setValue(T t) {
        do {
            int i = get();
            if (i != 0) {
                if (i == 2 && compareAndSet(2, 3)) {
                    emit(this.child, t);
                    return;
                }
                return;
            }
            this.value = t;
        } while (!compareAndSet(0, 1));
    }
}
