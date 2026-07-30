package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class su50<T, TOpening, TClosing> implements C22306c.c<List<T>, T> {

    /* JADX INFO: renamed from: a */
    public final C22306c<? extends TOpening> f166441a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super TOpening, ? extends C22306c<? extends TClosing>> f166442b;

    /* JADX INFO: renamed from: l.su50$a */
    public class C20032a extends z3g0<TOpening> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C20033b f166443e;

        public C20032a(C20033b c20033b) {
            this.f166443e = c20033b;
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f166443e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f166443e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(TOpening topening) {
            this.f166443e.m186003h(topening);
        }
    }

    /* JADX INFO: renamed from: l.su50$b */
    public final class C20033b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super List<T>> f166445e;

        /* JADX INFO: renamed from: f */
        public final List<List<T>> f166446f = new LinkedList();

        /* JADX INFO: renamed from: g */
        public boolean f166447g;

        /* JADX INFO: renamed from: h */
        public final bs5 f166448h;

        /* JADX INFO: renamed from: l.su50$b$a */
        public class a extends z3g0<TClosing> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ List f166450e;

            public a(List list) {
                this.f166450e = list;
            }

            @Override // p149l.m250
            public void onCompleted() {
                C20033b.this.f166448h.m103658d(this);
                C20033b.this.m186002g(this.f166450e);
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                C20033b.this.onError(th);
            }

            @Override // p149l.m250
            public void onNext(TClosing tclosing) {
                C20033b.this.f166448h.m103658d(this);
                C20033b.this.m186002g(this.f166450e);
            }
        }

        public C20033b(z3g0<? super List<T>> z3g0Var) {
            this.f166445e = z3g0Var;
            bs5 bs5Var = new bs5();
            this.f166448h = bs5Var;
            m217046b(bs5Var);
        }

        /* JADX INFO: renamed from: g */
        public void m186002g(List<T> list) {
            boolean z;
            synchronized (this) {
                try {
                    if (this.f166447g) {
                        return;
                    }
                    Iterator<List<T>> it = this.f166446f.iterator();
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
                        this.f166445e.onNext(list);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m186003h(TOpening topening) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                try {
                    if (this.f166447g) {
                        return;
                    }
                    this.f166446f.add(arrayList);
                    try {
                        C22306c<? extends TClosing> c22306cCall = su50.this.f166442b.call(topening);
                        a aVar = new a(arrayList);
                        this.f166448h.m103655a(aVar);
                        c22306cCall.unsafeSubscribe(aVar);
                    } catch (Throwable th) {
                        f5f.m119492f(th, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
            try {
                synchronized (this) {
                    try {
                        if (this.f166447g) {
                            return;
                        }
                        this.f166447g = true;
                        LinkedList linkedList = new LinkedList(this.f166446f);
                        this.f166446f.clear();
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            this.f166445e.onNext((List) it.next());
                        }
                        this.f166445e.onCompleted();
                        unsubscribe();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                f5f.m119492f(th2, this.f166445e);
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            synchronized (this) {
                try {
                    if (this.f166447g) {
                        return;
                    }
                    this.f166447g = true;
                    this.f166446f.clear();
                    this.f166445e.onError(th);
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
                    Iterator<List<T>> it = this.f166446f.iterator();
                    while (it.hasNext()) {
                        it.next().add(t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public su50(C22306c<? extends TOpening> c22306c, w9j<? super TOpening, ? extends C22306c<? extends TClosing>> w9jVar) {
        this.f166441a = c22306c;
        this.f166442b = w9jVar;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super List<T>> z3g0Var) {
        C20033b c20033b = new C20033b(new vie0(z3g0Var));
        C20032a c20032a = new C20032a(c20033b);
        z3g0Var.m217046b(c20032a);
        z3g0Var.m217046b(c20033b);
        this.f166441a.unsafeSubscribe(c20032a);
        return c20033b;
    }
}
