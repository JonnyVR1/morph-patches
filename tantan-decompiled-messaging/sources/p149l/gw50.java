package p149l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import p133rx.C22306c;
import p133rx.exceptions.CompositeException;
import p133rx.internal.operators.NotificationLite;

/* JADX INFO: loaded from: classes3.dex */
public final class gw50<T> implements C22306c.c<T, C22306c<? extends T>> {

    /* JADX INFO: renamed from: a */
    public final boolean f104661a;

    /* JADX INFO: renamed from: l.gw50$a */
    public static final class C17176a {
        static final gw50<Object> INSTANCE = new gw50<>(false);
    }

    /* JADX INFO: renamed from: l.gw50$b */
    public static final class C17177b {
        static final gw50<Object> INSTANCE = new gw50<>(true);
    }

    /* JADX INFO: renamed from: l.gw50$c */
    public static final class C17178c<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final long f104662e;

        /* JADX INFO: renamed from: f */
        public final C17179d<T> f104663f;

        public C17178c(long j, C17179d<T> c17179d) {
            this.f104662e = j;
            this.f104663f = c17179d;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo106696f(rc90 rc90Var) {
            this.f104663f.m128386o(rc90Var, this.f104662e);
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f104663f.m128381j(this.f104662e);
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f104663f.m128384m(th, this.f104662e);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f104663f.m128383l(t, this);
        }
    }

    /* JADX INFO: renamed from: l.gw50$d */
    public static final class C17179d<T> extends z3g0<C22306c<? extends T>> {

        /* JADX INFO: renamed from: r */
        public static final Throwable f104664r = new Throwable("Terminal error");

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f104665e;

        /* JADX INFO: renamed from: g */
        public final boolean f104667g;

        /* JADX INFO: renamed from: k */
        public boolean f104671k;

        /* JADX INFO: renamed from: l */
        public boolean f104672l;

        /* JADX INFO: renamed from: m */
        public long f104673m;

        /* JADX INFO: renamed from: n */
        public rc90 f104674n;

        /* JADX INFO: renamed from: o */
        public volatile boolean f104675o;

        /* JADX INFO: renamed from: p */
        public Throwable f104676p;

        /* JADX INFO: renamed from: q */
        public boolean f104677q;

        /* JADX INFO: renamed from: f */
        public final rie0 f104666f = new rie0();

        /* JADX INFO: renamed from: h */
        public final AtomicLong f104668h = new AtomicLong();

        /* JADX INFO: renamed from: i */
        public final grf0<Object> f104669i = new grf0<>(rjd0.f159670g);

        /* JADX INFO: renamed from: j */
        public final NotificationLite<T> f104670j = NotificationLite.m221335f();

        /* JADX INFO: renamed from: l.gw50$d$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p149l.d30
            public void call() {
                C17179d.this.m128380i();
            }
        }

        /* JADX INFO: renamed from: l.gw50$d$b */
        public class b implements rc90 {
            public b() {
            }

            @Override // p149l.rc90
            public void request(long j) {
                if (j > 0) {
                    C17179d.this.m128379h(j);
                } else {
                    if (j >= 0) {
                        return;
                    }
                    y3g0.m212802a("n >= 0 expected but it was ", j);
                }
            }
        }

        public C17179d(z3g0<? super T> z3g0Var, boolean z) {
            this.f104665e = z3g0Var;
            this.f104667g = z;
        }

