package p003l;

import java.util.concurrent.TimeoutException;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class sw50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0539a<T> f7344a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0540b<T> f7345b;

    /* JADX INFO: renamed from: c */
    public final C1099c<? extends T> f7346c;

    /* JADX INFO: renamed from: d */
    public final bud0 f7347d;

    /* JADX INFO: renamed from: l.sw50$a */
    public interface InterfaceC0539a<T> extends y9j<C0541c<T>, Long, bud0.AbstractC0185a, c4g0> {
    }

    /* JADX INFO: renamed from: l.sw50$b */
    public interface InterfaceC0540b<T> extends z9j<C0541c<T>, Long, T, bud0.AbstractC0185a, c4g0> {
    }

    /* JADX INFO: renamed from: l.sw50$c */
    public static final class C0541c<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final rie0 f7348e;

        /* JADX INFO: renamed from: f */
        public final vie0<T> f7349f;

        /* JADX INFO: renamed from: g */
        public final InterfaceC0540b<T> f7350g;

        /* JADX INFO: renamed from: h */
        public final C1099c<? extends T> f7351h;

        /* JADX INFO: renamed from: i */
        public final bud0.AbstractC0185a f7352i;

        /* JADX INFO: renamed from: j */
        public final tc90 f7353j = new tc90();

        /* JADX INFO: renamed from: k */
        public boolean f7354k;

        /* JADX INFO: renamed from: l */
        public long f7355l;

        /* JADX INFO: renamed from: l.sw50$c$a */
        public class a extends z3g0<T> {
            public a() {
            }

            @Override // p003l.z3g0
            /* JADX INFO: renamed from: f */
            public void mo3257f(rc90 rc90Var) {
                C0541c.this.f7353j.m7738c(rc90Var);
            }

            @Override // p003l.m250
            public void onCompleted() {
                C0541c.this.f7349f.onCompleted();
            }

            @Override // p003l.m250
            public void onError(Throwable th) {
                C0541c.this.f7349f.onError(th);
            }

            @Override // p003l.m250
            public void onNext(T t) {
                C0541c.this.f7349f.onNext(t);
            }
        }

        public C0541c(vie0<T> vie0Var, InterfaceC0540b<T> interfaceC0540b, rie0 rie0Var, C1099c<? extends T> c1099c, bud0.AbstractC0185a abstractC0185a) {
            this.f7349f = vie0Var;
            this.f7350g = interfaceC0540b;
            this.f7348e = rie0Var;
            this.f7351h = c1099c;
            this.f7352i = abstractC0185a;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo3257f(rc90 rc90Var) {
            this.f7353j.m7738c(rc90Var);
        }

        /* JADX INFO: renamed from: g */
        public void m7647g(long j) {
            boolean z;
            synchronized (this) {
                try {
                    if (j != this.f7355l || this.f7354k) {
                        z = false;
                    } else {
                        z = true;
                        this.f7354k = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                if (this.f7351h == null) {
                    this.f7349f.onError(new TimeoutException());
                    return;
                }
                a aVar = new a();
                this.f7351h.unsafeSubscribe(aVar);
                this.f7348e.m7260b(aVar);
            }
        }

        @Override // p003l.m250
        public void onCompleted() {
            boolean z;
            synchronized (this) {
                try {
                    if (this.f7354k) {
                        z = false;
                    } else {
                        z = true;
                        this.f7354k = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                this.f7348e.unsubscribe();
                this.f7349f.onCompleted();
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            boolean z;
            synchronized (this) {
                try {
                    if (this.f7354k) {
                        z = false;
                    } else {
                        z = true;
                        this.f7354k = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z) {
                this.f7348e.unsubscribe();
                this.f7349f.onError(th);
            }
        }

        @Override // p003l.m250
        public void onNext(T t) {
            long j;
            boolean z;
            synchronized (this) {
                try {
                    boolean z2 = this.f7354k;
                    j = this.f7355l;
                    if (z2) {
                        z = false;
                    } else {
                        j++;
                        this.f7355l = j;
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                this.f7349f.onNext(t);
                this.f7348e.m7260b(this.f7350g.mo6904b(this, Long.valueOf(j), t, this.f7352i));
            }
        }
    }

    public sw50(InterfaceC0539a<T> interfaceC0539a, InterfaceC0540b<T> interfaceC0540b, C1099c<? extends T> c1099c, bud0 bud0Var) {
        this.f7344a = interfaceC0539a;
        this.f7345b = interfaceC0540b;
        this.f7346c = c1099c;
        this.f7347d = bud0Var;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        bud0.AbstractC0185a abstractC0185aCreateWorker = this.f7347d.createWorker();
        z3g0Var.m9240b(abstractC0185aCreateWorker);
        vie0 vie0Var = new vie0(z3g0Var);
        rie0 rie0Var = new rie0();
        vie0Var.m9240b(rie0Var);
        C0541c c0541c = new C0541c(vie0Var, this.f7345b, rie0Var, this.f7346c, abstractC0185aCreateWorker);
        vie0Var.m9240b(c0541c);
        vie0Var.mo3257f(c0541c.f7353j);
        rie0Var.m7260b(this.f7344a.mo2764a(c0541c, 0L, abstractC0185aCreateWorker));
        return c0541c;
    }
}
