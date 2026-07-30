package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class y260<T, TOpening, TClosing> implements C22421c.c<List<T>, T> {

    /* JADX INFO: renamed from: a */
    public final C22421c<? extends TOpening> f197182a;

    /* JADX INFO: renamed from: b */
    public final qcj<? super TOpening, ? extends C22421c<? extends TClosing>> f197183b;

    /* JADX INFO: renamed from: l.y260$a */
    public class C21493a extends gcg0<TOpening> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C21494b f197184e;

        public C21493a(C21494b c21494b) {
            this.f197184e = c21494b;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f197184e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f197184e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(TOpening topening) {
            this.f197184e.m214046h(topening);
        }
    }

    /* JADX INFO: renamed from: l.y260$b */
    public final class C21494b extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super List<T>> f197186e;

        /* JADX INFO: renamed from: f */
        public final List<List<T>> f197187f = new LinkedList();

        /* JADX INFO: renamed from: g */
        public boolean f197188g;

        /* JADX INFO: renamed from: h */
        public final ft5 f197189h;

        /* JADX INFO: renamed from: l.y260$b$a */
        public class a extends gcg0<TClosing> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ List f197191e;

            public a(List list) {
                this.f197191e = list;
            }

            @Override // p153l.bb50
            public void onCompleted() {
                C21494b.this.f197189h.m127300d(this);
                C21494b.this.m214045g(this.f197191e);
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                C21494b.this.onError(th);
            }

            @Override // p153l.bb50
            public void onNext(TClosing tclosing) {
                C21494b.this.f197189h.m127300d(this);
                C21494b.this.m214045g(this.f197191e);
            }
        }

        public C21494b(gcg0<? super List<T>> gcg0Var) {
            this.f197186e = gcg0Var;
            ft5 ft5Var = new ft5();
            this.f197189h = ft5Var;
            m129866b(ft5Var);
        }

        /* JADX INFO: renamed from: g */
        public void m214045g(List<T> list) {
            boolean z;
            synchronized (this) {
                try {
                    if (this.f197188g) {
                        return;
                    }
                    Iterator<List<T>> it = this.f197187f.iterator();
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
                        this.f197186e.onNext(list);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m214046h(TOpening topening) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                try {
                    if (this.f197188g) {
                        return;
                    }
                    this.f197187f.add(arrayList);
                    try {
                        C22421c<? extends TClosing> c22421cCall = y260.this.f197183b.call(topening);
                        a aVar = new a(arrayList);
                        this.f197189h.m127297a(aVar);
                        c22421cCall.unsafeSubscribe(aVar);
                    } catch (Throwable th) {
                        j6f.m143664f(th, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
            try {
                synchronized (this) {
                    try {
                        if (this.f197188g) {
                            return;
                        }
                        this.f197188g = true;
                        LinkedList linkedList = new LinkedList(this.f197187f);
                        this.f197187f.clear();
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            this.f197186e.onNext((List) it.next());
                        }
                        this.f197186e.onCompleted();
                        unsubscribe();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                j6f.m143664f(th2, this.f197186e);
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            synchronized (this) {
                try {
                    if (this.f197188g) {
                        return;
                    }
                    this.f197188g = true;
                    this.f197187f.clear();
                    this.f197186e.onError(th);
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
                    Iterator<List<T>> it = this.f197187f.iterator();
                    while (it.hasNext()) {
                        it.next().add(t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public y260(C22421c<? extends TOpening> c22421c, qcj<? super TOpening, ? extends C22421c<? extends TClosing>> qcjVar) {
        this.f197182a = c22421c;
        this.f197183b = qcjVar;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super List<T>> gcg0Var) {
        C21494b c21494b = new C21494b(new are0(gcg0Var));
        C21493a c21493a = new C21493a(c21494b);
        gcg0Var.m129866b(c21493a);
        gcg0Var.m129866b(c21494b);
        this.f197182a.unsafeSubscribe(c21493a);
        return c21494b;
    }
}
