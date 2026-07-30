package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class xv50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: l.xv50$a */
    public class C0647a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f8864e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0647a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f8864e = z3g0Var2;
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f8864e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f8864e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f8864e.onNext(t);
        }
    }

    /* JADX INFO: renamed from: l.xv50$b */
    public static final class C0648b {
        static final xv50<Object> INSTANCE = new xv50<>();
    }

    /* JADX INFO: renamed from: b */
    public static <T> xv50<T> m8871b() {
        return (xv50<T>) C0648b.INSTANCE;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        return new vie0(new C0647a(z3g0Var, z3g0Var));
    }
}
