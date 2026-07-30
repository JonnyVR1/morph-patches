package p133rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p133rx.C22306c;
import p133rx.exceptions.OnErrorThrowable;
import p149l.c4g0;
import p149l.f5f;
import p149l.ig3;
import p149l.m250;
import p149l.rc90;
import p149l.rie0;
import p149l.tmr;
import p149l.z3g0;

/* JADX INFO: loaded from: classes3.dex */
public final class CachedObservable<T> extends C22306c<T> {

    /* JADX INFO: renamed from: a */
    public final C22314a<T> f207128a;

    public static final class CachedSubscribe<T> extends AtomicBoolean implements C22306c.a<T> {
        private static final long serialVersionUID = -2817751667698696782L;
        final C22314a<T> state;

        public CachedSubscribe(C22314a<T> c22314a) {
            this.state = c22314a;
        }

        @Override // p149l.e30
        public void call(z3g0<? super T> z3g0Var) {
            ReplayProducer<T> replayProducer = new ReplayProducer<>(z3g0Var, this.state);
            this.state.m221331e(replayProducer);
            z3g0Var.m217046b(replayProducer);
            z3g0Var.mo106696f(replayProducer);
            if (get() || !compareAndSet(false, true)) {
                return;
            }
            this.state.m221332f();
        }
    }

    public static final class ReplayProducer<T> extends AtomicLong implements rc90, c4g0 {
        private static final long serialVersionUID = -2557562030197141021L;
        final z3g0<? super T> child;
        Object[] currentBuffer;
        int currentIndexInBuffer;
        boolean emitting;
        int index;
        boolean missed;
        final C22314a<T> state;

        public ReplayProducer(z3g0<? super T> z3g0Var, C22314a<T> c22314a) {
            this.child = z3g0Var;
            this.state = c22314a;
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return get() < 0;
        }

        public long produced(long j) {
            return addAndGet(-j);
        }

