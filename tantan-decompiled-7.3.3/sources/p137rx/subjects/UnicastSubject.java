package p137rx.subjects;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.C22421c;
import p137rx.exceptions.OnErrorThrowable;
import p137rx.internal.operators.NotificationLite;
import p137rx.internal.util.unsafe.SpscLinkedQueue;
import p137rx.internal.util.unsafe.SpscUnboundedArrayQueue;
import p137rx.internal.util.unsafe.UnsafeAccess;
import p153l.bb50;
import p153l.gcg0;
import p153l.j6f;
import p153l.kcg0;
import p153l.m31;
import p153l.qzf0;
import p153l.rc2;
import p153l.rzf0;
import p153l.vk90;
import p153l.wbg0;
import p153l.wg3;
import p153l.x20;

/* JADX INFO: loaded from: classes3.dex */
public final class UnicastSubject<T> extends wbg0<T, T> {

    /* JADX INFO: renamed from: a */
    public final State<T> f208416a;

    public static final class State<T> extends AtomicLong implements vk90, bb50<T>, C22421c.a<T>, kcg0 {
        private static final long serialVersionUID = -9044104859202255786L;
        volatile boolean caughtUp;
        volatile boolean done;
        boolean emitting;
        Throwable error;
        boolean missed;
        final Queue<Object> queue;
        final AtomicReference<x20> terminateOnce;

        /* JADX INFO: renamed from: nl */
        final NotificationLite<T> f208417nl = NotificationLite.m222581f();
        final AtomicReference<gcg0<? super T>> subscriber = new AtomicReference<>();

        public State(int i, x20 x20Var) {
            Queue<Object> spscLinkedQueue;
            this.terminateOnce = x20Var != null ? new AtomicReference<>(x20Var) : null;
            if (i > 1) {
                spscLinkedQueue = UnsafeAccess.isUnsafeAvailable() ? new SpscUnboundedArrayQueue<>(i) : new rzf0<>(i);
            } else {
                spscLinkedQueue = UnsafeAccess.isUnsafeAvailable() ? new SpscLinkedQueue<>() : new qzf0<>();
            }
            this.queue = spscLinkedQueue;
        }

        @Override // p153l.y20
        public void call(gcg0<? super T> gcg0Var) {
            if (!m31.m156916a(this.subscriber, null, gcg0Var)) {
                gcg0Var.onError(new IllegalStateException("Only a single subscriber is allowed"));
            } else {
                gcg0Var.m129866b(this);
                gcg0Var.mo95773f(this);
            }
        }

        public boolean checkTerminated(boolean z, boolean z2, gcg0<? super T> gcg0Var) {
            if (gcg0Var.isUnsubscribed()) {
                this.queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                this.queue.clear();
                gcg0Var.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            gcg0Var.onCompleted();
            return true;
        }

        public void doTerminate() {
            x20 x20Var;
            AtomicReference<x20> atomicReference = this.terminateOnce;
            if (atomicReference == null || (x20Var = atomicReference.get()) == null || !m31.m156916a(atomicReference, x20Var, null)) {
                return;
            }
            x20Var.call();
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return this.done;
        }

        @Override // p153l.bb50
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

        @Override // p153l.bb50
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

        @Override // p153l.bb50
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
                            this.queue.offer(this.f208417nl.m222590j(t));
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
            gcg0<? super T> gcg0Var = this.subscriber.get();
            try {
                gcg0Var.onNext(t);
            } catch (Throwable th2) {
                j6f.m143665g(th2, gcg0Var, t);
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
                        gcg0<? super T> gcg0Var = this.subscriber.get();
                        if (gcg0Var == null) {
                            z = false;
                        } else {
                            if (checkTerminated(this.done, queue.isEmpty(), gcg0Var)) {
                                return;
                            }
                            long j = get();
                            z = j == Long.MAX_VALUE;
                            long j2 = 0;
                            while (j != 0) {
                                boolean z2 = this.done;
                                Object objPoll = queue.poll();
                                boolean z3 = objPoll == null;
                                if (checkTerminated(z2, z3, gcg0Var)) {
                                    return;
                                }
                                if (z3) {
                                    break;
                                }
                                T tM222586e = this.f208417nl.m222586e(objPoll);
                                try {
                                    gcg0Var.onNext(tM222586e);
                                    j--;
                                    j2++;
                                } catch (Throwable th) {
                                    queue.clear();
                                    j6f.m143663e(th);
                                    gcg0Var.onError(OnErrorThrowable.addValueAsLastCause(th, tM222586e));
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

        @Override // p153l.vk90
        public void request(long j) {
            if (j < 0) {
                wg3.m206174a("n >= 0 required");
                return;
            }
            if (j > 0) {
                rc2.m180770b(this, j);
                replay();
            } else if (this.done) {
                replay();
            }
        }

        @Override // p153l.kcg0
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
        this.f208416a = state;
    }

    /* JADX INFO: renamed from: b */
    public static <T> UnicastSubject<T> m222755b() {
        return m222756c(16);
    }

    /* JADX INFO: renamed from: c */
    public static <T> UnicastSubject<T> m222756c(int i) {
        return new UnicastSubject<>(new State(i, null));
    }

    /* JADX INFO: renamed from: d */
    public static <T> UnicastSubject<T> m222757d(int i, x20 x20Var) {
        return new UnicastSubject<>(new State(i, x20Var));
    }

    @Override // p153l.bb50
    public void onCompleted() {
        this.f208416a.onCompleted();
    }

    @Override // p153l.bb50
    public void onError(Throwable th) {
        this.f208416a.onError(th);
    }

    @Override // p153l.bb50
    public void onNext(T t) {
        this.f208416a.onNext(t);
    }
}
