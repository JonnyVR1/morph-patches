package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class fv50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final d30 f99404a;

    /* JADX INFO: renamed from: l.fv50$a */
    public class C16927a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f99405e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16927a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f99405e = z3g0Var2;
        }

        /* JADX INFO: renamed from: g */
        public void m123274g() {
            try {
                fv50.this.f99404a.call();
            } catch (Throwable th) {
                f5f.m119491e(th);
                ejd0.m116793j(th);
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
            try {
                this.f99405e.onCompleted();
            } finally {
                m123274g();
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            try {
                this.f99405e.onError(th);
            } finally {
                m123274g();
            }
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f99405e.onNext(t);
        }
    }

    public fv50(d30 d30Var) {
        if (d30Var != null) {
            this.f99404a = d30Var;
        } else {
            jfd0.m141176a("Action can not be null");
            throw null;
        }
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        return new C16927a(z3g0Var, z3g0Var);
    }
}
