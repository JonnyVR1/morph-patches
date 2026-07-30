package p003l;

import p014rx.C1099c;
import p014rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class cg50<T, R> implements C1099c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C1099c<T> f2641a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super T, ? extends R> f2642b;

    /* JADX INFO: renamed from: l.cg50$a */
    public static final class C0200a<T, R> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super R> f2643e;

        /* JADX INFO: renamed from: f */
        public final w9j<? super T, ? extends R> f2644f;

        /* JADX INFO: renamed from: g */
        public boolean f2645g;

        public C0200a(z3g0<? super R> z3g0Var, w9j<? super T, ? extends R> w9jVar) {
            this.f2643e = z3g0Var;
            this.f2644f = w9jVar;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo3257f(rc90 rc90Var) {
            this.f2643e.mo3257f(rc90Var);
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f2645g) {
                return;
            }
            this.f2643e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            if (this.f2645g) {
                ejd0.m3864j(th);
            } else {
                this.f2645g = true;
                this.f2643e.onError(th);
            }
        }

        @Override // p003l.m250
        public void onNext(T t) {
            try {
                this.f2643e.onNext(this.f2644f.call(t));
            } catch (Throwable th) {
                f5f.m3964e(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }
    }

    public cg50(C1099c<T> c1099c, w9j<? super T, ? extends R> w9jVar) {
        this.f2641a = c1099c;
        this.f2642b = w9jVar;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super R> z3g0Var) {
        C0200a c0200a = new C0200a(z3g0Var, this.f2642b);
        z3g0Var.m9240b(c0200a);
        this.f2641a.unsafeSubscribe(c0200a);
    }
}
