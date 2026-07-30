package p014rx.internal.operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import l.f31;
import p003l.c4g0;
import p003l.ejd0;
import p003l.faj;
import p003l.grf0;
import p003l.kc2;
import p003l.rc90;
import p003l.rjd0;
import p003l.y3g0;
import p003l.z3g0;
import p014rx.C1099c;
import p014rx.exceptions.CompositeException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class OnSubscribeCombineLatest<T, R> implements C1099c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C1099c<? extends T>[] f10767a;

    /* JADX INFO: renamed from: b */
    public final Iterable<? extends C1099c<? extends T>> f10768b;

    /* JADX INFO: renamed from: c */
    public final faj<? extends R> f10769c;

    /* JADX INFO: renamed from: d */
    public final int f10770d;

    /* JADX INFO: renamed from: e */
    public final boolean f10771e;

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
        final C1110a<T, R>[] subscribers;

        public LatestCoordinator(z3g0<? super R> z3g0Var, faj<? extends R> fajVar, int i, int i2, boolean z) {
            this.actual = z3g0Var;
            this.combiner = fajVar;
            this.count = i;
            this.bufferSize = i2;
            this.delayError = z;
            Object[] objArr = new Object[i];
            this.latest = objArr;
            Arrays.fill(objArr, MISSING);
            this.subscribers = new C1110a[i];
            this.queue = new grf0<>(i2);
            this.requested = new AtomicLong();
            this.error = new AtomicReference<>();
        }

        public void cancel(Queue<?> queue) {
            queue.clear();
            for (C1110a<T, R> c1110a : this.subscribers) {
                c1110a.unsubscribe();
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
            C1110a<T, R> c1110a = this.subscribers[i];
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
                        objArr[i] = c1110a.f10774g.m9797e(obj);
                    }
                    z = i2 == length;
                    if (i3 == length || (obj == null && obj2 == obj3)) {
                        this.done = true;
                    } else if (obj != null && z) {
                        this.queue.m4694s(c1110a, this.latest.clone());
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
                c1110a.m9803g(1L);
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
                    C1110a c1110a = (C1110a) grf0Var.peek();
                    boolean z3 = c1110a == null;
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
                        c1110a.m9803g(1L);
                        j2++;
                    } catch (Throwable th) {
                        latestCoordinator.cancelled = true;
                        latestCoordinator.cancel(grf0Var);
                        z3g0Var.onError(th);
                        return;
                    }
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    kc2.m5647i(atomicLong, j2);
                }
                iAddAndGet = latestCoordinator.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    this = latestCoordinator;
                }
            }
        }

        @Override // p003l.c4g0
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
            } while (!f31.a(atomicReference, th2, compositeException));
        }

        @Override // p003l.rc90
        public void request(long j) {
            if (j < 0) {
                y3g0.m8887a("n >= required but it was ", j);
            } else if (j != 0) {
                kc2.m5640b(this.requested, j);
                drain();
            }
        }

        public void subscribe(C1099c<? extends T>[] c1099cArr) {
            C1110a<T, R>[] c1110aArr = this.subscribers;
            int length = c1110aArr.length;
            for (int i = 0; i < length; i++) {
                c1110aArr[i] = new C1110a<>(this, i);
            }
            lazySet(0);
            this.actual.m9240b(this);
            this.actual.mo3257f(this);
            for (int i2 = 0; i2 < length && !this.cancelled; i2++) {
                c1099cArr[i2].subscribe((z3g0<? super Object>) c1110aArr[i2]);
            }
        }

        @Override // p003l.c4g0
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
    public static final class C1110a<T, R> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final LatestCoordinator<T, R> f10772e;

        /* JADX INFO: renamed from: f */
        public final int f10773f;

        /* JADX INFO: renamed from: g */
        public final NotificationLite<T> f10774g = NotificationLite.m9792f();

        /* JADX INFO: renamed from: h */
        public boolean f10775h;

        public C1110a(LatestCoordinator<T, R> latestCoordinator, int i) {
            this.f10772e = latestCoordinator;
            this.f10773f = i;
            m9242e(latestCoordinator.bufferSize);
        }

        /* JADX INFO: renamed from: g */
        public void m9803g(long j) {
            m9242e(j);
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f10775h) {
                return;
            }
            this.f10775h = true;
            this.f10772e.combine(null, this.f10773f);
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            if (this.f10775h) {
                ejd0.m3864j(th);
                return;
            }
            this.f10772e.onError(th);
            this.f10775h = true;
            this.f10772e.combine(null, this.f10773f);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            if (this.f10775h) {
                return;
            }
            this.f10772e.combine(this.f10774g.m9801j(t), this.f10773f);
        }
    }

    public OnSubscribeCombineLatest(C1099c<? extends T>[] c1099cArr, Iterable<? extends C1099c<? extends T>> iterable, faj<? extends R> fajVar, int i, boolean z) {
        this.f10767a = c1099cArr;
        this.f10768b = iterable;
        this.f10769c = fajVar;
        this.f10770d = i;
        this.f10771e = z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super R> z3g0Var) {
        int length;
        int i;
        C1099c<? extends T>[] c1099cArr = this.f10767a;
        if (c1099cArr == null) {
            Iterable<? extends C1099c<? extends T>> iterable = this.f10768b;
            if (iterable instanceof List) {
                List list = (List) iterable;
                c1099cArr = (C1099c[]) list.toArray(new C1099c[list.size()]);
                length = c1099cArr.length;
            } else {
                C1099c<? extends T>[] c1099cArr2 = new C1099c[8];
                int i2 = 0;
                for (C1099c<? extends T> c1099c : iterable) {
                    if (i2 == c1099cArr2.length) {
                        C1099c<? extends T>[] c1099cArr3 = new C1099c[(i2 >> 2) + i2];
                        System.arraycopy(c1099cArr2, 0, c1099cArr3, 0, i2);
                        c1099cArr2 = c1099cArr3;
                    }
                    c1099cArr2[i2] = c1099c;
                    i2++;
                }
                c1099cArr = c1099cArr2;
                i = i2;
            }
            if (i == 0) {
                z3g0Var.onCompleted();
            } else {
                new LatestCoordinator(z3g0Var, this.f10769c, i, this.f10770d, this.f10771e).subscribe(c1099cArr);
            }
        }
        length = c1099cArr.length;
        i = length;
        if (i == 0) {
            z3g0Var.onCompleted();
        } else {
            new LatestCoordinator(z3g0Var, this.f10769c, i, this.f10770d, this.f10771e).subscribe(c1099cArr);
        }
    }

    public OnSubscribeCombineLatest(Iterable<? extends C1099c<? extends T>> iterable, faj<? extends R> fajVar) {
        this(null, iterable, fajVar, rjd0.f6938g, false);
    }
}
