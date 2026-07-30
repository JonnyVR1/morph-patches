package p149l;

import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class zu50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f204810a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f204811b;

    /* JADX INFO: renamed from: c */
    public final bud0 f204812c;

    /* JADX INFO: renamed from: l.zu50$a */
    public class C21770a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final C21771b<T> f204813e;

        /* JADX INFO: renamed from: f */
        public final z3g0<?> f204814f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ rie0 f204815g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ bud0.AbstractC15976a f204816h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ vie0 f204817i;

        /* JADX INFO: renamed from: l.zu50$a$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f204819a;

            public a(int i) {
                this.f204819a = i;
            }

            @Override // p149l.d30
            public void call() {
                C21770a c21770a = C21770a.this;
                c21770a.f204813e.m220198b(this.f204819a, c21770a.f204817i, c21770a.f204814f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21770a(z3g0 z3g0Var, rie0 rie0Var, bud0.AbstractC15976a abstractC15976a, vie0 vie0Var) {
            super(z3g0Var);
            this.f204815g = rie0Var;
            this.f204816h = abstractC15976a;
            this.f204817i = vie0Var;
            this.f204813e = new C21771b<>();
            this.f204814f = this;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo99382d() {
            m217048e(Long.MAX_VALUE);
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f204813e.m220199c(this.f204817i, this);
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f204817i.onError(th);
            unsubscribe();
            this.f204813e.m220197a();
        }

        @Override // p149l.m250
        public void onNext(T t) {
            int iM220200d = this.f204813e.m220200d(t);
            rie0 rie0Var = this.f204815g;
            bud0.AbstractC15976a abstractC15976a = this.f204816h;
            a aVar = new a(iM220200d);
            zu50 zu50Var = zu50.this;
            rie0Var.m179504b(abstractC15976a.mo99202c(aVar, zu50Var.f204810a, zu50Var.f204811b));
        }
    }

    /* JADX INFO: renamed from: l.zu50$b */
    public static final class C21771b<T> {

        /* JADX INFO: renamed from: a */
        public int f204821a;

        /* JADX INFO: renamed from: b */
        public T f204822b;

        /* JADX INFO: renamed from: c */
        public boolean f204823c;

        /* JADX INFO: renamed from: d */
        public boolean f204824d;

        /* JADX INFO: renamed from: e */
        public boolean f204825e;

        /* JADX INFO: renamed from: a */
        public synchronized void m220197a() {
            this.f204821a++;
            this.f204822b = null;
            this.f204823c = false;
        }

        /* JADX INFO: renamed from: b */
        public void m220198b(int i, z3g0<T> z3g0Var, z3g0<?> z3g0Var2) {
            synchronized (this) {
                if (!this.f204825e && this.f204823c && i == this.f204821a) {
                    T t = this.f204822b;
                    this.f204822b = null;
                    this.f204823c = false;
                    this.f204825e = true;
                    try {
                        z3g0Var.onNext(t);
                        synchronized (this) {
                            try {
                                if (this.f204824d) {
                                    z3g0Var.onCompleted();
                                } else {
                                    this.f204825e = false;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        f5f.m119493g(th2, z3g0Var2, t);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m220199c(z3g0<T> z3g0Var, z3g0<?> z3g0Var2) {
            synchronized (this) {
                try {
                    if (this.f204825e) {
                        this.f204824d = true;
                        return;
                    }
                    T t = this.f204822b;
                    boolean z = this.f204823c;
                    this.f204822b = null;
                    this.f204823c = false;
                    this.f204825e = true;
                    if (z) {
                        try {
                            z3g0Var.onNext(t);
                        } catch (Throwable th) {
                            f5f.m119493g(th, z3g0Var2, t);
                            return;
                        }
                    }
                    z3g0Var.onCompleted();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public synchronized int m220200d(T t) {
            int i;
            this.f204822b = t;
            this.f204823c = true;
            i = this.f204821a + 1;
            this.f204821a = i;
            return i;
        }
    }

    public zu50(long j, TimeUnit timeUnit, bud0 bud0Var) {
        this.f204810a = j;
        this.f204811b = timeUnit;
        this.f204812c = bud0Var;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        bud0.AbstractC15976a abstractC15976aCreateWorker = this.f204812c.createWorker();
        vie0 vie0Var = new vie0(z3g0Var);
        rie0 rie0Var = new rie0();
        vie0Var.m217046b(abstractC15976aCreateWorker);
        vie0Var.m217046b(rie0Var);
        return new C21770a(z3g0Var, rie0Var, abstractC15976aCreateWorker, vie0Var);
    }
}
