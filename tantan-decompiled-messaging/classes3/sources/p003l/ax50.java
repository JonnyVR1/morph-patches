package p003l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p014rx.C1099c;
import p014rx.internal.operators.NotificationLite;
import p014rx.subjects.UnicastSubject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class ax50<T, U> implements C1099c.c<C1099c<T>, T> {

    /* JADX INFO: renamed from: b */
    public static final Object f2309b = new Object();

    /* JADX INFO: renamed from: c */
    public static final NotificationLite<Object> f2310c = NotificationLite.m9792f();

    /* JADX INFO: renamed from: a */
    public final C1099c<U> f2311a;

    /* JADX INFO: renamed from: l.ax50$a */
    public static final class C0168a<T, U> extends z3g0<U> {

        /* JADX INFO: renamed from: e */
        public final C0169b<T> f2312e;

        public C0168a(C0169b<T> c0169b) {
            this.f2312e = c0169b;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            m9242e(Long.MAX_VALUE);
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f2312e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f2312e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(U u) throws Throwable {
            this.f2312e.m2925m();
        }
    }

    /* JADX INFO: renamed from: l.ax50$b */
    public static final class C0169b<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super C1099c<T>> f2313e;

        /* JADX INFO: renamed from: f */
        public final Object f2314f = new Object();

        /* JADX INFO: renamed from: g */
        public m250<T> f2315g;

        /* JADX INFO: renamed from: h */
        public C1099c<T> f2316h;

        /* JADX INFO: renamed from: i */
        public boolean f2317i;

        /* JADX INFO: renamed from: j */
        public List<Object> f2318j;

        public C0169b(z3g0<? super C1099c<T>> z3g0Var) {
            this.f2313e = new vie0(z3g0Var);
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            m9242e(Long.MAX_VALUE);
        }

        /* JADX INFO: renamed from: g */
        public void m2919g() {
            m250<T> m250Var = this.f2315g;
            this.f2315g = null;
            this.f2316h = null;
            if (m250Var != null) {
                m250Var.onCompleted();
            }
            this.f2313e.onCompleted();
            unsubscribe();
        }

        /* JADX INFO: renamed from: h */
        public void m2920h() {
            UnicastSubject unicastSubjectM9966b = UnicastSubject.m9966b();
            this.f2315g = unicastSubjectM9966b;
            this.f2316h = unicastSubjectM9966b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: i */
        public void m2921i(List<Object> list) {
            if (list == null) {
                return;
            }
            for (Object obj : list) {
                if (obj == ax50.f2309b) {
                    m2924l();
                } else {
                    NotificationLite<Object> notificationLite = ax50.f2310c;
                    if (notificationLite.m9799h(obj)) {
                        m2923k(notificationLite.m9796d(obj));
                        return;
                    } else {
                        if (notificationLite.m9798g(obj)) {
                            m2919g();
                            return;
                        }
                        m2922j(obj);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public void m2922j(T t) {
            m250<T> m250Var = this.f2315g;
            if (m250Var != null) {
                m250Var.onNext(t);
            }
        }

        /* JADX INFO: renamed from: k */
        public void m2923k(Throwable th) {
            m250<T> m250Var = this.f2315g;
            this.f2315g = null;
            this.f2316h = null;
            if (m250Var != null) {
                m250Var.onError(th);
            }
            this.f2313e.onError(th);
            unsubscribe();
        }

        /* JADX INFO: renamed from: l */
        public void m2924l() {
            m250<T> m250Var = this.f2315g;
            if (m250Var != null) {
                m250Var.onCompleted();
            }
            m2920h();
            this.f2313e.onNext(this.f2316h);
        }

        /* JADX INFO: renamed from: m */
        public void m2925m() throws Throwable {
            synchronized (this.f2314f) {
                try {
                    boolean z = this.f2317i;
                    List<Object> list = this.f2318j;
                    if (z) {
                        if (list == null) {
                            this.f2318j = new ArrayList();
                        }
                        this.f2318j.add(ax50.f2309b);
                        return;
                    }
                    this.f2318j = null;
                    boolean z2 = true;
                    this.f2317i = true;
                    boolean z3 = true;
                    while (true) {
                        try {
                            m2921i(list);
                            if (z3) {
                                m2924l();
                                z3 = false;
                            }
                            try {
                                synchronized (this.f2314f) {
                                    try {
                                        List<Object> list2 = this.f2318j;
                                        this.f2318j = null;
                                        if (list2 == null) {
                                            this.f2317i = false;
                                            return;
                                        } else {
                                            if (this.f2313e.isUnsubscribed()) {
                                                synchronized (this.f2314f) {
                                                    this.f2317i = false;
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
                                                synchronized (this.f2314f) {
                                                    this.f2317i = false;
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
            synchronized (this.f2314f) {
                try {
                    boolean z = this.f2317i;
                    List<Object> list = this.f2318j;
                    if (z) {
                        if (list == null) {
                            this.f2318j = new ArrayList();
                        }
                        this.f2318j.add(ax50.f2310c.m9794b());
                        return;
                    }
                    this.f2318j = null;
                    this.f2317i = true;
                    try {
                        m2921i(list);
                        m2919g();
                    } catch (Throwable th) {
                        m2923k(th);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            synchronized (this.f2314f) {
                try {
                    if (this.f2317i) {
                        this.f2318j = Collections.singletonList(ax50.f2310c.m9795c(th));
                        return;
                    }
                    this.f2318j = null;
                    this.f2317i = true;
                    m2923k(th);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p003l.m250
        public void onNext(T t) throws Throwable {
            synchronized (this.f2314f) {
                try {
                    boolean z = this.f2317i;
                    List<Object> list = this.f2318j;
                    if (z) {
                        if (list == null) {
                            this.f2318j = new ArrayList();
                        }
                        this.f2318j.add(t);
                        return;
                    }
                    this.f2318j = null;
                    boolean z2 = true;
                    this.f2317i = true;
                    boolean z3 = true;
                    while (true) {
                        try {
                            m2921i(list);
                            if (z3) {
                                m2922j(t);
                                z3 = false;
                            }
                            try {
                                synchronized (this.f2314f) {
                                    try {
                                        List<Object> list2 = this.f2318j;
                                        this.f2318j = null;
                                        if (list2 == null) {
                                            this.f2317i = false;
                                            return;
                                        } else {
                                            if (this.f2313e.isUnsubscribed()) {
                                                synchronized (this.f2314f) {
                                                    this.f2317i = false;
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
                                                synchronized (this.f2314f) {
                                                    this.f2317i = false;
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

    public ax50(C1099c<U> c1099c) {
        this.f2311a = c1099c;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super C1099c<T>> z3g0Var) throws Throwable {
        C0169b c0169b = new C0169b(z3g0Var);
        C0168a c0168a = new C0168a(c0169b);
        z3g0Var.m9240b(c0169b);
        z3g0Var.m9240b(c0168a);
        c0169b.m2925m();
        this.f2311a.unsafeSubscribe(c0168a);
        return c0169b;
    }
}
