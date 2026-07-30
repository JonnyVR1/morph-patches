package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class z260<T> implements C22421c.c<List<T>, T> {

    /* JADX INFO: renamed from: a */
    public final long f202633a;

    /* JADX INFO: renamed from: b */
    public final long f202634b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f202635c;

    /* JADX INFO: renamed from: d */
    public final int f202636d;

    /* JADX INFO: renamed from: e */
    public final f2e0 f202637e;

    /* JADX INFO: renamed from: l.z260$a */
    public final class C21747a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super List<T>> f202638e;

        /* JADX INFO: renamed from: f */
        public final f2e0.AbstractC16877a f202639f;

        /* JADX INFO: renamed from: g */
        public List<T> f202640g = new ArrayList();

        /* JADX INFO: renamed from: h */
        public boolean f202641h;

        /* JADX INFO: renamed from: l.z260$a$a */
        public class a implements x20 {
            public a() {
            }

            @Override // p153l.x20
            public void call() {
                C21747a.this.m218390g();
            }
        }

        public C21747a(gcg0<? super List<T>> gcg0Var, f2e0.AbstractC16877a abstractC16877a) {
            this.f202638e = gcg0Var;
            this.f202639f = abstractC16877a;
        }

        /* JADX INFO: renamed from: g */
        public void m218390g() {
            synchronized (this) {
                try {
                    if (this.f202641h) {
                        return;
                    }
                    List<T> list = this.f202640g;
                    this.f202640g = new ArrayList();
                    try {
                        this.f202638e.onNext(list);
                    } catch (Throwable th) {
                        j6f.m143664f(th, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m218391h() {
            f2e0.AbstractC16877a abstractC16877a = this.f202639f;
            a aVar = new a();
            z260 z260Var = z260.this;
            long j = z260Var.f202633a;
            abstractC16877a.m123611d(aVar, j, j, z260Var.f202635c);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            try {
                this.f202639f.unsubscribe();
                synchronized (this) {
                    try {
                        if (this.f202641h) {
                            return;
                        }
                        this.f202641h = true;
                        List<T> list = this.f202640g;
                        this.f202640g = null;
                        this.f202638e.onNext(list);
                        this.f202638e.onCompleted();
                        unsubscribe();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                j6f.m143664f(th2, this.f202638e);
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            synchronized (this) {
                try {
                    if (this.f202641h) {
                        return;
                    }
                    this.f202641h = true;
                    this.f202640g = null;
                    this.f202638e.onError(th);
                    unsubscribe();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            List<T> list;
            synchronized (this) {
                try {
                    if (this.f202641h) {
                        return;
                    }
                    this.f202640g.add(t);
                    if (this.f202640g.size() == z260.this.f202636d) {
                        list = this.f202640g;
                        this.f202640g = new ArrayList();
                    } else {
                        list = null;
                    }
                    if (list != null) {
                        this.f202638e.onNext(list);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.z260$b */
    public final class C21748b extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super List<T>> f202644e;

        /* JADX INFO: renamed from: f */
        public final f2e0.AbstractC16877a f202645f;

        /* JADX INFO: renamed from: g */
        public final List<List<T>> f202646g = new LinkedList();

        /* JADX INFO: renamed from: h */
        public boolean f202647h;

        /* JADX INFO: renamed from: l.z260$b$a */
        public class a implements x20 {
            public a() {
            }

            @Override // p153l.x20
            public void call() {
                C21748b.this.m218394i();
            }
        }

        /* JADX INFO: renamed from: l.z260$b$b */
        public class b implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ List f202650a;

            public b(List list) {
                this.f202650a = list;
            }

            @Override // p153l.x20
            public void call() {
                C21748b.this.m218392g(this.f202650a);
            }
        }

        public C21748b(gcg0<? super List<T>> gcg0Var, f2e0.AbstractC16877a abstractC16877a) {
            this.f202644e = gcg0Var;
            this.f202645f = abstractC16877a;
        }

        /* JADX INFO: renamed from: g */
        public void m218392g(List<T> list) {
            boolean z;
            synchronized (this) {
                try {
                    if (this.f202647h) {
                        return;
                    }
                    Iterator<List<T>> it = this.f202646g.iterator();
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
                            this.f202644e.onNext(list);
                        } catch (Throwable th) {
                            j6f.m143664f(th, this);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m218393h() {
            f2e0.AbstractC16877a abstractC16877a = this.f202645f;
            a aVar = new a();
            z260 z260Var = z260.this;
            long j = z260Var.f202634b;
            abstractC16877a.m123611d(aVar, j, j, z260Var.f202635c);
        }

        /* JADX INFO: renamed from: i */
        public void m218394i() {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                try {
                    if (this.f202647h) {
                        return;
                    }
                    this.f202646g.add(arrayList);
                    f2e0.AbstractC16877a abstractC16877a = this.f202645f;
                    b bVar = new b(arrayList);
                    z260 z260Var = z260.this;
                    abstractC16877a.mo102837c(bVar, z260Var.f202633a, z260Var.f202635c);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
            try {
                synchronized (this) {
                    try {
                        if (this.f202647h) {
                            return;
                        }
                        this.f202647h = true;
                        LinkedList linkedList = new LinkedList(this.f202646g);
                        this.f202646g.clear();
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            this.f202644e.onNext((List) it.next());
                        }
                        this.f202644e.onCompleted();
                        unsubscribe();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                j6f.m143664f(th2, this.f202644e);
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            synchronized (this) {
                try {
                    if (this.f202647h) {
                        return;
                    }
                    this.f202647h = true;
                    this.f202646g.clear();
                    this.f202644e.onError(th);
                    unsubscribe();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            synchronized (this) {
                try {
                    if (this.f202647h) {
                        return;
                    }
                    Iterator<List<T>> it = this.f202646g.iterator();
                    LinkedList linkedList = null;
                    while (it.hasNext()) {
                        List<T> next = it.next();
                        next.add(t);
                        if (next.size() == z260.this.f202636d) {
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
                            this.f202644e.onNext((List) it2.next());
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public z260(long j, long j2, TimeUnit timeUnit, int i, f2e0 f2e0Var) {
        this.f202633a = j;
        this.f202634b = j2;
        this.f202635c = timeUnit;
        this.f202636d = i;
        this.f202637e = f2e0Var;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super List<T>> gcg0Var) {
        f2e0.AbstractC16877a abstractC16877aCreateWorker = this.f202637e.createWorker();
        are0 are0Var = new are0(gcg0Var);
        if (this.f202633a == this.f202634b) {
            C21747a c21747a = new C21747a(are0Var, abstractC16877aCreateWorker);
            c21747a.m129866b(abstractC16877aCreateWorker);
            gcg0Var.m129866b(c21747a);
            c21747a.m218391h();
            return c21747a;
        }
        C21748b c21748b = new C21748b(are0Var, abstractC16877aCreateWorker);
        c21748b.m129866b(abstractC16877aCreateWorker);
        gcg0Var.m129866b(c21748b);
        c21748b.m218394i();
        c21748b.m218393h();
        return c21748b;
    }
}
