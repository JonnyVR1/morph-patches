package p014rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p003l.c4g0;
import p003l.rie0;
import p014rx.C1098b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
final class CompletableOnSubscribeConcatIterable$ConcatInnerSubscriber extends AtomicInteger implements C1098b.j {
    private static final long serialVersionUID = -7965400327305809232L;
    final C1098b.j actual;
    int index;

    /* JADX INFO: renamed from: sd */
    final rie0 f10763sd = new rie0();
    final Iterator<? extends C1098b> sources;

    public CompletableOnSubscribeConcatIterable$ConcatInnerSubscriber(C1098b.j jVar, Iterator<? extends C1098b> it) {
        this.actual = jVar;
        this.sources = it;
    }

    public void next() {
        if (!this.f10763sd.isUnsubscribed() && getAndIncrement() == 0) {
            Iterator<? extends C1098b> it = this.sources;
            while (!this.f10763sd.isUnsubscribed()) {
                try {
                    if (!it.hasNext()) {
                        this.actual.onCompleted();
                        return;
                    }
                    try {
                        C1098b next = it.next();
                        if (next == null) {
                            this.actual.onError(new NullPointerException("The completable returned is null"));
                            return;
                        } else {
                            next.m9772n(this);
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        this.actual.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    this.actual.onError(th2);
                    return;
                }
            }
        }
    }

    @Override // p014rx.C1098b.j
    public void onCompleted() {
        next();
    }

    @Override // p014rx.C1098b.j
    public void onError(Throwable th) {
        this.actual.onError(th);
    }

    @Override // p014rx.C1098b.j
    public void onSubscribe(c4g0 c4g0Var) {
        this.f10763sd.m7260b(c4g0Var);
    }
}
