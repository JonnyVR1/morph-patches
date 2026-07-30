package p137rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p137rx.C22421c;
import p137rx.exceptions.OnErrorThrowable;
import p153l.bb50;
import p153l.gcg0;
import p153l.j6f;
import p153l.kcg0;
import p153l.uor;
import p153l.vk90;
import p153l.wg3;
import p153l.wqe0;

/* JADX INFO: loaded from: classes3.dex */
public final class CachedObservable<T> extends C22421c<T> {

    /* JADX INFO: renamed from: a */
    public final C22429a<T> f208050a;

    public static final class CachedSubscribe<T> extends AtomicBoolean implements C22421c.a<T> {
        private static final long serialVersionUID = -2817751667698696782L;
        final C22429a<T> state;

        public CachedSubscribe(C22429a<T> c22429a) {
            this.state = c22429a;
        }

        @Override // p153l.y20
        public void call(gcg0<? super T> gcg0Var) {
            ReplayProducer<T> replayProducer = new ReplayProducer<>(gcg0Var, this.state);
            this.state.m222577e(replayProducer);
            gcg0Var.m129866b(replayProducer);
            gcg0Var.mo95773f(replayProducer);
            if (get() || !compareAndSet(false, true)) {
                return;
            }
            this.state.m222578f();
        }
    }

    public static final class ReplayProducer<T> extends AtomicLong implements vk90, kcg0 {
        private static final long serialVersionUID = -2557562030197141021L;
        final gcg0<? super T> child;
        Object[] currentBuffer;
        int currentIndexInBuffer;
        boolean emitting;
        int index;
        boolean missed;
        final C22429a<T> state;

        public ReplayProducer(gcg0<? super T> gcg0Var, C22429a<T> c22429a) {
            this.child = gcg0Var;
            this.state = c22429a;
        }

