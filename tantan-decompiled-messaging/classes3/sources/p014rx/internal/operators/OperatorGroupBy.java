package p014rx.internal.operators;

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
import p003l.a4g0;
import p003l.c4g0;
import p003l.d30;
import p003l.e30;
import p003l.ejd0;
import p003l.f5f;
import p003l.h4g0;
import p003l.kc2;
import p003l.rc90;
import p003l.rjd0;
import p003l.tc90;
import p003l.w9j;
import p003l.y3g0;
import p003l.ynk;
import p003l.z3g0;
import p014rx.C1099c;
import p014rx.internal.util.UtilityFunctions;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class OperatorGroupBy<T, K, V> implements C1099c.c<ynk<K, V>, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, ? extends K> f10839a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super T, ? extends V> f10840b;

    /* JADX INFO: renamed from: c */
    public final int f10841c;

    /* JADX INFO: renamed from: d */
    public final boolean f10842d;

    /* JADX INFO: renamed from: e */
    public final w9j<e30<K>, Map<K, Object>> f10843e;

    public static final class State<T, K> extends AtomicInteger implements rc90, c4g0, C1099c.a<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final K key;
        final C1121c<?, K, T> parent;
        final Queue<Object> queue = new ConcurrentLinkedQueue();
        final AtomicBoolean cancelled = new AtomicBoolean();
        final AtomicReference<z3g0<? super T>> actual = new AtomicReference<>();
        final AtomicBoolean once = new AtomicBoolean();
        final AtomicLong requested = new AtomicLong();

        public State(int i, C1121c<?, K, T> c1121c, K k, boolean z) {
            this.parent = c1121c;
            this.key = k;
            this.delayError = z;
        }

        @Override // p003l.e30
        public void call(z3g0<? super T> z3g0Var) {
            if (!this.once.compareAndSet(false, true)) {
                z3g0Var.onError(new IllegalStateException("Only one Subscriber allowed!"));
                return;
            }
            z3g0Var.m9240b(this);
            z3g0Var.mo3257f(this);
            this.actual.lazySet(z3g0Var);
            drain();
        }

        public boolean checkTerminated(boolean z, boolean z2, z3g0<? super T> z3g0Var, boolean z3) {
            if (this.cancelled.get()) {
                this.queue.clear();
                this.parent.m9830h(this.key);
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
            NotificationLite notificationLiteM9792f = NotificationLite.m9792f();
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
                        z3g0Var.onNext((Object) notificationLiteM9792f.m9797e(objPoll));
                        j2++;
                    }
                    if (j2 != 0) {
                        if (j != Long.MAX_VALUE) {
                            kc2.m5647i(this.requested, j2);
                        }
                        this.parent.f10857n.request(j2);
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

        @Override // p003l.c4g0
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
                this.queue.offer(NotificationLite.m9792f().m9801j(t));
            }
            drain();
        }

        @Override // p003l.rc90
        public void request(long j) {
            if (j < 0) {
                y3g0.m8887a("n >= required but it was ", j);
            } else if (j != 0) {
                kc2.m5640b(this.requested, j);
                drain();
            }
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
            if (this.cancelled.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.parent.m9830h(this.key);
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorGroupBy$a */
    public class C1119a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1121c f10844a;

        public C1119a(C1121c c1121c) {
            this.f10844a = c1121c;
        }

        @Override // p003l.d30
        public void call() {
            this.f10844a.m9829g();
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorGroupBy$b */
    public static final class C1120b implements rc90 {

        /* JADX INFO: renamed from: a */
        public final C1121c<?, ?, ?> f10846a;

        public C1120b(C1121c<?, ?, ?> c1121c) {
            this.f10846a = c1121c;
        }

        @Override // p003l.rc90
        public void request(long j) {
            this.f10846a.m9835m(j);
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorGroupBy$c */
    public static final class C1121c<T, K, V> extends z3g0<T> {

        /* JADX INFO: renamed from: u */
        public static final Object f10847u = new Object();

        /* JADX INFO: renamed from: e */
        public final z3g0<? super ynk<K, V>> f10848e;

        /* JADX INFO: renamed from: f */
        public final w9j<? super T, ? extends K> f10849f;

        /* JADX INFO: renamed from: g */
        public final w9j<? super T, ? extends V> f10850g;

        /* JADX INFO: renamed from: h */
        public final int f10851h;

        /* JADX INFO: renamed from: i */
        public final boolean f10852i;

        /* JADX INFO: renamed from: j */
        public final Map<Object, C1122d<K, V>> f10853j;

        /* JADX INFO: renamed from: k */
        public final Queue<ynk<K, V>> f10854k = new ConcurrentLinkedQueue();

        /* JADX INFO: renamed from: l */
        public final C1120b f10855l;

        /* JADX INFO: renamed from: m */
        public final Queue<K> f10856m;

        /* JADX INFO: renamed from: n */
        public final tc90 f10857n;

        /* JADX INFO: renamed from: o */
        public final AtomicBoolean f10858o;

        /* JADX INFO: renamed from: p */
        public final AtomicLong f10859p;

        /* JADX INFO: renamed from: q */
        public final AtomicInteger f10860q;

        /* JADX INFO: renamed from: r */
        public Throwable f10861r;

        /* JADX INFO: renamed from: s */
        public volatile boolean f10862s;

        /* JADX INFO: renamed from: t */
        public final AtomicInteger f10863t;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorGroupBy$c$a */
        public static class a<K> implements e30<K> {

            /* JADX INFO: renamed from: a */
            public final Queue<K> f10864a;

            public a(Queue<K> queue) {
                this.f10864a = queue;
            }

            @Override // p003l.e30
            public void call(K k) {
                this.f10864a.offer(k);
            }
        }

        public C1121c(z3g0<? super ynk<K, V>> z3g0Var, w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2, int i, boolean z, w9j<e30<K>, Map<K, Object>> w9jVar3) {
            this.f10848e = z3g0Var;
            this.f10849f = w9jVar;
            this.f10850g = w9jVar2;
            this.f10851h = i;
            this.f10852i = z;
            tc90 tc90Var = new tc90();
            this.f10857n = tc90Var;
            tc90Var.request(i);
            this.f10855l = new C1120b(this);
            this.f10858o = new AtomicBoolean();
            this.f10859p = new AtomicLong();
            this.f10860q = new AtomicInteger(1);
            this.f10863t = new AtomicInteger();
            if (w9jVar3 == null) {
                this.f10853j = new ConcurrentHashMap();
                this.f10856m = null;
            } else {
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                this.f10856m = concurrentLinkedQueue;
                this.f10853j = m9832j(w9jVar3, new a(concurrentLinkedQueue));
            }
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo3257f(rc90 rc90Var) {
            this.f10857n.m7738c(rc90Var);
        }

        /* JADX INFO: renamed from: g */
        public void m9829g() {
            if (this.f10858o.compareAndSet(false, true) && this.f10860q.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m9830h(K k) {
            if (k == null) {
                k = (K) f10847u;
            }
            if (this.f10853j.remove(k) == null || this.f10860q.decrementAndGet() != 0) {
                return;
            }
            unsubscribe();
        }

        /* JADX INFO: renamed from: i */
        public boolean m9831i(boolean z, boolean z2, z3g0<? super ynk<K, V>> z3g0Var, Queue<?> queue) {
            if (!z) {
                return false;
            }
            Throwable th = this.f10861r;
            if (th != null) {
                m9834l(z3g0Var, queue, th);
                return true;
            }
            if (!z2) {
                return false;
            }
            this.f10848e.onCompleted();
            return true;
        }

        /* JADX INFO: renamed from: j */
        public final Map<Object, C1122d<K, V>> m9832j(w9j<e30<K>, Map<K, Object>> w9jVar, e30<K> e30Var) {
            return w9jVar.call(e30Var);
        }

        /* JADX INFO: renamed from: k */
        public void m9833k() {
            if (this.f10863t.getAndIncrement() != 0) {
                return;
            }
            Queue<ynk<K, V>> queue = this.f10854k;
            z3g0<? super ynk<K, V>> z3g0Var = this.f10848e;
            int iAddAndGet = 1;
            while (!m9831i(this.f10862s, queue.isEmpty(), z3g0Var, queue)) {
                long j = this.f10859p.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.f10862s;
                    ynk<K, V> ynkVarPoll = queue.poll();
                    boolean z2 = ynkVarPoll == null;
                    if (m9831i(z, z2, z3g0Var, queue)) {
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
                        kc2.m5647i(this.f10859p, j2);
                    }
                    this.f10857n.request(j2);
                }
                iAddAndGet = this.f10863t.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: l */
        public void m9834l(z3g0<? super ynk<K, V>> z3g0Var, Queue<?> queue, Throwable th) {
            queue.clear();
            ArrayList arrayList = new ArrayList(this.f10853j.values());
            this.f10853j.clear();
            Queue<K> queue2 = this.f10856m;
            if (queue2 != null) {
                queue2.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C1122d) it.next()).onError(th);
            }
            z3g0Var.onError(th);
        }

        /* JADX INFO: renamed from: m */
        public void m9835m(long j) {
            if (j < 0) {
                y3g0.m8887a("n >= 0 required but it was ", j);
            } else {
                kc2.m5640b(this.f10859p, j);
                m9833k();
            }
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f10862s) {
                return;
            }
            Iterator<C1122d<K, V>> it = this.f10853j.values().iterator();
            while (it.hasNext()) {
                it.next().m9837b();
            }
            this.f10853j.clear();
            Queue<K> queue = this.f10856m;
            if (queue != null) {
                queue.clear();
            }
            this.f10862s = true;
            this.f10860q.decrementAndGet();
            m9833k();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            if (this.f10862s) {
                ejd0.m3864j(th);
                return;
            }
            this.f10861r = th;
            this.f10862s = true;
            this.f10860q.decrementAndGet();
            m9833k();
        }

        @Override // p003l.m250
        public void onNext(T t) {
            boolean z;
            if (this.f10862s) {
                return;
            }
            Queue<?> queue = this.f10854k;
            z3g0<? super ynk<K, V>> z3g0Var = this.f10848e;
            try {
                K kCall = this.f10849f.call(t);
                Object obj = kCall != null ? kCall : f10847u;
                C1122d<K, V> c1122dM9836a = this.f10853j.get(obj);
                if (c1122dM9836a != null) {
                    z = true;
                } else {
                    if (this.f10858o.get()) {
                        return;
                    }
                    c1122dM9836a = C1122d.m9836a(kCall, this.f10851h, this, this.f10852i);
                    this.f10853j.put(obj, c1122dM9836a);
                    this.f10860q.getAndIncrement();
                    queue.offer(c1122dM9836a);
                    m9833k();
                    z = false;
                }
                try {
                    c1122dM9836a.onNext(this.f10850g.call(t));
                    if (this.f10856m != null) {
                        while (true) {
                            K kPoll = this.f10856m.poll();
                            if (kPoll == null) {
                                break;
                            }
                            C1122d<K, V> c1122d = this.f10853j.get(kPoll);
                            if (c1122d != null) {
                                c1122d.m9837b();
                            }
                        }
                    }
                    if (z) {
                        this.f10857n.request(1L);
                    }
                } catch (Throwable th) {
                    unsubscribe();
                    m9834l(z3g0Var, queue, th);
                }
            } catch (Throwable th2) {
                unsubscribe();
                m9834l(z3g0Var, queue, th2);
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorGroupBy$d */
    public static final class C1122d<K, T> extends ynk<K, T> {

        /* JADX INFO: renamed from: b */
        public final State<T, K> f10865b;

        public C1122d(K k, State<T, K> state) {
            super(k, state);
            this.f10865b = state;
        }

        /* JADX INFO: renamed from: a */
        public static <T, K> C1122d<K, T> m9836a(K k, int i, C1121c<?, K, T> c1121c, boolean z) {
            return new C1122d<>(k, new State(i, c1121c, k, z));
        }

        /* JADX INFO: renamed from: b */
        public void m9837b() {
            this.f10865b.onComplete();
        }

        public void onError(Throwable th) {
            this.f10865b.onError(th);
        }

        public void onNext(T t) {
            this.f10865b.onNext(t);
        }
    }

    public OperatorGroupBy(w9j<? super T, ? extends K> w9jVar) {
        this(w9jVar, UtilityFunctions.m9944b(), rjd0.f6938g, false, null);
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super ynk<K, V>> z3g0Var) {
        z3g0<? super ynk<K, V>> z3g0Var2;
        try {
            z3g0Var2 = z3g0Var;
            try {
                C1121c c1121c = new C1121c(z3g0Var2, this.f10839a, this.f10840b, this.f10841c, this.f10842d, this.f10843e);
                z3g0Var2.m9240b(h4g0.m4914a(new C1119a(c1121c)));
                z3g0Var2.mo3257f(c1121c.f10855l);
                return c1121c;
            } catch (Throwable th) {
                th = th;
                f5f.m3965f(th, z3g0Var2);
                z3g0<? super T> z3g0VarM2741a = a4g0.m2741a();
                z3g0VarM2741a.unsubscribe();
                return z3g0VarM2741a;
            }
        } catch (Throwable th2) {
            th = th2;
            z3g0Var2 = z3g0Var;
        }
    }

    public OperatorGroupBy(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2) {
        this(w9jVar, w9jVar2, rjd0.f6938g, false, null);
    }

    public OperatorGroupBy(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2, w9j<e30<K>, Map<K, Object>> w9jVar3) {
        this(w9jVar, w9jVar2, rjd0.f6938g, false, w9jVar3);
    }

    public OperatorGroupBy(w9j<? super T, ? extends K> w9jVar, w9j<? super T, ? extends V> w9jVar2, int i, boolean z, w9j<e30<K>, Map<K, Object>> w9jVar3) {
        this.f10839a = w9jVar;
        this.f10840b = w9jVar2;
        this.f10841c = i;
        this.f10842d = z;
        this.f10843e = w9jVar3;
    }
}
