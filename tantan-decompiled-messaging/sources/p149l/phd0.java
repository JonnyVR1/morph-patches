package p149l;

import com.google.android.exoplayer2.ParserException;
import okio.Utf8;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class phd0 implements xhd0 {

    /* JADX INFO: renamed from: c */
    public final whd0 f148893c;

    /* JADX INFO: renamed from: d */
    public m6j0 f148894d;

    /* JADX INFO: renamed from: e */
    public int f148895e;

    /* JADX INFO: renamed from: h */
    public int f148898h;

    /* JADX INFO: renamed from: i */
    public long f148899i;

    /* JADX INFO: renamed from: a */
    public final d860 f148891a = new d860();

    /* JADX INFO: renamed from: b */
    public final d860 f148892b = new d860(b320.f72762a);

    /* JADX INFO: renamed from: f */
    public long f148896f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public int f148897g = -1;

    public phd0(whd0 whd0Var) {
        this.f148893c = whd0Var;
    }

    /* JADX INFO: renamed from: e */
    private static int m168937e(int i) {
        return (i == 19 || i == 20) ? 1 : 0;
    }

    @RequiresNonNull({"trackOutput"})
    /* JADX INFO: renamed from: f */
    private void m168938f(d860 d860Var, int i) throws ParserException {
        if (d860Var.m110299e().length < 3) {
            throw ParserException.createForMalformedManifest("Malformed FU header.", null);
        }
        int i2 = d860Var.m110299e()[1] & 7;
        byte b = d860Var.m110299e()[2];
        int i3 = b & Utf8.REPLACEMENT_BYTE;
        boolean z = (b & 128) > 0;
        boolean z2 = (b & 64) > 0;
        if (z) {
            this.f148898h += m168940h();
            d860Var.m110299e()[1] = (byte) ((i3 << 1) & 127);
            d860Var.m110299e()[2] = (byte) i2;
            this.f148891a.m110289R(d860Var.m110299e());
            this.f148891a.m110292U(1);
        } else {
            int i4 = (this.f148897g + 1) % j6f.COLOR_SPACE_UNCALIBRATED;
            if (i != i4) {
                jwv.m143689i("RtpH265Reader", vck0.m197793D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(i4), Integer.valueOf(i)));
                return;
            } else {
                this.f148891a.m110289R(d860Var.m110299e());
                this.f148891a.m110292U(3);
            }
        }
        int iM110295a = this.f148891a.m110295a();
        this.f148894d.m153238d(this.f148891a, iM110295a);
        this.f148898h += iM110295a;
        if (z2) {
            this.f148895e = m168937e(i3);
        }
    }

    @RequiresNonNull({"trackOutput"})
    /* JADX INFO: renamed from: g */
    private void m168939g(d860 d860Var) {
        int iM110295a = d860Var.m110295a();
        this.f148898h += m168940h();
        this.f148894d.m153238d(d860Var, iM110295a);
        this.f148898h += iM110295a;
        this.f148895e = m168937e((d860Var.m110299e()[0] >> 1) & 63);
    }

    /* JADX INFO: renamed from: h */
    private int m168940h() {
        this.f148892b.m110292U(0);
        int iM110295a = this.f148892b.m110295a();
        ((m6j0) p11.m167011e(this.f148894d)).m153238d(this.f148892b, iM110295a);
        return iM110295a;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: a */
    public void mo102003a(long j, long j2) {
        this.f148896f = j;
        this.f148898h = 0;
        this.f148899i = j2;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: b */
    public void mo102004b(d860 d860Var, long j, int i, boolean z) throws ParserException {
        if (d860Var.m110299e().length == 0) {
            throw ParserException.createForMalformedManifest("Empty RTP data packet.", null);
        }
        int i2 = (d860Var.m110299e()[0] >> 1) & 63;
        p11.m167015i(this.f148894d);
        if (i2 >= 0 && i2 < 48) {
            m168939g(d860Var);
        } else if (i2 == 48) {
            qq3.m175877a("need to implement processAggregationPacket");
            return;
        } else {
            if (i2 != 49) {
                throw ParserException.createForMalformedManifest(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i2)), null);
            }
            m168938f(d860Var, i);
        }
        if (z) {
            if (this.f148896f == -9223372036854775807L) {
                this.f148896f = j;
            }
            this.f148894d.mo11109a(zhd0.m218790a(this.f148899i, j, this.f148896f, 90000), this.f148895e, this.f148898h, 0, null);
            this.f148898h = 0;
        }
        this.f148897g = i;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: d */
    public void mo102006d(uqf uqfVar, int i) {
        m6j0 m6j0VarMo11362b = uqfVar.mo11362b(i, 2);
        this.f148894d = m6j0VarMo11362b;
        m6j0VarMo11362b.mo11110b(this.f148893c.f186385c);
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: c */
    public void mo102005c(long j, int i) {
    }
}
