package p153l;

import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ax5<T> extends C22421c<T> {
    public ax5(C22421c.a<T> aVar) {
        super(aVar);
    }

    /* JADX INFO: renamed from: a */
    public C22421c<T> m100757a(int i) {
        return m100758b(i, c40.m107815a());
    }

    /* JADX INFO: renamed from: b */
    public C22421c<T> m100758b(int i, y20<? super kcg0> y20Var) {
        if (i > 0) {
            return C22421c.create(new wn50(this, i, y20Var));
        }
        mo100759c(y20Var);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo100759c(y20<? super kcg0> y20Var);

    /* JADX INFO: renamed from: d */
    public C22421c<T> m100760d() {
        return C22421c.create(new mo50(this));
    }
}
