package p137rx.subjects;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.C22421c;
import p153l.bb50;
import p153l.fcg0;
import p153l.gcg0;
import p153l.hrd0;
import p153l.j6f;
import p153l.kcg0;
import p153l.rc2;
import p153l.vk90;
import p153l.wbg0;
import p153l.za50;

/* JADX INFO: loaded from: classes3.dex */
public final class ReplaySubject<T> extends wbg0<T, T> {

    /* JADX INFO: renamed from: b */
    public static final Object[] f208388b = new Object[0];

    /* JADX INFO: renamed from: a */
    public final ReplayState<T> f208389a;

    public static final class ReplayProducer<T> extends AtomicInteger implements vk90, kcg0 {
        private static final long serialVersionUID = -5006209596735204567L;
        final gcg0<? super T> actual;
        int index;
        Object node;
        final AtomicLong requested = new AtomicLong();
        final ReplayState<T> state;
        int tailIndex;

        public ReplayProducer(gcg0<? super T> gcg0Var, ReplayState<T> replayState) {
            this.actual = gcg0Var;
            this.state = replayState;
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return this.actual.isUnsubscribed();
        }

        @Override // p153l.vk90
        public void request(long j) {
            if (j > 0) {
                rc2.m180770b(this.requested, j);
                this.state.buffer.mo222748a(this);
            } else {
                if (j >= 0) {
                    return;
                }
                fcg0.m125008a("n >= required but it was ", j);
            }
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            this.state.remove(this);
        }
    }

    public static final class ReplaySizeBoundBuffer<T> implements InterfaceC22502a<T> {

        /* JADX INFO: renamed from: a */
        public final int f208390a;

        /* JADX INFO: renamed from: b */
        public volatile Node<T> f208391b;

        /* JADX INFO: renamed from: c */
        public Node<T> f208392c;

        /* JADX INFO: renamed from: d */
        public int f208393d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f208394e;

        /* JADX INFO: renamed from: f */
        public Throwable f208395f;

        public static final class Node<T> extends AtomicReference<Node<T>> {
            private static final long serialVersionUID = 3713592843205853725L;
            final T value;

            public Node(T t) {
                this.value = t;
            }
        }

        public ReplaySizeBoundBuffer(int i) {
            this.f208390a = i;
            Node<T> node = new Node<>(null);
            this.f208392c = node;
            this.f208391b = node;
        }

