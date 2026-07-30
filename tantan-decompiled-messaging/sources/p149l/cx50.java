package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.UnicastSubject;

/* JADX INFO: loaded from: classes3.dex */
public final class cx50<T, U, V> implements C22306c.c<C22306c<T>, T> {

    /* JADX INFO: renamed from: a */
    public final C22306c<? extends U> f82836a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super U, ? extends C22306c<? extends V>> f82837b;

    /* JADX INFO: renamed from: l.cx50$a */
    public class C16267a extends z3g0<U> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C16269c f82838e;

        public C16267a(C16269c c16269c) {
            this.f82838e = c16269c;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo99382d() {
            m217048e(Long.MAX_VALUE);
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f82838e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f82838e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(U u) {
            this.f82838e.m109082g(u);
        }
    }

    /* JADX INFO: renamed from: l.cx50$b */
    public static final class C16268b<T> {

        /* JADX INFO: renamed from: a */
        public final m250<T> f82840a;

        /* JADX INFO: renamed from: b */
        public final C22306c<T> f82841b;

        public C16268b(m250<T> m250Var, C22306c<T> c22306c) {
            this.f82840a = new tie0(m250Var);
            this.f82841b = c22306c;
        }
    }

    /* JADX INFO: renamed from: l.cx50$c */
    public final class C16269c extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super C22306c<T>> f82842e;

        /* JADX INFO: renamed from: f */
        public final bs5 f82843f;

        /* JADX INFO: renamed from: g */
        public final Object f82844g = new Object();

        /* JADX INFO: renamed from: h */
        public final List<C16268b<T>> f82845h = new LinkedList();

        /* JADX INFO: renamed from: i */
        public boolean f82846i;

        /* JADX INFO: renamed from: l.cx50$c$a */
        public class a extends z3g0<V> {

            /* JADX INFO: renamed from: e */
            public boolean f82848e = true;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ C16268b f82849f;

            public a(C16268b c16268b) {
                this.f82849f = c16268b;
            }

            @Override // p149l.m250
            public void onCompleted() {
                if (this.f82848e) {
                    this.f82848e = false;
                    C16269c.this.m109084i(this.f82849f);
                    C16269c.this.f82843f.m103658d(this);
                }
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                C16269c.this.onError(th);
            }

            @Override // p149l.m250
            public void onNext(V v2) {
                onCompleted();
            }
        }

        public C16269c(z3g0<? super C22306c<T>> z3g0Var, bs5 bs5Var) {
            this.f82842e = new vie0(z3g0Var);
            this.f82843f = bs5Var;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo99382d() {
            m217048e(Long.MAX_VALUE);
        }

        /* JADX INFO: renamed from: g */
        public void m109082g(U u) {
            C16268b<T> c16268bM109083h = m109083h();
            synchronized (this.f82844g) {
                try {
                    if (this.f82846i) {
                        return;
                    }
                    this.f82845h.add(c16268bM109083h);
                    this.f82842e.onNext(c16268bM109083h.f82841b);
                    try {
                        C22306c<? extends V> c22306cCall = cx50.this.f82837b.call(u);
                        a aVar = new a(c16268bM109083h);
                        this.f82843f.m103655a(aVar);
                        c22306cCall.unsafeSubscribe(aVar);
                    } catch (Throwable th) {
                        onError(th);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public C16268b<T> m109083h() {
            UnicastSubject unicastSubjectM221509b = UnicastSubject.m221509b();
            return new C16268b<>(unicastSubjectM221509b, unicastSubjectM221509b);
        }

        /* JADX INFO: renamed from: i */
        public void m109084i(C16268b<T> c16268b) {
            boolean z;
            synchronized (this.f82844g) {
                try {
                    if (this.f82846i) {
                        return;
                    }
                    Iterator<C16268b<T>> it = this.f82845h.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        } else if (it.next() == c16268b) {
                            it.remove();
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        c16268b.f82840a.onCompleted();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
            try {
                synchronized (this.f82844g) {
                    if (!this.f82846i) {
                        this.f82846i = true;
                        ArrayList arrayList = new ArrayList(this.f82845h);
                        this.f82845h.clear();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C16268b) it.next()).f82840a.onCompleted();
                        }
                        this.f82842e.onCompleted();
                    }
                }
                this.f82843f.unsubscribe();
            } catch (Throwable th) {
                this.f82843f.unsubscribe();
                throw th;
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            try {
                synchronized (this.f82844g) {
                    if (!this.f82846i) {
                        this.f82846i = true;
                        ArrayList arrayList = new ArrayList(this.f82845h);
                        this.f82845h.clear();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C16268b) it.next()).f82840a.onError(th);
                        }
                        this.f82842e.onError(th);
                    }
                }
                this.f82843f.unsubscribe();
            } catch (Throwable th2) {
                this.f82843f.unsubscribe();
                throw th2;
            }
        }

        @Override // p149l.m250
        public void onNext(T t) {
            synchronized (this.f82844g) {
                try {
                    if (this.f82846i) {
                        return;
                    }
                    Iterator it = new ArrayList(this.f82845h).iterator();
                    while (it.hasNext()) {
                        ((C16268b) it.next()).f82840a.onNext(t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public cx50(C22306c<? extends U> c22306c, w9j<? super U, ? extends C22306c<? extends V>> w9jVar) {
        this.f82836a = c22306c;
        this.f82837b = w9jVar;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super C22306c<T>> z3g0Var) {
        bs5 bs5Var = new bs5();
        z3g0Var.m217046b(bs5Var);
        C16269c c16269c = new C16269c(z3g0Var, bs5Var);
        C16267a c16267a = new C16267a(c16269c);
        bs5Var.m103655a(c16269c);
        bs5Var.m103655a(c16267a);
        this.f82836a.unsafeSubscribe(c16267a);
        return c16269c;
    }
}
