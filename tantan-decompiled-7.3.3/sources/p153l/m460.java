package p153l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import p137rx.C22421c;
import p137rx.exceptions.CompositeException;
import p137rx.internal.operators.NotificationLite;

/* JADX INFO: loaded from: classes3.dex */
public final class m460<T> implements C22421c.c<T, C22421c<? extends T>> {

    /* JADX INFO: renamed from: a */
    public final boolean f134748a;

    /* JADX INFO: renamed from: l.m460$a */
    public static final class C18537a {
        static final m460<Object> INSTANCE = new m460<>(false);
    }

    /* JADX INFO: renamed from: l.m460$b */
    public static final class C18538b {
        static final m460<Object> INSTANCE = new m460<>(true);
    }

    /* JADX INFO: renamed from: l.m460$c */
    public static final class C18539c<T> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final long f134749e;

        /* JADX INFO: renamed from: f */
        public final C18540d<T> f134750f;

        public C18539c(long j, C18540d<T> c18540d) {
            this.f134749e = j;
            this.f134750f = c18540d;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: f */
        public void mo95773f(vk90 vk90Var) {
            this.f134750f.m156990o(vk90Var, this.f134749e);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f134750f.m156985j(this.f134749e);
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f134750f.m156988m(th, this.f134749e);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f134750f.m156987l(t, this);
        }
    }

    /* JADX INFO: renamed from: l.m460$d */
    public static final class C18540d<T> extends gcg0<C22421c<? extends T>> {

        /* JADX INFO: renamed from: r */
        public static final Throwable f134751r = new Throwable("Terminal error");

        /* JADX INFO: renamed from: e */
        public final gcg0<? super T> f134752e;

        /* JADX INFO: renamed from: g */
        public final boolean f134754g;

        /* JADX INFO: renamed from: k */
        public boolean f134758k;

        /* JADX INFO: renamed from: l */
        public boolean f134759l;

        /* JADX INFO: renamed from: m */
        public long f134760m;

        /* JADX INFO: renamed from: n */
        public vk90 f134761n;

        /* JADX INFO: renamed from: o */
        public volatile boolean f134762o;

        /* JADX INFO: renamed from: p */
        public Throwable f134763p;

        /* JADX INFO: renamed from: q */
        public boolean f134764q;

        /* JADX INFO: renamed from: f */
        public final wqe0 f134753f = new wqe0();

        /* JADX INFO: renamed from: h */
        public final AtomicLong f134755h = new AtomicLong();

        /* JADX INFO: renamed from: i */
        public final pzf0<Object> f134756i = new pzf0<>(urd0.f180601g);

        /* JADX INFO: renamed from: j */
        public final NotificationLite<T> f134757j = NotificationLite.m222581f();

        /* JADX INFO: renamed from: l.m460$d$a */
        public class a implements x20 {
            public a() {
            }

            @Override // p153l.x20
            public void call() {
                C18540d.this.m156984i();
            }
        }

        /* JADX INFO: renamed from: l.m460$d$b */
        public class b implements vk90 {
            public b() {
            }

            @Override // p153l.vk90
            public void request(long j) {
                if (j > 0) {
                    C18540d.this.m156983h(j);
                } else {
                    if (j >= 0) {
                        return;
                    }
                    fcg0.m125008a("n >= 0 expected but it was ", j);
                }
            }
        }

        public C18540d(gcg0<? super T> gcg0Var, boolean z) {
            this.f134752e = gcg0Var;
            this.f134754g = z;
        }

        /* JADX INFO: renamed from: g */
        public boolean m156982g(boolean z, boolean z2, Throwable th, pzf0<Object> pzf0Var, gcg0<? super T> gcg0Var, boolean z3) {
            if (this.f134754g) {
                if (!z || z2 || !z3) {
                    return false;
                }
                if (th != null) {
                    gcg0Var.onError(th);
                } else {
                    gcg0Var.onCompleted();
                }
                return true;
            }
            if (th != null) {
                pzf0Var.clear();
                gcg0Var.onError(th);
                return true;
            }
            if (!z || z2 || !z3) {
                return false;
            }
            gcg0Var.onCompleted();
            return true;
        }

        /* JADX INFO: renamed from: h */
        public void m156983h(long j) {
            vk90 vk90Var;
            synchronized (this) {
                vk90Var = this.f134761n;
                this.f134760m = rc2.m180769a(this.f134760m, j);
            }
            if (vk90Var != null) {
                vk90Var.request(j);
            }
            m156986k();
        }

        /* JADX INFO: renamed from: i */
        public void m156984i() {
            synchronized (this) {
                this.f134761n = null;
            }
        }

