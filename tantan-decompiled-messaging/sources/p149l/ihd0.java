package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ihd0 implements xhd0 {

    /* JADX INFO: renamed from: a */
    public final whd0 f113233a;

    /* JADX INFO: renamed from: b */
    public final c860 f113234b = new c860();

    /* JADX INFO: renamed from: c */
    public final int f113235c;

    /* JADX INFO: renamed from: d */
    public final int f113236d;

    /* JADX INFO: renamed from: e */
    public final int f113237e;

    /* JADX INFO: renamed from: f */
    public final int f113238f;

    /* JADX INFO: renamed from: g */
    public long f113239g;

    /* JADX INFO: renamed from: h */
    public m6j0 f113240h;

    /* JADX INFO: renamed from: i */
    public long f113241i;

    public ihd0(whd0 whd0Var) {
        this.f113233a = whd0Var;
        this.f113235c = whd0Var.f186384b;
        String str = (String) p11.m167011e(whd0Var.f186386d.get("mode"));
        if (b11.m99800a(str, "AAC-hbr")) {
            this.f113236d = 13;
            this.f113237e = 3;
        } else {
            if (!b11.m99800a(str, "AAC-lbr")) {
                qq3.m175877a("AAC mode not supported");
                throw null;
            }
            this.f113236d = 6;
            this.f113237e = 2;
        }
        this.f113238f = this.f113237e + this.f113236d;
    }

    /* JADX INFO: renamed from: e */
    public static void m136190e(m6j0 m6j0Var, long j, int i) {
        m6j0Var.mo11109a(j, 1, i, 0, null);
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: a */
    public void mo102003a(long j, long j2) {
        this.f113239g = j;
        this.f113241i = j2;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: b */
    public void mo102004b(d860 d860Var, long j, int i, boolean z) {
        p11.m167011e(this.f113240h);
        short sM110275D = d860Var.m110275D();
        int i2 = sM110275D / this.f113238f;
        long jM218790a = zhd0.m218790a(this.f113241i, j, this.f113239g, this.f113235c);
        this.f113234b.m105669m(d860Var);
        if (i2 == 1) {
            int iM105664h = this.f113234b.m105664h(this.f113236d);
            this.f113234b.m105674r(this.f113237e);
            this.f113240h.m153238d(d860Var, d860Var.m110295a());
            if (z) {
                m136190e(this.f113240h, jM218790a, iM105664h);
                return;
            }
            return;
        }
        d860Var.m110293V((sM110275D + 7) / 8);
        for (int i3 = 0; i3 < i2; i3++) {
            int iM105664h2 = this.f113234b.m105664h(this.f113236d);
            this.f113234b.m105674r(this.f113237e);
            this.f113240h.m153238d(d860Var, iM105664h2);
            m136190e(this.f113240h, jM218790a, iM105664h2);
            jM218790a += vck0.m197832W0(i2, 1000000L, this.f113235c);
        }
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: c */
    public void mo102005c(long j, int i) {
        this.f113239g = j;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: d */
    public void mo102006d(uqf uqfVar, int i) {
        m6j0 m6j0VarMo11362b = uqfVar.mo11362b(i, 1);
        this.f113240h = m6j0VarMo11362b;
        m6j0VarMo11362b.mo11110b(this.f113233a.f186385c);
    }
}
