package p149l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p133rx.C22306c;
import p133rx.internal.operators.NotificationLite;
import p133rx.subjects.UnicastSubject;

/* JADX INFO: loaded from: classes3.dex */
public final class ax50<T, U> implements C22306c.c<C22306c<T>, T> {

    /* JADX INFO: renamed from: b */
    public static final Object f72116b = new Object();

    /* JADX INFO: renamed from: c */
    public static final NotificationLite<Object> f72117c = NotificationLite.m221335f();

    /* JADX INFO: renamed from: a */
    public final C22306c<U> f72118a;

    /* JADX INFO: renamed from: l.ax50$a */
    public static final class C15749a<T, U> extends z3g0<U> {

        /* JADX INFO: renamed from: e */
        public final C15750b<T> f72119e;

        public C15749a(C15750b<T> c15750b) {
            this.f72119e = c15750b;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo99382d() {
            m217048e(Long.MAX_VALUE);
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f72119e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f72119e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(U u) throws Throwable {
            this.f72119e.m99389m();
        }
    }

    /* JADX INFO: renamed from: l.ax50$b */
    public static final class C15750b<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super C22306c<T>> f72120e;

        /* JADX INFO: renamed from: f */
        public final Object f72121f = new Object();

        /* JADX INFO: renamed from: g */
        public m250<T> f72122g;

        /* JADX INFO: renamed from: h */
        public C22306c<T> f72123h;

        /* JADX INFO: renamed from: i */
        public boolean f72124i;

        /* JADX INFO: renamed from: j */
        public List<Object> f72125j;

        public C15750b(z3g0<? super C22306c<T>> z3g0Var) {
            this.f72120e = new vie0(z3g0Var);
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo99382d() {
            m217048e(Long.MAX_VALUE);
        }

        /* JADX INFO: renamed from: g */
        public void m99383g() {
            m250<T> m250Var = this.f72122g;
            this.f72122g = null;
            this.f72123h = null;
            if (m250Var != null) {
                m250Var.onCompleted();
            }
            this.f72120e.onCompleted();
            unsubscribe();
        }

        /* JADX INFO: renamed from: h */
        public void m99384h() {
            UnicastSubject unicastSubjectM221509b = UnicastSubject.m221509b();
            this.f72122g = unicastSubjectM221509b;
            this.f72123h = unicastSubjectM221509b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: i */
        public void m99385i(List<Object> list) {
            if (list == null) {
                return;
            }
            for (Object obj : list) {
                if (obj == ax50.f72116b) {
                    m99388l();
                } else {
                    NotificationLite<Object> notificationLite = ax50.f72117c;
                    if (notificationLite.m221342h(obj)) {
                        m99387k(notificationLite.m221339d(obj));
                        return;
                    } else {
                        if (notificationLite.m221341g(obj)) {
                            m99383g();
                            return;
                        }
                        m99386j(obj);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public void m99386j(T t) {
            m250<T> m250Var = this.f72122g;
            if (m250Var != null) {
                m250Var.onNext(t);
            }
        }

        /* JADX INFO: renamed from: k */
        public void m99387k(Throwable th) {
            m250<T> m250Var = this.f72122g;
            this.f72122g = null;
            this.f72123h = null;
            if (m250Var != null) {
                m250Var.onError(th);
            }
            this.f72120e.onError(th);
            unsubscribe();
        }

        /* JADX INFO: renamed from: l */
        public void m99388l() {
            m250<T> m250Var = this.f72122g;
            if (m250Var != null) {
                m250Var.onCompleted();
            }
            m99384h();
            this.f72120e.onNext(this.f72123h);
        }

        /* JADX INFO: renamed from: m */
        public void m99389m() throws Throwable {
            synchronized (this.f72121f) {
                try {
                    boolean z = this.f72124i;
                    List<Object> list = this.f72125j;
                    if (z) {
                        if (list == null) {
                            this.f72125j = new ArrayList();
                        }
                        this.f72125j.add(ax50.f72116b);
                        return;
                    }
                    this.f72125j = null;
                    boolean z2 = true;
                    this.f72124i = true;
                    boolean z3 = true;
                    while (true) {
                        try {
                            m99385i(list);
                            if (z3) {
                                m99388l();
                                z3 = false;
                            }
                            try {
                                synchronized (this.f72121f) {
                                    try {
                                        List<Object> list2 = this.f72125j;
                                        this.f72125j = null;
                                        if (list2 == null) {
                                            this.f72124i = false;
                                            return;
                                        } else {
                                            if (this.f72120e.isUnsubscribed()) {
                                                synchronized (this.f72121f) {
                                                    this.f72124i = false;
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
                                                synchronized (this.f72121f) {
                                                    this.f72124i = false;
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

        @Override // p149l.m250
        public void onCompleted() {
            synchronized (this.f72121f) {
                try {
                    boolean z = this.f72124i;
                    List<Object> list = this.f72125j;
                    if (z) {
                        if (list == null) {
                            this.f72125j = new ArrayList();
                        }
                        this.f72125j.add(ax50.f72117c.m221337b());
                        return;
                    }
                    this.f72125j = null;
                    this.f72124i = true;
                    try {
                        m99385i(list);
                        m99383g();
                    } catch (Throwable th) {
                        m99387k(th);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            synchronized (this.f72121f) {
                try {
                    if (this.f72124i) {
                        this.f72125j = Collections.singletonList(ax50.f72117c.m221338c(th));
                        return;
                    }
                    this.f72125j = null;
                    this.f72124i = true;
                    m99387k(th);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p149l.m250
        public void onNext(T t) throws Throwable {
            synchronized (this.f72121f) {
                try {
                    boolean z = this.f72124i;
                    List<Object> list = this.f72125j;
                    if (z) {
                        if (list == null) {
                            this.f72125j = new ArrayList();
                        }
                        this.f72125j.add(t);
                        return;
                    }
                    this.f72125j = null;
                    boolean z2 = true;
                    this.f72124i = true;
                    boolean z3 = true;
                    while (true) {
                        try {
                            m99385i(list);
                            if (z3) {
                                m99386j(t);
                                z3 = false;
                            }
                            try {
                                synchronized (this.f72121f) {
                                    try {
                                        List<Object> list2 = this.f72125j;
                                        this.f72125j = null;
                                        if (list2 == null) {
                                            this.f72124i = false;
                                            return;
                                        } else {
                                            if (this.f72120e.isUnsubscribed()) {
                                                synchronized (this.f72121f) {
                                                    this.f72124i = false;
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
                                                synchronized (this.f72121f) {
                                                    this.f72124i = false;
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

    public ax50(C22306c<U> c22306c) {
        this.f72118a = c22306c;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super C22306c<T>> z3g0Var) throws Throwable {
        C15750b c15750b = new C15750b(z3g0Var);
        C15749a c15749a = new C15749a(c15750b);
        z3g0Var.m217046b(c15750b);
        z3g0Var.m217046b(c15749a);
        c15750b.m99389m();
        this.f72118a.unsafeSubscribe(c15749a);
        return c15750b;
    }
}
