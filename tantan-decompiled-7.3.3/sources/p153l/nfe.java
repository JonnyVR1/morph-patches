package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class nfe implements hte {

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f141726b;

    /* JADX INFO: renamed from: c */
    public String f141727c;

    /* JADX INFO: renamed from: d */
    public qfj0 f141728d;

    /* JADX INFO: renamed from: f */
    public int f141730f;

    /* JADX INFO: renamed from: g */
    public int f141731g;

    /* JADX INFO: renamed from: h */
    public long f141732h;

    /* JADX INFO: renamed from: i */
    public C1894k f141733i;

    /* JADX INFO: renamed from: j */
    public int f141734j;

    /* JADX INFO: renamed from: a */
    public final ig60 f141725a = new ig60(new byte[18]);

    /* JADX INFO: renamed from: e */
    public int f141729e = 0;

    /* JADX INFO: renamed from: k */
    public long f141735k = -9223372036854775807L;

    public nfe(@Nullable String str) {
        this.f141726b = str;
    }

    /* JADX INFO: renamed from: f */
    private boolean m162924f(ig60 ig60Var, byte[] bArr, int i) {
        int iMin = Math.min(ig60Var.m139811a(), i - this.f141730f);
        ig60Var.m139822l(bArr, this.f141730f, iMin);
        int i2 = this.f141730f + iMin;
        this.f141730f = i2;
        return i2 == i;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: g */
    private void m162925g() {
        byte[] bArrM139815e = this.f141725a.m139815e();
        if (this.f141733i == null) {
            C1894k c1894kM167447g = ofe.m167447g(bArrM139815e, this.f141727c, this.f141726b, null);
            this.f141733i = c1894kM167447g;
            this.f141728d.mo11164b(c1894kM167447g);
        }
        this.f141734j = ofe.m167441a(bArrM139815e);
        this.f141732h = (int) ((((long) ofe.m167446f(bArrM139815e)) * 1000000) / ((long) this.f141733i.f7799z));
    }

    /* JADX INFO: renamed from: h */
    private boolean m162926h(ig60 ig60Var) {
        while (ig60Var.m139811a() > 0) {
            int i = this.f141731g << 8;
            this.f141731g = i;
            int iM139795H = i | ig60Var.m139795H();
            this.f141731g = iM139795H;
            if (ofe.m167444d(iM139795H)) {
                byte[] bArrM139815e = this.f141725a.m139815e();
                int i2 = this.f141731g;
                bArrM139815e[0] = (byte) ((i2 >> 24) & 255);
                bArrM139815e[1] = (byte) ((i2 >> 16) & 255);
                bArrM139815e[2] = (byte) ((i2 >> 8) & 255);
                bArrM139815e[3] = (byte) (i2 & 255);
                this.f141730f = 4;
                this.f141731g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: a */
    public void mo108399a(ig60 ig60Var) {
        w11.m204373i(this.f141728d);
        while (ig60Var.m139811a() > 0) {
            int i = this.f141729e;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        wpg0.m207458a();
                        return;
                    }
                    int iMin = Math.min(ig60Var.m139811a(), this.f141734j - this.f141730f);
                    this.f141728d.m176370d(ig60Var, iMin);
                    int i2 = this.f141730f + iMin;
                    this.f141730f = i2;
                    int i3 = this.f141734j;
                    if (i2 == i3) {
                        long j = this.f141735k;
                        if (j != -9223372036854775807L) {
                            this.f141728d.mo11163a(j, 1, i3, 0, null);
                            this.f141735k += this.f141732h;
                        }
                        this.f141729e = 0;
                    }
                } else if (m162924f(ig60Var, this.f141725a.m139815e(), 18)) {
                    m162925g();
                    this.f141725a.m139808U(0);
                    this.f141728d.m176370d(this.f141725a, 18);
                    this.f141729e = 2;
                }
            } else if (m162926h(ig60Var)) {
                this.f141729e = 1;
            }
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: b */
    public void mo108400b() {
        this.f141729e = 0;
        this.f141730f = 0;
        this.f141731g = 0;
        this.f141735k = -9223372036854775807L;
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: d */
    public void mo108402d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f141735k = j;
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: e */
    public void mo108403e(bsf bsfVar, jkj0.C17969d c17969d) {
        c17969d.m145854a();
        this.f141727c = c17969d.m145855b();
        this.f141728d = bsfVar.mo11416b(c17969d.m145856c(), 1);
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: c */
    public void mo108401c() {
    }
}
