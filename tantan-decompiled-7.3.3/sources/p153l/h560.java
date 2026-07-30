package p153l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p137rx.C22421c;
import p137rx.internal.operators.NotificationLite;
import p137rx.subjects.UnicastSubject;

/* JADX INFO: loaded from: classes3.dex */
public final class h560<T, U> implements C22421c.c<C22421c<T>, T> {

    /* JADX INFO: renamed from: b */
    public static final Object f107900b = new Object();

    /* JADX INFO: renamed from: c */
    public static final NotificationLite<Object> f107901c = NotificationLite.m222581f();

    /* JADX INFO: renamed from: a */
    public final pcj<? extends C22421c<? extends U>> f107902a;

    /* JADX INFO: renamed from: l.h560$a */
    public static final class C17400a<T, U> extends gcg0<U> {

        /* JADX INFO: renamed from: e */
        public final C17401b<T, U> f107903e;

        /* JADX INFO: renamed from: f */
        public boolean f107904f;

        public C17400a(C17401b<T, U> c17401b) {
            this.f107903e = c17401b;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            m129868e(Long.MAX_VALUE);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f107904f) {
                return;
            }
            this.f107904f = true;
            this.f107903e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f107903e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(U u) throws Throwable {
            if (this.f107904f) {
                return;
            }
            this.f107904f = true;
            this.f107903e.m133634m();
        }
    }

    /* JADX INFO: renamed from: l.h560$b */
    public static final class C17401b<T, U> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super C22421c<T>> f107905e;

        /* JADX INFO: renamed from: f */
        public final Object f107906f = new Object();

        /* JADX INFO: renamed from: g */
        public bb50<T> f107907g;

        /* JADX INFO: renamed from: h */
        public C22421c<T> f107908h;

        /* JADX INFO: renamed from: i */
        public boolean f107909i;

        /* JADX INFO: renamed from: j */
        public List<Object> f107910j;

        /* JADX INFO: renamed from: k */
        public final wqe0 f107911k;

        /* JADX INFO: renamed from: l */
        public final pcj<? extends C22421c<? extends U>> f107912l;

        public C17401b(gcg0<? super C22421c<T>> gcg0Var, pcj<? extends C22421c<? extends U>> pcjVar) {
            this.f107905e = new are0(gcg0Var);
            wqe0 wqe0Var = new wqe0();
            this.f107911k = wqe0Var;
            this.f107912l = pcjVar;
            m129866b(wqe0Var);
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            m129868e(Long.MAX_VALUE);
        }

        /* JADX INFO: renamed from: g */
        public void m133628g() {
            bb50<T> bb50Var = this.f107907g;
            this.f107907g = null;
            this.f107908h = null;
            if (bb50Var != null) {
                bb50Var.onCompleted();
            }
            this.f107905e.onCompleted();
            unsubscribe();
        }

