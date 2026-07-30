package p133rx.subjects;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p133rx.C22306c;
import p149l.c4g0;
import p149l.ejd0;
import p149l.f5f;
import p149l.k250;
import p149l.kc2;
import p149l.m250;
import p149l.p3g0;
import p149l.rc90;
import p149l.y3g0;
import p149l.z3g0;

/* JADX INFO: loaded from: classes3.dex */
public final class ReplaySubject<T> extends p3g0<T, T> {

    /* JADX INFO: renamed from: b */
    public static final Object[] f207466b = new Object[0];

    /* JADX INFO: renamed from: a */
    public final ReplayState<T> f207467a;

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

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return this.actual.isUnsubscribed();
        }

        @Override // p149l.rc90
        public void request(long j) {
            if (j > 0) {
                kc2.m145336b(this.requested, j);
                this.state.buffer.mo221502a(this);
            } else {
                if (j >= 0) {
                    return;
                }
                y3g0.m212802a("n >= required but it was ", j);
            }
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            this.state.remove(this);
        }
    }

    public static final class ReplaySizeBoundBuffer<T> implements InterfaceC22387a<T> {

        /* JADX INFO: renamed from: a */
        public final int f207468a;

        /* JADX INFO: renamed from: b */
        public volatile Node<T> f207469b;

        /* JADX INFO: renamed from: c */
        public Node<T> f207470c;

        /* JADX INFO: renamed from: d */
        public int f207471d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f207472e;

        /* JADX INFO: renamed from: f */
        public Throwable f207473f;

        public static final class Node<T> extends AtomicReference<Node<T>> {
            private static final long serialVersionUID = 3713592843205853725L;
            final T value;

            public Node(T t) {
                this.value = t;
            }
        }

        public ReplaySizeBoundBuffer(int i) {
            this.f207468a = i;
            Node<T> node = new Node<>(null);
            this.f207470c = node;
            this.f207469b = node;
        }

        @Override // p133rx.subjects.ReplaySubject.InterfaceC22387a
        /* JADX INFO: renamed from: a */
        public void mo221502a(ReplayProducer<T> replayProducer) {
            if (replayProducer.getAndIncrement() != 0) {
                return;
            }
            z3g0<? super T> z3g0Var = replayProducer.actual;
            int iAddAndGet = 1;
            do {
                long j = replayProducer.requested.get();
                Node<T> node = (Node) replayProducer.node;
                if (node == null) {
                    node = this.f207469b;
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
                    boolean z = this.f207472e;
                    Node<T> node2 = node.get();
                    boolean z2 = node2 == null;
                    if (z && z2) {
                        replayProducer.node = null;
                        Throwable th = this.f207473f;
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
                    boolean z3 = this.f207472e;
                    boolean z4 = node.get() == null;
                    if (z3 && z4) {
                        replayProducer.node = null;
                        Throwable th2 = this.f207473f;
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
                    kc2.m145343i(replayProducer.requested, j2);
                }
                replayProducer.node = node;
                iAddAndGet = replayProducer.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p133rx.subjects.ReplaySubject.InterfaceC22387a
        public void complete() {
            this.f207472e = true;
        }

        @Override // p133rx.subjects.ReplaySubject.InterfaceC22387a
        public void error(Throwable th) {
            this.f207473f = th;
            this.f207472e = true;
        }

        @Override // p133rx.subjects.ReplaySubject.InterfaceC22387a
        public void next(T t) {
            Node<T> node = new Node<>(t);
            this.f207470c.set(node);
            this.f207470c = node;
            int i = this.f207471d;
            if (i == this.f207468a) {
                this.f207469b = this.f207469b.get();
            } else {
                this.f207471d = i + 1;
            }
        }
    }

    public static final class ReplayState<T> extends AtomicReference<ReplayProducer<T>[]> implements C22306c.a<T>, m250<T> {
        static final ReplayProducer[] EMPTY = new ReplayProducer[0];
        static final ReplayProducer[] TERMINATED = new ReplayProducer[0];
        private static final long serialVersionUID = 5952362471246910544L;
        final InterfaceC22387a<T> buffer;

        public ReplayState(InterfaceC22387a<T> interfaceC22387a) {
            this.buffer = interfaceC22387a;
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

        @Override // p149l.e30
        public void call(z3g0<? super T> z3g0Var) {
            ReplayProducer<T> replayProducer = new ReplayProducer<>(z3g0Var, this);
            z3g0Var.m217046b(replayProducer);
            z3g0Var.mo106696f(replayProducer);
            if (add(replayProducer) && replayProducer.isUnsubscribed()) {
                remove(replayProducer);
            } else {
                this.buffer.mo221502a(replayProducer);
            }
        }

        public boolean isTerminated() {
            return get() == TERMINATED;
        }

        @Override // p149l.m250
        public void onCompleted() {
            InterfaceC22387a<T> interfaceC22387a = this.buffer;
            interfaceC22387a.complete();
            for (ReplayProducer<T> replayProducer : getAndSet(TERMINATED)) {
                interfaceC22387a.mo221502a(replayProducer);
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            InterfaceC22387a<T> interfaceC22387a = this.buffer;
            interfaceC22387a.error(th);
            ArrayList arrayList = null;
            for (ReplayProducer<T> replayProducer : getAndSet(TERMINATED)) {
                try {
                    interfaceC22387a.mo221502a(replayProducer);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            f5f.m119490d(arrayList);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            InterfaceC22387a<T> interfaceC22387a = this.buffer;
            interfaceC22387a.next(t);
            for (ReplayProducer<T> replayProducer : get()) {
                interfaceC22387a.mo221502a(replayProducer);
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
    public interface InterfaceC22387a<T> {
        /* JADX INFO: renamed from: a */
        void mo221502a(ReplayProducer<T> replayProducer);

        void complete();

        void error(Throwable th);

        void next(T t);
    }

    /* JADX INFO: renamed from: rx.subjects.ReplaySubject$b */
    public static final class C22388b<T> implements InterfaceC22387a<T> {

        /* JADX INFO: renamed from: a */
        public final int f207474a;

        /* JADX INFO: renamed from: b */
        public volatile int f207475b;

        /* JADX INFO: renamed from: c */
        public final Object[] f207476c;

        /* JADX INFO: renamed from: d */
        public Object[] f207477d;

        /* JADX INFO: renamed from: e */
        public int f207478e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f207479f;

        /* JADX INFO: renamed from: g */
        public Throwable f207480g;

        public C22388b(int i) {
            this.f207474a = i;
            Object[] objArr = new Object[i + 1];
            this.f207476c = objArr;
            this.f207477d = objArr;
        }

        @Override // p133rx.subjects.ReplaySubject.InterfaceC22387a
        /* JADX INFO: renamed from: a */
        public void mo221502a(ReplayProducer<T> replayProducer) {
            long j;
            if (replayProducer.getAndIncrement() != 0) {
                return;
            }
            z3g0<? super T> z3g0Var = replayProducer.actual;
            int i = this.f207474a;
            int iAddAndGet = 1;
            do {
                long j2 = replayProducer.requested.get();
                Object[] objArr = (Object[]) replayProducer.node;
                if (objArr == null) {
                    objArr = this.f207476c;
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
                    boolean z = this.f207479f;
                    boolean z2 = i3 == this.f207475b;
                    if (z && z2) {
                        replayProducer.node = null;
                        Throwable th = this.f207480g;
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
                    boolean z3 = this.f207479f;
                    boolean z4 = i3 == this.f207475b;
                    if (z3 && z4) {
                        replayProducer.node = null;
                        Throwable th2 = this.f207480g;
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
                    kc2.m145343i(replayProducer.requested, j3);
                }
                replayProducer.index = i3;
                replayProducer.tailIndex = i2;
                replayProducer.node = objArr;
                iAddAndGet = replayProducer.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p133rx.subjects.ReplaySubject.InterfaceC22387a
        public void complete() {
            this.f207479f = true;
        }

        @Override // p133rx.subjects.ReplaySubject.InterfaceC22387a
        public void error(Throwable th) {
            if (this.f207479f) {
                ejd0.m116793j(th);
            } else {
                this.f207480g = th;
                this.f207479f = true;
            }
        }

        @Override // p133rx.subjects.ReplaySubject.InterfaceC22387a
        public void next(T t) {
            if (this.f207479f) {
                return;
            }
            int i = this.f207478e;
            Object[] objArr = this.f207477d;
            if (i == objArr.length - 1) {
                Object[] objArr2 = new Object[objArr.length];
                objArr2[0] = t;
                this.f207478e = 1;
                objArr[i] = objArr2;
                this.f207477d = objArr2;
            } else {
                objArr[i] = t;
                this.f207478e = i + 1;
            }
            this.f207475b++;
        }
    }

    public ReplaySubject(ReplayState<T> replayState) {
        super(replayState);
        this.f207467a = replayState;
    }

    /* JADX INFO: renamed from: b */
    public static <T> ReplaySubject<T> m221499b() {
        return m221500c(16);
    }

    /* JADX INFO: renamed from: c */
    public static <T> ReplaySubject<T> m221500c(int i) {
        if (i > 0) {
            return new ReplaySubject<>(new ReplayState(new C22388b(i)));
        }
        k250.m144273a("capacity > 0 required but it was ", i);
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static <T> ReplaySubject<T> m221501d(int i) {
        return new ReplaySubject<>(new ReplayState(new ReplaySizeBoundBuffer(i)));
    }

    @Override // p149l.m250
    public void onCompleted() {
        this.f207467a.onCompleted();
    }

    @Override // p149l.m250
    public void onError(Throwable th) {
        this.f207467a.onError(th);
    }

    @Override // p149l.m250
    public void onNext(T t) {
        this.f207467a.onNext(t);
    }
}
