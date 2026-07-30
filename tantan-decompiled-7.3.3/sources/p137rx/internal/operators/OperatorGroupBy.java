package p137rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.C22421c;
import p137rx.internal.util.UtilityFunctions;
import p153l.fcg0;
import p153l.gcg0;
import p153l.hrd0;
import p153l.icg0;
import p153l.j6f;
import p153l.kcg0;
import p153l.oqk;
import p153l.pcg0;
import p153l.qcj;
import p153l.rc2;
import p153l.urd0;
import p153l.vk90;
import p153l.x20;
import p153l.xk90;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public final class OperatorGroupBy<T, K, V> implements C22421c.c<oqk<K, V>, T> {

    /* JADX INFO: renamed from: a */
    public final qcj<? super T, ? extends K> f208136a;

    /* JADX INFO: renamed from: b */
    public final qcj<? super T, ? extends V> f208137b;

    /* JADX INFO: renamed from: c */
    public final int f208138c;

    /* JADX INFO: renamed from: d */
    public final boolean f208139d;

    /* JADX INFO: renamed from: e */
    public final qcj<y20<K>, Map<K, Object>> f208140e;

    public static final class State<T, K> extends AtomicInteger implements vk90, kcg0, C22421c.a<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final K key;
        final C22443c<?, K, T> parent;
        final Queue<Object> queue = new ConcurrentLinkedQueue();
        final AtomicBoolean cancelled = new AtomicBoolean();
        final AtomicReference<gcg0<? super T>> actual = new AtomicReference<>();
        final AtomicBoolean once = new AtomicBoolean();
        final AtomicLong requested = new AtomicLong();

        public State(int i, C22443c<?, K, T> c22443c, K k, boolean z) {
            this.parent = c22443c;
            this.key = k;
            this.delayError = z;
        }

        @Override // p153l.y20
        public void call(gcg0<? super T> gcg0Var) {
            if (!this.once.compareAndSet(false, true)) {
                gcg0Var.onError(new IllegalStateException("Only one Subscriber allowed!"));
                return;
            }
            gcg0Var.m129866b(this);
            gcg0Var.mo95773f(this);
            this.actual.lazySet(gcg0Var);
            drain();
        }

        public boolean checkTerminated(boolean z, boolean z2, gcg0<? super T> gcg0Var, boolean z3) {
            if (this.cancelled.get()) {
                this.queue.clear();
                this.parent.m222619h(this.key);
                return true;
            }
            if (!z) {
                return false;
            }
            if (z3) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.error;
                if (th != null) {
                    gcg0Var.onError(th);
                } else {
                    gcg0Var.onCompleted();
                }
                return true;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.queue.clear();
                gcg0Var.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            gcg0Var.onCompleted();
            return true;
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            Queue<Object> queue = this.queue;
            boolean z = this.delayError;
            gcg0<? super T> gcg0Var = this.actual.get();
            NotificationLite notificationLiteM222581f = NotificationLite.m222581f();
            int iAddAndGet = 1;
            while (true) {
                if (gcg0Var != null) {
                    if (checkTerminated(this.done, queue.isEmpty(), gcg0Var, z)) {
                        return;
                    }
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z2 = this.done;
                        Object objPoll = queue.poll();
                        boolean z3 = objPoll == null;
                        if (checkTerminated(z2, z3, gcg0Var, z)) {
                            return;
                        }
                        if (z3) {
                            break;
                        }
                        gcg0Var.onNext((Object) notificationLiteM222581f.m222586e(objPoll));
                        j2++;
                    }
                    if (j2 != 0) {
                        if (j != Long.MAX_VALUE) {
                            rc2.m180777i(this.requested, j2);
                        }
                        this.parent.f208154n.request(j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (gcg0Var == null) {
                    gcg0Var = this.actual.get();
                }
            }
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return this.cancelled.get();
        }

        public void onComplete() {
            this.done = true;
            drain();
        }

        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        public void onNext(T t) {
            if (t == null) {
                this.error = new NullPointerException();
                this.done = true;
            } else {
                this.queue.offer(NotificationLite.m222581f().m222590j(t));
            }
            drain();
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

        @Override // p153l.kcg0
        public void unsubscribe() {
            if (this.cancelled.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.parent.m222619h(this.key);
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorGroupBy$a */
    public class C22441a implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C22443c f208141a;

        public C22441a(C22443c c22443c) {
            this.f208141a = c22443c;
        }

        @Override // p153l.x20
        public void call() {
            this.f208141a.m222618g();
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorGroupBy$b */
    public static final class C22442b implements vk90 {

        /* JADX INFO: renamed from: a */
        public final C22443c<?, ?, ?> f208143a;

        public C22442b(C22443c<?, ?, ?> c22443c) {
            this.f208143a = c22443c;
        }

        @Override // p153l.vk90
        public void request(long j) {
            this.f208143a.m222624m(j);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorGroupBy$c */
    public static final class C22443c<T, K, V> extends gcg0<T> {

        /* JADX INFO: renamed from: u */
        public static final Object f208144u = new Object();

        /* JADX INFO: renamed from: e */
        public final gcg0<? super oqk<K, V>> f208145e;

        /* JADX INFO: renamed from: f */
        public final qcj<? super T, ? extends K> f208146f;

        /* JADX INFO: renamed from: g */
        public final qcj<? super T, ? extends V> f208147g;

        /* JADX INFO: renamed from: h */
        public final int f208148h;

        /* JADX INFO: renamed from: i */
        public final boolean f208149i;

        /* JADX INFO: renamed from: j */
        public final Map<Object, C22444d<K, V>> f208150j;

        /* JADX INFO: renamed from: k */
        public final Queue<oqk<K, V>> f208151k = new ConcurrentLinkedQueue();

        /* JADX INFO: renamed from: l */
        public final C22442b f208152l;

        /* JADX INFO: renamed from: m */
        public final Queue<K> f208153m;

        /* JADX INFO: renamed from: n */
        public final xk90 f208154n;

        /* JADX INFO: renamed from: o */
        public final AtomicBoolean f208155o;

        /* JADX INFO: renamed from: p */
        public final AtomicLong f208156p;

        /* JADX INFO: renamed from: q */
        public final AtomicInteger f208157q;

        /* JADX INFO: renamed from: r */
        public Throwable f208158r;

        /* JADX INFO: renamed from: s */
        public volatile boolean f208159s;

        /* JADX INFO: renamed from: t */
        public final AtomicInteger f208160t;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorGroupBy$c$a */
        public static class a<K> implements y20<K> {

            /* JADX INFO: renamed from: a */
            public final Queue<K> f208161a;

            public a(Queue<K> queue) {
                this.f208161a = queue;
            }

            @Override // p153l.y20
            public void call(K k) {
                this.f208161a.offer(k);
            }
        }

        public C22443c(gcg0<? super oqk<K, V>> gcg0Var, qcj<? super T, ? extends K> qcjVar, qcj<? super T, ? extends V> qcjVar2, int i, boolean z, qcj<y20<K>, Map<K, Object>> qcjVar3) {
            this.f208145e = gcg0Var;
            this.f208146f = qcjVar;
            this.f208147g = qcjVar2;
            this.f208148h = i;
            this.f208149i = z;
            xk90 xk90Var = new xk90();
            this.f208154n = xk90Var;
            xk90Var.request(i);
            this.f208152l = new C22442b(this);
            this.f208155o = new AtomicBoolean();
            this.f208156p = new AtomicLong();
            this.f208157q = new AtomicInteger(1);
            this.f208160t = new AtomicInteger();
            if (qcjVar3 == null) {
                this.f208150j = new ConcurrentHashMap();
                this.f208153m = null;
            } else {
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                this.f208153m = concurrentLinkedQueue;
                this.f208150j = m222621j(qcjVar3, new a(concurrentLinkedQueue));
            }
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: f */
        public void mo95773f(vk90 vk90Var) {
            this.f208154n.m211356c(vk90Var);
        }

        /* JADX INFO: renamed from: g */
        public void m222618g() {
            if (this.f208155o.compareAndSet(false, true) && this.f208157q.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m222619h(K k) {
            if (k == null) {
                k = (K) f208144u;
            }
            if (this.f208150j.remove(k) == null || this.f208157q.decrementAndGet() != 0) {
                return;
            }
            unsubscribe();
        }

        /* JADX INFO: renamed from: i */
        public boolean m222620i(boolean z, boolean z2, gcg0<? super oqk<K, V>> gcg0Var, Queue<?> queue) {
            if (!z) {
                return false;
            }
            Throwable th = this.f208158r;
            if (th != null) {
                m222623l(gcg0Var, queue, th);
                return true;
            }
            if (!z2) {
                return false;
            }
            this.f208145e.onCompleted();
            return true;
        }

        /* JADX INFO: renamed from: j */
        public final Map<Object, C22444d<K, V>> m222621j(qcj<y20<K>, Map<K, Object>> qcjVar, y20<K> y20Var) {
            return qcjVar.call(y20Var);
        }

        /* JADX INFO: renamed from: k */
        public void m222622k() {
            if (this.f208160t.getAndIncrement() != 0) {
                return;
            }
            Queue<oqk<K, V>> queue = this.f208151k;
            gcg0<? super oqk<K, V>> gcg0Var = this.f208145e;
            int iAddAndGet = 1;
            while (!m222620i(this.f208159s, queue.isEmpty(), gcg0Var, queue)) {
                long j = this.f208156p.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.f208159s;
                    oqk<K, V> oqkVarPoll = queue.poll();
                    boolean z2 = oqkVarPoll == null;
                    if (m222620i(z, z2, gcg0Var, queue)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    gcg0Var.onNext(oqkVarPoll);
                    j2++;
                }
                if (j2 != 0) {
                    if (j != Long.MAX_VALUE) {
                        rc2.m180777i(this.f208156p, j2);
                    }
                    this.f208154n.request(j2);
                }
                iAddAndGet = this.f208160t.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: l */
        public void m222623l(gcg0<? super oqk<K, V>> gcg0Var, Queue<?> queue, Throwable th) {
            queue.clear();
            ArrayList arrayList = new ArrayList(this.f208150j.values());
            this.f208150j.clear();
            Queue<K> queue2 = this.f208153m;
            if (queue2 != null) {
                queue2.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C22444d) it.next()).onError(th);
            }
            gcg0Var.onError(th);
        }

        /* JADX INFO: renamed from: m */
        public void m222624m(long j) {
            if (j < 0) {
                fcg0.m125008a("n >= 0 required but it was ", j);
            } else {
                rc2.m180770b(this.f208156p, j);
                m222622k();
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f208159s) {
                return;
            }
            Iterator<C22444d<K, V>> it = this.f208150j.values().iterator();
            while (it.hasNext()) {
                it.next().m222626b();
            }
            this.f208150j.clear();
            Queue<K> queue = this.f208153m;
            if (queue != null) {
                queue.clear();
            }
            this.f208159s = true;
            this.f208157q.decrementAndGet();
            m222622k();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (this.f208159s) {
                hrd0.m136792j(th);
                return;
            }
            this.f208158r = th;
            this.f208159s = true;
            this.f208157q.decrementAndGet();
            m222622k();
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            boolean z;
            if (this.f208159s) {
                return;
            }
            Queue<?> queue = this.f208151k;
            gcg0<? super oqk<K, V>> gcg0Var = this.f208145e;
            try {
                K kCall = this.f208146f.call(t);
                Object obj = kCall != null ? kCall : f208144u;
                C22444d<K, V> c22444dM222625a = this.f208150j.get(obj);
                if (c22444dM222625a != null) {
                    z = true;
                } else {
                    if (this.f208155o.get()) {
                        return;
                    }
                    c22444dM222625a = C22444d.m222625a(kCall, this.f208148h, this, this.f208149i);
                    this.f208150j.put(obj, c22444dM222625a);
                    this.f208157q.getAndIncrement();
                    queue.offer(c22444dM222625a);
                    m222622k();
                    z = false;
                }
                try {
                    c22444dM222625a.onNext(this.f208147g.call(t));
                    if (this.f208153m != null) {
                        while (true) {
                            K kPoll = this.f208153m.poll();
                            if (kPoll == null) {
                                break;
                            }
                            C22444d<K, V> c22444d = this.f208150j.get(kPoll);
                            if (c22444d != null) {
                                c22444d.m222626b();
                            }
                        }
                    }
                    if (z) {
                        this.f208154n.request(1L);
                    }
                } catch (Throwable th) {
                    unsubscribe();
                    m222623l(gcg0Var, queue, th);
                }
            } catch (Throwable th2) {
                unsubscribe();
                m222623l(gcg0Var, queue, th2);
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorGroupBy$d */
    public static final class C22444d<K, T> extends oqk<K, T> {

        /* JADX INFO: renamed from: b */
        public final State<T, K> f208162b;

        public C22444d(K k, State<T, K> state) {
            super(k, state);
            this.f208162b = state;
        }

        /* JADX INFO: renamed from: a */
        public static <T, K> C22444d<K, T> m222625a(K k, int i, C22443c<?, K, T> c22443c, boolean z) {
            return new C22444d<>(k, new State(i, c22443c, k, z));
        }

        /* JADX INFO: renamed from: b */
        public void m222626b() {
            this.f208162b.onComplete();
        }

        public void onError(Throwable th) {
            this.f208162b.onError(th);
        }

        public void onNext(T t) {
            this.f208162b.onNext(t);
        }
    }

    public OperatorGroupBy(qcj<? super T, ? extends K> qcjVar) {
        this(qcjVar, UtilityFunctions.m222733b(), urd0.f180601g, false, null);
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super oqk<K, V>> gcg0Var) {
        gcg0<? super oqk<K, V>> gcg0Var2;
        try {
            gcg0Var2 = gcg0Var;
            try {
                C22443c c22443c = new C22443c(gcg0Var2, this.f208136a, this.f208137b, this.f208138c, this.f208139d, this.f208140e);
                gcg0Var2.m129866b(pcg0.m171648a(new C22441a(c22443c)));
                gcg0Var2.mo95773f(c22443c.f208152l);
                return c22443c;
            } catch (Throwable th) {
                th = th;
                j6f.m143664f(th, gcg0Var2);
                gcg0<? super T> gcg0VarM139434a = icg0.m139434a();
                gcg0VarM139434a.unsubscribe();
                return gcg0VarM139434a;
            }
        } catch (Throwable th2) {
            th = th2;
            gcg0Var2 = gcg0Var;
        }
    }

    public OperatorGroupBy(qcj<? super T, ? extends K> qcjVar, qcj<? super T, ? extends V> qcjVar2) {
        this(qcjVar, qcjVar2, urd0.f180601g, false, null);
    }

    public OperatorGroupBy(qcj<? super T, ? extends K> qcjVar, qcj<? super T, ? extends V> qcjVar2, qcj<y20<K>, Map<K, Object>> qcjVar3) {
        this(qcjVar, qcjVar2, urd0.f180601g, false, qcjVar3);
    }

    public OperatorGroupBy(qcj<? super T, ? extends K> qcjVar, qcj<? super T, ? extends V> qcjVar2, int i, boolean z, qcj<y20<K>, Map<K, Object>> qcjVar3) {
        this.f208136a = qcjVar;
        this.f208137b = qcjVar2;
        this.f208138c = i;
        this.f208139d = z;
        this.f208140e = qcjVar3;
    }
}
