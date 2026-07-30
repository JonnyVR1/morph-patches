package p014rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import p003l.c4g0;
import p003l.rie0;
import p014rx.C1098b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
final class CompletableOnSubscribeConcatArray$ConcatInnerSubscriber extends AtomicInteger implements C1098b.j {
    private static final long serialVersionUID = -7965400327305809232L;
    final C1098b.j actual;
    int index;

    /* JADX INFO: renamed from: sd */
    final rie0 f10762sd = new rie0();
    final C1098b[] sources;

    public CompletableOnSubscribeConcatArray$ConcatInnerSubscriber(C1098b.j jVar, C1098b[] c1098bArr) {
        this.actual = jVar;
        this.sources = c1098bArr;
    }

    public void next() {
        if (!this.f10762sd.isUnsubscribed() && getAndIncrement() == 0) {
            C1098b[] c1098bArr = this.sources;
            while (!this.f10762sd.isUnsubscribed()) {
                int i = this.index;
                this.index = i + 1;
                if (i == c1098bArr.length) {
                    this.actual.onCompleted();
                    return;
                } else {
                    c1098bArr[i].m9772n(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
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
        this.f10762sd.m7260b(c4g0Var);
    }
}
