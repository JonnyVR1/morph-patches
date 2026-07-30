package p149l;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class uv50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f178499a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f178500b;

    /* JADX INFO: renamed from: c */
    public final bud0 f178501c;

    /* JADX INFO: renamed from: l.uv50$a */
    public static final class C20521a<T> extends z3g0<T> implements d30 {

        /* JADX INFO: renamed from: g */
        public static final Object f178502g = new Object();

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f178503e;

        /* JADX INFO: renamed from: f */
        public final AtomicReference<Object> f178504f = new AtomicReference<>(f178502g);

        public C20521a(z3g0<? super T> z3g0Var) {
            this.f178503e = z3g0Var;
        }

        @Override // p149l.d30
        public void call() {
            m196056g();
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo99382d() {
            m217048e(Long.MAX_VALUE);
        }

        /* JADX INFO: renamed from: g */
        public final void m196056g() {
            AtomicReference<Object> atomicReference = this.f178504f;
            Object obj = f178502g;
            Object andSet = atomicReference.getAndSet(obj);
            if (andSet != obj) {
                try {
                    this.f178503e.onNext(andSet);
                } catch (Throwable th) {
                    f5f.m119492f(th, this);
                }
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
            m196056g();
            this.f178503e.onCompleted();
            unsubscribe();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f178503e.onError(th);
            unsubscribe();
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f178504f.set(t);
        }
    }

    public uv50(long j, TimeUnit timeUnit, bud0 bud0Var) {
        this.f178499a = j;
        this.f178500b = timeUnit;
        this.f178501c = bud0Var;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        vie0 vie0Var = new vie0(z3g0Var);
        bud0.AbstractC15976a abstractC15976aCreateWorker = this.f178501c.createWorker();
        z3g0Var.m217046b(abstractC15976aCreateWorker);
        C20521a c20521a = new C20521a(vie0Var);
        z3g0Var.m217046b(c20521a);
        long j = this.f178499a;
        abstractC15976aCreateWorker.m103920d(c20521a, j, j, this.f178500b);
        return c20521a;
    }
}
