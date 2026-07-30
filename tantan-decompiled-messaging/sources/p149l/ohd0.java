package p149l;

import com.google.android.exoplayer2.ParserException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ohd0 implements xhd0 {

    /* JADX INFO: renamed from: c */
    public final whd0 f143966c;

    /* JADX INFO: renamed from: d */
    public m6j0 f143967d;

    /* JADX INFO: renamed from: e */
    public int f143968e;

    /* JADX INFO: renamed from: h */
    public int f143971h;

    /* JADX INFO: renamed from: i */
    public long f143972i;

    /* JADX INFO: renamed from: b */
    public final d860 f143965b = new d860(b320.f72762a);

    /* JADX INFO: renamed from: a */
    public final d860 f143964a = new d860();

    /* JADX INFO: renamed from: f */
    public long f143969f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public int f143970g = -1;

    public ohd0(whd0 whd0Var) {
        this.f143966c = whd0Var;
    }

    /* JADX INFO: renamed from: e */
    public static int m164345e(int i) {
        return i == 5 ? 1 : 0;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: a */
    public void mo102003a(long j, long j2) {
        this.f143969f = j;
        this.f143971h = 0;
        this.f143972i = j2;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: b */
    public void mo102004b(d860 d860Var, long j, int i, boolean z) throws ParserException {
        try {
            int i2 = d860Var.m110299e()[0] & 31;
            p11.m167015i(this.f143967d);
            if (i2 > 0 && i2 < 24) {
                m164347g(d860Var);
            } else if (i2 == 24) {
                m164348h(d860Var);
            } else {
                if (i2 != 28) {
                    throw ParserException.createForMalformedManifest(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i2)), null);
                }
                m164346f(d860Var, i);
            }
            if (z) {
                if (this.f143969f == -9223372036854775807L) {
                    this.f143969f = j;
                }
                this.f143967d.mo11109a(zhd0.m218790a(this.f143972i, j, this.f143969f, 90000), this.f143968e, this.f143971h, 0, null);
                this.f143971h = 0;
            }
            this.f143970g = i;
        } catch (IndexOutOfBoundsException e) {
            throw ParserException.createForMalformedManifest(null, e);
        }
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: d */
    public void mo102006d(uqf uqfVar, int i) {
        m6j0 m6j0VarMo11362b = uqfVar.mo11362b(i, 2);
        this.f143967d = m6j0VarMo11362b;
        ((m6j0) vck0.m197866j(m6j0VarMo11362b)).mo11110b(this.f143966c.f186385c);
    }

    @RequiresNonNull({"trackOutput"})
    /* JADX INFO: renamed from: f */
    public final void m164346f(d860 d860Var, int i) {
        byte b = d860Var.m110299e()[0];
        byte b2 = d860Var.m110299e()[1];
        int i2 = (b & 224) | (b2 & 31);
        boolean z = (b2 & 128) > 0;
        boolean z2 = (b2 & 64) > 0;
        if (z) {
            this.f143971h += m164349i();
            d860Var.m110299e()[1] = (byte) i2;
            this.f143964a.m110289R(d860Var.m110299e());
            this.f143964a.m110292U(1);
        } else {
            int iM188881b = thd0.m188881b(this.f143970g);
            if (i != iM188881b) {
                jwv.m143689i("RtpH264Reader", vck0.m197793D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iM188881b), Integer.valueOf(i)));
                return;
            } else {
                this.f143964a.m110289R(d860Var.m110299e());
                this.f143964a.m110292U(2);
            }
        }
        int iM110295a = this.f143964a.m110295a();
        this.f143967d.m153238d(this.f143964a, iM110295a);
        this.f143971h += iM110295a;
        if (z2) {
            this.f143968e = m164345e(i2 & 31);
        }
    }

    @RequiresNonNull({"trackOutput"})
    /* JADX INFO: renamed from: g */
    public final void m164347g(d860 d860Var) {
        int iM110295a = d860Var.m110295a();
        this.f143971h += m164349i();
        this.f143967d.m153238d(d860Var, iM110295a);
        this.f143971h += iM110295a;
        this.f143968e = m164345e(d860Var.m110299e()[0] & 31);
    }

    @RequiresNonNull({"trackOutput"})
    /* JADX INFO: renamed from: h */
    public final void m164348h(d860 d860Var) {
        d860Var.m110279H();
        while (d860Var.m110295a() > 4) {
            int iM110285N = d860Var.m110285N();
            this.f143971h += m164349i();
            this.f143967d.m153238d(d860Var, iM110285N);
            this.f143971h += iM110285N;
        }
        this.f143968e = 0;
    }

    /* JADX INFO: renamed from: i */
    public final int m164349i() {
        this.f143965b.m110292U(0);
        int iM110295a = this.f143965b.m110295a();
        ((m6j0) p11.m167011e(this.f143967d)).m153238d(this.f143965b, iM110295a);
        return iM110295a;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: c */
    public void mo102005c(long j, int i) {
    }
}
