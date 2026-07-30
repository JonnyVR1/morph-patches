package p149l;

/* JADX INFO: loaded from: classes.dex */
public class ksq0 {

    /* JADX INFO: renamed from: b */
    private static final ksq0 f124501b = new C18073a();

    /* JADX INFO: renamed from: a */
    private ksq0 f124502a;

    /* JADX INFO: renamed from: l.ksq0$a */
    public static class C18073a extends ksq0 {

        /* JADX INFO: renamed from: c */
        bnq0 f124503c = null;

        @Override // p149l.ksq0
        /* JADX INFO: renamed from: b */
        public Object mo147102b(String str) {
            if (this.f124503c == null) {
                this.f124503c = bnq0.m102837g(hrq0.m132700i());
            }
            return this.f124503c.m102857s().opt(str);
        }
    }

    public ksq0() {
        this(f124501b);
    }

    /* JADX INFO: renamed from: a */
    public Object mo143420a(String str) {
        ksq0 ksq0Var = this.f124502a;
        if (ksq0Var != null) {
            return ksq0Var.mo143420a(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public Object mo147102b(String str) {
        ksq0 ksq0Var = this.f124502a;
        if (ksq0Var != null) {
            return ksq0Var.mo147102b(str);
        }
        return null;
    }

    public ksq0(ksq0 ksq0Var) {
        this.f124502a = ksq0Var;
    }
}
