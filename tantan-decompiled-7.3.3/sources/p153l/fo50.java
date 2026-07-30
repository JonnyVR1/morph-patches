package p153l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p137rx.subscriptions.RefCountSubscription;

/* JADX INFO: loaded from: classes3.dex */
public final class fo50<T1, T2, D1, D2, R> implements C22421c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C22421c<T1> f100010a;

    /* JADX INFO: renamed from: b */
    public final C22421c<T2> f100011b;

    /* JADX INFO: renamed from: c */
    public final qcj<? super T1, ? extends C22421c<D1>> f100012c;

    /* JADX INFO: renamed from: d */
    public final qcj<? super T2, ? extends C22421c<D2>> f100013d;

    /* JADX INFO: renamed from: e */
    public final rcj<? super T1, ? super C22421c<T2>, ? extends R> f100014e;

    /* JADX INFO: renamed from: l.fo50$a */
    public final class C17023a implements kcg0 {

        /* JADX INFO: renamed from: a */
        public final RefCountSubscription f100015a;

        /* JADX INFO: renamed from: b */
        public final gcg0<? super R> f100016b;

        /* JADX INFO: renamed from: c */
        public final ft5 f100017c;

        /* JADX INFO: renamed from: e */
        public int f100019e;

        /* JADX INFO: renamed from: f */
        public int f100020f;

        /* JADX INFO: renamed from: i */
        public boolean f100023i;

        /* JADX INFO: renamed from: j */
        public boolean f100024j;

        /* JADX INFO: renamed from: d */
        public final Object f100018d = new Object();

        /* JADX INFO: renamed from: g */
        public final Map<Integer, bb50<T2>> f100021g = new HashMap();

        /* JADX INFO: renamed from: h */
        public final Map<Integer, T2> f100022h = new HashMap();

        /* JADX INFO: renamed from: l.fo50$a$a */
        public final class a extends gcg0<D1> {

            /* JADX INFO: renamed from: e */
            public final int f100026e;

            /* JADX INFO: renamed from: f */
            public boolean f100027f = true;

            public a(int i) {
                this.f100026e = i;
            }

            @Override // p153l.bb50
            public void onCompleted() {
                bb50<T2> bb50VarRemove;
                if (this.f100027f) {
                    this.f100027f = false;
                    synchronized (C17023a.this.f100018d) {
                        bb50VarRemove = C17023a.this.f100021g.remove(Integer.valueOf(this.f100026e));
                    }
                    if (bb50VarRemove != null) {
                        bb50VarRemove.onCompleted();
                    }
                    C17023a.this.f100017c.m127300d(this);
                }
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                C17023a.this.m126446c(th);
            }

            @Override // p153l.bb50
            public void onNext(D1 d1) {
                onCompleted();
            }
        }

        /* JADX INFO: renamed from: l.fo50$a$b */
        public final class b extends gcg0<T1> {
            public b() {
            }

            @Override // p153l.bb50
            public void onCompleted() {
                ArrayList arrayList;
                synchronized (C17023a.this.f100018d) {
                    try {
                        C17023a c17023a = C17023a.this;
                        c17023a.f100023i = true;
                        if (c17023a.f100024j) {
                            arrayList = new ArrayList(C17023a.this.f100021g.values());
                            C17023a.this.f100021g.clear();
                            C17023a.this.f100022h.clear();
                        } else {
                            arrayList = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C17023a.this.m126444a(arrayList);
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                C17023a.this.m126445b(th);
            }

            @Override // p153l.bb50
            public void onNext(T1 t1) {
                int i;
                ArrayList arrayList;
                try {
                    C22508b c22508bM222767b = C22508b.m222767b();
                    yqe0 yqe0Var = new yqe0(c22508bM222767b);
                    synchronized (C17023a.this.f100018d) {
                        C17023a c17023a = C17023a.this;
                        i = c17023a.f100019e;
                        c17023a.f100019e = i + 1;
                        c17023a.f100021g.put(Integer.valueOf(i), yqe0Var);
                    }
                    C22421c c22421cCreate = C22421c.create(new C17024b(c22508bM222767b, C17023a.this.f100015a));
                    C22421c<D1> c22421cCall = fo50.this.f100012c.call(t1);
                    a aVar = C17023a.this.new a(i);
                    C17023a.this.f100017c.m127297a(aVar);
                    c22421cCall.unsafeSubscribe(aVar);
                    R rCall = fo50.this.f100014e.call(t1, c22421cCreate);
                    synchronized (C17023a.this.f100018d) {
                        arrayList = new ArrayList(C17023a.this.f100022h.values());
                    }
                    C17023a.this.f100016b.onNext(rCall);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        yqe0Var.onNext(it.next());
                    }
                } catch (Throwable th) {
                    j6f.m143664f(th, this);
                }
            }
        }

        /* JADX INFO: renamed from: l.fo50$a$c */
        public final class c extends gcg0<D2> {

            /* JADX INFO: renamed from: e */
            public final int f100030e;

            /* JADX INFO: renamed from: f */
            public boolean f100031f = true;

            public c(int i) {
                this.f100030e = i;
            }

            @Override // p153l.bb50
            public void onCompleted() {
                if (this.f100031f) {
                    this.f100031f = false;
                    synchronized (C17023a.this.f100018d) {
                        C17023a.this.f100022h.remove(Integer.valueOf(this.f100030e));
                    }
                    C17023a.this.f100017c.m127300d(this);
                }
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                C17023a.this.m126446c(th);
            }

            @Override // p153l.bb50
            public void onNext(D2 d2) {
                onCompleted();
            }
        }

        /* JADX INFO: renamed from: l.fo50$a$d */
        public final class d extends gcg0<T2> {
            public d() {
            }

            @Override // p153l.bb50
            public void onCompleted() {
                ArrayList arrayList;
                synchronized (C17023a.this.f100018d) {
                    try {
                        C17023a c17023a = C17023a.this;
                        c17023a.f100024j = true;
                        if (c17023a.f100023i) {
                            arrayList = new ArrayList(C17023a.this.f100021g.values());
                            C17023a.this.f100021g.clear();
                            C17023a.this.f100022h.clear();
                        } else {
                            arrayList = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C17023a.this.m126444a(arrayList);
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                C17023a.this.m126445b(th);
            }

            @Override // p153l.bb50
            public void onNext(T2 t2) {
                int i;
                ArrayList arrayList;
                try {
                    synchronized (C17023a.this.f100018d) {
                        C17023a c17023a = C17023a.this;
                        i = c17023a.f100020f;
                        c17023a.f100020f = i + 1;
                        c17023a.f100022h.put(Integer.valueOf(i), t2);
                    }
                    C22421c<D2> c22421cCall = fo50.this.f100013d.call(t2);
                    c cVar = C17023a.this.new c(i);
                    C17023a.this.f100017c.m127297a(cVar);
                    c22421cCall.unsafeSubscribe(cVar);
                    synchronized (C17023a.this.f100018d) {
                        arrayList = new ArrayList(C17023a.this.f100021g.values());
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((bb50) it.next()).onNext(t2);
                    }
                } catch (Throwable th) {
                    j6f.m143664f(th, this);
                }
            }
        }

        public C17023a(gcg0<? super R> gcg0Var) {
            this.f100016b = gcg0Var;
            ft5 ft5Var = new ft5();
            this.f100017c = ft5Var;
            this.f100015a = new RefCountSubscription(ft5Var);
        }

        /* JADX INFO: renamed from: a */
        public void m126444a(List<bb50<T2>> list) {
            if (list != null) {
                Iterator<bb50<T2>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onCompleted();
                }
                this.f100016b.onCompleted();
                this.f100015a.unsubscribe();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m126445b(Throwable th) {
            ArrayList arrayList;
            synchronized (this.f100018d) {
                arrayList = new ArrayList(this.f100021g.values());
                this.f100021g.clear();
                this.f100022h.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((bb50) it.next()).onError(th);
            }
            this.f100016b.onError(th);
            this.f100015a.unsubscribe();
        }

        /* JADX INFO: renamed from: c */
        public void m126446c(Throwable th) {
            synchronized (this.f100018d) {
                this.f100021g.clear();
                this.f100022h.clear();
            }
            this.f100016b.onError(th);
            this.f100015a.unsubscribe();
        }

        /* JADX INFO: renamed from: d */
        public void m126447d() {
            b bVar = new b();
            d dVar = new d();
            this.f100017c.m127297a(bVar);
            this.f100017c.m127297a(dVar);
            fo50.this.f100010a.unsafeSubscribe(bVar);
            fo50.this.f100011b.unsafeSubscribe(dVar);
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return this.f100015a.isUnsubscribed();
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            this.f100015a.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: l.fo50$b */
    public static final class C17024b<T> implements C22421c.a<T> {

        /* JADX INFO: renamed from: a */
        public final RefCountSubscription f100034a;

        /* JADX INFO: renamed from: b */
        public final C22421c<T> f100035b;

        /* JADX INFO: renamed from: l.fo50$b$a */
        public final class a extends gcg0<T> {

            /* JADX INFO: renamed from: e */
            public final gcg0<? super T> f100036e;

            /* JADX INFO: renamed from: f */
            public final kcg0 f100037f;

            public a(gcg0<? super T> gcg0Var, kcg0 kcg0Var) {
                super(gcg0Var);
                this.f100036e = gcg0Var;
                this.f100037f = kcg0Var;
            }

            @Override // p153l.bb50
            public void onCompleted() {
                this.f100036e.onCompleted();
                this.f100037f.unsubscribe();
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                this.f100036e.onError(th);
                this.f100037f.unsubscribe();
            }

            @Override // p153l.bb50
            public void onNext(T t) {
                this.f100036e.onNext(t);
            }
        }

        public C17024b(C22421c<T> c22421c, RefCountSubscription refCountSubscription) {
            this.f100034a = refCountSubscription;
            this.f100035b = c22421c;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super T> gcg0Var) {
            kcg0 kcg0VarM222769a = this.f100034a.m222769a();
            a aVar = new a(gcg0Var, kcg0VarM222769a);
            aVar.m129866b(kcg0VarM222769a);
            this.f100035b.unsafeSubscribe(aVar);
        }
    }

    public fo50(C22421c<T1> c22421c, C22421c<T2> c22421c2, qcj<? super T1, ? extends C22421c<D1>> qcjVar, qcj<? super T2, ? extends C22421c<D2>> qcjVar2, rcj<? super T1, ? super C22421c<T2>, ? extends R> rcjVar) {
        this.f100010a = c22421c;
        this.f100011b = c22421c2;
        this.f100012c = qcjVar;
        this.f100013d = qcjVar2;
        this.f100014e = rcjVar;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super R> gcg0Var) {
        C17023a c17023a = new C17023a(new are0(gcg0Var));
        gcg0Var.m129866b(c17023a);
        c17023a.m126447d();
    }
}
