package p153l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.internal.operators.NotificationLite;
import p137rx.subjects.UnicastSubject;

/* JADX INFO: loaded from: classes3.dex */
public final class j560<T> implements C22421c.c<C22421c<T>, T> {

    /* JADX INFO: renamed from: f */
    public static final Object f118370f = new Object();

    /* JADX INFO: renamed from: g */
    public static final NotificationLite<Object> f118371g = NotificationLite.m222581f();

    /* JADX INFO: renamed from: a */
    public final long f118372a;

    /* JADX INFO: renamed from: b */
    public final long f118373b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f118374c;

    /* JADX INFO: renamed from: d */
    public final f2e0 f118375d;

    /* JADX INFO: renamed from: e */
    public final int f118376e;

    /* JADX INFO: renamed from: l.j560$a */
    public static final class C17876a<T> {

        /* JADX INFO: renamed from: a */
        public final bb50<T> f118377a;

        /* JADX INFO: renamed from: b */
        public final C22421c<T> f118378b;

        /* JADX INFO: renamed from: c */
        public int f118379c;

        public C17876a(bb50<T> bb50Var, C22421c<T> c22421c) {
            this.f118377a = new yqe0(bb50Var);
            this.f118378b = c22421c;
        }
    }

    /* JADX INFO: renamed from: l.j560$b */
    public final class C17877b extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super C22421c<T>> f118380e;

        /* JADX INFO: renamed from: f */
        public final f2e0.AbstractC16877a f118381f;

        /* JADX INFO: renamed from: h */
        public List<Object> f118383h;

        /* JADX INFO: renamed from: i */
        public boolean f118384i;

        /* JADX INFO: renamed from: g */
        public final Object f118382g = new Object();

        /* JADX INFO: renamed from: j */
        public volatile C17879d<T> f118385j = C17879d.m143511c();

        /* JADX INFO: renamed from: l.j560$b$a */
        public class a implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ j560 f118387a;

            public a(j560 j560Var) {
                this.f118387a = j560Var;
            }

