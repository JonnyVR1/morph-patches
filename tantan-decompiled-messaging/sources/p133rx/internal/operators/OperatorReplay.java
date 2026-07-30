package p133rx.internal.operators;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p133rx.C22306c;
import p133rx.exceptions.OnErrorThrowable;
import p149l.bud0;
import p149l.c4g0;
import p149l.d30;
import p149l.e30;
import p149l.f31;
import p149l.f5f;
import p149l.h4g0;
import p149l.hri0;
import p149l.ig3;
import p149l.kp50;
import p149l.qkq0;
import p149l.rc90;
import p149l.v9j;
import p149l.vv5;
import p149l.w9j;
import p149l.z3g0;

/* JADX INFO: loaded from: classes3.dex */
public final class OperatorReplay<T> extends vv5<T> {

    /* JADX INFO: renamed from: d */
    public static final v9j f207289d = new C22339a();

    /* JADX INFO: renamed from: a */
    public final C22306c<? extends T> f207290a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C22347i<T>> f207291b;

    /* JADX INFO: renamed from: c */
    public final v9j<? extends InterfaceC22346h<T>> f207292c;

    public static class BoundedReplayBuffer<T> extends AtomicReference<Node> implements InterfaceC22346h<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        long index;

        /* JADX INFO: renamed from: nl */
        final NotificationLite<T> f207293nl = NotificationLite.m221335f();
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
                if (this.f207293nl.m221341g(objLeaveTransform) || this.f207293nl.m221342h(objLeaveTransform)) {
                    return;
                } else {
                    collection.add(this.f207293nl.m221340e(objLeaveTransform));
                }
            }
        }

        @Override // p133rx.internal.operators.OperatorReplay.InterfaceC22346h
        public final void complete() {
            Object objEnterTransform = enterTransform(this.f207293nl.m221337b());
            long j = this.index + 1;
            this.index = j;
            addLast(new Node(objEnterTransform, j));
            truncateFinal();
        }

        public Object enterTransform(Object obj) {
            return obj;
        }

        @Override // p133rx.internal.operators.OperatorReplay.InterfaceC22346h
        public final void error(Throwable th) {
            Object objEnterTransform = enterTransform(this.f207293nl.m221338c(th));
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
            return obj != null && this.f207293nl.m221341g(leaveTransform(obj));
        }

        public boolean hasError() {
            Object obj = this.tail.value;
            return obj != null && this.f207293nl.m221342h(leaveTransform(obj));
        }

        public Object leaveTransform(Object obj) {
            return obj;
        }

        @Override // p133rx.internal.operators.OperatorReplay.InterfaceC22346h
        public final void next(T t) {
            Object objEnterTransform = enterTransform(this.f207293nl.m221344j(t));
            long j = this.index + 1;
            this.index = j;
            addLast(new Node(objEnterTransform, j));
            truncate();
        }

        public final void removeFirst() {
            Node node = get().get();
            if (node == null) {
                qkq0.m175383a("Empty list!");
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

        @Override // p133rx.internal.operators.OperatorReplay.InterfaceC22346h
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
                                if (this.f207293nl.m221336a(innerProducer.child, objLeaveTransform)) {
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
                                f5f.m119491e(th);
                                innerProducer.unsubscribe();
                                if (this.f207293nl.m221342h(objLeaveTransform) || this.f207293nl.m221341g(objLeaveTransform)) {
                                    return;
                                }
                                innerProducer.child.onError(OnErrorThrowable.addValueAsLastCause(th, this.f207293nl.m221340e(objLeaveTransform)));
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

    public static final class InnerProducer<T> extends AtomicLong implements rc90, c4g0 {
        static final long UNSUBSCRIBED = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;
        final z3g0<? super T> child;
        boolean emitting;
        Object index;
        boolean missed;
        final C22347i<T> parent;
        final AtomicLong totalRequested = new AtomicLong();

        public InnerProducer(C22347i<T> c22347i, z3g0<? super T> z3g0Var) {
            this.parent = c22347i;
            this.child = z3g0Var;
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

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return get() == UNSUBSCRIBED;
        }

        public long produced(long j) {
            long j2;
            long j3;
            if (j <= 0) {
                ig3.m135964a("Cant produce zero or less");
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

        @Override // p149l.rc90
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
            this.parent.m221432k(this);
            this.parent.f207311e.replay(this);
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            if (get() == UNSUBSCRIBED || getAndSet(UNSUBSCRIBED) == UNSUBSCRIBED) {
                return;
            }
            this.parent.m221433l(this);
            this.parent.m221432k(this);
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
        final bud0 scheduler;

        public SizeAndTimeBoundReplayBuffer(int i, long j, bud0 bud0Var) {
            this.scheduler = bud0Var;
            this.limit = i;
            this.maxAgeInMillis = j;
        }

        @Override // rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        public Object enterTransform(Object obj) {
            return new hri0(this.scheduler.now(), obj);
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
                if (node2 == null || ((hri0) node2.value).m132687a() > jNow) {
                    break;
                }
                node3 = node2.get();
            }
            return node;
        }

        @Override // rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        public Object leaveTransform(Object obj) {
            return ((hri0) obj).m132688b();
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
                        if (((hri0) node2.value).m132687a() > jNow) {
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
                if (node2 == null || this.size <= 1 || ((hri0) node2.value).m132687a() > jNow) {
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

    public static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements InterfaceC22346h<T> {
        private static final long serialVersionUID = 7063189396499112664L;

        /* JADX INFO: renamed from: nl */
        final NotificationLite<T> f207294nl;
        volatile int size;

        public UnboundedReplayBuffer(int i) {
            super(i);
            this.f207294nl = NotificationLite.m221335f();
        }

        @Override // p133rx.internal.operators.OperatorReplay.InterfaceC22346h
        public void complete() {
            add(this.f207294nl.m221337b());
            this.size++;
        }

        @Override // p133rx.internal.operators.OperatorReplay.InterfaceC22346h
        public void error(Throwable th) {
            add(this.f207294nl.m221338c(th));
            this.size++;
        }

        @Override // p133rx.internal.operators.OperatorReplay.InterfaceC22346h
        public void next(T t) {
            add(this.f207294nl.m221344j(t));
            this.size++;
        }

        @Override // p133rx.internal.operators.OperatorReplay.InterfaceC22346h
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
                                if (this.f207294nl.m221336a(innerProducer.child, obj) || innerProducer.isUnsubscribed()) {
                                    return;
                                }
                                iIntValue++;
                                j2++;
                            } catch (Throwable th) {
                                f5f.m119491e(th);
                                innerProducer.unsubscribe();
                                if (this.f207294nl.m221342h(obj) || this.f207294nl.m221341g(obj)) {
                                    return;
                                }
                                innerProducer.child.onError(OnErrorThrowable.addValueAsLastCause(th, this.f207294nl.m221340e(obj)));
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
    public static class C22339a implements v9j {
        @Override // p149l.v9j, java.util.concurrent.Callable
        public Object call() {
            return new UnboundedReplayBuffer(16);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$b */
    public static class C22340b<R> implements C22306c.a<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ v9j f207295a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ w9j f207296b;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$b$a */
        public class a implements e30<c4g0> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z3g0 f207297a;

            public a(z3g0 z3g0Var) {
                this.f207297a = z3g0Var;
            }

            @Override // p149l.e30
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(c4g0 c4g0Var) {
                this.f207297a.m217046b(c4g0Var);
            }
        }

        public C22340b(v9j v9jVar, w9j w9jVar) {
            this.f207295a = v9jVar;
            this.f207296b = w9jVar;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super R> z3g0Var) {
            try {
                vv5 vv5Var = (vv5) this.f207295a.call();
                ((C22306c) this.f207296b.call(vv5Var)).subscribe((z3g0) z3g0Var);
                vv5Var.mo200174c(new a(z3g0Var));
            } catch (Throwable th) {
                f5f.m119492f(th, z3g0Var);
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$c */
    public static class C22341c implements C22306c.a<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C22306c f207299a;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$c$a */
        public class a extends z3g0<T> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ z3g0 f207300e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(z3g0 z3g0Var, z3g0 z3g0Var2) {
                super(z3g0Var);
                this.f207300e = z3g0Var2;
            }

            @Override // p149l.m250
            public void onCompleted() {
                this.f207300e.onCompleted();
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                this.f207300e.onError(th);
            }

            @Override // p149l.m250
            public void onNext(T t) {
                this.f207300e.onNext(t);
            }
        }

        public C22341c(C22306c c22306c) {
            this.f207299a = c22306c;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            this.f207299a.unsafeSubscribe(new a(z3g0Var, z3g0Var));
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$d */
    public static class C22342d extends vv5<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vv5 f207302a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22342d(C22306c.a aVar, vv5 vv5Var) {
            super(aVar);
            this.f207302a = vv5Var;
        }

        @Override // p149l.vv5
        /* JADX INFO: renamed from: c */
        public void mo200174c(e30<? super c4g0> e30Var) {
            this.f207302a.mo200174c(e30Var);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$e */
    public static class C22343e implements v9j<InterfaceC22346h<T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f207303a;

        public C22343e(int i) {
            this.f207303a = i;
        }

        @Override // p149l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC22346h<T> call() {
            return new SizeBoundReplayBuffer(this.f207303a);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$f */
    public static class C22344f implements v9j<InterfaceC22346h<T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f207304a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f207305b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ bud0 f207306c;

        public C22344f(int i, long j, bud0 bud0Var) {
            this.f207304a = i;
            this.f207305b = j;
            this.f207306c = bud0Var;
        }

        @Override // p149l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC22346h<T> call() {
            return new SizeAndTimeBoundReplayBuffer(this.f207304a, this.f207305b, this.f207306c);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$g */
    public static class C22345g implements C22306c.a<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicReference f207307a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ v9j f207308b;

        public C22345g(AtomicReference atomicReference, v9j v9jVar) {
            this.f207307a = atomicReference;
            this.f207308b = v9jVar;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            C22347i c22347i;
            C22347i c22347i2;
            do {
                c22347i = (C22347i) this.f207307a.get();
                if (c22347i == null) {
                    c22347i2 = new C22347i((InterfaceC22346h) this.f207308b.call());
                    c22347i2.m221430i();
                }
                InnerProducer<T> innerProducer = new InnerProducer<>(c22347i, z3g0Var);
                c22347i.m221428g(innerProducer);
                z3g0Var.m217046b(innerProducer);
                c22347i.f207311e.replay(innerProducer);
                z3g0Var.mo106696f(innerProducer);
            } while (!f31.m119248a(this.f207307a, c22347i, c22347i2));
            c22347i = c22347i2;
            InnerProducer<T> innerProducer2 = new InnerProducer<>(c22347i, z3g0Var);
            c22347i.m221428g(innerProducer2);
            z3g0Var.m217046b(innerProducer2);
            c22347i.f207311e.replay(innerProducer2);
            z3g0Var.mo106696f(innerProducer2);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$h */
    public interface InterfaceC22346h<T> {
        void complete();

        void error(Throwable th);

        void next(T t);

        void replay(InnerProducer<T> innerProducer);
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$i */
    public static final class C22347i<T> extends z3g0<T> implements c4g0 {

        /* JADX INFO: renamed from: u */
        public static final InnerProducer[] f207309u = new InnerProducer[0];

        /* JADX INFO: renamed from: v */
        public static final InnerProducer[] f207310v = new InnerProducer[0];

        /* JADX INFO: renamed from: e */
        public final InterfaceC22346h<T> f207311e;

        /* JADX INFO: renamed from: g */
        public boolean f207313g;

        /* JADX INFO: renamed from: h */
        public volatile boolean f207314h;

        /* JADX INFO: renamed from: k */
        public volatile long f207317k;

        /* JADX INFO: renamed from: l */
        public long f207318l;

        /* JADX INFO: renamed from: n */
        public boolean f207320n;

        /* JADX INFO: renamed from: o */
        public boolean f207321o;

        /* JADX INFO: renamed from: p */
        public long f207322p;

        /* JADX INFO: renamed from: q */
        public long f207323q;

        /* JADX INFO: renamed from: r */
        public volatile rc90 f207324r;

        /* JADX INFO: renamed from: s */
        public List<InnerProducer<T>> f207325s;

        /* JADX INFO: renamed from: t */
        public boolean f207326t;

        /* JADX INFO: renamed from: f */
        public final NotificationLite<T> f207312f = NotificationLite.m221335f();

        /* JADX INFO: renamed from: i */
        public final kp50<InnerProducer<T>> f207315i = new kp50<>();

        /* JADX INFO: renamed from: j */
        public InnerProducer<T>[] f207316j = f207309u;

        /* JADX INFO: renamed from: m */
        public final AtomicBoolean f207319m = new AtomicBoolean();

        /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$i$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p149l.d30
            public void call() {
                if (C22347i.this.f207314h) {
                    return;
                }
                synchronized (C22347i.this.f207315i) {
                    try {
                        if (!C22347i.this.f207314h) {
                            C22347i.this.f207315i.m146830f();
                            C22347i.this.f207317k++;
                            C22347i.this.f207314h = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public C22347i(InterfaceC22346h<T> interfaceC22346h) {
            this.f207311e = interfaceC22346h;
            m217048e(0L);
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo106696f(rc90 rc90Var) {
            if (this.f207324r != null) {
                qkq0.m175383a("Only a single producer can be set on a Subscriber.");
                return;
            }
            this.f207324r = rc90Var;
            m221432k(null);
            m221434m();
        }

        /* JADX INFO: renamed from: g */
        public boolean m221428g(InnerProducer<T> innerProducer) {
            innerProducer.getClass();
            if (this.f207314h) {
                return false;
            }
            synchronized (this.f207315i) {
                try {
                    if (this.f207314h) {
                        return false;
                    }
                    this.f207315i.m146826a(innerProducer);
                    this.f207317k++;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public InnerProducer<T>[] m221429h() {
            InnerProducer<T>[] innerProducerArr;
            synchronized (this.f207315i) {
                InnerProducer<T>[] innerProducerArrM146831g = this.f207315i.m146831g();
                int length = innerProducerArrM146831g.length;
                innerProducerArr = new InnerProducer[length];
                System.arraycopy(innerProducerArrM146831g, 0, innerProducerArr, 0, length);
            }
            return innerProducerArr;
        }

        /* JADX INFO: renamed from: i */
        public void m221430i() {
            m217046b(h4g0.m129240a(new a()));
        }

        /* JADX INFO: renamed from: j */
        public void m221431j(long j, long j2) {
            long j3 = this.f207323q;
            rc90 rc90Var = this.f207324r;
            long j4 = j - j2;
            if (j4 == 0) {
                if (j3 == 0 || rc90Var == null) {
                    return;
                }
                this.f207323q = 0L;
                rc90Var.request(j3);
                return;
            }
            this.f207322p = j;
            if (rc90Var == null) {
                long j5 = j3 + j4;
                if (j5 < 0) {
                    j5 = Long.MAX_VALUE;
                }
                this.f207323q = j5;
                return;
            }
            if (j3 == 0) {
                rc90Var.request(j4);
            } else {
                this.f207323q = 0L;
                rc90Var.request(j3 + j4);
            }
        }

        /* JADX INFO: renamed from: k */
        public void m221432k(InnerProducer<T> innerProducer) {
            long jMax;
            List<InnerProducer<T>> list;
            boolean z;
            long jMax2;
            if (isUnsubscribed()) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f207320n) {
                        if (innerProducer != null) {
                            List arrayList = this.f207325s;
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                this.f207325s = arrayList;
                            }
                            arrayList.add(innerProducer);
                        } else {
                            this.f207326t = true;
                        }
                        this.f207321o = true;
                        return;
                    }
                    this.f207320n = true;
                    long j = this.f207322p;
                    if (innerProducer != null) {
                        jMax = Math.max(j, innerProducer.totalRequested.get());
                    } else {
                        long jMax3 = j;
                        for (InnerProducer<T> innerProducer2 : m221429h()) {
                            if (innerProducer2 != null) {
                                jMax3 = Math.max(jMax3, innerProducer2.totalRequested.get());
                            }
                        }
                        jMax = jMax3;
                    }
                    m221431j(jMax, j);
                    while (!isUnsubscribed()) {
                        synchronized (this) {
                            try {
                                if (!this.f207321o) {
                                    this.f207320n = false;
                                    return;
                                }
                                this.f207321o = false;
                                list = this.f207325s;
                                this.f207325s = null;
                                z = this.f207326t;
                                this.f207326t = false;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        long j2 = this.f207322p;
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
                            for (InnerProducer<T> innerProducer3 : m221429h()) {
                                if (innerProducer3 != null) {
                                    jMax2 = Math.max(jMax2, innerProducer3.totalRequested.get());
                                }
                            }
                        }
                        m221431j(jMax2, j2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: l */
        public void m221433l(InnerProducer<T> innerProducer) {
            if (this.f207314h) {
                return;
            }
            synchronized (this.f207315i) {
                try {
                    if (this.f207314h) {
                        return;
                    }
                    this.f207315i.m146828d(innerProducer);
                    this.f207317k++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: m */
        public void m221434m() {
            InnerProducer<T>[] innerProducerArr = this.f207316j;
            if (this.f207318l != this.f207317k) {
                synchronized (this.f207315i) {
                    try {
                        innerProducerArr = this.f207316j;
                        InnerProducer<T>[] innerProducerArrM146831g = this.f207315i.m146831g();
                        int length = innerProducerArrM146831g.length;
                        if (innerProducerArr.length != length) {
                            innerProducerArr = new InnerProducer[length];
                            this.f207316j = innerProducerArr;
                        }
                        System.arraycopy(innerProducerArrM146831g, 0, innerProducerArr, 0, length);
                        this.f207318l = this.f207317k;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            InterfaceC22346h<T> interfaceC22346h = this.f207311e;
            for (InnerProducer<T> innerProducer : innerProducerArr) {
                if (innerProducer != null) {
                    interfaceC22346h.replay(innerProducer);
                }
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f207313g) {
                return;
            }
            this.f207313g = true;
            try {
                this.f207311e.complete();
                m221434m();
            } finally {
                unsubscribe();
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            if (this.f207313g) {
                return;
            }
            this.f207313g = true;
            try {
                this.f207311e.error(th);
                m221434m();
            } finally {
                unsubscribe();
            }
        }

        @Override // p149l.m250
        public void onNext(T t) {
            if (this.f207313g) {
                return;
            }
            this.f207311e.next(t);
            m221434m();
        }
    }

    public OperatorReplay(C22306c.a<T> aVar, C22306c<? extends T> c22306c, AtomicReference<C22347i<T>> atomicReference, v9j<? extends InterfaceC22346h<T>> v9jVar) {
        super(aVar);
        this.f207290a = c22306c;
        this.f207291b = atomicReference;
        this.f207292c = v9jVar;
    }

    /* JADX INFO: renamed from: e */
    public static <T> vv5<T> m221415e(C22306c<? extends T> c22306c) {
        return m221419i(c22306c, f207289d);
    }

    /* JADX INFO: renamed from: f */
    public static <T> vv5<T> m221416f(C22306c<? extends T> c22306c, int i) {
        return i == Integer.MAX_VALUE ? m221415e(c22306c) : m221419i(c22306c, new C22343e(i));
    }

    /* JADX INFO: renamed from: g */
    public static <T> vv5<T> m221417g(C22306c<? extends T> c22306c, long j, TimeUnit timeUnit, bud0 bud0Var) {
        return m221418h(c22306c, j, timeUnit, bud0Var, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: h */
    public static <T> vv5<T> m221418h(C22306c<? extends T> c22306c, long j, TimeUnit timeUnit, bud0 bud0Var, int i) {
        return m221419i(c22306c, new C22344f(i, timeUnit.toMillis(j), bud0Var));
    }

    /* JADX INFO: renamed from: i */
    public static <T> vv5<T> m221419i(C22306c<? extends T> c22306c, v9j<? extends InterfaceC22346h<T>> v9jVar) {
        AtomicReference atomicReference = new AtomicReference();
        return new OperatorReplay(new C22345g(atomicReference, v9jVar), c22306c, atomicReference, v9jVar);
    }

    /* JADX INFO: renamed from: j */
    public static <T, U, R> C22306c<R> m221420j(v9j<? extends vv5<U>> v9jVar, w9j<? super C22306c<U>, ? extends C22306c<R>> w9jVar) {
        return C22306c.create(new C22340b(v9jVar, w9jVar));
    }

    /* JADX INFO: renamed from: k */
    public static <T> vv5<T> m221421k(vv5<T> vv5Var, bud0 bud0Var) {
        return new C22342d(new C22341c(vv5Var.observeOn(bud0Var)), vv5Var);
    }

    @Override // p149l.vv5
    /* JADX INFO: renamed from: c */
    public void mo200174c(e30<? super c4g0> e30Var) {
        C22347i<T> c22347i;
        while (true) {
            c22347i = this.f207291b.get();
            if (c22347i != null && !c22347i.isUnsubscribed()) {
                break;
            }
            C22347i<T> c22347i2 = new C22347i<>(this.f207292c.call());
            c22347i2.m221430i();
            if (f31.m119248a(this.f207291b, c22347i, c22347i2)) {
                c22347i = c22347i2;
                break;
            }
        }
        boolean z = false;
        if (!c22347i.f207319m.get() && c22347i.f207319m.compareAndSet(false, true)) {
            z = true;
        }
        e30Var.call(c22347i);
        if (z) {
            this.f207290a.unsafeSubscribe(c22347i);
        }
    }
}
