package p137rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import p137rx.C22421c;
import p153l.gcg0;
import p153l.rc2;
import p153l.vk90;

/* JADX INFO: loaded from: classes3.dex */
public final class OnSubscribeRange implements C22421c.a<Integer> {

    /* JADX INFO: renamed from: a */
    public final int f208088a;

    /* JADX INFO: renamed from: b */
    public final int f208089b;

    public static final class RangeProducer extends AtomicLong implements vk90 {
        private static final long serialVersionUID = 4114392207069098388L;
        private final gcg0<? super Integer> childSubscriber;
        private long currentIndex;
        private final int endOfRange;

        public RangeProducer(gcg0<? super Integer> gcg0Var, int i, int i2) {
            this.childSubscriber = gcg0Var;
            this.currentIndex = i;
            this.endOfRange = i2;
        }

        public void fastpath() {
            long j = ((long) this.endOfRange) + 1;
            gcg0<? super Integer> gcg0Var = this.childSubscriber;
            for (long j2 = this.currentIndex; j2 != j; j2++) {
                if (gcg0Var.isUnsubscribed()) {
                    return;
                }
                gcg0Var.onNext(Integer.valueOf((int) j2));
            }
            if (gcg0Var.isUnsubscribed()) {
                return;
            }
            gcg0Var.onCompleted();
        }

        @Override // p153l.vk90
        public void request(long j) {
            if (get() == Long.MAX_VALUE) {
                return;
            }
            if (j == Long.MAX_VALUE && compareAndSet(0L, Long.MAX_VALUE)) {
                fastpath();
            } else {
                if (j <= 0 || rc2.m180770b(this, j) != 0) {
                    return;
                }
                slowpath(j);
            }
        }

        public void slowpath(long j) {
            long j2 = ((long) this.endOfRange) + 1;
            long j3 = this.currentIndex;
            gcg0<? super Integer> gcg0Var = this.childSubscriber;
            do {
                long j4 = 0;
                while (true) {
                    if (j4 == j || j3 == j2) {
                        if (gcg0Var.isUnsubscribed()) {
                            return;
                        }
                        if (j3 == j2) {
                            gcg0Var.onCompleted();
                            return;
                        } else {
                            j = get();
                            if (j == j4) {
                                break;
                            }
                        }
                    } else {
                        if (gcg0Var.isUnsubscribed()) {
                            return;
                        }
                        gcg0Var.onNext(Integer.valueOf((int) j3));
                        j3++;
                        j4++;
                    }
                }
                this.currentIndex = j3;
                j = addAndGet(-j4);
            } while (j != 0);
        }
    }

    public OnSubscribeRange(int i, int i2) {
        this.f208088a = i;
        this.f208089b = i2;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super Integer> gcg0Var) {
        gcg0Var.mo95773f(new RangeProducer(gcg0Var, this.f208088a, this.f208089b));
    }
}
