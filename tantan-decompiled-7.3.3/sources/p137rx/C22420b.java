package p137rx;

import java.util.concurrent.Callable;
import p153l.gcg0;
import p153l.hrd0;
import p153l.j6f;
import p153l.k63;
import p153l.kcg0;
import p153l.mu10;
import p153l.pcg0;
import p153l.qcj;
import p153l.qo5;
import p153l.y20;

/* JADX INFO: renamed from: rx.b */
/* JADX INFO: loaded from: classes3.dex */
public class C22420b {

    /* JADX INFO: renamed from: b */
    public static final C22420b f208023b = new C22420b(new b(), false);

    /* JADX INFO: renamed from: c */
    public static final C22420b f208024c = new C22420b(new e(), false);

    /* JADX INFO: renamed from: a */
    public final h f208025a;

    /* JADX INFO: renamed from: rx.b$a */
    public static class a implements h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C22421c f208026a;

        /* JADX INFO: renamed from: rx.b$a$a, reason: collision with other inner class name */
        public class C22847a extends gcg0<Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ j f208027e;

            public C22847a(j jVar) {
                this.f208027e = jVar;
            }

            @Override // p153l.bb50
            public void onCompleted() {
                this.f208027e.onCompleted();
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                this.f208027e.onError(th);
            }

            @Override // p153l.bb50
            public void onNext(Object obj) {
            }
        }

        public a(C22421c c22421c) {
            this.f208026a = c22421c;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(j jVar) {
            C22847a c22847a = new C22847a(jVar);
            jVar.onSubscribe(c22847a);
            this.f208026a.unsafeSubscribe(c22847a);
        }
    }

    /* JADX INFO: renamed from: rx.b$b */
    public static class b implements h {
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(j jVar) {
            jVar.onSubscribe(pcg0.m171651d());
            jVar.onCompleted();
        }
    }

    /* JADX INFO: renamed from: rx.b$c */
    public class c implements j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ mu10 f208029a;

        public c(mu10 mu10Var) {
            this.f208029a = mu10Var;
        }

        @Override // p137rx.C22420b.j
        public void onCompleted() {
            this.f208029a.unsubscribe();
        }

        @Override // p137rx.C22420b.j
        public void onError(Throwable th) {
            hrd0.m136792j(th);
            this.f208029a.unsubscribe();
            C22420b.m222550d(th);
        }

        @Override // p137rx.C22420b.j
        public void onSubscribe(kcg0 kcg0Var) {
            this.f208029a.m160064a(kcg0Var);
        }
    }

    /* JADX INFO: renamed from: rx.b$d */
    public class d implements j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gcg0 f208031a;

        public d(gcg0 gcg0Var) {
            this.f208031a = gcg0Var;
        }

        @Override // p137rx.C22420b.j
        public void onCompleted() {
            this.f208031a.onCompleted();
        }

        @Override // p137rx.C22420b.j
        public void onError(Throwable th) {
            this.f208031a.onError(th);
        }

        @Override // p137rx.C22420b.j
        public void onSubscribe(kcg0 kcg0Var) {
            this.f208031a.m129866b(kcg0Var);
        }
    }

    /* JADX INFO: renamed from: rx.b$e */
    public static class e implements h {
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(j jVar) {
            jVar.onSubscribe(pcg0.m171651d());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: rx.b$f */
    public class f<T> implements C22421c.a<T> {
        public f() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super T> gcg0Var) {
            C22420b.this.m222559l(gcg0Var);
        }
    }

    /* JADX INFO: renamed from: rx.b$g */
    public static class g implements h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Callable f208034a;

        public g(Callable callable) {
            this.f208034a = callable;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(j jVar) {
            k63 k63Var = new k63();
            jVar.onSubscribe(k63Var);
            try {
                this.f208034a.call();
                if (k63Var.isUnsubscribed()) {
                    return;
                }
                jVar.onCompleted();
            } catch (Throwable th) {
                if (k63Var.isUnsubscribed()) {
                    return;
                }
                jVar.onError(th);
            }
        }
    }

    /* JADX INFO: renamed from: rx.b$h */
    public interface h extends y20<j> {
    }

    /* JADX INFO: renamed from: rx.b$i */
    public interface i extends qcj<j, j> {
    }

    /* JADX INFO: renamed from: rx.b$j */
    public interface j {
        void onCompleted();

        void onError(Throwable th);

        void onSubscribe(kcg0 kcg0Var);
    }

    public C22420b(h hVar, boolean z) {
        this.f208025a = z ? hrd0.m136789g(hVar) : hVar;
    }

    /* JADX INFO: renamed from: c */
    public static C22420b m222549c(h hVar) {
        m222554h(hVar);
        try {
            return new C22420b(hVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            hrd0.m136792j(th);
            throw m222555j(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m222550d(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    /* JADX INFO: renamed from: e */
    public static C22420b m222551e(Callable<?> callable) {
        m222554h(callable);
        return m222549c(new g(callable));
    }

    /* JADX INFO: renamed from: f */
    public static C22420b m222552f(C22421c<?> c22421c) {
        m222554h(c22421c);
        return m222549c(new a(c22421c));
    }

    /* JADX INFO: renamed from: g */
    public static C22420b m222553g(Iterable<? extends C22420b> iterable) {
        m222554h(iterable);
        return m222549c(new qo5(iterable));
    }

    /* JADX INFO: renamed from: h */
    public static <T> T m222554h(T t) {
        t.getClass();
        return t;
    }

    /* JADX INFO: renamed from: j */
    public static NullPointerException m222555j(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    /* JADX INFO: renamed from: b */
    public final <T> C22421c<T> m222556b(C22421c<T> c22421c) {
        m222554h(c22421c);
        return c22421c.delaySubscription(m222558k());
    }

    /* JADX INFO: renamed from: i */
    public final kcg0 m222557i() {
        mu10 mu10Var = new mu10();
        m222561n(new c(mu10Var));
        return mu10Var;
    }

    /* JADX INFO: renamed from: k */
    public final <T> C22421c<T> m222558k() {
        return C22421c.create(new f());
    }

    /* JADX INFO: renamed from: l */
    public final <T> void m222559l(gcg0<T> gcg0Var) {
        m222560m(gcg0Var, true);
    }

    /* JADX INFO: renamed from: m */
    public final <T> void m222560m(gcg0<T> gcg0Var, boolean z) {
        m222554h(gcg0Var);
        if (z) {
            try {
                gcg0Var.mo95884d();
            } catch (NullPointerException e2) {
                throw e2;
            } catch (Throwable th) {
                j6f.m143663e(th);
                Throwable thM136795m = hrd0.m136795m(th);
                hrd0.m136792j(thM136795m);
                throw m222555j(thM136795m);
            }
        }
        m222561n(new d(gcg0Var));
        hrd0.m136797o(gcg0Var);
    }

    /* JADX INFO: renamed from: n */
    public final void m222561n(j jVar) {
        m222554h(jVar);
        try {
            hrd0.m136787e(this, this.f208025a).call(jVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            j6f.m143663e(th);
            Throwable thM136786d = hrd0.m136786d(th);
            hrd0.m136792j(thM136786d);
            throw m222555j(thM136786d);
        }
    }

    public C22420b(h hVar) {
        this.f208025a = hrd0.m136789g(hVar);
    }
}
