package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class e9r implements hte {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f92672a;

    /* JADX INFO: renamed from: b */
    public final ig60 f92673b;

    /* JADX INFO: renamed from: c */
    public final hg60 f92674c;

    /* JADX INFO: renamed from: d */
    public qfj0 f92675d;

    /* JADX INFO: renamed from: e */
    public String f92676e;

    /* JADX INFO: renamed from: f */
    public C1894k f92677f;

    /* JADX INFO: renamed from: g */
    public int f92678g;

    /* JADX INFO: renamed from: h */
    public int f92679h;

    /* JADX INFO: renamed from: i */
    public int f92680i;

    /* JADX INFO: renamed from: j */
    public int f92681j;

    /* JADX INFO: renamed from: k */
    public long f92682k;

    /* JADX INFO: renamed from: l */
    public boolean f92683l;

    /* JADX INFO: renamed from: m */
    public int f92684m;

    /* JADX INFO: renamed from: n */
    public int f92685n;

    /* JADX INFO: renamed from: o */
    public int f92686o;

    /* JADX INFO: renamed from: p */
    public boolean f92687p;

    /* JADX INFO: renamed from: q */
    public long f92688q;

    /* JADX INFO: renamed from: r */
    public int f92689r;

    /* JADX INFO: renamed from: s */
    public long f92690s;

    /* JADX INFO: renamed from: t */
    public int f92691t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public String f92692u;

    public e9r(@Nullable String str) {
        this.f92672a = str;
        ig60 ig60Var = new ig60(1024);
        this.f92673b = ig60Var;
        this.f92674c = new hg60(ig60Var.m139815e());
        this.f92682k = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: f */
    public static long m119943f(hg60 hg60Var) {
        return hg60Var.m134905h((hg60Var.m134905h(2) + 1) * 8);
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: a */
    public void mo108399a(ig60 ig60Var) throws ParserException {
        w11.m204373i(this.f92675d);
        while (ig60Var.m139811a() > 0) {
            int i = this.f92678g;
            if (i != 0) {
                if (i == 1) {
                    int iM139795H = ig60Var.m139795H();
                    if ((iM139795H & 224) == 224) {
                        this.f92681j = iM139795H;
                        this.f92678g = 2;
                    } else if (iM139795H != 86) {
                        this.f92678g = 0;
                    }
                } else if (i == 2) {
                    int iM139795H2 = ((this.f92681j & (-225)) << 8) | ig60Var.m139795H();
                    this.f92680i = iM139795H2;
                    if (iM139795H2 > this.f92673b.m139815e().length) {
                        m119950m(this.f92680i);
                    }
                    this.f92679h = 0;
                    this.f92678g = 3;
                } else {
                    if (i != 3) {
                        wpg0.m207458a();
                        return;
                    }
                    int iMin = Math.min(ig60Var.m139811a(), this.f92680i - this.f92679h);
                    ig60Var.m139822l(this.f92674c.f109369a, this.f92679h, iMin);
                    int i2 = this.f92679h + iMin;
                    this.f92679h = i2;
                    if (i2 == this.f92680i) {
                        this.f92674c.m134913p(0);
                        m119944g(this.f92674c);
                        this.f92678g = 0;
                    }
                }
            } else if (ig60Var.m139795H() == 86) {
                this.f92678g = 1;
            }
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: b */
    public void mo108400b() {
        this.f92678g = 0;
        this.f92682k = -9223372036854775807L;
        this.f92683l = false;
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: d */
    public void mo108402d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f92682k = j;
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: e */
    public void mo108403e(bsf bsfVar, jkj0.C17969d c17969d) {
        c17969d.m145854a();
        this.f92675d = bsfVar.mo11416b(c17969d.m145856c(), 1);
        this.f92676e = c17969d.m145855b();
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: g */
    public final void m119944g(hg60 hg60Var) throws ParserException {
        if (!hg60Var.m134904g()) {
            this.f92683l = true;
            m119949l(hg60Var);
        } else if (!this.f92683l) {
            return;
        }
        if (this.f92684m != 0) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        if (this.f92685n != 0) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        m119948k(hg60Var, m119947j(hg60Var));
        if (this.f92687p) {
            hg60Var.m134915r((int) this.f92688q);
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m119945h(hg60 hg60Var) throws ParserException {
        int iM134899b = hg60Var.m134899b();
        C21738z1.b bVarM218270e = C21738z1.m218270e(hg60Var, true);
        this.f92692u = bVarM218270e.f202475c;
        this.f92689r = bVarM218270e.f202473a;
        this.f92691t = bVarM218270e.f202474b;
        return iM134899b - hg60Var.m134899b();
    }

    /* JADX INFO: renamed from: i */
    public final void m119946i(hg60 hg60Var) {
        int iM134905h = hg60Var.m134905h(3);
        this.f92686o = iM134905h;
        if (iM134905h == 0) {
            hg60Var.m134915r(8);
            return;
        }
        if (iM134905h == 1) {
            hg60Var.m134915r(9);
            return;
        }
        if (iM134905h == 3 || iM134905h == 4 || iM134905h == 5) {
            hg60Var.m134915r(6);
        } else if (iM134905h == 6 || iM134905h == 7) {
            hg60Var.m134915r(1);
        } else {
            wpg0.m207458a();
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m119947j(hg60 hg60Var) throws ParserException {
        int iM134905h;
        if (this.f92686o != 0) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        int i = 0;
        do {
            iM134905h = hg60Var.m134905h(8);
            i += iM134905h;
        } while (iM134905h == 255);
        return i;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: k */
    public final void m119948k(hg60 hg60Var, int i) {
        int iM134902e = hg60Var.m134902e();
        int i2 = iM134902e & 7;
        ig60 ig60Var = this.f92673b;
        if (i2 == 0) {
            ig60Var.m139808U(iM134902e >> 3);
        } else {
            hg60Var.m134906i(ig60Var.m139815e(), 0, i * 8);
            this.f92673b.m139808U(0);
        }
        this.f92675d.m176370d(this.f92673b, i);
        long j = this.f92682k;
        if (j != -9223372036854775807L) {
            this.f92675d.mo11163a(j, 1, i, 0, null);
            this.f92682k += this.f92690s;
        }
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: l */
    public final void m119949l(hg60 hg60Var) throws ParserException {
        boolean zM134904g;
        int iM134905h = hg60Var.m134905h(1);
        int iM134905h2 = iM134905h == 1 ? hg60Var.m134905h(1) : 0;
        this.f92684m = iM134905h2;
        if (iM134905h2 != 0) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        if (iM134905h == 1) {
            m119943f(hg60Var);
        }
        if (!hg60Var.m134904g()) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        this.f92685n = hg60Var.m134905h(6);
        int iM134905h3 = hg60Var.m134905h(4);
        int iM134905h4 = hg60Var.m134905h(3);
        if (iM134905h3 != 0 || iM134905h4 != 0) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        if (iM134905h == 0) {
            int iM134902e = hg60Var.m134902e();
            int iM119945h = m119945h(hg60Var);
            hg60Var.m134913p(iM134902e);
            byte[] bArr = new byte[(iM119945h + 7) / 8];
            hg60Var.m134906i(bArr, 0, iM119945h);
            C1894k c1894kM10374G = new C1894k.b().m10388U(this.f92676e).m10400g0("audio/mp4a-latm").m10378K(this.f92692u).m10377J(this.f92691t).m10401h0(this.f92689r).m10389V(Collections.singletonList(bArr)).m10391X(this.f92672a).m10374G();
            if (!c1894kM10374G.equals(this.f92677f)) {
                this.f92677f = c1894kM10374G;
                this.f92690s = 1024000000 / ((long) c1894kM10374G.f7799z);
                this.f92675d.mo11164b(c1894kM10374G);
            }
        } else {
            hg60Var.m134915r(((int) m119943f(hg60Var)) - m119945h(hg60Var));
        }
        m119946i(hg60Var);
        boolean zM134904g2 = hg60Var.m134904g();
        this.f92687p = zM134904g2;
        this.f92688q = 0L;
        if (zM134904g2) {
            if (iM134905h == 1) {
                this.f92688q = m119943f(hg60Var);
            } else {
                do {
                    zM134904g = hg60Var.m134904g();
                    this.f92688q = (this.f92688q << 8) + ((long) hg60Var.m134905h(8));
                } while (zM134904g);
            }
        }
        if (hg60Var.m134904g()) {
            hg60Var.m134915r(8);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m119950m(int i) {
        this.f92673b.m139804Q(i);
        this.f92674c.m134911n(this.f92673b.m139815e());
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: c */
    public void mo108401c() {
    }
}
