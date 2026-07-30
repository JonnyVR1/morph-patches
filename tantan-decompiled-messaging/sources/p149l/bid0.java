package p149l;

import com.google.android.exoplayer2.C1871k;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class bid0 implements xhd0 {

    /* JADX INFO: renamed from: a */
    public final whd0 f75725a;

    /* JADX INFO: renamed from: b */
    public m6j0 f75726b;

    /* JADX INFO: renamed from: c */
    public long f75727c = -9223372036854775807L;

    /* JADX INFO: renamed from: d */
    public int f75728d = -1;

    /* JADX INFO: renamed from: e */
    public int f75729e = -1;

    /* JADX INFO: renamed from: f */
    public long f75730f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f75731g = 0;

    /* JADX INFO: renamed from: h */
    public boolean f75732h;

    /* JADX INFO: renamed from: i */
    public boolean f75733i;

    /* JADX INFO: renamed from: j */
    public boolean f75734j;

    public bid0(whd0 whd0Var) {
        this.f75725a = whd0Var;
    }

    /* JADX INFO: renamed from: e */
    private void m102002e() {
        m6j0 m6j0Var = (m6j0) p11.m167011e(this.f75726b);
        long j = this.f75730f;
        boolean z = this.f75733i;
        m6j0Var.mo11109a(j, z ? 1 : 0, this.f75729e, 0, null);
        this.f75729e = -1;
        this.f75730f = -9223372036854775807L;
        this.f75732h = false;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: a */
    public void mo102003a(long j, long j2) {
        this.f75727c = j;
        this.f75729e = -1;
        this.f75731g = j2;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: b */
    public void mo102004b(d860 d860Var, long j, int i, boolean z) {
        p11.m167015i(this.f75726b);
        if (m102007f(d860Var, i)) {
            if (this.f75729e == -1 && this.f75732h) {
                this.f75733i = (d860Var.m110304j() & 1) == 0;
            }
            if (!this.f75734j) {
                int iM110300f = d860Var.m110300f();
                d860Var.m110292U(iM110300f + 6);
                int iM110320z = d860Var.m110320z() & 16383;
                int iM110320z2 = d860Var.m110320z() & 16383;
                d860Var.m110292U(iM110300f);
                C1871k c1871k = this.f75725a.f186385c;
                if (iM110320z != c1871k.f7753q || iM110320z2 != c1871k.f7754r) {
                    this.f75726b.mo11110b(c1871k.m10282b().m10353n0(iM110320z).m10332S(iM110320z2).m10320G());
                }
                this.f75734j = true;
            }
            int iM110295a = d860Var.m110295a();
            this.f75726b.m153238d(d860Var, iM110295a);
            int i2 = this.f75729e;
            if (i2 == -1) {
                this.f75729e = iM110295a;
            } else {
                this.f75729e = i2 + iM110295a;
            }
            this.f75730f = zhd0.m218790a(this.f75731g, j, this.f75727c, 90000);
            if (z) {
                m102002e();
            }
            this.f75728d = i;
        }
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: c */
    public void mo102005c(long j, int i) {
        p11.m167013g(this.f75727c == -9223372036854775807L);
        this.f75727c = j;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: d */
    public void mo102006d(uqf uqfVar, int i) {
        m6j0 m6j0VarMo11362b = uqfVar.mo11362b(i, 2);
        this.f75726b = m6j0VarMo11362b;
        m6j0VarMo11362b.mo11110b(this.f75725a.f186385c);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m102007f(d860 d860Var, int i) {
        int iM110279H = d860Var.m110279H();
        if ((iM110279H & 16) == 16 && (iM110279H & 7) == 0) {
            if (this.f75732h && this.f75729e > 0) {
                m102002e();
            }
            this.f75732h = true;
        } else {
            if (!this.f75732h) {
                jwv.m143689i("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
                return false;
            }
            int iM188881b = thd0.m188881b(this.f75728d);
            if (i < iM188881b) {
                jwv.m143689i("RtpVP8Reader", vck0.m197793D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iM188881b), Integer.valueOf(i)));
                return false;
            }
        }
        if ((iM110279H & 128) != 0) {
            int iM110279H2 = d860Var.m110279H();
            if ((iM110279H2 & 128) != 0 && (d860Var.m110279H() & 128) != 0) {
                d860Var.m110293V(1);
            }
            if ((iM110279H2 & 64) != 0) {
                d860Var.m110293V(1);
            }
            if ((iM110279H2 & 32) != 0 || (iM110279H2 & 16) != 0) {
                d860Var.m110293V(1);
            }
        }
        return true;
    }
}
