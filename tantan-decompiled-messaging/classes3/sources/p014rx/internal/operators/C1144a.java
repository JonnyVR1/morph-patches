package p014rx.internal.operators;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p003l.ejd0;
import p003l.f5f;
import p003l.frf0;
import p003l.grf0;
import p003l.jc2;
import p003l.kc2;
import p003l.rc90;
import p003l.rjd0;
import p003l.w9j;
import p003l.z3g0;
import p014rx.C1099c;
import p014rx.exceptions.MissingBackpressureException;
import p014rx.internal.util.ExceptionsUtils;
import p014rx.internal.util.ScalarSynchronousObservable;
import p014rx.internal.util.unsafe.SpscArrayQueue;
import p014rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: renamed from: rx.internal.operators.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class C1144a<T, R> implements C1099c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C1099c<? extends T> f10990a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super T, ? extends Iterable<? extends R>> f10991b;

    /* JADX INFO: renamed from: c */
    public final int f10992c;

    /* JADX INFO: renamed from: rx.internal.operators.a$a */
    public class a implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f10993a;

        public a(b bVar) {
            this.f10993a = bVar;
        }

        @Override // p003l.rc90
        public void request(long j) {
            this.f10993a.m9910i(j);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.a$b */
    public static final class b<T, R> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super R> f10995e;

        /* JADX INFO: renamed from: f */
        public final w9j<? super T, ? extends Iterable<? extends R>> f10996f;

        /* JADX INFO: renamed from: g */
        public final long f10997g;

        /* JADX INFO: renamed from: h */
        public final Queue<Object> f10998h;

        /* JADX INFO: renamed from: m */
        public volatile boolean f11003m;

        /* JADX INFO: renamed from: n */
        public long f11004n;

        /* JADX INFO: renamed from: o */
        public Iterator<? extends R> f11005o;

        /* JADX INFO: renamed from: i */
        public final AtomicReference<Throwable> f10999i = new AtomicReference<>();

        /* JADX INFO: renamed from: k */
        public final AtomicInteger f11001k = new AtomicInteger();

        /* JADX INFO: renamed from: j */
        public final AtomicLong f11000j = new AtomicLong();

        /* JADX INFO: renamed from: l */
        public final NotificationLite<T> f11002l = NotificationLite.m9792f();

        public b(z3g0<? super R> z3g0Var, w9j<? super T, ? extends Iterable<? extends R>> w9jVar, int i) {
            this.f10995e = z3g0Var;
            this.f10996f = w9jVar;
            if (i == Integer.MAX_VALUE) {
                this.f10997g = Long.MAX_VALUE;
                this.f10998h = new grf0(rjd0.f6938g);
            } else {
                this.f10997g = i - (i >> 2);
                if (UnsafeAccess.isUnsafeAvailable()) {
                    this.f10998h = new SpscArrayQueue(i);
                } else {
                    this.f10998h = new frf0(i);
                }
            }
            m9242e(i);
        }

        /* JADX INFO: renamed from: g */
        public boolean m9908g(boolean z, boolean z2, z3g0<?> z3g0Var, Queue<?> queue) {
            if (z3g0Var.isUnsubscribed()) {
                queue.clear();
                this.f11005o = null;
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f10999i.get() == null) {
                if (!z2) {
                    return false;
                }
                z3g0Var.onCompleted();
                return true;
            }
            Throwable thTerminate = ExceptionsUtils.terminate(this.f10999i);
            unsubscribe();
            queue.clear();
            this.f11005o = null;
            z3g0Var.onError(thTerminate);
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0069  */
        /* JADX WARN: Code duplicated, block: B:31:0x0074  */
        /* JADX WARN: Code duplicated, block: B:34:0x007d  */
        /* JADX WARN: Code duplicated, block: B:39:0x008e  */
        /* JADX WARN: Code duplicated, block: B:50:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:59:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:75:0x00d0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:76:0x00d9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:77:0x00d9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:78:0x00d9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:79:0x00d0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:80:0x00d9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:84:0x0012 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:85:0x0012 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:87:0x0095 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:? A[LOOP:1: B:29:0x0070->B:89:?, LOOP_END, SYNTHETIC] */
        /* JADX INFO: renamed from: h */
        public void m9909h() {
            long j;
            long j2;
            boolean z;
            if (this.f11001k.getAndIncrement() != 0) {
                return;
            }
            z3g0<? super R> z3g0Var = this.f10995e;
            Queue<?> queue = this.f10998h;
            int iAddAndGet = 1;
            while (true) {
                Iterator<? extends R> it = this.f11005o;
                boolean z2 = false;
                if (it == null) {
                    boolean z3 = this.f11003m;
                    Object objPoll = queue.poll();
                    boolean z4 = objPoll == null;
                    if (m9908g(z3, z4, z3g0Var, queue)) {
                        return;
                    }
                    if (!z4) {
                        long j3 = this.f11004n + 1;
                        if (j3 == this.f10997g) {
                            this.f11004n = 0L;
                            m9242e(j3);
                        } else {
                            this.f11004n = j3;
                        }
                        try {
                            it = this.f10996f.call(this.f11002l.m9797e(objPoll)).iterator();
                            if (it.hasNext()) {
                                this.f11005o = it;
                                if (it != null) {
                                    j = this.f11000j.get();
                                    j2 = 0;
                                    while (j2 != j) {
                                        if (m9908g(this.f11003m, false, z3g0Var, queue)) {
                                            return;
                                        }
                                        try {
                                            z3g0Var.onNext(it.next());
                                            if (m9908g(this.f11003m, false, z3g0Var, queue)) {
                                                return;
                                            }
                                            j2++;
                                            try {
                                                if (!it.hasNext()) {
                                                    this.f11005o = null;
                                                    it = null;
                                                    break;
                                                }
                                            } catch (Throwable th) {
                                                f5f.m3964e(th);
                                                this.f11005o = null;
                                                onError(th);
                                            }
                                        } catch (Throwable th2) {
                                            f5f.m3964e(th2);
                                            this.f11005o = null;
                                            onError(th2);
                                        }
                                    }
                                    if (j2 == j) {
                                        z = this.f11003m;
                                        if (queue.isEmpty() && it == null) {
                                            z2 = true;
                                        }
                                        if (m9908g(z, z2, z3g0Var, queue)) {
                                            return;
                                        }
                                    }
                                    if (j2 != 0) {
                                        kc2.m5647i(this.f11000j, j2);
                                    }
                                    if (it == null) {
                                        continue;
                                    }
                                }
                                iAddAndGet = this.f11001k.addAndGet(-iAddAndGet);
                                if (iAddAndGet == 0) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        } catch (Throwable th3) {
                            f5f.m3964e(th3);
                            onError(th3);
                        }
                    }
                }
                if (it != null) {
                    j = this.f11000j.get();
                    j2 = 0;
                    while (j2 != j) {
                        if (m9908g(this.f11003m, false, z3g0Var, queue)) {
                            return;
                        }
                        z3g0Var.onNext(it.next());
                        if (m9908g(this.f11003m, false, z3g0Var, queue)) {
                            return;
                        }
                        j2++;
                        if (!it.hasNext()) {
                            this.f11005o = null;
                            it = null;
                            break;
                        }
                    }
                    if (j2 == j) {
                        z = this.f11003m;
                        if (queue.isEmpty()) {
                            z2 = true;
                        }
                        if (m9908g(z, z2, z3g0Var, queue)) {
                            return;
                        }
                    }
                    if (j2 != 0) {
                        kc2.m5647i(this.f11000j, j2);
                    }
                    if (it == null) {
                        continue;
                    }
                }
                iAddAndGet = this.f11001k.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: i */
        public void m9910i(long j) {
            if (j > 0) {
                kc2.m5640b(this.f11000j, j);
                m9909h();
            } else {
                if (j >= 0) {
                    return;
                }
                jc2.m5313a("n >= 0 required but it was ", j);
            }
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f11003m = true;
            m9909h();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            if (!ExceptionsUtils.addThrowable(this.f10999i, th)) {
                ejd0.m3864j(th);
            } else {
                this.f11003m = true;
                m9909h();
            }
        }

        @Override // p003l.m250
        public void onNext(T t) {
            if (this.f10998h.offer(this.f11002l.m9801j(t))) {
                m9909h();
            } else {
                unsubscribe();
                onError(new MissingBackpressureException());
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.a$c */
    public static final class c<T, R> implements C1099c.a<R> {

        /* JADX INFO: renamed from: a */
        public final T f11006a;

        /* JADX INFO: renamed from: b */
        public final w9j<? super T, ? extends Iterable<? extends R>> f11007b;

        public c(T t, w9j<? super T, ? extends Iterable<? extends R>> w9jVar) {
            this.f11006a = t;
            this.f11007b = w9jVar;
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super R> z3g0Var) {
            try {
                Iterator<? extends R> it = this.f11007b.call(this.f11006a).iterator();
                if (it.hasNext()) {
                    z3g0Var.mo3257f(new OnSubscribeFromIterable.IterableProducer(z3g0Var, it));
                } else {
                    z3g0Var.onCompleted();
                }
            } catch (Throwable th) {
                f5f.m3966g(th, z3g0Var, this.f11006a);
            }
        }
    }

    public C1144a(C1099c<? extends T> c1099c, w9j<? super T, ? extends Iterable<? extends R>> w9jVar, int i) {
        this.f10990a = c1099c;
        this.f10991b = w9jVar;
        this.f10992c = i;
    }

    /* JADX INFO: renamed from: b */
    public static <T, R> C1099c<R> m9906b(C1099c<? extends T> c1099c, w9j<? super T, ? extends Iterable<? extends R>> w9jVar, int i) {
        return c1099c instanceof ScalarSynchronousObservable ? C1099c.create(new c(((ScalarSynchronousObservable) c1099c).m9935c(), w9jVar)) : C1099c.create(new C1144a(c1099c, w9jVar, i));
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super R> z3g0Var) {
        b bVar = new b(z3g0Var, this.f10991b, this.f10992c);
        z3g0Var.m9240b(bVar);
        z3g0Var.mo3257f(new a(bVar));
        this.f10990a.unsafeSubscribe(bVar);
    }
}
