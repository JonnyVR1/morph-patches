package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class xn50<T, R> implements C22421c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C22421c<T> f195359a;

    /* JADX INFO: renamed from: b */
    public final pcj<R> f195360b;

    /* JADX INFO: renamed from: c */
    public final z20<R, ? super T> f195361c;

    /* JADX INFO: renamed from: l.xn50$a */
    public static final class C21388a<T, R> extends aud<T, R> {

        /* JADX INFO: renamed from: i */
        public final z20<R, ? super T> f195362i;

        public C21388a(gcg0<? super R> gcg0Var, R r, z20<R, ? super T> z20Var) {
            super(gcg0Var);
            this.f73485g = r;
            this.f73484f = true;
            this.f195362i = z20Var;
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            try {
                this.f195362i.call(this.f73485g, t);
            } catch (Throwable th) {
                j6f.m143663e(th);
                unsubscribe();
                this.f73483e.onError(th);
            }
        }
    }

    public xn50(C22421c<T> c22421c, pcj<R> pcjVar, z20<R, ? super T> z20Var) {
        this.f195359a = c22421c;
        this.f195360b = pcjVar;
        this.f195361c = z20Var;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super R> gcg0Var) {
        try {
            new C21388a(gcg0Var, this.f195360b.call(), this.f195361c).m100375k(this.f195359a);
        } catch (Throwable th) {
            j6f.m143663e(th);
            gcg0Var.onError(th);
        }
    }
}
