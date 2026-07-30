package p149l;

/* JADX INFO: loaded from: classes13.dex */
public class fnk0 {

    /* JADX INFO: renamed from: a */
    public tnk0 f98428a;

    /* JADX INFO: renamed from: l.fnk0$a */
    public static final class C16887a {
        private static final fnk0 INSTANCE = new fnk0();
    }

    /* JADX INFO: renamed from: b */
    public static fnk0 m122316b() {
        return C16887a.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public void m122317a() {
        tnk0 tnk0Var = this.f98428a;
        if (tnk0Var != null) {
            tnk0Var.m189804u(true);
            this.f98428a = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m122318c() {
        tnk0 tnk0Var = this.f98428a;
        return tnk0Var != null && tnk0Var.isShowing();
    }

    /* JADX INFO: renamed from: d */
    public void m122319d() {
        tnk0 tnk0Var = this.f98428a;
        if (tnk0Var != null) {
            tnk0Var.m189803t();
            this.f98428a = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m122320e(wlu wluVar) {
        if (this.f98428a == null) {
            tnk0 tnk0Var = new tnk0();
            this.f98428a = tnk0Var;
            tnk0Var.m189802r(new unk0());
        }
        return this.f98428a.m189801J(wluVar);
    }

    public fnk0() {
    }
}
