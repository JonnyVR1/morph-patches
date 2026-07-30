package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class mw50<T, E> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final C1099c<? extends E> f5786a;

    /* JADX INFO: renamed from: l.mw50$a */
    public class C0435a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f5787e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0435a(z3g0 z3g0Var, boolean z, z3g0 z3g0Var2) {
            super(z3g0Var, z);
            this.f5787e = z3g0Var2;
        }

        @Override // p003l.m250
        public void onCompleted() {
            try {
                this.f5787e.onCompleted();
            } finally {
                this.f5787e.unsubscribe();
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            try {
                this.f5787e.onError(th);
            } finally {
                this.f5787e.unsubscribe();
            }
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f5787e.onNext(t);
        }
    }

    /* JADX INFO: renamed from: l.mw50$b */
    public class C0436b extends z3g0<E> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f5789e;

        public C0436b(z3g0 z3g0Var) {
            this.f5789e = z3g0Var;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            m9242e(Long.MAX_VALUE);
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f5789e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f5789e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(E e) {
            onCompleted();
        }
    }

    public mw50(C1099c<? extends E> c1099c) {
        this.f5786a = c1099c;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        vie0 vie0Var = new vie0(z3g0Var, false);
        C0435a c0435a = new C0435a(vie0Var, false, vie0Var);
        C0436b c0436b = new C0436b(c0435a);
        vie0Var.m9240b(c0435a);
        vie0Var.m9240b(c0436b);
        z3g0Var.m9240b(vie0Var);
        this.f5786a.unsafeSubscribe(c0436b);
        return c0435a;
    }
}
