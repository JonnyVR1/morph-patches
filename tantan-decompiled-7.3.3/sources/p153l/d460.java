package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class d460<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: l.d460$a */
    public class C16441a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ gcg0 f85002e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16441a(gcg0 gcg0Var, gcg0 gcg0Var2) {
            super(gcg0Var);
            this.f85002e = gcg0Var2;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f85002e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f85002e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f85002e.onNext(t);
        }
    }

    /* JADX INFO: renamed from: l.d460$b */
    public static final class C16442b {
        static final d460<Object> INSTANCE = new d460<>();
    }

    /* JADX INFO: renamed from: b */
    public static <T> d460<T> m114110b() {
        return (d460<T>) C16442b.INSTANCE;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        return new are0(new C16441a(gcg0Var, gcg0Var));
    }
}
