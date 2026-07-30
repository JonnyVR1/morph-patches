package p014rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import l.jfd0;
import p003l.f5f;
import p003l.kc2;
import p003l.rc90;
import p003l.z3g0;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class OnSubscribeFromIterable<T> implements C1099c.a<T> {

    /* JADX INFO: renamed from: a */
    public final Iterable<? extends T> f10787a;

    public static final class IterableProducer<T> extends AtomicLong implements rc90 {
        private static final long serialVersionUID = -8730475647105475802L;

        /* JADX INFO: renamed from: it */
        private final Iterator<? extends T> f10788it;

        /* JADX INFO: renamed from: o */
        private final z3g0<? super T> f10789o;

        public IterableProducer(z3g0<? super T> z3g0Var, Iterator<? extends T> it) {
            this.f10789o = z3g0Var;
            this.f10788it = it;
        }

        public void fastpath() {
            z3g0<? super T> z3g0Var = this.f10789o;
            Iterator<? extends T> it = this.f10788it;
            while (!z3g0Var.isUnsubscribed()) {
                try {
                    z3g0Var.onNext(it.next());
                    if (z3g0Var.isUnsubscribed()) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (z3g0Var.isUnsubscribed()) {
                                return;
                            }
                            z3g0Var.onCompleted();
                            return;
                        }
                    } catch (Throwable th) {
                        f5f.m3965f(th, z3g0Var);
                        return;
                    }
                } catch (Throwable th2) {
                    f5f.m3965f(th2, z3g0Var);
                    return;
                }
            }
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
            z3g0<? super T> z3g0Var = this.f10789o;
            Iterator<? extends T> it = this.f10788it;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    } else {
                        if (z3g0Var.isUnsubscribed()) {
                            return;
                        }
                        try {
                            z3g0Var.onNext(it.next());
                            if (z3g0Var.isUnsubscribed()) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (z3g0Var.isUnsubscribed()) {
                                        return;
                                    }
                                    z3g0Var.onCompleted();
                                    return;
                                }
                                j2++;
                            } catch (Throwable th) {
                                f5f.m3965f(th, z3g0Var);
                                return;
                            }
                        } catch (Throwable th2) {
                            f5f.m3965f(th2, z3g0Var);
                            return;
                        }
                    }
                }
                j = kc2.m5647i(this, j2);
            } while (j != 0);
        }
    }

    public OnSubscribeFromIterable(Iterable<? extends T> iterable) {
        if (iterable != null) {
            this.f10787a = iterable;
        } else {
            jfd0.a("iterable must not be null");
            throw null;
        }
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        try {
            Iterator<? extends T> it = this.f10787a.iterator();
            boolean zHasNext = it.hasNext();
            if (z3g0Var.isUnsubscribed()) {
                return;
            }
            if (zHasNext) {
                z3g0Var.mo3257f(new IterableProducer(z3g0Var, it));
            } else {
                z3g0Var.onCompleted();
            }
        } catch (Throwable th) {
            f5f.m3965f(th, z3g0Var);
        }
    }
}
