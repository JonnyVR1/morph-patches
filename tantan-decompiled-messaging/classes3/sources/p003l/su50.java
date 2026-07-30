package p003l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class su50<T, TOpening, TClosing> implements C1099c.c<List<T>, T> {

    /* JADX INFO: renamed from: a */
    public final C1099c<? extends TOpening> f7314a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super TOpening, ? extends C1099c<? extends TClosing>> f7315b;

    /* JADX INFO: renamed from: l.su50$a */
    public class C0536a extends z3g0<TOpening> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C0537b f7316e;

        public C0536a(C0537b c0537b) {
            this.f7316e = c0537b;
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f7316e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f7316e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(TOpening topening) {
            this.f7316e.m7644h(topening);
        }
    }

    /* JADX INFO: renamed from: l.su50$b */
    public final class C0537b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super List<T>> f7318e;

        /* JADX INFO: renamed from: f */
        public final List<List<T>> f7319f = new LinkedList();

        /* JADX INFO: renamed from: g */
        public boolean f7320g;

        /* JADX INFO: renamed from: h */
        public final bs5 f7321h;

        /* JADX INFO: renamed from: l.su50$b$a */
        public class a extends z3g0<TClosing> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ List f7323e;

            public a(List list) {
                this.f7323e = list;
            }

            @Override // p003l.m250
            public void onCompleted() {
                C0537b.this.f7321h.m3167d(this);
                C0537b.this.m7643g(this.f7323e);
            }

            @Override // p003l.m250
            public void onError(Throwable th) {
                C0537b.this.onError(th);
            }

            @Override // p003l.m250
            public void onNext(TClosing tclosing) {
                C0537b.this.f7321h.m3167d(this);
                C0537b.this.m7643g(this.f7323e);
            }
        }

        public C0537b(z3g0<? super List<T>> z3g0Var) {
            this.f7318e = z3g0Var;
            bs5 bs5Var = new bs5();
            this.f7321h = bs5Var;
            m9240b(bs5Var);
        }

        /* JADX INFO: renamed from: g */
        public void m7643g(List<T> list) {
            boolean z;
            synchronized (this) {
                try {
                    if (this.f7320g) {
                        return;
                    }
                    Iterator<List<T>> it = this.f7319f.iterator();
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
                        this.f7318e.onNext(list);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m7644h(TOpening topening) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                try {
                    if (this.f7320g) {
                        return;
                    }
                    this.f7319f.add(arrayList);
                    try {
                        C1099c<? extends TClosing> c1099cCall = su50.this.f7315b.call(topening);
                        a aVar = new a(arrayList);
                        this.f7321h.m3164a(aVar);
                        c1099cCall.unsafeSubscribe(aVar);
                    } catch (Throwable th) {
                        f5f.m3965f(th, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p003l.m250
        public void onCompleted() {
            try {
                synchronized (this) {
                    try {
                        if (this.f7320g) {
                            return;
                        }
                        this.f7320g = true;
                        LinkedList linkedList = new LinkedList(this.f7319f);
                        this.f7319f.clear();
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            this.f7318e.onNext((List) it.next());
                        }
                        this.f7318e.onCompleted();
                        unsubscribe();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                f5f.m3965f(th2, this.f7318e);
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            synchronized (this) {
                try {
                    if (this.f7320g) {
                        return;
                    }
                    this.f7320g = true;
                    this.f7319f.clear();
                    this.f7318e.onError(th);
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
                    Iterator<List<T>> it = this.f7319f.iterator();
                    while (it.hasNext()) {
                        it.next().add(t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public su50(C1099c<? extends TOpening> c1099c, w9j<? super TOpening, ? extends C1099c<? extends TClosing>> w9jVar) {
        this.f7314a = c1099c;
        this.f7315b = w9jVar;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super List<T>> z3g0Var) {
        C0537b c0537b = new C0537b(new vie0(z3g0Var));
        C0536a c0536a = new C0536a(c0537b);
        z3g0Var.m9240b(c0536a);
        z3g0Var.m9240b(c0537b);
        this.f7314a.unsafeSubscribe(c0536a);
        return c0537b;
    }
}
