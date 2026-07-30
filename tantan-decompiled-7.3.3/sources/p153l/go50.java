package p153l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class go50<TLeft, TRight, TLeftDuration, TRightDuration, R> implements C22421c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C22421c<TLeft> f105242a;

    /* JADX INFO: renamed from: b */
    public final C22421c<TRight> f105243b;

    /* JADX INFO: renamed from: c */
    public final qcj<TLeft, C22421c<TLeftDuration>> f105244c;

    /* JADX INFO: renamed from: d */
    public final qcj<TRight, C22421c<TRightDuration>> f105245d;

    /* JADX INFO: renamed from: e */
    public final rcj<TLeft, TRight, R> f105246e;

    /* JADX INFO: renamed from: l.go50$a */
    public final class C17267a {

        /* JADX INFO: renamed from: b */
        public final gcg0<? super R> f105248b;

        /* JADX INFO: renamed from: d */
        public boolean f105250d;

        /* JADX INFO: renamed from: e */
        public int f105251e;

        /* JADX INFO: renamed from: g */
        public boolean f105253g;

        /* JADX INFO: renamed from: h */
        public int f105254h;

        /* JADX INFO: renamed from: c */
        public final Object f105249c = new Object();

        /* JADX INFO: renamed from: a */
        public final ft5 f105247a = new ft5();

        /* JADX INFO: renamed from: f */
        public final Map<Integer, TLeft> f105252f = new HashMap();

        /* JADX INFO: renamed from: i */
        public final Map<Integer, TRight> f105255i = new HashMap();

        /* JADX INFO: renamed from: l.go50$a$a */
        public final class a extends gcg0<TLeft> {

            /* JADX INFO: renamed from: l.go50$a$a$a, reason: collision with other inner class name */
            public final class C22837a extends gcg0<TLeftDuration> {

                /* JADX INFO: renamed from: e */
                public final int f105258e;

                /* JADX INFO: renamed from: f */
                public boolean f105259f = true;

                public C22837a(int i) {
                    this.f105258e = i;
                }

                @Override // p153l.bb50
                public void onCompleted() {
                    if (this.f105259f) {
                        this.f105259f = false;
                        a.this.m131093g(this.f105258e, this);
                    }
                }

                @Override // p153l.bb50
                public void onError(Throwable th) {
                    a.this.onError(th);
                }

                @Override // p153l.bb50
                public void onNext(TLeftDuration tleftduration) {
                    onCompleted();
                }
            }

            public a() {
            }

            /* JADX INFO: renamed from: g */
            public void m131093g(int i, kcg0 kcg0Var) {
                boolean z;
                synchronized (C17267a.this.f105249c) {
                    try {
                        z = C17267a.this.f105252f.remove(Integer.valueOf(i)) != null && C17267a.this.f105252f.isEmpty() && C17267a.this.f105250d;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C17267a c17267a = C17267a.this;
                if (!z) {
                    c17267a.f105247a.m127300d(kcg0Var);
                } else {
                    c17267a.f105248b.onCompleted();
                    C17267a.this.f105248b.unsubscribe();
                }
            }

            @Override // p153l.bb50
            public void onCompleted() {
                boolean z;
                synchronized (C17267a.this.f105249c) {
                    try {
                        C17267a c17267a = C17267a.this;
                        z = true;
                        c17267a.f105250d = true;
                        if (!c17267a.f105253g && !c17267a.f105252f.isEmpty()) {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C17267a c17267a2 = C17267a.this;
                if (!z) {
                    c17267a2.f105247a.m127300d(this);
                } else {
                    c17267a2.f105248b.onCompleted();
                    C17267a.this.f105248b.unsubscribe();
                }
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                C17267a.this.f105248b.onError(th);
                C17267a.this.f105248b.unsubscribe();
            }

            @Override // p153l.bb50
            public void onNext(TLeft tleft) {
                int i;
                C17267a c17267a;
                int i2;
                synchronized (C17267a.this.f105249c) {
                    C17267a c17267a2 = C17267a.this;
                    i = c17267a2.f105251e;
                    c17267a2.f105251e = i + 1;
                    c17267a2.f105252f.put(Integer.valueOf(i), tleft);
                    c17267a = C17267a.this;
                    i2 = c17267a.f105254h;
                }
                try {
                    C22421c<TLeftDuration> c22421cCall = go50.this.f105244c.call(tleft);
                    C22837a c22837a = new C22837a(i);
                    C17267a.this.f105247a.m127297a(c22837a);
                    c22421cCall.unsafeSubscribe(c22837a);
                    ArrayList arrayList = new ArrayList();
                    synchronized (C17267a.this.f105249c) {
                        try {
                            for (Map.Entry<Integer, TRight> entry : C17267a.this.f105255i.entrySet()) {
                                if (entry.getKey().intValue() < i2) {
                                    arrayList.add(entry.getValue());
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C17267a.this.f105248b.onNext(go50.this.f105246e.call(tleft, (TRight) it.next()));
                    }
                } catch (Throwable th2) {
                    j6f.m143664f(th2, this);
                }
            }
        }

        /* JADX INFO: renamed from: l.go50$a$b */
        public final class b extends gcg0<TRight> {

            /* JADX INFO: renamed from: l.go50$a$b$a */
            public final class a extends gcg0<TRightDuration> {

                /* JADX INFO: renamed from: e */
                public final int f105262e;

                /* JADX INFO: renamed from: f */
                public boolean f105263f = true;

                public a(int i) {
                    this.f105262e = i;
                }

                @Override // p153l.bb50
                public void onCompleted() {
                    if (this.f105263f) {
                        this.f105263f = false;
                        b.this.m131094g(this.f105262e, this);
                    }
                }

                @Override // p153l.bb50
                public void onError(Throwable th) {
                    b.this.onError(th);
                }

                @Override // p153l.bb50
                public void onNext(TRightDuration trightduration) {
                    onCompleted();
                }
            }

            public b() {
            }

            /* JADX INFO: renamed from: g */
            public void m131094g(int i, kcg0 kcg0Var) {
                boolean z;
                synchronized (C17267a.this.f105249c) {
                    try {
                        z = C17267a.this.f105255i.remove(Integer.valueOf(i)) != null && C17267a.this.f105255i.isEmpty() && C17267a.this.f105253g;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C17267a c17267a = C17267a.this;
                if (!z) {
                    c17267a.f105247a.m127300d(kcg0Var);
                } else {
                    c17267a.f105248b.onCompleted();
                    C17267a.this.f105248b.unsubscribe();
                }
            }

            @Override // p153l.bb50
            public void onCompleted() {
                boolean z;
                synchronized (C17267a.this.f105249c) {
                    try {
                        C17267a c17267a = C17267a.this;
                        z = true;
                        c17267a.f105253g = true;
                        if (!c17267a.f105250d && !c17267a.f105255i.isEmpty()) {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C17267a c17267a2 = C17267a.this;
                if (!z) {
                    c17267a2.f105247a.m127300d(this);
                } else {
                    c17267a2.f105248b.onCompleted();
                    C17267a.this.f105248b.unsubscribe();
                }
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                C17267a.this.f105248b.onError(th);
                C17267a.this.f105248b.unsubscribe();
            }

            @Override // p153l.bb50
            public void onNext(TRight tright) {
                int i;
                int i2;
                synchronized (C17267a.this.f105249c) {
                    C17267a c17267a = C17267a.this;
                    i = c17267a.f105254h;
                    c17267a.f105254h = i + 1;
                    c17267a.f105255i.put(Integer.valueOf(i), tright);
                    i2 = C17267a.this.f105251e;
                }
                C17267a.this.f105247a.m127297a(new wqe0());
                try {
                    C22421c<TRightDuration> c22421cCall = go50.this.f105245d.call(tright);
                    a aVar = new a(i);
                    C17267a.this.f105247a.m127297a(aVar);
                    c22421cCall.unsafeSubscribe(aVar);
                    ArrayList arrayList = new ArrayList();
                    synchronized (C17267a.this.f105249c) {
                        try {
                            for (Map.Entry<Integer, TLeft> entry : C17267a.this.f105252f.entrySet()) {
                                if (entry.getKey().intValue() < i2) {
                                    arrayList.add(entry.getValue());
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C17267a.this.f105248b.onNext(go50.this.f105246e.call((TLeft) it.next(), tright));
                    }
                } catch (Throwable th2) {
                    j6f.m143664f(th2, this);
                }
            }
        }

        public C17267a(gcg0<? super R> gcg0Var) {
            this.f105248b = gcg0Var;
        }

        /* JADX INFO: renamed from: a */
        public void m131092a() {
            this.f105248b.m129866b(this.f105247a);
            a aVar = new a();
            b bVar = new b();
            this.f105247a.m127297a(aVar);
            this.f105247a.m127297a(bVar);
            go50.this.f105242a.unsafeSubscribe(aVar);
            go50.this.f105243b.unsafeSubscribe(bVar);
        }
    }

    public go50(C22421c<TLeft> c22421c, C22421c<TRight> c22421c2, qcj<TLeft, C22421c<TLeftDuration>> qcjVar, qcj<TRight, C22421c<TRightDuration>> qcjVar2, rcj<TLeft, TRight, R> rcjVar) {
        this.f105242a = c22421c;
        this.f105243b = c22421c2;
        this.f105244c = qcjVar;
        this.f105245d = qcjVar2;
        this.f105246e = rcjVar;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super R> gcg0Var) {
        new C17267a(new are0(gcg0Var)).m131092a();
    }
}
