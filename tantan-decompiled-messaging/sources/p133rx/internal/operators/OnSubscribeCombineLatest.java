package p133rx.internal.operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p133rx.C22306c;
import p133rx.exceptions.CompositeException;
import p149l.c4g0;
import p149l.ejd0;
import p149l.f31;
import p149l.faj;
import p149l.grf0;
import p149l.kc2;
import p149l.rc90;
import p149l.rjd0;
import p149l.y3g0;
import p149l.z3g0;

/* JADX INFO: loaded from: classes3.dex */
public final class OnSubscribeCombineLatest<T, R> implements C22306c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C22306c<? extends T>[] f207142a;

    /* JADX INFO: renamed from: b */
    public final Iterable<? extends C22306c<? extends T>> f207143b;

    /* JADX INFO: renamed from: c */
    public final faj<? extends R> f207144c;

    /* JADX INFO: renamed from: d */
    public final int f207145d;

    /* JADX INFO: renamed from: e */
    public final boolean f207146e;

    public static final class LatestCoordinator<T, R> extends AtomicInteger implements rc90, c4g0 {
        static final Object MISSING = new Object();
        private static final long serialVersionUID = 8567835998786448817L;
        int active;
        final z3g0<? super R> actual;
        final int bufferSize;
        volatile boolean cancelled;
        final faj<? extends R> combiner;
        int complete;
        final int count;
        final boolean delayError;
        volatile boolean done;
        final AtomicReference<Throwable> error;
        final Object[] latest;
        final grf0<Object> queue;
        final AtomicLong requested;
        final C22317a<T, R>[] subscribers;

        public LatestCoordinator(z3g0<? super R> z3g0Var, faj<? extends R> fajVar, int i, int i2, boolean z) {
            this.actual = z3g0Var;
            this.combiner = fajVar;
            this.count = i;
            this.bufferSize = i2;
            this.delayError = z;
            Object[] objArr = new Object[i];
            this.latest = objArr;
            Arrays.fill(objArr, MISSING);
            this.subscribers = new C22317a[i];
            this.queue = new grf0<>(i2);
            this.requested = new AtomicLong();
            this.error = new AtomicReference<>();
        }

        public void cancel(Queue<?> queue) {
            queue.clear();
            for (C22317a<T, R> c22317a : this.subscribers) {
                c22317a.unsubscribe();
            }
        }

        public boolean checkTerminated(boolean z, boolean z2, z3g0<?> z3g0Var, Queue<?> queue, boolean z3) {
            if (this.cancelled) {
                cancel(queue);
                return true;
            }
            if (!z) {
                return false;
            }
            if (z3) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.error.get();
                if (th != null) {
                    z3g0Var.onError(th);
                } else {
                    z3g0Var.onCompleted();
                }
                return true;
            }
            Throwable th2 = this.error.get();
            if (th2 != null) {
                cancel(queue);
                z3g0Var.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            z3g0Var.onCompleted();
            return true;
        }

        public void combine(Object obj, int i) {
            boolean z;
            C22317a<T, R> c22317a = this.subscribers[i];
            synchronized (this) {
                try {
                    Object[] objArr = this.latest;
                    int length = objArr.length;
                    Object obj2 = objArr[i];
                    int i2 = this.active;
                    Object obj3 = MISSING;
                    if (obj2 == obj3) {
                        i2++;
                        this.active = i2;
                    }
                    int i3 = this.complete;
                    if (obj == null) {
                        i3++;
                        this.complete = i3;
                    } else {
                        objArr[i] = c22317a.f207149g.m221340e(obj);
                    }
                    z = i2 == length;
                    if (i3 == length || (obj == null && obj2 == obj3)) {
                        this.done = true;
                    } else if (obj != null && z) {
                        this.queue.m127706s(c22317a, this.latest.clone());
                    } else if (obj == null && this.error.get() != null && (obj2 == obj3 || !this.delayError)) {
                        this.done = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z || obj == null) {
                drain();
            } else {
                c22317a.m221346g(1L);
            }
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            grf0<Object> grf0Var = this.queue;
            z3g0<? super R> z3g0Var = this.actual;
            boolean z = this.delayError;
            AtomicLong atomicLong = this.requested;
            int iAddAndGet = 1;
            while (true) {
                LatestCoordinator<T, R> latestCoordinator = this;
                if (latestCoordinator.checkTerminated(this.done, grf0Var.isEmpty(), z3g0Var, grf0Var, z)) {
                    return;
                }
                long j = atomicLong.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z2 = latestCoordinator.done;
                    C22317a c22317a = (C22317a) grf0Var.peek();
                    boolean z3 = c22317a == null;
                    if (latestCoordinator.checkTerminated(z2, z3, z3g0Var, grf0Var, z)) {
                        return;
                    }
                    if (z3) {
                        break;
                    }
                    grf0Var.poll();
                    Object[] objArr = (Object[]) grf0Var.poll();
                    if (objArr == null) {
                        latestCoordinator.cancelled = true;
                        latestCoordinator.cancel(grf0Var);
                        z3g0Var.onError(new IllegalStateException("Broken queue?! Sender received but not the array."));
                        return;
                    }
                    try {
                        z3g0Var.onNext(latestCoordinator.combiner.call(objArr));
                        c22317a.m221346g(1L);
                        j2++;
                    } catch (Throwable th) {
                        latestCoordinator.cancelled = true;
                        latestCoordinator.cancel(grf0Var);
                        z3g0Var.onError(th);
                        return;
                    }
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    kc2.m145343i(atomicLong, j2);
                }
                iAddAndGet = latestCoordinator.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    this = latestCoordinator;
                }
            }
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return this.cancelled;
        }

        public void onError(Throwable th) {
            Throwable th2;
            Throwable compositeException;
            AtomicReference<Throwable> atomicReference = this.error;
            do {
                th2 = atomicReference.get();
                if (th2 == null) {
                    compositeException = th;
                } else if (th2 instanceof CompositeException) {
                    ArrayList arrayList = new ArrayList(((CompositeException) th2).getExceptions());
                    arrayList.add(th);
                    compositeException = new CompositeException(arrayList);
                } else {
                    compositeException = new CompositeException(Arrays.asList(th2, th));
                }
            } while (!f31.m119248a(atomicReference, th2, compositeException));
        }

        @Override // p149l.rc90
        public void request(long j) {
            if (j < 0) {
                y3g0.m212802a("n >= required but it was ", j);
            } else if (j != 0) {
                kc2.m145336b(this.requested, j);
                drain();
            }
        }

        public void subscribe(C22306c<? extends T>[] c22306cArr) {
            C22317a<T, R>[] c22317aArr = this.subscribers;
            int length = c22317aArr.length;
            for (int i = 0; i < length; i++) {
                c22317aArr[i] = new C22317a<>(this, i);
            }
            lazySet(0);
            this.actual.m217046b(this);
            this.actual.mo106696f(this);
            for (int i2 = 0; i2 < length && !this.cancelled; i2++) {
                c22306cArr[i2].subscribe((z3g0<? super Object>) c22317aArr[i2]);
            }
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            if (getAndIncrement() == 0) {
                cancel(this.queue);
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OnSubscribeCombineLatest$a */
    public static final class C22317a<T, R> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final LatestCoordinator<T, R> f207147e;

        /* JADX INFO: renamed from: f */
        public final int f207148f;

        /* JADX INFO: renamed from: g */
        public final NotificationLite<T> f207149g = NotificationLite.m221335f();

        /* JADX INFO: renamed from: h */
        public boolean f207150h;

        public C22317a(LatestCoordinator<T, R> latestCoordinator, int i) {
            this.f207147e = latestCoordinator;
            this.f207148f = i;
            m217048e(latestCoordinator.bufferSize);
        }

        /* JADX INFO: renamed from: g */
        public void m221346g(long j) {
            m217048e(j);
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f207150h) {
                return;
            }
            this.f207150h = true;
            this.f207147e.combine(null, this.f207148f);
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            if (this.f207150h) {
                ejd0.m116793j(th);
                return;
            }
            this.f207147e.onError(th);
            this.f207150h = true;
            this.f207147e.combine(null, this.f207148f);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            if (this.f207150h) {
                return;
            }
            this.f207147e.combine(this.f207149g.m221344j(t), this.f207148f);
        }
    }

    public OnSubscribeCombineLatest(C22306c<? extends T>[] c22306cArr, Iterable<? extends C22306c<? extends T>> iterable, faj<? extends R> fajVar, int i, boolean z) {
        this.f207142a = c22306cArr;
        this.f207143b = iterable;
        this.f207144c = fajVar;
        this.f207145d = i;
        this.f207146e = z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super R> z3g0Var) {
        int length;
        int i;
        C22306c<? extends T>[] c22306cArr = this.f207142a;
        if (c22306cArr == null) {
            Iterable<? extends C22306c<? extends T>> iterable = this.f207143b;
            if (iterable instanceof List) {
                List list = (List) iterable;
                c22306cArr = (C22306c[]) list.toArray(new C22306c[list.size()]);
                length = c22306cArr.length;
            } else {
                C22306c<? extends T>[] c22306cArr2 = new C22306c[8];
                int i2 = 0;
                for (C22306c<? extends T> c22306c : iterable) {
                    if (i2 == c22306cArr2.length) {
                        C22306c<? extends T>[] c22306cArr3 = new C22306c[(i2 >> 2) + i2];
                        System.arraycopy(c22306cArr2, 0, c22306cArr3, 0, i2);
                        c22306cArr2 = c22306cArr3;
                    }
                    c22306cArr2[i2] = c22306c;
                    i2++;
                }
                c22306cArr = c22306cArr2;
                i = i2;
            }
            if (i == 0) {
                z3g0Var.onCompleted();
            } else {
                new LatestCoordinator(z3g0Var, this.f207144c, i, this.f207145d, this.f207146e).subscribe(c22306cArr);
            }
        }
        length = c22306cArr.length;
        i = length;
        if (i == 0) {
            z3g0Var.onCompleted();
        } else {
            new LatestCoordinator(z3g0Var, this.f207144c, i, this.f207145d, this.f207146e).subscribe(c22306cArr);
        }
    }

    public OnSubscribeCombineLatest(Iterable<? extends C22306c<? extends T>> iterable, faj<? extends R> fajVar) {
        this(null, iterable, fajVar, rjd0.f159670g, false);
    }
}
