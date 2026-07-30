package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class l360<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final x20 f129843a;

    /* JADX INFO: renamed from: l.l360$a */
    public class C18337a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ gcg0 f129844e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18337a(gcg0 gcg0Var, gcg0 gcg0Var2) {
            super(gcg0Var);
            this.f129844e = gcg0Var2;
        }

        /* JADX INFO: renamed from: g */
        public void m152684g() {
            try {
                l360.this.f129843a.call();
            } catch (Throwable th) {
                j6f.m143663e(th);
                hrd0.m136792j(th);
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
            try {
                this.f129844e.onCompleted();
            } finally {
                m152684g();
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            try {
                this.f129844e.onError(th);
            } finally {
                m152684g();
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f129844e.onNext(t);
        }
    }

    public l360(x20 x20Var) {
        if (x20Var != null) {
            this.f129843a = x20Var;
        } else {
            mnd0.m159157a("Action can not be null");
            throw null;
        }
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        return new C18337a(gcg0Var, gcg0Var);
    }
}
