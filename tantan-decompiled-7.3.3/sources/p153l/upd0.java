package p153l;

import com.google.common.primitives.Bytes;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class upd0 implements aqd0 {

    /* JADX INFO: renamed from: a */
    public final zpd0 f180239a;

    /* JADX INFO: renamed from: b */
    public qfj0 f180240b;

    /* JADX INFO: renamed from: c */
    public int f180241c;

    /* JADX INFO: renamed from: d */
    public long f180242d = -9223372036854775807L;

    /* JADX INFO: renamed from: e */
    public int f180243e = -1;

    /* JADX INFO: renamed from: f */
    public long f180244f;

    /* JADX INFO: renamed from: g */
    public int f180245g;

    public upd0(zpd0 zpd0Var) {
        this.f180239a = zpd0Var;
    }

    /* JADX INFO: renamed from: e */
    public static int m197066e(ig60 ig60Var) {
        int iM16445e = Bytes.m16445e(ig60Var.m139815e(), new byte[]{0, 0, 1, -74});
        if (iM16445e != -1) {
            ig60Var.m139808U(iM16445e + 4);
            if ((ig60Var.m139820j() >> 6) == 0) {
                return 1;
            }
        }
        return 0;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: a */
    public void mo99454a(long j, long j2) {
        this.f180242d = j;
        this.f180244f = j2;
        this.f180245g = 0;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: b */
    public void mo99455b(ig60 ig60Var, long j, int i, boolean z) {
        int iM207434b;
        w11.m204373i(this.f180240b);
        int i2 = this.f180243e;
        if (i2 != -1 && i != (iM207434b = wpd0.m207434b(i2))) {
            kyv.m152151i("RtpMpeg4Reader", bmk0.m105071D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iM207434b), Integer.valueOf(i)));
        }
        int iM139811a = ig60Var.m139811a();
        this.f180240b.m176370d(ig60Var, iM139811a);
        if (this.f180245g == 0) {
            this.f180241c = m197066e(ig60Var);
        }
        this.f180245g += iM139811a;
        if (z) {
            if (this.f180242d == -9223372036854775807L) {
                this.f180242d = j;
            }
            this.f180240b.mo11163a(cqd0.m111889a(this.f180244f, j, this.f180242d, 90000), this.f180241c, this.f180245g, 0, null);
            this.f180245g = 0;
        }
        this.f180243e = i;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: d */
    public void mo99457d(bsf bsfVar, int i) {
        qfj0 qfj0VarMo11416b = bsfVar.mo11416b(i, 2);
        this.f180240b = qfj0VarMo11416b;
        ((qfj0) bmk0.m105144j(qfj0VarMo11416b)).mo11164b(this.f180239a.f205455c);
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: c */
    public void mo99456c(long j, int i) {
    }
}
