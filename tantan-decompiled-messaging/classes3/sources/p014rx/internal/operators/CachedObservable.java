package p014rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import l.ig3;
import p003l.c4g0;
import p003l.f5f;
import p003l.m250;
import p003l.rc90;
import p003l.rie0;
import p003l.tmr;
import p003l.z3g0;
import p014rx.C1099c;
import p014rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class CachedObservable<T> extends C1099c<T> {

    /* JADX INFO: renamed from: a */
    public final C1107a<T> f10753a;

    public static final class CachedSubscribe<T> extends AtomicBoolean implements C1099c.a<T> {
        private static final long serialVersionUID = -2817751667698696782L;
        final C1107a<T> state;

        public CachedSubscribe(C1107a<T> c1107a) {
            this.state = c1107a;
        }

        @Override // p003l.e30
        public void call(z3g0<? super T> z3g0Var) {
            ReplayProducer<T> replayProducer = new ReplayProducer<>(z3g0Var, this.state);
            this.state.m9788e(replayProducer);
            z3g0Var.m9240b(replayProducer);
            z3g0Var.mo3257f(replayProducer);
            if (get() || !compareAndSet(false, true)) {
                return;
            }
            this.state.m9789f();
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
        final C1107a<T> state;

        public ReplayProducer(z3g0<? super T> z3g0Var, C1107a<T> c1107a) {
            this.child = z3g0Var;
            this.state = c1107a;
        }

        @Override // p003l.c4g0
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
                        NotificationLite<T> notificationLite = this.state.f10758i;
                        z3g0<? super T> z3g0Var = this.child;
                        while (true) {
                            long j = get();
                            if (j < 0) {
                                return;
                            }
                            int iM7822c = this.state.m7822c();
                            try {
                                if (iM7822c != 0) {
                                    Object[] objArrM7821b = this.currentBuffer;
                                    if (objArrM7821b == null) {
                                        objArrM7821b = this.state.m7821b();
                                        this.currentBuffer = objArrM7821b;
                                    }
                                    int length = objArrM7821b.length - 1;
                                    int i = this.index;
                                    int i2 = this.currentIndexInBuffer;
                                    if (j == 0) {
                                        Object obj = objArrM7821b[i2];
                                        if (notificationLite.m9798g(obj)) {
                                            z3g0Var.onCompleted();
                                            unsubscribe();
                                            return;
                                        } else if (notificationLite.m9799h(obj)) {
                                            z3g0Var.onError(notificationLite.m9796d(obj));
                                            unsubscribe();
                                            return;
                                        }
                                    } else if (j > 0) {
                                        int i3 = 0;
                                        while (i < iM7822c && j > 0) {
                                            if (z3g0Var.isUnsubscribed()) {
                                                return;
                                            }
                                            if (i2 == length) {
                                                objArrM7821b = (Object[]) objArrM7821b[length];
                                                i2 = 0;
                                            }
                                            Object obj2 = objArrM7821b[i2];
                                            try {
                                                if (notificationLite.m9793a(z3g0Var, obj2)) {
                                                    try {
                                                        unsubscribe();
                                                        return;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        z = true;
                                                        try {
                                                            f5f.m3964e(th);
                                                            unsubscribe();
                                                            if (notificationLite.m9799h(obj2) || notificationLite.m9798g(obj2)) {
                                                                return;
                                                            }
                                                            z3g0Var.onError(OnErrorThrowable.addValueAsLastCause(th, notificationLite.m9797e(obj2)));
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
                                        this.currentBuffer = objArrM7821b;
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

        @Override // p003l.rc90
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

        @Override // p003l.c4g0
        public void unsubscribe() {
            if (get() < 0 || getAndSet(-1L) < 0) {
                return;
            }
            this.state.m9791h(this);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.CachedObservable$a */
    public static final class C1107a<T> extends tmr implements m250<T> {

        /* JADX INFO: renamed from: l */
        public static final ReplayProducer<?>[] f10754l = new ReplayProducer[0];

        /* JADX INFO: renamed from: f */
        public final C1099c<? extends T> f10755f;

        /* JADX INFO: renamed from: g */
        public final rie0 f10756g;

        /* JADX INFO: renamed from: h */
        public volatile ReplayProducer<?>[] f10757h;

        /* JADX INFO: renamed from: i */
        public final NotificationLite<T> f10758i;

        /* JADX INFO: renamed from: j */
        public volatile boolean f10759j;

        /* JADX INFO: renamed from: k */
        public boolean f10760k;

        /* JADX INFO: renamed from: rx.internal.operators.CachedObservable$a$a */
        public class a extends z3g0<T> {
            public a() {
            }

            @Override // p003l.m250
            public void onCompleted() throws Throwable {
                C1107a.this.onCompleted();
            }

            @Override // p003l.m250
            public void onError(Throwable th) throws Throwable {
                C1107a.this.onError(th);
            }

            @Override // p003l.m250
            public void onNext(T t) throws Throwable {
                C1107a.this.onNext(t);
            }
        }

        public C1107a(C1099c<? extends T> c1099c, int i) {
            super(i);
            this.f10755f = c1099c;
            this.f10757h = f10754l;
            this.f10758i = NotificationLite.m9792f();
            this.f10756g = new rie0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: e */
        public void m9788e(ReplayProducer<T> replayProducer) {
            synchronized (this.f10756g) {
                ReplayProducer<?>[] replayProducerArr = this.f10757h;
                int length = replayProducerArr.length;
                ReplayProducer<?>[] replayProducerArr2 = new ReplayProducer[length + 1];
                System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, length);
                replayProducerArr2[length] = replayProducer;
                this.f10757h = replayProducerArr2;
            }
        }

        /* JADX INFO: renamed from: f */
        public void m9789f() {
            a aVar = new a();
            this.f10756g.m7260b(aVar);
            this.f10755f.unsafeSubscribe(aVar);
            this.f10759j = true;
        }

        /* JADX INFO: renamed from: g */
        public void m9790g() throws Throwable {
            for (ReplayProducer<?> replayProducer : this.f10757h) {
                replayProducer.replay();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m9791h(ReplayProducer<T> replayProducer) {
            synchronized (this.f10756g) {
                try {
                    ReplayProducer<?>[] replayProducerArr = this.f10757h;
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
                        this.f10757h = f10754l;
                        return;
                    }
                    ReplayProducer<?>[] replayProducerArr2 = new ReplayProducer[length - 1];
                    System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, i);
                    System.arraycopy(replayProducerArr, i + 1, replayProducerArr2, i, (length - i) - 1);
                    this.f10757h = replayProducerArr2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p003l.m250
        public void onCompleted() throws Throwable {
            if (this.f10760k) {
                return;
            }
            this.f10760k = true;
            m7820a(this.f10758i.m9794b());
            this.f10756g.unsubscribe();
            m9790g();
        }

        @Override // p003l.m250
        public void onError(Throwable th) throws Throwable {
            if (this.f10760k) {
                return;
            }
            this.f10760k = true;
            m7820a(this.f10758i.m9795c(th));
            this.f10756g.unsubscribe();
            m9790g();
        }

        @Override // p003l.m250
        public void onNext(T t) throws Throwable {
            if (this.f10760k) {
                return;
            }
            m7820a(this.f10758i.m9801j(t));
            m9790g();
        }
    }

    public CachedObservable(C1099c.a<T> aVar, C1107a<T> c1107a) {
        super(aVar);
        this.f10753a = c1107a;
    }

    /* JADX INFO: renamed from: a */
    public static <T> CachedObservable<T> m9786a(C1099c<? extends T> c1099c) {
        return m9787b(c1099c, 16);
    }

    /* JADX INFO: renamed from: b */
    public static <T> CachedObservable<T> m9787b(C1099c<? extends T> c1099c, int i) {
        if (i >= 1) {
            C1107a c1107a = new C1107a(c1099c, i);
            return new CachedObservable<>(new CachedSubscribe(c1107a), c1107a);
        }
        ig3.a("capacityHint > 0 required");
        return null;
    }
}
