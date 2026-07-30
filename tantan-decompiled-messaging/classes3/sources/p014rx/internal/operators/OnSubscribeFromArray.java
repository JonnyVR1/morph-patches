package p014rx.internal.operators;

import android.R;
import java.util.concurrent.atomic.AtomicLong;
import p003l.kc2;
import p003l.rc90;
import p003l.y3g0;
import p003l.z3g0;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class OnSubscribeFromArray<T> implements C1099c.a<T> {

    /* JADX INFO: renamed from: a */
    public final T[] f10781a;

    public static final class FromArrayProducer<T> extends AtomicLong implements rc90 {
        private static final long serialVersionUID = 3534218984725836979L;
        final T[] array;
        final z3g0<? super T> child;
        int index;

        public FromArrayProducer(z3g0<? super T> z3g0Var, T[] tArr) {
            this.child = z3g0Var;
            this.array = tArr;
        }

        public void fastPath() {
            z3g0<? super T> z3g0Var = this.child;
            for (R.color colorVar : this.array) {
                if (z3g0Var.isUnsubscribed()) {
                    return;
                }
                z3g0Var.onNext(colorVar);
            }
            if (z3g0Var.isUnsubscribed()) {
                return;
            }
            z3g0Var.onCompleted();
        }

        @Override // p003l.rc90
        public void request(long j) {
            if (j < 0) {
                y3g0.m8887a("n >= 0 required but it was ", j);
                return;
            }
            if (j == Long.MAX_VALUE) {
                if (kc2.m5640b(this, j) == 0) {
                    fastPath();
                }
            } else {
                if (j == 0 || kc2.m5640b(this, j) != 0) {
                    return;
                }
                slowPath(j);
            }
        }

        public void slowPath(long j) {
            z3g0<? super T> z3g0Var = this.child;
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
                        if (z3g0Var.isUnsubscribed()) {
                            return;
                        }
                        z3g0Var.onNext(tArr[i]);
                        i++;
                        if (i == length) {
                            if (z3g0Var.isUnsubscribed()) {
                                return;
                            }
                            z3g0Var.onCompleted();
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
        this.f10781a = tArr;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        z3g0Var.mo3257f(new FromArrayProducer(z3g0Var, this.f10781a));
    }
}
