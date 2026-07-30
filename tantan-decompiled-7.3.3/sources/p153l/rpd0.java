package p153l;

import com.google.android.exoplayer2.ParserException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class rpd0 implements aqd0 {

    /* JADX INFO: renamed from: c */
    public final zpd0 f164354c;

    /* JADX INFO: renamed from: d */
    public qfj0 f164355d;

    /* JADX INFO: renamed from: e */
    public int f164356e;

    /* JADX INFO: renamed from: h */
    public int f164359h;

    /* JADX INFO: renamed from: i */
    public long f164360i;

    /* JADX INFO: renamed from: b */
    public final ig60 f164353b = new ig60(jb20.f119084a);

    /* JADX INFO: renamed from: a */
    public final ig60 f164352a = new ig60();

    /* JADX INFO: renamed from: f */
    public long f164357f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public int f164358g = -1;

    public rpd0(zpd0 zpd0Var) {
        this.f164354c = zpd0Var;
    }

    /* JADX INFO: renamed from: e */
    public static int m182519e(int i) {
        return i == 5 ? 1 : 0;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: a */
    public void mo99454a(long j, long j2) {
        this.f164357f = j;
        this.f164359h = 0;
        this.f164360i = j2;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: b */
    public void mo99455b(ig60 ig60Var, long j, int i, boolean z) throws ParserException {
        try {
            int i2 = ig60Var.m139815e()[0] & 31;
            w11.m204373i(this.f164355d);
            if (i2 > 0 && i2 < 24) {
                m182521g(ig60Var);
            } else if (i2 == 24) {
                m182522h(ig60Var);
            } else {
                if (i2 != 28) {
                    throw ParserException.createForMalformedManifest(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i2)), null);
                }
                m182520f(ig60Var, i);
            }
            if (z) {
                if (this.f164357f == -9223372036854775807L) {
                    this.f164357f = j;
                }
                this.f164355d.mo11163a(cqd0.m111889a(this.f164360i, j, this.f164357f, 90000), this.f164356e, this.f164359h, 0, null);
                this.f164359h = 0;
            }
            this.f164358g = i;
        } catch (IndexOutOfBoundsException e) {
            throw ParserException.createForMalformedManifest(null, e);
        }
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: d */
    public void mo99457d(bsf bsfVar, int i) {
        qfj0 qfj0VarMo11416b = bsfVar.mo11416b(i, 2);
        this.f164355d = qfj0VarMo11416b;
        ((qfj0) bmk0.m105144j(qfj0VarMo11416b)).mo11164b(this.f164354c.f205455c);
    }

    @RequiresNonNull({"trackOutput"})
    /* JADX INFO: renamed from: f */
    public final void m182520f(ig60 ig60Var, int i) {
        byte b = ig60Var.m139815e()[0];
        byte b2 = ig60Var.m139815e()[1];
        int i2 = (b & 224) | (b2 & 31);
        boolean z = (b2 & 128) > 0;
        boolean z2 = (b2 & 64) > 0;
        if (z) {
            this.f164359h += m182523i();
            ig60Var.m139815e()[1] = (byte) i2;
            this.f164352a.m139805R(ig60Var.m139815e());
            this.f164352a.m139808U(1);
        } else {
            int iM207434b = wpd0.m207434b(this.f164358g);
            if (i != iM207434b) {
                kyv.m152151i("RtpH264Reader", bmk0.m105071D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iM207434b), Integer.valueOf(i)));
                return;
            } else {
                this.f164352a.m139805R(ig60Var.m139815e());
                this.f164352a.m139808U(2);
            }
        }
        int iM139811a = this.f164352a.m139811a();
        this.f164355d.m176370d(this.f164352a, iM139811a);
        this.f164359h += iM139811a;
        if (z2) {
            this.f164356e = m182519e(i2 & 31);
        }
    }

    @RequiresNonNull({"trackOutput"})
    /* JADX INFO: renamed from: g */
    public final void m182521g(ig60 ig60Var) {
        int iM139811a = ig60Var.m139811a();
        this.f164359h += m182523i();
        this.f164355d.m176370d(ig60Var, iM139811a);
        this.f164359h += iM139811a;
        this.f164356e = m182519e(ig60Var.m139815e()[0] & 31);
    }

    @RequiresNonNull({"trackOutput"})
    /* JADX INFO: renamed from: h */
    public final void m182522h(ig60 ig60Var) {
        ig60Var.m139795H();
        while (ig60Var.m139811a() > 4) {
            int iM139801N = ig60Var.m139801N();
            this.f164359h += m182523i();
            this.f164355d.m176370d(ig60Var, iM139801N);
            this.f164359h += iM139801N;
        }
        this.f164356e = 0;
    }

    /* JADX INFO: renamed from: i */
    public final int m182523i() {
        this.f164353b.m139808U(0);
        int iM139811a = this.f164353b.m139811a();
        ((qfj0) w11.m204369e(this.f164355d)).m176370d(this.f164353b, iM139811a);
        return iM139811a;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: c */
    public void mo99456c(long j, int i) {
    }
}
