package p133rx.internal.operators;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p133rx.C22306c;
import p133rx.exceptions.MissingBackpressureException;
import p133rx.internal.util.ExceptionsUtils;
import p133rx.internal.util.ScalarSynchronousObservable;
import p133rx.internal.util.unsafe.SpscArrayQueue;
import p133rx.internal.util.unsafe.UnsafeAccess;
import p149l.ejd0;
import p149l.f5f;
import p149l.frf0;
import p149l.grf0;
import p149l.jc2;
import p149l.kc2;
import p149l.rc90;
import p149l.rjd0;
import p149l.w9j;
import p149l.z3g0;

/* JADX INFO: renamed from: rx.internal.operators.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C22351a<T, R> implements C22306c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C22306c<? extends T> f207365a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super T, ? extends Iterable<? extends R>> f207366b;

    /* JADX INFO: renamed from: c */
    public final int f207367c;

    /* JADX INFO: renamed from: rx.internal.operators.a$a */
    public class a implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f207368a;

        public a(b bVar) {
            this.f207368a = bVar;
        }

        @Override // p149l.rc90
        public void request(long j) {
            this.f207368a.m221453i(j);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.a$b */
    public static final class b<T, R> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super R> f207370e;

        /* JADX INFO: renamed from: f */
        public final w9j<? super T, ? extends Iterable<? extends R>> f207371f;

        /* JADX INFO: renamed from: g */
        public final long f207372g;

        /* JADX INFO: renamed from: h */
        public final Queue<Object> f207373h;

        /* JADX INFO: renamed from: m */
        public volatile boolean f207378m;

        /* JADX INFO: renamed from: n */
        public long f207379n;

        /* JADX INFO: renamed from: o */
        public Iterator<? extends R> f207380o;

        /* JADX INFO: renamed from: i */
        public final AtomicReference<Throwable> f207374i = new AtomicReference<>();

        /* JADX INFO: renamed from: k */
        public final AtomicInteger f207376k = new AtomicInteger();

        /* JADX INFO: renamed from: j */
        public final AtomicLong f207375j = new AtomicLong();

        /* JADX INFO: renamed from: l */
        public final NotificationLite<T> f207377l = NotificationLite.m221335f();

        public b(z3g0<? super R> z3g0Var, w9j<? super T, ? extends Iterable<? extends R>> w9jVar, int i) {
            this.f207370e = z3g0Var;
            this.f207371f = w9jVar;
            if (i == Integer.MAX_VALUE) {
                this.f207372g = Long.MAX_VALUE;
                this.f207373h = new grf0(rjd0.f159670g);
            } else {
                this.f207372g = i - (i >> 2);
                if (UnsafeAccess.isUnsafeAvailable()) {
                    this.f207373h = new SpscArrayQueue(i);
                } else {
                    this.f207373h = new frf0(i);
                }
            }
            m217048e(i);
        }

        /* JADX INFO: renamed from: g */
        public boolean m221451g(boolean z, boolean z2, z3g0<?> z3g0Var, Queue<?> queue) {
            if (z3g0Var.isUnsubscribed()) {
                queue.clear();
                this.f207380o = null;
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f207374i.get() == null) {
                if (!z2) {
                    return false;
                }
                z3g0Var.onCompleted();
                return true;
            }
            Throwable thTerminate = ExceptionsUtils.terminate(this.f207374i);
            unsubscribe();
            queue.clear();
            this.f207380o = null;
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
        public void m221452h() {
            long j;
            long j2;
            boolean z;
            if (this.f207376k.getAndIncrement() != 0) {
                return;
            }
            z3g0<? super R> z3g0Var = this.f207370e;
            Queue<?> queue = this.f207373h;
            int iAddAndGet = 1;
            while (true) {
                Iterator<? extends R> it = this.f207380o;
                boolean z2 = false;
                if (it == null) {
                    boolean z3 = this.f207378m;
                    Object objPoll = queue.poll();
                    boolean z4 = objPoll == null;
                    if (m221451g(z3, z4, z3g0Var, queue)) {
                        return;
                    }
                    if (!z4) {
                        long j3 = this.f207379n + 1;
                        if (j3 == this.f207372g) {
                            this.f207379n = 0L;
                            m217048e(j3);
                        } else {
                            this.f207379n = j3;
                        }
                        try {
                            it = this.f207371f.call(this.f207377l.m221340e(objPoll)).iterator();
                            if (it.hasNext()) {
                                this.f207380o = it;
                                if (it != null) {
                                    j = this.f207375j.get();
                                    j2 = 0;
                                    while (j2 != j) {
                                        if (m221451g(this.f207378m, false, z3g0Var, queue)) {
                                            return;
                                        }
                                        try {
                                            z3g0Var.onNext(it.next());
                                            if (m221451g(this.f207378m, false, z3g0Var, queue)) {
                                                return;
                                            }
                                            j2++;
                                            try {
                                                if (!it.hasNext()) {
                                                    this.f207380o = null;
                                                    it = null;
                                                    break;
                                                }
                                            } catch (Throwable th) {
                                                f5f.m119491e(th);
                                                this.f207380o = null;
                                                onError(th);
                                            }
                                        } catch (Throwable th2) {
                                            f5f.m119491e(th2);
                                            this.f207380o = null;
                                            onError(th2);
                                        }
                                    }
                                    if (j2 == j) {
                                        z = this.f207378m;
                                        if (queue.isEmpty() && it == null) {
                                            z2 = true;
                                        }
                                        if (m221451g(z, z2, z3g0Var, queue)) {
                                            return;
                                        }
                                    }
                                    if (j2 != 0) {
                                        kc2.m145343i(this.f207375j, j2);
                                    }
                                    if (it == null) {
                                        continue;
                                    }
                                }
                                iAddAndGet = this.f207376k.addAndGet(-iAddAndGet);
                                if (iAddAndGet == 0) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        } catch (Throwable th3) {
                            f5f.m119491e(th3);
                            onError(th3);
                        }
                    }
                }
                if (it != null) {
                    j = this.f207375j.get();
                    j2 = 0;
                    while (j2 != j) {
                        if (m221451g(this.f207378m, false, z3g0Var, queue)) {
                            return;
                        }
                        z3g0Var.onNext(it.next());
                        if (m221451g(this.f207378m, false, z3g0Var, queue)) {
                            return;
                        }
                        j2++;
                        if (!it.hasNext()) {
                            this.f207380o = null;
                            it = null;
                            break;
                        }
                    }
                    if (j2 == j) {
                        z = this.f207378m;
                        if (queue.isEmpty()) {
                            z2 = true;
                        }
                        if (m221451g(z, z2, z3g0Var, queue)) {
                            return;
                        }
                    }
                    if (j2 != 0) {
                        kc2.m145343i(this.f207375j, j2);
                    }
                    if (it == null) {
                        continue;
                    }
                }
                iAddAndGet = this.f207376k.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: i */
        public void m221453i(long j) {
            if (j > 0) {
                kc2.m145336b(this.f207375j, j);
                m221452h();
            } else {
                if (j >= 0) {
                    return;
                }
                jc2.m140849a("n >= 0 required but it was ", j);
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f207378m = true;
            m221452h();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            if (!ExceptionsUtils.addThrowable(this.f207374i, th)) {
                ejd0.m116793j(th);
            } else {
                this.f207378m = true;
                m221452h();
            }
        }

        @Override // p149l.m250
        public void onNext(T t) {
            if (this.f207373h.offer(this.f207377l.m221344j(t))) {
                m221452h();
            } else {
                unsubscribe();
                onError(new MissingBackpressureException());
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.a$c */
    public static final class c<T, R> implements C22306c.a<R> {

        /* JADX INFO: renamed from: a */
        public final T f207381a;

        /* JADX INFO: renamed from: b */
        public final w9j<? super T, ? extends Iterable<? extends R>> f207382b;

        public c(T t, w9j<? super T, ? extends Iterable<? extends R>> w9jVar) {
            this.f207381a = t;
            this.f207382b = w9jVar;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super R> z3g0Var) {
            try {
                Iterator<? extends R> it = this.f207382b.call(this.f207381a).iterator();
                if (it.hasNext()) {
                    z3g0Var.mo106696f(new OnSubscribeFromIterable.IterableProducer(z3g0Var, it));
                } else {
                    z3g0Var.onCompleted();
                }
            } catch (Throwable th) {
                f5f.m119493g(th, z3g0Var, this.f207381a);
            }
        }
    }

    public C22351a(C22306c<? extends T> c22306c, w9j<? super T, ? extends Iterable<? extends R>> w9jVar, int i) {
        this.f207365a = c22306c;
        this.f207366b = w9jVar;
        this.f207367c = i;
    }

    /* JADX INFO: renamed from: b */
    public static <T, R> C22306c<R> m221449b(C22306c<? extends T> c22306c, w9j<? super T, ? extends Iterable<? extends R>> w9jVar, int i) {
        return c22306c instanceof ScalarSynchronousObservable ? C22306c.create(new c(((ScalarSynchronousObservable) c22306c).m221478c(), w9jVar)) : C22306c.create(new C22351a(c22306c, w9jVar, i));
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super R> z3g0Var) {
        b bVar = new b(z3g0Var, this.f207366b, this.f207367c);
        z3g0Var.m217046b(bVar);
        z3g0Var.mo106696f(new a(bVar));
        this.f207365a.unsafeSubscribe(bVar);
    }
}
