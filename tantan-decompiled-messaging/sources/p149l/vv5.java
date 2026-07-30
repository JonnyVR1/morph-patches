package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vv5<T> extends C22306c<T> {
    public vv5(C22306c.a<T> aVar) {
        super(aVar);
    }

    /* JADX INFO: renamed from: a */
    public C22306c<T> m200172a(int i) {
        return m200173b(i, i40.m134309a());
    }

    /* JADX INFO: renamed from: b */
    public C22306c<T> m200173b(int i, e30<? super c4g0> e30Var) {
        if (i > 0) {
            return C22306c.create(new qf50(this, i, e30Var));
        }
        mo200174c(e30Var);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo200174c(e30<? super c4g0> e30Var);

    /* JADX INFO: renamed from: d */
    public C22306c<T> m200175d() {
        return C22306c.create(new gg50(this));
    }
}
