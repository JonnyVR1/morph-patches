package p133rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p133rx.C22306c;
import p133rx.exceptions.MissingBackpressureException;
import p133rx.internal.util.unsafe.SpscArrayQueue;
import p133rx.internal.util.unsafe.UnsafeAccess;
import p149l.c4g0;
import p149l.frf0;
import p149l.k250;
import p149l.kc2;
import p149l.m250;
import p149l.rc90;
import p149l.y3g0;
import p149l.z3g0;

/* JADX INFO: loaded from: classes3.dex */
public final class OnSubscribePublishMulticast<T> extends AtomicInteger implements C22306c.a<T>, m250<T>, c4g0 {
    static final PublishProducer<?>[] EMPTY = new PublishProducer[0];
    static final PublishProducer<?>[] TERMINATED = new PublishProducer[0];
    private static final long serialVersionUID = -3741892510772238743L;
    final boolean delayError;
    volatile boolean done;
    Throwable error;
    final C22321a<T> parent;
    final int prefetch;
    volatile rc90 producer;
    final Queue<T> queue;
    volatile PublishProducer<T>[] subscribers;

    public static final class PublishProducer<T> extends AtomicLong implements rc90, c4g0 {
        private static final long serialVersionUID = 960704844171597367L;
        final z3g0<? super T> actual;
        final AtomicBoolean once = new AtomicBoolean();
        final OnSubscribePublishMulticast<T> parent;

        public PublishProducer(z3g0<? super T> z3g0Var, OnSubscribePublishMulticast<T> onSubscribePublishMulticast) {
            this.actual = z3g0Var;
            this.parent = onSubscribePublishMulticast;
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return this.once.get();
        }

