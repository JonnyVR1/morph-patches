package p153l;

import com.google.android.exoplayer2.C1894k;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class eqd0 implements aqd0 {

    /* JADX INFO: renamed from: a */
    public final zpd0 f95324a;

    /* JADX INFO: renamed from: b */
    public qfj0 f95325b;

    /* JADX INFO: renamed from: c */
    public long f95326c = -9223372036854775807L;

    /* JADX INFO: renamed from: d */
    public int f95327d = -1;

    /* JADX INFO: renamed from: e */
    public int f95328e = -1;

    /* JADX INFO: renamed from: f */
    public long f95329f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f95330g = 0;

    /* JADX INFO: renamed from: h */
    public boolean f95331h;

    /* JADX INFO: renamed from: i */
    public boolean f95332i;

    /* JADX INFO: renamed from: j */
    public boolean f95333j;

    public eqd0(zpd0 zpd0Var) {
        this.f95324a = zpd0Var;
    }

    /* JADX INFO: renamed from: e */
    private void m121914e() {
        qfj0 qfj0Var = (qfj0) w11.m204369e(this.f95325b);
        long j = this.f95329f;
        boolean z = this.f95332i;
        qfj0Var.mo11163a(j, z ? 1 : 0, this.f95328e, 0, null);
        this.f95328e = -1;
        this.f95329f = -9223372036854775807L;
        this.f95331h = false;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: a */
    public void mo99454a(long j, long j2) {
        this.f95326c = j;
        this.f95328e = -1;
        this.f95330g = j2;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: b */
    public void mo99455b(ig60 ig60Var, long j, int i, boolean z) {
        w11.m204373i(this.f95325b);
        if (m121915f(ig60Var, i)) {
            if (this.f95328e == -1 && this.f95331h) {
                this.f95332i = (ig60Var.m139820j() & 1) == 0;
            }
            if (!this.f95333j) {
                int iM139816f = ig60Var.m139816f();
                ig60Var.m139808U(iM139816f + 6);
                int iM139836z = ig60Var.m139836z() & 16383;
                int iM139836z2 = ig60Var.m139836z() & 16383;
                ig60Var.m139808U(iM139816f);
                C1894k c1894k = this.f95324a.f205455c;
                if (iM139836z != c1894k.f7790q || iM139836z2 != c1894k.f7791r) {
                    this.f95325b.mo11164b(c1894k.m10336b().m10407n0(iM139836z).m10386S(iM139836z2).m10374G());
                }
                this.f95333j = true;
            }
            int iM139811a = ig60Var.m139811a();
            this.f95325b.m176370d(ig60Var, iM139811a);
            int i2 = this.f95328e;
            if (i2 == -1) {
                this.f95328e = iM139811a;
            } else {
                this.f95328e = i2 + iM139811a;
            }
            this.f95329f = cqd0.m111889a(this.f95330g, j, this.f95326c, 90000);
            if (z) {
                m121914e();
            }
            this.f95327d = i;
        }
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: c */
    public void mo99456c(long j, int i) {
        w11.m204371g(this.f95326c == -9223372036854775807L);
        this.f95326c = j;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: d */
    public void mo99457d(bsf bsfVar, int i) {
        qfj0 qfj0VarMo11416b = bsfVar.mo11416b(i, 2);
        this.f95325b = qfj0VarMo11416b;
        qfj0VarMo11416b.mo11164b(this.f95324a.f205455c);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m121915f(ig60 ig60Var, int i) {
        int iM139795H = ig60Var.m139795H();
        if ((iM139795H & 16) == 16 && (iM139795H & 7) == 0) {
            if (this.f95331h && this.f95328e > 0) {
                m121914e();
            }
            this.f95331h = true;
        } else {
            if (!this.f95331h) {
                kyv.m152151i("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
                return false;
            }
            int iM207434b = wpd0.m207434b(this.f95327d);
            if (i < iM207434b) {
                kyv.m152151i("RtpVP8Reader", bmk0.m105071D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iM207434b), Integer.valueOf(i)));
                return false;
            }
        }
        if ((iM139795H & 128) != 0) {
            int iM139795H2 = ig60Var.m139795H();
            if ((iM139795H2 & 128) != 0 && (ig60Var.m139795H() & 128) != 0) {
                ig60Var.m139809V(1);
            }
            if ((iM139795H2 & 64) != 0) {
                ig60Var.m139809V(1);
            }
            if ((iM139795H2 & 32) != 0 || (iM139795H2 & 16) != 0) {
                ig60Var.m139809V(1);
            }
        }
        return true;
    }
}
