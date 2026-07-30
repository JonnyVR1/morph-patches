package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class ig50<T> implements C22306c.a<T> {

    /* JADX INFO: renamed from: a */
    public final C22306c<T> f113069a;

    /* JADX INFO: renamed from: l.ig50$a */
    public static final class C17541a<T> extends msd<T, T> {

        /* JADX INFO: renamed from: i */
        public static final Object f113070i = new Object();

        /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
        public C17541a(z3g0<? super T> z3g0Var) {
            super(z3g0Var);
            this.f135466g = f113070i;
        }

        @Override // p149l.msd, p149l.m250
        public void onCompleted() {
            Object obj = this.f135466g;
            if (obj == f113070i) {
                m156123g();
            } else {
                m156124h(obj);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.m250
        public void onNext(T t) {
            this.f135466g = t;
        }
    }

    public ig50(C22306c<T> c22306c) {
        this.f113069a = c22306c;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        new C17541a(z3g0Var).m156127k(this.f113069a);
    }
}
