package p149l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p133rx.C22306c;
import p133rx.internal.operators.NotificationLite;
import p133rx.subjects.UnicastSubject;

/* JADX INFO: loaded from: classes3.dex */
public final class bx50<T, U> implements C22306c.c<C22306c<T>, T> {

    /* JADX INFO: renamed from: b */
    public static final Object f77740b = new Object();

    /* JADX INFO: renamed from: c */
    public static final NotificationLite<Object> f77741c = NotificationLite.m221335f();

    /* JADX INFO: renamed from: a */
    public final v9j<? extends C22306c<? extends U>> f77742a;

    /* JADX INFO: renamed from: l.bx50$a */
    public static final class C16005a<T, U> extends z3g0<U> {

        /* JADX INFO: renamed from: e */
        public final C16006b<T, U> f77743e;

        /* JADX INFO: renamed from: f */
        public boolean f77744f;

        public C16005a(C16006b<T, U> c16006b) {
            this.f77743e = c16006b;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo99382d() {
            m217048e(Long.MAX_VALUE);
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f77744f) {
                return;
            }
            this.f77744f = true;
            this.f77743e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f77743e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(U u) throws Throwable {
            if (this.f77744f) {
                return;
            }
            this.f77744f = true;
            this.f77743e.m104281m();
        }
    }

    /* JADX INFO: renamed from: l.bx50$b */
    public static final class C16006b<T, U> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super C22306c<T>> f77745e;

        /* JADX INFO: renamed from: f */
        public final Object f77746f = new Object();

        /* JADX INFO: renamed from: g */
        public m250<T> f77747g;

        /* JADX INFO: renamed from: h */
        public C22306c<T> f77748h;

        /* JADX INFO: renamed from: i */
        public boolean f77749i;

        /* JADX INFO: renamed from: j */
        public List<Object> f77750j;

        /* JADX INFO: renamed from: k */
        public final rie0 f77751k;

        /* JADX INFO: renamed from: l */
        public final v9j<? extends C22306c<? extends U>> f77752l;

