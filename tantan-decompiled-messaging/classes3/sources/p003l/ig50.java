package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class ig50<T> implements C1099c.a<T> {

    /* JADX INFO: renamed from: a */
    public final C1099c<T> f4401a;

    /* JADX INFO: renamed from: l.ig50$a */
    public static final class C0348a<T> extends msd<T, T> {

        /* JADX INFO: renamed from: i */
        public static final Object f4402i = new Object();

        /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
        public C0348a(z3g0<? super T> z3g0Var) {
            super(z3g0Var);
            this.f5753g = f4402i;
        }

        @Override // p003l.msd, p003l.m250
        public void onCompleted() {
            Object obj = this.f5753g;
            if (obj == f4402i) {
                m6464g();
            } else {
                m6465h(obj);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p003l.m250
        public void onNext(T t) {
            this.f5753g = t;
        }
    }

    public ig50(C1099c<T> c1099c) {
        this.f4401a = c1099c;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        new C0348a(z3g0Var).m6468k(this.f4401a);
    }
}
