package p003l;

import java.util.concurrent.TimeUnit;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class zu50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f9432a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f9433b;

    /* JADX INFO: renamed from: c */
    public final bud0 f9434c;

    /* JADX INFO: renamed from: l.zu50$a */
    public class C0678a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final C0679b<T> f9435e;

        /* JADX INFO: renamed from: f */
        public final z3g0<?> f9436f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ rie0 f9437g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ bud0.AbstractC0185a f9438h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ vie0 f9439i;

        /* JADX INFO: renamed from: l.zu50$a$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f9441a;

            public a(int i) {
                this.f9441a = i;
            }

            @Override // p003l.d30
            public void call() {
                C0678a c0678a = C0678a.this;
                c0678a.f9435e.m9481b(this.f9441a, c0678a.f9439i, c0678a.f9436f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0678a(z3g0 z3g0Var, rie0 rie0Var, bud0.AbstractC0185a abstractC0185a, vie0 vie0Var) {
            super(z3g0Var);
            this.f9437g = rie0Var;
            this.f9438h = abstractC0185a;
            this.f9439i = vie0Var;
            this.f9435e = new C0679b<>();
            this.f9436f = this;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            m9242e(Long.MAX_VALUE);
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f9435e.m9482c(this.f9439i, this);
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f9439i.onError(th);
            unsubscribe();
            this.f9435e.m9480a();
        }

        @Override // p003l.m250
        public void onNext(T t) {
            int iM9483d = this.f9435e.m9483d(t);
            rie0 rie0Var = this.f9437g;
            bud0.AbstractC0185a abstractC0185a = this.f9438h;
            a aVar = new a(iM9483d);
            zu50 zu50Var = zu50.this;
            rie0Var.m7260b(abstractC0185a.mo2915c(aVar, zu50Var.f9432a, zu50Var.f9433b));
        }
    }

    /* JADX INFO: renamed from: l.zu50$b */
    public static final class C0679b<T> {

        /* JADX INFO: renamed from: a */
        public int f9443a;

        /* JADX INFO: renamed from: b */
        public T f9444b;

        /* JADX INFO: renamed from: c */
        public boolean f9445c;

        /* JADX INFO: renamed from: d */
        public boolean f9446d;

        /* JADX INFO: renamed from: e */
        public boolean f9447e;

        /* JADX INFO: renamed from: a */
        public synchronized void m9480a() {
            this.f9443a++;
            this.f9444b = null;
            this.f9445c = false;
        }

        /* JADX INFO: renamed from: b */
        public void m9481b(int i, z3g0<T> z3g0Var, z3g0<?> z3g0Var2) {
            synchronized (this) {
                if (!this.f9447e && this.f9445c && i == this.f9443a) {
                    T t = this.f9444b;
                    this.f9444b = null;
                    this.f9445c = false;
                    this.f9447e = true;
                    try {
                        z3g0Var.onNext(t);
                        synchronized (this) {
                            try {
                                if (this.f9446d) {
                                    z3g0Var.onCompleted();
                                } else {
                                    this.f9447e = false;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        f5f.m3966g(th2, z3g0Var2, t);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m9482c(z3g0<T> z3g0Var, z3g0<?> z3g0Var2) {
            synchronized (this) {
                try {
                    if (this.f9447e) {
                        this.f9446d = true;
                        return;
                    }
                    T t = this.f9444b;
                    boolean z = this.f9445c;
                    this.f9444b = null;
                    this.f9445c = false;
                    this.f9447e = true;
                    if (z) {
                        try {
                            z3g0Var.onNext(t);
                        } catch (Throwable th) {
                            f5f.m3966g(th, z3g0Var2, t);
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
        public synchronized int m9483d(T t) {
            int i;
            this.f9444b = t;
            this.f9445c = true;
            i = this.f9443a + 1;
            this.f9443a = i;
            return i;
        }
    }

    public zu50(long j, TimeUnit timeUnit, bud0 bud0Var) {
        this.f9432a = j;
        this.f9433b = timeUnit;
        this.f9434c = bud0Var;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        bud0.AbstractC0185a abstractC0185aCreateWorker = this.f9434c.createWorker();
        vie0 vie0Var = new vie0(z3g0Var);
        rie0 rie0Var = new rie0();
        vie0Var.m9240b(abstractC0185aCreateWorker);
        vie0Var.m9240b(rie0Var);
        return new C0678a(z3g0Var, rie0Var, abstractC0185aCreateWorker, vie0Var);
    }
}
