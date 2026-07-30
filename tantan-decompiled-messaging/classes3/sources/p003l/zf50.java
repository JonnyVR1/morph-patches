package p003l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p014rx.C1099c;
import p014rx.subjects.C1186b;
import p014rx.subscriptions.RefCountSubscription;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class zf50<T1, T2, D1, D2, R> implements C1099c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C1099c<T1> f9330a;

    /* JADX INFO: renamed from: b */
    public final C1099c<T2> f9331b;

    /* JADX INFO: renamed from: c */
    public final w9j<? super T1, ? extends C1099c<D1>> f9332c;

    /* JADX INFO: renamed from: d */
    public final w9j<? super T2, ? extends C1099c<D2>> f9333d;

    /* JADX INFO: renamed from: e */
    public final x9j<? super T1, ? super C1099c<T2>, ? extends R> f9334e;

    /* JADX INFO: renamed from: l.zf50$a */
    public final class C0676a implements c4g0 {

        /* JADX INFO: renamed from: a */
        public final RefCountSubscription f9335a;

        /* JADX INFO: renamed from: b */
        public final z3g0<? super R> f9336b;

        /* JADX INFO: renamed from: c */
        public final bs5 f9337c;

        /* JADX INFO: renamed from: e */
        public int f9339e;

        /* JADX INFO: renamed from: f */
        public int f9340f;

        /* JADX INFO: renamed from: i */
        public boolean f9343i;

        /* JADX INFO: renamed from: j */
        public boolean f9344j;

        /* JADX INFO: renamed from: d */
        public final Object f9338d = new Object();

        /* JADX INFO: renamed from: g */
        public final Map<Integer, m250<T2>> f9341g = new HashMap();

        /* JADX INFO: renamed from: h */
        public final Map<Integer, T2> f9342h = new HashMap();

        /* JADX INFO: renamed from: l.zf50$a$a */
        public final class a extends z3g0<D1> {

            /* JADX INFO: renamed from: e */
            public final int f9346e;

            /* JADX INFO: renamed from: f */
            public boolean f9347f = true;

            public a(int i) {
                this.f9346e = i;
            }

            @Override // p003l.m250
            public void onCompleted() {
                m250<T2> m250VarRemove;
                if (this.f9347f) {
                    this.f9347f = false;
                    synchronized (C0676a.this.f9338d) {
                        m250VarRemove = C0676a.this.f9341g.remove(Integer.valueOf(this.f9346e));
                    }
                    if (m250VarRemove != null) {
                        m250VarRemove.onCompleted();
                    }
                    C0676a.this.f9337c.m3167d(this);
                }
            }

            @Override // p003l.m250
            public void onError(Throwable th) {
                C0676a.this.m9419c(th);
            }

            @Override // p003l.m250
            public void onNext(D1 d1) {
                onCompleted();
            }
        }

        /* JADX INFO: renamed from: l.zf50$a$b */
        public final class b extends z3g0<T1> {
            public b() {
            }

            @Override // p003l.m250
            public void onCompleted() {
                ArrayList arrayList;
                synchronized (C0676a.this.f9338d) {
                    try {
                        C0676a c0676a = C0676a.this;
                        c0676a.f9343i = true;
                        if (c0676a.f9344j) {
                            arrayList = new ArrayList(C0676a.this.f9341g.values());
                            C0676a.this.f9341g.clear();
                            C0676a.this.f9342h.clear();
                        } else {
                            arrayList = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C0676a.this.m9417a(arrayList);
            }

            @Override // p003l.m250
            public void onError(Throwable th) {
                C0676a.this.m9418b(th);
            }

            @Override // p003l.m250
            public void onNext(T1 t1) {
                int i;
                ArrayList arrayList;
                try {
                    C1186b c1186bM9978b = C1186b.m9978b();
                    tie0 tie0Var = new tie0(c1186bM9978b);
                    synchronized (C0676a.this.f9338d) {
                        C0676a c0676a = C0676a.this;
                        i = c0676a.f9339e;
                        c0676a.f9339e = i + 1;
                        c0676a.f9341g.put(Integer.valueOf(i), tie0Var);
                    }
                    C1099c c1099cCreate = C1099c.create(new C0677b(c1186bM9978b, C0676a.this.f9335a));
                    C1099c<D1> c1099cCall = zf50.this.f9332c.call(t1);
                    a aVar = C0676a.this.new a(i);
                    C0676a.this.f9337c.m3164a(aVar);
                    c1099cCall.unsafeSubscribe(aVar);
                    R rCall = zf50.this.f9334e.call(t1, c1099cCreate);
                    synchronized (C0676a.this.f9338d) {
                        arrayList = new ArrayList(C0676a.this.f9342h.values());
                    }
                    C0676a.this.f9336b.onNext(rCall);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        tie0Var.onNext(it.next());
                    }
                } catch (Throwable th) {
                    f5f.m3965f(th, this);
                }
            }
        }

        /* JADX INFO: renamed from: l.zf50$a$c */
        public final class c extends z3g0<D2> {

            /* JADX INFO: renamed from: e */
            public final int f9350e;

            /* JADX INFO: renamed from: f */
            public boolean f9351f = true;

            public c(int i) {
                this.f9350e = i;
            }

            @Override // p003l.m250
            public void onCompleted() {
                if (this.f9351f) {
                    this.f9351f = false;
                    synchronized (C0676a.this.f9338d) {
                        C0676a.this.f9342h.remove(Integer.valueOf(this.f9350e));
                    }
                    C0676a.this.f9337c.m3167d(this);
                }
            }

            @Override // p003l.m250
            public void onError(Throwable th) {
                C0676a.this.m9419c(th);
            }

            @Override // p003l.m250
            public void onNext(D2 d2) {
                onCompleted();
            }
        }

        /* JADX INFO: renamed from: l.zf50$a$d */
        public final class d extends z3g0<T2> {
            public d() {
            }

            @Override // p003l.m250
            public void onCompleted() {
                ArrayList arrayList;
                synchronized (C0676a.this.f9338d) {
                    try {
                        C0676a c0676a = C0676a.this;
                        c0676a.f9344j = true;
                        if (c0676a.f9343i) {
                            arrayList = new ArrayList(C0676a.this.f9341g.values());
                            C0676a.this.f9341g.clear();
                            C0676a.this.f9342h.clear();
                        } else {
                            arrayList = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C0676a.this.m9417a(arrayList);
            }

            @Override // p003l.m250
            public void onError(Throwable th) {
                C0676a.this.m9418b(th);
            }

            @Override // p003l.m250
            public void onNext(T2 t2) {
                int i;
                ArrayList arrayList;
                try {
                    synchronized (C0676a.this.f9338d) {
                        C0676a c0676a = C0676a.this;
                        i = c0676a.f9340f;
                        c0676a.f9340f = i + 1;
                        c0676a.f9342h.put(Integer.valueOf(i), t2);
                    }
                    C1099c<D2> c1099cCall = zf50.this.f9333d.call(t2);
                    c cVar = C0676a.this.new c(i);
                    C0676a.this.f9337c.m3164a(cVar);
                    c1099cCall.unsafeSubscribe(cVar);
                    synchronized (C0676a.this.f9338d) {
                        arrayList = new ArrayList(C0676a.this.f9341g.values());
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((m250) it.next()).onNext(t2);
                    }
                } catch (Throwable th) {
                    f5f.m3965f(th, this);
                }
            }
        }

        public C0676a(z3g0<? super R> z3g0Var) {
            this.f9336b = z3g0Var;
            bs5 bs5Var = new bs5();
            this.f9337c = bs5Var;
            this.f9335a = new RefCountSubscription(bs5Var);
        }

        /* JADX INFO: renamed from: a */
        public void m9417a(List<m250<T2>> list) {
            if (list != null) {
                Iterator<m250<T2>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onCompleted();
                }
                this.f9336b.onCompleted();
                this.f9335a.unsubscribe();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m9418b(Throwable th) {
            ArrayList arrayList;
            synchronized (this.f9338d) {
                arrayList = new ArrayList(this.f9341g.values());
                this.f9341g.clear();
                this.f9342h.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((m250) it.next()).onError(th);
            }
            this.f9336b.onError(th);
            this.f9335a.unsubscribe();
        }

        /* JADX INFO: renamed from: c */
        public void m9419c(Throwable th) {
            synchronized (this.f9338d) {
                this.f9341g.clear();
                this.f9342h.clear();
            }
            this.f9336b.onError(th);
            this.f9335a.unsubscribe();
        }

        /* JADX INFO: renamed from: d */
        public void m9420d() {
            b bVar = new b();
            d dVar = new d();
            this.f9337c.m3164a(bVar);
            this.f9337c.m3164a(dVar);
            zf50.this.f9330a.unsafeSubscribe(bVar);
            zf50.this.f9331b.unsafeSubscribe(dVar);
        }

        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return this.f9335a.isUnsubscribed();
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
            this.f9335a.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: l.zf50$b */
    public static final class C0677b<T> implements C1099c.a<T> {

        /* JADX INFO: renamed from: a */
        public final RefCountSubscription f9354a;

        /* JADX INFO: renamed from: b */
        public final C1099c<T> f9355b;

        /* JADX INFO: renamed from: l.zf50$b$a */
        public final class a extends z3g0<T> {

            /* JADX INFO: renamed from: e */
            public final z3g0<? super T> f9356e;

            /* JADX INFO: renamed from: f */
            public final c4g0 f9357f;

            public a(z3g0<? super T> z3g0Var, c4g0 c4g0Var) {
                super(z3g0Var);
                this.f9356e = z3g0Var;
                this.f9357f = c4g0Var;
            }

            @Override // p003l.m250
            public void onCompleted() {
                this.f9356e.onCompleted();
                this.f9357f.unsubscribe();
            }

            @Override // p003l.m250
            public void onError(Throwable th) {
                this.f9356e.onError(th);
                this.f9357f.unsubscribe();
            }

            @Override // p003l.m250
            public void onNext(T t) {
                this.f9356e.onNext(t);
            }
        }

        public C0677b(C1099c<T> c1099c, RefCountSubscription refCountSubscription) {
            this.f9354a = refCountSubscription;
            this.f9355b = c1099c;
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            c4g0 c4g0VarM9980a = this.f9354a.m9980a();
            a aVar = new a(z3g0Var, c4g0VarM9980a);
            aVar.m9240b(c4g0VarM9980a);
            this.f9355b.unsafeSubscribe(aVar);
        }
    }

    public zf50(C1099c<T1> c1099c, C1099c<T2> c1099c2, w9j<? super T1, ? extends C1099c<D1>> w9jVar, w9j<? super T2, ? extends C1099c<D2>> w9jVar2, x9j<? super T1, ? super C1099c<T2>, ? extends R> x9jVar) {
        this.f9330a = c1099c;
        this.f9331b = c1099c2;
        this.f9332c = w9jVar;
        this.f9333d = w9jVar2;
        this.f9334e = x9jVar;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super R> z3g0Var) {
        C0676a c0676a = new C0676a(new vie0(z3g0Var));
        z3g0Var.m9240b(c0676a);
        c0676a.m9420d();
    }
}
