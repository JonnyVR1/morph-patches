package p014rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import l.f31;
import p003l.c4g0;
import p003l.m250;
import p003l.rc90;
import p003l.z3g0;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class OperatorOnBackpressureLatest<T> implements C1099c.c<T, T> {

    public static final class LatestEmitter<T> extends AtomicLong implements rc90, c4g0, m250<T> {
        static final Object EMPTY = new Object();
        static final long NOT_REQUESTED = -4611686018427387904L;
        private static final long serialVersionUID = -1364393685005146274L;
        final z3g0<? super T> child;
        volatile boolean done;
        boolean emitting;
        boolean missed;
        C1128b<? super T> parent;
        Throwable terminal;
        final AtomicReference<Object> value = new AtomicReference<>(EMPTY);

        public LatestEmitter(z3g0<? super T> z3g0Var) {
            this.child = z3g0Var;
            lazySet(NOT_REQUESTED);
        }

        public void emit() throws Throwable {
            boolean z;
            Object obj;
            synchronized (this) {
                try {
                    boolean z2 = true;
                    if (this.emitting) {
                        this.missed = true;
                        return;
                    }
                    this.emitting = true;
                    this.missed = false;
                    while (true) {
                        try {
                            long j = get();
                            if (j == Long.MIN_VALUE) {
                                return;
                            }
                            Object obj2 = this.value.get();
                            if (j > 0 && obj2 != (obj = EMPTY)) {
                                this.child.onNext(obj2);
                                f31.a(this.value, obj2, obj);
                                produced(1L);
                                obj2 = obj;
                            }
                            if (obj2 == EMPTY && this.done) {
                                Throwable th = this.terminal;
                                z3g0<? super T> z3g0Var = this.child;
                                if (th != null) {
                                    z3g0Var.onError(th);
                                } else {
                                    z3g0Var.onCompleted();
                                }
                            }
                            try {
                                synchronized (this) {
                                    try {
                                        if (!this.missed) {
                                            this.emitting = false;
                                            return;
                                        }
                                        this.missed = false;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z2 = false;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                z = z2;
                                th = th4;
                                if (z) {
                                    throw th;
                                }
                                synchronized (this) {
                                    this.emitting = false;
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            z = false;
                        }
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            }
        }

        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // p003l.m250
        public void onCompleted() throws Throwable {
            this.done = true;
            emit();
        }

        @Override // p003l.m250
        public void onError(Throwable th) throws Throwable {
            this.terminal = th;
            this.done = true;
            emit();
        }

        @Override // p003l.m250
        public void onNext(T t) throws Throwable {
            this.value.lazySet(t);
            emit();
        }

        public long produced(long j) {
            long j2;
            long j3;
            do {
                j2 = get();
                if (j2 < 0) {
                    return j2;
                }
                j3 = j2 - j;
            } while (!compareAndSet(j2, j3));
            return j3;
        }

        @Override // p003l.rc90
        public void request(long j) throws Throwable {
            long j2;
            long j3;
            if (j >= 0) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE) {
                        return;
                    }
                    if (j2 == NOT_REQUESTED) {
                        j3 = j;
                    } else {
                        j3 = j2 + j;
                        if (j3 < 0) {
                            j3 = Long.MAX_VALUE;
                        }
                    }
                } while (!compareAndSet(j2, j3));
                if (j2 == NOT_REQUESTED) {
                    this.parent.m9861g(Long.MAX_VALUE);
                }
                emit();
            }
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
            if (get() >= 0) {
                getAndSet(Long.MIN_VALUE);
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorOnBackpressureLatest$a */
    public static final class C1127a {
        static final OperatorOnBackpressureLatest<Object> INSTANCE = new OperatorOnBackpressureLatest<>();
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorOnBackpressureLatest$b */
    public static final class C1128b<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final LatestEmitter<T> f10893e;

        public C1128b(LatestEmitter<T> latestEmitter) {
            this.f10893e = latestEmitter;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            m9242e(0L);
        }

        /* JADX INFO: renamed from: g */
        public void m9861g(long j) {
            m9242e(j);
        }

        @Override // p003l.m250
        public void onCompleted() throws Throwable {
            this.f10893e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) throws Throwable {
            this.f10893e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) throws Throwable {
            this.f10893e.onNext(t);
        }
    }

    /* JADX INFO: renamed from: b */
    public static <T> OperatorOnBackpressureLatest<T> m9859b() {
        return (OperatorOnBackpressureLatest<T>) C1127a.INSTANCE;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        LatestEmitter latestEmitter = new LatestEmitter(z3g0Var);
        C1128b<? super T> c1128b = new C1128b<>(latestEmitter);
        latestEmitter.parent = c1128b;
        z3g0Var.m9240b(c1128b);
        z3g0Var.m9240b(latestEmitter);
        z3g0Var.mo3257f(latestEmitter);
        return c1128b;
    }
}
