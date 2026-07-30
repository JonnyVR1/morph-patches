package p133rx.internal.operators;

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
import p133rx.C22306c;
import p133rx.internal.util.UtilityFunctions;
import p149l.a4g0;
import p149l.c4g0;
import p149l.d30;
import p149l.e30;
import p149l.ejd0;
import p149l.f5f;
import p149l.h4g0;
import p149l.kc2;
import p149l.rc90;
import p149l.rjd0;
import p149l.tc90;
import p149l.w9j;
import p149l.y3g0;
import p149l.ynk;
import p149l.z3g0;

/* JADX INFO: loaded from: classes3.dex */
public final class OperatorGroupBy<T, K, V> implements C22306c.c<ynk<K, V>, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, ? extends K> f207214a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super T, ? extends V> f207215b;

    /* JADX INFO: renamed from: c */
    public final int f207216c;

    /* JADX INFO: renamed from: d */
    public final boolean f207217d;

    /* JADX INFO: renamed from: e */
    public final w9j<e30<K>, Map<K, Object>> f207218e;

    public static final class State<T, K> extends AtomicInteger implements rc90, c4g0, C22306c.a<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final K key;
        final C22328c<?, K, T> parent;
        final Queue<Object> queue = new ConcurrentLinkedQueue();
        final AtomicBoolean cancelled = new AtomicBoolean();
        final AtomicReference<z3g0<? super T>> actual = new AtomicReference<>();
        final AtomicBoolean once = new AtomicBoolean();
        final AtomicLong requested = new AtomicLong();

        public State(int i, C22328c<?, K, T> c22328c, K k, boolean z) {
            this.parent = c22328c;
            this.key = k;
            this.delayError = z;
        }

        @Override // p149l.e30
        public void call(z3g0<? super T> z3g0Var) {
            if (!this.once.compareAndSet(false, true)) {
                z3g0Var.onError(new IllegalStateException("Only one Subscriber allowed!"));
                return;
            }
            z3g0Var.m217046b(this);
            z3g0Var.mo106696f(this);
            this.actual.lazySet(z3g0Var);
            drain();
        }

        public boolean checkTerminated(boolean z, boolean z2, z3g0<? super T> z3g0Var, boolean z3) {
            if (this.cancelled.get()) {
                this.queue.clear();
                this.parent.m221373h(this.key);
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
                    z3g0Var.onError(th);
                } else {
                    z3g0Var.onCompleted();
                }
                return true;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.queue.clear();
                z3g0Var.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            z3g0Var.onCompleted();
            return true;
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            Queue<Object> queue = this.queue;
            boolean z = this.delayError;
            z3g0<? super T> z3g0Var = this.actual.get();
            NotificationLite notificationLiteM221335f = NotificationLite.m221335f();
            int iAddAndGet = 1;
            while (true) {
                if (z3g0Var != null) {
                    if (checkTerminated(this.done, queue.isEmpty(), z3g0Var, z)) {
                        return;
                    }
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z2 = this.done;
                        Object objPoll = queue.poll();
                        boolean z3 = objPoll == null;
                        if (checkTerminated(z2, z3, z3g0Var, z)) {
                            return;
                        }
                        if (z3) {
                            break;
                        }
                        z3g0Var.onNext((Object) notificationLiteM221335f.m221340e(objPoll));
                        j2++;
                    }
                    if (j2 != 0) {
                        if (j != Long.MAX_VALUE) {
                            kc2.m145343i(this.requested, j2);
                        }
                        this.parent.f207232n.request(j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (z3g0Var == null) {
                    z3g0Var = this.actual.get();
                }
            }
        }

        @Override // p149l.c4g0
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
                this.queue.offer(NotificationLite.m221335f().m221344j(t));
            }
            drain();
        }

        @Override // p149l.rc90
        public void request(long j) {
            if (j < 0) {
                y3g0.m212802a("n >= required but it was ", j);
            } else if (j != 0) {
                kc2.m145336b(this.requested, j);
                drain();
            }
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            if (this.cancelled.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.parent.m221373h(this.key);
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorGroupBy$a */
    public class C22326a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C22328c f207219a;

        public C22326a(C22328c c22328c) {
            this.f207219a = c22328c;
        }

        @Override // p149l.d30
        public void call() {
            this.f207219a.m221372g();
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorGroupBy$b */
    public static final class C22327b implements rc90 {

        /* JADX INFO: renamed from: a */
        public final C22328c<?, ?, ?> f207221a;

        public C22327b(C22328c<?, ?, ?> c22328c) {
            this.f207221a = c22328c;
        }

        @Override // p149l.rc90
        public void request(long j) {
            this.f207221a.m221378m(j);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorGroupBy$c */
    public static final class C22328c<T, K, V> extends z3g0<T> {

        /* JADX INFO: renamed from: u */
        public static final Object f207222u = new Object();

        /* JADX INFO: renamed from: e */
        public final z3g0<? super ynk<K, V>> f207223e;

        /* JADX INFO: renamed from: f */
        public final w9j<? super T, ? extends K> f207224f;

        /* JADX INFO: renamed from: g */
        public final w9j<? super T, ? extends V> f207225g;

        /* JADX INFO: renamed from: h */
        public final int f207226h;

        /* JADX INFO: renamed from: i */
        public final boolean f207227i;

        /* JADX INFO: renamed from: j */
        public final Map<Object, C22329d<K, V>> f207228j;

        /* JADX INFO: renamed from: k */
        public final Queue<ynk<K, V>> f207229k = new ConcurrentLinkedQueue();

        /* JADX INFO: renamed from: l */
        public final C22327b f207230l;

        /* JADX INFO: renamed from: m */
        public final Queue<K> f207231m;

        /* JADX INFO: renamed from: n */
        public final tc90 f207232n;

        /* JADX INFO: renamed from: o */
        public final AtomicBoolean f207233o;

        /* JADX INFO: renamed from: p */
        public final AtomicLong f207234p;

        /* JADX INFO: renamed from: q */
        public final AtomicInteger f207235q;

        /* JADX INFO: renamed from: r */
        public Throwable f207236r;

        /* JADX INFO: renamed from: s */
        public volatile boolean f207237s;

        /* JADX INFO: renamed from: t */
        public final AtomicInteger f207238t;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorGroupBy$c$a */
        public static class a<K> implements e30<K> {

            /* JADX INFO: renamed from: a */
            public final Queue<K> f207239a;

            public a(Queue<K> queue) {
                this.f207239a = queue;
            }

            @Override // p149l.e30
            public void call(K k) {
                this.f207239a.offer(k);
            }
        }

        public C22328c(z3g0<? super ynk<K, V>> z3g0Var, w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2, int i, boolean z, w9j<e30<K>, Map<K, Object>> w9jVar3) {
            this.f207223e = z3g0Var;
            this.f207224f = w9jVar;
            this.f207225g = w9jVar2;
            this.f207226h = i;
            this.f207227i = z;
            tc90 tc90Var = new tc90();
            this.f207232n = tc90Var;
            tc90Var.request(i);
            this.f207230l = new C22327b(this);
            this.f207233o = new AtomicBoolean();
            this.f207234p = new AtomicLong();
            this.f207235q = new AtomicInteger(1);
            this.f207238t = new AtomicInteger();
            if (w9jVar3 == null) {
                this.f207228j = new ConcurrentHashMap();
                this.f207231m = null;
            } else {
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                this.f207231m = concurrentLinkedQueue;
                this.f207228j = m221375j(w9jVar3, new a(concurrentLinkedQueue));
            }
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo106696f(rc90 rc90Var) {
            this.f207232n.m187981c(rc90Var);
        }

        /* JADX INFO: renamed from: g */
        public void m221372g() {
            if (this.f207233o.compareAndSet(false, true) && this.f207235q.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m221373h(K k) {
            if (k == null) {
                k = (K) f207222u;
            }
            if (this.f207228j.remove(k) == null || this.f207235q.decrementAndGet() != 0) {
                return;
            }
            unsubscribe();
        }

        /* JADX INFO: renamed from: i */
        public boolean m221374i(boolean z, boolean z2, z3g0<? super ynk<K, V>> z3g0Var, Queue<?> queue) {
            if (!z) {
                return false;
            }
            Throwable th = this.f207236r;
            if (th != null) {
                m221377l(z3g0Var, queue, th);
                return true;
            }
            if (!z2) {
                return false;
            }
            this.f207223e.onCompleted();
            return true;
        }

        /* JADX INFO: renamed from: j */
        public final Map<Object, C22329d<K, V>> m221375j(w9j<e30<K>, Map<K, Object>> w9jVar, e30<K> e30Var) {
            return w9jVar.call(e30Var);
        }

        /* JADX INFO: renamed from: k */
        public void m221376k() {
            if (this.f207238t.getAndIncrement() != 0) {
                return;
            }
            Queue<ynk<K, V>> queue = this.f207229k;
            z3g0<? super ynk<K, V>> z3g0Var = this.f207223e;
            int iAddAndGet = 1;
            while (!m221374i(this.f207237s, queue.isEmpty(), z3g0Var, queue)) {
                long j = this.f207234p.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.f207237s;
                    ynk<K, V> ynkVarPoll = queue.poll();
                    boolean z2 = ynkVarPoll == null;
                    if (m221374i(z, z2, z3g0Var, queue)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    z3g0Var.onNext(ynkVarPoll);
                    j2++;
                }
                if (j2 != 0) {
                    if (j != Long.MAX_VALUE) {
                        kc2.m145343i(this.f207234p, j2);
                    }
                    this.f207232n.request(j2);
                }
                iAddAndGet = this.f207238t.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: l */
        public void m221377l(z3g0<? super ynk<K, V>> z3g0Var, Queue<?> queue, Throwable th) {
            queue.clear();
            ArrayList arrayList = new ArrayList(this.f207228j.values());
            this.f207228j.clear();
            Queue<K> queue2 = this.f207231m;
            if (queue2 != null) {
                queue2.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C22329d) it.next()).onError(th);
            }
            z3g0Var.onError(th);
        }

        /* JADX INFO: renamed from: m */
        public void m221378m(long j) {
            if (j < 0) {
                y3g0.m212802a("n >= 0 required but it was ", j);
            } else {
                kc2.m145336b(this.f207234p, j);
                m221376k();
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f207237s) {
                return;
            }
            Iterator<C22329d<K, V>> it = this.f207228j.values().iterator();
            while (it.hasNext()) {
                it.next().m221380b();
            }
            this.f207228j.clear();
            Queue<K> queue = this.f207231m;
            if (queue != null) {
                queue.clear();
            }
            this.f207237s = true;
            this.f207235q.decrementAndGet();
            m221376k();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            if (this.f207237s) {
                ejd0.m116793j(th);
                return;
            }
            this.f207236r = th;
            this.f207237s = true;
            this.f207235q.decrementAndGet();
            m221376k();
        }

        @Override // p149l.m250
        public void onNext(T t) {
            boolean z;
            if (this.f207237s) {
                return;
            }
            Queue<?> queue = this.f207229k;
            z3g0<? super ynk<K, V>> z3g0Var = this.f207223e;
            try {
                K kCall = this.f207224f.call(t);
                Object obj = kCall != null ? kCall : f207222u;
                C22329d<K, V> c22329dM221379a = this.f207228j.get(obj);
                if (c22329dM221379a != null) {
                    z = true;
                } else {
                    if (this.f207233o.get()) {
                        return;
                    }
                    c22329dM221379a = C22329d.m221379a(kCall, this.f207226h, this, this.f207227i);
                    this.f207228j.put(obj, c22329dM221379a);
                    this.f207235q.getAndIncrement();
                    queue.offer(c22329dM221379a);
                    m221376k();
                    z = false;
                }
                try {
                    c22329dM221379a.onNext(this.f207225g.call(t));
                    if (this.f207231m != null) {
                        while (true) {
                            K kPoll = this.f207231m.poll();
                            if (kPoll == null) {
                                break;
                            }
                            C22329d<K, V> c22329d = this.f207228j.get(kPoll);
                            if (c22329d != null) {
                                c22329d.m221380b();
                            }
                        }
                    }
                    if (z) {
                        this.f207232n.request(1L);
                    }
                } catch (Throwable th) {
                    unsubscribe();
                    m221377l(z3g0Var, queue, th);
                }
            } catch (Throwable th2) {
                unsubscribe();
                m221377l(z3g0Var, queue, th2);
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorGroupBy$d */
    public static final class C22329d<K, T> extends ynk<K, T> {

        /* JADX INFO: renamed from: b */
        public final State<T, K> f207240b;

        public C22329d(K k, State<T, K> state) {
            super(k, state);
            this.f207240b = state;
        }

        /* JADX INFO: renamed from: a */
        public static <T, K> C22329d<K, T> m221379a(K k, int i, C22328c<?, K, T> c22328c, boolean z) {
            return new C22329d<>(k, new State(i, c22328c, k, z));
        }

        /* JADX INFO: renamed from: b */
        public void m221380b() {
            this.f207240b.onComplete();
        }

        public void onError(Throwable th) {
            this.f207240b.onError(th);
        }

        public void onNext(T t) {
            this.f207240b.onNext(t);
        }
    }

    public OperatorGroupBy(w9j<? super T, ? extends K> w9jVar) {
        this(w9jVar, UtilityFunctions.m221487b(), rjd0.f159670g, false, null);
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super ynk<K, V>> z3g0Var) {
        z3g0<? super ynk<K, V>> z3g0Var2;
        try {
            z3g0Var2 = z3g0Var;
            try {
                C22328c c22328c = new C22328c(z3g0Var2, this.f207214a, this.f207215b, this.f207216c, this.f207217d, this.f207218e);
                z3g0Var2.m217046b(h4g0.m129240a(new C22326a(c22328c)));
                z3g0Var2.mo106696f(c22328c.f207230l);
                return c22328c;
            } catch (Throwable th) {
                th = th;
                f5f.m119492f(th, z3g0Var2);
                z3g0<? super T> z3g0VarM94917a = a4g0.m94917a();
                z3g0VarM94917a.unsubscribe();
                return z3g0VarM94917a;
            }
        } catch (Throwable th2) {
            th = th2;
            z3g0Var2 = z3g0Var;
        }
    }

    public OperatorGroupBy(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2) {
        this(w9jVar, w9jVar2, rjd0.f159670g, false, null);
    }

    public OperatorGroupBy(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2, w9j<e30<K>, Map<K, Object>> w9jVar3) {
        this(w9jVar, w9jVar2, rjd0.f159670g, false, w9jVar3);
    }

    public OperatorGroupBy(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2, int i, boolean z, w9j<e30<K>, Map<K, Object>> w9jVar3) {
        this.f207214a = w9jVar;
        this.f207215b = w9jVar2;
        this.f207216c = i;
        this.f207217d = z;
        this.f207218e = w9jVar3;
    }
}
