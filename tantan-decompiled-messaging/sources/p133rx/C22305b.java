package p133rx;

import java.util.concurrent.Callable;
import p149l.c4g0;
import p149l.e30;
import p149l.ejd0;
import p149l.em10;
import p149l.f5f;
import p149l.h4g0;
import p149l.mn5;
import p149l.u53;
import p149l.w9j;
import p149l.z3g0;

/* JADX INFO: renamed from: rx.b */
/* JADX INFO: loaded from: classes3.dex */
public class C22305b {

    /* JADX INFO: renamed from: b */
    public static final C22305b f207101b = new C22305b(new b(), false);

    /* JADX INFO: renamed from: c */
    public static final C22305b f207102c = new C22305b(new e(), false);

    /* JADX INFO: renamed from: a */
    public final h f207103a;

    /* JADX INFO: renamed from: rx.b$a */
    public static class a implements h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C22306c f207104a;

        /* JADX INFO: renamed from: rx.b$a$a, reason: collision with other inner class name */
        public class C22731a extends z3g0<Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ j f207105e;

            public C22731a(j jVar) {
                this.f207105e = jVar;
            }

            @Override // p149l.m250
            public void onCompleted() {
                this.f207105e.onCompleted();
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                this.f207105e.onError(th);
            }

            @Override // p149l.m250
            public void onNext(Object obj) {
            }
        }

        public a(C22306c c22306c) {
            this.f207104a = c22306c;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(j jVar) {
            C22731a c22731a = new C22731a(jVar);
            jVar.onSubscribe(c22731a);
            this.f207104a.unsafeSubscribe(c22731a);
        }
    }

    /* JADX INFO: renamed from: rx.b$b */
    public static class b implements h {
        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(j jVar) {
            jVar.onSubscribe(h4g0.m129243d());
            jVar.onCompleted();
        }
    }

    /* JADX INFO: renamed from: rx.b$c */
    public class c implements j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ em10 f207107a;

        public c(em10 em10Var) {
            this.f207107a = em10Var;
        }

        @Override // p133rx.C22305b.j
        public void onCompleted() {
            this.f207107a.unsubscribe();
        }

        @Override // p133rx.C22305b.j
        public void onError(Throwable th) {
            ejd0.m116793j(th);
            this.f207107a.unsubscribe();
            C22305b.m221304d(th);
        }

        @Override // p133rx.C22305b.j
        public void onSubscribe(c4g0 c4g0Var) {
            this.f207107a.m117195a(c4g0Var);
        }
    }

    /* JADX INFO: renamed from: rx.b$d */
    public class d implements j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f207109a;

        public d(z3g0 z3g0Var) {
            this.f207109a = z3g0Var;
        }

        @Override // p133rx.C22305b.j
        public void onCompleted() {
            this.f207109a.onCompleted();
        }

        @Override // p133rx.C22305b.j
        public void onError(Throwable th) {
            this.f207109a.onError(th);
        }

        @Override // p133rx.C22305b.j
        public void onSubscribe(c4g0 c4g0Var) {
            this.f207109a.m217046b(c4g0Var);
        }
    }

    /* JADX INFO: renamed from: rx.b$e */
    public static class e implements h {
        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(j jVar) {
            jVar.onSubscribe(h4g0.m129243d());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: rx.b$f */
    public class f<T> implements C22306c.a<T> {
        public f() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            C22305b.this.m221313l(z3g0Var);
        }
    }

    /* JADX INFO: renamed from: rx.b$g */
    public static class g implements h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Callable f207112a;

        public g(Callable callable) {
            this.f207112a = callable;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(j jVar) {
            u53 u53Var = new u53();
            jVar.onSubscribe(u53Var);
            try {
                this.f207112a.call();
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

    public C22305b(h hVar, boolean z) {
        this.f207103a = z ? ejd0.m116790g(hVar) : hVar;
    }

    /* JADX INFO: renamed from: c */
    public static C22305b m221303c(h hVar) {
        m221308h(hVar);
        try {
            return new C22305b(hVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            ejd0.m116793j(th);
            throw m221309j(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m221304d(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    /* JADX INFO: renamed from: e */
    public static C22305b m221305e(Callable<?> callable) {
        m221308h(callable);
        return m221303c(new g(callable));
    }

    /* JADX INFO: renamed from: f */
    public static C22305b m221306f(C22306c<?> c22306c) {
        m221308h(c22306c);
        return m221303c(new a(c22306c));
    }

    /* JADX INFO: renamed from: g */
    public static C22305b m221307g(Iterable<? extends C22305b> iterable) {
        m221308h(iterable);
        return m221303c(new mn5(iterable));
    }

    /* JADX INFO: renamed from: h */
    public static <T> T m221308h(T t) {
        t.getClass();
        return t;
    }

    /* JADX INFO: renamed from: j */
    public static NullPointerException m221309j(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    /* JADX INFO: renamed from: b */
    public final <T> C22306c<T> m221310b(C22306c<T> c22306c) {
        m221308h(c22306c);
        return c22306c.delaySubscription(m221312k());
    }

    /* JADX INFO: renamed from: i */
    public final c4g0 m221311i() {
        em10 em10Var = new em10();
        m221315n(new c(em10Var));
        return em10Var;
    }

    /* JADX INFO: renamed from: k */
    public final <T> C22306c<T> m221312k() {
        return C22306c.create(new f());
    }

    /* JADX INFO: renamed from: l */
    public final <T> void m221313l(z3g0<T> z3g0Var) {
        m221314m(z3g0Var, true);
    }

    /* JADX INFO: renamed from: m */
    public final <T> void m221314m(z3g0<T> z3g0Var, boolean z) {
        m221308h(z3g0Var);
        if (z) {
            try {
                z3g0Var.mo99382d();
            } catch (NullPointerException e2) {
                throw e2;
            } catch (Throwable th) {
                f5f.m119491e(th);
                Throwable thM116796m = ejd0.m116796m(th);
                ejd0.m116793j(thM116796m);
                throw m221309j(thM116796m);
            }
        }
        m221315n(new d(z3g0Var));
        ejd0.m116798o(z3g0Var);
    }

    /* JADX INFO: renamed from: n */
    public final void m221315n(j jVar) {
        m221308h(jVar);
        try {
            ejd0.m116788e(this, this.f207103a).call(jVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            f5f.m119491e(th);
            Throwable thM116787d = ejd0.m116787d(th);
            ejd0.m116793j(thM116787d);
            throw m221309j(thM116787d);
        }
    }

    public C22305b(h hVar) {
        this.f207103a = ejd0.m116790g(hVar);
    }
}
