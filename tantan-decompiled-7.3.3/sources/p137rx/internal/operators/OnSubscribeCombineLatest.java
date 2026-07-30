package p137rx.internal.operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.C22421c;
import p137rx.exceptions.CompositeException;
import p153l.fcg0;
import p153l.gcg0;
import p153l.hrd0;
import p153l.kcg0;
import p153l.m31;
import p153l.pzf0;
import p153l.rc2;
import p153l.urd0;
import p153l.vk90;
import p153l.zcj;

/* JADX INFO: loaded from: classes3.dex */
public final class OnSubscribeCombineLatest<T, R> implements C22421c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C22421c<? extends T>[] f208064a;

    /* JADX INFO: renamed from: b */
    public final Iterable<? extends C22421c<? extends T>> f208065b;

    /* JADX INFO: renamed from: c */
    public final zcj<? extends R> f208066c;

    /* JADX INFO: renamed from: d */
    public final int f208067d;

    /* JADX INFO: renamed from: e */
    public final boolean f208068e;

    public static final class LatestCoordinator<T, R> extends AtomicInteger implements vk90, kcg0 {
        static final Object MISSING = new Object();
        private static final long serialVersionUID = 8567835998786448817L;
        int active;
        final gcg0<? super R> actual;
        final int bufferSize;
        volatile boolean cancelled;
        final zcj<? extends R> combiner;
        int complete;
        final int count;
        final boolean delayError;
        volatile boolean done;
        final AtomicReference<Throwable> error;
        final Object[] latest;
        final pzf0<Object> queue;
        final AtomicLong requested;
        final C22432a<T, R>[] subscribers;

        public LatestCoordinator(gcg0<? super R> gcg0Var, zcj<? extends R> zcjVar, int i, int i2, boolean z) {
            this.actual = gcg0Var;
            this.combiner = zcjVar;
            this.count = i;
            this.bufferSize = i2;
            this.delayError = z;
            Object[] objArr = new Object[i];
            this.latest = objArr;
            Arrays.fill(objArr, MISSING);
            this.subscribers = new C22432a[i];
            this.queue = new pzf0<>(i2);
            this.requested = new AtomicLong();
            this.error = new AtomicReference<>();
        }

        public void cancel(Queue<?> queue) {
            queue.clear();
            for (C22432a<T, R> c22432a : this.subscribers) {
                c22432a.unsubscribe();
            }
        }

        public boolean checkTerminated(boolean z, boolean z2, gcg0<?> gcg0Var, Queue<?> queue, boolean z3) {
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
                    gcg0Var.onError(th);
                } else {
                    gcg0Var.onCompleted();
                }
                return true;
            }
            Throwable th2 = this.error.get();
            if (th2 != null) {
                cancel(queue);
                gcg0Var.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            gcg0Var.onCompleted();
            return true;
        }

        public void combine(Object obj, int i) {
            boolean z;
            C22432a<T, R> c22432a = this.subscribers[i];
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
                        objArr[i] = c22432a.f208071g.m222586e(obj);
                    }
                    z = i2 == length;
                    if (i3 == length || (obj == null && obj2 == obj3)) {
                        this.done = true;
                    } else if (obj != null && z) {
                        this.queue.m174428s(c22432a, this.latest.clone());
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
                c22432a.m222592g(1L);
            }
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            pzf0<Object> pzf0Var = this.queue;
            gcg0<? super R> gcg0Var = this.actual;
            boolean z = this.delayError;
            AtomicLong atomicLong = this.requested;
            int iAddAndGet = 1;
            while (true) {
                LatestCoordinator<T, R> latestCoordinator = this;
                if (latestCoordinator.checkTerminated(this.done, pzf0Var.isEmpty(), gcg0Var, pzf0Var, z)) {
                    return;
                }
                long j = atomicLong.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z2 = latestCoordinator.done;
                    C22432a c22432a = (C22432a) pzf0Var.peek();
                    boolean z3 = c22432a == null;
                    if (latestCoordinator.checkTerminated(z2, z3, gcg0Var, pzf0Var, z)) {
                        return;
                    }
                    if (z3) {
                        break;
                    }
                    pzf0Var.poll();
                    Object[] objArr = (Object[]) pzf0Var.poll();
                    if (objArr == null) {
                        latestCoordinator.cancelled = true;
                        latestCoordinator.cancel(pzf0Var);
                        gcg0Var.onError(new IllegalStateException("Broken queue?! Sender received but not the array."));
                        return;
                    }
                    try {
                        gcg0Var.onNext(latestCoordinator.combiner.call(objArr));
                        c22432a.m222592g(1L);
                        j2++;
                    } catch (Throwable th) {
                        latestCoordinator.cancelled = true;
                        latestCoordinator.cancel(pzf0Var);
                        gcg0Var.onError(th);
                        return;
                    }
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    rc2.m180777i(atomicLong, j2);
                }
                iAddAndGet = latestCoordinator.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    this = latestCoordinator;
                }
            }
        }

        @Override // p153l.kcg0
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
            } while (!m31.m156916a(atomicReference, th2, compositeException));
        }

        @Override // p153l.vk90
        public void request(long j) {
            if (j < 0) {
                fcg0.m125008a("n >= required but it was ", j);
            } else if (j != 0) {
                rc2.m180770b(this.requested, j);
                drain();
            }
        }

        public void subscribe(C22421c<? extends T>[] c22421cArr) {
            C22432a<T, R>[] c22432aArr = this.subscribers;
            int length = c22432aArr.length;
            for (int i = 0; i < length; i++) {
                c22432aArr[i] = new C22432a<>(this, i);
            }
            lazySet(0);
            this.actual.m129866b(this);
            this.actual.mo95773f(this);
            for (int i2 = 0; i2 < length && !this.cancelled; i2++) {
                c22421cArr[i2].subscribe((gcg0<? super Object>) c22432aArr[i2]);
            }
        }

        @Override // p153l.kcg0
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
    public static final class C22432a<T, R> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final LatestCoordinator<T, R> f208069e;

        /* JADX INFO: renamed from: f */
        public final int f208070f;

        /* JADX INFO: renamed from: g */
        public final NotificationLite<T> f208071g = NotificationLite.m222581f();

        /* JADX INFO: renamed from: h */
        public boolean f208072h;

        public C22432a(LatestCoordinator<T, R> latestCoordinator, int i) {
            this.f208069e = latestCoordinator;
            this.f208070f = i;
            m129868e(latestCoordinator.bufferSize);
        }

        /* JADX INFO: renamed from: g */
        public void m222592g(long j) {
            m129868e(j);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f208072h) {
                return;
            }
            this.f208072h = true;
            this.f208069e.combine(null, this.f208070f);
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (this.f208072h) {
                hrd0.m136792j(th);
                return;
            }
            this.f208069e.onError(th);
            this.f208072h = true;
            this.f208069e.combine(null, this.f208070f);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            if (this.f208072h) {
                return;
            }
            this.f208069e.combine(this.f208071g.m222590j(t), this.f208070f);
        }
    }

    public OnSubscribeCombineLatest(C22421c<? extends T>[] c22421cArr, Iterable<? extends C22421c<? extends T>> iterable, zcj<? extends R> zcjVar, int i, boolean z) {
        this.f208064a = c22421cArr;
        this.f208065b = iterable;
        this.f208066c = zcjVar;
        this.f208067d = i;
        this.f208068e = z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super R> gcg0Var) {
        int length;
        int i;
        C22421c<? extends T>[] c22421cArr = this.f208064a;
        if (c22421cArr == null) {
            Iterable<? extends C22421c<? extends T>> iterable = this.f208065b;
            if (iterable instanceof List) {
                List list = (List) iterable;
                c22421cArr = (C22421c[]) list.toArray(new C22421c[list.size()]);
                length = c22421cArr.length;
            } else {
                C22421c<? extends T>[] c22421cArr2 = new C22421c[8];
                int i2 = 0;
                for (C22421c<? extends T> c22421c : iterable) {
                    if (i2 == c22421cArr2.length) {
                        C22421c<? extends T>[] c22421cArr3 = new C22421c[(i2 >> 2) + i2];
                        System.arraycopy(c22421cArr2, 0, c22421cArr3, 0, i2);
                        c22421cArr2 = c22421cArr3;
                    }
                    c22421cArr2[i2] = c22421c;
                    i2++;
                }
                c22421cArr = c22421cArr2;
                i = i2;
            }
            if (i == 0) {
                gcg0Var.onCompleted();
            } else {
                new LatestCoordinator(gcg0Var, this.f208066c, i, this.f208067d, this.f208068e).subscribe(c22421cArr);
            }
        }
        length = c22421cArr.length;
        i = length;
        if (i == 0) {
            gcg0Var.onCompleted();
        } else {
            new LatestCoordinator(gcg0Var, this.f208066c, i, this.f208067d, this.f208068e).subscribe(c22421cArr);
        }
    }

    public OnSubscribeCombineLatest(Iterable<? extends C22421c<? extends T>> iterable, zcj<? extends R> zcjVar) {
        this(null, iterable, zcjVar, urd0.f180601g, false);
    }
}