        /* JADX INFO: renamed from: j */
        public void m156985j(long j) {
            synchronized (this) {
                try {
                    if (this.f134755h.get() != j) {
                        return;
                    }
                    this.f134764q = false;
                    this.f134761n = null;
                    m156986k();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: k */
        public void m156986k() {
            Throwable th;
            Throwable th2;
            synchronized (this) {
                try {
                    if (this.f134758k) {
                        this.f134759l = true;
                        return;
                    }
                    this.f134758k = true;
                    boolean z = this.f134764q;
                    long j = this.f134760m;
                    Throwable th3 = this.f134763p;
                    if (th3 != null && th3 != (th2 = f134751r) && !this.f134754g) {
                        this.f134763p = th2;
                    }
                    pzf0<Object> pzf0Var = this.f134756i;
                    AtomicLong atomicLong = this.f134755h;
                    gcg0<? super T> gcg0Var = this.f134752e;
                    long j2 = j;
                    boolean z2 = this.f134762o;
                    boolean z3 = z;
                    while (true) {
                        long j3 = 0;
                        while (j3 != j2) {
                            if (gcg0Var.isUnsubscribed()) {
                                return;
                            }
                            boolean zIsEmpty = pzf0Var.isEmpty();
                            if (m156982g(z2, z3, th3, pzf0Var, gcg0Var, zIsEmpty)) {
                                return;
                            }
                            if (zIsEmpty) {
                                break;
                            }
                            C18539c c18539c = (C18539c) pzf0Var.poll();
                            T tM222586e = this.f134757j.m222586e(pzf0Var.poll());
                            if (atomicLong.get() == c18539c.f134749e) {
                                gcg0Var.onNext(tM222586e);
                                j3++;
                            }
                        }
                        if (j3 == j2 && (gcg0Var.isUnsubscribed() || m156982g(this.f134762o, z3, th3, pzf0Var, gcg0Var, pzf0Var.isEmpty()))) {
                            return;
                        }
                        synchronized (this) {
                            try {
                                long j4 = this.f134760m;
                                if (j4 != Long.MAX_VALUE) {
                                    j4 -= j3;
                                    this.f134760m = j4;
                                }
                                j2 = j4;
                                if (!this.f134759l) {
                                    this.f134758k = false;
                                    return;
                                }
                                this.f134759l = false;
                                z2 = this.f134762o;
                                z3 = this.f134764q;
                                th3 = this.f134763p;
                                if (th3 != null && th3 != (th = f134751r) && !this.f134754g) {
                                    this.f134763p = th;
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }

        /* JADX INFO: renamed from: l */
        public void m156987l(T t, C18539c<T> c18539c) {
            synchronized (this) {
                try {
                    if (this.f134755h.get() != c18539c.f134749e) {
                        return;
                    }
                    this.f134756i.m174428s(c18539c, this.f134757j.m222590j(t));
                    m156986k();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: m */
        public void m156988m(Throwable th, long j) {
            boolean zM156993r;
            synchronized (this) {
                try {
                    if (this.f134755h.get() == j) {
                        zM156993r = m156993r(th);
                        this.f134764q = false;
                        this.f134761n = null;
                    } else {
                        zM156993r = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (zM156993r) {
                m156986k();
            } else {
                m156992q(th);
            }
        }

        /* JADX INFO: renamed from: n */
        public void m156989n() {
            this.f134752e.m129866b(this.f134753f);
            this.f134752e.m129866b(pcg0.m171648a(new a()));
            this.f134752e.mo95773f(new b());
        }

        /* JADX INFO: renamed from: o */
        public void m156990o(vk90 vk90Var, long j) {
            synchronized (this) {
                try {
                    if (this.f134755h.get() != j) {
                        return;
                    }
                    long j2 = this.f134760m;
                    this.f134761n = vk90Var;
                    vk90Var.request(j2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f134762o = true;
            m156986k();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            boolean zM156993r;
            synchronized (this) {
                zM156993r = m156993r(th);
            }
            if (!zM156993r) {
                m156992q(th);
            } else {
                this.f134762o = true;
                m156986k();
            }
        }

        @Override // p153l.bb50
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void onNext(C22421c<? extends T> c22421c) {
            C18539c c18539c;
            long jIncrementAndGet = this.f134755h.incrementAndGet();
            kcg0 kcg0VarM207510a = this.f134753f.m207510a();
            if (kcg0VarM207510a != null) {
                kcg0VarM207510a.unsubscribe();
            }
            synchronized (this) {
                c18539c = new C18539c(jIncrementAndGet, this);
                this.f134764q = true;
                this.f134761n = null;
            }
            this.f134753f.m207511b(c18539c);
            c22421c.unsafeSubscribe(c18539c);
        }

        /* JADX INFO: renamed from: q */
        public void m156992q(Throwable th) {
            hrd0.m136792j(th);
        }

        /* JADX INFO: renamed from: r */
        public boolean m156993r(Throwable th) {
            Throwable th2 = this.f134763p;
            if (th2 == f134751r) {
                return false;
            }
            if (th2 == null) {
                this.f134763p = th;
                return true;
            }
            if (!(th2 instanceof CompositeException)) {
                this.f134763p = new CompositeException(th2, th);
                return true;
            }
            ArrayList arrayList = new ArrayList(((CompositeException) th2).getExceptions());
            arrayList.add(th);
            this.f134763p = new CompositeException(arrayList);
            return true;
        }
    }

    public m460(boolean z) {
        this.f134748a = z;
    }

    /* JADX INFO: renamed from: b */
    public static <T> m460<T> m156979b(boolean z) {
        return z ? (m460<T>) C18538b.INSTANCE : (m460<T>) C18537a.INSTANCE;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super C22421c<? extends T>> call(gcg0<? super T> gcg0Var) {
        C18540d c18540d = new C18540d(gcg0Var, this.f134748a);
        gcg0Var.m129866b(c18540d);
        c18540d.m156989n();
        return c18540d;
    }
}
