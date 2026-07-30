package p149l;

/* JADX INFO: loaded from: classes3.dex */
public final class a4g0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.a4g0$a */
    public static class C15526a<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ m250 f67530e;

        public C15526a(m250 m250Var) {
            this.f67530e = m250Var;
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f67530e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f67530e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f67530e.onNext(t);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.a4g0$b */
    public static class C15527b<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f67531e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15527b(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f67531e = z3g0Var2;
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f67531e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f67531e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f67531e.onNext(t);
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> z3g0<T> m94917a() {
        return m94918b(p250.m167128a());
    }

    /* JADX INFO: renamed from: b */
    public static <T> z3g0<T> m94918b(m250<? super T> m250Var) {
        return new C15526a(m250Var);
    }

    /* JADX INFO: renamed from: c */
    public static <T> z3g0<T> m94919c(z3g0<? super T> z3g0Var) {
        return new C15527b(z3g0Var, z3g0Var);
    }
}
