package p133rx.subjects;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p133rx.C22306c;
import p133rx.exceptions.OnErrorThrowable;
import p133rx.internal.operators.NotificationLite;
import p133rx.internal.util.unsafe.SpscLinkedQueue;
import p133rx.internal.util.unsafe.SpscUnboundedArrayQueue;
import p133rx.internal.util.unsafe.UnsafeAccess;
import p149l.c4g0;
import p149l.d30;
import p149l.f31;
import p149l.f5f;
import p149l.hrf0;
import p149l.ig3;
import p149l.irf0;
import p149l.kc2;
import p149l.m250;
import p149l.p3g0;
import p149l.rc90;
import p149l.z3g0;

/* JADX INFO: loaded from: classes3.dex */
public final class UnicastSubject<T> extends p3g0<T, T> {

    /* JADX INFO: renamed from: a */
    public final State<T> f207494a;

    public static final class State<T> extends AtomicLong implements rc90, m250<T>, C22306c.a<T>, c4g0 {
        private static final long serialVersionUID = -9044104859202255786L;
        volatile boolean caughtUp;
        volatile boolean done;
        boolean emitting;
        Throwable error;
        boolean missed;
        final Queue<Object> queue;
        final AtomicReference<d30> terminateOnce;

        /* JADX INFO: renamed from: nl */
        final NotificationLite<T> f207495nl = NotificationLite.m221335f();
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

        @Override // p149l.e30
        public void call(z3g0<? super T> z3g0Var) {
            if (!f31.m119248a(this.subscriber, null, z3g0Var)) {
                z3g0Var.onError(new IllegalStateException("Only a single subscriber is allowed"));
            } else {
                z3g0Var.m217046b(this);
                z3g0Var.mo106696f(this);
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
            if (atomicReference == null || (d30Var = atomicReference.get()) == null || !f31.m119248a(atomicReference, d30Var, null)) {
                return;
            }
            d30Var.call();
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return this.done;
        }

        @Override // p149l.m250
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

        @Override // p149l.m250
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

        @Override // p149l.m250
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
                            this.queue.offer(this.f207495nl.m221344j(t));
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
                f5f.m119493g(th2, z3g0Var, t);
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
                                T tM221340e = this.f207495nl.m221340e(objPoll);
                                try {
                                    z3g0Var.onNext(tM221340e);
                                    j--;
                                    j2++;
                                } catch (Throwable th) {
                                    queue.clear();
                                    f5f.m119491e(th);
                                    z3g0Var.onError(OnErrorThrowable.addValueAsLastCause(th, tM221340e));
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

        @Override // p149l.rc90
        public void request(long j) {
            if (j < 0) {
                ig3.m135964a("n >= 0 required");
                return;
            }
            if (j > 0) {
                kc2.m145336b(this, j);
                replay();
            } else if (this.done) {
                replay();
            }
        }

        @Override // p149l.c4g0
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
        this.f207494a = state;
    }

    /* JADX INFO: renamed from: b */
    public static <T> UnicastSubject<T> m221509b() {
        return m221510c(16);
    }

    /* JADX INFO: renamed from: c */
    public static <T> UnicastSubject<T> m221510c(int i) {
        return new UnicastSubject<>(new State(i, null));
    }

    /* JADX INFO: renamed from: d */
    public static <T> UnicastSubject<T> m221511d(int i, d30 d30Var) {
        return new UnicastSubject<>(new State(i, d30Var));
    }

    @Override // p149l.m250
    public void onCompleted() {
        this.f207494a.onCompleted();
    }

    @Override // p149l.m250
    public void onError(Throwable th) {
        this.f207494a.onError(th);
    }

    @Override // p149l.m250
    public void onNext(T t) {
        this.f207494a.onNext(t);
    }
}
