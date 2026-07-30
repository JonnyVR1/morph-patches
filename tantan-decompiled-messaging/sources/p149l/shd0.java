package p149l;

import com.google.android.exoplayer2.C1871k;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class shd0 implements xhd0 {

    /* JADX INFO: renamed from: a */
    public final whd0 f164552a;

    /* JADX INFO: renamed from: b */
    public m6j0 f164553b;

    /* JADX INFO: renamed from: d */
    public long f164555d;

    /* JADX INFO: renamed from: f */
    public boolean f164557f;

    /* JADX INFO: renamed from: g */
    public boolean f164558g;

    /* JADX INFO: renamed from: c */
    public long f164554c = -1;

    /* JADX INFO: renamed from: e */
    public int f164556e = -1;

    public shd0(whd0 whd0Var) {
        this.f164552a = whd0Var;
    }

    /* JADX INFO: renamed from: e */
    public static void m184189e(d860 d860Var) {
        int iM110300f = d860Var.m110300f();
        p11.m167008b(d860Var.m110301g() > 18, "ID Header has insufficient data");
        p11.m167008b(d860Var.m110276E(8).equals("OpusHead"), "ID Header missing");
        p11.m167008b(d860Var.m110279H() == 1, "version number must always be 1");
        d860Var.m110292U(iM110300f);
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: a */
    public void mo102003a(long j, long j2) {
        this.f164554c = j;
        this.f164555d = j2;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: b */
    public void mo102004b(d860 d860Var, long j, int i, boolean z) {
        p11.m167015i(this.f164553b);
        if (!this.f164557f) {
            m184189e(d860Var);
            List<byte[]> listM181470a = rx50.m181470a(d860Var.m110299e());
            C1871k.b bVarM10282b = this.f164552a.f186385c.m10282b();
            bVarM10282b.m10335V(listM181470a);
            this.f164553b.mo11110b(bVarM10282b.m10320G());
            this.f164557f = true;
        } else if (this.f164558g) {
            int iM188881b = thd0.m188881b(this.f164556e);
            if (i != iM188881b) {
                jwv.m143689i("RtpOpusReader", vck0.m197793D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(iM188881b), Integer.valueOf(i)));
            }
            int iM110295a = d860Var.m110295a();
            this.f164553b.m153238d(d860Var, iM110295a);
            this.f164553b.mo11109a(zhd0.m218790a(this.f164555d, j, this.f164554c, 48000), 1, iM110295a, 0, null);
        } else {
            p11.m167008b(d860Var.m110301g() >= 8, "Comment Header has insufficient data");
            p11.m167008b(d860Var.m110276E(8).equals("OpusTags"), "Comment Header should follow ID Header");
            this.f164558g = true;
        }
        this.f164556e = i;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: c */
    public void mo102005c(long j, int i) {
        this.f164554c = j;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: d */
    public void mo102006d(uqf uqfVar, int i) {
        m6j0 m6j0VarMo11362b = uqfVar.mo11362b(i, 1);
        this.f164553b = m6j0VarMo11362b;
        m6j0VarMo11362b.mo11110b(this.f164552a.f186385c);
    }
}
