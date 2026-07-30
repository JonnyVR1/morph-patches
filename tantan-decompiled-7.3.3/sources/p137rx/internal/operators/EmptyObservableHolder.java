package p137rx.internal.operators;

import p137rx.C22421c;
import p153l.gcg0;

/* JADX INFO: loaded from: classes3.dex */
public enum EmptyObservableHolder implements C22421c.a<Object> {
    INSTANCE;

    static final C22421c<Object> EMPTY = C22421c.create(INSTANCE);

    public static <T> C22421c<T> instance() {
        return (C22421c<T>) EMPTY;
    }

    @Override // p153l.y20
    public void call(gcg0<? super Object> gcg0Var) {
        gcg0Var.onCompleted();
    }
}
