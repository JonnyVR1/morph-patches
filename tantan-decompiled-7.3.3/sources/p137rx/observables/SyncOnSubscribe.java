package p137rx.observables;

import java.util.concurrent.atomic.AtomicLong;
import p137rx.C22421c;
import p153l.bb50;
import p153l.gcg0;
import p153l.hrd0;
import p153l.j6f;
import p153l.kcg0;
import p153l.rc2;
import p153l.vk90;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SyncOnSubscribe<S, T> implements C22421c.a<T> {

    public static final class SubscriptionProducer<S, T> extends AtomicLong implements vk90, kcg0, bb50<T> {
        private static final long serialVersionUID = -3736864024352728072L;
        private final gcg0<? super T> actualSubscriber;
        private boolean hasTerminated;
        private boolean onNextCalled;
        private final SyncOnSubscribe<S, T> parent;
        private S state;

        public SubscriptionProducer(gcg0<? super T> gcg0Var, SyncOnSubscribe<S, T> syncOnSubscribe, S s) {
            this.actualSubscriber = gcg0Var;
            this.parent = syncOnSubscribe;
            this.state = s;
        }

        private void doUnsubscribe() {
            try {
                this.parent.m222737d(this.state);
            } catch (Throwable th) {
                j6f.m143663e(th);
                hrd0.m136792j(th);
            }
        }

        private void fastpath() {
            SyncOnSubscribe<S, T> syncOnSubscribe = this.parent;
            gcg0<? super T> gcg0Var = this.actualSubscriber;
            do {
                try {
                    this.onNextCalled = false;
                    nextIteration(syncOnSubscribe);
                } catch (Throwable th) {
                    handleThrownError(gcg0Var, th);
                    return;
                }
            } while (!tryUnsubscribe());
        }

        private void handleThrownError(gcg0<? super T> gcg0Var, Throwable th) {
            if (this.hasTerminated) {
                hrd0.m136792j(th);
                return;
            }
            this.hasTerminated = true;
            gcg0Var.onError(th);
            unsubscribe();
        }

        private void nextIteration(SyncOnSubscribe<S, T> syncOnSubscribe) {
            this.state = syncOnSubscribe.m222736c(this.state, this);
        }

        private void slowPath(long j) {
            SyncOnSubscribe<S, T> syncOnSubscribe = this.parent;
            gcg0<? super T> gcg0Var = this.actualSubscriber;
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
                        handleThrownError(gcg0Var, th);
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

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return get() < 0;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.hasTerminated) {
                wtq0.m207906a("Terminal event already emitted.");
                return;
            }
            this.hasTerminated = true;
            if (this.actualSubscriber.isUnsubscribed()) {
                return;
            }
            this.actualSubscriber.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (this.hasTerminated) {
                wtq0.m207906a("Terminal event already emitted.");
                return;
            }
            this.hasTerminated = true;
            if (this.actualSubscriber.isUnsubscribed()) {
                return;
            }
            this.actualSubscriber.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            if (this.onNextCalled) {
                wtq0.m207906a("onNext called multiple times!");
            } else {
                this.onNextCalled = true;
                this.actualSubscriber.onNext(t);
            }
        }

        @Override // p153l.vk90
        public void request(long j) {
            if (j <= 0 || rc2.m180770b(this, j) != 0) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                fastpath();
            } else {
                slowPath(j);
            }
        }

        @Override // p153l.kcg0
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

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void call(gcg0<? super T> gcg0Var) {
        try {
            SubscriptionProducer subscriptionProducer = new SubscriptionProducer(gcg0Var, this, m222735b());
            gcg0Var.m129866b(subscriptionProducer);
            gcg0Var.mo95773f(subscriptionProducer);
        } catch (Throwable th) {
            j6f.m143663e(th);
            gcg0Var.onError(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract S m222735b();

    /* JADX INFO: renamed from: c */
    public abstract S m222736c(S s, bb50<? super T> bb50Var);

    /* JADX INFO: renamed from: d */
    public void m222737d(S s) {
    }
}
