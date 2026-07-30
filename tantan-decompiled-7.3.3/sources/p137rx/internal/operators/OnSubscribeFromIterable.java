package p137rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import p137rx.C22421c;
import p153l.gcg0;
import p153l.j6f;
import p153l.mnd0;
import p153l.rc2;
import p153l.vk90;

/* JADX INFO: loaded from: classes3.dex */
public final class OnSubscribeFromIterable<T> implements C22421c.a<T> {

    /* JADX INFO: renamed from: a */
    public final Iterable<? extends T> f208084a;

    public static final class IterableProducer<T> extends AtomicLong implements vk90 {
        private static final long serialVersionUID = -8730475647105475802L;

        /* JADX INFO: renamed from: it */
        private final Iterator<? extends T> f208085it;

        /* JADX INFO: renamed from: o */
        private final gcg0<? super T> f208086o;

        public IterableProducer(gcg0<? super T> gcg0Var, Iterator<? extends T> it) {
            this.f208086o = gcg0Var;
            this.f208085it = it;
        }

        public void fastpath() {
            gcg0<? super T> gcg0Var = this.f208086o;
            Iterator<? extends T> it = this.f208085it;
            while (!gcg0Var.isUnsubscribed()) {
                try {
                    gcg0Var.onNext(it.next());
                    if (gcg0Var.isUnsubscribed()) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (gcg0Var.isUnsubscribed()) {
                                return;
                            }
                            gcg0Var.onCompleted();
                            return;
                        }
                    } catch (Throwable th) {
                        j6f.m143664f(th, gcg0Var);
                        return;
                    }
                } catch (Throwable th2) {
                    j6f.m143664f(th2, gcg0Var);
                    return;
                }
            }
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
            gcg0<? super T> gcg0Var = this.f208086o;
            Iterator<? extends T> it = this.f208085it;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    } else {
                        if (gcg0Var.isUnsubscribed()) {
                            return;
                        }
                        try {
                            gcg0Var.onNext(it.next());
                            if (gcg0Var.isUnsubscribed()) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (gcg0Var.isUnsubscribed()) {
                                        return;
                                    }
                                    gcg0Var.onCompleted();
                                    return;
                                }
                                j2++;
                            } catch (Throwable th) {
                                j6f.m143664f(th, gcg0Var);
                                return;
                            }
                        } catch (Throwable th2) {
                            j6f.m143664f(th2, gcg0Var);
                            return;
                        }
                    }
                }
                j = rc2.m180777i(this, j2);
            } while (j != 0);
        }
    }

    public OnSubscribeFromIterable(Iterable<? extends T> iterable) {
        if (iterable != null) {
            this.f208084a = iterable;
        } else {
            mnd0.m159157a("iterable must not be null");
            throw null;
        }
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super T> gcg0Var) {
        try {
            Iterator<? extends T> it = this.f208084a.iterator();
            boolean zHasNext = it.hasNext();
            if (gcg0Var.isUnsubscribed()) {
                return;
            }
            if (zHasNext) {
                gcg0Var.mo95773f(new IterableProducer(gcg0Var, it));
            } else {
                gcg0Var.onCompleted();
            }
        } catch (Throwable th) {
            j6f.m143664f(th, gcg0Var);
        }
    }
}
