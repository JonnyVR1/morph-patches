package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class q360<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: l.q360$b */
    public static final class C19514b {
        static final q360<?> INSTANCE = new q360<>();
    }

    /* JADX INFO: renamed from: b */
    public static <T> q360<T> m175117b() {
        return (q360<T>) C19514b.INSTANCE;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        C19513a c19513a = new C19513a(gcg0Var);
        gcg0Var.m129866b(c19513a);
        return c19513a;
    }

    /* JADX INFO: renamed from: l.q360$a */
    public class C19513a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ gcg0 f155425e;

        public C19513a(gcg0 gcg0Var) {
            this.f155425e = gcg0Var;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f155425e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f155425e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
        }
    }
}