        public void replay() throws Throwable {
            boolean z;
            synchronized (this) {
                try {
                    boolean z2 = true;
                    if (this.emitting) {
                        this.missed = true;
                        return;
                    }
                    this.emitting = true;
                    try {
                        NotificationLite<T> notificationLite = this.state.f207133i;
                        z3g0<? super T> z3g0Var = this.child;
                        while (true) {
                            long j = get();
                            if (j < 0) {
                                return;
                            }
                            int iM189719c = this.state.m189719c();
                            try {
                                if (iM189719c != 0) {
                                    Object[] objArrM189718b = this.currentBuffer;
                                    if (objArrM189718b == null) {
                                        objArrM189718b = this.state.m189718b();
                                        this.currentBuffer = objArrM189718b;
                                    }
                                    int length = objArrM189718b.length - 1;
                                    int i = this.index;
                                    int i2 = this.currentIndexInBuffer;
                                    if (j == 0) {
                                        Object obj = objArrM189718b[i2];
                                        if (notificationLite.m221341g(obj)) {
                                            z3g0Var.onCompleted();
                                            unsubscribe();
                                            return;
                                        } else if (notificationLite.m221342h(obj)) {
                                            z3g0Var.onError(notificationLite.m221339d(obj));
                                            unsubscribe();
                                            return;
                                        }
                                    } else if (j > 0) {
                                        int i3 = 0;
                                        while (i < iM189719c && j > 0) {
                                            if (z3g0Var.isUnsubscribed()) {
                                                return;
                                            }
                                            if (i2 == length) {
                                                objArrM189718b = (Object[]) objArrM189718b[length];
                                                i2 = 0;
                                            }
                                            Object obj2 = objArrM189718b[i2];
                                            try {
                                                if (notificationLite.m221336a(z3g0Var, obj2)) {
                                                    try {
                                                        unsubscribe();
                                                        return;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        z = true;
                                                        try {
                                                            f5f.m119491e(th);
                                                            unsubscribe();
                                                            if (notificationLite.m221342h(obj2) || notificationLite.m221341g(obj2)) {
                                                                return;
                                                            }
                                                            z3g0Var.onError(OnErrorThrowable.addValueAsLastCause(th, notificationLite.m221340e(obj2)));
                                                            return;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            z2 = z;
                                                            if (!z2) {
                                                                synchronized (this) {
                                                                    this.emitting = false;
                                                                }
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                }
                                                i2++;
                                                i++;
                                                j--;
                                                i3++;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                z = false;
                                            }
                                        }
                                        if (z3g0Var.isUnsubscribed()) {
                                            return;
                                        }
                                        this.index = i;
                                        this.currentIndexInBuffer = i2;
                                        this.currentBuffer = objArrM189718b;
                                        produced(i3);
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
                                        } catch (Throwable th4) {
                                            th = th4;
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        z2 = false;
                    }
                } catch (Throwable th8) {
                    throw th8;
                }
            }
        }

        @Override // p149l.rc90
        public void request(long j) throws Throwable {
            long j2;
            long j3;
            do {
                j2 = get();
                if (j2 < 0) {
                    return;
                }
                j3 = j2 + j;
                if (j3 < 0) {
                    j3 = Long.MAX_VALUE;
                }
            } while (!compareAndSet(j2, j3));
            replay();
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            if (get() < 0 || getAndSet(-1L) < 0) {
                return;
            }
            this.state.m221334h(this);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.CachedObservable$a */
    public static final class C22314a<T> extends tmr implements m250<T> {

        /* JADX INFO: renamed from: l */
        public static final ReplayProducer<?>[] f207129l = new ReplayProducer[0];

        /* JADX INFO: renamed from: f */
        public final C22306c<? extends T> f207130f;

        /* JADX INFO: renamed from: g */
        public final rie0 f207131g;

        /* JADX INFO: renamed from: h */
        public volatile ReplayProducer<?>[] f207132h;

        /* JADX INFO: renamed from: i */
        public final NotificationLite<T> f207133i;

        /* JADX INFO: renamed from: j */
        public volatile boolean f207134j;

        /* JADX INFO: renamed from: k */
        public boolean f207135k;

        /* JADX INFO: renamed from: rx.internal.operators.CachedObservable$a$a */
        public class a extends z3g0<T> {
            public a() {
            }

            @Override // p149l.m250
            public void onCompleted() throws Throwable {
                C22314a.this.onCompleted();
            }

            @Override // p149l.m250
            public void onError(Throwable th) throws Throwable {
                C22314a.this.onError(th);
            }

            @Override // p149l.m250
            public void onNext(T t) throws Throwable {
                C22314a.this.onNext(t);
            }
        }

        public C22314a(C22306c<? extends T> c22306c, int i) {
            super(i);
            this.f207130f = c22306c;
            this.f207132h = f207129l;
            this.f207133i = NotificationLite.m221335f();
            this.f207131g = new rie0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: e */
        public void m221331e(ReplayProducer<T> replayProducer) {
            synchronized (this.f207131g) {
                ReplayProducer<?>[] replayProducerArr = this.f207132h;
                int length = replayProducerArr.length;
                ReplayProducer<?>[] replayProducerArr2 = new ReplayProducer[length + 1];
                System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, length);
                replayProducerArr2[length] = replayProducer;
                this.f207132h = replayProducerArr2;
            }
        }

        /* JADX INFO: renamed from: f */
        public void m221332f() {
            a aVar = new a();
            this.f207131g.m179504b(aVar);
            this.f207130f.unsafeSubscribe(aVar);
            this.f207134j = true;
        }

        /* JADX INFO: renamed from: g */
        public void m221333g() throws Throwable {
            for (ReplayProducer<?> replayProducer : this.f207132h) {
                replayProducer.replay();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m221334h(ReplayProducer<T> replayProducer) {
            synchronized (this.f207131g) {
                try {
                    ReplayProducer<?>[] replayProducerArr = this.f207132h;
                    int length = replayProducerArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (replayProducerArr[i].equals(replayProducer)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i < 0) {
                        return;
                    }
                    if (length == 1) {
                        this.f207132h = f207129l;
                        return;
                    }
                    ReplayProducer<?>[] replayProducerArr2 = new ReplayProducer[length - 1];
                    System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, i);
                    System.arraycopy(replayProducerArr, i + 1, replayProducerArr2, i, (length - i) - 1);
                    this.f207132h = replayProducerArr2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p149l.m250
        public void onCompleted() throws Throwable {
            if (this.f207135k) {
                return;
            }
            this.f207135k = true;
            m189717a(this.f207133i.m221337b());
            this.f207131g.unsubscribe();
            m221333g();
        }

        @Override // p149l.m250
        public void onError(Throwable th) throws Throwable {
            if (this.f207135k) {
                return;
            }
            this.f207135k = true;
            m189717a(this.f207133i.m221338c(th));
            this.f207131g.unsubscribe();
            m221333g();
        }

        @Override // p149l.m250
        public void onNext(T t) throws Throwable {
            if (this.f207135k) {
                return;
            }
            m189717a(this.f207133i.m221344j(t));
            m221333g();
        }
    }

    public CachedObservable(C22306c.a<T> aVar, C22314a<T> c22314a) {
        super(aVar);
        this.f207128a = c22314a;
    }

    /* JADX INFO: renamed from: a */
    public static <T> CachedObservable<T> m221329a(C22306c<? extends T> c22306c) {
        return m221330b(c22306c, 16);
    }

    /* JADX INFO: renamed from: b */
    public static <T> CachedObservable<T> m221330b(C22306c<? extends T> c22306c, int i) {
        if (i >= 1) {
            C22314a c22314a = new C22314a(c22306c, i);
            return new CachedObservable<>(new CachedSubscribe(c22314a), c22314a);
        }
        ig3.m135964a("capacityHint > 0 required");
        return null;
    }
}
