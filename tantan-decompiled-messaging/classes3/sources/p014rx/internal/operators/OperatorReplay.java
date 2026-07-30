package p014rx.internal.operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import l.f31;
import l.ig3;
import l.qkq0;
import p003l.bud0;
import p003l.c4g0;
import p003l.d30;
import p003l.e30;
import p003l.f5f;
import p003l.h4g0;
import p003l.hri0;
import p003l.kp50;
import p003l.rc90;
import p003l.v9j;
import p003l.vv5;
import p003l.w9j;
import p003l.z3g0;
import p014rx.C1099c;
import p014rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class OperatorReplay<T> extends vv5<T> {

    /* JADX INFO: renamed from: d */
    public static final v9j f10914d = new C1132a();

    /* JADX INFO: renamed from: a */
    public final C1099c<? extends T> f10915a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C1140i<T>> f10916b;

    /* JADX INFO: renamed from: c */
    public final v9j<? extends InterfaceC1139h<T>> f10917c;

    public static class BoundedReplayBuffer<T> extends AtomicReference<Node> implements InterfaceC1139h<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        long index;

        /* JADX INFO: renamed from: nl */
        final NotificationLite<T> f10918nl = NotificationLite.m9792f();
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
                if (this.f10918nl.m9798g(objLeaveTransform) || this.f10918nl.m9799h(objLeaveTransform)) {
                    return;
                } else {
                    collection.add(this.f10918nl.m9797e(objLeaveTransform));
                }
            }
        }

        @Override // p014rx.internal.operators.OperatorReplay.InterfaceC1139h
        public final void complete() {
            Object objEnterTransform = enterTransform(this.f10918nl.m9794b());
            long j = this.index + 1;
            this.index = j;
            addLast(new Node(objEnterTransform, j));
            truncateFinal();
        }

        public Object enterTransform(Object obj) {
            return obj;
        }

        @Override // p014rx.internal.operators.OperatorReplay.InterfaceC1139h
        public final void error(Throwable th) {
            Object objEnterTransform = enterTransform(this.f10918nl.m9795c(th));
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
            return obj != null && this.f10918nl.m9798g(leaveTransform(obj));
        }

        public boolean hasError() {
            Object obj = this.tail.value;
            return obj != null && this.f10918nl.m9799h(leaveTransform(obj));
        }

        public Object leaveTransform(Object obj) {
            return obj;
        }

        @Override // p014rx.internal.operators.OperatorReplay.InterfaceC1139h
        public final void next(T t) {
            Object objEnterTransform = enterTransform(this.f10918nl.m9801j(t));
            long j = this.index + 1;
            this.index = j;
            addLast(new Node(objEnterTransform, j));
            truncate();
        }

        public final void removeFirst() {
            Node node = get().get();
            if (node == null) {
                qkq0.a("Empty list!");
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

        @Override // p014rx.internal.operators.OperatorReplay.InterfaceC1139h
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
                                if (this.f10918nl.m9793a(innerProducer.child, objLeaveTransform)) {
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
                                f5f.m3964e(th);
                                innerProducer.unsubscribe();
                                if (this.f10918nl.m9799h(objLeaveTransform) || this.f10918nl.m9798g(objLeaveTransform)) {
                                    return;
                                }
                                innerProducer.child.onError(OnErrorThrowable.addValueAsLastCause(th, this.f10918nl.m9797e(objLeaveTransform)));
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
        final C1140i<T> parent;
        final AtomicLong totalRequested = new AtomicLong();

        public InnerProducer(C1140i<T> c1140i, z3g0<? super T> z3g0Var) {
            this.parent = c1140i;
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

        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return get() == UNSUBSCRIBED;
        }

        public long produced(long j) {
            long j2;
            long j3;
            if (j <= 0) {
                ig3.a("Cant produce zero or less");
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

        @Override // p003l.rc90
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
            this.parent.m9889k(this);
            this.parent.f10936e.replay(this);
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
            if (get() == UNSUBSCRIBED || getAndSet(UNSUBSCRIBED) == UNSUBSCRIBED) {
                return;
            }
            this.parent.m9890l(this);
            this.parent.m9889k(this);
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
                if (node2 == null || ((hri0) node2.value).m4995a() > jNow) {
                    break;
                }
                node3 = node2.get();
            }
            return node;
        }

        @Override // rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        public Object leaveTransform(Object obj) {
            return ((hri0) obj).m4996b();
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
                        if (((hri0) node2.value).m4995a() > jNow) {
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
                if (node2 == null || this.size <= 1 || ((hri0) node2.value).m4995a() > jNow) {
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

    public static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements InterfaceC1139h<T> {
        private static final long serialVersionUID = 7063189396499112664L;

        /* JADX INFO: renamed from: nl */
        final NotificationLite<T> f10919nl;
        volatile int size;

        public UnboundedReplayBuffer(int i) {
            super(i);
            this.f10919nl = NotificationLite.m9792f();
        }

        @Override // p014rx.internal.operators.OperatorReplay.InterfaceC1139h
        public void complete() {
            add(this.f10919nl.m9794b());
            this.size++;
        }

        @Override // p014rx.internal.operators.OperatorReplay.InterfaceC1139h
        public void error(Throwable th) {
            add(this.f10919nl.m9795c(th));
            this.size++;
        }

        @Override // p014rx.internal.operators.OperatorReplay.InterfaceC1139h
        public void next(T t) {
            add(this.f10919nl.m9801j(t));
            this.size++;
        }

        @Override // p014rx.internal.operators.OperatorReplay.InterfaceC1139h
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
                                if (this.f10919nl.m9793a(innerProducer.child, obj) || innerProducer.isUnsubscribed()) {
                                    return;
                                }
                                iIntValue++;
                                j2++;
                            } catch (Throwable th) {
                                f5f.m3964e(th);
                                innerProducer.unsubscribe();
                                if (this.f10919nl.m9799h(obj) || this.f10919nl.m9798g(obj)) {
                                    return;
                                }
                                innerProducer.child.onError(OnErrorThrowable.addValueAsLastCause(th, this.f10919nl.m9797e(obj)));
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
    public static class C1132a implements v9j {
        @Override // p003l.v9j, java.util.concurrent.Callable
        public Object call() {
            return new UnboundedReplayBuffer(16);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$b */
    public static class C1133b<R> implements C1099c.a<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ v9j f10920a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ w9j f10921b;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$b$a */
        public class a implements e30<c4g0> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z3g0 f10922a;

            public a(z3g0 z3g0Var) {
                this.f10922a = z3g0Var;
            }

            @Override // p003l.e30
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(c4g0 c4g0Var) {
                this.f10922a.m9240b(c4g0Var);
            }
        }

        public C1133b(v9j v9jVar, w9j w9jVar) {
            this.f10920a = v9jVar;
            this.f10921b = w9jVar;
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super R> z3g0Var) {
            try {
                vv5 vv5Var = (vv5) this.f10920a.call();
                ((C1099c) this.f10921b.call(vv5Var)).subscribe((z3g0) z3g0Var);
                vv5Var.mo8404c(new a(z3g0Var));
            } catch (Throwable th) {
                f5f.m3965f(th, z3g0Var);
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$c */
    public static class C1134c implements C1099c.a<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1099c f10924a;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$c$a */
        public class a extends z3g0<T> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ z3g0 f10925e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(z3g0 z3g0Var, z3g0 z3g0Var2) {
                super(z3g0Var);
                this.f10925e = z3g0Var2;
            }

            @Override // p003l.m250
            public void onCompleted() {
                this.f10925e.onCompleted();
            }

            @Override // p003l.m250
            public void onError(Throwable th) {
                this.f10925e.onError(th);
            }

            @Override // p003l.m250
            public void onNext(T t) {
                this.f10925e.onNext(t);
            }
        }

        public C1134c(C1099c c1099c) {
            this.f10924a = c1099c;
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            this.f10924a.unsafeSubscribe(new a(z3g0Var, z3g0Var));
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$d */
    public static class C1135d extends vv5<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vv5 f10927a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1135d(C1099c.a aVar, vv5 vv5Var) {
            super(aVar);
            this.f10927a = vv5Var;
        }

        @Override // p003l.vv5
        /* JADX INFO: renamed from: c */
        public void mo8404c(e30<? super c4g0> e30Var) {
            this.f10927a.mo8404c(e30Var);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$e */
    public static class C1136e implements v9j<InterfaceC1139h<T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f10928a;

        public C1136e(int i) {
            this.f10928a = i;
        }

        @Override // p003l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC1139h<T> call() {
            return new SizeBoundReplayBuffer(this.f10928a);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$f */
    public static class C1137f implements v9j<InterfaceC1139h<T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f10929a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f10930b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ bud0 f10931c;

        public C1137f(int i, long j, bud0 bud0Var) {
            this.f10929a = i;
            this.f10930b = j;
            this.f10931c = bud0Var;
        }

        @Override // p003l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC1139h<T> call() {
            return new SizeAndTimeBoundReplayBuffer(this.f10929a, this.f10930b, this.f10931c);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$g */
    public static class C1138g implements C1099c.a<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicReference f10932a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ v9j f10933b;

        public C1138g(AtomicReference atomicReference, v9j v9jVar) {
            this.f10932a = atomicReference;
            this.f10933b = v9jVar;
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            C1140i c1140i;
            C1140i c1140i2;
            do {
                c1140i = (C1140i) this.f10932a.get();
                if (c1140i == null) {
                    c1140i2 = new C1140i((InterfaceC1139h) this.f10933b.call());
                    c1140i2.m9887i();
                }
                InnerProducer<T> innerProducer = new InnerProducer<>(c1140i, z3g0Var);
                c1140i.m9885g(innerProducer);
                z3g0Var.m9240b(innerProducer);
                c1140i.f10936e.replay(innerProducer);
                z3g0Var.mo3257f(innerProducer);
            } while (!f31.a(this.f10932a, c1140i, c1140i2));
            c1140i = c1140i2;
            InnerProducer<T> innerProducer2 = new InnerProducer<>(c1140i, z3g0Var);
            c1140i.m9885g(innerProducer2);
            z3g0Var.m9240b(innerProducer2);
            c1140i.f10936e.replay(innerProducer2);
            z3g0Var.mo3257f(innerProducer2);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$h */
    public interface InterfaceC1139h<T> {
        void complete();

        void error(Throwable th);

        void next(T t);

        void replay(InnerProducer<T> innerProducer);
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$i */
    public static final class C1140i<T> extends z3g0<T> implements c4g0 {

        /* JADX INFO: renamed from: u */
        public static final InnerProducer[] f10934u = new InnerProducer[0];

        /* JADX INFO: renamed from: v */
        public static final InnerProducer[] f10935v = new InnerProducer[0];

        /* JADX INFO: renamed from: e */
        public final InterfaceC1139h<T> f10936e;

        /* JADX INFO: renamed from: g */
        public boolean f10938g;

        /* JADX INFO: renamed from: h */
        public volatile boolean f10939h;

        /* JADX INFO: renamed from: k */
        public volatile long f10942k;

        /* JADX INFO: renamed from: l */
        public long f10943l;

        /* JADX INFO: renamed from: n */
        public boolean f10945n;

        /* JADX INFO: renamed from: o */
        public boolean f10946o;

        /* JADX INFO: renamed from: p */
        public long f10947p;

        /* JADX INFO: renamed from: q */
        public long f10948q;

        /* JADX INFO: renamed from: r */
        public volatile rc90 f10949r;

        /* JADX INFO: renamed from: s */
        public List<InnerProducer<T>> f10950s;

        /* JADX INFO: renamed from: t */
        public boolean f10951t;

        /* JADX INFO: renamed from: f */
        public final NotificationLite<T> f10937f = NotificationLite.m9792f();

        /* JADX INFO: renamed from: i */
        public final kp50<InnerProducer<T>> f10940i = new kp50<>();

        /* JADX INFO: renamed from: j */
        public InnerProducer<T>[] f10941j = f10934u;

        /* JADX INFO: renamed from: m */
        public final AtomicBoolean f10944m = new AtomicBoolean();

        /* JADX INFO: renamed from: rx.internal.operators.OperatorReplay$i$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p003l.d30
            public void call() {
                if (C1140i.this.f10939h) {
                    return;
                }
                synchronized (C1140i.this.f10940i) {
                    try {
                        if (!C1140i.this.f10939h) {
                            C1140i.this.f10940i.m5764f();
                            C1140i.this.f10942k++;
                            C1140i.this.f10939h = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public C1140i(InterfaceC1139h<T> interfaceC1139h) {
            this.f10936e = interfaceC1139h;
            m9242e(0L);
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo3257f(rc90 rc90Var) {
            if (this.f10949r != null) {
                qkq0.a("Only a single producer can be set on a Subscriber.");
                return;
            }
            this.f10949r = rc90Var;
            m9889k(null);
            m9891m();
        }

        /* JADX INFO: renamed from: g */
        public boolean m9885g(InnerProducer<T> innerProducer) {
            innerProducer.getClass();
            if (this.f10939h) {
                return false;
            }
            synchronized (this.f10940i) {
                try {
                    if (this.f10939h) {
                        return false;
                    }
                    this.f10940i.m5760a(innerProducer);
                    this.f10942k++;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public InnerProducer<T>[] m9886h() {
            InnerProducer<T>[] innerProducerArr;
            synchronized (this.f10940i) {
                InnerProducer<T>[] innerProducerArrM5765g = this.f10940i.m5765g();
                int length = innerProducerArrM5765g.length;
                innerProducerArr = new InnerProducer[length];
                System.arraycopy(innerProducerArrM5765g, 0, innerProducerArr, 0, length);
            }
            return innerProducerArr;
        }

        /* JADX INFO: renamed from: i */
        public void m9887i() {
            m9240b(h4g0.m4914a(new a()));
        }

        /* JADX INFO: renamed from: j */
        public void m9888j(long j, long j2) {
            long j3 = this.f10948q;
            rc90 rc90Var = this.f10949r;
            long j4 = j - j2;
            if (j4 == 0) {
                if (j3 == 0 || rc90Var == null) {
                    return;
                }
                this.f10948q = 0L;
                rc90Var.request(j3);
                return;
            }
            this.f10947p = j;
            if (rc90Var == null) {
                long j5 = j3 + j4;
                if (j5 < 0) {
                    j5 = Long.MAX_VALUE;
                }
                this.f10948q = j5;
                return;
            }
            if (j3 == 0) {
                rc90Var.request(j4);
            } else {
                this.f10948q = 0L;
                rc90Var.request(j3 + j4);
            }
        }

        /* JADX INFO: renamed from: k */
        public void m9889k(InnerProducer<T> innerProducer) {
            long jMax;
            List<InnerProducer<T>> list;
            boolean z;
            long jMax2;
            if (isUnsubscribed()) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f10945n) {
                        if (innerProducer != null) {
                            List arrayList = this.f10950s;
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                this.f10950s = arrayList;
                            }
                            arrayList.add(innerProducer);
                        } else {
                            this.f10951t = true;
                        }
                        this.f10946o = true;
                        return;
                    }
                    this.f10945n = true;
                    long j = this.f10947p;
                    if (innerProducer != null) {
                        jMax = Math.max(j, innerProducer.totalRequested.get());
                    } else {
                        long jMax3 = j;
                        for (InnerProducer<T> innerProducer2 : m9886h()) {
                            if (innerProducer2 != null) {
                                jMax3 = Math.max(jMax3, innerProducer2.totalRequested.get());
                            }
                        }
                        jMax = jMax3;
                    }
                    m9888j(jMax, j);
                    while (!isUnsubscribed()) {
                        synchronized (this) {
                            try {
                                if (!this.f10946o) {
                                    this.f10945n = false;
                                    return;
                                }
                                this.f10946o = false;
                                list = this.f10950s;
                                this.f10950s = null;
                                z = this.f10951t;
                                this.f10951t = false;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        long j2 = this.f10947p;
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
                            for (InnerProducer<T> innerProducer3 : m9886h()) {
                                if (innerProducer3 != null) {
                                    jMax2 = Math.max(jMax2, innerProducer3.totalRequested.get());
                                }
                            }
                        }
                        m9888j(jMax2, j2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: l */
        public void m9890l(InnerProducer<T> innerProducer) {
            if (this.f10939h) {
                return;
            }
            synchronized (this.f10940i) {
                try {
                    if (this.f10939h) {
                        return;
                    }
                    this.f10940i.m5762d(innerProducer);
                    this.f10942k++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: m */
        public void m9891m() {
            InnerProducer<T>[] innerProducerArr = this.f10941j;
            if (this.f10943l != this.f10942k) {
                synchronized (this.f10940i) {
                    try {
                        innerProducerArr = this.f10941j;
                        InnerProducer<T>[] innerProducerArrM5765g = this.f10940i.m5765g();
                        int length = innerProducerArrM5765g.length;
                        if (innerProducerArr.length != length) {
                            innerProducerArr = new InnerProducer[length];
                            this.f10941j = innerProducerArr;
                        }
                        System.arraycopy(innerProducerArrM5765g, 0, innerProducerArr, 0, length);
                        this.f10943l = this.f10942k;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            InterfaceC1139h<T> interfaceC1139h = this.f10936e;
            for (InnerProducer<T> innerProducer : innerProducerArr) {
                if (innerProducer != null) {
                    interfaceC1139h.replay(innerProducer);
                }
            }
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f10938g) {
                return;
            }
            this.f10938g = true;
            try {
                this.f10936e.complete();
                m9891m();
            } finally {
                unsubscribe();
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            if (this.f10938g) {
                return;
            }
            this.f10938g = true;
            try {
                this.f10936e.error(th);
                m9891m();
            } finally {
                unsubscribe();
            }
        }

        @Override // p003l.m250
        public void onNext(T t) {
            if (this.f10938g) {
                return;
            }
            this.f10936e.next(t);
            m9891m();
        }
    }

    public OperatorReplay(C1099c.a<T> aVar, C1099c<? extends T> c1099c, AtomicReference<C1140i<T>> atomicReference, v9j<? extends InterfaceC1139h<T>> v9jVar) {
        super(aVar);
        this.f10915a = c1099c;
        this.f10916b = atomicReference;
        this.f10917c = v9jVar;
    }

    /* JADX INFO: renamed from: e */
    public static <T> vv5<T> m9872e(C1099c<? extends T> c1099c) {
        return m9876i(c1099c, f10914d);
    }

    /* JADX INFO: renamed from: f */
    public static <T> vv5<T> m9873f(C1099c<? extends T> c1099c, int i) {
        return i == Integer.MAX_VALUE ? m9872e(c1099c) : m9876i(c1099c, new C1136e(i));
    }

    /* JADX INFO: renamed from: g */
    public static <T> vv5<T> m9874g(C1099c<? extends T> c1099c, long j, TimeUnit timeUnit, bud0 bud0Var) {
        return m9875h(c1099c, j, timeUnit, bud0Var, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: h */
    public static <T> vv5<T> m9875h(C1099c<? extends T> c1099c, long j, TimeUnit timeUnit, bud0 bud0Var, int i) {
        return m9876i(c1099c, new C1137f(i, timeUnit.toMillis(j), bud0Var));
    }

    /* JADX INFO: renamed from: i */
    public static <T> vv5<T> m9876i(C1099c<? extends T> c1099c, v9j<? extends InterfaceC1139h<T>> v9jVar) {
        AtomicReference atomicReference = new AtomicReference();
        return new OperatorReplay(new C1138g(atomicReference, v9jVar), c1099c, atomicReference, v9jVar);
    }

    /* JADX INFO: renamed from: j */
    public static <T, U, R> C1099c<R> m9877j(v9j<? extends vv5<U>> v9jVar, w9j<? super C1099c<U>, ? extends C1099c<R>> w9jVar) {
        return C1099c.create(new C1133b(v9jVar, w9jVar));
    }

    /* JADX INFO: renamed from: k */
    public static <T> vv5<T> m9878k(vv5<T> vv5Var, bud0 bud0Var) {
        return new C1135d(new C1134c(vv5Var.observeOn(bud0Var)), vv5Var);
    }

    @Override // p003l.vv5
    /* JADX INFO: renamed from: c */
    public void mo8404c(e30<? super c4g0> e30Var) {
        C1140i<T> c1140i;
        while (true) {
            c1140i = this.f10916b.get();
            if (c1140i != null && !c1140i.isUnsubscribed()) {
                break;
            }
            C1140i<T> c1140i2 = new C1140i<>(this.f10917c.call());
            c1140i2.m9887i();
            if (f31.a(this.f10916b, c1140i, c1140i2)) {
                c1140i = c1140i2;
                break;
            }
        }
        boolean z = false;
        if (!c1140i.f10944m.get() && c1140i.f10944m.compareAndSet(false, true)) {
            z = true;
        }
        e30Var.call(c1140i);
        if (z) {
            this.f10915a.unsafeSubscribe(c1140i);
        }
    }
}
