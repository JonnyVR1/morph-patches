package p149l;

import java.util.NoSuchElementException;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class eg50<T> implements C22306c.a<T> {

    /* JADX INFO: renamed from: a */
    public final C22306c<T> f90893a;

    /* JADX INFO: renamed from: b */
    public final x9j<T, T, T> f90894b;

    /* JADX INFO: renamed from: l.eg50$a */
    public class C16590a implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C16591b f90895a;

        public C16590a(C16591b c16591b) {
            this.f90895a = c16591b;
        }

        @Override // p149l.rc90
        public void request(long j) {
            this.f90895a.m116235g(j);
        }
    }

    /* JADX INFO: renamed from: l.eg50$b */
    public static final class C16591b<T> extends z3g0<T> {

        /* JADX INFO: renamed from: h */
        public static final Object f90897h = new Object();

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f90898e;

        /* JADX INFO: renamed from: f */
        public final x9j<T, T, T> f90899f;

        /* JADX INFO: renamed from: g */
        public T f90900g = (T) f90897h;

        public C16591b(z3g0<? super T> z3g0Var, x9j<T, T, T> x9jVar) {
            this.f90898e = z3g0Var;
            this.f90899f = x9jVar;
            m217048e(0L);
        }

        /* JADX INFO: renamed from: g */
        public void m116235g(long j) {
            if (j < 0) {
                y3g0.m212802a("n >= 0 required but it was ", j);
            } else if (j != 0) {
                m217048e(Long.MAX_VALUE);
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
            T t = this.f90900g;
            Object obj = f90897h;
            z3g0<? super T> z3g0Var = this.f90898e;
            if (t == obj) {
                z3g0Var.onError(new NoSuchElementException());
            } else {
                z3g0Var.onNext(t);
                this.f90898e.onCompleted();
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f90898e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            T t2 = this.f90900g;
            if (t2 == f90897h) {
                this.f90900g = t;
                return;
            }
            try {
                this.f90900g = this.f90899f.call(t2, t);
            } catch (Throwable th) {
                f5f.m119491e(th);
                unsubscribe();
                this.f90898e.onError(th);
            }
        }
    }

    public eg50(C22306c<T> c22306c, x9j<T, T, T> x9jVar) {
        this.f90893a = c22306c;
        this.f90894b = x9jVar;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        C16591b c16591b = new C16591b(z3g0Var, this.f90894b);
        z3g0Var.m217046b(c16591b);
        z3g0Var.mo106696f(new C16590a(c16591b));
        this.f90893a.unsafeSubscribe(c16591b);
    }
}
