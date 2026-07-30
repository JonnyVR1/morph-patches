package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class khd0 implements xhd0 {

    /* JADX INFO: renamed from: h */
    public static final int[] f123133h = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: i */
    public static final int[] f123134i = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: a */
    public final whd0 f123135a;

    /* JADX INFO: renamed from: b */
    public final boolean f123136b;

    /* JADX INFO: renamed from: c */
    public final int f123137c;

    /* JADX INFO: renamed from: d */
    public m6j0 f123138d;

    /* JADX INFO: renamed from: e */
    public long f123139e = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public int f123141g = -1;

    /* JADX INFO: renamed from: f */
    public long f123140f = 0;

    public khd0(whd0 whd0Var) {
        this.f123135a = whd0Var;
        this.f123136b = "audio/amr-wb".equals(p11.m167011e(whd0Var.f186385c.f7748l));
        this.f123137c = whd0Var.f186384b;
    }

    /* JADX INFO: renamed from: e */
    public static int m145956e(int i, boolean z) {
        boolean z2 = (i >= 0 && i <= 8) || i == 15;
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(z ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        p11.m167008b(z2, sb.toString());
        return z ? f123134i[i] : f123133h[i];
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: a */
    public void mo102003a(long j, long j2) {
        this.f123139e = j;
        this.f123140f = j2;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: b */
    public void mo102004b(d860 d860Var, long j, int i, boolean z) {
        int iM188881b;
        p11.m167015i(this.f123138d);
        int i2 = this.f123141g;
        if (i2 != -1 && i != (iM188881b = thd0.m188881b(i2))) {
            jwv.m143689i("RtpAmrReader", vck0.m197793D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(iM188881b), Integer.valueOf(i)));
        }
        d860Var.m110293V(1);
        int iM145956e = m145956e((d860Var.m110304j() >> 3) & 15, this.f123136b);
        int iM110295a = d860Var.m110295a();
        p11.m167008b(iM110295a == iM145956e, "compound payload not supported currently");
        this.f123138d.m153238d(d860Var, iM110295a);
        this.f123138d.mo11109a(zhd0.m218790a(this.f123140f, j, this.f123139e, this.f123137c), 1, iM110295a, 0, null);
        this.f123141g = i;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: c */
    public void mo102005c(long j, int i) {
        this.f123139e = j;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: d */
    public void mo102006d(uqf uqfVar, int i) {
        m6j0 m6j0VarMo11362b = uqfVar.mo11362b(i, 1);
        this.f123138d = m6j0VarMo11362b;
        m6j0VarMo11362b.mo11110b(this.f123135a.f186385c);
    }
}
