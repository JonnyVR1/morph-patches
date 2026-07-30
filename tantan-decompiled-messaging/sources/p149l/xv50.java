package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class xv50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: l.xv50$a */
    public class C21227a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f194579e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21227a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f194579e = z3g0Var2;
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f194579e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f194579e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f194579e.onNext(t);
        }
    }

    /* JADX INFO: renamed from: l.xv50$b */
    public static final class C21228b {
        static final xv50<Object> INSTANCE = new xv50<>();
    }

    /* JADX INFO: renamed from: b */
    public static <T> xv50<T> m211245b() {
        return (xv50<T>) C21228b.INSTANCE;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        return new vie0(new C21227a(z3g0Var, z3g0Var));
    }
}
