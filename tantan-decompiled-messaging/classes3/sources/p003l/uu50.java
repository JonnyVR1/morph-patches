package p003l;

import p014rx.C1099c;
import p014rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class uu50<T, R> implements C1099c.c<R, T> {

    /* JADX INFO: renamed from: a */
    public final Class<R> f8097a;

    /* JADX INFO: renamed from: l.uu50$a */
    public static final class C0584a<T, R> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super R> f8098e;

        /* JADX INFO: renamed from: f */
        public final Class<R> f8099f;

        /* JADX INFO: renamed from: g */
        public boolean f8100g;

        public C0584a(z3g0<? super R> z3g0Var, Class<R> cls) {
            this.f8098e = z3g0Var;
            this.f8099f = cls;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo3257f(rc90 rc90Var) {
            this.f8098e.mo3257f(rc90Var);
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f8100g) {
                return;
            }
            this.f8098e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            if (this.f8100g) {
                ejd0.m3864j(th);
            } else {
                this.f8100g = true;
                this.f8098e.onError(th);
            }
        }

        @Override // p003l.m250
        public void onNext(T t) {
            try {
                this.f8098e.onNext(this.f8099f.cast(t));
            } catch (Throwable th) {
                f5f.m3964e(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }
    }

    public uu50(Class<R> cls) {
        this.f8097a = cls;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super R> z3g0Var) {
        C0584a c0584a = new C0584a(z3g0Var, this.f8097a);
        z3g0Var.m9240b(c0584a);
        return c0584a;
    }
}
