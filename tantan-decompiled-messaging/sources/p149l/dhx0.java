package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class dhx0 implements xgx0 {

    /* JADX INFO: renamed from: c */
    public static final Object f86343c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile xgx0 f86344a;

    /* JADX INFO: renamed from: b */
    public volatile Object f86345b = f86343c;

    public dhx0(xgx0 xgx0Var) {
        this.f86344a = xgx0Var;
    }

    /* JADX INFO: renamed from: a */
    public static xgx0 m111844a(xgx0 xgx0Var) {
        return ((xgx0Var instanceof dhx0) || (xgx0Var instanceof ngx0)) ? xgx0Var : new dhx0(xgx0Var);
    }

    @Override // p149l.ehx0
    public final Object zzb() {
        Object obj = this.f86345b;
        if (obj != f86343c) {
            return obj;
        }
        xgx0 xgx0Var = this.f86344a;
        if (xgx0Var == null) {
            return this.f86345b;
        }
        Object objZzb = xgx0Var.zzb();
        this.f86345b = objZzb;
        this.f86344a = null;
        return objZzb;
    }
}
