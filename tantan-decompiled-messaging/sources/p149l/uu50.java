package p149l;

import p133rx.C22306c;
import p133rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: classes3.dex */
public class uu50<T, R> implements C22306c.c<R, T> {

    /* JADX INFO: renamed from: a */
    public final Class<R> f178316a;

    /* JADX INFO: renamed from: l.uu50$a */
    public static final class C20514a<T, R> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super R> f178317e;

        /* JADX INFO: renamed from: f */
        public final Class<R> f178318f;

        /* JADX INFO: renamed from: g */
        public boolean f178319g;

        public C20514a(z3g0<? super R> z3g0Var, Class<R> cls) {
            this.f178317e = z3g0Var;
            this.f178318f = cls;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo106696f(rc90 rc90Var) {
            this.f178317e.mo106696f(rc90Var);
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f178319g) {
                return;
            }
            this.f178317e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            if (this.f178319g) {
                ejd0.m116793j(th);
            } else {
                this.f178319g = true;
                this.f178317e.onError(th);
            }
        }

        @Override // p149l.m250
        public void onNext(T t) {
            try {
                this.f178317e.onNext(this.f178318f.cast(t));
            } catch (Throwable th) {
                f5f.m119491e(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }
    }

    public uu50(Class<R> cls) {
        this.f178316a = cls;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super R> z3g0Var) {
        C20514a c20514a = new C20514a(z3g0Var, this.f178316a);
        z3g0Var.m217046b(c20514a);
        return c20514a;
    }
}
