package p003l;

import p014rx.C1099c;
import p014rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class xf50<T> implements C1099c.a<T> {

    /* JADX INFO: renamed from: a */
    public final C1099c<T> f8780a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super T, Boolean> f8781b;

    /* JADX INFO: renamed from: l.xf50$a */
    public static final class C0639a<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f8782e;

        /* JADX INFO: renamed from: f */
        public final w9j<? super T, Boolean> f8783f;

        /* JADX INFO: renamed from: g */
        public boolean f8784g;

        public C0639a(z3g0<? super T> z3g0Var, w9j<? super T, Boolean> w9jVar) {
            this.f8782e = z3g0Var;
            this.f8783f = w9jVar;
            m9242e(0L);
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo3257f(rc90 rc90Var) {
            super.mo3257f(rc90Var);
            this.f8782e.mo3257f(rc90Var);
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f8784g) {
                return;
            }
            this.f8782e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            if (this.f8784g) {
                ejd0.m3864j(th);
            } else {
                this.f8784g = true;
                this.f8782e.onError(th);
            }
        }

        @Override // p003l.m250
        public void onNext(T t) {
            try {
                if (this.f8783f.call(t).booleanValue()) {
                    this.f8782e.onNext(t);
                } else {
                    m9242e(1L);
                }
            } catch (Throwable th) {
                f5f.m3964e(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }
    }

    public xf50(C1099c<T> c1099c, w9j<? super T, Boolean> w9jVar) {
        this.f8780a = c1099c;
        this.f8781b = w9jVar;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        C0639a c0639a = new C0639a(z3g0Var, this.f8781b);
        z3g0Var.m9240b(c0639a);
        this.f8780a.unsafeSubscribe(c0639a);
    }
}
