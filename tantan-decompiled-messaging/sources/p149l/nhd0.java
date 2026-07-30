package p149l;

import com.google.android.exoplayer2.C1871k;
import org.eclipse.jetty.http.HttpStatus;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class nhd0 implements xhd0 {

    /* JADX INFO: renamed from: a */
    public final whd0 f138959a;

    /* JADX INFO: renamed from: b */
    public m6j0 f138960b;

    /* JADX INFO: renamed from: d */
    public int f138962d;

    /* JADX INFO: renamed from: f */
    public int f138964f;

    /* JADX INFO: renamed from: g */
    public int f138965g;

    /* JADX INFO: renamed from: h */
    public boolean f138966h;

    /* JADX INFO: renamed from: i */
    public boolean f138967i;

    /* JADX INFO: renamed from: j */
    public long f138968j;

    /* JADX INFO: renamed from: k */
    public long f138969k;

    /* JADX INFO: renamed from: l */
    public boolean f138970l;

    /* JADX INFO: renamed from: c */
    public long f138961c = -9223372036854775807L;

    /* JADX INFO: renamed from: e */
    public int f138963e = -1;

    public nhd0(whd0 whd0Var) {
        this.f138959a = whd0Var;
    }

    /* JADX INFO: renamed from: e */
    private void m159393e() {
        m6j0 m6j0Var = (m6j0) p11.m167011e(this.f138960b);
        long j = this.f138969k;
        boolean z = this.f138966h;
        m6j0Var.mo11109a(j, z ? 1 : 0, this.f138962d, 0, null);
        this.f138962d = 0;
        this.f138969k = -9223372036854775807L;
        this.f138966h = false;
        this.f138970l = false;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: a */
    public void mo102003a(long j, long j2) {
        this.f138961c = j;
        this.f138962d = 0;
        this.f138968j = j2;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: b */
    public void mo102004b(d860 d860Var, long j, int i, boolean z) {
        p11.m167015i(this.f138960b);
        int iM110300f = d860Var.m110300f();
        int iM110285N = d860Var.m110285N();
        boolean z2 = (iM110285N & 1024) > 0;
        if ((iM110285N & 512) != 0 || (iM110285N & HttpStatus.GATEWAY_TIMEOUT_504) != 0 || (iM110285N & 7) != 0) {
            jwv.m143689i("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
            return;
        }
        boolean z3 = this.f138970l;
        if (z2) {
            if (z3 && this.f138962d > 0) {
                m159393e();
            }
            this.f138970l = true;
            if ((d860Var.m110304j() & 252) < 128) {
                jwv.m143689i("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                return;
            } else {
                d860Var.m110299e()[iM110300f] = 0;
                d860Var.m110299e()[iM110300f + 1] = 0;
                d860Var.m110292U(iM110300f);
            }
        } else {
            if (!z3) {
                jwv.m143689i("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                return;
            }
            int iM188881b = thd0.m188881b(this.f138963e);
            if (i < iM188881b) {
                jwv.m143689i("RtpH263Reader", vck0.m197793D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iM188881b), Integer.valueOf(i)));
                return;
            }
        }
        if (this.f138962d == 0) {
            m159394f(d860Var, this.f138967i);
            if (!this.f138967i && this.f138966h) {
                int i2 = this.f138964f;
                C1871k c1871k = this.f138959a.f186385c;
                if (i2 != c1871k.f7753q || this.f138965g != c1871k.f7754r) {
                    this.f138960b.mo11110b(c1871k.m10282b().m10353n0(this.f138964f).m10332S(this.f138965g).m10320G());
                }
                this.f138967i = true;
            }
        }
        int iM110295a = d860Var.m110295a();
        this.f138960b.m153238d(d860Var, iM110295a);
        this.f138962d += iM110295a;
        this.f138969k = zhd0.m218790a(this.f138968j, j, this.f138961c, 90000);
        if (z) {
            m159393e();
        }
        this.f138963e = i;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: c */
    public void mo102005c(long j, int i) {
        p11.m167013g(this.f138961c == -9223372036854775807L);
        this.f138961c = j;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: d */
    public void mo102006d(uqf uqfVar, int i) {
        m6j0 m6j0VarMo11362b = uqfVar.mo11362b(i, 2);
        this.f138960b = m6j0VarMo11362b;
        m6j0VarMo11362b.mo11110b(this.f138959a.f186385c);
    }

    /* JADX INFO: renamed from: f */
    public final void m159394f(d860 d860Var, boolean z) {
        int iM110300f = d860Var.m110300f();
        if (((d860Var.m110281J() >> 10) & 63) != 32) {
            d860Var.m110292U(iM110300f);
            this.f138966h = false;
            return;
        }
        int iM110304j = d860Var.m110304j();
        int i = (iM110304j >> 1) & 1;
        if (!z && i == 0) {
            int i2 = (iM110304j >> 2) & 7;
            if (i2 == 1) {
                this.f138964f = 128;
                this.f138965g = 96;
            } else {
                int i3 = i2 - 2;
                this.f138964f = 176 << i3;
                this.f138965g = 144 << i3;
            }
        }
        d860Var.m110292U(iM110300f);
        this.f138966h = i == 0;
    }
}
