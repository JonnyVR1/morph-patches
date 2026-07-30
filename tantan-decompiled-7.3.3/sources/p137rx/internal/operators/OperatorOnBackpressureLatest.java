package p137rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.C22421c;
import p153l.bb50;
import p153l.gcg0;
import p153l.kcg0;
import p153l.m31;
import p153l.vk90;

/* JADX INFO: loaded from: classes3.dex */
public final class OperatorOnBackpressureLatest<T> implements C22421c.c<T, T> {

    public static final class LatestEmitter<T> extends AtomicLong implements vk90, kcg0, bb50<T> {
        static final Object EMPTY = new Object();
        static final long NOT_REQUESTED = -4611686018427387904L;
        private static final long serialVersionUID = -1364393685005146274L;
        final gcg0<? super T> child;
        volatile boolean done;
        boolean emitting;
        boolean missed;
        C22450b<? super T> parent;
        Throwable terminal;
        final AtomicReference<Object> value = new AtomicReference<>(EMPTY);

        public LatestEmitter(gcg0<? super T> gcg0Var) {
            this.child = gcg0Var;
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
                                m31.m156916a(this.value, obj2, obj);
                                produced(1L);
                                obj2 = obj;
                            }
                            if (obj2 == EMPTY && this.done) {
                                Throwable th = this.terminal;
                                gcg0<? super T> gcg0Var = this.child;
                                if (th != null) {
                                    gcg0Var.onError(th);
                                } else {
                                    gcg0Var.onCompleted();
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

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // p153l.bb50
        public void onCompleted() throws Throwable {
            this.done = true;
            emit();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) throws Throwable {
            this.terminal = th;
            this.done = true;
            emit();
        }

        @Override // p153l.bb50
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

        @Override // p153l.vk90
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
                    this.parent.m222650g(Long.MAX_VALUE);
                }
                emit();
            }
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            if (get() >= 0) {
                getAndSet(Long.MIN_VALUE);
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorOnBackpressureLatest$a */
    public static final class C22449a {
        static final OperatorOnBackpressureLatest<Object> INSTANCE = new OperatorOnBackpressureLatest<>();
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorOnBackpressureLatest$b */
    public static final class C22450b<T> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final LatestEmitter<T> f208190e;

        public C22450b(LatestEmitter<T> latestEmitter) {
            this.f208190e = latestEmitter;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            m129868e(0L);
        }

        /* JADX INFO: renamed from: g */
        public void m222650g(long j) {
            m129868e(j);
        }

        @Override // p153l.bb50
        public void onCompleted() throws Throwable {
            this.f208190e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) throws Throwable {
            this.f208190e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) throws Throwable {
            this.f208190e.onNext(t);
        }
    }

    /* JADX INFO: renamed from: b */
    public static <T> OperatorOnBackpressureLatest<T> m222648b() {
        return (OperatorOnBackpressureLatest<T>) C22449a.INSTANCE;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        LatestEmitter latestEmitter = new LatestEmitter(gcg0Var);
        C22450b<? super T> c22450b = new C22450b<>(latestEmitter);
        latestEmitter.parent = c22450b;
        gcg0Var.m129866b(c22450b);
        gcg0Var.m129866b(latestEmitter);
        gcg0Var.mo95773f(latestEmitter);
        return c22450b;
    }
}
