package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class kv50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: l.kv50$b */
    public static final class C0389b {
        static final kv50<?> INSTANCE = new kv50<>();
    }

    /* JADX INFO: renamed from: b */
    public static <T> kv50<T> m5861b() {
        return (kv50<T>) C0389b.INSTANCE;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        C0388a c0388a = new C0388a(z3g0Var);
        z3g0Var.m9240b(c0388a);
        return c0388a;
    }

    /* JADX INFO: renamed from: l.kv50$a */
    public class C0388a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f5083e;

        public C0388a(z3g0 z3g0Var) {
            this.f5083e = z3g0Var;
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f5083e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f5083e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
        }
    }
}
