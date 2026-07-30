package p149l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.internal.operators.NotificationLite;
import p133rx.subjects.UnicastSubject;

/* JADX INFO: loaded from: classes3.dex */
public final class dx50<T> implements C22306c.c<C22306c<T>, T> {

    /* JADX INFO: renamed from: f */
    public static final Object f88235f = new Object();

    /* JADX INFO: renamed from: g */
    public static final NotificationLite<Object> f88236g = NotificationLite.m221335f();

    /* JADX INFO: renamed from: a */
    public final long f88237a;

    /* JADX INFO: renamed from: b */
    public final long f88238b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f88239c;

    /* JADX INFO: renamed from: d */
    public final bud0 f88240d;

    /* JADX INFO: renamed from: e */
    public final int f88241e;

    /* JADX INFO: renamed from: l.dx50$a */
    public static final class C16491a<T> {

        /* JADX INFO: renamed from: a */
        public final m250<T> f88242a;

        /* JADX INFO: renamed from: b */
        public final C22306c<T> f88243b;

        /* JADX INFO: renamed from: c */
        public int f88244c;

        public C16491a(m250<T> m250Var, C22306c<T> c22306c) {
            this.f88242a = new tie0(m250Var);
            this.f88243b = c22306c;
        }
    }

    /* JADX INFO: renamed from: l.dx50$b */
    public final class C16492b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super C22306c<T>> f88245e;

        /* JADX INFO: renamed from: f */
        public final bud0.AbstractC15976a f88246f;

        /* JADX INFO: renamed from: h */
        public List<Object> f88248h;

        /* JADX INFO: renamed from: i */
        public boolean f88249i;

        /* JADX INFO: renamed from: g */
        public final Object f88247g = new Object();

        /* JADX INFO: renamed from: j */
        public volatile C16494d<T> f88250j = C16494d.m113984c();

        /* JADX INFO: renamed from: l.dx50$b$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ dx50 f88252a;

            public a(dx50 dx50Var) {
                this.f88252a = dx50Var;
            }

            @Override // p149l.d30
            public void call() {
                if (C16492b.this.f88250j.f88265a == null) {
                    C16492b.this.unsubscribe();
                }
            }
        }

        /* JADX INFO: renamed from: l.dx50$b$b */
        public class b implements d30 {
            public b() {
            }

            @Override // p149l.d30
            public void call() throws Throwable {
                C16492b.this.m113977k();
            }
        }

