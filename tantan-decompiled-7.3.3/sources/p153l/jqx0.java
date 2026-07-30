package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class jqx0 implements dqx0 {

    /* JADX INFO: renamed from: c */
    public static final Object f122259c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile dqx0 f122260a;

    /* JADX INFO: renamed from: b */
    public volatile Object f122261b = f122259c;

    public jqx0(dqx0 dqx0Var) {
        this.f122260a = dqx0Var;
    }

    /* JADX INFO: renamed from: a */
    public static dqx0 m146642a(dqx0 dqx0Var) {
        return ((dqx0Var instanceof jqx0) || (dqx0Var instanceof tpx0)) ? dqx0Var : new jqx0(dqx0Var);
    }

    @Override // p153l.kqx0
    public final Object zzb() {
        Object obj = this.f122261b;
        if (obj != f122259c) {
            return obj;
        }
        dqx0 dqx0Var = this.f122260a;
        if (dqx0Var == null) {
            return this.f122261b;
        }
        Object objZzb = dqx0Var.zzb();
        this.f122261b = objZzb;
        this.f122260a = null;
        return objZzb;
    }
}
