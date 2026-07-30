package p137rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.C22421c;
import p137rx.exceptions.MissingBackpressureException;
import p137rx.internal.util.unsafe.SpscArrayQueue;
import p137rx.internal.util.unsafe.UnsafeAccess;
import p153l.ax5;
import p153l.gcg0;
import p153l.j6f;
import p153l.kcg0;
import p153l.m31;
import p153l.pcg0;
import p153l.poh0;
import p153l.qcj;
import p153l.urd0;
import p153l.vk90;
import p153l.wg3;
import p153l.wtq0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public final class OperatorPublish<T> extends ax5<T> {

    /* JADX INFO: renamed from: a */
    public final C22421c<? extends T> f208191a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C22453c<T>> f208192b;

    public static final class InnerProducer<T> extends AtomicLong implements vk90, kcg0 {
        static final long NOT_REQUESTED = -4611686018427387904L;
        static final long UNSUBSCRIBED = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;
        final gcg0<? super T> child;
        final C22453c<T> parent;

        public InnerProducer(C22453c<T> c22453c, gcg0<? super T> gcg0Var) {
            this.parent = c22453c;
            this.child = gcg0Var;
            lazySet(NOT_REQUESTED);
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return get() == UNSUBSCRIBED;
        }

        public long produced(long j) {
            long j2;
            long j3;
            if (j <= 0) {
                wg3.m206174a("Cant produce zero or less");
                return 0L;
            }
            do {
                j2 = get();
                if (j2 == NOT_REQUESTED) {
                    wtq0.m207906a("Produced without request");
                    return 0L;
                }
                if (j2 == UNSUBSCRIBED) {
                    return UNSUBSCRIBED;
                }
                j3 = j2 - j;
                if (j3 < 0) {
                    throw new IllegalStateException("More produced (" + j + ") than requested (" + j2 + ")");
                }
            } while (!compareAndSet(j2, j3));
            return j3;
        }

        @Override // p153l.vk90
        public void request(long j) throws Throwable {
            long j2;
            long j3;
            if (j < 0) {
                return;
            }
            do {
                j2 = get();
                if (j2 == UNSUBSCRIBED) {
                    return;
                }
                if (j2 >= 0 && j == 0) {
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
            this.parent.m222658i();
        }

        @Override // p153l.kcg0
        public void unsubscribe() throws Throwable {
            if (get() == UNSUBSCRIBED || getAndSet(UNSUBSCRIBED) == UNSUBSCRIBED) {
                return;
            }
            this.parent.m222660k(this);
            this.parent.m222658i();
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorPublish$a */
    public static class C22451a implements C22421c.a<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicReference f208193a;

        public C22451a(AtomicReference atomicReference) {
            this.f208193a = atomicReference;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super T> gcg0Var) {
            while (true) {
                C22453c c22453c = (C22453c) this.f208193a.get();
                if (c22453c == null || c22453c.isUnsubscribed()) {
                    C22453c c22453c2 = new C22453c(this.f208193a);
                    c22453c2.m222659j();
                    if (m31.m156916a(this.f208193a, c22453c, c22453c2)) {
                        c22453c = c22453c2;
                    } else {
                        continue;
                    }
                }
                InnerProducer<T> innerProducer = new InnerProducer<>(c22453c, gcg0Var);
                if (c22453c.m222656g(innerProducer)) {
                    gcg0Var.m129866b(innerProducer);
                    gcg0Var.mo95773f(innerProducer);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: rx.internal.operators.OperatorPublish$b */
    public static class C22452b<R> implements C22421c.a<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f208194a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qcj f208195b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C22421c f208196c;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorPublish$b$a */
        public class a extends gcg0<R> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ gcg0 f208197e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ OnSubscribePublishMulticast f208198f;

            public a(gcg0 gcg0Var, OnSubscribePublishMulticast onSubscribePublishMulticast) {
                this.f208197e = gcg0Var;
                this.f208198f = onSubscribePublishMulticast;
            }

            @Override // p153l.gcg0
            /* JADX INFO: renamed from: f */
            public void mo95773f(vk90 vk90Var) {
                this.f208197e.mo95773f(vk90Var);
            }

            @Override // p153l.bb50
            public void onCompleted() {
                this.f208198f.unsubscribe();
                this.f208197e.onCompleted();
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                this.f208198f.unsubscribe();
                this.f208197e.onError(th);
            }

            @Override // p153l.bb50
            public void onNext(R r) {
                this.f208197e.onNext(r);
            }
        }

        public C22452b(boolean z, qcj qcjVar, C22421c c22421c) {
            this.f208194a = z;
            this.f208195b = qcjVar;
            this.f208196c = c22421c;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super R> gcg0Var) {
            OnSubscribePublishMulticast onSubscribePublishMulticast = new OnSubscribePublishMulticast(urd0.f180601g, this.f208194a);
            a aVar = new a(gcg0Var, onSubscribePublishMulticast);
            gcg0Var.m129866b(onSubscribePublishMulticast);
            gcg0Var.m129866b(aVar);
            ((C22421c) this.f208195b.call(C22421c.create(onSubscribePublishMulticast))).unsafeSubscribe(aVar);
            this.f208196c.unsafeSubscribe(onSubscribePublishMulticast.subscriber());
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorPublish$c */
    public static final class C22453c<T> extends gcg0<T> implements kcg0 {

        /* JADX INFO: renamed from: m */
        public static final InnerProducer[] f208200m = new InnerProducer[0];

        /* JADX INFO: renamed from: n */
        public static final InnerProducer[] f208201n = new InnerProducer[0];

        /* JADX INFO: renamed from: e */
        public final Queue<Object> f208202e;

        /* JADX INFO: renamed from: f */
        public final NotificationLite<T> f208203f;

        /* JADX INFO: renamed from: g */
        public final AtomicReference<C22453c<T>> f208204g;

        /* JADX INFO: renamed from: h */
        public volatile Object f208205h;

        /* JADX INFO: renamed from: i */
        public final AtomicReference<InnerProducer[]> f208206i;

        /* JADX INFO: renamed from: j */
        public final AtomicBoolean f208207j;

        /* JADX INFO: renamed from: k */
        public boolean f208208k;

        /* JADX INFO: renamed from: l */
        public boolean f208209l;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorPublish$c$a */
        public class a implements x20 {
            public a() {
            }

            @Override // p153l.x20
            public void call() {
                C22453c.this.f208206i.getAndSet(C22453c.f208201n);
                C22453c c22453c = C22453c.this;
                m31.m156916a(c22453c.f208204g, c22453c, null);
            }
        }

        public C22453c(AtomicReference<C22453c<T>> atomicReference) {
            this.f208202e = UnsafeAccess.isUnsafeAvailable() ? new SpscArrayQueue<>(urd0.f180601g) : new poh0<>(urd0.f180601g);
            this.f208203f = NotificationLite.m222581f();
            this.f208206i = new AtomicReference<>(f208200m);
            this.f208204g = atomicReference;
            this.f208207j = new AtomicBoolean();
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            m129868e(urd0.f180601g);
        }

        /* JADX INFO: renamed from: g */
        public boolean m222656g(InnerProducer<T> innerProducer) {
            InnerProducer[] innerProducerArr;
            InnerProducer[] innerProducerArr2;
            innerProducer.getClass();
            do {
                innerProducerArr = this.f208206i.get();
                if (innerProducerArr == f208201n) {
                    return false;
                }
                int length = innerProducerArr.length;
                innerProducerArr2 = new InnerProducer[length + 1];
                System.arraycopy(innerProducerArr, 0, innerProducerArr2, 0, length);
                innerProducerArr2[length] = innerProducer;
            } while (!m31.m156916a(this.f208206i, innerProducerArr, innerProducerArr2));
            return true;
        }

        /* JADX INFO: renamed from: h */
        public boolean m222657h(Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                if (!this.f208203f.m222587g(obj)) {
                    Throwable thM222585d = this.f208203f.m222585d(obj);
                    m31.m156916a(this.f208204g, this, null);
                    try {
                        InnerProducer[] andSet = this.f208206i.getAndSet(f208201n);
                        int length = andSet.length;
                        while (i < length) {
                            andSet[i].child.onError(thM222585d);
                            i++;
                        }
                        unsubscribe();
                        return true;
                    } catch (Throwable th) {
                        unsubscribe();
                        throw th;
                    }
                }
                if (z) {
                    m31.m156916a(this.f208204g, this, null);
                    try {
                        InnerProducer[] andSet2 = this.f208206i.getAndSet(f208201n);
                        int length2 = andSet2.length;
                        while (i < length2) {
                            andSet2[i].child.onCompleted();
                            i++;
                        }
                        unsubscribe();
                        return true;
                    } catch (Throwable th2) {
                        unsubscribe();
                        throw th2;
                    }
                }
            }
            return false;
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x00e8 */
        /* JADX WARN: Code duplicated, block: B:88:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:98:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m222658i() throws Throwable {
            boolean z;
            long j;
            synchronized (this) {
                try {
                    boolean z2 = true;
                    if (this.f208208k) {
                        this.f208209l = true;
                        return;
                    }
                    this.f208208k = true;
                    this.f208209l = false;
                    while (true) {
                        try {
                            Object obj = this.f208205h;
                            boolean zIsEmpty = this.f208202e.isEmpty();
                            if (m222657h(obj, zIsEmpty)) {
                                return;
                            }
                            if (!zIsEmpty) {
                                InnerProducer[] innerProducerArr = this.f208206i.get();
                                int length = innerProducerArr.length;
                                long jMin = Long.MAX_VALUE;
                                int i = 0;
                                for (InnerProducer innerProducer : innerProducerArr) {
                                    long j2 = innerProducer.get();
                                    if (j2 >= 0) {
                                        jMin = Math.min(jMin, j2);
                                    } else if (j2 == Long.MIN_VALUE) {
                                        i++;
                                    }
                                }
                                if (length != i) {
                                    int i2 = 0;
                                    while (true) {
                                        j = i2;
                                        if (j >= jMin) {
                                            break;
                                        }
                                        Object obj2 = this.f208205h;
                                        Object objPoll = this.f208202e.poll();
                                        boolean z3 = objPoll == null ? z2 : false;
                                        if (m222657h(obj2, z3)) {
                                            return;
                                        }
                                        if (z3) {
                                            zIsEmpty = z3;
                                            break;
                                        }
                                        T tM222586e = this.f208203f.m222586e(objPoll);
                                        for (InnerProducer innerProducer2 : innerProducerArr) {
                                            if (innerProducer2.get() > 0) {
                                                try {
                                                    innerProducer2.child.onNext(tM222586e);
                                                    innerProducer2.produced(1L);
                                                } catch (Throwable th) {
                                                    innerProducer2.unsubscribe();
                                                    j6f.m143665g(th, innerProducer2.child, tM222586e);
                                                }
                                            }
                                        }
                                        i2++;
                                        zIsEmpty = z3;
                                        z2 = true;
                                    }
                                    if (i2 > 0) {
                                        m129868e(j);
                                    }
                                    if (jMin == 0 || zIsEmpty) {
                                    }
                                    z2 = true;
                                } else if (m222657h(this.f208205h, this.f208202e.poll() == null ? z2 : false)) {
                                    return;
                                } else {
                                    m129868e(1L);
                                }
                            }
                            synchronized (this) {
                                try {
                                    if (this.f208209l) {
                                        this.f208209l = false;
                                    } else {
                                        this.f208208k = false;
                                        try {
                                            return;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            z = true;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    z = false;
                                }
                                while (true) {
                                }
                            }
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                                if (!z) {
                                    synchronized (this) {
                                        this.f208208k = false;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            z = false;
                            if (!z) {
                                synchronized (this) {
                                    this.f208208k = false;
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public void m222659j() {
            m129866b(pcg0.m171648a(new a()));
        }

        /* JADX INFO: renamed from: k */
        public void m222660k(InnerProducer<T> innerProducer) {
            InnerProducer[] innerProducerArr;
            InnerProducer[] innerProducerArr2;
            do {
                innerProducerArr = this.f208206i.get();
                if (innerProducerArr == f208200m || innerProducerArr == f208201n) {
                    return;
                }
                int length = innerProducerArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerProducerArr[i].equals(innerProducer)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerProducerArr2 = f208200m;
                } else {
                    InnerProducer[] innerProducerArr3 = new InnerProducer[length - 1];
                    System.arraycopy(innerProducerArr, 0, innerProducerArr3, 0, i);
                    System.arraycopy(innerProducerArr, i + 1, innerProducerArr3, i, (length - i) - 1);
                    innerProducerArr2 = innerProducerArr3;
                }
            } while (!m31.m156916a(this.f208206i, innerProducerArr, innerProducerArr2));
        }

        @Override // p153l.bb50
        public void onCompleted() throws Throwable {
            if (this.f208205h == null) {
                this.f208205h = this.f208203f.m222583b();
                m222658i();
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) throws Throwable {
            if (this.f208205h == null) {
                this.f208205h = this.f208203f.m222584c(th);
                m222658i();
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) throws Throwable {
            if (this.f208202e.offer(this.f208203f.m222590j(t))) {
                m222658i();
            } else {
                onError(new MissingBackpressureException());
            }
        }
    }

    public OperatorPublish(C22421c.a<T> aVar, C22421c<? extends T> c22421c, AtomicReference<C22453c<T>> atomicReference) {
        super(aVar);
        this.f208191a = c22421c;
        this.f208192b = atomicReference;
    }

    /* JADX INFO: renamed from: e */
    public static <T> ax5<T> m222651e(C22421c<? extends T> c22421c) {
        AtomicReference atomicReference = new AtomicReference();
        return new OperatorPublish(new C22451a(atomicReference), c22421c, atomicReference);
    }

    /* JADX INFO: renamed from: f */
    public static <T, R> C22421c<R> m222652f(C22421c<? extends T> c22421c, qcj<? super C22421c<T>, ? extends C22421c<R>> qcjVar) {
        return m222653g(c22421c, qcjVar, false);
    }

    /* JADX INFO: renamed from: g */
    public static <T, R> C22421c<R> m222653g(C22421c<? extends T> c22421c, qcj<? super C22421c<T>, ? extends C22421c<R>> qcjVar, boolean z) {
        return C22421c.create(new C22452b(z, qcjVar, c22421c));
    }

    @Override // p153l.ax5
    /* JADX INFO: renamed from: c */
    public void mo100759c(y20<? super kcg0> y20Var) {
        C22453c<T> c22453c;
        while (true) {
            c22453c = this.f208192b.get();
            if (c22453c != null && !c22453c.isUnsubscribed()) {
                break;
            }
            C22453c<T> c22453c2 = new C22453c<>(this.f208192b);
            c22453c2.m222659j();
            if (m31.m156916a(this.f208192b, c22453c, c22453c2)) {
                c22453c = c22453c2;
                break;
            }
        }
        boolean z = false;
        if (!c22453c.f208207j.get() && c22453c.f208207j.compareAndSet(false, true)) {
            z = true;
        }
        y20Var.call(c22453c);
        if (z) {
            this.f208191a.unsafeSubscribe(c22453c);
        }
    }
}
