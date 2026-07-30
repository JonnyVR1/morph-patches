package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class yhd0 implements xhd0 {

    /* JADX INFO: renamed from: a */
    public final whd0 f198292a;

    /* JADX INFO: renamed from: b */
    public m6j0 f198293b;

    /* JADX INFO: renamed from: c */
    public long f198294c = -9223372036854775807L;

    /* JADX INFO: renamed from: d */
    public long f198295d = 0;

    /* JADX INFO: renamed from: e */
    public int f198296e = -1;

    public yhd0(whd0 whd0Var) {
        this.f198292a = whd0Var;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: a */
    public void mo102003a(long j, long j2) {
        this.f198294c = j;
        this.f198295d = j2;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: b */
    public void mo102004b(d860 d860Var, long j, int i, boolean z) {
        int iM188881b;
        p11.m167011e(this.f198293b);
        int i2 = this.f198296e;
        if (i2 != -1 && i != (iM188881b = thd0.m188881b(i2))) {
            vck0.m197793D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(iM188881b), Integer.valueOf(i));
        }
        long jM218790a = zhd0.m218790a(this.f198295d, j, this.f198294c, this.f198292a.f186384b);
        int iM110295a = d860Var.m110295a();
        this.f198293b.m153238d(d860Var, iM110295a);
        this.f198293b.mo11109a(jM218790a, 1, iM110295a, 0, null);
        this.f198296e = i;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: c */
    public void mo102005c(long j, int i) {
        this.f198294c = j;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: d */
    public void mo102006d(uqf uqfVar, int i) {
        m6j0 m6j0VarMo11362b = uqfVar.mo11362b(i, 1);
        this.f198293b = m6j0VarMo11362b;
        m6j0VarMo11362b.mo11110b(this.f198292a.f186385c);
    }
}
