package p003l;

import java.util.NoSuchElementException;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class eg50<T> implements C1099c.a<T> {

    /* JADX INFO: renamed from: a */
    public final C1099c<T> f3263a;

    /* JADX INFO: renamed from: b */
    public final x9j<T, T, T> f3264b;

    /* JADX INFO: renamed from: l.eg50$a */
    public class C0258a implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0259b f3265a;

        public C0258a(C0259b c0259b) {
            this.f3265a = c0259b;
        }

        @Override // p003l.rc90
        public void request(long j) {
            this.f3265a.m3828g(j);
        }
    }

    /* JADX INFO: renamed from: l.eg50$b */
    public static final class C0259b<T> extends z3g0<T> {

        /* JADX INFO: renamed from: h */
        public static final Object f3267h = new Object();

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f3268e;

        /* JADX INFO: renamed from: f */
        public final x9j<T, T, T> f3269f;

        /* JADX INFO: renamed from: g */
        public T f3270g = (T) f3267h;

        public C0259b(z3g0<? super T> z3g0Var, x9j<T, T, T> x9jVar) {
            this.f3268e = z3g0Var;
            this.f3269f = x9jVar;
            m9242e(0L);
        }

        /* JADX INFO: renamed from: g */
        public void m3828g(long j) {
            if (j < 0) {
                y3g0.m8887a("n >= 0 required but it was ", j);
            } else if (j != 0) {
                m9242e(Long.MAX_VALUE);
            }
        }

        @Override // p003l.m250
        public void onCompleted() {
            T t = this.f3270g;
            Object obj = f3267h;
            z3g0<? super T> z3g0Var = this.f3268e;
            if (t == obj) {
                z3g0Var.onError(new NoSuchElementException());
            } else {
                z3g0Var.onNext(t);
                this.f3268e.onCompleted();
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f3268e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            T t2 = this.f3270g;
            if (t2 == f3267h) {
                this.f3270g = t;
                return;
            }
            try {
                this.f3270g = this.f3269f.call(t2, t);
            } catch (Throwable th) {
                f5f.m3964e(th);
                unsubscribe();
                this.f3268e.onError(th);
            }
        }
    }

    public eg50(C1099c<T> c1099c, x9j<T, T, T> x9jVar) {
        this.f3263a = c1099c;
        this.f3264b = x9jVar;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        C0259b c0259b = new C0259b(z3g0Var, this.f3264b);
        z3g0Var.m9240b(c0259b);
        z3g0Var.mo3257f(new C0258a(c0259b));
        this.f3263a.unsafeSubscribe(c0259b);
    }
}
