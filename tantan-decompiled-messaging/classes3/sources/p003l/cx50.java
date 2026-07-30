package p003l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p014rx.C1099c;
import p014rx.subjects.UnicastSubject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class cx50<T, U, V> implements C1099c.c<C1099c<T>, T> {

    /* JADX INFO: renamed from: a */
    public final C1099c<? extends U> f2850a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super U, ? extends C1099c<? extends V>> f2851b;

    /* JADX INFO: renamed from: l.cx50$a */
    public class C0216a extends z3g0<U> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C0218c f2852e;

        public C0216a(C0218c c0218c) {
            this.f2852e = c0218c;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            m9242e(Long.MAX_VALUE);
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f2852e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f2852e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(U u) {
            this.f2852e.m3493g(u);
        }
    }

    /* JADX INFO: renamed from: l.cx50$b */
    public static final class C0217b<T> {

        /* JADX INFO: renamed from: a */
        public final m250<T> f2854a;

        /* JADX INFO: renamed from: b */
        public final C1099c<T> f2855b;

        public C0217b(m250<T> m250Var, C1099c<T> c1099c) {
            this.f2854a = new tie0(m250Var);
            this.f2855b = c1099c;
        }
    }

    /* JADX INFO: renamed from: l.cx50$c */
    public final class C0218c extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super C1099c<T>> f2856e;

        /* JADX INFO: renamed from: f */
        public final bs5 f2857f;

        /* JADX INFO: renamed from: g */
        public final Object f2858g = new Object();

        /* JADX INFO: renamed from: h */
        public final List<C0217b<T>> f2859h = new LinkedList();

        /* JADX INFO: renamed from: i */
        public boolean f2860i;

        /* JADX INFO: renamed from: l.cx50$c$a */
        public class a extends z3g0<V> {

            /* JADX INFO: renamed from: e */
            public boolean f2862e = true;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ C0217b f2863f;

            public a(C0217b c0217b) {
                this.f2863f = c0217b;
            }

            @Override // p003l.m250
            public void onCompleted() {
                if (this.f2862e) {
                    this.f2862e = false;
                    C0218c.this.m3495i(this.f2863f);
                    C0218c.this.f2857f.m3167d(this);
                }
            }

            @Override // p003l.m250
            public void onError(Throwable th) {
                C0218c.this.onError(th);
            }

            @Override // p003l.m250
            public void onNext(V v2) {
                onCompleted();
            }
        }

        public C0218c(z3g0<? super C1099c<T>> z3g0Var, bs5 bs5Var) {
            this.f2856e = new vie0(z3g0Var);
            this.f2857f = bs5Var;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            m9242e(Long.MAX_VALUE);
        }

        /* JADX INFO: renamed from: g */
        public void m3493g(U u) {
            C0217b<T> c0217bM3494h = m3494h();
            synchronized (this.f2858g) {
                try {
                    if (this.f2860i) {
                        return;
                    }
                    this.f2859h.add(c0217bM3494h);
                    this.f2856e.onNext(c0217bM3494h.f2855b);
                    try {
                        C1099c<? extends V> c1099cCall = cx50.this.f2851b.call(u);
                        a aVar = new a(c0217bM3494h);
                        this.f2857f.m3164a(aVar);
                        c1099cCall.unsafeSubscribe(aVar);
                    } catch (Throwable th) {
                        onError(th);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public C0217b<T> m3494h() {
            UnicastSubject unicastSubjectM9966b = UnicastSubject.m9966b();
            return new C0217b<>(unicastSubjectM9966b, unicastSubjectM9966b);
        }

        /* JADX INFO: renamed from: i */
        public void m3495i(C0217b<T> c0217b) {
            boolean z;
            synchronized (this.f2858g) {
                try {
                    if (this.f2860i) {
                        return;
                    }
                    Iterator<C0217b<T>> it = this.f2859h.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        } else if (it.next() == c0217b) {
                            it.remove();
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        c0217b.f2854a.onCompleted();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p003l.m250
        public void onCompleted() {
            try {
                synchronized (this.f2858g) {
                    if (!this.f2860i) {
                        this.f2860i = true;
                        ArrayList arrayList = new ArrayList(this.f2859h);
                        this.f2859h.clear();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C0217b) it.next()).f2854a.onCompleted();
                        }
                        this.f2856e.onCompleted();
                    }
                }
                this.f2857f.unsubscribe();
            } catch (Throwable th) {
                this.f2857f.unsubscribe();
                throw th;
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            try {
                synchronized (this.f2858g) {
                    if (!this.f2860i) {
                        this.f2860i = true;
                        ArrayList arrayList = new ArrayList(this.f2859h);
                        this.f2859h.clear();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C0217b) it.next()).f2854a.onError(th);
                        }
                        this.f2856e.onError(th);
                    }
                }
                this.f2857f.unsubscribe();
            } catch (Throwable th2) {
                this.f2857f.unsubscribe();
                throw th2;
            }
        }

        @Override // p003l.m250
        public void onNext(T t) {
            synchronized (this.f2858g) {
                try {
                    if (this.f2860i) {
                        return;
                    }
                    Iterator it = new ArrayList(this.f2859h).iterator();
                    while (it.hasNext()) {
                        ((C0217b) it.next()).f2854a.onNext(t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public cx50(C1099c<? extends U> c1099c, w9j<? super U, ? extends C1099c<? extends V>> w9jVar) {
        this.f2850a = c1099c;
        this.f2851b = w9jVar;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super C1099c<T>> z3g0Var) {
        bs5 bs5Var = new bs5();
        z3g0Var.m9240b(bs5Var);
        C0218c c0218c = new C0218c(z3g0Var, bs5Var);
        C0216a c0216a = new C0216a(c0218c);
        bs5Var.m3164a(c0218c);
        bs5Var.m3164a(c0216a);
        this.f2850a.unsafeSubscribe(c0216a);
        return c0218c;
    }
}
