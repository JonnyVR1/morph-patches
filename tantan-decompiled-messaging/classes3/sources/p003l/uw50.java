package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class uw50<T> implements C1099c.c<hri0<T>, T> {

    /* JADX INFO: renamed from: a */
    public final bud0 f8113a;

    /* JADX INFO: renamed from: l.uw50$a */
    public class C0586a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f8114e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0586a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f8114e = z3g0Var2;
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f8114e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f8114e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f8114e.onNext(new hri0(uw50.this.f8113a.now(), t));
        }
    }

    public uw50(bud0 bud0Var) {
        this.f8113a = bud0Var;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super hri0<T>> z3g0Var) {
        return new C0586a(z3g0Var, z3g0Var);
    }
}