        /* JADX INFO: renamed from: h */
        public void m133629h() {
            UnicastSubject unicastSubjectM222755b = UnicastSubject.m222755b();
            this.f107907g = unicastSubjectM222755b;
            this.f107908h = unicastSubjectM222755b;
            try {
                C22421c<? extends U> c22421cCall = this.f107912l.call();
                C17400a c17400a = new C17400a(this);
                this.f107911k.m207511b(c17400a);
                c22421cCall.unsafeSubscribe(c17400a);
            } catch (Throwable th) {
                this.f107905e.onError(th);
                unsubscribe();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: i */
        public void m133630i(List<Object> list) {
            if (list == null) {
                return;
            }
            for (Object obj : list) {
                if (obj == h560.f107900b) {
                    m133633l();
                } else {
                    NotificationLite<Object> notificationLite = h560.f107901c;
                    if (notificationLite.m222588h(obj)) {
                        m133632k(notificationLite.m222585d(obj));
                        return;
                    } else {
                        if (notificationLite.m222587g(obj)) {
                            m133628g();
                            return;
                        }
                        m133631j(obj);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public void m133631j(T t) {
            bb50<T> bb50Var = this.f107907g;
            if (bb50Var != null) {
                bb50Var.onNext(t);
            }
        }

        /* JADX INFO: renamed from: k */
        public void m133632k(Throwable th) {
            bb50<T> bb50Var = this.f107907g;
            this.f107907g = null;
            this.f107908h = null;
            if (bb50Var != null) {
                bb50Var.onError(th);
            }
            this.f107905e.onError(th);
            unsubscribe();
        }

        /* JADX INFO: renamed from: l */
        public void m133633l() {
            bb50<T> bb50Var = this.f107907g;
            if (bb50Var != null) {
                bb50Var.onCompleted();
            }
            m133629h();
            this.f107905e.onNext(this.f107908h);
        }

        /* JADX INFO: renamed from: m */
        public void m133634m() throws Throwable {
            synchronized (this.f107906f) {
                try {
                    boolean z = this.f107909i;
                    List<Object> list = this.f107910j;
                    if (z) {
                        if (list == null) {
                            this.f107910j = new ArrayList();
                        }
                        this.f107910j.add(h560.f107900b);
                        return;
                    }
                    this.f107910j = null;
                    boolean z2 = true;
                    this.f107909i = true;
                    boolean z3 = true;
                    while (true) {
                        try {
                            m133630i(list);
                            if (z3) {
                                m133633l();
                                z3 = false;
                            }
                            try {
                                synchronized (this.f107906f) {
                                    try {
                                        List<Object> list2 = this.f107910j;
                                        this.f107910j = null;
                                        if (list2 == null) {
                                            this.f107909i = false;
                                            return;
                                        } else {
                                            if (this.f107905e.isUnsubscribed()) {
                                                synchronized (this.f107906f) {
                                                    this.f107909i = false;
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
                                                synchronized (this.f107906f) {
                                                    this.f107909i = false;
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

        @Override // p153l.bb50
        public void onCompleted() {
            synchronized (this.f107906f) {
                try {
                    boolean z = this.f107909i;
                    List<Object> list = this.f107910j;
                    if (z) {
                        if (list == null) {
                            this.f107910j = new ArrayList();
                        }
                        this.f107910j.add(h560.f107901c.m222583b());
                        return;
                    }
                    this.f107910j = null;
                    this.f107909i = true;
                    try {
                        m133630i(list);
                        m133628g();
                    } catch (Throwable th) {
                        m133632k(th);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            synchronized (this.f107906f) {
                try {
                    if (this.f107909i) {
                        this.f107910j = Collections.singletonList(h560.f107901c.m222584c(th));
                        return;
                    }
                    this.f107910j = null;
                    this.f107909i = true;
                    m133632k(th);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) throws Throwable {
            synchronized (this.f107906f) {
                try {
                    boolean z = this.f107909i;
                    List<Object> list = this.f107910j;
                    if (z) {
                        if (list == null) {
                            this.f107910j = new ArrayList();
                        }
                        this.f107910j.add(t);
                        return;
                    }
                    this.f107910j = null;
                    boolean z2 = true;
                    this.f107909i = true;
                    boolean z3 = true;
                    while (true) {
                        try {
                            m133630i(list);
                            if (z3) {
                                m133631j(t);
                                z3 = false;
                            }
                            try {
                                synchronized (this.f107906f) {
                                    try {
                                        List<Object> list2 = this.f107910j;
                                        this.f107910j = null;
                                        if (list2 == null) {
                                            this.f107909i = false;
                                            return;
                                        } else {
                                            if (this.f107905e.isUnsubscribed()) {
                                                synchronized (this.f107906f) {
                                                    this.f107909i = false;
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
                                                synchronized (this.f107906f) {
                                                    this.f107909i = false;
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

    public h560(pcj<? extends C22421c<? extends U>> pcjVar) {
        this.f107902a = pcjVar;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super C22421c<T>> gcg0Var) throws Throwable {
        C17401b c17401b = new C17401b(gcg0Var, this.f107902a);
        gcg0Var.m129866b(c17401b);
        c17401b.m133634m();
        return c17401b;
    }
}
