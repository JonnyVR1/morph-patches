package p003l;

import p014rx.C1099c;
import p014rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class mv50<T, U, R> implements C1099c.c<C1099c<? extends R>, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, ? extends C1099c<? extends U>> f5774a;

    /* JADX INFO: renamed from: b */
    public final x9j<? super T, ? super U, ? extends R> f5775b;

    /* JADX INFO: renamed from: l.mv50$a */
    public static class C0432a implements w9j<T, C1099c<U>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ w9j f5776a;

        public C0432a(w9j w9jVar) {
            this.f5776a = w9jVar;
        }

        @Override // p003l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1099c<U> call(T t) {
            return C1099c.from((Iterable) this.f5776a.call(t));
        }
    }

    /* JADX INFO: renamed from: l.mv50$b */
    public static final class C0433b<T, U, R> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super C1099c<? extends R>> f5777e;

        /* JADX INFO: renamed from: f */
        public final w9j<? super T, ? extends C1099c<? extends U>> f5778f;

        /* JADX INFO: renamed from: g */
        public final x9j<? super T, ? super U, ? extends R> f5779g;

        /* JADX INFO: renamed from: h */
        public boolean f5780h;

        public C0433b(z3g0<? super C1099c<? extends R>> z3g0Var, w9j<? super T, ? extends C1099c<? extends U>> w9jVar, x9j<? super T, ? super U, ? extends R> x9jVar) {
            this.f5777e = z3g0Var;
            this.f5778f = w9jVar;
            this.f5779g = x9jVar;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo3257f(rc90 rc90Var) {
            this.f5777e.mo3257f(rc90Var);
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f5780h) {
                return;
            }
            this.f5777e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            if (this.f5780h) {
                ejd0.m3864j(th);
            } else {
                this.f5780h = true;
                this.f5777e.onError(th);
            }
        }

        @Override // p003l.m250
        public void onNext(T t) {
            try {
                this.f5777e.onNext(this.f5778f.call(t).map(new C0434c(t, this.f5779g)));
            } catch (Throwable th) {
                f5f.m3964e(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }
    }

    /* JADX INFO: renamed from: l.mv50$c */
    public static final class C0434c<T, U, R> implements w9j<U, R> {

        /* JADX INFO: renamed from: a */
        public final T f5781a;

        /* JADX INFO: renamed from: b */
        public final x9j<? super T, ? super U, ? extends R> f5782b;

        public C0434c(T t, x9j<? super T, ? super U, ? extends R> x9jVar) {
            this.f5781a = t;
            this.f5782b = x9jVar;
        }

        @Override // p003l.w9j
        public R call(U u) {
            return this.f5782b.call(this.f5781a, u);
        }
    }

    public mv50(w9j<? super T, ? extends C1099c<? extends U>> w9jVar, x9j<? super T, ? super U, ? extends R> x9jVar) {
        this.f5774a = w9jVar;
        this.f5775b = x9jVar;
    }

    /* JADX INFO: renamed from: b */
    public static <T, U> w9j<T, C1099c<U>> m6500b(w9j<? super T, ? extends Iterable<? extends U>> w9jVar) {
        return new C0432a(w9jVar);
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super C1099c<? extends R>> z3g0Var) {
        C0433b c0433b = new C0433b(z3g0Var, this.f5774a, this.f5775b);
        z3g0Var.m9240b(c0433b);
        return c0433b;
    }
}
