package p137rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import p137rx.C22420b;
import p153l.kcg0;
import p153l.wqe0;

/* JADX INFO: loaded from: classes3.dex */
final class CompletableOnSubscribeConcatArray$ConcatInnerSubscriber extends AtomicInteger implements C22420b.j {
    private static final long serialVersionUID = -7965400327305809232L;
    final C22420b.j actual;
    int index;

    /* JADX INFO: renamed from: sd */
    final wqe0 f208059sd = new wqe0();
    final C22420b[] sources;

    public CompletableOnSubscribeConcatArray$ConcatInnerSubscriber(C22420b.j jVar, C22420b[] c22420bArr) {
        this.actual = jVar;
        this.sources = c22420bArr;
    }

    public void next() {
        if (!this.f208059sd.isUnsubscribed() && getAndIncrement() == 0) {
            C22420b[] c22420bArr = this.sources;
            while (!this.f208059sd.isUnsubscribed()) {
                int i = this.index;
                this.index = i + 1;
                if (i == c22420bArr.length) {
                    this.actual.onCompleted();
                    return;
                } else {
                    c22420bArr[i].m222561n(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
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
        this.f208059sd.m207511b(kcg0Var);
    }
}
