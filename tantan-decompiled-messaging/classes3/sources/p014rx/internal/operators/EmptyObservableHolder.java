package p014rx.internal.operators;

import p003l.z3g0;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public enum EmptyObservableHolder implements C1099c.a<Object> {
    INSTANCE;

    static final C1099c<Object> EMPTY = C1099c.create(INSTANCE);

    public static <T> C1099c<T> instance() {
        return (C1099c<T>) EMPTY;
    }

    @Override // p003l.e30
    public void call(z3g0<? super Object> z3g0Var) {
        z3g0Var.onCompleted();
    }
}
