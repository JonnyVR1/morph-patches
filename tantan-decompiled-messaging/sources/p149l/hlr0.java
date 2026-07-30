package p149l;

import com.google.android.gms.internal.ads.zzcc;
import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes6.dex */
public final class hlr0 implements glr0 {

    /* JADX INFO: renamed from: a */
    public final m5r0 f108363a;

    /* JADX INFO: renamed from: b */
    public final m7r0 f108364b;

    /* JADX INFO: renamed from: c */
    public final jlr0 f108365c;

    /* JADX INFO: renamed from: d */
    public final mhr0 f108366d;

    /* JADX INFO: renamed from: e */
    public final int f108367e;

    /* JADX INFO: renamed from: f */
    public long f108368f;

    /* JADX INFO: renamed from: g */
    public int f108369g;

    /* JADX INFO: renamed from: h */
    public long f108370h;

    public hlr0(m5r0 m5r0Var, m7r0 m7r0Var, jlr0 jlr0Var, String str, int i) throws zzcc {
        this.f108363a = m5r0Var;
        this.f108364b = m7r0Var;
        this.f108365c = jlr0Var;
        int i2 = jlr0Var.f118560b * jlr0Var.f118563e;
        int i3 = jlr0Var.f118562d;
        int i4 = i2 / 8;
        if (i3 != i4) {
            throw zzcc.zza("Expected block size: " + i4 + "; got: " + i3, null);
        }
        int i5 = jlr0Var.f118561c * i4;
        int i6 = i5 * 8;
        int iMax = Math.max(i4, i5 / 10);
        this.f108367e = iMax;
        ter0 ter0Var = new ter0();
        ter0Var.m188618w(str);
        ter0Var.m188603j0(i6);
        ter0Var.m188613r(i6);
        ter0Var.m188610o(iMax);
        ter0Var.m188605k0(jlr0Var.f118560b);
        ter0Var.m188619x(jlr0Var.f118561c);
        ter0Var.m188612q(i);
        this.f108366d = ter0Var.m188591D();
    }

    @Override // p149l.glr0
    /* JADX INFO: renamed from: a */
    public final void mo122084a(long j) {
        this.f108368f = j;
        this.f108369g = 0;
        this.f108370h = 0L;
    }

    @Override // p149l.glr0
    /* JADX INFO: renamed from: b */
    public final void mo122085b(int i, long j) {
        this.f108363a.mo129455j(new mlr0(this.f108365c, 1, i, j));
        this.f108364b.mo134531d(this.f108366d);
    }

    @Override // p149l.glr0
    /* JADX INFO: renamed from: c */
    public final boolean mo122086c(k5r0 k5r0Var, long j) throws IOException {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.f108369g) < (i2 = this.f108367e)) {
            int iM217415a = z6r0.m217415a(this.f108364b, k5r0Var, (int) Math.min(i2 - i, j2), true);
            if (iM217415a == -1) {
                j2 = 0;
            } else {
                this.f108369g += iM217415a;
                j2 -= (long) iM217415a;
            }
        }
        jlr0 jlr0Var = this.f108365c;
        int i3 = this.f108369g;
        int i4 = jlr0Var.f118562d;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long jM126051H = this.f108368f + ggw0.m126051H(this.f108370h, 1000000L, jlr0Var.f118561c, RoundingMode.FLOOR);
            int i6 = i5 * i4;
            int i7 = this.f108369g - i6;
            this.f108364b.mo134530c(jM126051H, 1, i6, i7, null);
            this.f108370h += (long) i5;
            this.f108369g = i7;
        }
        return j2 <= 0;
    }
}
