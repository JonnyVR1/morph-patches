package p014rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import l.f31;
import l.ig3;
import l.qkq0;
import p003l.c4g0;
import p003l.d30;
import p003l.e30;
import p003l.h4g0;
import p003l.igh0;
import p003l.rc90;
import p003l.rjd0;
import p003l.vv5;
import p003l.w9j;
import p003l.z3g0;
import p014rx.C1099c;
import p014rx.exceptions.MissingBackpressureException;
import p014rx.internal.util.unsafe.SpscArrayQueue;
import p014rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class OperatorPublish<T> extends vv5<T> {

    /* JADX INFO: renamed from: a */
    public final C1099c<? extends T> f10894a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C1131c<T>> f10895b;

    public static final class InnerProducer<T> extends AtomicLong implements rc90, c4g0 {
        static final long NOT_REQUESTED = -4611686018427387904L;
        static final long UNSUBSCRIBED = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;
        final z3g0<? super T> child;
        final C1131c<T> parent;

        public InnerProducer(C1131c<T> c1131c, z3g0<? super T> z3g0Var) {
            this.parent = c1131c;
            this.child = z3g0Var;
            lazySet(NOT_REQUESTED);
        }

        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return get() == UNSUBSCRIBED;
        }

        public long produced(long j) {
            long j2;
            long j3;
            if (j <= 0) {
                ig3.a("Cant produce zero or less");
                return 0L;
            }
            do {
                j2 = get();
                if (j2 == NOT_REQUESTED) {
                    qkq0.a("Produced without request");
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

        @Override // p003l.rc90
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
            this.parent.m9869i();
        }

        @Override // p003l.c4g0
        public void unsubscribe() throws Throwable {
            if (get() == UNSUBSCRIBED || getAndSet(UNSUBSCRIBED) == UNSUBSCRIBED) {
                return;
            }
            this.parent.m9871k(this);
            this.parent.m9869i();
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorPublish$a */
    public static class C1129a implements C1099c.a<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicReference f10896a;

        public C1129a(AtomicReference atomicReference) {
            this.f10896a = atomicReference;
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            while (true) {
                C1131c c1131c = (C1131c) this.f10896a.get();
                if (c1131c == null || c1131c.isUnsubscribed()) {
                    C1131c c1131c2 = new C1131c(this.f10896a);
                    c1131c2.m9870j();
                    if (f31.a(this.f10896a, c1131c, c1131c2)) {
                        c1131c = c1131c2;
                    } else {
                        continue;
                    }
                }
                InnerProducer<T> innerProducer = new InnerProducer<>(c1131c, z3g0Var);
                if (c1131c.m9867g(innerProducer)) {
                    z3g0Var.m9240b(innerProducer);
                    z3g0Var.mo3257f(innerProducer);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: rx.internal.operators.OperatorPublish$b */
    public static class C1130b<R> implements C1099c.a<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f10897a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ w9j f10898b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1099c f10899c;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorPublish$b$a */
        public class a extends z3g0<R> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ z3g0 f10900e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ OnSubscribePublishMulticast f10901f;

            public a(z3g0 z3g0Var, OnSubscribePublishMulticast onSubscribePublishMulticast) {
                this.f10900e = z3g0Var;
                this.f10901f = onSubscribePublishMulticast;
            }

            @Override // p003l.z3g0
            /* JADX INFO: renamed from: f */
            public void mo3257f(rc90 rc90Var) {
                this.f10900e.mo3257f(rc90Var);
            }

            @Override // p003l.m250
            public void onCompleted() {
                this.f10901f.unsubscribe();
                this.f10900e.onCompleted();
            }

            @Override // p003l.m250
            public void onError(Throwable th) {
                this.f10901f.unsubscribe();
                this.f10900e.onError(th);
            }

            @Override // p003l.m250
            public void onNext(R r) {
                this.f10900e.onNext(r);
            }
        }

        public C1130b(boolean z, w9j w9jVar, C1099c c1099c) {
            this.f10897a = z;
            this.f10898b = w9jVar;
            this.f10899c = c1099c;
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super R> z3g0Var) {
            OnSubscribePublishMulticast onSubscribePublishMulticast = new OnSubscribePublishMulticast(rjd0.f6938g, this.f10897a);
            a aVar = new a(z3g0Var, onSubscribePublishMulticast);
            z3g0Var.m9240b(onSubscribePublishMulticast);
            z3g0Var.m9240b(aVar);
            ((C1099c) this.f10898b.call(C1099c.create(onSubscribePublishMulticast))).unsafeSubscribe(aVar);
            this.f10899c.unsafeSubscribe(onSubscribePublishMulticast.subscriber());
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorPublish$c */
    public static final class C1131c<T> extends z3g0<T> implements c4g0 {

        /* JADX INFO: renamed from: m */
        public static final InnerProducer[] f10903m = new InnerProducer[0];

        /* JADX INFO: renamed from: n */
        public static final InnerProducer[] f10904n = new InnerProducer[0];

        /* JADX INFO: renamed from: e */
        public final Queue<Object> f10905e;

        /* JADX INFO: renamed from: f */
        public final NotificationLite<T> f10906f;

        /* JADX INFO: renamed from: g */
        public final AtomicReference<C1131c<T>> f10907g;

        /* JADX INFO: renamed from: h */
        public volatile Object f10908h;

        /* JADX INFO: renamed from: i */
        public final AtomicReference<InnerProducer[]> f10909i;

        /* JADX INFO: renamed from: j */
        public final AtomicBoolean f10910j;

        /* JADX INFO: renamed from: k */
        public boolean f10911k;

        /* JADX INFO: renamed from: l */
        public boolean f10912l;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorPublish$c$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p003l.d30
            public void call() {
                C1131c.this.f10909i.getAndSet(C1131c.f10904n);
                C1131c c1131c = C1131c.this;
                f31.a(c1131c.f10907g, c1131c, (Object) null);
            }
        }

        public C1131c(AtomicReference<C1131c<T>> atomicReference) {
            this.f10905e = UnsafeAccess.isUnsafeAvailable() ? new SpscArrayQueue<>(rjd0.f6938g) : new igh0<>(rjd0.f6938g);
            this.f10906f = NotificationLite.m9792f();
            this.f10909i = new AtomicReference<>(f10903m);
            this.f10907g = atomicReference;
            this.f10910j = new AtomicBoolean();
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            m9242e(rjd0.f6938g);
        }

        /* JADX INFO: renamed from: g */
        public boolean m9867g(InnerProducer<T> innerProducer) {
            InnerProducer[] innerProducerArr;
            InnerProducer[] innerProducerArr2;
            innerProducer.getClass();
            do {
                innerProducerArr = this.f10909i.get();
                if (innerProducerArr == f10904n) {
                    return false;
                }
                int length = innerProducerArr.length;
                innerProducerArr2 = new InnerProducer[length + 1];
                System.arraycopy(innerProducerArr, 0, innerProducerArr2, 0, length);
                innerProducerArr2[length] = innerProducer;
            } while (!f31.a(this.f10909i, innerProducerArr, innerProducerArr2));
            return true;
        }

        /* JADX INFO: renamed from: h */
        public boolean m9868h(Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                if (!this.f10906f.m9798g(obj)) {
                    Throwable thM9796d = this.f10906f.m9796d(obj);
                    f31.a(this.f10907g, this, (Object) null);
                    try {
                        InnerProducer[] andSet = this.f10909i.getAndSet(f10904n);
                        int length = andSet.length;
                        while (i < length) {
                            andSet[i].child.onError(thM9796d);
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
                    f31.a(this.f10907g, this, (Object) null);
                    try {
                        InnerProducer[] andSet2 = this.f10909i.getAndSet(f10904n);
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
        public void m9869i() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p014rx.internal.operators.OperatorPublish.C1131c.m9869i():void");
        }

        /* JADX INFO: renamed from: j */
        public void m9870j() {
            m9240b(h4g0.m4914a(new a()));
        }

        /* JADX INFO: renamed from: k */
        public void m9871k(InnerProducer<T> innerProducer) {
            InnerProducer[] innerProducerArr;
            InnerProducer[] innerProducerArr2;
            do {
                innerProducerArr = this.f10909i.get();
                if (innerProducerArr == f10903m || innerProducerArr == f10904n) {
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
                    innerProducerArr2 = f10903m;
                } else {
                    InnerProducer[] innerProducerArr3 = new InnerProducer[length - 1];
                    System.arraycopy(innerProducerArr, 0, innerProducerArr3, 0, i);
                    System.arraycopy(innerProducerArr, i + 1, innerProducerArr3, i, (length - i) - 1);
                    innerProducerArr2 = innerProducerArr3;
                }
            } while (!f31.a(this.f10909i, innerProducerArr, innerProducerArr2));
        }

        @Override // p003l.m250
        public void onCompleted() throws Throwable {
            if (this.f10908h == null) {
                this.f10908h = this.f10906f.m9794b();
                m9869i();
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) throws Throwable {
            if (this.f10908h == null) {
                this.f10908h = this.f10906f.m9795c(th);
                m9869i();
            }
        }

        @Override // p003l.m250
        public void onNext(T t) throws Throwable {
            if (this.f10905e.offer(this.f10906f.m9801j(t))) {
                m9869i();
            } else {
                onError(new MissingBackpressureException());
            }
        }
    }

    public OperatorPublish(C1099c.a<T> aVar, C1099c<? extends T> c1099c, AtomicReference<C1131c<T>> atomicReference) {
        super(aVar);
        this.f10894a = c1099c;
        this.f10895b = atomicReference;
    }

    /* JADX INFO: renamed from: e */
    public static <T> vv5<T> m9862e(C1099c<? extends T> c1099c) {
        AtomicReference atomicReference = new AtomicReference();
        return new OperatorPublish(new C1129a(atomicReference), c1099c, atomicReference);
    }

    /* JADX INFO: renamed from: f */
    public static <T, R> C1099c<R> m9863f(C1099c<? extends T> c1099c, w9j<? super C1099c<T>, ? extends C1099c<R>> w9jVar) {
        return m9864g(c1099c, w9jVar, false);
    }

    /* JADX INFO: renamed from: g */
    public static <T, R> C1099c<R> m9864g(C1099c<? extends T> c1099c, w9j<? super C1099c<T>, ? extends C1099c<R>> w9jVar, boolean z) {
        return C1099c.create(new C1130b(z, w9jVar, c1099c));
    }

    @Override // p003l.vv5
    /* JADX INFO: renamed from: c */
    public void mo8404c(e30<? super c4g0> e30Var) {
        C1131c<T> c1131c;
        while (true) {
            c1131c = this.f10895b.get();
            if (c1131c != null && !c1131c.isUnsubscribed()) {
                break;
            }
            C1131c<T> c1131c2 = new C1131c<>(this.f10895b);
            c1131c2.m9870j();
            if (f31.a(this.f10895b, c1131c, c1131c2)) {
                c1131c = c1131c2;
                break;
            }
        }
        boolean z = false;
        if (!c1131c.f10910j.get() && c1131c.f10910j.compareAndSet(false, true)) {
            z = true;
        }
        e30Var.call(c1131c);
        if (z) {
            this.f10894a.unsafeSubscribe(c1131c);
        }
    }
}
