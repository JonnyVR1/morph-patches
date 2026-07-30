package p003l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import p014rx.C1099c;
import p014rx.exceptions.CompositeException;
import p014rx.internal.operators.NotificationLite;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class gw50<T> implements C1099c.c<T, C1099c<? extends T>> {

    /* JADX INFO: renamed from: a */
    public final boolean f4054a;

    /* JADX INFO: renamed from: l.gw50$a */
    public static final class C0325a {
        static final gw50<Object> INSTANCE = new gw50<>(false);
    }

    /* JADX INFO: renamed from: l.gw50$b */
    public static final class C0326b {
        static final gw50<Object> INSTANCE = new gw50<>(true);
    }

    /* JADX INFO: renamed from: l.gw50$c */
    public static final class C0327c<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final long f4055e;

        /* JADX INFO: renamed from: f */
        public final C0328d<T> f4056f;

        public C0327c(long j, C0328d<T> c0328d) {
            this.f4055e = j;
            this.f4056f = c0328d;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo3257f(rc90 rc90Var) {
            this.f4056f.m4873o(rc90Var, this.f4055e);
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f4056f.m4868j(this.f4055e);
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f4056f.m4871m(th, this.f4055e);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f4056f.m4870l(t, this);
        }
    }

    /* JADX INFO: renamed from: l.gw50$d */
    public static final class C0328d<T> extends z3g0<C1099c<? extends T>> {

        /* JADX INFO: renamed from: r */
        public static final Throwable f4057r = new Throwable("Terminal error");

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f4058e;

        /* JADX INFO: renamed from: g */
        public final boolean f4060g;

        /* JADX INFO: renamed from: k */
        public boolean f4064k;

        /* JADX INFO: renamed from: l */
        public boolean f4065l;

        /* JADX INFO: renamed from: m */
        public long f4066m;

        /* JADX INFO: renamed from: n */
        public rc90 f4067n;

        /* JADX INFO: renamed from: o */
        public volatile boolean f4068o;

        /* JADX INFO: renamed from: p */
        public Throwable f4069p;

        /* JADX INFO: renamed from: q */
        public boolean f4070q;

        /* JADX INFO: renamed from: f */
        public final rie0 f4059f = new rie0();

        /* JADX INFO: renamed from: h */
        public final AtomicLong f4061h = new AtomicLong();

        /* JADX INFO: renamed from: i */
        public final grf0<Object> f4062i = new grf0<>(rjd0.f6938g);

        /* JADX INFO: renamed from: j */
        public final NotificationLite<T> f4063j = NotificationLite.m9792f();

        /* JADX INFO: renamed from: l.gw50$d$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p003l.d30
            public void call() {
                C0328d.this.m4867i();
            }
        }

        /* JADX INFO: renamed from: l.gw50$d$b */
        public class b implements rc90 {
            public b() {
            }

            @Override // p003l.rc90
            public void request(long j) {
                if (j > 0) {
                    C0328d.this.m4866h(j);
                } else {
                    if (j >= 0) {
                        return;
                    }
                    y3g0.m8887a("n >= 0 expected but it was ", j);
                }
            }
        }

        public C0328d(z3g0<? super T> z3g0Var, boolean z) {
            this.f4058e = z3g0Var;
            this.f4060g = z;
        }

        /* JADX INFO: renamed from: g */
        public boolean m4865g(boolean z, boolean z2, Throwable th, grf0<Object> grf0Var, z3g0<? super T> z3g0Var, boolean z3) {
            if (this.f4060g) {
                if (!z || z2 || !z3) {
                    return false;
                }
                if (th != null) {
                    z3g0Var.onError(th);
                } else {
                    z3g0Var.onCompleted();
                }
                return true;
            }
            if (th != null) {
                grf0Var.clear();
                z3g0Var.onError(th);
                return true;
            }
            if (!z || z2 || !z3) {
                return false;
            }
            z3g0Var.onCompleted();
            return true;
        }

        /* JADX INFO: renamed from: h */
        public void m4866h(long j) {
            rc90 rc90Var;
            synchronized (this) {
                rc90Var = this.f4067n;
                this.f4066m = kc2.m5639a(this.f4066m, j);
            }
            if (rc90Var != null) {
                rc90Var.request(j);
            }
            m4869k();
        }

        /* JADX INFO: renamed from: i */
        public void m4867i() {
            synchronized (this) {
                this.f4067n = null;
            }
        }

        /* JADX INFO: renamed from: j */
        public void m4868j(long j) {
            synchronized (this) {
                try {
                    if (this.f4061h.get() != j) {
                        return;
                    }
                    this.f4070q = false;
                    this.f4067n = null;
                    m4869k();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: k */
        public void m4869k() {
            Throwable th;
            Throwable th2;
            synchronized (this) {
                try {
                    if (this.f4064k) {
                        this.f4065l = true;
                        return;
                    }
                    this.f4064k = true;
                    boolean z = this.f4070q;
                    long j = this.f4066m;
                    Throwable th3 = this.f4069p;
                    if (th3 != null && th3 != (th2 = f4057r) && !this.f4060g) {
                        this.f4069p = th2;
                    }
                    grf0<Object> grf0Var = this.f4062i;
                    AtomicLong atomicLong = this.f4061h;
                    z3g0<? super T> z3g0Var = this.f4058e;
                    long j2 = j;
                    boolean z2 = this.f4068o;
                    boolean z3 = z;
                    while (true) {
                        long j3 = 0;
                        while (j3 != j2) {
                            if (z3g0Var.isUnsubscribed()) {
                                return;
                            }
                            boolean zIsEmpty = grf0Var.isEmpty();
                            if (m4865g(z2, z3, th3, grf0Var, z3g0Var, zIsEmpty)) {
                                return;
                            }
                            if (zIsEmpty) {
                                break;
                            }
                            C0327c c0327c = (C0327c) grf0Var.poll();
                            T tM9797e = this.f4063j.m9797e(grf0Var.poll());
                            if (atomicLong.get() == c0327c.f4055e) {
                                z3g0Var.onNext(tM9797e);
                                j3++;
                            }
                        }
                        if (j3 == j2 && (z3g0Var.isUnsubscribed() || m4865g(this.f4068o, z3, th3, grf0Var, z3g0Var, grf0Var.isEmpty()))) {
                            return;
                        }
                        synchronized (this) {
                            try {
                                long j4 = this.f4066m;
                                if (j4 != Long.MAX_VALUE) {
                                    j4 -= j3;
                                    this.f4066m = j4;
                                }
                                j2 = j4;
                                if (!this.f4065l) {
                                    this.f4064k = false;
                                    return;
                                }
                                this.f4065l = false;
                                z2 = this.f4068o;
                                z3 = this.f4070q;
                                th3 = this.f4069p;
                                if (th3 != null && th3 != (th = f4057r) && !this.f4060g) {
                                    this.f4069p = th;
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
        public void m4870l(T t, C0327c<T> c0327c) {
            synchronized (this) {
                try {
                    if (this.f4061h.get() != c0327c.f4055e) {
                        return;
                    }
                    this.f4062i.m4694s(c0327c, this.f4063j.m9801j(t));
                    m4869k();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: m */
        public void m4871m(Throwable th, long j) {
            boolean zM4876r;
            synchronized (this) {
                try {
                    if (this.f4061h.get() == j) {
                        zM4876r = m4876r(th);
                        this.f4070q = false;
                        this.f4067n = null;
                    } else {
                        zM4876r = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (zM4876r) {
                m4869k();
            } else {
                m4875q(th);
            }
        }

        /* JADX INFO: renamed from: n */
        public void m4872n() {
            this.f4058e.m9240b(this.f4059f);
            this.f4058e.m9240b(h4g0.m4914a(new a()));
            this.f4058e.mo3257f(new b());
        }

        /* JADX INFO: renamed from: o */
        public void m4873o(rc90 rc90Var, long j) {
            synchronized (this) {
                try {
                    if (this.f4061h.get() != j) {
                        return;
                    }
                    long j2 = this.f4066m;
                    this.f4067n = rc90Var;
                    rc90Var.request(j2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f4068o = true;
            m4869k();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            boolean zM4876r;
            synchronized (this) {
                zM4876r = m4876r(th);
            }
            if (!zM4876r) {
                m4875q(th);
            } else {
                this.f4068o = true;
                m4869k();
            }
        }

        @Override // p003l.m250
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void onNext(C1099c<? extends T> c1099c) {
            C0327c c0327c;
            long jIncrementAndGet = this.f4061h.incrementAndGet();
            c4g0 c4g0VarM7259a = this.f4059f.m7259a();
            if (c4g0VarM7259a != null) {
                c4g0VarM7259a.unsubscribe();
            }
            synchronized (this) {
                c0327c = new C0327c(jIncrementAndGet, this);
                this.f4070q = true;
                this.f4067n = null;
            }
            this.f4059f.m7260b(c0327c);
            c1099c.unsafeSubscribe(c0327c);
        }

        /* JADX INFO: renamed from: q */
        public void m4875q(Throwable th) {
            ejd0.m3864j(th);
        }

        /* JADX INFO: renamed from: r */
        public boolean m4876r(Throwable th) {
            Throwable th2 = this.f4069p;
            if (th2 == f4057r) {
                return false;
            }
            if (th2 == null) {
                this.f4069p = th;
                return true;
            }
            if (!(th2 instanceof CompositeException)) {
                this.f4069p = new CompositeException(th2, th);
                return true;
            }
            ArrayList arrayList = new ArrayList(((CompositeException) th2).getExceptions());
            arrayList.add(th);
            this.f4069p = new CompositeException(arrayList);
            return true;
        }
    }

    public gw50(boolean z) {
        this.f4054a = z;
    }

    /* JADX INFO: renamed from: b */
    public static <T> gw50<T> m4862b(boolean z) {
        return z ? (gw50<T>) C0326b.INSTANCE : (gw50<T>) C0325a.INSTANCE;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super C1099c<? extends T>> call(z3g0<? super T> z3g0Var) {
        C0328d c0328d = new C0328d(z3g0Var, this.f4054a);
        z3g0Var.m9240b(c0328d);
        c0328d.m4872n();
        return c0328d;
    }
}
