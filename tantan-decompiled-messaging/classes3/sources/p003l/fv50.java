package p003l;

import l.jfd0;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class fv50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final d30 f3734a;

    /* JADX INFO: renamed from: l.fv50$a */
    public class C0295a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f3735e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0295a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f3735e = z3g0Var2;
        }

        /* JADX INFO: renamed from: g */
        public void m4472g() {
            try {
                fv50.this.f3734a.call();
            } catch (Throwable th) {
                f5f.m3964e(th);
                ejd0.m3864j(th);
            }
        }

        @Override // p003l.m250
        public void onCompleted() {
            try {
                this.f3735e.onCompleted();
            } finally {
                m4472g();
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            try {
                this.f3735e.onError(th);
            } finally {
                m4472g();
            }
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f3735e.onNext(t);
        }
    }

    public fv50(d30 d30Var) {
        if (d30Var != null) {
            this.f3734a = d30Var;
        } else {
            jfd0.a("Action can not be null");
            throw null;
        }
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        return new C0295a(z3g0Var, z3g0Var);
    }
}
