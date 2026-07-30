package p133rx.observables;

import java.util.concurrent.atomic.AtomicLong;
import p133rx.C22306c;
import p149l.c4g0;
import p149l.ejd0;
import p149l.f5f;
import p149l.kc2;
import p149l.m250;
import p149l.qkq0;
import p149l.rc90;
import p149l.z3g0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SyncOnSubscribe<S, T> implements C22306c.a<T> {

    public static final class SubscriptionProducer<S, T> extends AtomicLong implements rc90, c4g0, m250<T> {
        private static final long serialVersionUID = -3736864024352728072L;
        private final z3g0<? super T> actualSubscriber;
        private boolean hasTerminated;
        private boolean onNextCalled;
        private final SyncOnSubscribe<S, T> parent;
        private S state;

        public SubscriptionProducer(z3g0<? super T> z3g0Var, SyncOnSubscribe<S, T> syncOnSubscribe, S s) {
            this.actualSubscriber = z3g0Var;
            this.parent = syncOnSubscribe;
            this.state = s;
        }

        private void doUnsubscribe() {
            try {
                this.parent.m221491d(this.state);
            } catch (Throwable th) {
                f5f.m119491e(th);
                ejd0.m116793j(th);
            }
        }

        private void fastpath() {
            SyncOnSubscribe<S, T> syncOnSubscribe = this.parent;
            z3g0<? super T> z3g0Var = this.actualSubscriber;
            do {
                try {
                    this.onNextCalled = false;
                    nextIteration(syncOnSubscribe);
                } catch (Throwable th) {
                    handleThrownError(z3g0Var, th);
                    return;
                }
            } while (!tryUnsubscribe());
        }

        private void handleThrownError(z3g0<? super T> z3g0Var, Throwable th) {
            if (this.hasTerminated) {
                ejd0.m116793j(th);
                return;
            }
            this.hasTerminated = true;
            z3g0Var.onError(th);
            unsubscribe();
        }

        private void nextIteration(SyncOnSubscribe<S, T> syncOnSubscribe) {
            this.state = syncOnSubscribe.m221490c(this.state, this);
        }

        private void slowPath(long j) {
            SyncOnSubscribe<S, T> syncOnSubscribe = this.parent;
            z3g0<? super T> z3g0Var = this.actualSubscriber;
            do {
                long j2 = j;
                do {
                    try {
                        this.onNextCalled = false;
                        nextIteration(syncOnSubscribe);
                        if (tryUnsubscribe()) {
                            return;
                        }
                        if (this.onNextCalled) {
                            j2--;
                        }
                    } catch (Throwable th) {
                        handleThrownError(z3g0Var, th);
                        return;
                    }
                } while (j2 != 0);
                j = addAndGet(-j);
            } while (j > 0);
            tryUnsubscribe();
        }

        private boolean tryUnsubscribe() {
            if (!this.hasTerminated && get() >= -1) {
                return false;
            }
            set(-1L);
            doUnsubscribe();
            return true;
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return get() < 0;
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.hasTerminated) {
                qkq0.m175383a("Terminal event already emitted.");
                return;
            }
            this.hasTerminated = true;
            if (this.actualSubscriber.isUnsubscribed()) {
                return;
            }
            this.actualSubscriber.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            if (this.hasTerminated) {
                qkq0.m175383a("Terminal event already emitted.");
                return;
            }
            this.hasTerminated = true;
            if (this.actualSubscriber.isUnsubscribed()) {
                return;
            }
            this.actualSubscriber.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            if (this.onNextCalled) {
                qkq0.m175383a("onNext called multiple times!");
            } else {
                this.onNextCalled = true;
                this.actualSubscriber.onNext(t);
            }
        }

        @Override // p149l.rc90
        public void request(long j) {
            if (j <= 0 || kc2.m145336b(this, j) != 0) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                fastpath();
            } else {
                slowPath(j);
            }
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            long j;
            do {
                j = get();
                if (compareAndSet(0L, -1L)) {
                    doUnsubscribe();
                    return;
                }
            } while (!compareAndSet(j, -2L));
        }
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void call(z3g0<? super T> z3g0Var) {
        try {
            SubscriptionProducer subscriptionProducer = new SubscriptionProducer(z3g0Var, this, m221489b());
            z3g0Var.m217046b(subscriptionProducer);
            z3g0Var.mo106696f(subscriptionProducer);
        } catch (Throwable th) {
            f5f.m119491e(th);
            z3g0Var.onError(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract S m221489b();

    /* JADX INFO: renamed from: c */
    public abstract S m221490c(S s, m250<? super T> m250Var);

    /* JADX INFO: renamed from: d */
    public void m221491d(S s) {
    }
}
