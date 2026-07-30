package p014rx.subjects;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p003l.c4g0;
import p003l.ejd0;
import p003l.f5f;
import p003l.k250;
import p003l.kc2;
import p003l.m250;
import p003l.p3g0;
import p003l.rc90;
import p003l.y3g0;
import p003l.z3g0;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class ReplaySubject<T> extends p3g0<T, T> {

    /* JADX INFO: renamed from: b */
    public static final Object[] f11091b = new Object[0];

    /* JADX INFO: renamed from: a */
    public final ReplayState<T> f11092a;

    public static final class ReplayProducer<T> extends AtomicInteger implements rc90, c4g0 {
        private static final long serialVersionUID = -5006209596735204567L;
        final z3g0<? super T> actual;
        int index;
        Object node;
        final AtomicLong requested = new AtomicLong();
        final ReplayState<T> state;
        int tailIndex;

        public ReplayProducer(z3g0<? super T> z3g0Var, ReplayState<T> replayState) {
            this.actual = z3g0Var;
            this.state = replayState;
        }

        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return this.actual.isUnsubscribed();
        }

        @Override // p003l.rc90
        public void request(long j) {
            if (j > 0) {
                kc2.m5640b(this.requested, j);
                this.state.buffer.mo9959a(this);
            } else {
                if (j >= 0) {
                    return;
                }
                y3g0.m8887a("n >= required but it was ", j);
            }
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
            this.state.remove(this);
        }
    }

    public static final class ReplaySizeBoundBuffer<T> implements InterfaceC1180a<T> {

        /* JADX INFO: renamed from: a */
        public final int f11093a;

        /* JADX INFO: renamed from: b */
        public volatile Node<T> f11094b;

        /* JADX INFO: renamed from: c */
        public Node<T> f11095c;

        /* JADX INFO: renamed from: d */
        public int f11096d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f11097e;

        /* JADX INFO: renamed from: f */
        public Throwable f11098f;

        public static final class Node<T> extends AtomicReference<Node<T>> {
            private static final long serialVersionUID = 3713592843205853725L;
            final T value;

            public Node(T t) {
                this.value = t;
            }
        }

        public ReplaySizeBoundBuffer(int i) {
            this.f11093a = i;
            Node<T> node = new Node<>(null);
            this.f11095c = node;
            this.f11094b = node;
        }

        @Override // p014rx.subjects.ReplaySubject.InterfaceC1180a
        /* JADX INFO: renamed from: a */
        public void mo9959a(ReplayProducer<T> replayProducer) {
            if (replayProducer.getAndIncrement() != 0) {
                return;
            }
            z3g0<? super T> z3g0Var = replayProducer.actual;
            int iAddAndGet = 1;
            do {
                long j = replayProducer.requested.get();
                Node<T> node = (Node) replayProducer.node;
                if (node == null) {
                    node = this.f11094b;
                }
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        break;
                    }
                    if (z3g0Var.isUnsubscribed()) {
                        replayProducer.node = null;
                        return;
                    }
                    boolean z = this.f11097e;
                    Node<T> node2 = node.get();
                    boolean z2 = node2 == null;
                    if (z && z2) {
                        replayProducer.node = null;
                        Throwable th = this.f11098f;
                        if (th != null) {
                            z3g0Var.onError(th);
                            return;
                        } else {
                            z3g0Var.onCompleted();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    z3g0Var.onNext(node2.value);
                    j2++;
                    node = node2;
                }
                if (j2 == j) {
                    if (z3g0Var.isUnsubscribed()) {
                        replayProducer.node = null;
                        return;
                    }
                    boolean z3 = this.f11097e;
                    boolean z4 = node.get() == null;
                    if (z3 && z4) {
                        replayProducer.node = null;
                        Throwable th2 = this.f11098f;
                        if (th2 != null) {
                            z3g0Var.onError(th2);
                            return;
                        } else {
                            z3g0Var.onCompleted();
                            return;
                        }
                    }
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    kc2.m5647i(replayProducer.requested, j2);
                }
                replayProducer.node = node;
                iAddAndGet = replayProducer.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p014rx.subjects.ReplaySubject.InterfaceC1180a
        public void complete() {
            this.f11097e = true;
        }

        @Override // p014rx.subjects.ReplaySubject.InterfaceC1180a
        public void error(Throwable th) {
            this.f11098f = th;
            this.f11097e = true;
        }

        @Override // p014rx.subjects.ReplaySubject.InterfaceC1180a
        public void next(T t) {
            Node<T> node = new Node<>(t);
            this.f11095c.set(node);
            this.f11095c = node;
            int i = this.f11096d;
            if (i == this.f11093a) {
                this.f11094b = this.f11094b.get();
            } else {
                this.f11096d = i + 1;
            }
        }
    }

    public static final class ReplayState<T> extends AtomicReference<ReplayProducer<T>[]> implements C1099c.a<T>, m250<T> {
        static final ReplayProducer[] EMPTY = new ReplayProducer[0];
        static final ReplayProducer[] TERMINATED = new ReplayProducer[0];
        private static final long serialVersionUID = 5952362471246910544L;
        final InterfaceC1180a<T> buffer;

        public ReplayState(InterfaceC1180a<T> interfaceC1180a) {
            this.buffer = interfaceC1180a;
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

        @Override // p003l.e30
        public void call(z3g0<? super T> z3g0Var) {
            ReplayProducer<T> replayProducer = new ReplayProducer<>(z3g0Var, this);
            z3g0Var.m9240b(replayProducer);
            z3g0Var.mo3257f(replayProducer);
            if (add(replayProducer) && replayProducer.isUnsubscribed()) {
                remove(replayProducer);
            } else {
                this.buffer.mo9959a(replayProducer);
            }
        }

        public boolean isTerminated() {
            return get() == TERMINATED;
        }

        @Override // p003l.m250
        public void onCompleted() {
            InterfaceC1180a<T> interfaceC1180a = this.buffer;
            interfaceC1180a.complete();
            for (ReplayProducer<T> replayProducer : getAndSet(TERMINATED)) {
                interfaceC1180a.mo9959a(replayProducer);
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            InterfaceC1180a<T> interfaceC1180a = this.buffer;
            interfaceC1180a.error(th);
            ArrayList arrayList = null;
            for (ReplayProducer<T> replayProducer : getAndSet(TERMINATED)) {
                try {
                    interfaceC1180a.mo9959a(replayProducer);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            f5f.m3963d(arrayList);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            InterfaceC1180a<T> interfaceC1180a = this.buffer;
            interfaceC1180a.next(t);
            for (ReplayProducer<T> replayProducer : get()) {
                interfaceC1180a.mo9959a(replayProducer);
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
    public interface InterfaceC1180a<T> {
        /* JADX INFO: renamed from: a */
        void mo9959a(ReplayProducer<T> replayProducer);

        void complete();

        void error(Throwable th);

        void next(T t);
    }

    /* JADX INFO: renamed from: rx.subjects.ReplaySubject$b */
    public static final class C1181b<T> implements InterfaceC1180a<T> {

        /* JADX INFO: renamed from: a */
        public final int f11099a;

        /* JADX INFO: renamed from: b */
        public volatile int f11100b;

        /* JADX INFO: renamed from: c */
        public final Object[] f11101c;

        /* JADX INFO: renamed from: d */
        public Object[] f11102d;

        /* JADX INFO: renamed from: e */
        public int f11103e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f11104f;

        /* JADX INFO: renamed from: g */
        public Throwable f11105g;

        public C1181b(int i) {
            this.f11099a = i;
            Object[] objArr = new Object[i + 1];
            this.f11101c = objArr;
            this.f11102d = objArr;
        }

        @Override // p014rx.subjects.ReplaySubject.InterfaceC1180a
        /* JADX INFO: renamed from: a */
        public void mo9959a(ReplayProducer<T> replayProducer) {
            long j;
            if (replayProducer.getAndIncrement() != 0) {
                return;
            }
            z3g0<? super T> z3g0Var = replayProducer.actual;
            int i = this.f11099a;
            int iAddAndGet = 1;
            do {
                long j2 = replayProducer.requested.get();
                Object[] objArr = (Object[]) replayProducer.node;
                if (objArr == null) {
                    objArr = this.f11101c;
                }
                int i2 = replayProducer.tailIndex;
                int i3 = replayProducer.index;
                long j3 = 0;
                while (true) {
                    if (j3 == j2) {
                        j = 0;
                        break;
                    }
                    if (z3g0Var.isUnsubscribed()) {
                        replayProducer.node = null;
                        return;
                    }
                    j = 0;
                    boolean z = this.f11104f;
                    boolean z2 = i3 == this.f11100b;
                    if (z && z2) {
                        replayProducer.node = null;
                        Throwable th = this.f11105g;
                        if (th != null) {
                            z3g0Var.onError(th);
                            return;
                        } else {
                            z3g0Var.onCompleted();
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
                    z3g0Var.onNext(objArr[i2]);
                    j3++;
                    i2++;
                    i3++;
                }
                if (j3 == j2) {
                    if (z3g0Var.isUnsubscribed()) {
                        replayProducer.node = null;
                        return;
                    }
                    boolean z3 = this.f11104f;
                    boolean z4 = i3 == this.f11100b;
                    if (z3 && z4) {
                        replayProducer.node = null;
                        Throwable th2 = this.f11105g;
                        if (th2 != null) {
                            z3g0Var.onError(th2);
                            return;
                        } else {
                            z3g0Var.onCompleted();
                            return;
                        }
                    }
                }
                if (j3 != j && j2 != Long.MAX_VALUE) {
                    kc2.m5647i(replayProducer.requested, j3);
                }
                replayProducer.index = i3;
                replayProducer.tailIndex = i2;
                replayProducer.node = objArr;
                iAddAndGet = replayProducer.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p014rx.subjects.ReplaySubject.InterfaceC1180a
        public void complete() {
            this.f11104f = true;
        }

        @Override // p014rx.subjects.ReplaySubject.InterfaceC1180a
        public void error(Throwable th) {
            if (this.f11104f) {
                ejd0.m3864j(th);
            } else {
                this.f11105g = th;
                this.f11104f = true;
            }
        }

        @Override // p014rx.subjects.ReplaySubject.InterfaceC1180a
        public void next(T t) {
            if (this.f11104f) {
                return;
            }
            int i = this.f11103e;
            Object[] objArr = this.f11102d;
            if (i == objArr.length - 1) {
                Object[] objArr2 = new Object[objArr.length];
                objArr2[0] = t;
                this.f11103e = 1;
                objArr[i] = objArr2;
                this.f11102d = objArr2;
            } else {
                objArr[i] = t;
                this.f11103e = i + 1;
            }
            this.f11100b++;
        }
    }

    public ReplaySubject(ReplayState<T> replayState) {
        super(replayState);
        this.f11092a = replayState;
    }

    /* JADX INFO: renamed from: b */
    public static <T> ReplaySubject<T> m9956b() {
        return m9957c(16);
    }

    /* JADX INFO: renamed from: c */
    public static <T> ReplaySubject<T> m9957c(int i) {
        if (i > 0) {
            return new ReplaySubject<>(new ReplayState(new C1181b(i)));
        }
        k250.m5546a("capacity > 0 required but it was ", i);
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static <T> ReplaySubject<T> m9958d(int i) {
        return new ReplaySubject<>(new ReplayState(new ReplaySizeBoundBuffer(i)));
    }

    @Override // p003l.m250
    public void onCompleted() {
        this.f11092a.onCompleted();
    }

    @Override // p003l.m250
    public void onError(Throwable th) {
        this.f11092a.onError(th);
    }

    @Override // p003l.m250
    public void onNext(T t) {
        this.f11092a.onNext(t);
    }
}
