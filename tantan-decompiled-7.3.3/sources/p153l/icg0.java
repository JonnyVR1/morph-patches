package p153l;

/* JADX INFO: loaded from: classes3.dex */
public final class icg0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.icg0$a */
    public static class C17697a<T> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ bb50 f114408e;

        public C17697a(bb50 bb50Var) {
            this.f114408e = bb50Var;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f114408e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f114408e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f114408e.onNext(t);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.icg0$b */
    public static class C17698b<T> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ gcg0 f114409e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17698b(gcg0 gcg0Var, gcg0 gcg0Var2) {
            super(gcg0Var);
            this.f114409e = gcg0Var2;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f114409e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f114409e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f114409e.onNext(t);
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> gcg0<T> m139434a() {
        return m139435b(eb50.m120156a());
    }

    /* JADX INFO: renamed from: b */
    public static <T> gcg0<T> m139435b(bb50<? super T> bb50Var) {
        return new C17697a(bb50Var);
    }

    /* JADX INFO: renamed from: c */
    public static <T> gcg0<T> m139436c(gcg0<? super T> gcg0Var) {
        return new C17698b(gcg0Var, gcg0Var);
    }
}
