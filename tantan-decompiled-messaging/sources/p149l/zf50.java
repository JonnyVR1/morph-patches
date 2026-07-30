package p149l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p133rx.subscriptions.RefCountSubscription;

/* JADX INFO: loaded from: classes3.dex */
public final class zf50<T1, T2, D1, D2, R> implements C22306c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C22306c<T1> f202883a;

    /* JADX INFO: renamed from: b */
    public final C22306c<T2> f202884b;

    /* JADX INFO: renamed from: c */
    public final w9j<? super T1, ? extends C22306c<D1>> f202885c;

    /* JADX INFO: renamed from: d */
    public final w9j<? super T2, ? extends C22306c<D2>> f202886d;

    /* JADX INFO: renamed from: e */
    public final x9j<? super T1, ? super C22306c<T2>, ? extends R> f202887e;

    /* JADX INFO: renamed from: l.zf50$a */
    public final class C21684a implements c4g0 {

        /* JADX INFO: renamed from: a */
        public final RefCountSubscription f202888a;

        /* JADX INFO: renamed from: b */
        public final z3g0<? super R> f202889b;

        /* JADX INFO: renamed from: c */
        public final bs5 f202890c;

        /* JADX INFO: renamed from: e */
        public int f202892e;

        /* JADX INFO: renamed from: f */
        public int f202893f;

        /* JADX INFO: renamed from: i */
        public boolean f202896i;

        /* JADX INFO: renamed from: j */
        public boolean f202897j;

        /* JADX INFO: renamed from: d */
        public final Object f202891d = new Object();

        /* JADX INFO: renamed from: g */
        public final Map<Integer, m250<T2>> f202894g = new HashMap();

        /* JADX INFO: renamed from: h */
        public final Map<Integer, T2> f202895h = new HashMap();

        /* JADX INFO: renamed from: l.zf50$a$a */
        public final class a extends z3g0<D1> {

            /* JADX INFO: renamed from: e */
            public final int f202899e;

            /* JADX INFO: renamed from: f */
            public boolean f202900f = true;

            public a(int i) {
                this.f202899e = i;
            }

            @Override // p149l.m250
            public void onCompleted() {
                m250<T2> m250VarRemove;
                if (this.f202900f) {
                    this.f202900f = false;
                    synchronized (C21684a.this.f202891d) {
                        m250VarRemove = C21684a.this.f202894g.remove(Integer.valueOf(this.f202899e));
                    }
                    if (m250VarRemove != null) {
                        m250VarRemove.onCompleted();
                    }
                    C21684a.this.f202890c.m103658d(this);
                }
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                C21684a.this.m218448c(th);
            }

            @Override // p149l.m250
            public void onNext(D1 d1) {
                onCompleted();
            }
        }

        /* JADX INFO: renamed from: l.zf50$a$b */
        public final class b extends z3g0<T1> {
            public b() {
            }

            @Override // p149l.m250
            public void onCompleted() {
                ArrayList arrayList;
                synchronized (C21684a.this.f202891d) {
                    try {
                        C21684a c21684a = C21684a.this;
                        c21684a.f202896i = true;
                        if (c21684a.f202897j) {
                            arrayList = new ArrayList(C21684a.this.f202894g.values());
                            C21684a.this.f202894g.clear();
                            C21684a.this.f202895h.clear();
                        } else {
                            arrayList = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C21684a.this.m218446a(arrayList);
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                C21684a.this.m218447b(th);
            }

            @Override // p149l.m250
            public void onNext(T1 t1) {
                int i;
                ArrayList arrayList;
                try {
                    C22393b c22393bM221521b = C22393b.m221521b();
                    tie0 tie0Var = new tie0(c22393bM221521b);
                    synchronized (C21684a.this.f202891d) {
                        C21684a c21684a = C21684a.this;
                        i = c21684a.f202892e;
                        c21684a.f202892e = i + 1;
                        c21684a.f202894g.put(Integer.valueOf(i), tie0Var);
                    }
                    C22306c c22306cCreate = C22306c.create(new C21685b(c22393bM221521b, C21684a.this.f202888a));
                    C22306c<D1> c22306cCall = zf50.this.f202885c.call(t1);
                    a aVar = C21684a.this.new a(i);
                    C21684a.this.f202890c.m103655a(aVar);
                    c22306cCall.unsafeSubscribe(aVar);
                    R rCall = zf50.this.f202887e.call(t1, c22306cCreate);
                    synchronized (C21684a.this.f202891d) {
                        arrayList = new ArrayList(C21684a.this.f202895h.values());
                    }
                    C21684a.this.f202889b.onNext(rCall);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        tie0Var.onNext(it.next());
                    }
                } catch (Throwable th) {
                    f5f.m119492f(th, this);
                }
            }
        }

        /* JADX INFO: renamed from: l.zf50$a$c */
        public final class c extends z3g0<D2> {

            /* JADX INFO: renamed from: e */
            public final int f202903e;

            /* JADX INFO: renamed from: f */
            public boolean f202904f = true;

            public c(int i) {
                this.f202903e = i;
            }

            @Override // p149l.m250
            public void onCompleted() {
                if (this.f202904f) {
                    this.f202904f = false;
                    synchronized (C21684a.this.f202891d) {
                        C21684a.this.f202895h.remove(Integer.valueOf(this.f202903e));
                    }
                    C21684a.this.f202890c.m103658d(this);
                }
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                C21684a.this.m218448c(th);
            }

            @Override // p149l.m250
            public void onNext(D2 d2) {
                onCompleted();
            }
        }

        /* JADX INFO: renamed from: l.zf50$a$d */
        public final class d extends z3g0<T2> {
            public d() {
            }

            @Override // p149l.m250
            public void onCompleted() {
                ArrayList arrayList;
                synchronized (C21684a.this.f202891d) {
                    try {
                        C21684a c21684a = C21684a.this;
                        c21684a.f202897j = true;
                        if (c21684a.f202896i) {
                            arrayList = new ArrayList(C21684a.this.f202894g.values());
                            C21684a.this.f202894g.clear();
                            C21684a.this.f202895h.clear();
                        } else {
                            arrayList = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C21684a.this.m218446a(arrayList);
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                C21684a.this.m218447b(th);
            }

            @Override // p149l.m250
            public void onNext(T2 t2) {
                int i;
                ArrayList arrayList;
                try {
                    synchronized (C21684a.this.f202891d) {
                        C21684a c21684a = C21684a.this;
                        i = c21684a.f202893f;
                        c21684a.f202893f = i + 1;
                        c21684a.f202895h.put(Integer.valueOf(i), t2);
                    }
                    C22306c<D2> c22306cCall = zf50.this.f202886d.call(t2);
                    c cVar = C21684a.this.new c(i);
                    C21684a.this.f202890c.m103655a(cVar);
                    c22306cCall.unsafeSubscribe(cVar);
                    synchronized (C21684a.this.f202891d) {
                        arrayList = new ArrayList(C21684a.this.f202894g.values());
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((m250) it.next()).onNext(t2);
                    }
                } catch (Throwable th) {
                    f5f.m119492f(th, this);
                }
            }
        }

        public C21684a(z3g0<? super R> z3g0Var) {
            this.f202889b = z3g0Var;
            bs5 bs5Var = new bs5();
            this.f202890c = bs5Var;
            this.f202888a = new RefCountSubscription(bs5Var);
        }

        /* JADX INFO: renamed from: a */
        public void m218446a(List<m250<T2>> list) {
            if (list != null) {
                Iterator<m250<T2>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onCompleted();
                }
                this.f202889b.onCompleted();
                this.f202888a.unsubscribe();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m218447b(Throwable th) {
            ArrayList arrayList;
            synchronized (this.f202891d) {
                arrayList = new ArrayList(this.f202894g.values());
                this.f202894g.clear();
                this.f202895h.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((m250) it.next()).onError(th);
            }
            this.f202889b.onError(th);
            this.f202888a.unsubscribe();
        }

        /* JADX INFO: renamed from: c */
        public void m218448c(Throwable th) {
            synchronized (this.f202891d) {
                this.f202894g.clear();
                this.f202895h.clear();
            }
            this.f202889b.onError(th);
            this.f202888a.unsubscribe();
        }

        /* JADX INFO: renamed from: d */
        public void m218449d() {
            b bVar = new b();
            d dVar = new d();
            this.f202890c.m103655a(bVar);
            this.f202890c.m103655a(dVar);
            zf50.this.f202883a.unsafeSubscribe(bVar);
            zf50.this.f202884b.unsafeSubscribe(dVar);
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return this.f202888a.isUnsubscribed();
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            this.f202888a.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: l.zf50$b */
    public static final class C21685b<T> implements C22306c.a<T> {

        /* JADX INFO: renamed from: a */
        public final RefCountSubscription f202907a;

        /* JADX INFO: renamed from: b */
        public final C22306c<T> f202908b;

        /* JADX INFO: renamed from: l.zf50$b$a */
        public final class a extends z3g0<T> {

            /* JADX INFO: renamed from: e */
            public final z3g0<? super T> f202909e;

            /* JADX INFO: renamed from: f */
            public final c4g0 f202910f;

            public a(z3g0<? super T> z3g0Var, c4g0 c4g0Var) {
                super(z3g0Var);
                this.f202909e = z3g0Var;
                this.f202910f = c4g0Var;
            }

            @Override // p149l.m250
            public void onCompleted() {
                this.f202909e.onCompleted();
                this.f202910f.unsubscribe();
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                this.f202909e.onError(th);
                this.f202910f.unsubscribe();
            }

            @Override // p149l.m250
            public void onNext(T t) {
                this.f202909e.onNext(t);
            }
        }

        public C21685b(C22306c<T> c22306c, RefCountSubscription refCountSubscription) {
            this.f202907a = refCountSubscription;
            this.f202908b = c22306c;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            c4g0 c4g0VarM221523a = this.f202907a.m221523a();
            a aVar = new a(z3g0Var, c4g0VarM221523a);
            aVar.m217046b(c4g0VarM221523a);
            this.f202908b.unsafeSubscribe(aVar);
        }
    }

    public zf50(C22306c<T1> c22306c, C22306c<T2> c22306c2, w9j<? super T1, ? extends C22306c<D1>> w9jVar, w9j<? super T2, ? extends C22306c<D2>> w9jVar2, x9j<? super T1, ? super C22306c<T2>, ? extends R> x9jVar) {
        this.f202883a = c22306c;
        this.f202884b = c22306c2;
        this.f202885c = w9jVar;
        this.f202886d = w9jVar2;
        this.f202887e = x9jVar;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super R> z3g0Var) {
        C21684a c21684a = new C21684a(new vie0(z3g0Var));
        z3g0Var.m217046b(c21684a);
        c21684a.m218449d();
    }
}
