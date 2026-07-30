package p153l;

import com.google.android.exoplayer2.ParserException;
import okio.Utf8;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class spd0 implements aqd0 {

    /* JADX INFO: renamed from: c */
    public final zpd0 f170030c;

    /* JADX INFO: renamed from: d */
    public qfj0 f170031d;

    /* JADX INFO: renamed from: e */
    public int f170032e;

    /* JADX INFO: renamed from: h */
    public int f170035h;

    /* JADX INFO: renamed from: i */
    public long f170036i;

    /* JADX INFO: renamed from: a */
    public final ig60 f170028a = new ig60();

    /* JADX INFO: renamed from: b */
    public final ig60 f170029b = new ig60(jb20.f119084a);

    /* JADX INFO: renamed from: f */
    public long f170033f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public int f170034g = -1;

    public spd0(zpd0 zpd0Var) {
        this.f170030c = zpd0Var;
    }

    /* JADX INFO: renamed from: e */
    private static int m187336e(int i) {
        return (i == 19 || i == 20) ? 1 : 0;
    }

    @RequiresNonNull({"trackOutput"})
    /* JADX INFO: renamed from: f */
    private void m187337f(ig60 ig60Var, int i) throws ParserException {
        if (ig60Var.m139815e().length < 3) {
            throw ParserException.createForMalformedManifest("Malformed FU header.", null);
        }
        int i2 = ig60Var.m139815e()[1] & 7;
        byte b = ig60Var.m139815e()[2];
        int i3 = b & Utf8.REPLACEMENT_BYTE;
        boolean z = (b & 128) > 0;
        boolean z2 = (b & 64) > 0;
        if (z) {
            this.f170035h += m187339h();
            ig60Var.m139815e()[1] = (byte) ((i3 << 1) & 127);
            ig60Var.m139815e()[2] = (byte) i2;
            this.f170028a.m139805R(ig60Var.m139815e());
            this.f170028a.m139808U(1);
        } else {
            int i4 = (this.f170034g + 1) % p7f.COLOR_SPACE_UNCALIBRATED;
            if (i != i4) {
                kyv.m152151i("RtpH265Reader", bmk0.m105071D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(i4), Integer.valueOf(i)));
                return;
            } else {
                this.f170028a.m139805R(ig60Var.m139815e());
                this.f170028a.m139808U(3);
            }
        }
        int iM139811a = this.f170028a.m139811a();
        this.f170031d.m176370d(this.f170028a, iM139811a);
        this.f170035h += iM139811a;
        if (z2) {
            this.f170032e = m187336e(i3);
        }
    }

    @RequiresNonNull({"trackOutput"})
    /* JADX INFO: renamed from: g */
    private void m187338g(ig60 ig60Var) {
        int iM139811a = ig60Var.m139811a();
        this.f170035h += m187339h();
        this.f170031d.m176370d(ig60Var, iM139811a);
        this.f170035h += iM139811a;
        this.f170032e = m187336e((ig60Var.m139815e()[0] >> 1) & 63);
    }

    /* JADX INFO: renamed from: h */
    private int m187339h() {
        this.f170029b.m139808U(0);
        int iM139811a = this.f170029b.m139811a();
        ((qfj0) w11.m204369e(this.f170031d)).m176370d(this.f170029b, iM139811a);
        return iM139811a;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: a */
    public void mo99454a(long j, long j2) {
        this.f170033f = j;
        this.f170035h = 0;
        this.f170036i = j2;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: b */
    public void mo99455b(ig60 ig60Var, long j, int i, boolean z) throws ParserException {
        if (ig60Var.m139815e().length == 0) {
            throw ParserException.createForMalformedManifest("Empty RTP data packet.", null);
        }
        int i2 = (ig60Var.m139815e()[0] >> 1) & 63;
        w11.m204373i(this.f170031d);
        if (i2 >= 0 && i2 < 48) {
            m187338g(ig60Var);
        } else if (i2 == 48) {
            pr3.m173429a("need to implement processAggregationPacket");
            return;
        } else {
            if (i2 != 49) {
                throw ParserException.createForMalformedManifest(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i2)), null);
            }
            m187337f(ig60Var, i);
        }
        if (z) {
            if (this.f170033f == -9223372036854775807L) {
                this.f170033f = j;
            }
            this.f170031d.mo11163a(cqd0.m111889a(this.f170036i, j, this.f170033f, 90000), this.f170032e, this.f170035h, 0, null);
            this.f170035h = 0;
        }
        this.f170034g = i;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: d */
    public void mo99457d(bsf bsfVar, int i) {
        qfj0 qfj0VarMo11416b = bsfVar.mo11416b(i, 2);
        this.f170031d = qfj0VarMo11416b;
        qfj0VarMo11416b.mo11164b(this.f170030c.f205455c);
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: c */
    public void mo99456c(long j, int i) {
    }
}
