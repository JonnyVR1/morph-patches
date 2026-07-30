package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.UnicastSubject;

/* JADX INFO: loaded from: classes3.dex */
public final class i560<T, U, V> implements C22421c.c<C22421c<T>, T> {

    /* JADX INFO: renamed from: a */
    public final C22421c<? extends U> f112999a;

    /* JADX INFO: renamed from: b */
    public final qcj<? super U, ? extends C22421c<? extends V>> f113000b;

    /* JADX INFO: renamed from: l.i560$a */
    public class C17650a extends gcg0<U> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C17652c f113001e;

        public C17650a(C17652c c17652c) {
            this.f113001e = c17652c;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            m129868e(Long.MAX_VALUE);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f113001e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f113001e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(U u) {
            this.f113001e.m138638g(u);
        }
    }

    /* JADX INFO: renamed from: l.i560$b */
    public static final class C17651b<T> {

        /* JADX INFO: renamed from: a */
        public final bb50<T> f113003a;

        /* JADX INFO: renamed from: b */
        public final C22421c<T> f113004b;

        public C17651b(bb50<T> bb50Var, C22421c<T> c22421c) {
            this.f113003a = new yqe0(bb50Var);
            this.f113004b = c22421c;
        }
    }

    /* JADX INFO: renamed from: l.i560$c */
    public final class C17652c extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super C22421c<T>> f113005e;

        /* JADX INFO: renamed from: f */
        public final ft5 f113006f;

        /* JADX INFO: renamed from: g */
        public final Object f113007g = new Object();

        /* JADX INFO: renamed from: h */
        public final List<C17651b<T>> f113008h = new LinkedList();

        /* JADX INFO: renamed from: i */
        public boolean f113009i;

        /* JADX INFO: renamed from: l.i560$c$a */
        public class a extends gcg0<V> {

            /* JADX INFO: renamed from: e */
            public boolean f113011e = true;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ C17651b f113012f;

            public a(C17651b c17651b) {
                this.f113012f = c17651b;
            }

            @Override // p153l.bb50
            public void onCompleted() {
                if (this.f113011e) {
                    this.f113011e = false;
                    C17652c.this.m138640i(this.f113012f);
                    C17652c.this.f113006f.m127300d(this);
                }
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                C17652c.this.onError(th);
            }

            @Override // p153l.bb50
            public void onNext(V v2) {
                onCompleted();
            }
        }

        public C17652c(gcg0<? super C22421c<T>> gcg0Var, ft5 ft5Var) {
            this.f113005e = new are0(gcg0Var);
            this.f113006f = ft5Var;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            m129868e(Long.MAX_VALUE);
        }

        /* JADX INFO: renamed from: g */
        public void m138638g(U u) {
            C17651b<T> c17651bM138639h = m138639h();
            synchronized (this.f113007g) {
                try {
                    if (this.f113009i) {
                        return;
                    }
                    this.f113008h.add(c17651bM138639h);
                    this.f113005e.onNext(c17651bM138639h.f113004b);
                    try {
                        C22421c<? extends V> c22421cCall = i560.this.f113000b.call(u);
                        a aVar = new a(c17651bM138639h);
                        this.f113006f.m127297a(aVar);
                        c22421cCall.unsafeSubscribe(aVar);
                    } catch (Throwable th) {
                        onError(th);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public C17651b<T> m138639h() {
            UnicastSubject unicastSubjectM222755b = UnicastSubject.m222755b();
            return new C17651b<>(unicastSubjectM222755b, unicastSubjectM222755b);
        }

        /* JADX INFO: renamed from: i */
        public void m138640i(C17651b<T> c17651b) {
            boolean z;
            synchronized (this.f113007g) {
                try {
                    if (this.f113009i) {
                        return;
                    }
                    Iterator<C17651b<T>> it = this.f113008h.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        } else if (it.next() == c17651b) {
                            it.remove();
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        c17651b.f113003a.onCompleted();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
            try {
                synchronized (this.f113007g) {
                    if (!this.f113009i) {
                        this.f113009i = true;
                        ArrayList arrayList = new ArrayList(this.f113008h);
                        this.f113008h.clear();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C17651b) it.next()).f113003a.onCompleted();
                        }
                        this.f113005e.onCompleted();
                    }
                }
                this.f113006f.unsubscribe();
            } catch (Throwable th) {
                this.f113006f.unsubscribe();
                throw th;
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            try {
                synchronized (this.f113007g) {
                    if (!this.f113009i) {
                        this.f113009i = true;
                        ArrayList arrayList = new ArrayList(this.f113008h);
                        this.f113008h.clear();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C17651b) it.next()).f113003a.onError(th);
                        }
                        this.f113005e.onError(th);
                    }
                }
                this.f113006f.unsubscribe();
            } catch (Throwable th2) {
                this.f113006f.unsubscribe();
                throw th2;
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            synchronized (this.f113007g) {
                try {
                    if (this.f113009i) {
                        return;
                    }
                    Iterator it = new ArrayList(this.f113008h).iterator();
                    while (it.hasNext()) {
                        ((C17651b) it.next()).f113003a.onNext(t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public i560(C22421c<? extends U> c22421c, qcj<? super U, ? extends C22421c<? extends V>> qcjVar) {
        this.f112999a = c22421c;
        this.f113000b = qcjVar;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super C22421c<T>> gcg0Var) {
        ft5 ft5Var = new ft5();
        gcg0Var.m129866b(ft5Var);
        C17652c c17652c = new C17652c(gcg0Var, ft5Var);
        C17650a c17650a = new C17650a(c17652c);
        ft5Var.m127297a(c17652c);
        ft5Var.m127297a(c17650a);
        this.f112999a.unsafeSubscribe(c17650a);
        return c17652c;
    }
}