        @Override // p149l.rc90
        public void request(long j) {
            if (j < 0) {
                y3g0.m212802a("n >= 0 required but it was ", j);
            } else if (j != 0) {
                kc2.m145336b(this, j);
                this.parent.drain();
            }
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            if (this.once.compareAndSet(false, true)) {
                this.parent.remove(this);
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OnSubscribePublishMulticast$a */
    public static final class C22321a<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final OnSubscribePublishMulticast<T> f207165e;

        public C22321a(OnSubscribePublishMulticast<T> onSubscribePublishMulticast) {
            this.f207165e = onSubscribePublishMulticast;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo106696f(rc90 rc90Var) {
            this.f207165e.setProducer(rc90Var);
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f207165e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f207165e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f207165e.onNext(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnSubscribePublishMulticast(int i, boolean z) {
        if (i <= 0) {
            k250.m144273a("prefetch > 0 required but it was ", i);
            throw null;
        }
        this.prefetch = i;
        this.delayError = z;
        if (UnsafeAccess.isUnsafeAvailable()) {
            this.queue = new SpscArrayQueue(i);
        } else {
            this.queue = new frf0(i);
        }
        this.subscribers = (PublishProducer<T>[]) EMPTY;
        this.parent = new C22321a<>(this);
    }

    public boolean add(PublishProducer<T> publishProducer) {
        PublishProducer<T>[] publishProducerArr = this.subscribers;
        PublishProducer<?>[] publishProducerArr2 = TERMINATED;
        if (publishProducerArr == publishProducerArr2) {
            return false;
        }
        synchronized (this) {
            try {
                PublishProducer<T>[] publishProducerArr3 = this.subscribers;
                if (publishProducerArr3 == publishProducerArr2) {
                    return false;
                }
                int length = publishProducerArr3.length;
                PublishProducer<T>[] publishProducerArr4 = new PublishProducer[length + 1];
                System.arraycopy(publishProducerArr3, 0, publishProducerArr4, 0, length);
                publishProducerArr4[length] = publishProducer;
                this.subscribers = publishProducerArr4;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.e30
    public void call(z3g0<? super T> z3g0Var) {
        PublishProducer<T> publishProducer = new PublishProducer<>(z3g0Var, this);
        z3g0Var.m217046b(publishProducer);
        z3g0Var.mo106696f(publishProducer);
        if (add(publishProducer)) {
            if (publishProducer.isUnsubscribed()) {
                remove(publishProducer);
                return;
            } else {
                drain();
                return;
            }
        }
        Throwable th = this.error;
        if (th != null) {
            z3g0Var.onError(th);
        } else {
            z3g0Var.onCompleted();
        }
    }

    public boolean checkTerminated(boolean z, boolean z2) {
        int i = 0;
        if (z) {
            if (!this.delayError) {
                Throwable th = this.error;
                if (th != null) {
                    this.queue.clear();
                    PublishProducer<T>[] publishProducerArrTerminate = terminate();
                    int length = publishProducerArrTerminate.length;
                    while (i < length) {
                        publishProducerArrTerminate[i].actual.onError(th);
                        i++;
                    }
                    return true;
                }
                if (z2) {
                    PublishProducer<T>[] publishProducerArrTerminate2 = terminate();
                    int length2 = publishProducerArrTerminate2.length;
                    while (i < length2) {
                        publishProducerArrTerminate2[i].actual.onCompleted();
                        i++;
                    }
                    return true;
                }
            } else if (z2) {
                PublishProducer<T>[] publishProducerArrTerminate3 = terminate();
                Throwable th2 = this.error;
                if (th2 != null) {
                    int length3 = publishProducerArrTerminate3.length;
                    while (i < length3) {
                        publishProducerArrTerminate3[i].actual.onError(th2);
                        i++;
                    }
                } else {
                    int length4 = publishProducerArrTerminate3.length;
                    while (i < length4) {
                        publishProducerArrTerminate3[i].actual.onCompleted();
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        Queue<T> queue = this.queue;
        int iAddAndGet = 0;
        do {
            PublishProducer<T>[] publishProducerArr = this.subscribers;
            int length = publishProducerArr.length;
            long jMin = Long.MAX_VALUE;
            for (PublishProducer<T> publishProducer : publishProducerArr) {
                jMin = Math.min(jMin, publishProducer.get());
            }
            if (length != 0) {
                long j = 0;
                while (j != jMin) {
                    boolean z = this.done;
                    T tPoll = queue.poll();
                    boolean z2 = tPoll == null;
                    if (checkTerminated(z, z2)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    for (PublishProducer<T> publishProducer2 : publishProducerArr) {
                        publishProducer2.actual.onNext(tPoll);
                    }
                    j++;
                }
                if (j == jMin && checkTerminated(this.done, queue.isEmpty())) {
                    return;
                }
                if (j != 0) {
                    rc90 rc90Var = this.producer;
                    if (rc90Var != null) {
                        rc90Var.request(j);
                    }
                    for (PublishProducer<T> publishProducer3 : publishProducerArr) {
                        kc2.m145343i(publishProducer3, j);
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // p149l.c4g0
    public boolean isUnsubscribed() {
        return this.parent.isUnsubscribed();
    }

    @Override // p149l.m250
    public void onCompleted() {
        this.done = true;
        drain();
    }

    @Override // p149l.m250
    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        drain();
    }

    @Override // p149l.m250
    public void onNext(T t) {
        if (!this.queue.offer(t)) {
            this.parent.unsubscribe();
            this.error = new MissingBackpressureException("Queue full?!");
            this.done = true;
        }
        drain();
    }

    public void remove(PublishProducer<T> publishProducer) {
        PublishProducer<?>[] publishProducerArr;
        PublishProducer[] publishProducerArr2;
        PublishProducer<T>[] publishProducerArr3 = this.subscribers;
        PublishProducer<?>[] publishProducerArr4 = TERMINATED;
        if (publishProducerArr3 == publishProducerArr4 || publishProducerArr3 == (publishProducerArr = EMPTY)) {
            return;
        }
        synchronized (this) {
            try {
                PublishProducer<T>[] publishProducerArr5 = this.subscribers;
                if (publishProducerArr5 != publishProducerArr4 && publishProducerArr5 != publishProducerArr) {
                    int length = publishProducerArr5.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (publishProducerArr5[i] == publishProducer) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i < 0) {
                        return;
                    }
                    if (length == 1) {
                        publishProducerArr2 = EMPTY;
                    } else {
                        PublishProducer[] publishProducerArr6 = new PublishProducer[length - 1];
                        System.arraycopy(publishProducerArr5, 0, publishProducerArr6, 0, i);
                        System.arraycopy(publishProducerArr5, i + 1, publishProducerArr6, i, (length - i) - 1);
                        publishProducerArr2 = publishProducerArr6;
                    }
                    this.subscribers = publishProducerArr2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setProducer(rc90 rc90Var) {
        this.producer = rc90Var;
        rc90Var.request(this.prefetch);
    }

    public z3g0<T> subscriber() {
        return this.parent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PublishProducer<T>[] terminate() {
        PublishProducer<T>[] publishProducerArr;
        PublishProducer<T>[] publishProducerArr2 = this.subscribers;
        PublishProducer<T>[] publishProducerArr3 = (PublishProducer<T>[]) TERMINATED;
        if (publishProducerArr2 == publishProducerArr3) {
            return publishProducerArr2;
        }
        synchronized (this) {
            try {
                publishProducerArr = this.subscribers;
                if (publishProducerArr != publishProducerArr3) {
                    this.subscribers = publishProducerArr3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return publishProducerArr;
    }

    @Override // p149l.c4g0
    public void unsubscribe() {
        this.parent.unsubscribe();
    }
}
