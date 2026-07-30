package p014rx;

import java.util.concurrent.Callable;
import p003l.c4g0;
import p003l.e30;
import p003l.ejd0;
import p003l.em10;
import p003l.f5f;
import p003l.h4g0;
import p003l.mn5;
import p003l.u53;
import p003l.w9j;
import p003l.z3g0;

/* JADX INFO: renamed from: rx.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1098b {

    /* JADX INFO: renamed from: b */
    public static final C1098b f10726b = new C1098b(new b(), false);

    /* JADX INFO: renamed from: c */
    public static final C1098b f10727c = new C1098b(new e(), false);

    /* JADX INFO: renamed from: a */
    public final h f10728a;

    /* JADX INFO: renamed from: rx.b$a */
    public static class a implements h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1099c f10729a;

        /* JADX INFO: renamed from: rx.b$a$a, reason: collision with other inner class name */
        public class C1447a extends z3g0<Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ j f10730e;

            public C1447a(j jVar) {
                this.f10730e = jVar;
            }

            @Override // p003l.m250
            public void onCompleted() {
                this.f10730e.onCompleted();
            }

            @Override // p003l.m250
            public void onError(Throwable th) {
                this.f10730e.onError(th);
            }

            @Override // p003l.m250
            public void onNext(Object obj) {
            }
        }

        public a(C1099c c1099c) {
            this.f10729a = c1099c;
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(j jVar) {
            C1447a c1447a = new C1447a(jVar);
            jVar.onSubscribe(c1447a);
            this.f10729a.unsafeSubscribe(c1447a);
        }
    }

    /* JADX INFO: renamed from: rx.b$b */
    public static class b implements h {
        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(j jVar) {
            jVar.onSubscribe(h4g0.m4917d());
            jVar.onCompleted();
        }
    }

    /* JADX INFO: renamed from: rx.b$c */
    public class c implements j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ em10 f10732a;

        public c(em10 em10Var) {
            this.f10732a = em10Var;
        }

        @Override // p014rx.C1098b.j
        public void onCompleted() {
            this.f10732a.unsubscribe();
        }

        @Override // p014rx.C1098b.j
        public void onError(Throwable th) {
            ejd0.m3864j(th);
            this.f10732a.unsubscribe();
            C1098b.m9761d(th);
        }

        @Override // p014rx.C1098b.j
        public void onSubscribe(c4g0 c4g0Var) {
            this.f10732a.m3901a(c4g0Var);
        }
    }

    /* JADX INFO: renamed from: rx.b$d */
    public class d implements j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f10734a;

        public d(z3g0 z3g0Var) {
            this.f10734a = z3g0Var;
        }

        @Override // p014rx.C1098b.j
        public void onCompleted() {
            this.f10734a.onCompleted();
        }

        @Override // p014rx.C1098b.j
        public void onError(Throwable th) {
            this.f10734a.onError(th);
        }

        @Override // p014rx.C1098b.j
        public void onSubscribe(c4g0 c4g0Var) {
            this.f10734a.m9240b(c4g0Var);
        }
    }

    /* JADX INFO: renamed from: rx.b$e */
    public static class e implements h {
        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(j jVar) {
            jVar.onSubscribe(h4g0.m4917d());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: rx.b$f */
    public class f<T> implements C1099c.a<T> {
        public f() {
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            C1098b.this.m9770l(z3g0Var);
        }
    }

    /* JADX INFO: renamed from: rx.b$g */
    public static class g implements h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Callable f10737a;

        public g(Callable callable) {
            this.f10737a = callable;
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(j jVar) {
            u53 u53Var = new u53();
            jVar.onSubscribe(u53Var);
            try {
                this.f10737a.call();
                if (u53Var.isUnsubscribed()) {
                    return;
                }
                jVar.onCompleted();
            } catch (Throwable th) {
                if (u53Var.isUnsubscribed()) {
                    return;
                }
                jVar.onError(th);
            }
        }
    }

    /* JADX INFO: renamed from: rx.b$h */
    public interface h extends e30<j> {
    }

    /* JADX INFO: renamed from: rx.b$i */
    public interface i extends w9j<j, j> {
    }

    /* JADX INFO: renamed from: rx.b$j */
    public interface j {
        void onCompleted();

        void onError(Throwable th);

        void onSubscribe(c4g0 c4g0Var);
    }

    public C1098b(h hVar, boolean z) {
        this.f10728a = z ? ejd0.m3861g(hVar) : hVar;
    }

    /* JADX INFO: renamed from: c */
    public static C1098b m9760c(h hVar) {
        m9765h(hVar);
        try {
            return new C1098b(hVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            ejd0.m3864j(th);
            throw m9766j(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m9761d(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    /* JADX INFO: renamed from: e */
    public static C1098b m9762e(Callable<?> callable) {
        m9765h(callable);
        return m9760c(new g(callable));
    }

    /* JADX INFO: renamed from: f */
    public static C1098b m9763f(C1099c<?> c1099c) {
        m9765h(c1099c);
        return m9760c(new a(c1099c));
    }

    /* JADX INFO: renamed from: g */
    public static C1098b m9764g(Iterable<? extends C1098b> iterable) {
        m9765h(iterable);
        return m9760c(new mn5(iterable));
    }

    /* JADX INFO: renamed from: h */
    public static <T> T m9765h(T t) {
        t.getClass();
        return t;
    }

    /* JADX INFO: renamed from: j */
    public static NullPointerException m9766j(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    /* JADX INFO: renamed from: b */
    public final <T> C1099c<T> m9767b(C1099c<T> c1099c) {
        m9765h(c1099c);
        return c1099c.delaySubscription(m9769k());
    }

    /* JADX INFO: renamed from: i */
    public final c4g0 m9768i() {
        em10 em10Var = new em10();
        m9772n(new c(em10Var));
        return em10Var;
    }

    /* JADX INFO: renamed from: k */
    public final <T> C1099c<T> m9769k() {
        return C1099c.create(new f());
    }

    /* JADX INFO: renamed from: l */
    public final <T> void m9770l(z3g0<T> z3g0Var) {
        m9771m(z3g0Var, true);
    }

    /* JADX INFO: renamed from: m */
    public final <T> void m9771m(z3g0<T> z3g0Var, boolean z) {
        m9765h(z3g0Var);
        if (z) {
            try {
                z3g0Var.mo2918d();
            } catch (NullPointerException e2) {
                throw e2;
            } catch (Throwable th) {
                f5f.m3964e(th);
                Throwable thM3867m = ejd0.m3867m(th);
                ejd0.m3864j(thM3867m);
                throw m9766j(thM3867m);
            }
        }
        m9772n(new d(z3g0Var));
        ejd0.m3869o(z3g0Var);
    }

    /* JADX INFO: renamed from: n */
    public final void m9772n(j jVar) {
        m9765h(jVar);
        try {
            ejd0.m3859e(this, this.f10728a).call(jVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            f5f.m3964e(th);
            Throwable thM3858d = ejd0.m3858d(th);
            ejd0.m3864j(thM3858d);
            throw m9766j(thM3858d);
        }
    }

    public C1098b(h hVar) {
        this.f10728a = ejd0.m3861g(hVar);
    }
}
