package p133rx.internal.operators;

import p133rx.C22306c;
import p149l.z3g0;

/* JADX INFO: loaded from: classes3.dex */
public enum EmptyObservableHolder implements C22306c.a<Object> {
    INSTANCE;

    static final C22306c<Object> EMPTY = C22306c.create(INSTANCE);

    public static <T> C22306c<T> instance() {
        return (C22306c<T>) EMPTY;
    }

    @Override // p149l.e30
    public void call(z3g0<? super Object> z3g0Var) {
        z3g0Var.onCompleted();
    }
}
