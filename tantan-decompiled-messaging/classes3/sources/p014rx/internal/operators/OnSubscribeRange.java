package p014rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import p003l.kc2;
import p003l.rc90;
import p003l.z3g0;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class OnSubscribeRange implements C1099c.a<Integer> {

    /* JADX INFO: renamed from: a */
    public final int f10791a;

    /* JADX INFO: renamed from: b */
    public final int f10792b;

    public static final class RangeProducer extends AtomicLong implements rc90 {
        private static final long serialVersionUID = 4114392207069098388L;
        private final z3g0<? super Integer> childSubscriber;
        private long currentIndex;
        private final int endOfRange;

        public RangeProducer(z3g0<? super Integer> z3g0Var, int i, int i2) {
            this.childSubscriber = z3g0Var;
            this.currentIndex = i;
            this.endOfRange = i2;
        }

        public void fastpath() {
            long j = ((long) this.endOfRange) + 1;
            z3g0<? super Integer> z3g0Var = this.childSubscriber;
            for (long j2 = this.currentIndex; j2 != j; j2++) {
                if (z3g0Var.isUnsubscribed()) {
                    return;
                }
                z3g0Var.onNext(Integer.valueOf((int) j2));
            }
            if (z3g0Var.isUnsubscribed()) {
                return;
            }
            z3g0Var.onCompleted();
        }

        @Override // p003l.rc90
        public void request(long j) {
            if (get() == Long.MAX_VALUE) {
                return;
            }
            if (j == Long.MAX_VALUE && compareAndSet(0L, Long.MAX_VALUE)) {
                fastpath();
            } else {
                if (j <= 0 || kc2.m5640b(this, j) != 0) {
                    return;
                }
                slowpath(j);
            }
        }

        public void slowpath(long j) {
            long j2 = ((long) this.endOfRange) + 1;
            long j3 = this.currentIndex;
            z3g0<? super Integer> z3g0Var = this.childSubscriber;
            do {
                long j4 = 0;
                while (true) {
                    if (j4 == j || j3 == j2) {
                        if (z3g0Var.isUnsubscribed()) {
                            return;
                        }
                        if (j3 == j2) {
                            z3g0Var.onCompleted();
                            return;
                        } else {
                            j = get();
                            if (j == j4) {
                                break;
                            }
                        }
                    } else {
                        if (z3g0Var.isUnsubscribed()) {
                            return;
                        }
                        z3g0Var.onNext(Integer.valueOf((int) j3));
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
        this.f10791a = i;
        this.f10792b = i2;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super Integer> z3g0Var) {
        z3g0Var.mo3257f(new RangeProducer(z3g0Var, this.f10791a, this.f10792b));
    }
}
