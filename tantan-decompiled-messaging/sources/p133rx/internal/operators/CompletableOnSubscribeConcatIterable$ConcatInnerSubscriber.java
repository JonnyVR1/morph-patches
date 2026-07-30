package p133rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p133rx.C22305b;
import p149l.c4g0;
import p149l.rie0;

/* JADX INFO: loaded from: classes3.dex */
final class CompletableOnSubscribeConcatIterable$ConcatInnerSubscriber extends AtomicInteger implements C22305b.j {
    private static final long serialVersionUID = -7965400327305809232L;
    final C22305b.j actual;
    int index;

    /* JADX INFO: renamed from: sd */
    final rie0 f207138sd = new rie0();
    final Iterator<? extends C22305b> sources;

    public CompletableOnSubscribeConcatIterable$ConcatInnerSubscriber(C22305b.j jVar, Iterator<? extends C22305b> it) {
        this.actual = jVar;
        this.sources = it;
    }

    public void next() {
        if (!this.f207138sd.isUnsubscribed() && getAndIncrement() == 0) {
            Iterator<? extends C22305b> it = this.sources;
            while (!this.f207138sd.isUnsubscribed()) {
                try {
                    if (!it.hasNext()) {
                        this.actual.onCompleted();
                        return;
                    }
                    try {
                        C22305b next = it.next();
                        if (next == null) {
                            this.actual.onError(new NullPointerException("The completable returned is null"));
                            return;
                        } else {
                            next.m221315n(this);
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

    @Override // p133rx.C22305b.j
    public void onCompleted() {
        next();
    }

    @Override // p133rx.C22305b.j
    public void onError(Throwable th) {
        this.actual.onError(th);
    }

    @Override // p133rx.C22305b.j
    public void onSubscribe(c4g0 c4g0Var) {
        this.f207138sd.m179504b(c4g0Var);
    }
}
