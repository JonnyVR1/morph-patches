package p003l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p014rx.C1099c;
import p014rx.internal.operators.NotificationLite;
import p014rx.subjects.UnicastSubject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class dx50<T> implements C1099c.c<C1099c<T>, T> {

    /* JADX INFO: renamed from: f */
    public static final Object f3134f = new Object();

    /* JADX INFO: renamed from: g */
    public static final NotificationLite<Object> f3135g = NotificationLite.m9792f();

    /* JADX INFO: renamed from: a */
    public final long f3136a;

    /* JADX INFO: renamed from: b */
    public final long f3137b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f3138c;

    /* JADX INFO: renamed from: d */
    public final bud0 f3139d;

    /* JADX INFO: renamed from: e */
    public final int f3140e;

    /* JADX INFO: renamed from: l.dx50$a */
    public static final class C0250a<T> {

        /* JADX INFO: renamed from: a */
        public final m250<T> f3141a;

        /* JADX INFO: renamed from: b */
        public final C1099c<T> f3142b;

        /* JADX INFO: renamed from: c */
        public int f3143c;

        public C0250a(m250<T> m250Var, C1099c<T> c1099c) {
            this.f3141a = new tie0(m250Var);
            this.f3142b = c1099c;
        }
    }

    /* JADX INFO: renamed from: l.dx50$b */
    public final class C0251b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super C1099c<T>> f3144e;

        /* JADX INFO: renamed from: f */
        public final bud0.AbstractC0185a f3145f;

        /* JADX INFO: renamed from: h */
        public List<Object> f3147h;

        /* JADX INFO: renamed from: i */
        public boolean f3148i;

        /* JADX INFO: renamed from: g */
        public final Object f3146g = new Object();

        /* JADX INFO: renamed from: j */
        public volatile C0253d<T> f3149j = C0253d.m3758c();

        /* JADX INFO: renamed from: l.dx50$b$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ dx50 f3151a;

            public a(dx50 dx50Var) {
                this.f3151a = dx50Var;
            }

            @Override // p003l.d30
            public void call() {
                if (C0251b.this.f3149j.f3164a == null) {
                    C0251b.this.unsubscribe();
                }
            }
        }

        /* JADX INFO: renamed from: l.dx50$b$b */
        public class b implements d30 {
            public b() {
            }

            @Override // p003l.d30
            public void call() throws Throwable {
                C0251b.this.m3751k();
            }
        }

        public C0251b(z3g0<? super C1099c<T>> z3g0Var, bud0.AbstractC0185a abstractC0185a) {
            this.f3144e = new vie0(z3g0Var);
            this.f3145f = abstractC0185a;
            z3g0Var.m9240b(h4g0.m4914a(new a(dx50.this)));
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            m9242e(Long.MAX_VALUE);
        }

        /* JADX INFO: renamed from: g */
        public void m3747g() {
            m250<T> m250Var = this.f3149j.f3164a;
            this.f3149j = this.f3149j.m3759a();
            if (m250Var != null) {
                m250Var.onCompleted();
            }
            this.f3144e.onCompleted();
            unsubscribe();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: h */
        public boolean m3748h(List<Object> list) {
            if (list == null) {
                return true;
            }
            for (Object obj : list) {
                if (obj != dx50.f3134f) {
                    NotificationLite<Object> notificationLite = dx50.f3135g;
                    if (notificationLite.m9799h(obj)) {
                        m3750j(notificationLite.m9796d(obj));
                        break;
                    }
                    if (notificationLite.m9798g(obj)) {
                        m3747g();
                        break;
                    }
                    if (!m3749i(obj)) {
                        return false;
                    }
                } else if (!m3752l()) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: i */
        public boolean m3749i(T t) {
            C0253d<T> c0253dM3761d;
            C0253d<T> c0253d = this.f3149j;
            if (c0253d.f3164a == null) {
                if (!m3752l()) {
                    return false;
                }
                c0253d = this.f3149j;
            }
            c0253d.f3164a.onNext(t);
            if (c0253d.f3166c == dx50.this.f3140e - 1) {
                c0253d.f3164a.onCompleted();
                c0253dM3761d = c0253d.m3759a();
            } else {
                c0253dM3761d = c0253d.m3761d();
            }
            this.f3149j = c0253dM3761d;
            return true;
        }

        /* JADX INFO: renamed from: j */
        public void m3750j(Throwable th) {
            m250<T> m250Var = this.f3149j.f3164a;
            this.f3149j = this.f3149j.m3759a();
            if (m250Var != null) {
                m250Var.onError(th);
            }
            this.f3144e.onError(th);
            unsubscribe();
        }

        /* JADX INFO: renamed from: k */
        public void m3751k() throws Throwable {
            boolean z;
            List<Object> list;
            synchronized (this.f3146g) {
                try {
                    if (this.f3148i) {
                        if (this.f3147h == null) {
                            this.f3147h = new ArrayList();
                        }
                        this.f3147h.add(dx50.f3134f);
                        return;
                    }
                    boolean z2 = true;
                    this.f3148i = true;
                    try {
                        if (!m3752l()) {
                            synchronized (this.f3146g) {
                                this.f3148i = false;
                            }
                            return;
                        }
                        do {
                            try {
                                synchronized (this.f3146g) {
                                    try {
                                        list = this.f3147h;
                                        if (list == null) {
                                            this.f3148i = false;
                                            return;
                                        }
                                        this.f3147h = null;
                                    } catch (Throwable th) {
                                        th = th;
                                        z2 = false;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                z = z2;
                                th = th3;
                            }
                        } while (m3748h(list));
                        synchronized (this.f3146g) {
                            this.f3148i = false;
                        }
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        z = false;
                    }
                    if (z) {
                        throw th;
                    }
                    synchronized (this.f3146g) {
                        this.f3148i = false;
                    }
                    throw th;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }

        /* JADX INFO: renamed from: l */
        public boolean m3752l() {
            m250<T> m250Var = this.f3149j.f3164a;
            if (m250Var != null) {
                m250Var.onCompleted();
            }
            if (this.f3144e.isUnsubscribed()) {
                this.f3149j = this.f3149j.m3759a();
                unsubscribe();
                return false;
            }
            UnicastSubject unicastSubjectM9966b = UnicastSubject.m9966b();
            this.f3149j = this.f3149j.m3760b(unicastSubjectM9966b, unicastSubjectM9966b);
            this.f3144e.onNext(unicastSubjectM9966b);
            return true;
        }

        /* JADX INFO: renamed from: m */
        public void m3753m() {
            bud0.AbstractC0185a abstractC0185a = this.f3145f;
            b bVar = new b();
            dx50 dx50Var = dx50.this;
            abstractC0185a.m3172d(bVar, 0L, dx50Var.f3136a, dx50Var.f3138c);
        }

        @Override // p003l.m250
        public void onCompleted() {
            synchronized (this.f3146g) {
                try {
                    boolean z = this.f3148i;
                    List<Object> list = this.f3147h;
                    if (z) {
                        if (list == null) {
                            this.f3147h = new ArrayList();
                        }
                        this.f3147h.add(dx50.f3135g.m9794b());
                        return;
                    }
                    this.f3147h = null;
                    this.f3148i = true;
                    try {
                        m3748h(list);
                        m3747g();
                    } catch (Throwable th) {
                        m3750j(th);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            synchronized (this.f3146g) {
                try {
                    if (this.f3148i) {
                        this.f3147h = Collections.singletonList(dx50.f3135g.m9795c(th));
                        return;
                    }
                    this.f3147h = null;
                    this.f3148i = true;
                    m3750j(th);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p003l.m250
        public void onNext(T t) throws Throwable {
            List<Object> list;
            synchronized (this.f3146g) {
                try {
                    if (this.f3148i) {
                        if (this.f3147h == null) {
                            this.f3147h = new ArrayList();
                        }
                        this.f3147h.add(t);
                        return;
                    }
                    boolean z = true;
                    this.f3148i = true;
                    try {
                        if (!m3749i(t)) {
                            synchronized (this.f3146g) {
                                this.f3148i = false;
                            }
                            return;
                        }
                        do {
                            try {
                                synchronized (this.f3146g) {
                                    try {
                                        list = this.f3147h;
                                        if (list == null) {
                                            this.f3148i = false;
                                            return;
                                        }
                                        this.f3147h = null;
                                    } catch (Throwable th) {
                                        th = th;
                                        z = false;
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } while (m3748h(list));
                        synchronized (this.f3146g) {
                            this.f3148i = false;
                        }
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        z = false;
                    }
                    if (!z) {
                        synchronized (this.f3146g) {
                            this.f3148i = false;
                        }
                    }
                    throw th;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.dx50$c */
    public final class C0252c extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super C1099c<T>> f3154e;

        /* JADX INFO: renamed from: f */
        public final bud0.AbstractC0185a f3155f;

        /* JADX INFO: renamed from: g */
        public final Object f3156g;

        /* JADX INFO: renamed from: h */
        public final List<C0250a<T>> f3157h;

        /* JADX INFO: renamed from: i */
        public boolean f3158i;

        /* JADX INFO: renamed from: l.dx50$c$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p003l.d30
            public void call() {
                C0252c.this.m3756i();
            }
        }

        /* JADX INFO: renamed from: l.dx50$c$b */
        public class b implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C0250a f3161a;

            public b(C0250a c0250a) {
                this.f3161a = c0250a;
            }

            @Override // p003l.d30
            public void call() {
                C0252c.this.m3757j(this.f3161a);
            }
        }

        public C0252c(z3g0<? super C1099c<T>> z3g0Var, bud0.AbstractC0185a abstractC0185a) {
            super(z3g0Var);
            this.f3154e = z3g0Var;
            this.f3155f = abstractC0185a;
            this.f3156g = new Object();
            this.f3157h = new LinkedList();
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            m9242e(Long.MAX_VALUE);
        }

        /* JADX INFO: renamed from: g */
        public C0250a<T> m3754g() {
            UnicastSubject unicastSubjectM9966b = UnicastSubject.m9966b();
            return new C0250a<>(unicastSubjectM9966b, unicastSubjectM9966b);
        }

        /* JADX INFO: renamed from: h */
        public void m3755h() {
            bud0.AbstractC0185a abstractC0185a = this.f3155f;
            a aVar = new a();
            dx50 dx50Var = dx50.this;
            long j = dx50Var.f3137b;
            abstractC0185a.m3172d(aVar, j, j, dx50Var.f3138c);
        }

        /* JADX INFO: renamed from: i */
        public void m3756i() {
            C0250a<T> c0250aM3754g = m3754g();
            synchronized (this.f3156g) {
                try {
                    if (this.f3158i) {
                        return;
                    }
                    this.f3157h.add(c0250aM3754g);
                    try {
                        this.f3154e.onNext(c0250aM3754g.f3142b);
                        bud0.AbstractC0185a abstractC0185a = this.f3155f;
                        b bVar = new b(c0250aM3754g);
                        dx50 dx50Var = dx50.this;
                        abstractC0185a.mo2915c(bVar, dx50Var.f3136a, dx50Var.f3138c);
                    } catch (Throwable th) {
                        onError(th);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public void m3757j(C0250a<T> c0250a) {
            boolean z;
            synchronized (this.f3156g) {
                try {
                    if (this.f3158i) {
                        return;
                    }
                    Iterator<C0250a<T>> it = this.f3157h.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        } else if (it.next() == c0250a) {
                            it.remove();
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        c0250a.f3141a.onCompleted();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p003l.m250
        public void onCompleted() {
            synchronized (this.f3156g) {
                try {
                    if (this.f3158i) {
                        return;
                    }
                    this.f3158i = true;
                    ArrayList arrayList = new ArrayList(this.f3157h);
                    this.f3157h.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C0250a) it.next()).f3141a.onCompleted();
                    }
                    this.f3154e.onCompleted();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            synchronized (this.f3156g) {
                try {
                    if (this.f3158i) {
                        return;
                    }
                    this.f3158i = true;
                    ArrayList arrayList = new ArrayList(this.f3157h);
                    this.f3157h.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C0250a) it.next()).f3141a.onError(th);
                    }
                    this.f3154e.onError(th);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p003l.m250
        public void onNext(T t) {
            synchronized (this.f3156g) {
                try {
                    if (this.f3158i) {
                        return;
                    }
                    ArrayList<C0250a> arrayList = new ArrayList(this.f3157h);
                    Iterator<C0250a<T>> it = this.f3157h.iterator();
                    while (it.hasNext()) {
                        C0250a<T> next = it.next();
                        int i = next.f3143c + 1;
                        next.f3143c = i;
                        if (i == dx50.this.f3140e) {
                            it.remove();
                        }
                    }
                    for (C0250a c0250a : arrayList) {
                        c0250a.f3141a.onNext(t);
                        if (c0250a.f3143c == dx50.this.f3140e) {
                            c0250a.f3141a.onCompleted();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.dx50$d */
    public static final class C0253d<T> {

        /* JADX INFO: renamed from: d */
        public static final C0253d<Object> f3163d = new C0253d<>(null, null, 0);

        /* JADX INFO: renamed from: a */
        public final m250<T> f3164a;

        /* JADX INFO: renamed from: b */
        public final C1099c<T> f3165b;

        /* JADX INFO: renamed from: c */
        public final int f3166c;

        public C0253d(m250<T> m250Var, C1099c<T> c1099c, int i) {
            this.f3164a = m250Var;
            this.f3165b = c1099c;
            this.f3166c = i;
        }

        /* JADX INFO: renamed from: c */
        public static <T> C0253d<T> m3758c() {
            return (C0253d<T>) f3163d;
        }

        /* JADX INFO: renamed from: a */
        public C0253d<T> m3759a() {
            return m3758c();
        }

        /* JADX INFO: renamed from: b */
        public C0253d<T> m3760b(m250<T> m250Var, C1099c<T> c1099c) {
            return new C0253d<>(m250Var, c1099c, 0);
        }

        /* JADX INFO: renamed from: d */
        public C0253d<T> m3761d() {
            return new C0253d<>(this.f3164a, this.f3165b, this.f3166c + 1);
        }
    }

    public dx50(long j, long j2, TimeUnit timeUnit, int i, bud0 bud0Var) {
        this.f3136a = j;
        this.f3137b = j2;
        this.f3138c = timeUnit;
        this.f3140e = i;
        this.f3139d = bud0Var;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super C1099c<T>> z3g0Var) {
        bud0.AbstractC0185a abstractC0185aCreateWorker = this.f3139d.createWorker();
        if (this.f3136a == this.f3137b) {
            C0251b c0251b = new C0251b(z3g0Var, abstractC0185aCreateWorker);
            c0251b.m9240b(abstractC0185aCreateWorker);
            c0251b.m3753m();
            return c0251b;
        }
        C0252c c0252c = new C0252c(z3g0Var, abstractC0185aCreateWorker);
        c0252c.m9240b(abstractC0185aCreateWorker);
        c0252c.m3756i();
        c0252c.m3755h();
        return c0252c;
    }
}
