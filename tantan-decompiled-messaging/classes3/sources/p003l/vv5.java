package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class vv5<T> extends C1099c<T> {
    public vv5(C1099c.a<T> aVar) {
        super(aVar);
    }

    /* JADX INFO: renamed from: a */
    public C1099c<T> m8402a(int i) {
        return m8403b(i, i40.m5029a());
    }

    /* JADX INFO: renamed from: b */
    public C1099c<T> m8403b(int i, e30<? super c4g0> e30Var) {
        if (i > 0) {
            return C1099c.create(new qf50(this, i, e30Var));
        }
        mo8404c(e30Var);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo8404c(e30<? super c4g0> e30Var);

    /* JADX INFO: renamed from: d */
    public C1099c<T> m8405d() {
        return C1099c.create(new gg50(this));
    }
}