        public C16006b(z3g0<? super C22306c<T>> z3g0Var, v9j<? extends C22306c<? extends U>> v9jVar) {
            this.f77745e = new vie0(z3g0Var);
            rie0 rie0Var = new rie0();
            this.f77751k = rie0Var;
            this.f77752l = v9jVar;
            m217046b(rie0Var);
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo99382d() {
            m217048e(Long.MAX_VALUE);
        }

        /* JADX INFO: renamed from: g */
        public void m104275g() {
            m250<T> m250Var = this.f77747g;
            this.f77747g = null;
            this.f77748h = null;
            if (m250Var != null) {
                m250Var.onCompleted();
            }
            this.f77745e.onCompleted();
            unsubscribe();
        }

        /* JADX INFO: renamed from: h */
        public void m104276h() {
            UnicastSubject unicastSubjectM221509b = UnicastSubject.m221509b();
            this.f77747g = unicastSubjectM221509b;
            this.f77748h = unicastSubjectM221509b;
            try {
                C22306c<? extends U> c22306cCall = this.f77752l.call();
                C16005a c16005a = new C16005a(this);
                this.f77751k.m179504b(c16005a);
                c22306cCall.unsafeSubscribe(c16005a);
            } catch (Throwable th) {
                this.f77745e.onError(th);
                unsubscribe();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: i */
        public void m104277i(List<Object> list) {
            if (list == null) {
                return;
            }
            for (Object obj : list) {
                if (obj == bx50.f77740b) {
                    m104280l();
                } else {
                    NotificationLite<Object> notificationLite = bx50.f77741c;
                    if (notificationLite.m221342h(obj)) {
                        m104279k(notificationLite.m221339d(obj));
                        return;
                    } else {
                        if (notificationLite.m221341g(obj)) {
                            m104275g();
                            return;
                        }
                        m104278j(obj);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public void m104278j(T t) {
            m250<T> m250Var = this.f77747g;
            if (m250Var != null) {
                m250Var.onNext(t);
            }
        }

        /* JADX INFO: renamed from: k */
        public void m104279k(Throwable th) {
            m250<T> m250Var = this.f77747g;
            this.f77747g = null;
            this.f77748h = null;
            if (m250Var != null) {
                m250Var.onError(th);
            }
            this.f77745e.onError(th);
            unsubscribe();
        }

        /* JADX INFO: renamed from: l */
        public void m104280l() {
            m250<T> m250Var = this.f77747g;
            if (m250Var != null) {
                m250Var.onCompleted();
            }
            m104276h();
            this.f77745e.onNext(this.f77748h);
        }

        /* JADX INFO: renamed from: m */
        public void m104281m() throws Throwable {
            synchronized (this.f77746f) {
                try {
                    boolean z = this.f77749i;
                    List<Object> list = this.f77750j;
                    if (z) {
                        if (list == null) {
                            this.f77750j = new ArrayList();
                        }
                        this.f77750j.add(bx50.f77740b);
                        return;
                    }
                    this.f77750j = null;
                    boolean z2 = true;
                    this.f77749i = true;
                    boolean z3 = true;
                    while (true) {
                        try {
                            m104277i(list);
                            if (z3) {
                                m104280l();
                                z3 = false;
                            }
                            try {
                                synchronized (this.f77746f) {
                                    try {
                                        List<Object> list2 = this.f77750j;
                                        this.f77750j = null;
                                        if (list2 == null) {
                                            this.f77749i = false;
                                            return;
                                        } else {
                                            if (this.f77745e.isUnsubscribed()) {
                                                synchronized (this.f77746f) {
                                                    this.f77749i = false;
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
                                                synchronized (this.f77746f) {
                                                    this.f77749i = false;
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
            synchronized (this.f77746f) {
                try {
                    boolean z = this.f77749i;
                    List<Object> list = this.f77750j;
                    if (z) {
                        if (list == null) {
                            this.f77750j = new ArrayList();
                        }
                        this.f77750j.add(bx50.f77741c.m221337b());
                        return;
                    }
                    this.f77750j = null;
                    this.f77749i = true;
                    try {
                        m104277i(list);
                        m104275g();
                    } catch (Throwable th) {
                        m104279k(th);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            synchronized (this.f77746f) {
                try {
                    if (this.f77749i) {
                        this.f77750j = Collections.singletonList(bx50.f77741c.m221338c(th));
                        return;
                    }
                    this.f77750j = null;
                    this.f77749i = true;
                    m104279k(th);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p149l.m250
        public void onNext(T t) throws Throwable {
            synchronized (this.f77746f) {
                try {
                    boolean z = this.f77749i;
                    List<Object> list = this.f77750j;
                    if (z) {
                        if (list == null) {
                            this.f77750j = new ArrayList();
                        }
                        this.f77750j.add(t);
                        return;
                    }
                    this.f77750j = null;
                    boolean z2 = true;
                    this.f77749i = true;
                    boolean z3 = true;
                    while (true) {
                        try {
                            m104277i(list);
                            if (z3) {
                                m104278j(t);
                                z3 = false;
                            }
                            try {
                                synchronized (this.f77746f) {
                                    try {
                                        List<Object> list2 = this.f77750j;
                                        this.f77750j = null;
                                        if (list2 == null) {
                                            this.f77749i = false;
                                            return;
                                        } else {
                                            if (this.f77745e.isUnsubscribed()) {
                                                synchronized (this.f77746f) {
                                                    this.f77749i = false;
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
                                                synchronized (this.f77746f) {
                                                    this.f77749i = false;
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

    public bx50(v9j<? extends C22306c<? extends U>> v9jVar) {
        this.f77742a = v9jVar;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super C22306c<T>> z3g0Var) throws Throwable {
        C16006b c16006b = new C16006b(z3g0Var, this.f77742a);
        z3g0Var.m217046b(c16006b);
        c16006b.m104281m();
        return c16006b;
    }
}
