package p153l;

import com.google.android.exoplayer2.C1894k;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class vpd0 implements aqd0 {

    /* JADX INFO: renamed from: a */
    public final zpd0 f185239a;

    /* JADX INFO: renamed from: b */
    public qfj0 f185240b;

    /* JADX INFO: renamed from: d */
    public long f185242d;

    /* JADX INFO: renamed from: f */
    public boolean f185244f;

    /* JADX INFO: renamed from: g */
    public boolean f185245g;

    /* JADX INFO: renamed from: c */
    public long f185241c = -1;

    /* JADX INFO: renamed from: e */
    public int f185243e = -1;

    public vpd0(zpd0 zpd0Var) {
        this.f185239a = zpd0Var;
    }

    /* JADX INFO: renamed from: e */
    public static void m202228e(ig60 ig60Var) {
        int iM139816f = ig60Var.m139816f();
        w11.m204366b(ig60Var.m139817g() > 18, "ID Header has insufficient data");
        w11.m204366b(ig60Var.m139792E(8).equals("OpusHead"), "ID Header missing");
        w11.m204366b(ig60Var.m139795H() == 1, "version number must always be 1");
        ig60Var.m139808U(iM139816f);
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: a */
    public void mo99454a(long j, long j2) {
        this.f185241c = j;
        this.f185242d = j2;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: b */
    public void mo99455b(ig60 ig60Var, long j, int i, boolean z) {
        w11.m204373i(this.f185240b);
        if (!this.f185244f) {
            m202228e(ig60Var);
            List<byte[]> listM204959a = w560.m204959a(ig60Var.m139815e());
            C1894k.b bVarM10336b = this.f185239a.f205455c.m10336b();
            bVarM10336b.m10389V(listM204959a);
            this.f185240b.mo11164b(bVarM10336b.m10374G());
            this.f185244f = true;
        } else if (this.f185245g) {
            int iM207434b = wpd0.m207434b(this.f185243e);
            if (i != iM207434b) {
                kyv.m152151i("RtpOpusReader", bmk0.m105071D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(iM207434b), Integer.valueOf(i)));
            }
            int iM139811a = ig60Var.m139811a();
            this.f185240b.m176370d(ig60Var, iM139811a);
            this.f185240b.mo11163a(cqd0.m111889a(this.f185242d, j, this.f185241c, 48000), 1, iM139811a, 0, null);
        } else {
            w11.m204366b(ig60Var.m139817g() >= 8, "Comment Header has insufficient data");
            w11.m204366b(ig60Var.m139792E(8).equals("OpusTags"), "Comment Header should follow ID Header");
            this.f185245g = true;
        }
        this.f185243e = i;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: c */
    public void mo99456c(long j, int i) {
        this.f185241c = j;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: d */
    public void mo99457d(bsf bsfVar, int i) {
        qfj0 qfj0VarMo11416b = bsfVar.mo11416b(i, 1);
        this.f185240b = qfj0VarMo11416b;
        qfj0VarMo11416b.mo11164b(this.f185239a.f205455c);
    }
}
