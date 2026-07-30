package p014rx.internal.producers;

import java.util.concurrent.atomic.AtomicInteger;
import l.ig3;
import p003l.f5f;
import p003l.rc90;
import p003l.z3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class SingleDelayedProducer<T> extends AtomicInteger implements rc90 {
    static final int HAS_REQUEST_HAS_VALUE = 3;
    static final int HAS_REQUEST_NO_VALUE = 2;
    static final int NO_REQUEST_HAS_VALUE = 1;
    static final int NO_REQUEST_NO_VALUE = 0;
    private static final long serialVersionUID = -2873467947112093874L;
    final z3g0<? super T> child;
    T value;

    public SingleDelayedProducer(z3g0<? super T> z3g0Var) {
        this.child = z3g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void emit(z3g0<? super T> z3g0Var, T t) {
        if (z3g0Var.isUnsubscribed()) {
            return;
        }
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

    @Override // p003l.rc90
    public void request(long j) {
        if (j < 0) {
            ig3.a("n >= 0 required");
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
