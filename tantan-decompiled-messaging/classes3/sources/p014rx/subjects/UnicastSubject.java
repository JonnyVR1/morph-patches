package p014rx.subjects;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import l.f31;
import l.ig3;
import p003l.c4g0;
import p003l.d30;
import p003l.f5f;
import p003l.hrf0;
import p003l.irf0;
import p003l.kc2;
import p003l.m250;
import p003l.p3g0;
import p003l.rc90;
import p003l.z3g0;
import p014rx.C1099c;
import p014rx.exceptions.OnErrorThrowable;
import p014rx.internal.operators.NotificationLite;
import p014rx.internal.util.unsafe.SpscLinkedQueue;
import p014rx.internal.util.unsafe.SpscUnboundedArrayQueue;
import p014rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class UnicastSubject<T> extends p3g0<T, T> {

    /* JADX INFO: renamed from: a */
    public final State<T> f11119a;

    public static final class State<T> extends AtomicLong implements rc90, m250<T>, C1099c.a<T>, c4g0 {
        private static final long serialVersionUID = -9044104859202255786L;
        volatile boolean caughtUp;
        volatile boolean done;
        boolean emitting;
        Throwable error;
        boolean missed;
        final Queue<Object> queue;
        final AtomicReference<d30> terminateOnce;

        /* JADX INFO: renamed from: nl */
        final NotificationLite<T> f11120nl = NotificationLite.m9792f();
        final AtomicReference<z3g0<? super T>> subscriber = new AtomicReference<>();

        public State(int i, d30 d30Var) {
            Queue<Object> spscLinkedQueue;
            this.terminateOnce = d30Var != null ? new AtomicReference<>(d30Var) : null;
            if (i > 1) {
                spscLinkedQueue = UnsafeAccess.isUnsafeAvailable() ? new SpscUnboundedArrayQueue<>(i) : new irf0<>(i);
            } else {
                spscLinkedQueue = UnsafeAccess.isUnsafeAvailable() ? new SpscLinkedQueue<>() : new hrf0<>();
            }
            this.queue = spscLinkedQueue;
        }

        @Override // p003l.e30
        public void call(z3g0<? super T> z3g0Var) {
            if (!f31.a(this.subscriber, (Object) null, z3g0Var)) {
                z3g0Var.onError(new IllegalStateException("Only a single subscriber is allowed"));
            } else {
                z3g0Var.m9240b(this);
                z3g0Var.mo3257f(this);
            }
        }

        public boolean checkTerminated(boolean z, boolean z2, z3g0<? super T> z3g0Var) {
            if (z3g0Var.isUnsubscribed()) {
                this.queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                this.queue.clear();
                z3g0Var.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            z3g0Var.onCompleted();
            return true;
        }

        public void doTerminate() {
            d30 d30Var;
            AtomicReference<d30> atomicReference = this.terminateOnce;
            if (atomicReference == null || (d30Var = atomicReference.get()) == null || !f31.a(atomicReference, d30Var, (Object) null)) {
                return;
            }
            d30Var.call();
        }

        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return this.done;
        }

        @Override // p003l.m250
        public void onCompleted() {
            boolean z;
            if (this.done) {
                return;
            }
            doTerminate();
            this.done = true;
            if (!this.caughtUp) {
                synchronized (this) {
                    z = this.caughtUp;
                }
                if (!z) {
                    replay();
                    return;
                }
            }
            this.subscriber.get().onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            boolean z;
            if (this.done) {
                return;
            }
            doTerminate();
            this.error = th;
            this.done = true;
            if (!this.caughtUp) {
                synchronized (this) {
                    z = this.caughtUp;
                }
                if (!z) {
                    replay();
                    return;
                }
            }
            this.subscriber.get().onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            boolean z;
            if (this.done) {
                return;
            }
            if (!this.caughtUp) {
                synchronized (this) {
                    try {
                        if (this.caughtUp) {
                            z = false;
                        } else {
                            this.queue.offer(this.f11120nl.m9801j(t));
                            z = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    replay();
                    return;
                }
            }
            z3g0<? super T> z3g0Var = this.subscriber.get();
            try {
                z3g0Var.onNext(t);
            } catch (Throwable th2) {
                f5f.m3966g(th2, z3g0Var, t);
            }
        }

        public void replay() {
            boolean z;
            synchronized (this) {
                try {
                    if (this.emitting) {
                        this.missed = true;
                        return;
                    }
                    this.emitting = true;
                    Queue<Object> queue = this.queue;
                    while (true) {
                        z3g0<? super T> z3g0Var = this.subscriber.get();
                        if (z3g0Var == null) {
                            z = false;
                        } else {
                            if (checkTerminated(this.done, queue.isEmpty(), z3g0Var)) {
                                return;
                            }
                            long j = get();
                            z = j == Long.MAX_VALUE;
                            long j2 = 0;
                            while (j != 0) {
                                boolean z2 = this.done;
                                Object objPoll = queue.poll();
                                boolean z3 = objPoll == null;
                                if (checkTerminated(z2, z3, z3g0Var)) {
                                    return;
                                }
                                if (z3) {
                                    break;
                                }
                                T tM9797e = this.f11120nl.m9797e(objPoll);
                                try {
                                    z3g0Var.onNext(tM9797e);
                                    j--;
                                    j2++;
                                } catch (Throwable th) {
                                    queue.clear();
                                    f5f.m3964e(th);
                                    z3g0Var.onError(OnErrorThrowable.addValueAsLastCause(th, tM9797e));
                                    return;
                                }
                            }
                            if (!z && j2 != 0) {
                                addAndGet(-j2);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (!this.missed) {
                                    if (z && queue.isEmpty()) {
                                        this.caughtUp = true;
                                    }
                                    this.emitting = false;
                                    return;
                                }
                                this.missed = false;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // p003l.rc90
        public void request(long j) {
            if (j < 0) {
                ig3.a("n >= 0 required");
                return;
            }
            if (j > 0) {
                kc2.m5640b(this, j);
                replay();
            } else if (this.done) {
                replay();
            }
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
            doTerminate();
            this.done = true;
            synchronized (this) {
                try {
                    if (this.emitting) {
                        return;
                    }
                    this.emitting = true;
                    this.queue.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public UnicastSubject(State<T> state) {
        super(state);
        this.f11119a = state;
    }

    /* JADX INFO: renamed from: b */
    public static <T> UnicastSubject<T> m9966b() {
        return m9967c(16);
    }

    /* JADX INFO: renamed from: c */
    public static <T> UnicastSubject<T> m9967c(int i) {
        return new UnicastSubject<>(new State(i, null));
    }

    /* JADX INFO: renamed from: d */
    public static <T> UnicastSubject<T> m9968d(int i, d30 d30Var) {
        return new UnicastSubject<>(new State(i, d30Var));
    }

    @Override // p003l.m250
    public void onCompleted() {
        this.f11119a.onCompleted();
    }

    @Override // p003l.m250
    public void onError(Throwable th) {
        this.f11119a.onError(th);
    }

    @Override // p003l.m250
    public void onNext(T t) {
        this.f11119a.onNext(t);
    }
}