        /* JADX INFO: renamed from: g */
        public boolean m128378g(boolean z, boolean z2, Throwable th, grf0<Object> grf0Var, z3g0<? super T> z3g0Var, boolean z3) {
            if (this.f104667g) {
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
        public void m128379h(long j) {
            rc90 rc90Var;
            synchronized (this) {
                rc90Var = this.f104674n;
                this.f104673m = kc2.m145335a(this.f104673m, j);
            }
            if (rc90Var != null) {
                rc90Var.request(j);
            }
            m128382k();
        }

        /* JADX INFO: renamed from: i */
        public void m128380i() {
            synchronized (this) {
                this.f104674n = null;
            }
        }

        /* JADX INFO: renamed from: j */
        public void m128381j(long j) {
            synchronized (this) {
                try {
                    if (this.f104668h.get() != j) {
                        return;
                    }
                    this.f104677q = false;
                    this.f104674n = null;
                    m128382k();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: k */
        public void m128382k() {
            Throwable th;
            Throwable th2;
            synchronized (this) {
                try {
                    if (this.f104671k) {
                        this.f104672l = true;
                        return;
                    }
                    this.f104671k = true;
                    boolean z = this.f104677q;
                    long j = this.f104673m;
                    Throwable th3 = this.f104676p;
                    if (th3 != null && th3 != (th2 = f104664r) && !this.f104667g) {
                        this.f104676p = th2;
                    }
                    grf0<Object> grf0Var = this.f104669i;
                    AtomicLong atomicLong = this.f104668h;
                    z3g0<? super T> z3g0Var = this.f104665e;
                    long j2 = j;
                    boolean z2 = this.f104675o;
                    boolean z3 = z;
                    while (true) {
                        long j3 = 0;
                        while (j3 != j2) {
                            if (z3g0Var.isUnsubscribed()) {
                                return;
                            }
                            boolean zIsEmpty = grf0Var.isEmpty();
                            if (m128378g(z2, z3, th3, grf0Var, z3g0Var, zIsEmpty)) {
                                return;
                            }
                            if (zIsEmpty) {
                                break;
                            }
                            C17178c c17178c = (C17178c) grf0Var.poll();
                            T tM221340e = this.f104670j.m221340e(grf0Var.poll());
                            if (atomicLong.get() == c17178c.f104662e) {
                                z3g0Var.onNext(tM221340e);
                                j3++;
                            }
                        }
                        if (j3 == j2 && (z3g0Var.isUnsubscribed() || m128378g(this.f104675o, z3, th3, grf0Var, z3g0Var, grf0Var.isEmpty()))) {
                            return;
                        }
                        synchronized (this) {
                            try {
                                long j4 = this.f104673m;
                                if (j4 != Long.MAX_VALUE) {
                                    j4 -= j3;
                                    this.f104673m = j4;
                                }
                                j2 = j4;
                                if (!this.f104672l) {
                                    this.f104671k = false;
                                    return;
                                }
                                this.f104672l = false;
                                z2 = this.f104675o;
                                z3 = this.f104677q;
                                th3 = this.f104676p;
                                if (th3 != null && th3 != (th = f104664r) && !this.f104667g) {
                                    this.f104676p = th;
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
        public void m128383l(T t, C17178c<T> c17178c) {
            synchronized (this) {
                try {
                    if (this.f104668h.get() != c17178c.f104662e) {
                        return;
                    }
                    this.f104669i.m127706s(c17178c, this.f104670j.m221344j(t));
                    m128382k();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: m */
        public void m128384m(Throwable th, long j) {
            boolean zM128389r;
            synchronized (this) {
                try {
                    if (this.f104668h.get() == j) {
                        zM128389r = m128389r(th);
                        this.f104677q = false;
                        this.f104674n = null;
                    } else {
                        zM128389r = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (zM128389r) {
                m128382k();
            } else {
                m128388q(th);
            }
        }

        /* JADX INFO: renamed from: n */
        public void m128385n() {
            this.f104665e.m217046b(this.f104666f);
            this.f104665e.m217046b(h4g0.m129240a(new a()));
            this.f104665e.mo106696f(new b());
        }

        /* JADX INFO: renamed from: o */
        public void m128386o(rc90 rc90Var, long j) {
            synchronized (this) {
                try {
                    if (this.f104668h.get() != j) {
                        return;
                    }
                    long j2 = this.f104673m;
                    this.f104674n = rc90Var;
                    rc90Var.request(j2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f104675o = true;
            m128382k();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            boolean zM128389r;
            synchronized (this) {
                zM128389r = m128389r(th);
            }
            if (!zM128389r) {
                m128388q(th);
            } else {
                this.f104675o = true;
                m128382k();
            }
        }

        @Override // p149l.m250
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void onNext(C22306c<? extends T> c22306c) {
            C17178c c17178c;
            long jIncrementAndGet = this.f104668h.incrementAndGet();
            c4g0 c4g0VarM179503a = this.f104666f.m179503a();
            if (c4g0VarM179503a != null) {
                c4g0VarM179503a.unsubscribe();
            }
            synchronized (this) {
                c17178c = new C17178c(jIncrementAndGet, this);
                this.f104677q = true;
                this.f104674n = null;
            }
            this.f104666f.m179504b(c17178c);
            c22306c.unsafeSubscribe(c17178c);
        }

        /* JADX INFO: renamed from: q */
        public void m128388q(Throwable th) {
            ejd0.m116793j(th);
        }

        /* JADX INFO: renamed from: r */
        public boolean m128389r(Throwable th) {
            Throwable th2 = this.f104676p;
            if (th2 == f104664r) {
                return false;
            }
            if (th2 == null) {
                this.f104676p = th;
                return true;
            }
            if (!(th2 instanceof CompositeException)) {
                this.f104676p = new CompositeException(th2, th);
                return true;
            }
            ArrayList arrayList = new ArrayList(((CompositeException) th2).getExceptions());
            arrayList.add(th);
            this.f104676p = new CompositeException(arrayList);
            return true;
        }
    }

    public gw50(boolean z) {
        this.f104661a = z;
    }

    /* JADX INFO: renamed from: b */
    public static <T> gw50<T> m128375b(boolean z) {
        return z ? (gw50<T>) C17177b.INSTANCE : (gw50<T>) C17176a.INSTANCE;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super C22306c<? extends T>> call(z3g0<? super T> z3g0Var) {
        C17179d c17179d = new C17179d(z3g0Var, this.f104661a);
        z3g0Var.m217046b(c17179d);
        c17179d.m128385n();
        return c17179d;
    }
}
