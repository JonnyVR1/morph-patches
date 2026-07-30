package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class lo50<T, R> implements C22421c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C22421c<T> f132875a;

    /* JADX INFO: renamed from: b */
    public final R f132876b;

    /* JADX INFO: renamed from: c */
    public final rcj<R, ? super T, R> f132877c;

    /* JADX INFO: renamed from: l.lo50$a */
    public static final class C18422a<T, R> extends aud<T, R> {

        /* JADX INFO: renamed from: i */
        public final rcj<R, ? super T, R> f132878i;

        public C18422a(gcg0<? super R> gcg0Var, R r, rcj<R, ? super T, R> rcjVar) {
            super(gcg0Var);
            this.f73485g = r;
            this.f73484f = true;
            this.f132878i = rcjVar;
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            try {
                this.f73485g = this.f132878i.call(this.f73485g, t);
            } catch (Throwable th) {
                j6f.m143663e(th);
                unsubscribe();
                this.f73483e.onError(th);
            }
        }
    }

    public lo50(C22421c<T> c22421c, R r, rcj<R, ? super T, R> rcjVar) {
        this.f132875a = c22421c;
        this.f132876b = r;
        this.f132877c = rcjVar;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super R> gcg0Var) {
        new C18422a(gcg0Var, this.f132876b, this.f132877c).m100375k(this.f132875a);
    }
}
