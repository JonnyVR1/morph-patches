package p149l;

import com.google.common.primitives.Bytes;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class rhd0 implements xhd0 {

    /* JADX INFO: renamed from: a */
    public final whd0 f159352a;

    /* JADX INFO: renamed from: b */
    public m6j0 f159353b;

    /* JADX INFO: renamed from: c */
    public int f159354c;

    /* JADX INFO: renamed from: d */
    public long f159355d = -9223372036854775807L;

    /* JADX INFO: renamed from: e */
    public int f159356e = -1;

    /* JADX INFO: renamed from: f */
    public long f159357f;

    /* JADX INFO: renamed from: g */
    public int f159358g;

    public rhd0(whd0 whd0Var) {
        this.f159352a = whd0Var;
    }

    /* JADX INFO: renamed from: e */
    public static int m179343e(d860 d860Var) {
        int iM16390e = Bytes.m16390e(d860Var.m110299e(), new byte[]{0, 0, 1, -74});
        if (iM16390e != -1) {
            d860Var.m110292U(iM16390e + 4);
            if ((d860Var.m110304j() >> 6) == 0) {
                return 1;
            }
        }
        return 0;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: a */
    public void mo102003a(long j, long j2) {
        this.f159355d = j;
        this.f159357f = j2;
        this.f159358g = 0;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: b */
    public void mo102004b(d860 d860Var, long j, int i, boolean z) {
        int iM188881b;
        p11.m167015i(this.f159353b);
        int i2 = this.f159356e;
        if (i2 != -1 && i != (iM188881b = thd0.m188881b(i2))) {
            jwv.m143689i("RtpMpeg4Reader", vck0.m197793D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iM188881b), Integer.valueOf(i)));
        }
        int iM110295a = d860Var.m110295a();
        this.f159353b.m153238d(d860Var, iM110295a);
        if (this.f159358g == 0) {
            this.f159354c = m179343e(d860Var);
        }
        this.f159358g += iM110295a;
        if (z) {
            if (this.f159355d == -9223372036854775807L) {
                this.f159355d = j;
            }
            this.f159353b.mo11109a(zhd0.m218790a(this.f159357f, j, this.f159355d, 90000), this.f159354c, this.f159358g, 0, null);
            this.f159358g = 0;
        }
        this.f159356e = i;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: d */
    public void mo102006d(uqf uqfVar, int i) {
        m6j0 m6j0VarMo11362b = uqfVar.mo11362b(i, 2);
        this.f159353b = m6j0VarMo11362b;
        ((m6j0) vck0.m197866j(m6j0VarMo11362b)).mo11110b(this.f159352a.f186385c);
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: c */
    public void mo102005c(long j, int i) {
    }
}
