package p133rx.internal.operators;

import Sudchar.Sudfor;
import java.util.concurrent.atomic.AtomicLong;
import p133rx.C22306c;
import p149l.kc2;
import p149l.rc90;
import p149l.y3g0;
import p149l.z3g0;

/* JADX INFO: loaded from: classes3.dex */
public final class OnSubscribeFromArray<T> implements C22306c.a<T> {

    /* JADX INFO: renamed from: a */
    public final T[] f207156a;

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
            for (Sudfor sudfor : this.array) {
                if (z3g0Var.isUnsubscribed()) {
                    return;
                }
                z3g0Var.onNext(sudfor);
            }
            if (z3g0Var.isUnsubscribed()) {
                return;
            }
            z3g0Var.onCompleted();
        }

        @Override // p149l.rc90
        public void request(long j) {
            if (j < 0) {
                y3g0.m212802a("n >= 0 required but it was ", j);
                return;
            }
            if (j == Long.MAX_VALUE) {
                if (kc2.m145336b(this, j) == 0) {
                    fastPath();
                }
            } else {
                if (j == 0 || kc2.m145336b(this, j) != 0) {
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
        this.f207156a = tArr;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        z3g0Var.mo106696f(new FromArrayProducer(z3g0Var, this.f207156a));
    }
}