        public C16492b(z3g0<? super C22306c<T>> z3g0Var, bud0.AbstractC15976a abstractC15976a) {
            this.f88245e = new vie0(z3g0Var);
            this.f88246f = abstractC15976a;
            z3g0Var.m217046b(h4g0.m129240a(new a(dx50.this)));
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo99382d() {
            m217048e(Long.MAX_VALUE);
        }

        /* JADX INFO: renamed from: g */
        public void m113973g() {
            m250<T> m250Var = this.f88250j.f88265a;
            this.f88250j = this.f88250j.m113985a();
            if (m250Var != null) {
                m250Var.onCompleted();
            }
            this.f88245e.onCompleted();
            unsubscribe();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: h */
        public boolean m113974h(List<Object> list) {
            if (list == null) {
                return true;
            }
            for (Object obj : list) {
                if (obj != dx50.f88235f) {
                    NotificationLite<Object> notificationLite = dx50.f88236g;
                    if (notificationLite.m221342h(obj)) {
                        m113976j(notificationLite.m221339d(obj));
                        break;
                    }
                    if (notificationLite.m221341g(obj)) {
                        m113973g();
                        break;
                    }
                    if (!m113975i(obj)) {
                        return false;
                    }
                } else if (!m113978l()) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: i */
        public boolean m113975i(T t) {
            C16494d<T> c16494dM113987d;
            C16494d<T> c16494d = this.f88250j;
            if (c16494d.f88265a == null) {
                if (!m113978l()) {
                    return false;
                }
                c16494d = this.f88250j;
            }
            c16494d.f88265a.onNext(t);
            if (c16494d.f88267c == dx50.this.f88241e - 1) {
                c16494d.f88265a.onCompleted();
                c16494dM113987d = c16494d.m113985a();
            } else {
                c16494dM113987d = c16494d.m113987d();
            }
            this.f88250j = c16494dM113987d;
            return true;
        }

        /* JADX INFO: renamed from: j */
        public void m113976j(Throwable th) {
            m250<T> m250Var = this.f88250j.f88265a;
            this.f88250j = this.f88250j.m113985a();
            if (m250Var != null) {
                m250Var.onError(th);
            }
            this.f88245e.onError(th);
            unsubscribe();
        }

        /* JADX INFO: renamed from: k */
        public void m113977k() throws Throwable {
            boolean z;
            List<Object> list;
            synchronized (this.f88247g) {
                try {
                    if (this.f88249i) {
                        if (this.f88248h == null) {
                            this.f88248h = new ArrayList();
                        }
                        this.f88248h.add(dx50.f88235f);
                        return;
                    }
                    boolean z2 = true;
                    this.f88249i = true;
                    try {
                        if (!m113978l()) {
                            synchronized (this.f88247g) {
                                this.f88249i = false;
                            }
                            return;
                        }
                        do {
                            try {
                                synchronized (this.f88247g) {
                                    try {
                                        list = this.f88248h;
                                        if (list == null) {
                                            this.f88249i = false;
                                            return;
                                        }
                                        this.f88248h = null;
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
                        } while (m113974h(list));
                        synchronized (this.f88247g) {
                            this.f88249i = false;
                        }
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        z = false;
                    }
                    if (z) {
                        throw th;
                    }
                    synchronized (this.f88247g) {
                        this.f88249i = false;
                    }
                    throw th;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }

        /* JADX INFO: renamed from: l */
        public boolean m113978l() {
            m250<T> m250Var = this.f88250j.f88265a;
            if (m250Var != null) {
                m250Var.onCompleted();
            }
            if (this.f88245e.isUnsubscribed()) {
                this.f88250j = this.f88250j.m113985a();
                unsubscribe();
                return false;
            }
            UnicastSubject unicastSubjectM221509b = UnicastSubject.m221509b();
            this.f88250j = this.f88250j.m113986b(unicastSubjectM221509b, unicastSubjectM221509b);
            this.f88245e.onNext(unicastSubjectM221509b);
            return true;
        }

        /* JADX INFO: renamed from: m */
        public void m113979m() {
            bud0.AbstractC15976a abstractC15976a = this.f88246f;
            b bVar = new b();
            dx50 dx50Var = dx50.this;
            abstractC15976a.m103920d(bVar, 0L, dx50Var.f88237a, dx50Var.f88239c);
        }

        @Override // p149l.m250
        public void onCompleted() {
            synchronized (this.f88247g) {
                try {
                    boolean z = this.f88249i;
                    List<Object> list = this.f88248h;
                    if (z) {
                        if (list == null) {
                            this.f88248h = new ArrayList();
                        }
                        this.f88248h.add(dx50.f88236g.m221337b());
                        return;
                    }
                    this.f88248h = null;
                    this.f88249i = true;
                    try {
                        m113974h(list);
                        m113973g();
                    } catch (Throwable th) {
                        m113976j(th);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            synchronized (this.f88247g) {
                try {
                    if (this.f88249i) {
                        this.f88248h = Collections.singletonList(dx50.f88236g.m221338c(th));
                        return;
                    }
                    this.f88248h = null;
                    this.f88249i = true;
                    m113976j(th);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p149l.m250
        public void onNext(T t) throws Throwable {
            List<Object> list;
            synchronized (this.f88247g) {
                try {
                    if (this.f88249i) {
                        if (this.f88248h == null) {
                            this.f88248h = new ArrayList();
                        }
                        this.f88248h.add(t);
                        return;
                    }
                    boolean z = true;
                    this.f88249i = true;
                    try {
                        if (!m113975i(t)) {
                            synchronized (this.f88247g) {
                                this.f88249i = false;
                            }
                            return;
                        }
                        do {
                            try {
                                synchronized (this.f88247g) {
                                    try {
                                        list = this.f88248h;
                                        if (list == null) {
                                            this.f88249i = false;
                                            return;
                                        }
                                        this.f88248h = null;
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
                        } while (m113974h(list));
                        synchronized (this.f88247g) {
                            this.f88249i = false;
                        }
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        z = false;
                    }
                    if (!z) {
                        synchronized (this.f88247g) {
                            this.f88249i = false;
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
    public final class C16493c extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super C22306c<T>> f88255e;

        /* JADX INFO: renamed from: f */
        public final bud0.AbstractC15976a f88256f;

        /* JADX INFO: renamed from: g */
        public final Object f88257g;

        /* JADX INFO: renamed from: h */
        public final List<C16491a<T>> f88258h;

        /* JADX INFO: renamed from: i */
        public boolean f88259i;

        /* JADX INFO: renamed from: l.dx50$c$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p149l.d30
            public void call() {
                C16493c.this.m113982i();
            }
        }

        /* JADX INFO: renamed from: l.dx50$c$b */
        public class b implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C16491a f88262a;

            public b(C16491a c16491a) {
                this.f88262a = c16491a;
            }

            @Override // p149l.d30
            public void call() {
                C16493c.this.m113983j(this.f88262a);
            }
        }

        public C16493c(z3g0<? super C22306c<T>> z3g0Var, bud0.AbstractC15976a abstractC15976a) {
            super(z3g0Var);
            this.f88255e = z3g0Var;
            this.f88256f = abstractC15976a;
            this.f88257g = new Object();
            this.f88258h = new LinkedList();
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo99382d() {
            m217048e(Long.MAX_VALUE);
        }

        /* JADX INFO: renamed from: g */
        public C16491a<T> m113980g() {
            UnicastSubject unicastSubjectM221509b = UnicastSubject.m221509b();
            return new C16491a<>(unicastSubjectM221509b, unicastSubjectM221509b);
        }

        /* JADX INFO: renamed from: h */
        public void m113981h() {
            bud0.AbstractC15976a abstractC15976a = this.f88256f;
            a aVar = new a();
            dx50 dx50Var = dx50.this;
            long j = dx50Var.f88238b;
            abstractC15976a.m103920d(aVar, j, j, dx50Var.f88239c);
        }

        /* JADX INFO: renamed from: i */
        public void m113982i() {
            C16491a<T> c16491aM113980g = m113980g();
            synchronized (this.f88257g) {
                try {
                    if (this.f88259i) {
                        return;
                    }
                    this.f88258h.add(c16491aM113980g);
                    try {
                        this.f88255e.onNext(c16491aM113980g.f88243b);
                        bud0.AbstractC15976a abstractC15976a = this.f88256f;
                        b bVar = new b(c16491aM113980g);
                        dx50 dx50Var = dx50.this;
                        abstractC15976a.mo99202c(bVar, dx50Var.f88237a, dx50Var.f88239c);
                    } catch (Throwable th) {
                        onError(th);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public void m113983j(C16491a<T> c16491a) {
            boolean z;
            synchronized (this.f88257g) {
                try {
                    if (this.f88259i) {
                        return;
                    }
                    Iterator<C16491a<T>> it = this.f88258h.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        } else if (it.next() == c16491a) {
                            it.remove();
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        c16491a.f88242a.onCompleted();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
            synchronized (this.f88257g) {
                try {
                    if (this.f88259i) {
                        return;
                    }
                    this.f88259i = true;
                    ArrayList arrayList = new ArrayList(this.f88258h);
                    this.f88258h.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C16491a) it.next()).f88242a.onCompleted();
                    }
                    this.f88255e.onCompleted();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            synchronized (this.f88257g) {
                try {
                    if (this.f88259i) {
                        return;
                    }
                    this.f88259i = true;
                    ArrayList arrayList = new ArrayList(this.f88258h);
                    this.f88258h.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C16491a) it.next()).f88242a.onError(th);
                    }
                    this.f88255e.onError(th);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p149l.m250
        public void onNext(T t) {
            synchronized (this.f88257g) {
                try {
                    if (this.f88259i) {
                        return;
                    }
                    ArrayList<C16491a> arrayList = new ArrayList(this.f88258h);
                    Iterator<C16491a<T>> it = this.f88258h.iterator();
                    while (it.hasNext()) {
                        C16491a<T> next = it.next();
                        int i = next.f88244c + 1;
                        next.f88244c = i;
                        if (i == dx50.this.f88241e) {
                            it.remove();
                        }
                    }
                    for (C16491a c16491a : arrayList) {
                        c16491a.f88242a.onNext(t);
                        if (c16491a.f88244c == dx50.this.f88241e) {
                            c16491a.f88242a.onCompleted();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.dx50$d */
    public static final class C16494d<T> {

        /* JADX INFO: renamed from: d */
        public static final C16494d<Object> f88264d = new C16494d<>(null, null, 0);

        /* JADX INFO: renamed from: a */
        public final m250<T> f88265a;

        /* JADX INFO: renamed from: b */
        public final C22306c<T> f88266b;

        /* JADX INFO: renamed from: c */
        public final int f88267c;

        public C16494d(m250<T> m250Var, C22306c<T> c22306c, int i) {
            this.f88265a = m250Var;
            this.f88266b = c22306c;
            this.f88267c = i;
        }

        /* JADX INFO: renamed from: c */
        public static <T> C16494d<T> m113984c() {
            return (C16494d<T>) f88264d;
        }

        /* JADX INFO: renamed from: a */
        public C16494d<T> m113985a() {
            return m113984c();
        }

        /* JADX INFO: renamed from: b */
        public C16494d<T> m113986b(m250<T> m250Var, C22306c<T> c22306c) {
            return new C16494d<>(m250Var, c22306c, 0);
        }

        /* JADX INFO: renamed from: d */
        public C16494d<T> m113987d() {
            return new C16494d<>(this.f88265a, this.f88266b, this.f88267c + 1);
        }
    }

    public dx50(long j, long j2, TimeUnit timeUnit, int i, bud0 bud0Var) {
        this.f88237a = j;
        this.f88238b = j2;
        this.f88239c = timeUnit;
        this.f88241e = i;
        this.f88240d = bud0Var;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super C22306c<T>> z3g0Var) {
        bud0.AbstractC15976a abstractC15976aCreateWorker = this.f88240d.createWorker();
        if (this.f88237a == this.f88238b) {
            C16492b c16492b = new C16492b(z3g0Var, abstractC15976aCreateWorker);
            c16492b.m217046b(abstractC15976aCreateWorker);
            c16492b.m113979m();
            return c16492b;
        }
        C16493c c16493c = new C16493c(z3g0Var, abstractC15976aCreateWorker);
        c16493c.m217046b(abstractC15976aCreateWorker);
        c16493c.m113982i();
        c16493c.m113981h();
        return c16493c;
    }
}
