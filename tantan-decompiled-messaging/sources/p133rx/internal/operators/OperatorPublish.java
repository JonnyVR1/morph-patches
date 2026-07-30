package p133rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p133rx.C22306c;
import p133rx.exceptions.MissingBackpressureException;
import p133rx.internal.util.unsafe.SpscArrayQueue;
import p133rx.internal.util.unsafe.UnsafeAccess;
import p149l.c4g0;
import p149l.d30;
import p149l.e30;
import p149l.f31;
import p149l.h4g0;
import p149l.ig3;
import p149l.igh0;
import p149l.qkq0;
import p149l.rc90;
import p149l.rjd0;
import p149l.vv5;
import p149l.w9j;
import p149l.z3g0;

/* JADX INFO: loaded from: classes3.dex */
public final class OperatorPublish<T> extends vv5<T> {

    /* JADX INFO: renamed from: a */
    public final C22306c<? extends T> f207269a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C22338c<T>> f207270b;

    public static final class InnerProducer<T> extends AtomicLong implements rc90, c4g0 {
        static final long NOT_REQUESTED = -4611686018427387904L;
        static final long UNSUBSCRIBED = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;
        final z3g0<? super T> child;
        final C22338c<T> parent;

        public InnerProducer(C22338c<T> c22338c, z3g0<? super T> z3g0Var) {
            this.parent = c22338c;
            this.child = z3g0Var;
            lazySet(NOT_REQUESTED);
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return get() == UNSUBSCRIBED;
        }

