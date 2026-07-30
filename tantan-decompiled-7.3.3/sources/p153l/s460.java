package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class s460<T, E> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final C22421c<? extends E> f166170a;

    /* JADX INFO: renamed from: l.s460$a */
    public class C19977a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ gcg0 f166171e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19977a(gcg0 gcg0Var, boolean z, gcg0 gcg0Var2) {
            super(gcg0Var, z);
            this.f166171e = gcg0Var2;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            try {
                this.f166171e.onCompleted();
            } finally {
                this.f166171e.unsubscribe();
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            try {
                this.f166171e.onError(th);
            } finally {
                this.f166171e.unsubscribe();
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f166171e.onNext(t);
        }
    }

    /* JADX INFO: renamed from: l.s460$b */
    public class C19978b extends gcg0<E> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ gcg0 f166173e;

        public C19978b(gcg0 gcg0Var) {
            this.f166173e = gcg0Var;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            m129868e(Long.MAX_VALUE);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f166173e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f166173e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(E e) {
            onCompleted();
        }
    }

    public s460(C22421c<? extends E> c22421c) {
        this.f166170a = c22421c;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        are0 are0Var = new are0(gcg0Var, false);
        C19977a c19977a = new C19977a(are0Var, false, are0Var);
        C19978b c19978b = new C19978b(c19977a);
        are0Var.m129866b(c19977a);
        are0Var.m129866b(c19978b);
        gcg0Var.m129866b(are0Var);
        this.f166170a.unsafeSubscribe(c19978b);
        return c19977a;
    }
}
