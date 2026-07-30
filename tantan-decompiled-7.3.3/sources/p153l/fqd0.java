package p153l;

import com.google.android.exoplayer2.C1894k;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class fqd0 implements aqd0 {

    /* JADX INFO: renamed from: a */
    public final zpd0 f100266a;

    /* JADX INFO: renamed from: b */
    public qfj0 f100267b;

    /* JADX INFO: renamed from: j */
    public boolean f100275j;

    /* JADX INFO: renamed from: k */
    public boolean f100276k;

    /* JADX INFO: renamed from: l */
    public boolean f100277l;

    /* JADX INFO: renamed from: c */
    public long f100268c = -9223372036854775807L;

    /* JADX INFO: renamed from: f */
    public int f100271f = -1;

    /* JADX INFO: renamed from: g */
    public long f100272g = -9223372036854775807L;

    /* JADX INFO: renamed from: d */
    public long f100269d = 0;

    /* JADX INFO: renamed from: e */
    public int f100270e = -1;

    /* JADX INFO: renamed from: h */
    public int f100273h = -1;

    /* JADX INFO: renamed from: i */
    public int f100274i = -1;

    public fqd0(zpd0 zpd0Var) {
        this.f100266a = zpd0Var;
    }

    /* JADX INFO: renamed from: e */
    private void m126740e() {
        qfj0 qfj0Var = (qfj0) w11.m204369e(this.f100267b);
        long j = this.f100272g;
        boolean z = this.f100277l;
        qfj0Var.mo11163a(j, z ? 1 : 0, this.f100271f, 0, null);
        this.f100271f = -1;
        this.f100272g = -9223372036854775807L;
        this.f100275j = false;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: a */
    public void mo99454a(long j, long j2) {
        this.f100268c = j;
        this.f100271f = -1;
        this.f100269d = j2;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: b */
    public void mo99455b(ig60 ig60Var, long j, int i, boolean z) {
        int i2;
        int i3;
        w11.m204373i(this.f100267b);
        if (m126741f(ig60Var, i)) {
            if (this.f100271f == -1 && this.f100275j) {
                this.f100277l = (ig60Var.m139820j() & 4) == 0;
            }
            if (!this.f100276k && (i2 = this.f100273h) != -1 && (i3 = this.f100274i) != -1) {
                C1894k c1894k = this.f100266a.f205455c;
                if (i2 != c1894k.f7790q || i3 != c1894k.f7791r) {
                    this.f100267b.mo11164b(c1894k.m10336b().m10407n0(this.f100273h).m10386S(this.f100274i).m10374G());
                }
                this.f100276k = true;
            }
            int iM139811a = ig60Var.m139811a();
            this.f100267b.m176370d(ig60Var, iM139811a);
            int i4 = this.f100271f;
            if (i4 == -1) {
                this.f100271f = iM139811a;
            } else {
                this.f100271f = i4 + iM139811a;
            }
            this.f100272g = cqd0.m111889a(this.f100269d, j, this.f100268c, 90000);
            if (z) {
                m126740e();
            }
            this.f100270e = i;
        }
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: c */
    public void mo99456c(long j, int i) {
        w11.m204371g(this.f100268c == -9223372036854775807L);
        this.f100268c = j;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: d */
    public void mo99457d(bsf bsfVar, int i) {
        qfj0 qfj0VarMo11416b = bsfVar.mo11416b(i, 2);
        this.f100267b = qfj0VarMo11416b;
        qfj0VarMo11416b.mo11164b(this.f100266a.f205455c);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m126741f(ig60 ig60Var, int i) {
        int iM139795H = ig60Var.m139795H();
        int i2 = iM139795H & 8;
        boolean z = this.f100275j;
        if (i2 == 8) {
            if (z && this.f100271f > 0) {
                m126740e();
            }
            this.f100275j = true;
        } else {
            if (!z) {
                kyv.m152151i("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                return false;
            }
            int iM207434b = wpd0.m207434b(this.f100270e);
            if (i < iM207434b) {
                kyv.m152151i("RtpVp9Reader", bmk0.m105071D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iM207434b), Integer.valueOf(i)));
                return false;
            }
        }
        if ((iM139795H & 128) != 0 && (ig60Var.m139795H() & 128) != 0 && ig60Var.m139811a() < 1) {
            return false;
        }
        int i3 = iM139795H & 16;
        w11.m204366b(i3 == 0, "VP9 flexible mode is not supported.");
        if ((iM139795H & 32) != 0) {
            ig60Var.m139809V(1);
            if (ig60Var.m139811a() < 1) {
                return false;
            }
            if (i3 == 0) {
                ig60Var.m139809V(1);
            }
        }
        if ((iM139795H & 2) != 0) {
            int iM139795H2 = ig60Var.m139795H();
            int i4 = (iM139795H2 >> 5) & 7;
            if ((iM139795H2 & 16) != 0) {
                int i5 = i4 + 1;
                if (ig60Var.m139811a() < i5 * 4) {
                    return false;
                }
                for (int i6 = 0; i6 < i5; i6++) {
                    this.f100273h = ig60Var.m139801N();
                    this.f100274i = ig60Var.m139801N();
                }
            }
            if ((iM139795H2 & 8) != 0) {
                int iM139795H3 = ig60Var.m139795H();
                if (ig60Var.m139811a() < iM139795H3) {
                    return false;
                }
                for (int i7 = 0; i7 < iM139795H3; i7++) {
                    int iM139801N = (ig60Var.m139801N() & 12) >> 2;
                    if (ig60Var.m139811a() < iM139801N) {
                        return false;
                    }
                    ig60Var.m139809V(iM139801N);
                }
            }
        }
        return true;
    }
}
