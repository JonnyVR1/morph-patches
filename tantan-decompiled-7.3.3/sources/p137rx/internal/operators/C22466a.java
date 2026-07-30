package p137rx.internal.operators;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.C22421c;
import p137rx.exceptions.MissingBackpressureException;
import p137rx.internal.util.ExceptionsUtils;
import p137rx.internal.util.ScalarSynchronousObservable;
import p137rx.internal.util.unsafe.SpscArrayQueue;
import p137rx.internal.util.unsafe.UnsafeAccess;
import p153l.gcg0;
import p153l.hrd0;
import p153l.j6f;
import p153l.ozf0;
import p153l.pzf0;
import p153l.qc2;
import p153l.qcj;
import p153l.rc2;
import p153l.urd0;
import p153l.vk90;

/* JADX INFO: renamed from: rx.internal.operators.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C22466a<T, R> implements C22421c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C22421c<? extends T> f208287a;

    /* JADX INFO: renamed from: b */
    public final qcj<? super T, ? extends Iterable<? extends R>> f208288b;

    /* JADX INFO: renamed from: c */
    public final int f208289c;

    /* JADX INFO: renamed from: rx.internal.operators.a$a */
    public class a implements vk90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f208290a;

        public a(b bVar) {
            this.f208290a = bVar;
        }

        @Override // p153l.vk90
        public void request(long j) {
            this.f208290a.m222699i(j);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.a$b */
    public static final class b<T, R> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super R> f208292e;

        /* JADX INFO: renamed from: f */
        public final qcj<? super T, ? extends Iterable<? extends R>> f208293f;

        /* JADX INFO: renamed from: g */
        public final long f208294g;

        /* JADX INFO: renamed from: h */
        public final Queue<Object> f208295h;

        /* JADX INFO: renamed from: m */
        public volatile boolean f208300m;

        /* JADX INFO: renamed from: n */
        public long f208301n;

        /* JADX INFO: renamed from: o */
        public Iterator<? extends R> f208302o;

        /* JADX INFO: renamed from: i */
        public final AtomicReference<Throwable> f208296i = new AtomicReference<>();

        /* JADX INFO: renamed from: k */
        public final AtomicInteger f208298k = new AtomicInteger();

        /* JADX INFO: renamed from: j */
        public final AtomicLong f208297j = new AtomicLong();

        /* JADX INFO: renamed from: l */
        public final NotificationLite<T> f208299l = NotificationLite.m222581f();

        public b(gcg0<? super R> gcg0Var, qcj<? super T, ? extends Iterable<? extends R>> qcjVar, int i) {
            this.f208292e = gcg0Var;
            this.f208293f = qcjVar;
            if (i == Integer.MAX_VALUE) {
                this.f208294g = Long.MAX_VALUE;
                this.f208295h = new pzf0(urd0.f180601g);
            } else {
                this.f208294g = i - (i >> 2);
                if (UnsafeAccess.isUnsafeAvailable()) {
                    this.f208295h = new SpscArrayQueue(i);
                } else {
                    this.f208295h = new ozf0(i);
                }
            }
            m129868e(i);
        }

        /* JADX INFO: renamed from: g */
        public boolean m222697g(boolean z, boolean z2, gcg0<?> gcg0Var, Queue<?> queue) {
            if (gcg0Var.isUnsubscribed()) {
                queue.clear();
                this.f208302o = null;
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f208296i.get() == null) {
                if (!z2) {
                    return false;
                }
                gcg0Var.onCompleted();
                return true;
            }
            Throwable thTerminate = ExceptionsUtils.terminate(this.f208296i);
            unsubscribe();
            queue.clear();
            this.f208302o = null;
            gcg0Var.onError(thTerminate);
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
        public void m222698h() {
            long j;
            long j2;
            boolean z;
            if (this.f208298k.getAndIncrement() != 0) {
                return;
            }
            gcg0<? super R> gcg0Var = this.f208292e;
            Queue<?> queue = this.f208295h;
            int iAddAndGet = 1;
            while (true) {
                Iterator<? extends R> it = this.f208302o;
                boolean z2 = false;
                if (it == null) {
                    boolean z3 = this.f208300m;
                    Object objPoll = queue.poll();
                    boolean z4 = objPoll == null;
                    if (m222697g(z3, z4, gcg0Var, queue)) {
                        return;
                    }
                    if (!z4) {
                        long j3 = this.f208301n + 1;
                        if (j3 == this.f208294g) {
                            this.f208301n = 0L;
                            m129868e(j3);
                        } else {
                            this.f208301n = j3;
                        }
                        try {
                            it = this.f208293f.call(this.f208299l.m222586e(objPoll)).iterator();
                            if (it.hasNext()) {
                                this.f208302o = it;
                                if (it != null) {
                                    j = this.f208297j.get();
                                    j2 = 0;
                                    while (j2 != j) {
                                        if (m222697g(this.f208300m, false, gcg0Var, queue)) {
                                            return;
                                        }
                                        try {
                                            gcg0Var.onNext(it.next());
                                            if (m222697g(this.f208300m, false, gcg0Var, queue)) {
                                                return;
                                            }
                                            j2++;
                                            try {
                                                if (!it.hasNext()) {
                                                    this.f208302o = null;
                                                    it = null;
                                                    break;
                                                }
                                            } catch (Throwable th) {
                                                j6f.m143663e(th);
                                                this.f208302o = null;
                                                onError(th);
                                            }
                                        } catch (Throwable th2) {
                                            j6f.m143663e(th2);
                                            this.f208302o = null;
                                            onError(th2);
                                        }
                                    }
                                    if (j2 == j) {
                                        z = this.f208300m;
                                        if (queue.isEmpty() && it == null) {
                                            z2 = true;
                                        }
                                        if (m222697g(z, z2, gcg0Var, queue)) {
                                            return;
                                        }
                                    }
                                    if (j2 != 0) {
                                        rc2.m180777i(this.f208297j, j2);
                                    }
                                    if (it == null) {
                                        continue;
                                    }
                                }
                                iAddAndGet = this.f208298k.addAndGet(-iAddAndGet);
                                if (iAddAndGet == 0) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        } catch (Throwable th3) {
                            j6f.m143663e(th3);
                            onError(th3);
                        }
                    }
                }
                if (it != null) {
                    j = this.f208297j.get();
                    j2 = 0;
                    while (j2 != j) {
                        if (m222697g(this.f208300m, false, gcg0Var, queue)) {
                            return;
                        }
                        gcg0Var.onNext(it.next());
                        if (m222697g(this.f208300m, false, gcg0Var, queue)) {
                            return;
                        }
                        j2++;
                        if (!it.hasNext()) {
                            this.f208302o = null;
                            it = null;
                            break;
                        }
                    }
                    if (j2 == j) {
                        z = this.f208300m;
                        if (queue.isEmpty()) {
                            z2 = true;
                        }
                        if (m222697g(z, z2, gcg0Var, queue)) {
                            return;
                        }
                    }
                    if (j2 != 0) {
                        rc2.m180777i(this.f208297j, j2);
                    }
                    if (it == null) {
                        continue;
                    }
                }
                iAddAndGet = this.f208298k.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: i */
        public void m222699i(long j) {
            if (j > 0) {
                rc2.m180770b(this.f208297j, j);
                m222698h();
            } else {
                if (j >= 0) {
                    return;
                }
                qc2.m176107a("n >= 0 required but it was ", j);
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f208300m = true;
            m222698h();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (!ExceptionsUtils.addThrowable(this.f208296i, th)) {
                hrd0.m136792j(th);
            } else {
                this.f208300m = true;
                m222698h();
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            if (this.f208295h.offer(this.f208299l.m222590j(t))) {
                m222698h();
            } else {
                unsubscribe();
                onError(new MissingBackpressureException());
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.a$c */
    public static final class c<T, R> implements C22421c.a<R> {

        /* JADX INFO: renamed from: a */
        public final T f208303a;

        /* JADX INFO: renamed from: b */
        public final qcj<? super T, ? extends Iterable<? extends R>> f208304b;

        public c(T t, qcj<? super T, ? extends Iterable<? extends R>> qcjVar) {
            this.f208303a = t;
            this.f208304b = qcjVar;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super R> gcg0Var) {
            try {
                Iterator<? extends R> it = this.f208304b.call(this.f208303a).iterator();
                if (it.hasNext()) {
                    gcg0Var.mo95773f(new OnSubscribeFromIterable.IterableProducer(gcg0Var, it));
                } else {
                    gcg0Var.onCompleted();
                }
            } catch (Throwable th) {
                j6f.m143665g(th, gcg0Var, this.f208303a);
            }
        }
    }

    public C22466a(C22421c<? extends T> c22421c, qcj<? super T, ? extends Iterable<? extends R>> qcjVar, int i) {
        this.f208287a = c22421c;
        this.f208288b = qcjVar;
        this.f208289c = i;
    }

    /* JADX INFO: renamed from: b */
    public static <T, R> C22421c<R> m222695b(C22421c<? extends T> c22421c, qcj<? super T, ? extends Iterable<? extends R>> qcjVar, int i) {
        return c22421c instanceof ScalarSynchronousObservable ? C22421c.create(new c(((ScalarSynchronousObservable) c22421c).m222724c(), qcjVar)) : C22421c.create(new C22466a(c22421c, qcjVar, i));
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super R> gcg0Var) {
        b bVar = new b(gcg0Var, this.f208288b, this.f208289c);
        gcg0Var.m129866b(bVar);
        gcg0Var.mo95773f(new a(bVar));
        this.f208287a.unsafeSubscribe(bVar);
    }
}
