package p137rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p137rx.C22420b;
import p153l.kcg0;
import p153l.wqe0;

/* JADX INFO: loaded from: classes3.dex */
final class CompletableOnSubscribeConcatIterable$ConcatInnerSubscriber extends AtomicInteger implements C22420b.j {
    private static final long serialVersionUID = -7965400327305809232L;
    final C22420b.j actual;
    int index;

    /* JADX INFO: renamed from: sd */
    final wqe0 f208060sd = new wqe0();
    final Iterator<? extends C22420b> sources;

    public CompletableOnSubscribeConcatIterable$ConcatInnerSubscriber(C22420b.j jVar, Iterator<? extends C22420b> it) {
        this.actual = jVar;
        this.sources = it;
    }

    public void next() {
        if (!this.f208060sd.isUnsubscribed() && getAndIncrement() == 0) {
            Iterator<? extends C22420b> it = this.sources;
            while (!this.f208060sd.isUnsubscribed()) {
                try {
                    if (!it.hasNext()) {
                        this.actual.onCompleted();
                        return;
                    }
                    try {
                        C22420b next = it.next();
                        if (next == null) {
                            this.actual.onError(new NullPointerException("The completable returned is null"));
                            return;
                        } else {
                            next.m222561n(this);
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

    @Override // p137rx.C22420b.j
    public void onCompleted() {
        next();
    }

    @Override // p137rx.C22420b.j
    public void onError(Throwable th) {
        this.actual.onError(th);
    }

    @Override // p137rx.C22420b.j
    public void onSubscribe(kcg0 kcg0Var) {
        this.f208060sd.m207511b(kcg0Var);
    }
}
