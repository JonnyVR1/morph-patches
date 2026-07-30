package p149l;

import java.util.concurrent.TimeoutException;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class sw50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC20044a<T> f166620a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC20045b<T> f166621b;

    /* JADX INFO: renamed from: c */
    public final C22306c<? extends T> f166622c;

    /* JADX INFO: renamed from: d */
    public final bud0 f166623d;

    /* JADX INFO: renamed from: l.sw50$a */
    public interface InterfaceC20044a<T> extends y9j<C20046c<T>, Long, bud0.AbstractC15976a, c4g0> {
    }

    /* JADX INFO: renamed from: l.sw50$b */
    public interface InterfaceC20045b<T> extends z9j<C20046c<T>, Long, T, bud0.AbstractC15976a, c4g0> {
    }

    /* JADX INFO: renamed from: l.sw50$c */
    public static final class C20046c<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final rie0 f166624e;

        /* JADX INFO: renamed from: f */
        public final vie0<T> f166625f;

        /* JADX INFO: renamed from: g */
        public final InterfaceC20045b<T> f166626g;

        /* JADX INFO: renamed from: h */
        public final C22306c<? extends T> f166627h;

        /* JADX INFO: renamed from: i */
        public final bud0.AbstractC15976a f166628i;

        /* JADX INFO: renamed from: j */
        public final tc90 f166629j = new tc90();

        /* JADX INFO: renamed from: k */
        public boolean f166630k;

        /* JADX INFO: renamed from: l */
        public long f166631l;

        /* JADX INFO: renamed from: l.sw50$c$a */
        public class a extends z3g0<T> {
            public a() {
            }

            @Override // p149l.z3g0
            /* JADX INFO: renamed from: f */
            public void mo106696f(rc90 rc90Var) {
                C20046c.this.f166629j.m187981c(rc90Var);
            }

            @Override // p149l.m250
            public void onCompleted() {
                C20046c.this.f166625f.onCompleted();
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                C20046c.this.f166625f.onError(th);
            }

            @Override // p149l.m250
            public void onNext(T t) {
                C20046c.this.f166625f.onNext(t);
            }
        }

        public C20046c(vie0<T> vie0Var, InterfaceC20045b<T> interfaceC20045b, rie0 rie0Var, C22306c<? extends T> c22306c, bud0.AbstractC15976a abstractC15976a) {
            this.f166625f = vie0Var;
            this.f166626g = interfaceC20045b;
            this.f166624e = rie0Var;
            this.f166627h = c22306c;
            this.f166628i = abstractC15976a;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo106696f(rc90 rc90Var) {
            this.f166629j.m187981c(rc90Var);
        }

        /* JADX INFO: renamed from: g */
        public void m186125g(long j) {
            boolean z;
            synchronized (this) {
                try {
                    if (j != this.f166631l || this.f166630k) {
                        z = false;
                    } else {
                        z = true;
                        this.f166630k = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                if (this.f166627h == null) {
                    this.f166625f.onError(new TimeoutException());
                    return;
                }
                a aVar = new a();
                this.f166627h.unsafeSubscribe(aVar);
                this.f166624e.m179504b(aVar);
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
            boolean z;
            synchronized (this) {
                try {
                    if (this.f166630k) {
                        z = false;
                    } else {
                        z = true;
                        this.f166630k = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                this.f166624e.unsubscribe();
                this.f166625f.onCompleted();
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            boolean z;
            synchronized (this) {
                try {
                    if (this.f166630k) {
                        z = false;
                    } else {
                        z = true;
                        this.f166630k = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z) {
                this.f166624e.unsubscribe();
                this.f166625f.onError(th);
            }
        }

        @Override // p149l.m250
        public void onNext(T t) {
            long j;
            boolean z;
            synchronized (this) {
                try {
                    boolean z2 = this.f166630k;
                    j = this.f166631l;
                    if (z2) {
                        z = false;
                    } else {
                        j++;
                        this.f166631l = j;
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                this.f166625f.onNext(t);
                this.f166624e.m179504b(this.f166626g.mo100621b(this, Long.valueOf(j), t, this.f166628i));
            }
        }
    }

    public sw50(InterfaceC20044a<T> interfaceC20044a, InterfaceC20045b<T> interfaceC20045b, C22306c<? extends T> c22306c, bud0 bud0Var) {
        this.f166620a = interfaceC20044a;
        this.f166621b = interfaceC20045b;
        this.f166622c = c22306c;
        this.f166623d = bud0Var;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        bud0.AbstractC15976a abstractC15976aCreateWorker = this.f166623d.createWorker();
        z3g0Var.m217046b(abstractC15976aCreateWorker);
        vie0 vie0Var = new vie0(z3g0Var);
        rie0 rie0Var = new rie0();
        vie0Var.m217046b(rie0Var);
        C20046c c20046c = new C20046c(vie0Var, this.f166621b, rie0Var, this.f166622c, abstractC15976aCreateWorker);
        vie0Var.m217046b(c20046c);
        vie0Var.mo106696f(c20046c.f166629j);
        rie0Var.m179504b(this.f166620a.mo94599a(c20046c, 0L, abstractC15976aCreateWorker));
        return c20046c;
    }
}
