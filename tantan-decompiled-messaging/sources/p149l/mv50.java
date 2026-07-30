package p149l;

import p133rx.C22306c;
import p133rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: classes3.dex */
public final class mv50<T, U, R> implements C22306c.c<C22306c<? extends R>, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, ? extends C22306c<? extends U>> f135873a;

    /* JADX INFO: renamed from: b */
    public final x9j<? super T, ? super U, ? extends R> f135874b;

    /* JADX INFO: renamed from: l.mv50$a */
    public static class C18561a implements w9j<T, C22306c<U>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ w9j f135875a;

        public C18561a(w9j w9jVar) {
            this.f135875a = w9jVar;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22306c<U> call(T t) {
            return C22306c.from((Iterable) this.f135875a.call(t));
        }
    }

    /* JADX INFO: renamed from: l.mv50$b */
    public static final class C18562b<T, U, R> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super C22306c<? extends R>> f135876e;

        /* JADX INFO: renamed from: f */
        public final w9j<? super T, ? extends C22306c<? extends U>> f135877f;

        /* JADX INFO: renamed from: g */
        public final x9j<? super T, ? super U, ? extends R> f135878g;

        /* JADX INFO: renamed from: h */
        public boolean f135879h;

        public C18562b(z3g0<? super C22306c<? extends R>> z3g0Var, w9j<? super T, ? extends C22306c<? extends U>> w9jVar, x9j<? super T, ? super U, ? extends R> x9jVar) {
            this.f135876e = z3g0Var;
            this.f135877f = w9jVar;
            this.f135878g = x9jVar;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo106696f(rc90 rc90Var) {
            this.f135876e.mo106696f(rc90Var);
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f135879h) {
                return;
            }
            this.f135876e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            if (this.f135879h) {
                ejd0.m116793j(th);
            } else {
                this.f135879h = true;
                this.f135876e.onError(th);
            }
        }

        @Override // p149l.m250
        public void onNext(T t) {
            try {
                this.f135876e.onNext(this.f135877f.call(t).map(new C18563c(t, this.f135878g)));
            } catch (Throwable th) {
                f5f.m119491e(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }
    }

    /* JADX INFO: renamed from: l.mv50$c */
    public static final class C18563c<T, U, R> implements w9j<U, R> {

        /* JADX INFO: renamed from: a */
        public final T f135880a;

        /* JADX INFO: renamed from: b */
        public final x9j<? super T, ? super U, ? extends R> f135881b;

        public C18563c(T t, x9j<? super T, ? super U, ? extends R> x9jVar) {
            this.f135880a = t;
            this.f135881b = x9jVar;
        }

        @Override // p149l.w9j
        public R call(U u) {
            return this.f135881b.call(this.f135880a, u);
        }
    }

    public mv50(w9j<? super T, ? extends C22306c<? extends U>> w9jVar, x9j<? super T, ? super U, ? extends R> x9jVar) {
        this.f135873a = w9jVar;
        this.f135874b = x9jVar;
    }

    /* JADX INFO: renamed from: b */
    public static <T, U> w9j<T, C22306c<U>> m156475b(w9j<? super T, ? extends Iterable<? extends U>> w9jVar) {
        return new C18561a(w9jVar);
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super C22306c<? extends R>> z3g0Var) {
        C18562b c18562b = new C18562b(z3g0Var, this.f135873a, this.f135874b);
        z3g0Var.m217046b(c18562b);
        return c18562b;
    }
}