            @Override // p153l.x20
            public void call() {
                if (C17877b.this.f118385j.f118400a == null) {
                    C17877b.this.unsubscribe();
                }
            }
        }

        /* JADX INFO: renamed from: l.j560$b$b */
        public class b implements x20 {
            public b() {
            }

            @Override // p153l.x20
            public void call() throws Throwable {
                C17877b.this.m143504k();
            }
        }

        public C17877b(gcg0<? super C22421c<T>> gcg0Var, f2e0.AbstractC16877a abstractC16877a) {
            this.f118380e = new are0(gcg0Var);
            this.f118381f = abstractC16877a;
            gcg0Var.m129866b(pcg0.m171648a(new a(j560.this)));
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            m129868e(Long.MAX_VALUE);
        }

        /* JADX INFO: renamed from: g */
        public void m143500g() {
            bb50<T> bb50Var = this.f118385j.f118400a;
            this.f118385j = this.f118385j.m143512a();
            if (bb50Var != null) {
                bb50Var.onCompleted();
            }
            this.f118380e.onCompleted();
            unsubscribe();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: h */
        public boolean m143501h(List<Object> list) {
            if (list == null) {
                return true;
            }
            for (Object obj : list) {
                if (obj != j560.f118370f) {
                    NotificationLite<Object> notificationLite = j560.f118371g;
                    if (notificationLite.m222588h(obj)) {
                        m143503j(notificationLite.m222585d(obj));
                        break;
                    }
                    if (notificationLite.m222587g(obj)) {
                        m143500g();
                        break;
                    }
                    if (!m143502i(obj)) {
                        return false;
                    }
                } else if (!m143505l()) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: i */
        public boolean m143502i(T t) {
            C17879d<T> c17879dM143514d;
            C17879d<T> c17879d = this.f118385j;
            if (c17879d.f118400a == null) {
                if (!m143505l()) {
                    return false;
                }
                c17879d = this.f118385j;
            }
            c17879d.f118400a.onNext(t);
            if (c17879d.f118402c == j560.this.f118376e - 1) {
                c17879d.f118400a.onCompleted();
                c17879dM143514d = c17879d.m143512a();
            } else {
                c17879dM143514d = c17879d.m143514d();
            }
            this.f118385j = c17879dM143514d;
            return true;
        }

        /* JADX INFO: renamed from: j */
        public void m143503j(Throwable th) {
            bb50<T> bb50Var = this.f118385j.f118400a;
            this.f118385j = this.f118385j.m143512a();
            if (bb50Var != null) {
                bb50Var.onError(th);
            }
            this.f118380e.onError(th);
            unsubscribe();
        }

        /* JADX INFO: renamed from: k */
        public void m143504k() throws Throwable {
            boolean z;
            List<Object> list;
            synchronized (this.f118382g) {
                try {
                    if (this.f118384i) {
                        if (this.f118383h == null) {
                            this.f118383h = new ArrayList();
                        }
                        this.f118383h.add(j560.f118370f);
                        return;
                    }
                    boolean z2 = true;
                    this.f118384i = true;
                    try {
                        if (!m143505l()) {
                            synchronized (this.f118382g) {
                                this.f118384i = false;
                            }
                            return;
                        }
                        do {
                            try {
                                synchronized (this.f118382g) {
                                    try {
                                        list = this.f118383h;
                                        if (list == null) {
                                            this.f118384i = false;
                                            return;
                                        }
                                        this.f118383h = null;
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
                        } while (m143501h(list));
                        synchronized (this.f118382g) {
                            this.f118384i = false;
                        }
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        z = false;
                    }
                    if (z) {
                        throw th;
                    }
                    synchronized (this.f118382g) {
                        this.f118384i = false;
                    }
                    throw th;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }

        /* JADX INFO: renamed from: l */
        public boolean m143505l() {
            bb50<T> bb50Var = this.f118385j.f118400a;
            if (bb50Var != null) {
                bb50Var.onCompleted();
            }
            if (this.f118380e.isUnsubscribed()) {
                this.f118385j = this.f118385j.m143512a();
                unsubscribe();
                return false;
            }
            UnicastSubject unicastSubjectM222755b = UnicastSubject.m222755b();
            this.f118385j = this.f118385j.m143513b(unicastSubjectM222755b, unicastSubjectM222755b);
            this.f118380e.onNext(unicastSubjectM222755b);
            return true;
        }

        /* JADX INFO: renamed from: m */
        public void m143506m() {
            f2e0.AbstractC16877a abstractC16877a = this.f118381f;
            b bVar = new b();
            j560 j560Var = j560.this;
            abstractC16877a.m123611d(bVar, 0L, j560Var.f118372a, j560Var.f118374c);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            synchronized (this.f118382g) {
                try {
                    boolean z = this.f118384i;
                    List<Object> list = this.f118383h;
                    if (z) {
                        if (list == null) {
                            this.f118383h = new ArrayList();
                        }
                        this.f118383h.add(j560.f118371g.m222583b());
                        return;
                    }
                    this.f118383h = null;
                    this.f118384i = true;
                    try {
                        m143501h(list);
                        m143500g();
                    } catch (Throwable th) {
                        m143503j(th);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            synchronized (this.f118382g) {
                try {
                    if (this.f118384i) {
                        this.f118383h = Collections.singletonList(j560.f118371g.m222584c(th));
                        return;
                    }
                    this.f118383h = null;
                    this.f118384i = true;
                    m143503j(th);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) throws Throwable {
            List<Object> list;
            synchronized (this.f118382g) {
                try {
                    if (this.f118384i) {
                        if (this.f118383h == null) {
                            this.f118383h = new ArrayList();
                        }
                        this.f118383h.add(t);
                        return;
                    }
                    boolean z = true;
                    this.f118384i = true;
                    try {
                        if (!m143502i(t)) {
                            synchronized (this.f118382g) {
                                this.f118384i = false;
                            }
                            return;
                        }
                        do {
                            try {
                                synchronized (this.f118382g) {
                                    try {
                                        list = this.f118383h;
                                        if (list == null) {
                                            this.f118384i = false;
                                            return;
                                        }
                                        this.f118383h = null;
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
                        } while (m143501h(list));
                        synchronized (this.f118382g) {
                            this.f118384i = false;
                        }
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        z = false;
                    }
                    if (!z) {
                        synchronized (this.f118382g) {
                            this.f118384i = false;
                        }
                    }
                    throw th;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.j560$c */
    public final class C17878c extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super C22421c<T>> f118390e;

        /* JADX INFO: renamed from: f */
        public final f2e0.AbstractC16877a f118391f;

        /* JADX INFO: renamed from: g */
        public final Object f118392g;

        /* JADX INFO: renamed from: h */
        public final List<C17876a<T>> f118393h;

        /* JADX INFO: renamed from: i */
        public boolean f118394i;

        /* JADX INFO: renamed from: l.j560$c$a */
        public class a implements x20 {
            public a() {
            }

            @Override // p153l.x20
            public void call() {
                C17878c.this.m143509i();
            }
        }

        /* JADX INFO: renamed from: l.j560$c$b */
        public class b implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C17876a f118397a;

            public b(C17876a c17876a) {
                this.f118397a = c17876a;
            }

            @Override // p153l.x20
            public void call() {
                C17878c.this.m143510j(this.f118397a);
            }
        }

        public C17878c(gcg0<? super C22421c<T>> gcg0Var, f2e0.AbstractC16877a abstractC16877a) {
            super(gcg0Var);
            this.f118390e = gcg0Var;
            this.f118391f = abstractC16877a;
            this.f118392g = new Object();
            this.f118393h = new LinkedList();
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            m129868e(Long.MAX_VALUE);
        }

        /* JADX INFO: renamed from: g */
        public C17876a<T> m143507g() {
            UnicastSubject unicastSubjectM222755b = UnicastSubject.m222755b();
            return new C17876a<>(unicastSubjectM222755b, unicastSubjectM222755b);
        }

        /* JADX INFO: renamed from: h */
        public void m143508h() {
            f2e0.AbstractC16877a abstractC16877a = this.f118391f;
            a aVar = new a();
            j560 j560Var = j560.this;
            long j = j560Var.f118373b;
            abstractC16877a.m123611d(aVar, j, j, j560Var.f118374c);
        }

        /* JADX INFO: renamed from: i */
        public void m143509i() {
            C17876a<T> c17876aM143507g = m143507g();
            synchronized (this.f118392g) {
                try {
                    if (this.f118394i) {
                        return;
                    }
                    this.f118393h.add(c17876aM143507g);
                    try {
                        this.f118390e.onNext(c17876aM143507g.f118378b);
                        f2e0.AbstractC16877a abstractC16877a = this.f118391f;
                        b bVar = new b(c17876aM143507g);
                        j560 j560Var = j560.this;
                        abstractC16877a.mo102837c(bVar, j560Var.f118372a, j560Var.f118374c);
                    } catch (Throwable th) {
                        onError(th);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public void m143510j(C17876a<T> c17876a) {
            boolean z;
            synchronized (this.f118392g) {
                try {
                    if (this.f118394i) {
                        return;
                    }
                    Iterator<C17876a<T>> it = this.f118393h.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        } else if (it.next() == c17876a) {
                            it.remove();
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        c17876a.f118377a.onCompleted();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
            synchronized (this.f118392g) {
                try {
                    if (this.f118394i) {
                        return;
                    }
                    this.f118394i = true;
                    ArrayList arrayList = new ArrayList(this.f118393h);
                    this.f118393h.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C17876a) it.next()).f118377a.onCompleted();
                    }
                    this.f118390e.onCompleted();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            synchronized (this.f118392g) {
                try {
                    if (this.f118394i) {
                        return;
                    }
                    this.f118394i = true;
                    ArrayList arrayList = new ArrayList(this.f118393h);
                    this.f118393h.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C17876a) it.next()).f118377a.onError(th);
                    }
                    this.f118390e.onError(th);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            synchronized (this.f118392g) {
                try {
                    if (this.f118394i) {
                        return;
                    }
                    ArrayList<C17876a> arrayList = new ArrayList(this.f118393h);
                    Iterator<C17876a<T>> it = this.f118393h.iterator();
                    while (it.hasNext()) {
                        C17876a<T> next = it.next();
                        int i = next.f118379c + 1;
                        next.f118379c = i;
                        if (i == j560.this.f118376e) {
                            it.remove();
                        }
                    }
                    for (C17876a c17876a : arrayList) {
                        c17876a.f118377a.onNext(t);
                        if (c17876a.f118379c == j560.this.f118376e) {
                            c17876a.f118377a.onCompleted();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.j560$d */
    public static final class C17879d<T> {

        /* JADX INFO: renamed from: d */
        public static final C17879d<Object> f118399d = new C17879d<>(null, null, 0);

        /* JADX INFO: renamed from: a */
        public final bb50<T> f118400a;

        /* JADX INFO: renamed from: b */
        public final C22421c<T> f118401b;

        /* JADX INFO: renamed from: c */
        public final int f118402c;

        public C17879d(bb50<T> bb50Var, C22421c<T> c22421c, int i) {
            this.f118400a = bb50Var;
            this.f118401b = c22421c;
            this.f118402c = i;
        }

        /* JADX INFO: renamed from: c */
        public static <T> C17879d<T> m143511c() {
            return (C17879d<T>) f118399d;
        }

        /* JADX INFO: renamed from: a */
        public C17879d<T> m143512a() {
            return m143511c();
        }

        /* JADX INFO: renamed from: b */
        public C17879d<T> m143513b(bb50<T> bb50Var, C22421c<T> c22421c) {
            return new C17879d<>(bb50Var, c22421c, 0);
        }

        /* JADX INFO: renamed from: d */
        public C17879d<T> m143514d() {
            return new C17879d<>(this.f118400a, this.f118401b, this.f118402c + 1);
        }
    }

    public j560(long j, long j2, TimeUnit timeUnit, int i, f2e0 f2e0Var) {
        this.f118372a = j;
        this.f118373b = j2;
        this.f118374c = timeUnit;
        this.f118376e = i;
        this.f118375d = f2e0Var;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super C22421c<T>> gcg0Var) {
        f2e0.AbstractC16877a abstractC16877aCreateWorker = this.f118375d.createWorker();
        if (this.f118372a == this.f118373b) {
            C17877b c17877b = new C17877b(gcg0Var, abstractC16877aCreateWorker);
            c17877b.m129866b(abstractC16877aCreateWorker);
            c17877b.m143506m();
            return c17877b;
        }
        C17878c c17878c = new C17878c(gcg0Var, abstractC16877aCreateWorker);
        c17878c.m129866b(abstractC16877aCreateWorker);
        c17878c.m143509i();
        c17878c.m143508h();
        return c17878c;
    }
}
