package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class tu50<T> implements C22306c.c<List<T>, T> {

    /* JADX INFO: renamed from: a */
    public final long f172131a;

    /* JADX INFO: renamed from: b */
    public final long f172132b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f172133c;

    /* JADX INFO: renamed from: d */
    public final int f172134d;

    /* JADX INFO: renamed from: e */
    public final bud0 f172135e;

    /* JADX INFO: renamed from: l.tu50$a */
    public final class C20277a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super List<T>> f172136e;

        /* JADX INFO: renamed from: f */
        public final bud0.AbstractC15976a f172137f;

        /* JADX INFO: renamed from: g */
        public List<T> f172138g = new ArrayList();

        /* JADX INFO: renamed from: h */
        public boolean f172139h;

        /* JADX INFO: renamed from: l.tu50$a$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p149l.d30
            public void call() {
                C20277a.this.m190682g();
            }
        }

        public C20277a(z3g0<? super List<T>> z3g0Var, bud0.AbstractC15976a abstractC15976a) {
            this.f172136e = z3g0Var;
            this.f172137f = abstractC15976a;
        }

        /* JADX INFO: renamed from: g */
        public void m190682g() {
            synchronized (this) {
                try {
                    if (this.f172139h) {
                        return;
                    }
                    List<T> list = this.f172138g;
                    this.f172138g = new ArrayList();
                    try {
                        this.f172136e.onNext(list);
                    } catch (Throwable th) {
                        f5f.m119492f(th, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m190683h() {
            bud0.AbstractC15976a abstractC15976a = this.f172137f;
            a aVar = new a();
            tu50 tu50Var = tu50.this;
            long j = tu50Var.f172131a;
            abstractC15976a.m103920d(aVar, j, j, tu50Var.f172133c);
        }

        @Override // p149l.m250
        public void onCompleted() {
            try {
                this.f172137f.unsubscribe();
                synchronized (this) {
                    try {
                        if (this.f172139h) {
                            return;
                        }
                        this.f172139h = true;
                        List<T> list = this.f172138g;
                        this.f172138g = null;
                        this.f172136e.onNext(list);
                        this.f172136e.onCompleted();
                        unsubscribe();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                f5f.m119492f(th2, this.f172136e);
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            synchronized (this) {
                try {
                    if (this.f172139h) {
                        return;
                    }
                    this.f172139h = true;
                    this.f172138g = null;
                    this.f172136e.onError(th);
                    unsubscribe();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p149l.m250
        public void onNext(T t) {
            List<T> list;
            synchronized (this) {
                try {
                    if (this.f172139h) {
                        return;
                    }
                    this.f172138g.add(t);
                    if (this.f172138g.size() == tu50.this.f172134d) {
                        list = this.f172138g;
                        this.f172138g = new ArrayList();
                    } else {
                        list = null;
                    }
                    if (list != null) {
                        this.f172136e.onNext(list);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.tu50$b */
    public final class C20278b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super List<T>> f172142e;

        /* JADX INFO: renamed from: f */
        public final bud0.AbstractC15976a f172143f;

        /* JADX INFO: renamed from: g */
        public final List<List<T>> f172144g = new LinkedList();

        /* JADX INFO: renamed from: h */
        public boolean f172145h;

        /* JADX INFO: renamed from: l.tu50$b$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p149l.d30
            public void call() {
                C20278b.this.m190686i();
            }
        }

        /* JADX INFO: renamed from: l.tu50$b$b */
        public class b implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ List f172148a;

            public b(List list) {
                this.f172148a = list;
            }

            @Override // p149l.d30
            public void call() {
                C20278b.this.m190684g(this.f172148a);
            }
        }

        public C20278b(z3g0<? super List<T>> z3g0Var, bud0.AbstractC15976a abstractC15976a) {
            this.f172142e = z3g0Var;
            this.f172143f = abstractC15976a;
        }

        /* JADX INFO: renamed from: g */
        public void m190684g(List<T> list) {
            boolean z;
            synchronized (this) {
                try {
                    if (this.f172145h) {
                        return;
                    }
                    Iterator<List<T>> it = this.f172144g.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        } else if (it.next() == list) {
                            it.remove();
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        try {
                            this.f172142e.onNext(list);
                        } catch (Throwable th) {
                            f5f.m119492f(th, this);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m190685h() {
            bud0.AbstractC15976a abstractC15976a = this.f172143f;
            a aVar = new a();
            tu50 tu50Var = tu50.this;
            long j = tu50Var.f172132b;
            abstractC15976a.m103920d(aVar, j, j, tu50Var.f172133c);
        }

        /* JADX INFO: renamed from: i */
        public void m190686i() {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                try {
                    if (this.f172145h) {
                        return;
                    }
                    this.f172144g.add(arrayList);
                    bud0.AbstractC15976a abstractC15976a = this.f172143f;
                    b bVar = new b(arrayList);
                    tu50 tu50Var = tu50.this;
                    abstractC15976a.mo99202c(bVar, tu50Var.f172131a, tu50Var.f172133c);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
            try {
                synchronized (this) {
                    try {
                        if (this.f172145h) {
                            return;
                        }
                        this.f172145h = true;
                        LinkedList linkedList = new LinkedList(this.f172144g);
                        this.f172144g.clear();
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            this.f172142e.onNext((List) it.next());
                        }
                        this.f172142e.onCompleted();
                        unsubscribe();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                f5f.m119492f(th2, this.f172142e);
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            synchronized (this) {
                try {
                    if (this.f172145h) {
                        return;
                    }
                    this.f172145h = true;
                    this.f172144g.clear();
                    this.f172142e.onError(th);
                    unsubscribe();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p149l.m250
        public void onNext(T t) {
            synchronized (this) {
                try {
                    if (this.f172145h) {
                        return;
                    }
                    Iterator<List<T>> it = this.f172144g.iterator();
                    LinkedList linkedList = null;
                    while (it.hasNext()) {
                        List<T> next = it.next();
                        next.add(t);
                        if (next.size() == tu50.this.f172134d) {
                            it.remove();
                            if (linkedList == null) {
                                linkedList = new LinkedList();
                            }
                            linkedList.add(next);
                        }
                    }
                    if (linkedList != null) {
                        Iterator it2 = linkedList.iterator();
                        while (it2.hasNext()) {
                            this.f172142e.onNext((List) it2.next());
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public tu50(long j, long j2, TimeUnit timeUnit, int i, bud0 bud0Var) {
        this.f172131a = j;
        this.f172132b = j2;
        this.f172133c = timeUnit;
        this.f172134d = i;
        this.f172135e = bud0Var;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super List<T>> z3g0Var) {
        bud0.AbstractC15976a abstractC15976aCreateWorker = this.f172135e.createWorker();
        vie0 vie0Var = new vie0(z3g0Var);
        if (this.f172131a == this.f172132b) {
            C20277a c20277a = new C20277a(vie0Var, abstractC15976aCreateWorker);
            c20277a.m217046b(abstractC15976aCreateWorker);
            z3g0Var.m217046b(c20277a);
            c20277a.m190683h();
            return c20277a;
        }
        C20278b c20278b = new C20278b(vie0Var, abstractC15976aCreateWorker);
        c20278b.m217046b(abstractC15976aCreateWorker);
        z3g0Var.m217046b(c20278b);
        c20278b.m190686i();
        c20278b.m190685h();
        return c20278b;
    }
}
