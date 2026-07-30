package p149l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class ag50<TLeft, TRight, TLeftDuration, TRightDuration, R> implements C22306c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C22306c<TLeft> f69267a;

    /* JADX INFO: renamed from: b */
    public final C22306c<TRight> f69268b;

    /* JADX INFO: renamed from: c */
    public final w9j<TLeft, C22306c<TLeftDuration>> f69269c;

    /* JADX INFO: renamed from: d */
    public final w9j<TRight, C22306c<TRightDuration>> f69270d;

    /* JADX INFO: renamed from: e */
    public final x9j<TLeft, TRight, R> f69271e;

    /* JADX INFO: renamed from: l.ag50$a */
    public final class C15609a {

        /* JADX INFO: renamed from: b */
        public final z3g0<? super R> f69273b;

        /* JADX INFO: renamed from: d */
        public boolean f69275d;

        /* JADX INFO: renamed from: e */
        public int f69276e;

        /* JADX INFO: renamed from: g */
        public boolean f69278g;

        /* JADX INFO: renamed from: h */
        public int f69279h;

        /* JADX INFO: renamed from: c */
        public final Object f69274c = new Object();

        /* JADX INFO: renamed from: a */
        public final bs5 f69272a = new bs5();

        /* JADX INFO: renamed from: f */
        public final Map<Integer, TLeft> f69277f = new HashMap();

        /* JADX INFO: renamed from: i */
        public final Map<Integer, TRight> f69280i = new HashMap();

        /* JADX INFO: renamed from: l.ag50$a$a */
        public final class a extends z3g0<TLeft> {

            /* JADX INFO: renamed from: l.ag50$a$a$a, reason: collision with other inner class name */
            public final class C22720a extends z3g0<TLeftDuration> {

                /* JADX INFO: renamed from: e */
                public final int f69283e;

                /* JADX INFO: renamed from: f */
                public boolean f69284f = true;

                public C22720a(int i) {
                    this.f69283e = i;
                }

                @Override // p149l.m250
                public void onCompleted() {
                    if (this.f69284f) {
                        this.f69284f = false;
                        a.this.m96292g(this.f69283e, this);
                    }
                }

                @Override // p149l.m250
                public void onError(Throwable th) {
                    a.this.onError(th);
                }

                @Override // p149l.m250
                public void onNext(TLeftDuration tleftduration) {
                    onCompleted();
                }
            }

            public a() {
            }

            /* JADX INFO: renamed from: g */
            public void m96292g(int i, c4g0 c4g0Var) {
                boolean z;
                synchronized (C15609a.this.f69274c) {
                    try {
                        z = C15609a.this.f69277f.remove(Integer.valueOf(i)) != null && C15609a.this.f69277f.isEmpty() && C15609a.this.f69275d;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C15609a c15609a = C15609a.this;
                if (!z) {
                    c15609a.f69272a.m103658d(c4g0Var);
                } else {
                    c15609a.f69273b.onCompleted();
                    C15609a.this.f69273b.unsubscribe();
                }
            }

            @Override // p149l.m250
            public void onCompleted() {
                boolean z;
                synchronized (C15609a.this.f69274c) {
                    try {
                        C15609a c15609a = C15609a.this;
                        z = true;
                        c15609a.f69275d = true;
                        if (!c15609a.f69278g && !c15609a.f69277f.isEmpty()) {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C15609a c15609a2 = C15609a.this;
                if (!z) {
                    c15609a2.f69272a.m103658d(this);
                } else {
                    c15609a2.f69273b.onCompleted();
                    C15609a.this.f69273b.unsubscribe();
                }
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                C15609a.this.f69273b.onError(th);
                C15609a.this.f69273b.unsubscribe();
            }

            @Override // p149l.m250
            public void onNext(TLeft tleft) {
                int i;
                C15609a c15609a;
                int i2;
                synchronized (C15609a.this.f69274c) {
                    C15609a c15609a2 = C15609a.this;
                    i = c15609a2.f69276e;
                    c15609a2.f69276e = i + 1;
                    c15609a2.f69277f.put(Integer.valueOf(i), tleft);
                    c15609a = C15609a.this;
                    i2 = c15609a.f69279h;
                }
                try {
                    C22306c<TLeftDuration> c22306cCall = ag50.this.f69269c.call(tleft);
                    C22720a c22720a = new C22720a(i);
                    C15609a.this.f69272a.m103655a(c22720a);
                    c22306cCall.unsafeSubscribe(c22720a);
                    ArrayList arrayList = new ArrayList();
                    synchronized (C15609a.this.f69274c) {
                        try {
                            for (Map.Entry<Integer, TRight> entry : C15609a.this.f69280i.entrySet()) {
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
                        C15609a.this.f69273b.onNext(ag50.this.f69271e.call(tleft, (TRight) it.next()));
                    }
                } catch (Throwable th2) {
                    f5f.m119492f(th2, this);
                }
            }
        }

        /* JADX INFO: renamed from: l.ag50$a$b */
        public final class b extends z3g0<TRight> {

            /* JADX INFO: renamed from: l.ag50$a$b$a */
            public final class a extends z3g0<TRightDuration> {

                /* JADX INFO: renamed from: e */
                public final int f69287e;

                /* JADX INFO: renamed from: f */
                public boolean f69288f = true;

                public a(int i) {
                    this.f69287e = i;
                }

                @Override // p149l.m250
                public void onCompleted() {
                    if (this.f69288f) {
                        this.f69288f = false;
                        b.this.m96293g(this.f69287e, this);
                    }
                }

                @Override // p149l.m250
                public void onError(Throwable th) {
                    b.this.onError(th);
                }

                @Override // p149l.m250
                public void onNext(TRightDuration trightduration) {
                    onCompleted();
                }
            }

            public b() {
            }

            /* JADX INFO: renamed from: g */
            public void m96293g(int i, c4g0 c4g0Var) {
                boolean z;
                synchronized (C15609a.this.f69274c) {
                    try {
                        z = C15609a.this.f69280i.remove(Integer.valueOf(i)) != null && C15609a.this.f69280i.isEmpty() && C15609a.this.f69278g;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C15609a c15609a = C15609a.this;
                if (!z) {
                    c15609a.f69272a.m103658d(c4g0Var);
                } else {
                    c15609a.f69273b.onCompleted();
                    C15609a.this.f69273b.unsubscribe();
                }
            }

            @Override // p149l.m250
            public void onCompleted() {
                boolean z;
                synchronized (C15609a.this.f69274c) {
                    try {
                        C15609a c15609a = C15609a.this;
                        z = true;
                        c15609a.f69278g = true;
                        if (!c15609a.f69275d && !c15609a.f69280i.isEmpty()) {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C15609a c15609a2 = C15609a.this;
                if (!z) {
                    c15609a2.f69272a.m103658d(this);
                } else {
                    c15609a2.f69273b.onCompleted();
                    C15609a.this.f69273b.unsubscribe();
                }
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                C15609a.this.f69273b.onError(th);
                C15609a.this.f69273b.unsubscribe();
            }

            @Override // p149l.m250
            public void onNext(TRight tright) {
                int i;
                int i2;
                synchronized (C15609a.this.f69274c) {
                    C15609a c15609a = C15609a.this;
                    i = c15609a.f69279h;
                    c15609a.f69279h = i + 1;
                    c15609a.f69280i.put(Integer.valueOf(i), tright);
                    i2 = C15609a.this.f69276e;
                }
                C15609a.this.f69272a.m103655a(new rie0());
                try {
                    C22306c<TRightDuration> c22306cCall = ag50.this.f69270d.call(tright);
                    a aVar = new a(i);
                    C15609a.this.f69272a.m103655a(aVar);
                    c22306cCall.unsafeSubscribe(aVar);
                    ArrayList arrayList = new ArrayList();
                    synchronized (C15609a.this.f69274c) {
                        try {
                            for (Map.Entry<Integer, TLeft> entry : C15609a.this.f69277f.entrySet()) {
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
                        C15609a.this.f69273b.onNext(ag50.this.f69271e.call((TLeft) it.next(), tright));
                    }
                } catch (Throwable th2) {
                    f5f.m119492f(th2, this);
                }
            }
        }

        public C15609a(z3g0<? super R> z3g0Var) {
            this.f69273b = z3g0Var;
        }

        /* JADX INFO: renamed from: a */
        public void m96291a() {
            this.f69273b.m217046b(this.f69272a);
            a aVar = new a();
            b bVar = new b();
            this.f69272a.m103655a(aVar);
            this.f69272a.m103655a(bVar);
            ag50.this.f69267a.unsafeSubscribe(aVar);
            ag50.this.f69268b.unsafeSubscribe(bVar);
        }
    }

    public ag50(C22306c<TLeft> c22306c, C22306c<TRight> c22306c2, w9j<TLeft, C22306c<TLeftDuration>> w9jVar, w9j<TRight, C22306c<TRightDuration>> w9jVar2, x9j<TLeft, TRight, R> x9jVar) {
        this.f69267a = c22306c;
        this.f69268b = c22306c2;
        this.f69269c = w9jVar;
        this.f69270d = w9jVar2;
        this.f69271e = x9jVar;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super R> z3g0Var) {
        new C15609a(new vie0(z3g0Var)).m96291a();
    }
}
