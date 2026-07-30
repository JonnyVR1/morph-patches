package p003l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class tu50<T> implements C1099c.c<List<T>, T> {

    /* JADX INFO: renamed from: a */
    public final long f7777a;

    /* JADX INFO: renamed from: b */
    public final long f7778b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f7779c;

    /* JADX INFO: renamed from: d */
    public final int f7780d;

    /* JADX INFO: renamed from: e */
    public final bud0 f7781e;

    /* JADX INFO: renamed from: l.tu50$a */
    public final class C0568a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super List<T>> f7782e;

        /* JADX INFO: renamed from: f */
        public final bud0.AbstractC0185a f7783f;

        /* JADX INFO: renamed from: g */
        public List<T> f7784g = new ArrayList();

        /* JADX INFO: renamed from: h */
        public boolean f7785h;

        /* JADX INFO: renamed from: l.tu50$a$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p003l.d30
            public void call() {
                C0568a.this.m8037g();
            }
        }

        public C0568a(z3g0<? super List<T>> z3g0Var, bud0.AbstractC0185a abstractC0185a) {
            this.f7782e = z3g0Var;
            this.f7783f = abstractC0185a;
        }

        /* JADX INFO: renamed from: g */
        public void m8037g() {
            synchronized (this) {
                try {
                    if (this.f7785h) {
                        return;
                    }
                    List<T> list = this.f7784g;
                    this.f7784g = new ArrayList();
                    try {
                        this.f7782e.onNext(list);
                    } catch (Throwable th) {
                        f5f.m3965f(th, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m8038h() {
            bud0.AbstractC0185a abstractC0185a = this.f7783f;
            a aVar = new a();
            tu50 tu50Var = tu50.this;
            long j = tu50Var.f7777a;
            abstractC0185a.m3172d(aVar, j, j, tu50Var.f7779c);
        }

        @Override // p003l.m250
        public void onCompleted() {
            try {
                this.f7783f.unsubscribe();
                synchronized (this) {
                    try {
                        if (this.f7785h) {
                            return;
                        }
                        this.f7785h = true;
                        List<T> list = this.f7784g;
                        this.f7784g = null;
                        this.f7782e.onNext(list);
                        this.f7782e.onCompleted();
                        unsubscribe();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                f5f.m3965f(th2, this.f7782e);
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            synchronized (this) {
                try {
                    if (this.f7785h) {
                        return;
                    }
                    this.f7785h = true;
                    this.f7784g = null;
                    this.f7782e.onError(th);
                    unsubscribe();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p003l.m250
        public void onNext(T t) {
            List<T> list;
            synchronized (this) {
                try {
                    if (this.f7785h) {
                        return;
                    }
                    this.f7784g.add(t);
                    if (this.f7784g.size() == tu50.this.f7780d) {
                        list = this.f7784g;
                        this.f7784g = new ArrayList();
                    } else {
                        list = null;
                    }
                    if (list != null) {
                        this.f7782e.onNext(list);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.tu50$b */
    public final class C0569b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super List<T>> f7788e;

        /* JADX INFO: renamed from: f */
        public final bud0.AbstractC0185a f7789f;

        /* JADX INFO: renamed from: g */
        public final List<List<T>> f7790g = new LinkedList();

        /* JADX INFO: renamed from: h */
        public boolean f7791h;

        /* JADX INFO: renamed from: l.tu50$b$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p003l.d30
            public void call() {
                C0569b.this.m8041i();
            }
        }

        /* JADX INFO: renamed from: l.tu50$b$b */
        public class b implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ List f7794a;

            public b(List list) {
                this.f7794a = list;
            }

            @Override // p003l.d30
            public void call() {
                C0569b.this.m8039g(this.f7794a);
            }
        }

        public C0569b(z3g0<? super List<T>> z3g0Var, bud0.AbstractC0185a abstractC0185a) {
            this.f7788e = z3g0Var;
            this.f7789f = abstractC0185a;
        }

        /* JADX INFO: renamed from: g */
        public void m8039g(List<T> list) {
            boolean z;
            synchronized (this) {
                try {
                    if (this.f7791h) {
                        return;
                    }
                    Iterator<List<T>> it = this.f7790g.iterator();
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
                            this.f7788e.onNext(list);
                        } catch (Throwable th) {
                            f5f.m3965f(th, this);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m8040h() {
            bud0.AbstractC0185a abstractC0185a = this.f7789f;
            a aVar = new a();
            tu50 tu50Var = tu50.this;
            long j = tu50Var.f7778b;
            abstractC0185a.m3172d(aVar, j, j, tu50Var.f7779c);
        }

        /* JADX INFO: renamed from: i */
        public void m8041i() {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                try {
                    if (this.f7791h) {
                        return;
                    }
                    this.f7790g.add(arrayList);
                    bud0.AbstractC0185a abstractC0185a = this.f7789f;
                    b bVar = new b(arrayList);
                    tu50 tu50Var = tu50.this;
                    abstractC0185a.mo2915c(bVar, tu50Var.f7777a, tu50Var.f7779c);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p003l.m250
        public void onCompleted() {
            try {
                synchronized (this) {
                    try {
                        if (this.f7791h) {
                            return;
                        }
                        this.f7791h = true;
                        LinkedList linkedList = new LinkedList(this.f7790g);
                        this.f7790g.clear();
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            this.f7788e.onNext((List) it.next());
                        }
                        this.f7788e.onCompleted();
                        unsubscribe();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                f5f.m3965f(th2, this.f7788e);
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            synchronized (this) {
                try {
                    if (this.f7791h) {
                        return;
                    }
                    this.f7791h = true;
                    this.f7790g.clear();
                    this.f7788e.onError(th);
                    unsubscribe();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p003l.m250
        public void onNext(T t) {
            synchronized (this) {
                try {
                    if (this.f7791h) {
                        return;
                    }
                    Iterator<List<T>> it = this.f7790g.iterator();
                    LinkedList linkedList = null;
                    while (it.hasNext()) {
                        List<T> next = it.next();
                        next.add(t);
                        if (next.size() == tu50.this.f7780d) {
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
                            this.f7788e.onNext((List) it2.next());
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public tu50(long j, long j2, TimeUnit timeUnit, int i, bud0 bud0Var) {
        this.f7777a = j;
        this.f7778b = j2;
        this.f7779c = timeUnit;
        this.f7780d = i;
        this.f7781e = bud0Var;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super List<T>> z3g0Var) {
        bud0.AbstractC0185a abstractC0185aCreateWorker = this.f7781e.createWorker();
        vie0 vie0Var = new vie0(z3g0Var);
        if (this.f7777a == this.f7778b) {
            C0568a c0568a = new C0568a(vie0Var, abstractC0185aCreateWorker);
            c0568a.m9240b(abstractC0185aCreateWorker);
            z3g0Var.m9240b(c0568a);
            c0568a.m8038h();
            return c0568a;
        }
        C0569b c0569b = new C0569b(vie0Var, abstractC0185aCreateWorker);
        c0569b.m9240b(abstractC0185aCreateWorker);
        z3g0Var.m9240b(c0569b);
        c0569b.m8041i();
        c0569b.m8040h();
        return c0569b;
    }
}
