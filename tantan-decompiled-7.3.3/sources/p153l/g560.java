package p153l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p137rx.C22421c;
import p137rx.internal.operators.NotificationLite;
import p137rx.subjects.UnicastSubject;

/* JADX INFO: loaded from: classes3.dex */
public final class g560<T, U> implements C22421c.c<C22421c<T>, T> {

    /* JADX INFO: renamed from: b */
    public static final Object f102283b = new Object();

    /* JADX INFO: renamed from: c */
    public static final NotificationLite<Object> f102284c = NotificationLite.m222581f();

    /* JADX INFO: renamed from: a */
    public final C22421c<U> f102285a;

    /* JADX INFO: renamed from: l.g560$a */
    public static final class C17155a<T, U> extends gcg0<U> {

        /* JADX INFO: renamed from: e */
        public final C17156b<T> f102286e;

        public C17155a(C17156b<T> c17156b) {
            this.f102286e = c17156b;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            m129868e(Long.MAX_VALUE);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f102286e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f102286e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(U u) throws Throwable {
            this.f102286e.m129042m();
        }
    }

    /* JADX INFO: renamed from: l.g560$b */
    public static final class C17156b<T> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super C22421c<T>> f102287e;

        /* JADX INFO: renamed from: f */
        public final Object f102288f = new Object();

        /* JADX INFO: renamed from: g */
        public bb50<T> f102289g;

        /* JADX INFO: renamed from: h */
        public C22421c<T> f102290h;

        /* JADX INFO: renamed from: i */
        public boolean f102291i;

        /* JADX INFO: renamed from: j */
        public List<Object> f102292j;

        public C17156b(gcg0<? super C22421c<T>> gcg0Var) {
            this.f102287e = new are0(gcg0Var);
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            m129868e(Long.MAX_VALUE);
        }

        /* JADX INFO: renamed from: g */
        public void m129036g() {
            bb50<T> bb50Var = this.f102289g;
            this.f102289g = null;
            this.f102290h = null;
            if (bb50Var != null) {
                bb50Var.onCompleted();
            }
            this.f102287e.onCompleted();
            unsubscribe();
        }

        /* JADX INFO: renamed from: h */
        public void m129037h() {
            UnicastSubject unicastSubjectM222755b = UnicastSubject.m222755b();
            this.f102289g = unicastSubjectM222755b;
            this.f102290h = unicastSubjectM222755b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: i */
        public void m129038i(List<Object> list) {
            if (list == null) {
                return;
            }
            for (Object obj : list) {
                if (obj == g560.f102283b) {
                    m129041l();
                } else {
                    NotificationLite<Object> notificationLite = g560.f102284c;
                    if (notificationLite.m222588h(obj)) {
                        m129040k(notificationLite.m222585d(obj));
                        return;
                    } else {
                        if (notificationLite.m222587g(obj)) {
                            m129036g();
                            return;
                        }
                        m129039j(obj);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public void m129039j(T t) {
            bb50<T> bb50Var = this.f102289g;
            if (bb50Var != null) {
                bb50Var.onNext(t);
            }
        }

        /* JADX INFO: renamed from: k */
        public void m129040k(Throwable th) {
            bb50<T> bb50Var = this.f102289g;
            this.f102289g = null;
            this.f102290h = null;
            if (bb50Var != null) {
                bb50Var.onError(th);
            }
            this.f102287e.onError(th);
            unsubscribe();
        }

        /* JADX INFO: renamed from: l */
        public void m129041l() {
            bb50<T> bb50Var = this.f102289g;
            if (bb50Var != null) {
                bb50Var.onCompleted();
            }
            m129037h();
            this.f102287e.onNext(this.f102290h);
        }

        /* JADX INFO: renamed from: m */
        public void m129042m() throws Throwable {
            synchronized (this.f102288f) {
                try {
                    boolean z = this.f102291i;
                    List<Object> list = this.f102292j;
                    if (z) {
                        if (list == null) {
                            this.f102292j = new ArrayList();
                        }
                        this.f102292j.add(g560.f102283b);
                        return;
                    }
                    this.f102292j = null;
                    boolean z2 = true;
                    this.f102291i = true;
                    boolean z3 = true;
                    while (true) {
                        try {
                            m129038i(list);
                            if (z3) {
                                m129041l();
                                z3 = false;
                            }
                            try {
                                synchronized (this.f102288f) {
                                    try {
                                        List<Object> list2 = this.f102292j;
                                        this.f102292j = null;
                                        if (list2 == null) {
                                            this.f102291i = false;
                                            return;
                                        } else {
                                            if (this.f102287e.isUnsubscribed()) {
                                                synchronized (this.f102288f) {
                                                    this.f102291i = false;
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
                                                synchronized (this.f102288f) {
                                                    this.f102291i = false;
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
            synchronized (this.f102288f) {
                try {
                    boolean z = this.f102291i;
                    List<Object> list = this.f102292j;
                    if (z) {
                        if (list == null) {
                            this.f102292j = new ArrayList();
                        }
                        this.f102292j.add(g560.f102284c.m222583b());
                        return;
                    }
                    this.f102292j = null;
                    this.f102291i = true;
                    try {
                        m129038i(list);
                        m129036g();
                    } catch (Throwable th) {
                        m129040k(th);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            synchronized (this.f102288f) {
                try {
                    if (this.f102291i) {
                        this.f102292j = Collections.singletonList(g560.f102284c.m222584c(th));
                        return;
                    }
                    this.f102292j = null;
                    this.f102291i = true;
                    m129040k(th);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) throws Throwable {
            synchronized (this.f102288f) {
                try {
                    boolean z = this.f102291i;
                    List<Object> list = this.f102292j;
                    if (z) {
                        if (list == null) {
                            this.f102292j = new ArrayList();
                        }
                        this.f102292j.add(t);
                        return;
                    }
                    this.f102292j = null;
                    boolean z2 = true;
                    this.f102291i = true;
                    boolean z3 = true;
                    while (true) {
                        try {
                            m129038i(list);
                            if (z3) {
                                m129039j(t);
                                z3 = false;
                            }
                            try {
                                synchronized (this.f102288f) {
                                    try {
                                        List<Object> list2 = this.f102292j;
                                        this.f102292j = null;
                                        if (list2 == null) {
                                            this.f102291i = false;
                                            return;
                                        } else {
                                            if (this.f102287e.isUnsubscribed()) {
                                                synchronized (this.f102288f) {
                                                    this.f102291i = false;
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
                                                synchronized (this.f102288f) {
                                                    this.f102291i = false;
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

    public g560(C22421c<U> c22421c) {
        this.f102285a = c22421c;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super C22421c<T>> gcg0Var) throws Throwable {
        C17156b c17156b = new C17156b(gcg0Var);
        C17155a c17155a = new C17155a(c17156b);
        gcg0Var.m129866b(c17156b);
        gcg0Var.m129866b(c17155a);
        c17156b.m129042m();
        this.f102285a.unsafeSubscribe(c17155a);
        return c17156b;
    }
}
