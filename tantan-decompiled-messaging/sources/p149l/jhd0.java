package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class jhd0 implements xhd0 {

    /* JADX INFO: renamed from: a */
    public final whd0 f117930a;

    /* JADX INFO: renamed from: c */
    public m6j0 f117932c;

    /* JADX INFO: renamed from: d */
    public int f117933d;

    /* JADX INFO: renamed from: f */
    public long f117935f;

    /* JADX INFO: renamed from: g */
    public long f117936g;

    /* JADX INFO: renamed from: b */
    public final c860 f117931b = new c860();

    /* JADX INFO: renamed from: e */
    public long f117934e = -9223372036854775807L;

    public jhd0(whd0 whd0Var) {
        this.f117930a = whd0Var;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: a */
    public void mo102003a(long j, long j2) {
        this.f117934e = j;
        this.f117936g = j2;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: b */
    public void mo102004b(d860 d860Var, long j, int i, boolean z) {
        int iM110279H = d860Var.m110279H() & 3;
        int iM110279H2 = d860Var.m110279H() & 255;
        long jM218790a = zhd0.m218790a(this.f117936g, j, this.f117934e, this.f117930a.f186384b);
        if (iM110279H == 0) {
            m141493e();
            if (iM110279H2 == 1) {
                m141497i(d860Var, jM218790a);
                return;
            } else {
                m141496h(d860Var, iM110279H2, jM218790a);
                return;
            }
        }
        if (iM110279H == 1 || iM110279H == 2) {
            m141493e();
        } else if (iM110279H != 3) {
            ig3.m135964a(String.valueOf(iM110279H));
            return;
        }
        m141495g(d860Var, z, iM110279H, jM218790a);
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: c */
    public void mo102005c(long j, int i) {
        p11.m167013g(this.f117934e == -9223372036854775807L);
        this.f117934e = j;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: d */
    public void mo102006d(uqf uqfVar, int i) {
        m6j0 m6j0VarMo11362b = uqfVar.mo11362b(i, 1);
        this.f117932c = m6j0VarMo11362b;
        m6j0VarMo11362b.mo11110b(this.f117930a.f186385c);
    }

    /* JADX INFO: renamed from: e */
    public final void m141493e() {
        if (this.f117933d > 0) {
            m141494f();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m141494f() {
        ((m6j0) vck0.m197866j(this.f117932c)).mo11109a(this.f117935f, 1, this.f117933d, 0, null);
        this.f117933d = 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m141495g(d860 d860Var, boolean z, int i, long j) {
        int iM110295a = d860Var.m110295a();
        ((m6j0) p11.m167011e(this.f117932c)).m153238d(d860Var, iM110295a);
        this.f117933d += iM110295a;
        this.f117935f = j;
        if (z && i == 3) {
            m141494f();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m141496h(d860 d860Var, int i, long j) {
        this.f117931b.m105670n(d860Var.m110299e());
        this.f117931b.m105675s(2);
        long j2 = j;
        for (int i2 = 0; i2 < i; i2++) {
            C16561e9.b bVarM115324f = C16561e9.m115324f(this.f117931b);
            ((m6j0) p11.m167011e(this.f117932c)).m153238d(d860Var, bVarM115324f.f89904e);
            ((m6j0) vck0.m197866j(this.f117932c)).mo11109a(j2, 1, bVarM115324f.f89904e, 0, null);
            j2 += ((long) (bVarM115324f.f89905f / bVarM115324f.f89902c)) * 1000000;
            this.f117931b.m105675s(bVarM115324f.f89904e);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m141497i(d860 d860Var, long j) {
        int iM110295a = d860Var.m110295a();
        ((m6j0) p11.m167011e(this.f117932c)).m153238d(d860Var, iM110295a);
        ((m6j0) vck0.m197866j(this.f117932c)).mo11109a(j, 1, iM110295a, 0, null);
    }
}
