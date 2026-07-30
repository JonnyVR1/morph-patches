package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class ew50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final x9j<? super T, Integer, Boolean> f3401a;

    /* JADX INFO: renamed from: l.ew50$a */
    public class C0283a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f3402e;

        /* JADX INFO: renamed from: f */
        public int f3403f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f3404g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0283a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f3404g = z3g0Var2;
            this.f3402e = true;
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f3404g.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f3404g.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            if (!this.f3402e) {
                this.f3404g.onNext(t);
                return;
            }
            try {
                x9j<? super T, Integer, Boolean> x9jVar = ew50.this.f3401a;
                int i = this.f3403f;
                this.f3403f = i + 1;
                if (x9jVar.call(t, Integer.valueOf(i)).booleanValue()) {
                    m9242e(1L);
                } else {
                    this.f3402e = false;
                    this.f3404g.onNext(t);
                }
            } catch (Throwable th) {
                f5f.m3966g(th, this.f3404g, t);
            }
        }
    }

    /* JADX INFO: renamed from: l.ew50$b */
    public static class C0284b implements x9j<T, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ w9j f3406a;

        public C0284b(w9j w9jVar) {
            this.f3406a = w9jVar;
        }

        @Override // p003l.x9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(T t, Integer num) {
            return (Boolean) this.f3406a.call(t);
        }
    }

    public ew50(x9j<? super T, Integer, Boolean> x9jVar) {
        this.f3401a = x9jVar;
    }

    /* JADX INFO: renamed from: b */
    public static <T> x9j<T, Integer, Boolean> m3947b(w9j<? super T, Boolean> w9jVar) {
        return new C0284b(w9jVar);
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        return new C0283a(z3g0Var, z3g0Var);
    }
}
