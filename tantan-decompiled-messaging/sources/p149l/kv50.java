package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class kv50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: l.kv50$b */
    public static final class C18090b {
        static final kv50<?> INSTANCE = new kv50<>();
    }

    /* JADX INFO: renamed from: b */
    public static <T> kv50<T> m147348b() {
        return (kv50<T>) C18090b.INSTANCE;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        C18089a c18089a = new C18089a(z3g0Var);
        z3g0Var.m217046b(c18089a);
        return c18089a;
    }

    /* JADX INFO: renamed from: l.kv50$a */
    public class C18089a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f124752e;

        public C18089a(z3g0 z3g0Var) {
            this.f124752e = z3g0Var;
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f124752e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f124752e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
        }
    }
}
