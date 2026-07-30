package p133rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import p133rx.C22305b;
import p149l.c4g0;
import p149l.rie0;

/* JADX INFO: loaded from: classes3.dex */
final class CompletableOnSubscribeConcatArray$ConcatInnerSubscriber extends AtomicInteger implements C22305b.j {
    private static final long serialVersionUID = -7965400327305809232L;
    final C22305b.j actual;
    int index;

    /* JADX INFO: renamed from: sd */
    final rie0 f207137sd = new rie0();
    final C22305b[] sources;

    public CompletableOnSubscribeConcatArray$ConcatInnerSubscriber(C22305b.j jVar, C22305b[] c22305bArr) {
        this.actual = jVar;
        this.sources = c22305bArr;
    }

    public void next() {
        if (!this.f207137sd.isUnsubscribed() && getAndIncrement() == 0) {
            C22305b[] c22305bArr = this.sources;
            while (!this.f207137sd.isUnsubscribed()) {
                int i = this.index;
                this.index = i + 1;
                if (i == c22305bArr.length) {
                    this.actual.onCompleted();
                    return;
                } else {
                    c22305bArr[i].m221315n(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
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
        this.f207137sd.m179504b(c4g0Var);
    }
}
