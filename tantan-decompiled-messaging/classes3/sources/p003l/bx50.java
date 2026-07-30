package p003l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p014rx.C1099c;
import p014rx.internal.operators.NotificationLite;
import p014rx.subjects.UnicastSubject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class bx50<T, U> implements C1099c.c<C1099c<T>, T> {

    /* JADX INFO: renamed from: b */
    public static final Object f2524b = new Object();

    /* JADX INFO: renamed from: c */
    public static final NotificationLite<Object> f2525c = NotificationLite.m9792f();

    /* JADX INFO: renamed from: a */
    public final v9j<? extends C1099c<? extends U>> f2526a;

    /* JADX INFO: renamed from: l.bx50$a */
    public static final class C0189a<T, U> extends z3g0<U> {

        /* JADX INFO: renamed from: e */
        public final C0190b<T, U> f2527e;

        /* JADX INFO: renamed from: f */
        public boolean f2528f;

        public C0189a(C0190b<T, U> c0190b) {
            this.f2527e = c0190b;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            m9242e(Long.MAX_VALUE);
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f2528f) {
                return;
            }
            this.f2528f = true;
            this.f2527e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f2527e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(U u) throws Throwable {
            if (this.f2528f) {
                return;
            }
            this.f2528f = true;
            this.f2527e.m3200m();
        }
    }

    /* JADX INFO: renamed from: l.bx50$b */
    public static final class C0190b<T, U> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super C1099c<T>> f2529e;

        /* JADX INFO: renamed from: f */
        public final Object f2530f = new Object();

        /* JADX INFO: renamed from: g */
        public m250<T> f2531g;

        /* JADX INFO: renamed from: h */
        public C1099c<T> f2532h;

        /* JADX INFO: renamed from: i */
        public boolean f2533i;

        /* JADX INFO: renamed from: j */
        public List<Object> f2534j;

        /* JADX INFO: renamed from: k */
        public final rie0 f2535k;

        /* JADX INFO: renamed from: l */
        public final v9j<? extends C1099c<? extends U>> f2536l;

        public C0190b(z3g0<? super C1099c<T>> z3g0Var, v9j<? extends C1099c<? extends U>> v9jVar) {
            this.f2529e = new vie0(z3g0Var);
            rie0 rie0Var = new rie0();
            this.f2535k = rie0Var;
            this.f2536l = v9jVar;
            m9240b(rie0Var);
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            m9242e(Long.MAX_VALUE);
        }

        /* JADX INFO: renamed from: g */
        public void m3194g() {
            m250<T> m250Var = this.f2531g;
            this.f2531g = null;
            this.f2532h = null;
            if (m250Var != null) {
                m250Var.onCompleted();
            }
            this.f2529e.onCompleted();
            unsubscribe();
        }

        /* JADX INFO: renamed from: h */
        public void m3195h() {
            UnicastSubject unicastSubjectM9966b = UnicastSubject.m9966b();
            this.f2531g = unicastSubjectM9966b;
            this.f2532h = unicastSubjectM9966b;
            try {
                C1099c<? extends U> c1099cCall = this.f2536l.call();
                C0189a c0189a = new C0189a(this);
                this.f2535k.m7260b(c0189a);
                c1099cCall.unsafeSubscribe(c0189a);
            } catch (Throwable th) {
                this.f2529e.onError(th);
                unsubscribe();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: i */
        public void m3196i(List<Object> list) {
            if (list == null) {
                return;
            }
            for (Object obj : list) {
                if (obj == bx50.f2524b) {
                    m3199l();
                } else {
                    NotificationLite<Object> notificationLite = bx50.f2525c;
                    if (notificationLite.m9799h(obj)) {
                        m3198k(notificationLite.m9796d(obj));
                        return;
                    } else {
                        if (notificationLite.m9798g(obj)) {
                            m3194g();
                            return;
                        }
                        m3197j(obj);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public void m3197j(T t) {
            m250<T> m250Var = this.f2531g;
            if (m250Var != null) {
                m250Var.onNext(t);
            }
        }

        /* JADX INFO: renamed from: k */
        public void m3198k(Throwable th) {
            m250<T> m250Var = this.f2531g;
            this.f2531g = null;
            this.f2532h = null;
            if (m250Var != null) {
                m250Var.onError(th);
            }
            this.f2529e.onError(th);
            unsubscribe();
        }

        /* JADX INFO: renamed from: l */
        public void m3199l() {
            m250<T> m250Var = this.f2531g;
            if (m250Var != null) {
                m250Var.onCompleted();
            }
            m3195h();
            this.f2529e.onNext(this.f2532h);
        }

        /* JADX INFO: renamed from: m */
        public void m3200m() throws Throwable {
            synchronized (this.f2530f) {
                try {
                    boolean z = this.f2533i;
                    List<Object> list = this.f2534j;
                    if (z) {
                        if (list == null) {
                            this.f2534j = new ArrayList();
                        }
                        this.f2534j.add(bx50.f2524b);
                        return;
                    }
                    this.f2534j = null;
                    boolean z2 = true;
                    this.f2533i = true;
                    boolean z3 = true;
                    while (true) {
                        try {
                            m3196i(list);
                            if (z3) {
                                m3199l();
                                z3 = false;
                            }
                            try {
                                synchronized (this.f2530f) {
                                    try {
                                        List<Object> list2 = this.f2534j;
                                        this.f2534j = null;
                                        if (list2 == null) {
                                            this.f2533i = false;
                                            return;
                                        } else {
                                            if (this.f2529e.isUnsubscribed()) {
                                                synchronized (this.f2530f) {
                                                    this.f2533i = false;
                                                }
                                                return;
                                            }
                                            list = list2;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        z2 = false;
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (!z2) {
                                                synchronized (this.f2530f) {
                                                    this.f2533i = false;
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            z2 = false;
                        }
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }

        @Override // p003l.m250
        public void onCompleted() {
            synchronized (this.f2530f) {
                try {
                    boolean z = this.f2533i;
                    List<Object> list = this.f2534j;
                    if (z) {
                        if (list == null) {
                            this.f2534j = new ArrayList();
                        }
                        this.f2534j.add(bx50.f2525c.m9794b());
                        return;
                    }
                    this.f2534j = null;
                    this.f2533i = true;
                    try {
                        m3196i(list);
                        m3194g();
                    } catch (Throwable th) {
                        m3198k(th);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            synchronized (this.f2530f) {
                try {
                    if (this.f2533i) {
                        this.f2534j = Collections.singletonList(bx50.f2525c.m9795c(th));
                        return;
                    }
                    this.f2534j = null;
                    this.f2533i = true;
                    m3198k(th);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p003l.m250
        public void onNext(T t) throws Throwable {
            synchronized (this.f2530f) {
                try {
                    boolean z = this.f2533i;
                    List<Object> list = this.f2534j;
                    if (z) {
                        if (list == null) {
                            this.f2534j = new ArrayList();
                        }
                        this.f2534j.add(t);
                        return;
                    }
                    this.f2534j = null;
                    boolean z2 = true;
                    this.f2533i = true;
                    boolean z3 = true;
                    while (true) {
                        try {
                            m3196i(list);
                            if (z3) {
                                m3197j(t);
                                z3 = false;
                            }
                            try {
                                synchronized (this.f2530f) {
                                    try {
                                        List<Object> list2 = this.f2534j;
                                        this.f2534j = null;
                                        if (list2 == null) {
                                            this.f2533i = false;
                                            return;
                                        } else {
                                            if (this.f2529e.isUnsubscribed()) {
                                                synchronized (this.f2530f) {
                                                    this.f2533i = false;
                                                }
                                                return;
                                            }
                                            list = list2;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        z2 = false;
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (!z2) {
                                                synchronized (this.f2530f) {
                                                    this.f2533i = false;
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            z2 = false;
                        }
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }
    }

    public bx50(v9j<? extends C1099c<? extends U>> v9jVar) {
        this.f2526a = v9jVar;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super C1099c<T>> z3g0Var) throws Throwable {
        C0190b c0190b = new C0190b(z3g0Var, this.f2526a);
        z3g0Var.m9240b(c0190b);
        c0190b.m3200m();
        return c0190b;
    }
}
