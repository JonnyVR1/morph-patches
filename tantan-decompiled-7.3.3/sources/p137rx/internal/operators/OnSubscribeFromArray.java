package p137rx.internal.operators;

import Sudchar.Sudfor;
import java.util.concurrent.atomic.AtomicLong;
import p137rx.C22421c;
import p153l.fcg0;
import p153l.gcg0;
import p153l.rc2;
import p153l.vk90;

/* JADX INFO: loaded from: classes3.dex */
public final class OnSubscribeFromArray<T> implements C22421c.a<T> {

    /* JADX INFO: renamed from: a */
    public final T[] f208078a;

    public static final class FromArrayProducer<T> extends AtomicLong implements vk90 {
        private static final long serialVersionUID = 3534218984725836979L;
        final T[] array;
        final gcg0<? super T> child;
        int index;

        public FromArrayProducer(gcg0<? super T> gcg0Var, T[] tArr) {
            this.child = gcg0Var;
            this.array = tArr;
        }

        public void fastPath() {
            gcg0<? super T> gcg0Var = this.child;
            for (Sudfor sudfor : this.array) {
                if (gcg0Var.isUnsubscribed()) {
                    return;
                }
                gcg0Var.onNext(sudfor);
            }
            if (gcg0Var.isUnsubscribed()) {
                return;
            }
            gcg0Var.onCompleted();
        }

        @Override // p153l.vk90
        public void request(long j) {
            if (j < 0) {
                fcg0.m125008a("n >= 0 required but it was ", j);
                return;
            }
            if (j == Long.MAX_VALUE) {
                if (rc2.m180770b(this, j) == 0) {
                    fastPath();
                }
            } else {
                if (j == 0 || rc2.m180770b(this, j) != 0) {
                    return;
                }
                slowPath(j);
            }
        }

        public void slowPath(long j) {
            gcg0<? super T> gcg0Var = this.child;
            T[] tArr = this.array;
            int length = tArr.length;
            int i = this.index;
            do {
                long j2 = 0;
                while (true) {
                    if (j == 0 || i == length) {
                        j = get() + j2;
                        if (j == 0) {
                            break;
                        }
                    } else {
                        if (gcg0Var.isUnsubscribed()) {
                            return;
                        }
                        gcg0Var.onNext(tArr[i]);
                        i++;
                        if (i == length) {
                            if (gcg0Var.isUnsubscribed()) {
                                return;
                            }
                            gcg0Var.onCompleted();
                            return;
                        }
                        j--;
                        j2--;
                    }
                }
                this.index = i;
                j = addAndGet(j2);
            } while (j != 0);
        }
    }

    public OnSubscribeFromArray(T[] tArr) {
        this.f208078a = tArr;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super T> gcg0Var) {
        gcg0Var.mo95773f(new FromArrayProducer(gcg0Var, this.f208078a));
    }
}