        @Override // p137rx.subjects.ReplaySubject.InterfaceC22502a
        /* JADX INFO: renamed from: a */
        public void mo222748a(ReplayProducer<T> replayProducer) {
            if (replayProducer.getAndIncrement() != 0) {
                return;
            }
            gcg0<? super T> gcg0Var = replayProducer.actual;
            int iAddAndGet = 1;
            do {
                long j = replayProducer.requested.get();
                Node<T> node = (Node) replayProducer.node;
                if (node == null) {
                    node = this.f208391b;
                }
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        break;
                    }
                    if (gcg0Var.isUnsubscribed()) {
                        replayProducer.node = null;
                        return;
                    }
                    boolean z = this.f208394e;
                    Node<T> node2 = node.get();
                    boolean z2 = node2 == null;
                    if (z && z2) {
                        replayProducer.node = null;
                        Throwable th = this.f208395f;
                        if (th != null) {
                            gcg0Var.onError(th);
                            return;
                        } else {
                            gcg0Var.onCompleted();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    gcg0Var.onNext(node2.value);
                    j2++;
                    node = node2;
                }
                if (j2 == j) {
                    if (gcg0Var.isUnsubscribed()) {
                        replayProducer.node = null;
                        return;
                    }
                    boolean z3 = this.f208394e;
                    boolean z4 = node.get() == null;
                    if (z3 && z4) {
                        replayProducer.node = null;
                        Throwable th2 = this.f208395f;
                        if (th2 != null) {
                            gcg0Var.onError(th2);
                            return;
                        } else {
                            gcg0Var.onCompleted();
                            return;
                        }
                    }
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    rc2.m180777i(replayProducer.requested, j2);
                }
                replayProducer.node = node;
                iAddAndGet = replayProducer.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p137rx.subjects.ReplaySubject.InterfaceC22502a
        public void complete() {
            this.f208394e = true;
        }

        @Override // p137rx.subjects.ReplaySubject.InterfaceC22502a
        public void error(Throwable th) {
            this.f208395f = th;
            this.f208394e = true;
        }

        @Override // p137rx.subjects.ReplaySubject.InterfaceC22502a
        public void next(T t) {
            Node<T> node = new Node<>(t);
            this.f208392c.set(node);
            this.f208392c = node;
            int i = this.f208393d;
            if (i == this.f208390a) {
                this.f208391b = this.f208391b.get();
            } else {
                this.f208393d = i + 1;
            }
        }
    }

    public static final class ReplayState<T> extends AtomicReference<ReplayProducer<T>[]> implements C22421c.a<T>, bb50<T> {
        static final ReplayProducer[] EMPTY = new ReplayProducer[0];
        static final ReplayProducer[] TERMINATED = new ReplayProducer[0];
        private static final long serialVersionUID = 5952362471246910544L;
        final InterfaceC22502a<T> buffer;

        public ReplayState(InterfaceC22502a<T> interfaceC22502a) {
            this.buffer = interfaceC22502a;
            lazySet(EMPTY);
        }

        public boolean add(ReplayProducer<T> replayProducer) {
            ReplayProducer<T>[] replayProducerArr;
            ReplayProducer[] replayProducerArr2;
            do {
                replayProducerArr = get();
                if (replayProducerArr == TERMINATED) {
                    return false;
                }
                int length = replayProducerArr.length;
                replayProducerArr2 = new ReplayProducer[length + 1];
                System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, length);
                replayProducerArr2[length] = replayProducer;
            } while (!compareAndSet(replayProducerArr, replayProducerArr2));
            return true;
        }

        @Override // p153l.y20
        public void call(gcg0<? super T> gcg0Var) {
            ReplayProducer<T> replayProducer = new ReplayProducer<>(gcg0Var, this);
            gcg0Var.m129866b(replayProducer);
            gcg0Var.mo95773f(replayProducer);
            if (add(replayProducer) && replayProducer.isUnsubscribed()) {
                remove(replayProducer);
            } else {
                this.buffer.mo222748a(replayProducer);
            }
        }

        public boolean isTerminated() {
            return get() == TERMINATED;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            InterfaceC22502a<T> interfaceC22502a = this.buffer;
            interfaceC22502a.complete();
            for (ReplayProducer<T> replayProducer : getAndSet(TERMINATED)) {
                interfaceC22502a.mo222748a(replayProducer);
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            InterfaceC22502a<T> interfaceC22502a = this.buffer;
            interfaceC22502a.error(th);
            ArrayList arrayList = null;
            for (ReplayProducer<T> replayProducer : getAndSet(TERMINATED)) {
                try {
                    interfaceC22502a.mo222748a(replayProducer);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            j6f.m143662d(arrayList);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            InterfaceC22502a<T> interfaceC22502a = this.buffer;
            interfaceC22502a.next(t);
            for (ReplayProducer<T> replayProducer : get()) {
                interfaceC22502a.mo222748a(replayProducer);
            }
        }

        public void remove(ReplayProducer<T> replayProducer) {
            ReplayProducer<T>[] replayProducerArr;
            ReplayProducer[] replayProducerArr2;
            do {
                replayProducerArr = get();
                if (replayProducerArr == TERMINATED || replayProducerArr == EMPTY) {
                    return;
                }
                int length = replayProducerArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (replayProducerArr[i] == replayProducer) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    replayProducerArr2 = EMPTY;
                } else {
                    ReplayProducer[] replayProducerArr3 = new ReplayProducer[length - 1];
                    System.arraycopy(replayProducerArr, 0, replayProducerArr3, 0, i);
                    System.arraycopy(replayProducerArr, i + 1, replayProducerArr3, i, (length - i) - 1);
                    replayProducerArr2 = replayProducerArr3;
                }
            } while (!compareAndSet(replayProducerArr, replayProducerArr2));
        }
    }

    /* JADX INFO: renamed from: rx.subjects.ReplaySubject$a */
    public interface InterfaceC22502a<T> {
        /* JADX INFO: renamed from: a */
        void mo222748a(ReplayProducer<T> replayProducer);

        void complete();

        void error(Throwable th);

        void next(T t);
    }

    /* JADX INFO: renamed from: rx.subjects.ReplaySubject$b */
    public static final class C22503b<T> implements InterfaceC22502a<T> {

        /* JADX INFO: renamed from: a */
        public final int f208396a;

        /* JADX INFO: renamed from: b */
        public volatile int f208397b;

        /* JADX INFO: renamed from: c */
        public final Object[] f208398c;

        /* JADX INFO: renamed from: d */
        public Object[] f208399d;

        /* JADX INFO: renamed from: e */
        public int f208400e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f208401f;

        /* JADX INFO: renamed from: g */
        public Throwable f208402g;

        public C22503b(int i) {
            this.f208396a = i;
            Object[] objArr = new Object[i + 1];
            this.f208398c = objArr;
            this.f208399d = objArr;
        }

        @Override // p137rx.subjects.ReplaySubject.InterfaceC22502a
        /* JADX INFO: renamed from: a */
        public void mo222748a(ReplayProducer<T> replayProducer) {
            long j;
            if (replayProducer.getAndIncrement() != 0) {
                return;
            }
            gcg0<? super T> gcg0Var = replayProducer.actual;
            int i = this.f208396a;
            int iAddAndGet = 1;
            do {
                long j2 = replayProducer.requested.get();
                Object[] objArr = (Object[]) replayProducer.node;
                if (objArr == null) {
                    objArr = this.f208398c;
                }
                int i2 = replayProducer.tailIndex;
                int i3 = replayProducer.index;
                long j3 = 0;
                while (true) {
                    if (j3 == j2) {
                        j = 0;
                        break;
                    }
                    if (gcg0Var.isUnsubscribed()) {
                        replayProducer.node = null;
                        return;
                    }
                    j = 0;
                    boolean z = this.f208401f;
                    boolean z2 = i3 == this.f208397b;
                    if (z && z2) {
                        replayProducer.node = null;
                        Throwable th = this.f208402g;
                        if (th != null) {
                            gcg0Var.onError(th);
                            return;
                        } else {
                            gcg0Var.onCompleted();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    if (i2 == i) {
                        objArr = (Object[]) objArr[i2];
                        i2 = 0;
                    }
                    gcg0Var.onNext(objArr[i2]);
                    j3++;
                    i2++;
                    i3++;
                }
                if (j3 == j2) {
                    if (gcg0Var.isUnsubscribed()) {
                        replayProducer.node = null;
                        return;
                    }
                    boolean z3 = this.f208401f;
                    boolean z4 = i3 == this.f208397b;
                    if (z3 && z4) {
                        replayProducer.node = null;
                        Throwable th2 = this.f208402g;
                        if (th2 != null) {
                            gcg0Var.onError(th2);
                            return;
                        } else {
                            gcg0Var.onCompleted();
                            return;
                        }
                    }
                }
                if (j3 != j && j2 != Long.MAX_VALUE) {
                    rc2.m180777i(replayProducer.requested, j3);
                }
                replayProducer.index = i3;
                replayProducer.tailIndex = i2;
                replayProducer.node = objArr;
                iAddAndGet = replayProducer.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p137rx.subjects.ReplaySubject.InterfaceC22502a
        public void complete() {
            this.f208401f = true;
        }

        @Override // p137rx.subjects.ReplaySubject.InterfaceC22502a
        public void error(Throwable th) {
            if (this.f208401f) {
                hrd0.m136792j(th);
            } else {
                this.f208402g = th;
                this.f208401f = true;
            }
        }

        @Override // p137rx.subjects.ReplaySubject.InterfaceC22502a
        public void next(T t) {
            if (this.f208401f) {
                return;
            }
            int i = this.f208400e;
            Object[] objArr = this.f208399d;
            if (i == objArr.length - 1) {
                Object[] objArr2 = new Object[objArr.length];
                objArr2[0] = t;
                this.f208400e = 1;
                objArr[i] = objArr2;
                this.f208399d = objArr2;
            } else {
                objArr[i] = t;
                this.f208400e = i + 1;
            }
            this.f208397b++;
        }
    }

    public ReplaySubject(ReplayState<T> replayState) {
        super(replayState);
        this.f208389a = replayState;
    }

    /* JADX INFO: renamed from: b */
    public static <T> ReplaySubject<T> m222745b() {
        return m222746c(16);
    }

    /* JADX INFO: renamed from: c */
    public static <T> ReplaySubject<T> m222746c(int i) {
        if (i > 0) {
            return new ReplaySubject<>(new ReplayState(new C22503b(i)));
        }
        za50.m219101a("capacity > 0 required but it was ", i);
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static <T> ReplaySubject<T> m222747d(int i) {
        return new ReplaySubject<>(new ReplayState(new ReplaySizeBoundBuffer(i)));
    }

    @Override // p153l.bb50
    public void onCompleted() {
        this.f208389a.onCompleted();
    }

    @Override // p153l.bb50
    public void onError(Throwable th) {
        this.f208389a.onError(th);
    }

    @Override // p153l.bb50
    public void onNext(T t) {
        this.f208389a.onNext(t);
    }
}
