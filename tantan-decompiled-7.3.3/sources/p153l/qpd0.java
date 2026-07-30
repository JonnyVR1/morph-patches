package p153l;

import com.google.android.exoplayer2.C1894k;
import org.eclipse.jetty.http.HttpStatus;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class qpd0 implements aqd0 {

    /* JADX INFO: renamed from: a */
    public final zpd0 f158856a;

    /* JADX INFO: renamed from: b */
    public qfj0 f158857b;

    /* JADX INFO: renamed from: d */
    public int f158859d;

    /* JADX INFO: renamed from: f */
    public int f158861f;

    /* JADX INFO: renamed from: g */
    public int f158862g;

    /* JADX INFO: renamed from: h */
    public boolean f158863h;

    /* JADX INFO: renamed from: i */
    public boolean f158864i;

    /* JADX INFO: renamed from: j */
    public long f158865j;

    /* JADX INFO: renamed from: k */
    public long f158866k;

    /* JADX INFO: renamed from: l */
    public boolean f158867l;

    /* JADX INFO: renamed from: c */
    public long f158858c = -9223372036854775807L;

    /* JADX INFO: renamed from: e */
    public int f158860e = -1;

    public qpd0(zpd0 zpd0Var) {
        this.f158856a = zpd0Var;
    }

    /* JADX INFO: renamed from: e */
    private void m177452e() {
        qfj0 qfj0Var = (qfj0) w11.m204369e(this.f158857b);
        long j = this.f158866k;
        boolean z = this.f158863h;
        qfj0Var.mo11163a(j, z ? 1 : 0, this.f158859d, 0, null);
        this.f158859d = 0;
        this.f158866k = -9223372036854775807L;
        this.f158863h = false;
        this.f158867l = false;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: a */
    public void mo99454a(long j, long j2) {
        this.f158858c = j;
        this.f158859d = 0;
        this.f158865j = j2;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: b */
    public void mo99455b(ig60 ig60Var, long j, int i, boolean z) {
        w11.m204373i(this.f158857b);
        int iM139816f = ig60Var.m139816f();
        int iM139801N = ig60Var.m139801N();
        boolean z2 = (iM139801N & 1024) > 0;
        if ((iM139801N & 512) != 0 || (iM139801N & HttpStatus.GATEWAY_TIMEOUT_504) != 0 || (iM139801N & 7) != 0) {
            kyv.m152151i("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
            return;
        }
        boolean z3 = this.f158867l;
        if (z2) {
            if (z3 && this.f158859d > 0) {
                m177452e();
            }
            this.f158867l = true;
            if ((ig60Var.m139820j() & 252) < 128) {
                kyv.m152151i("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                return;
            } else {
                ig60Var.m139815e()[iM139816f] = 0;
                ig60Var.m139815e()[iM139816f + 1] = 0;
                ig60Var.m139808U(iM139816f);
            }
        } else {
            if (!z3) {
                kyv.m152151i("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                return;
            }
            int iM207434b = wpd0.m207434b(this.f158860e);
            if (i < iM207434b) {
                kyv.m152151i("RtpH263Reader", bmk0.m105071D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iM207434b), Integer.valueOf(i)));
                return;
            }
        }
        if (this.f158859d == 0) {
            m177453f(ig60Var, this.f158864i);
            if (!this.f158864i && this.f158863h) {
                int i2 = this.f158861f;
                C1894k c1894k = this.f158856a.f205455c;
                if (i2 != c1894k.f7790q || this.f158862g != c1894k.f7791r) {
                    this.f158857b.mo11164b(c1894k.m10336b().m10407n0(this.f158861f).m10386S(this.f158862g).m10374G());
                }
                this.f158864i = true;
            }
        }
        int iM139811a = ig60Var.m139811a();
        this.f158857b.m176370d(ig60Var, iM139811a);
        this.f158859d += iM139811a;
        this.f158866k = cqd0.m111889a(this.f158865j, j, this.f158858c, 90000);
        if (z) {
            m177452e();
        }
        this.f158860e = i;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: c */
    public void mo99456c(long j, int i) {
        w11.m204371g(this.f158858c == -9223372036854775807L);
        this.f158858c = j;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: d */
    public void mo99457d(bsf bsfVar, int i) {
        qfj0 qfj0VarMo11416b = bsfVar.mo11416b(i, 2);
        this.f158857b = qfj0VarMo11416b;
        qfj0VarMo11416b.mo11164b(this.f158856a.f205455c);
    }

    /* JADX INFO: renamed from: f */
    public final void m177453f(ig60 ig60Var, boolean z) {
        int iM139816f = ig60Var.m139816f();
        if (((ig60Var.m139797J() >> 10) & 63) != 32) {
            ig60Var.m139808U(iM139816f);
            this.f158863h = false;
            return;
        }
        int iM139820j = ig60Var.m139820j();
        int i = (iM139820j >> 1) & 1;
        if (!z && i == 0) {
            int i2 = (iM139820j >> 2) & 7;
            if (i2 == 1) {
                this.f158861f = 128;
                this.f158862g = 96;
            } else {
                int i3 = i2 - 2;
                this.f158861f = 176 << i3;
                this.f158862g = 144 << i3;
            }
        }
        ig60Var.m139808U(iM139816f);
        this.f158863h = i == 0;
    }
}