        public long produced(long j) {
            long j2;
            long j3;
            if (j <= 0) {
                ig3.m135964a("Cant produce zero or less");
                return 0L;
            }
            do {
                j2 = get();
                if (j2 == NOT_REQUESTED) {
                    qkq0.m175383a("Produced without request");
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

        @Override // p149l.rc90
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
            this.parent.m221412i();
        }

        @Override // p149l.c4g0
        public void unsubscribe() throws Throwable {
            if (get() == UNSUBSCRIBED || getAndSet(UNSUBSCRIBED) == UNSUBSCRIBED) {
                return;
            }
            this.parent.m221414k(this);
            this.parent.m221412i();
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorPublish$a */
    public static class C22336a implements C22306c.a<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicReference f207271a;

        public C22336a(AtomicReference atomicReference) {
            this.f207271a = atomicReference;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            while (true) {
                C22338c c22338c = (C22338c) this.f207271a.get();
                if (c22338c == null || c22338c.isUnsubscribed()) {
                    C22338c c22338c2 = new C22338c(this.f207271a);
                    c22338c2.m221413j();
                    if (f31.m119248a(this.f207271a, c22338c, c22338c2)) {
                        c22338c = c22338c2;
                    } else {
                        continue;
                    }
                }
                InnerProducer<T> innerProducer = new InnerProducer<>(c22338c, z3g0Var);
                if (c22338c.m221410g(innerProducer)) {
                    z3g0Var.m217046b(innerProducer);
                    z3g0Var.mo106696f(innerProducer);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: rx.internal.operators.OperatorPublish$b */
    public static class C22337b<R> implements C22306c.a<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f207272a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ w9j f207273b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C22306c f207274c;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorPublish$b$a */
        public class a extends z3g0<R> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ z3g0 f207275e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ OnSubscribePublishMulticast f207276f;

            public a(z3g0 z3g0Var, OnSubscribePublishMulticast onSubscribePublishMulticast) {
                this.f207275e = z3g0Var;
                this.f207276f = onSubscribePublishMulticast;
            }

            @Override // p149l.z3g0
            /* JADX INFO: renamed from: f */
            public void mo106696f(rc90 rc90Var) {
                this.f207275e.mo106696f(rc90Var);
            }

            @Override // p149l.m250
            public void onCompleted() {
                this.f207276f.unsubscribe();
                this.f207275e.onCompleted();
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                this.f207276f.unsubscribe();
                this.f207275e.onError(th);
            }

            @Override // p149l.m250
            public void onNext(R r) {
                this.f207275e.onNext(r);
            }
        }

        public C22337b(boolean z, w9j w9jVar, C22306c c22306c) {
            this.f207272a = z;
            this.f207273b = w9jVar;
            this.f207274c = c22306c;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super R> z3g0Var) {
            OnSubscribePublishMulticast onSubscribePublishMulticast = new OnSubscribePublishMulticast(rjd0.f159670g, this.f207272a);
            a aVar = new a(z3g0Var, onSubscribePublishMulticast);
            z3g0Var.m217046b(onSubscribePublishMulticast);
            z3g0Var.m217046b(aVar);
            ((C22306c) this.f207273b.call(C22306c.create(onSubscribePublishMulticast))).unsafeSubscribe(aVar);
            this.f207274c.unsafeSubscribe(onSubscribePublishMulticast.subscriber());
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorPublish$c */
    public static final class C22338c<T> extends z3g0<T> implements c4g0 {

        /* JADX INFO: renamed from: m */
        public static final InnerProducer[] f207278m = new InnerProducer[0];

        /* JADX INFO: renamed from: n */
        public static final InnerProducer[] f207279n = new InnerProducer[0];

        /* JADX INFO: renamed from: e */
        public final Queue<Object> f207280e;

        /* JADX INFO: renamed from: f */
        public final NotificationLite<T> f207281f;

        /* JADX INFO: renamed from: g */
        public final AtomicReference<C22338c<T>> f207282g;

        /* JADX INFO: renamed from: h */
        public volatile Object f207283h;

        /* JADX INFO: renamed from: i */
        public final AtomicReference<InnerProducer[]> f207284i;

        /* JADX INFO: renamed from: j */
        public final AtomicBoolean f207285j;

        /* JADX INFO: renamed from: k */
        public boolean f207286k;

        /* JADX INFO: renamed from: l */
        public boolean f207287l;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorPublish$c$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p149l.d30
            public void call() {
                C22338c.this.f207284i.getAndSet(C22338c.f207279n);
                C22338c c22338c = C22338c.this;
                f31.m119248a(c22338c.f207282g, c22338c, null);
            }
        }

        public C22338c(AtomicReference<C22338c<T>> atomicReference) {
            this.f207280e = UnsafeAccess.isUnsafeAvailable() ? new SpscArrayQueue<>(rjd0.f159670g) : new igh0<>(rjd0.f159670g);
            this.f207281f = NotificationLite.m221335f();
            this.f207284i = new AtomicReference<>(f207278m);
            this.f207282g = atomicReference;
            this.f207285j = new AtomicBoolean();
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo99382d() {
            m217048e(rjd0.f159670g);
        }

        /* JADX INFO: renamed from: g */
        public boolean m221410g(InnerProducer<T> innerProducer) {
            InnerProducer[] innerProducerArr;
            InnerProducer[] innerProducerArr2;
            innerProducer.getClass();
            do {
                innerProducerArr = this.f207284i.get();
                if (innerProducerArr == f207279n) {
                    return false;
                }
                int length = innerProducerArr.length;
                innerProducerArr2 = new InnerProducer[length + 1];
                System.arraycopy(innerProducerArr, 0, innerProducerArr2, 0, length);
                innerProducerArr2[length] = innerProducer;
            } while (!f31.m119248a(this.f207284i, innerProducerArr, innerProducerArr2));
            return true;
        }

        /* JADX INFO: renamed from: h */
        public boolean m221411h(Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                if (!this.f207281f.m221341g(obj)) {
                    Throwable thM221339d = this.f207281f.m221339d(obj);
                    f31.m119248a(this.f207282g, this, null);
                    try {
                        InnerProducer[] andSet = this.f207284i.getAndSet(f207279n);
                        int length = andSet.length;
                        while (i < length) {
                            andSet[i].child.onError(thM221339d);
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
                    f31.m119248a(this.f207282g, this, null);
                    try {
                        InnerProducer[] andSet2 = this.f207284i.getAndSet(f207279n);
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
            To view partially-correct add '--show-bad-code' argument
        */
        public void m221412i() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p133rx.internal.operators.OperatorPublish.C22338c.m221412i():void");
        }

        /* JADX INFO: renamed from: j */
        public void m221413j() {
            m217046b(h4g0.m129240a(new a()));
        }

        /* JADX INFO: renamed from: k */
        public void m221414k(InnerProducer<T> innerProducer) {
            InnerProducer[] innerProducerArr;
            InnerProducer[] innerProducerArr2;
            do {
                innerProducerArr = this.f207284i.get();
                if (innerProducerArr == f207278m || innerProducerArr == f207279n) {
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
                    innerProducerArr2 = f207278m;
                } else {
                    InnerProducer[] innerProducerArr3 = new InnerProducer[length - 1];
                    System.arraycopy(innerProducerArr, 0, innerProducerArr3, 0, i);
                    System.arraycopy(innerProducerArr, i + 1, innerProducerArr3, i, (length - i) - 1);
                    innerProducerArr2 = innerProducerArr3;
                }
            } while (!f31.m119248a(this.f207284i, innerProducerArr, innerProducerArr2));
        }

        @Override // p149l.m250
        public void onCompleted() throws Throwable {
            if (this.f207283h == null) {
                this.f207283h = this.f207281f.m221337b();
                m221412i();
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) throws Throwable {
            if (this.f207283h == null) {
                this.f207283h = this.f207281f.m221338c(th);
                m221412i();
            }
        }

        @Override // p149l.m250
        public void onNext(T t) throws Throwable {
            if (this.f207280e.offer(this.f207281f.m221344j(t))) {
                m221412i();
            } else {
                onError(new MissingBackpressureException());
            }
        }
    }

    public OperatorPublish(C22306c.a<T> aVar, C22306c<? extends T> c22306c, AtomicReference<C22338c<T>> atomicReference) {
        super(aVar);
        this.f207269a = c22306c;
        this.f207270b = atomicReference;
    }

    /* JADX INFO: renamed from: e */
    public static <T> vv5<T> m221405e(C22306c<? extends T> c22306c) {
        AtomicReference atomicReference = new AtomicReference();
        return new OperatorPublish(new C22336a(atomicReference), c22306c, atomicReference);
    }

    /* JADX INFO: renamed from: f */
    public static <T, R> C22306c<R> m221406f(C22306c<? extends T> c22306c, w9j<? super C22306c<T>, ? extends C22306c<R>> w9jVar) {
        return m221407g(c22306c, w9jVar, false);
    }

    /* JADX INFO: renamed from: g */
    public static <T, R> C22306c<R> m221407g(C22306c<? extends T> c22306c, w9j<? super C22306c<T>, ? extends C22306c<R>> w9jVar, boolean z) {
        return C22306c.create(new C22337b(z, w9jVar, c22306c));
    }

    @Override // p149l.vv5
    /* JADX INFO: renamed from: c */
    public void mo200174c(e30<? super c4g0> e30Var) {
        C22338c<T> c22338c;
        while (true) {
            c22338c = this.f207270b.get();
            if (c22338c != null && !c22338c.isUnsubscribed()) {
                break;
            }
            C22338c<T> c22338c2 = new C22338c<>(this.f207270b);
            c22338c2.m221413j();
            if (f31.m119248a(this.f207270b, c22338c, c22338c2)) {
                c22338c = c22338c2;
                break;
            }
        }
        boolean z = false;
        if (!c22338c.f207285j.get() && c22338c.f207285j.compareAndSet(false, true)) {
            z = true;
        }
        e30Var.call(c22338c);
        if (z) {
            this.f207269a.unsafeSubscribe(c22338c);
        }
    }
}
