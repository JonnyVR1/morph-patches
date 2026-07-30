package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class a4g0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.a4g0$a */
    public static class C0160a<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ m250 f2077e;

        public C0160a(m250 m250Var) {
            this.f2077e = m250Var;
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f2077e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f2077e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f2077e.onNext(t);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.a4g0$b */
    public static class C0161b<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f2078e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0161b(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f2078e = z3g0Var2;
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f2078e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f2078e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f2078e.onNext(t);
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> z3g0<T> m2741a() {
        return m2742b(p250.m6790a());
    }

    /* JADX INFO: renamed from: b */
    public static <T> z3g0<T> m2742b(m250<? super T> m250Var) {
        return new C0160a(m250Var);
    }

    /* JADX INFO: renamed from: c */
    public static <T> z3g0<T> m2743c(z3g0<? super T> z3g0Var) {
        return new C0161b(z3g0Var, z3g0Var);
    }
}
