package p137rx.internal.operators;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.C22421c;
import p137rx.exceptions.OnErrorThrowable;
import p153l.ax5;
import p153l.f2e0;
import p153l.gcg0;
import p153l.j6f;
import p153l.k0j0;
import p153l.kcg0;
import p153l.m31;
import p153l.pcg0;
import p153l.pcj;
import p153l.qcj;
import p153l.qx50;
import p153l.vk90;
import p153l.wg3;
import p153l.wtq0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public final class OperatorReplay<T> extends ax5<T> {

    /* JADX INFO: renamed from: d */
    public static final pcj f208211d = new C22454a();

    /* JADX INFO: renamed from: a */
    public final C22421c<? extends T> f208212a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C22462i<T>> f208213b;

    /* JADX INFO: renamed from: c */
    public final pcj<? extends InterfaceC22461h<T>> f208214c;

    public static class BoundedReplayBuffer<T> extends AtomicReference<Node> implements InterfaceC22461h<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        long index;

        /* JADX INFO: renamed from: nl */
        final NotificationLite<T> f208215nl = NotificationLite.m222581f();
        int size;
        Node tail;

        public BoundedReplayBuffer() {
            Node node = new Node(null, 0L);
            this.tail = node;
            set(node);
        }

        public final void addLast(Node node) {
            this.tail.set(node);
            this.tail = node;
            this.size++;
        }

        public final void collect(Collection<? super T> collection) {
            Node initialHead = getInitialHead();
            while (true) {
                initialHead = initialHead.get();
                if (initialHead == null) {
                    return;
                }
                Object objLeaveTransform = leaveTransform(initialHead.value);
                if (this.f208215nl.m222587g(objLeaveTransform) || this.f208215nl.m222588h(objLeaveTransform)) {
                    return;
                } else {
                    collection.add(this.f208215nl.m222586e(objLeaveTransform));
                }
            }
        }

        @Override // p137rx.internal.operators.OperatorReplay.InterfaceC22461h
        public final void complete() {
            Object objEnterTransform = enterTransform(this.f208215nl.m222583b());
            long j = this.index + 1;
            this.index = j;
            addLast(new Node(objEnterTransform, j));
            truncateFinal();
        }

        public Object enterTransform(Object obj) {
            return obj;
        }

        @Override // p137rx.internal.operators.OperatorReplay.InterfaceC22461h
        public final void error(Throwable th) {
            Object objEnterTransform = enterTransform(this.f208215nl.m222584c(th));
            long j = this.index + 1;
            this.index = j;
            addLast(new Node(objEnterTransform, j));
            truncateFinal();
        }

        public Node getInitialHead() {
            return get();
        }

        public boolean hasCompleted() {
            Object obj = this.tail.value;
            return obj != null && this.f208215nl.m222587g(leaveTransform(obj));
        }

        public boolean hasError() {
            Object obj = this.tail.value;
            return obj != null && this.f208215nl.m222588h(leaveTransform(obj));
        }

        public Object leaveTransform(Object obj) {
            return obj;
        }

        @Override // p137rx.internal.operators.OperatorReplay.InterfaceC22461h
        public final void next(T t) {
            Object objEnterTransform = enterTransform(this.f208215nl.m222590j(t));
            long j = this.index + 1;
            this.index = j;
            addLast(new Node(objEnterTransform, j));
            truncate();
        }

        public final void removeFirst() {
            Node node = get().get();
            if (node == null) {
                wtq0.m207906a("Empty list!");
            } else {
                this.size--;
                setFirst(node);
            }
        }

        public final void removeSome(int i) {
            Node node = get();
            while (i > 0) {
                node = node.get();
                i--;
                this.size--;
            }
            setFirst(node);
        }

        @Override // p137rx.internal.operators.OperatorReplay.InterfaceC22461h
        public final void replay(InnerProducer<T> innerProducer) {
            Node node;
            synchronized (innerProducer) {
                try {
                    if (innerProducer.emitting) {
                        innerProducer.missed = true;
                        return;
                    }
                    innerProducer.emitting = true;
                    while (!innerProducer.isUnsubscribed()) {
                        Node initialHead = (Node) innerProducer.index();
                        if (initialHead == null) {
                            initialHead = getInitialHead();
                            innerProducer.index = initialHead;
                            innerProducer.addTotalRequested(initialHead.index);
                        }
                        if (innerProducer.isUnsubscribed()) {
                            return;
                        }
                        long j = innerProducer.get();
                        long j2 = 0;
                        while (j2 != j && (node = initialHead.get()) != null) {
                            Object objLeaveTransform = leaveTransform(node.value);
                            try {
                                if (this.f208215nl.m222582a(innerProducer.child, objLeaveTransform)) {
                                    innerProducer.index = null;
                                    return;
                                }
                                j2++;
                                if (innerProducer.isUnsubscribed()) {
                                    return;
                                } else {
                                    initialHead = node;
                                }
                            } catch (Throwable th) {
                                innerProducer.index = null;
                                j6f.m143663e(th);
                                innerProducer.unsubscribe();
                                if (this.f208215nl.m222588h(objLeaveTransform) || this.f208215nl.m222587g(objLeaveTransform)) {
                                    return;
                                }
                                innerProducer.child.onError(OnErrorThrowable.addValueAsLastCause(th, this.f208215nl.m222586e(objLeaveTransform)));
                                return;
                            }
                        }
                        if (j2 != 0) {
                            innerProducer.index = initialHead;
                            if (j != Long.MAX_VALUE) {
                                innerProducer.produced(j2);
                            }
                        }
                        synchronized (innerProducer) {
                            try {
                                if (!innerProducer.missed) {
                                    innerProducer.emitting = false;
                                    return;
                                }
                                innerProducer.missed = false;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public final void setFirst(Node node) {
            set(node);
        }

        public void truncate() {
        }

        public void truncateFinal() {
        }
    }

    public static final class InnerProducer<T> extends AtomicLong implements vk90, kcg0 {
        static final long UNSUBSCRIBED = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;
        final gcg0<? super T> child;
        boolean emitting;
        Object index;
        boolean missed;
        final C22462i<T> parent;
        final AtomicLong totalRequested = new AtomicLong();

        public InnerProducer(C22462i<T> c22462i, gcg0<? super T> gcg0Var) {
            this.parent = c22462i;
            this.child = gcg0Var;
        }

        public void addTotalRequested(long j) {
            long j2;
            long j3;
            do {
                j2 = this.totalRequested.get();
                j3 = j2 + j;
                if (j3 < 0) {
                    j3 = Long.MAX_VALUE;
                }
            } while (!this.totalRequested.compareAndSet(j2, j3));
        }

        public <U> U index() {
            return (U) this.index;
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return get() == UNSUBSCRIBED;
        }

        public long produced(long j) {
            long j2;
            long j3;
            if (j <= 0) {
                wg3.m206174a("Cant produce zero or less");
                return 0L;
            }
            do {
                j2 = get();
                if (j2 == UNSUBSCRIBED) {
                    return UNSUBSCRIBED;
                }
                j3 = j2 - j;
                if (j3 < 0) {
                    throw new IllegalStateException("More produced (" + j + ") than requested (" + j2 + ")");
                }
            } while (!compareAndSet(j2, j3));
            return j3;
        }

        @Override // p153l.vk90
        public void request(long j) {
            long j2;
            long j3;
            if (j < 0) {
                return;
            }
            do {
                j2 = get();
                if (j2 == UNSUBSCRIBED) {
                    return;
                }
                if (j2 >= 0 && j == 0) {
                    return;
                }
                j3 = j2 + j;
                if (j3 < 0) {
                    j3 = Long.MAX_VALUE;
                }
            } while (!compareAndSet(j2, j3));
            addTotalRequested(j);
            this.parent.m222678k(this);
            this.parent.f208233e.replay(this);
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            if (get() == UNSUBSCRIBED || getAndSet(UNSUBSCRIBED) == UNSUBSCRIBED) {
                return;
            }
            this.parent.m222679l(this);
            this.parent.m222678k(this);
        }
    }

    public static final class Node extends AtomicReference<Node> {
        private static final long serialVersionUID = 245354315435971818L;
        final long index;
        final Object value;

        public Node(Object obj, long j) {
            this.value = obj;
            this.index = j;
        }
    }

    public static final class SizeAndTimeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        final int limit;
        final long maxAgeInMillis;
        final f2e0 scheduler;

        public SizeAndTimeBoundReplayBuffer(int i, long j, f2e0 f2e0Var) {
            this.scheduler = f2e0Var;
            this.limit = i;
            this.maxAgeInMillis = j;
        }

        @Override // rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        public Object enterTransform(Object obj) {
            return new k0j0(this.scheduler.now(), obj);
        }

        @Override // rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        public Node getInitialHead() {
            Node node;
            long jNow = this.scheduler.now() - this.maxAgeInMillis;
            Node node2 = get();
            Node node3 = node2.get();
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null || ((k0j0) node2.value).m147793a() > jNow) {
                    break;
                }
                node3 = node2.get();
            }
            return node;
        }

        @Override // rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        public Object leaveTransform(Object obj) {
            return ((k0j0) obj).m147794b();
        }

        @Override // rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        public void truncate() {
            Node node;
            long jNow = this.scheduler.now() - this.maxAgeInMillis;
            Node node2 = get();
            Node node3 = node2.get();
            int i = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 != null) {
                    int i2 = this.size;
                    if (i2 <= this.limit) {
                        if (((k0j0) node2.value).m147793a() > jNow) {
                            break;
                        }
                        i++;
                        this.size--;
                        node3 = node2.get();
                    } else {
                        i++;
                        this.size = i2 - 1;
                        node3 = node2.get();
                    }
                } else {
                    break;
                }
            }
            if (i != 0) {
                setFirst(node);
            }
        }

        @Override // rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        public void truncateFinal() {
            Node node;
            long jNow = this.scheduler.now() - this.maxAgeInMillis;
            Node node2 = get();
            Node node3 = node2.get();
            int i = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null || this.size <= 1 || ((k0j0) node2.value).m147793a() > jNow) {
                    break;
                }
                i++;
                this.size--;
                node3 = node2.get();
            }
            if (i != 0) {
                setFirst(node);
            }
        }
    }

    public static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int limit;

        public SizeBoundReplayBuffer(int i) {
            this.limit = i;
        }

        @Override // rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        public void truncate() {
            if (this.size > this.limit) {
                removeFirst();
            }
        }
    }

    public static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements InterfaceC22461h<T> {
        private static final long serialVersionUID = 7063189396499112664L;

        /* JADX INFO: renamed from: nl */
        final NotificationLite<T> f208216nl;
        volatile int size;

        public UnboundedReplayBuffer(int i) {
            super(i);
            this.f208216nl = NotificationLite.m222581f();
        }

        @Override // p137rx.internal.operators.OperatorReplay.InterfaceC22461h
        public void complete() {
            add(this.f208216nl.m222583b());
            this.size++;
        }

        @Override // p137rx.internal.operators.OperatorReplay.InterfaceC22461h
        public void error(Throwable th) {
            add(this.f208216nl.m222584c(th));
            this.size++;
        }

        @Override // p137rx.internal.operators.OperatorReplay.InterfaceC22461h
        public void next(T t) {
            add(this.f208216nl.m222590j(t));
            this.size++;
        }

        @Override // p137rx.internal.operators.OperatorReplay.InterfaceC22461h
        public void replay(InnerProducer<T> innerProducer) {
            synchronized (innerProducer) {
                try {
                    if (innerProducer.emitting) {
                        innerProducer.missed = true;
                        return;
                    }
                    innerProducer.emitting = true;
                    while (!innerProducer.isUnsubscribed()) {
                        int i = this.size;
                        Integer num = (Integer) innerProducer.index();
                        int iIntValue = num != null ? num.intValue() : 0;
                        long j = innerProducer.get();
                        long j2 = 0;
                        while (j2 != j && iIntValue < i) {
                            Object obj = get(iIntValue);
                            try {
                                if (this.f208216nl.m222582a(innerProducer.child, obj) || innerProducer.isUnsubscribed()) {
                                    return;
                                }
                                iIntValue++;
                                j2++;
                            } catch (Throwable th) {
                                j6f.m143663e(th);
                                innerProducer.unsubscribe();
                                if (this.f208216nl.m222588h(obj) || this.f208216nl.m222587g(obj)) {
                                    return;
                                }
                                innerProducer.child.onError(OnErrorThrowable.addValueAsLastCause(th, this.f208216nl.m222586e(obj)));
                                return;
                            }
                        }
                        if (j2 != 0) {
                            innerProducer.index = Integer.valueOf(iIntValue);
                            if (j != Long.MAX_VALUE) {
                                innerProducer.produced(j2);
                            }
                        }
                        synchronized (innerProducer) {
                            try {
                                if (!innerProducer.missed) {
                                    innerProducer.emitting = false;
                                    return;
                                }
                                innerProducer.missed = false;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$a */
    public static class C22454a implements pcj {
        @Override // p153l.pcj, java.util.concurrent.Callable
        public Object call() {
            return new UnboundedReplayBuffer(16);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$b */
    public static class C22455b<R> implements C22421c.a<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pcj f208217a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qcj f208218b;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$b$a */
        public class a implements y20<kcg0> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ gcg0 f208219a;

            public a(gcg0 gcg0Var) {
                this.f208219a = gcg0Var;
            }

            @Override // p153l.y20
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(kcg0 kcg0Var) {
                this.f208219a.m129866b(kcg0Var);
            }
        }

        public C22455b(pcj pcjVar, qcj qcjVar) {
            this.f208217a = pcjVar;
            this.f208218b = qcjVar;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super R> gcg0Var) {
            try {
                ax5 ax5Var = (ax5) this.f208217a.call();
                ((C22421c) this.f208218b.call(ax5Var)).subscribe((gcg0) gcg0Var);
                ax5Var.mo100759c(new a(gcg0Var));
            } catch (Throwable th) {
                j6f.m143664f(th, gcg0Var);
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$c */
    public static class C22456c implements C22421c.a<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C22421c f208221a;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$c$a */
        public class a extends gcg0<T> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ gcg0 f208222e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(gcg0 gcg0Var, gcg0 gcg0Var2) {
                super(gcg0Var);
                this.f208222e = gcg0Var2;
            }

            @Override // p153l.bb50
            public void onCompleted() {
                this.f208222e.onCompleted();
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                this.f208222e.onError(th);
            }

            @Override // p153l.bb50
            public void onNext(T t) {
                this.f208222e.onNext(t);
            }
        }

        public C22456c(C22421c c22421c) {
            this.f208221a = c22421c;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super T> gcg0Var) {
            this.f208221a.unsafeSubscribe(new a(gcg0Var, gcg0Var));
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$d */
    public static class C22457d extends ax5<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ax5 f208224a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22457d(C22421c.a aVar, ax5 ax5Var) {
            super(aVar);
            this.f208224a = ax5Var;
        }

        @Override // p153l.ax5
        /* JADX INFO: renamed from: c */
        public void mo100759c(y20<? super kcg0> y20Var) {
            this.f208224a.mo100759c(y20Var);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$e */
    public static class C22458e implements pcj<InterfaceC22461h<T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f208225a;

        public C22458e(int i) {
            this.f208225a = i;
        }

        @Override // p153l.pcj, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC22461h<T> call() {
            return new SizeBoundReplayBuffer(this.f208225a);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$f */
    public static class C22459f implements pcj<InterfaceC22461h<T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f208226a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f208227b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ f2e0 f208228c;

        public C22459f(int i, long j, f2e0 f2e0Var) {
            this.f208226a = i;
            this.f208227b = j;
            this.f208228c = f2e0Var;
        }

        @Override // p153l.pcj, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC22461h<T> call() {
            return new SizeAndTimeBoundReplayBuffer(this.f208226a, this.f208227b, this.f208228c);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$g */
    public static class C22460g implements C22421c.a<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicReference f208229a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ pcj f208230b;

        public C22460g(AtomicReference atomicReference, pcj pcjVar) {
            this.f208229a = atomicReference;
            this.f208230b = pcjVar;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super T> gcg0Var) {
            C22462i c22462i;
            C22462i c22462i2;
            do {
                c22462i = (C22462i) this.f208229a.get();
                if (c22462i == null) {
                    c22462i2 = new C22462i((InterfaceC22461h) this.f208230b.call());
                    c22462i2.m222676i();
                }
                InnerProducer<T> innerProducer = new InnerProducer<>(c22462i, gcg0Var);
                c22462i.m222674g(innerProducer);
                gcg0Var.m129866b(innerProducer);
                c22462i.f208233e.replay(innerProducer);
                gcg0Var.mo95773f(innerProducer);
            } while (!m31.m156916a(this.f208229a, c22462i, c22462i2));
            c22462i = c22462i2;
            InnerProducer<T> innerProducer2 = new InnerProducer<>(c22462i, gcg0Var);
            c22462i.m222674g(innerProducer2);
            gcg0Var.m129866b(innerProducer2);
            c22462i.f208233e.replay(innerProducer2);
            gcg0Var.mo95773f(innerProducer2);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$h */
    public interface InterfaceC22461h<T> {
        void complete();

        void error(Throwable th);

        void next(T t);

        void replay(InnerProducer<T> innerProducer);
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$i */
    public static final class C22462i<T> extends gcg0<T> implements kcg0 {

        /* JADX INFO: renamed from: u */
        public static final InnerProducer[] f208231u = new InnerProducer[0];

        /* JADX INFO: renamed from: v */
        public static final InnerProducer[] f208232v = new InnerProducer[0];

        /* JADX INFO: renamed from: e */
        public final InterfaceC22461h<T> f208233e;

        /* JADX INFO: renamed from: g */
        public boolean f208235g;

        /* JADX INFO: renamed from: h */
        public volatile boolean f208236h;

        /* JADX INFO: renamed from: k */
        public volatile long f208239k;

        /* JADX INFO: renamed from: l */
        public long f208240l;

        /* JADX INFO: renamed from: n */
        public boolean f208242n;

        /* JADX INFO: renamed from: o */
        public boolean f208243o;

        /* JADX INFO: renamed from: p */
        public long f208244p;

        /* JADX INFO: renamed from: q */
        public long f208245q;

        /* JADX INFO: renamed from: r */
        public volatile vk90 f208246r;

        /* JADX INFO: renamed from: s */
        public List<InnerProducer<T>> f208247s;

        /* JADX INFO: renamed from: t */
        public boolean f208248t;

        /* JADX INFO: renamed from: f */
        public final NotificationLite<T> f208234f = NotificationLite.m222581f();

        /* JADX INFO: renamed from: i */
        public final qx50<InnerProducer<T>> f208237i = new qx50<>();

        /* JADX INFO: renamed from: j */
        public InnerProducer<T>[] f208238j = f208231u;

        /* JADX INFO: renamed from: m */
        public final AtomicBoolean f208241m = new AtomicBoolean();

        /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$i$a */
        public class a implements x20 {
            public a() {
            }

            @Override // p153l.x20
            public void call() {
                if (C22462i.this.f208236h) {
                    return;
                }
                synchronized (C22462i.this.f208237i) {
                    try {
                        if (!C22462i.this.f208236h) {
                            C22462i.this.f208237i.m178578f();
                            C22462i.this.f208239k++;
                            C22462i.this.f208236h = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public C22462i(InterfaceC22461h<T> interfaceC22461h) {
            this.f208233e = interfaceC22461h;
            m129868e(0L);
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: f */
        public void mo95773f(vk90 vk90Var) {
            if (this.f208246r != null) {
                wtq0.m207906a("Only a single producer can be set on a Subscriber.");
                return;
            }
            this.f208246r = vk90Var;
            m222678k(null);
            m222680m();
        }

        /* JADX INFO: renamed from: g */
        public boolean m222674g(InnerProducer<T> innerProducer) {
            innerProducer.getClass();
            if (this.f208236h) {
                return false;
            }
            synchronized (this.f208237i) {
                try {
                    if (this.f208236h) {
                        return false;
                    }
                    this.f208237i.m178574a(innerProducer);
                    this.f208239k++;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public InnerProducer<T>[] m222675h() {
            InnerProducer<T>[] innerProducerArr;
            synchronized (this.f208237i) {
                InnerProducer<T>[] innerProducerArrM178579g = this.f208237i.m178579g();
                int length = innerProducerArrM178579g.length;
                innerProducerArr = new InnerProducer[length];
                System.arraycopy(innerProducerArrM178579g, 0, innerProducerArr, 0, length);
            }
            return innerProducerArr;
        }

        /* JADX INFO: renamed from: i */
        public void m222676i() {
            m129866b(pcg0.m171648a(new a()));
        }

        /* JADX INFO: renamed from: j */
        public void m222677j(long j, long j2) {
            long j3 = this.f208245q;
            vk90 vk90Var = this.f208246r;
            long j4 = j - j2;
            if (j4 == 0) {
                if (j3 == 0 || vk90Var == null) {
                    return;
                }
                this.f208245q = 0L;
                vk90Var.request(j3);
                return;
            }
            this.f208244p = j;
            if (vk90Var == null) {
                long j5 = j3 + j4;
                if (j5 < 0) {
                    j5 = Long.MAX_VALUE;
                }
                this.f208245q = j5;
                return;
            }
            if (j3 == 0) {
                vk90Var.request(j4);
            } else {
                this.f208245q = 0L;
                vk90Var.request(j3 + j4);
            }
        }

        /* JADX INFO: renamed from: k */
        public void m222678k(InnerProducer<T> innerProducer) {
            long jMax;
            List<InnerProducer<T>> list;
            boolean z;
            long jMax2;
            if (isUnsubscribed()) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f208242n) {
                        if (innerProducer != null) {
                            List arrayList = this.f208247s;
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                this.f208247s = arrayList;
                            }
                            arrayList.add(innerProducer);
                        } else {
                            this.f208248t = true;
                        }
                        this.f208243o = true;
                        return;
                    }
                    this.f208242n = true;
                    long j = this.f208244p;
                    if (innerProducer != null) {
                        jMax = Math.max(j, innerProducer.totalRequested.get());
                    } else {
                        long jMax3 = j;
                        for (InnerProducer<T> innerProducer2 : m222675h()) {
                            if (innerProducer2 != null) {
                                jMax3 = Math.max(jMax3, innerProducer2.totalRequested.get());
                            }
                        }
                        jMax = jMax3;
                    }
                    m222677j(jMax, j);
                    while (!isUnsubscribed()) {
                        synchronized (this) {
                            try {
                                if (!this.f208243o) {
                                    this.f208242n = false;
                                    return;
                                }
                                this.f208243o = false;
                                list = this.f208247s;
                                this.f208247s = null;
                                z = this.f208248t;
                                this.f208248t = false;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        long j2 = this.f208244p;
                        if (list != null) {
                            Iterator<InnerProducer<T>> it = list.iterator();
                            jMax2 = j2;
                            while (it.hasNext()) {
                                jMax2 = Math.max(jMax2, it.next().totalRequested.get());
                            }
                        } else {
                            jMax2 = j2;
                        }
                        if (z) {
                            for (InnerProducer<T> innerProducer3 : m222675h()) {
                                if (innerProducer3 != null) {
                                    jMax2 = Math.max(jMax2, innerProducer3.totalRequested.get());
                                }
                            }
                        }
                        m222677j(jMax2, j2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: l */
        public void m222679l(InnerProducer<T> innerProducer) {
            if (this.f208236h) {
                return;
            }
            synchronized (this.f208237i) {
                try {
                    if (this.f208236h) {
                        return;
                    }
                    this.f208237i.m178576d(innerProducer);
                    this.f208239k++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: m */
        public void m222680m() {
            InnerProducer<T>[] innerProducerArr = this.f208238j;
            if (this.f208240l != this.f208239k) {
                synchronized (this.f208237i) {
                    try {
                        innerProducerArr = this.f208238j;
                        InnerProducer<T>[] innerProducerArrM178579g = this.f208237i.m178579g();
                        int length = innerProducerArrM178579g.length;
                        if (innerProducerArr.length != length) {
                            innerProducerArr = new InnerProducer[length];
                            this.f208238j = innerProducerArr;
                        }
                        System.arraycopy(innerProducerArrM178579g, 0, innerProducerArr, 0, length);
                        this.f208240l = this.f208239k;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            InterfaceC22461h<T> interfaceC22461h = this.f208233e;
            for (InnerProducer<T> innerProducer : innerProducerArr) {
                if (innerProducer != null) {
                    interfaceC22461h.replay(innerProducer);
                }
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f208235g) {
                return;
            }
            this.f208235g = true;
            try {
                this.f208233e.complete();
                m222680m();
            } finally {
                unsubscribe();
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (this.f208235g) {
                return;
            }
            this.f208235g = true;
            try {
                this.f208233e.error(th);
                m222680m();
            } finally {
                unsubscribe();
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            if (this.f208235g) {
                return;
            }
            this.f208233e.next(t);
            m222680m();
        }
    }

    public OperatorReplay(C22421c.a<T> aVar, C22421c<? extends T> c22421c, AtomicReference<C22462i<T>> atomicReference, pcj<? extends InterfaceC22461h<T>> pcjVar) {
        super(aVar);
        this.f208212a = c22421c;
        this.f208213b = atomicReference;
        this.f208214c = pcjVar;
    }

    /* JADX INFO: renamed from: e */
    public static <T> ax5<T> m222661e(C22421c<? extends T> c22421c) {
        return m222665i(c22421c, f208211d);
    }

    /* JADX INFO: renamed from: f */
    public static <T> ax5<T> m222662f(C22421c<? extends T> c22421c, int i) {
        return i == Integer.MAX_VALUE ? m222661e(c22421c) : m222665i(c22421c, new C22458e(i));
    }

    /* JADX INFO: renamed from: g */
    public static <T> ax5<T> m222663g(C22421c<? extends T> c22421c, long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        return m222664h(c22421c, j, timeUnit, f2e0Var, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: h */
    public static <T> ax5<T> m222664h(C22421c<? extends T> c22421c, long j, TimeUnit timeUnit, f2e0 f2e0Var, int i) {
        return m222665i(c22421c, new C22459f(i, timeUnit.toMillis(j), f2e0Var));
    }

    /* JADX INFO: renamed from: i */
    public static <T> ax5<T> m222665i(C22421c<? extends T> c22421c, pcj<? extends InterfaceC22461h<T>> pcjVar) {
        AtomicReference atomicReference = new AtomicReference();
        return new OperatorReplay(new C22460g(atomicReference, pcjVar), c22421c, atomicReference, pcjVar);
    }

    /* JADX INFO: renamed from: j */
    public static <T, U, R> C22421c<R> m222666j(pcj<? extends ax5<U>> pcjVar, qcj<? super C22421c<U>, ? extends C22421c<R>> qcjVar) {
        return C22421c.create(new C22455b(pcjVar, qcjVar));
    }

    /* JADX INFO: renamed from: k */
    public static <T> ax5<T> m222667k(ax5<T> ax5Var, f2e0 f2e0Var) {
        return new C22457d(new C22456c(ax5Var.observeOn(f2e0Var)), ax5Var);
    }

    @Override // p153l.ax5
    /* JADX INFO: renamed from: c */
    public void mo100759c(y20<? super kcg0> y20Var) {
        C22462i<T> c22462i;
        while (true) {
            c22462i = this.f208213b.get();
            if (c22462i != null && !c22462i.isUnsubscribed()) {
                break;
            }
            C22462i<T> c22462i2 = new C22462i<>(this.f208214c.call());
            c22462i2.m222676i();
            if (m31.m156916a(this.f208213b, c22462i, c22462i2)) {
                c22462i = c22462i2;
                break;
            }
        }
        boolean z = false;
        if (!c22462i.f208241m.get() && c22462i.f208241m.compareAndSet(false, true)) {
            z = true;
        }
        y20Var.call(c22462i);
        if (z) {
            this.f208212a.unsafeSubscribe(c22462i);
        }
    }
}