        @Override // p153l.kcg0
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
                        NotificationLite<T> notificationLite = this.state.f208055i;
                        gcg0<? super T> gcg0Var = this.child;
                        while (true) {
                            long j = get();
                            if (j < 0) {
                                return;
                            }
                            int iM197023c = this.state.m197023c();
                            try {
                                if (iM197023c != 0) {
                                    Object[] objArrM197022b = this.currentBuffer;
                                    if (objArrM197022b == null) {
                                        objArrM197022b = this.state.m197022b();
                                        this.currentBuffer = objArrM197022b;
                                    }
                                    int length = objArrM197022b.length - 1;
                                    int i = this.index;
                                    int i2 = this.currentIndexInBuffer;
                                    if (j == 0) {
                                        Object obj = objArrM197022b[i2];
                                        if (notificationLite.m222587g(obj)) {
                                            gcg0Var.onCompleted();
                                            unsubscribe();
                                            return;
                                        } else if (notificationLite.m222588h(obj)) {
                                            gcg0Var.onError(notificationLite.m222585d(obj));
                                            unsubscribe();
                                            return;
                                        }
                                    } else if (j > 0) {
                                        int i3 = 0;
                                        while (i < iM197023c && j > 0) {
                                            if (gcg0Var.isUnsubscribed()) {
                                                return;
                                            }
                                            if (i2 == length) {
                                                objArrM197022b = (Object[]) objArrM197022b[length];
                                                i2 = 0;
                                            }
                                            Object obj2 = objArrM197022b[i2];
                                            try {
                                                if (notificationLite.m222582a(gcg0Var, obj2)) {
                                                    try {
                                                        unsubscribe();
                                                        return;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        z = true;
                                                        try {
                                                            j6f.m143663e(th);
                                                            unsubscribe();
                                                            if (notificationLite.m222588h(obj2) || notificationLite.m222587g(obj2)) {
                                                                return;
                                                            }
                                                            gcg0Var.onError(OnErrorThrowable.addValueAsLastCause(th, notificationLite.m222586e(obj2)));
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
                                        if (gcg0Var.isUnsubscribed()) {
                                            return;
                                        }
                                        this.index = i;
                                        this.currentIndexInBuffer = i2;
                                        this.currentBuffer = objArrM197022b;
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

        @Override // p153l.vk90
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

        @Override // p153l.kcg0
        public void unsubscribe() {
            if (get() < 0 || getAndSet(-1L) < 0) {
                return;
            }
            this.state.m222580h(this);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.CachedObservable$a */
    public static final class C22429a<T> extends uor implements bb50<T> {

        /* JADX INFO: renamed from: l */
        public static final ReplayProducer<?>[] f208051l = new ReplayProducer[0];

        /* JADX INFO: renamed from: f */
        public final C22421c<? extends T> f208052f;

        /* JADX INFO: renamed from: g */
        public final wqe0 f208053g;

        /* JADX INFO: renamed from: h */
        public volatile ReplayProducer<?>[] f208054h;

        /* JADX INFO: renamed from: i */
        public final NotificationLite<T> f208055i;

        /* JADX INFO: renamed from: j */
        public volatile boolean f208056j;

        /* JADX INFO: renamed from: k */
        public boolean f208057k;

        /* JADX INFO: renamed from: rx.internal.operators.CachedObservable$a$a */
        public class a extends gcg0<T> {
            public a() {
            }

            @Override // p153l.bb50
            public void onCompleted() throws Throwable {
                C22429a.this.onCompleted();
            }

            @Override // p153l.bb50
            public void onError(Throwable th) throws Throwable {
                C22429a.this.onError(th);
            }

            @Override // p153l.bb50
            public void onNext(T t) throws Throwable {
                C22429a.this.onNext(t);
            }
        }

        public C22429a(C22421c<? extends T> c22421c, int i) {
            super(i);
            this.f208052f = c22421c;
            this.f208054h = f208051l;
            this.f208055i = NotificationLite.m222581f();
            this.f208053g = new wqe0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: e */
        public void m222577e(ReplayProducer<T> replayProducer) {
            synchronized (this.f208053g) {
                ReplayProducer<?>[] replayProducerArr = this.f208054h;
                int length = replayProducerArr.length;
                ReplayProducer<?>[] replayProducerArr2 = new ReplayProducer[length + 1];
                System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, length);
                replayProducerArr2[length] = replayProducer;
                this.f208054h = replayProducerArr2;
            }
        }

        /* JADX INFO: renamed from: f */
        public void m222578f() {
            a aVar = new a();
            this.f208053g.m207511b(aVar);
            this.f208052f.unsafeSubscribe(aVar);
            this.f208056j = true;
        }

        /* JADX INFO: renamed from: g */
        public void m222579g() throws Throwable {
            for (ReplayProducer<?> replayProducer : this.f208054h) {
                replayProducer.replay();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m222580h(ReplayProducer<T> replayProducer) {
            synchronized (this.f208053g) {
                try {
                    ReplayProducer<?>[] replayProducerArr = this.f208054h;
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
                        this.f208054h = f208051l;
                        return;
                    }
                    ReplayProducer<?>[] replayProducerArr2 = new ReplayProducer[length - 1];
                    System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, i);
                    System.arraycopy(replayProducerArr, i + 1, replayProducerArr2, i, (length - i) - 1);
                    this.f208054h = replayProducerArr2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p153l.bb50
        public void onCompleted() throws Throwable {
            if (this.f208057k) {
                return;
            }
            this.f208057k = true;
            m197021a(this.f208055i.m222583b());
            this.f208053g.unsubscribe();
            m222579g();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) throws Throwable {
            if (this.f208057k) {
                return;
            }
            this.f208057k = true;
            m197021a(this.f208055i.m222584c(th));
            this.f208053g.unsubscribe();
            m222579g();
        }

        @Override // p153l.bb50
        public void onNext(T t) throws Throwable {
            if (this.f208057k) {
                return;
            }
            m197021a(this.f208055i.m222590j(t));
            m222579g();
        }
    }

    public CachedObservable(C22421c.a<T> aVar, C22429a<T> c22429a) {
        super(aVar);
        this.f208050a = c22429a;
    }

    /* JADX INFO: renamed from: a */
    public static <T> CachedObservable<T> m222575a(C22421c<? extends T> c22421c) {
        return m222576b(c22421c, 16);
    }

    /* JADX INFO: renamed from: b */
    public static <T> CachedObservable<T> m222576b(C22421c<? extends T> c22421c, int i) {
        if (i >= 1) {
            C22429a c22429a = new C22429a(c22421c, i);
            return new CachedObservable<>(new CachedSubscribe(c22429a), c22429a);
        }
        wg3.m206174a("capacityHint > 0 required");
        return null;
    }
}
