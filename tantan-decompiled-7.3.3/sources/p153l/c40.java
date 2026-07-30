package p153l;

/* JADX INFO: loaded from: classes3.dex */
public final class c40 {

    /* JADX INFO: renamed from: a */
    public static final C16176b f79656a = new C16176b();

    /* JADX INFO: renamed from: l.c40$a */
    public static final class C16175a<T> implements y20<T> {

        /* JADX INFO: renamed from: a */
        public final x20 f79657a;

        public C16175a(x20 x20Var) {
            this.f79657a = x20Var;
        }

        @Override // p153l.y20
        public void call(T t) {
            this.f79657a.call();
        }
    }

    /* JADX INFO: renamed from: l.c40$b */
    public static final class C16176b<T0, T1, T2, T3, T4, T5, T6, T7, T8> implements x20, y20<T0>, z20<T0, T1>, a30<T0, T1, T2>, b30<T0, T1, T2, T3> {
        @Override // p153l.y20
        public void call(T0 t0) {
        }

        @Override // p153l.z20
        public void call(T0 t0, T1 t1) {
        }

        @Override // p153l.x20
        public void call() {
        }

        @Override // p153l.a30
        /* JADX INFO: renamed from: a */
        public void mo37058a(T0 t0, T1 t1, T2 t2) {
        }

        @Override // p153l.b30
        /* JADX INFO: renamed from: b */
        public void mo102266b(T0 t0, T1 t1, T2 t2, T3 t3) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8> C16176b<T0, T1, T2, T3, T4, T5, T6, T7, T8> m107815a() {
        return f79656a;
    }

    /* JADX INFO: renamed from: b */
    public static <T> y20<T> m107816b(x20 x20Var) {
        return new C16175a(x20Var);
    }
}
