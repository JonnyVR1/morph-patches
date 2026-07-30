package p003l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class ag50<TLeft, TRight, TLeftDuration, TRightDuration, R> implements C1099c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C1099c<TLeft> f2182a;

    /* JADX INFO: renamed from: b */
    public final C1099c<TRight> f2183b;

    /* JADX INFO: renamed from: c */
    public final w9j<TLeft, C1099c<TLeftDuration>> f2184c;

    /* JADX INFO: renamed from: d */
    public final w9j<TRight, C1099c<TRightDuration>> f2185d;

    /* JADX INFO: renamed from: e */
    public final x9j<TLeft, TRight, R> f2186e;

    /* JADX INFO: renamed from: l.ag50$a */
    public final class C0163a {

        /* JADX INFO: renamed from: b */
        public final z3g0<? super R> f2188b;

        /* JADX INFO: renamed from: d */
        public boolean f2190d;

        /* JADX INFO: renamed from: e */
        public int f2191e;

        /* JADX INFO: renamed from: g */
        public boolean f2193g;

        /* JADX INFO: renamed from: h */
        public int f2194h;

        /* JADX INFO: renamed from: c */
        public final Object f2189c = new Object();

        /* JADX INFO: renamed from: a */
        public final bs5 f2187a = new bs5();

        /* JADX INFO: renamed from: f */
        public final Map<Integer, TLeft> f2192f = new HashMap();

        /* JADX INFO: renamed from: i */
        public final Map<Integer, TRight> f2195i = new HashMap();

        /* JADX INFO: renamed from: l.ag50$a$a */
        public final class a extends z3g0<TLeft> {

            /* JADX INFO: renamed from: l.ag50$a$a$a, reason: collision with other inner class name */
            public final class C1443a extends z3g0<TLeftDuration> {

                /* JADX INFO: renamed from: e */
                public final int f2198e;

                /* JADX INFO: renamed from: f */
                public boolean f2199f = true;

                public C1443a(int i) {
                    this.f2198e = i;
                }

                @Override // p003l.m250
                public void onCompleted() {
                    if (this.f2199f) {
                        this.f2199f = false;
                        a.this.m2867g(this.f2198e, this);
                    }
                }

                @Override // p003l.m250
                public void onError(Throwable th) {
                    a.this.onError(th);
                }

                @Override // p003l.m250
                public void onNext(TLeftDuration tleftduration) {
                    onCompleted();
                }
            }

            public a() {
            }

            /* JADX INFO: renamed from: g */
            public void m2867g(int i, c4g0 c4g0Var) {
                boolean z;
                synchronized (C0163a.this.f2189c) {
                    try {
                        z = C0163a.this.f2192f.remove(Integer.valueOf(i)) != null && C0163a.this.f2192f.isEmpty() && C0163a.this.f2190d;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C0163a c0163a = C0163a.this;
                if (!z) {
                    c0163a.f2187a.m3167d(c4g0Var);
                } else {
                    c0163a.f2188b.onCompleted();
                    C0163a.this.f2188b.unsubscribe();
                }
            }

            @Override // p003l.m250
            public void onCompleted() {
                boolean z;
                synchronized (C0163a.this.f2189c) {
                    try {
                        C0163a c0163a = C0163a.this;
                        z = true;
                        c0163a.f2190d = true;
                        if (!c0163a.f2193g && !c0163a.f2192f.isEmpty()) {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C0163a c0163a2 = C0163a.this;
                if (!z) {
                    c0163a2.f2187a.m3167d(this);
                } else {
                    c0163a2.f2188b.onCompleted();
                    C0163a.this.f2188b.unsubscribe();
                }
            }

            @Override // p003l.m250
            public void onError(Throwable th) {
                C0163a.this.f2188b.onError(th);
                C0163a.this.f2188b.unsubscribe();
            }

            @Override // p003l.m250
            public void onNext(TLeft tleft) {
                int i;
                C0163a c0163a;
                int i2;
                synchronized (C0163a.this.f2189c) {
                    C0163a c0163a2 = C0163a.this;
                    i = c0163a2.f2191e;
                    c0163a2.f2191e = i + 1;
                    c0163a2.f2192f.put(Integer.valueOf(i), tleft);
                    c0163a = C0163a.this;
                    i2 = c0163a.f2194h;
                }
                try {
                    C1099c<TLeftDuration> c1099cCall = ag50.this.f2184c.call(tleft);
                    C1443a c1443a = new C1443a(i);
                    C0163a.this.f2187a.m3164a(c1443a);
                    c1099cCall.unsafeSubscribe(c1443a);
                    ArrayList arrayList = new ArrayList();
                    synchronized (C0163a.this.f2189c) {
                        try {
                            for (Map.Entry<Integer, TRight> entry : C0163a.this.f2195i.entrySet()) {
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
                        C0163a.this.f2188b.onNext(ag50.this.f2186e.call(tleft, (TRight) it.next()));
                    }
                } catch (Throwable th2) {
                    f5f.m3965f(th2, this);
                }
            }
        }

        /* JADX INFO: renamed from: l.ag50$a$b */
        public final class b extends z3g0<TRight> {

            /* JADX INFO: renamed from: l.ag50$a$b$a */
            public final class a extends z3g0<TRightDuration> {

                /* JADX INFO: renamed from: e */
                public final int f2202e;

                /* JADX INFO: renamed from: f */
                public boolean f2203f = true;

                public a(int i) {
                    this.f2202e = i;
                }

                @Override // p003l.m250
                public void onCompleted() {
                    if (this.f2203f) {
                        this.f2203f = false;
                        b.this.m2868g(this.f2202e, this);
                    }
                }

                @Override // p003l.m250
                public void onError(Throwable th) {
                    b.this.onError(th);
                }

                @Override // p003l.m250
                public void onNext(TRightDuration trightduration) {
                    onCompleted();
                }
            }

            public b() {
            }

            /* JADX INFO: renamed from: g */
            public void m2868g(int i, c4g0 c4g0Var) {
                boolean z;
                synchronized (C0163a.this.f2189c) {
                    try {
                        z = C0163a.this.f2195i.remove(Integer.valueOf(i)) != null && C0163a.this.f2195i.isEmpty() && C0163a.this.f2193g;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C0163a c0163a = C0163a.this;
                if (!z) {
                    c0163a.f2187a.m3167d(c4g0Var);
                } else {
                    c0163a.f2188b.onCompleted();
                    C0163a.this.f2188b.unsubscribe();
                }
            }

            @Override // p003l.m250
            public void onCompleted() {
                boolean z;
                synchronized (C0163a.this.f2189c) {
                    try {
                        C0163a c0163a = C0163a.this;
                        z = true;
                        c0163a.f2193g = true;
                        if (!c0163a.f2190d && !c0163a.f2195i.isEmpty()) {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C0163a c0163a2 = C0163a.this;
                if (!z) {
                    c0163a2.f2187a.m3167d(this);
                } else {
                    c0163a2.f2188b.onCompleted();
                    C0163a.this.f2188b.unsubscribe();
                }
            }

            @Override // p003l.m250
            public void onError(Throwable th) {
                C0163a.this.f2188b.onError(th);
                C0163a.this.f2188b.unsubscribe();
            }

            @Override // p003l.m250
            public void onNext(TRight tright) {
                int i;
                int i2;
                synchronized (C0163a.this.f2189c) {
                    C0163a c0163a = C0163a.this;
                    i = c0163a.f2194h;
                    c0163a.f2194h = i + 1;
                    c0163a.f2195i.put(Integer.valueOf(i), tright);
                    i2 = C0163a.this.f2191e;
                }
                C0163a.this.f2187a.m3164a(new rie0());
                try {
                    C1099c<TRightDuration> c1099cCall = ag50.this.f2185d.call(tright);
                    a aVar = new a(i);
                    C0163a.this.f2187a.m3164a(aVar);
                    c1099cCall.unsafeSubscribe(aVar);
                    ArrayList arrayList = new ArrayList();
                    synchronized (C0163a.this.f2189c) {
                        try {
                            for (Map.Entry<Integer, TLeft> entry : C0163a.this.f2192f.entrySet()) {
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
                        C0163a.this.f2188b.onNext(ag50.this.f2186e.call((TLeft) it.next(), tright));
                    }
                } catch (Throwable th2) {
                    f5f.m3965f(th2, this);
                }
            }
        }

        public C0163a(z3g0<? super R> z3g0Var) {
            this.f2188b = z3g0Var;
        }

        /* JADX INFO: renamed from: a */
        public void m2866a() {
            this.f2188b.m9240b(this.f2187a);
            a aVar = new a();
            b bVar = new b();
            this.f2187a.m3164a(aVar);
            this.f2187a.m3164a(bVar);
            ag50.this.f2182a.unsafeSubscribe(aVar);
            ag50.this.f2183b.unsafeSubscribe(bVar);
        }
    }

    public ag50(C1099c<TLeft> c1099c, C1099c<TRight> c1099c2, w9j<TLeft, C1099c<TLeftDuration>> w9jVar, w9j<TRight, C1099c<TRightDuration>> w9jVar2, x9j<TLeft, TRight, R> x9jVar) {
        this.f2182a = c1099c;
        this.f2183b = c1099c2;
        this.f2184c = w9jVar;
        this.f2185d = w9jVar2;
        this.f2186e = x9jVar;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super R> z3g0Var) {
        new C0163a(new vie0(z3g0Var)).m2866a();
    }
}
