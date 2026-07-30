package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class oo50<T> implements C22421c.a<T> {

    /* JADX INFO: renamed from: a */
    public final C22421c<T> f148324a;

    /* JADX INFO: renamed from: l.oo50$a */
    public static final class C19186a<T> extends aud<T, T> {

        /* JADX INFO: renamed from: i */
        public static final Object f148325i = new Object();

        /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
        public C19186a(gcg0<? super T> gcg0Var) {
            super(gcg0Var);
            this.f73485g = f148325i;
        }

        @Override // p153l.aud, p153l.bb50
        public void onCompleted() {
            Object obj = this.f73485g;
            if (obj == f148325i) {
                m100371g();
            } else {
                m100372h(obj);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.bb50
        public void onNext(T t) {
            this.f73485g = t;
        }
    }

    public oo50(C22421c<T> c22421c) {
        this.f148324a = c22421c;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super T> gcg0Var) {
        new C19186a(gcg0Var).m100375k(this.f148324a);
    }
}
