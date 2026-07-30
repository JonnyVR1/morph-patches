package p149l;

import com.google.android.exoplayer2.C1871k;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class cid0 implements xhd0 {

    /* JADX INFO: renamed from: a */
    public final whd0 f81056a;

    /* JADX INFO: renamed from: b */
    public m6j0 f81057b;

    /* JADX INFO: renamed from: j */
    public boolean f81065j;

    /* JADX INFO: renamed from: k */
    public boolean f81066k;

    /* JADX INFO: renamed from: l */
    public boolean f81067l;

    /* JADX INFO: renamed from: c */
    public long f81058c = -9223372036854775807L;

    /* JADX INFO: renamed from: f */
    public int f81061f = -1;

    /* JADX INFO: renamed from: g */
    public long f81062g = -9223372036854775807L;

    /* JADX INFO: renamed from: d */
    public long f81059d = 0;

    /* JADX INFO: renamed from: e */
    public int f81060e = -1;

    /* JADX INFO: renamed from: h */
    public int f81063h = -1;

    /* JADX INFO: renamed from: i */
    public int f81064i = -1;

    public cid0(whd0 whd0Var) {
        this.f81056a = whd0Var;
    }

    /* JADX INFO: renamed from: e */
    private void m107065e() {
        m6j0 m6j0Var = (m6j0) p11.m167011e(this.f81057b);
        long j = this.f81062g;
        boolean z = this.f81067l;
        m6j0Var.mo11109a(j, z ? 1 : 0, this.f81061f, 0, null);
        this.f81061f = -1;
        this.f81062g = -9223372036854775807L;
        this.f81065j = false;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: a */
    public void mo102003a(long j, long j2) {
        this.f81058c = j;
        this.f81061f = -1;
        this.f81059d = j2;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: b */
    public void mo102004b(d860 d860Var, long j, int i, boolean z) {
        int i2;
        int i3;
        p11.m167015i(this.f81057b);
        if (m107066f(d860Var, i)) {
            if (this.f81061f == -1 && this.f81065j) {
                this.f81067l = (d860Var.m110304j() & 4) == 0;
            }
            if (!this.f81066k && (i2 = this.f81063h) != -1 && (i3 = this.f81064i) != -1) {
                C1871k c1871k = this.f81056a.f186385c;
                if (i2 != c1871k.f7753q || i3 != c1871k.f7754r) {
                    this.f81057b.mo11110b(c1871k.m10282b().m10353n0(this.f81063h).m10332S(this.f81064i).m10320G());
                }
                this.f81066k = true;
            }
            int iM110295a = d860Var.m110295a();
            this.f81057b.m153238d(d860Var, iM110295a);
            int i4 = this.f81061f;
            if (i4 == -1) {
                this.f81061f = iM110295a;
            } else {
                this.f81061f = i4 + iM110295a;
            }
            this.f81062g = zhd0.m218790a(this.f81059d, j, this.f81058c, 90000);
            if (z) {
                m107065e();
            }
            this.f81060e = i;
        }
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: c */
    public void mo102005c(long j, int i) {
        p11.m167013g(this.f81058c == -9223372036854775807L);
        this.f81058c = j;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: d */
    public void mo102006d(uqf uqfVar, int i) {
        m6j0 m6j0VarMo11362b = uqfVar.mo11362b(i, 2);
        this.f81057b = m6j0VarMo11362b;
        m6j0VarMo11362b.mo11110b(this.f81056a.f186385c);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m107066f(d860 d860Var, int i) {
        int iM110279H = d860Var.m110279H();
        int i2 = iM110279H & 8;
        boolean z = this.f81065j;
        if (i2 == 8) {
            if (z && this.f81061f > 0) {
                m107065e();
            }
            this.f81065j = true;
        } else {
            if (!z) {
                jwv.m143689i("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                return false;
            }
            int iM188881b = thd0.m188881b(this.f81060e);
            if (i < iM188881b) {
                jwv.m143689i("RtpVp9Reader", vck0.m197793D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iM188881b), Integer.valueOf(i)));
                return false;
            }
        }
        if ((iM110279H & 128) != 0 && (d860Var.m110279H() & 128) != 0 && d860Var.m110295a() < 1) {
            return false;
        }
        int i3 = iM110279H & 16;
        p11.m167008b(i3 == 0, "VP9 flexible mode is not supported.");
        if ((iM110279H & 32) != 0) {
            d860Var.m110293V(1);
            if (d860Var.m110295a() < 1) {
                return false;
            }
            if (i3 == 0) {
                d860Var.m110293V(1);
            }
        }
        if ((iM110279H & 2) != 0) {
            int iM110279H2 = d860Var.m110279H();
            int i4 = (iM110279H2 >> 5) & 7;
            if ((iM110279H2 & 16) != 0) {
                int i5 = i4 + 1;
                if (d860Var.m110295a() < i5 * 4) {
                    return false;
                }
                for (int i6 = 0; i6 < i5; i6++) {
                    this.f81063h = d860Var.m110285N();
                    this.f81064i = d860Var.m110285N();
                }
            }
            if ((iM110279H2 & 8) != 0) {
                int iM110279H3 = d860Var.m110279H();
                if (d860Var.m110295a() < iM110279H3) {
                    return false;
                }
                for (int i7 = 0; i7 < iM110279H3; i7++) {
                    int iM110285N = (d860Var.m110285N() & 12) >> 2;
                    if (d860Var.m110295a() < iM110285N) {
                        return false;
                    }
                    d860Var.m110293V(iM110285N);
                }
            }
        }
        return true;
    }
}
