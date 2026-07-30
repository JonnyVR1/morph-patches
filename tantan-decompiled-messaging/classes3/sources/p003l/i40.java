package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class i40 {

    /* JADX INFO: renamed from: a */
    public static final C0343b f4338a = new C0343b();

    /* JADX INFO: renamed from: l.i40$a */
    public static final class C0342a<T> implements e30<T> {

        /* JADX INFO: renamed from: a */
        public final d30 f4339a;

        public C0342a(d30 d30Var) {
            this.f4339a = d30Var;
        }

        @Override // p003l.e30
        public void call(T t) {
            this.f4339a.call();
        }
    }

    /* JADX INFO: renamed from: l.i40$b */
    public static final class C0343b<T0, T1, T2, T3, T4, T5, T6, T7, T8> implements d30, e30<T0>, f30<T0, T1>, g30<T0, T1, T2>, h30<T0, T1, T2, T3> {
        @Override // p003l.e30
        public void call(T0 t0) {
        }

        @Override // p003l.f30
        public void call(T0 t0, T1 t1) {
        }

        @Override // p003l.d30
        public void call() {
        }

        @Override // p003l.g30
        /* JADX INFO: renamed from: a */
        public void mo4389a(T0 t0, T1 t1, T2 t2) {
        }

        @Override // p003l.h30
        /* JADX INFO: renamed from: b */
        public void mo3798b(T0 t0, T1 t1, T2 t2, T3 t3) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8> C0343b<T0, T1, T2, T3, T4, T5, T6, T7, T8> m5029a() {
        return f4338a;
    }

    /* JADX INFO: renamed from: b */
    public static <T> e30<T> m5030b(d30 d30Var) {
        return new C0342a(d30Var);
    }
}
