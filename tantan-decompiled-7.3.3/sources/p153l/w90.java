package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class w90 implements hte {

    /* JADX INFO: renamed from: v */
    public static final byte[] f187949v = {73, 68, 51};

    /* JADX INFO: renamed from: a */
    public final boolean f187950a;

    /* JADX INFO: renamed from: b */
    public final hg60 f187951b;

    /* JADX INFO: renamed from: c */
    public final ig60 f187952c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f187953d;

    /* JADX INFO: renamed from: e */
    public String f187954e;

    /* JADX INFO: renamed from: f */
    public qfj0 f187955f;

    /* JADX INFO: renamed from: g */
    public qfj0 f187956g;

    /* JADX INFO: renamed from: h */
    public int f187957h;

    /* JADX INFO: renamed from: i */
    public int f187958i;

    /* JADX INFO: renamed from: j */
    public int f187959j;

    /* JADX INFO: renamed from: k */
    public boolean f187960k;

    /* JADX INFO: renamed from: l */
    public boolean f187961l;

    /* JADX INFO: renamed from: m */
    public int f187962m;

    /* JADX INFO: renamed from: n */
    public int f187963n;

    /* JADX INFO: renamed from: o */
    public int f187964o;

    /* JADX INFO: renamed from: p */
    public boolean f187965p;

    /* JADX INFO: renamed from: q */
    public long f187966q;

    /* JADX INFO: renamed from: r */
    public int f187967r;

    /* JADX INFO: renamed from: s */
    public long f187968s;

    /* JADX INFO: renamed from: t */
    public qfj0 f187969t;

    /* JADX INFO: renamed from: u */
    public long f187970u;

    public w90(boolean z, @Nullable String str) {
        this.f187951b = new hg60(new byte[7]);
        this.f187952c = new ig60(Arrays.copyOf(f187949v, 10));
        m205550s();
        this.f187962m = -1;
        this.f187963n = -1;
        this.f187966q = -9223372036854775807L;
        this.f187968s = -9223372036854775807L;
        this.f187950a = z;
        this.f187953d = str;
    }

    /* JADX INFO: renamed from: i */
    private boolean m205537i(ig60 ig60Var, byte[] bArr, int i) {
        int iMin = Math.min(ig60Var.m139811a(), i - this.f187958i);
        ig60Var.m139822l(bArr, this.f187958i, iMin);
        int i2 = this.f187958i + iMin;
        this.f187958i = i2;
        return i2 == i;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m205538m(int i) {
        return (i & 65526) == 65520;
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: a */
    public void mo108399a(ig60 ig60Var) throws ParserException {
        m205539f();
        while (ig60Var.m139811a() > 0) {
            int i = this.f187957h;
            if (i == 0) {
                m205542j(ig60Var);
            } else if (i == 1) {
                m205540g(ig60Var);
            } else if (i != 2) {
                if (i == 3) {
                    if (m205537i(ig60Var, this.f187951b.f109369a, this.f187960k ? 7 : 5)) {
                        m205545n();
                    }
                } else {
                    if (i != 4) {
                        wpg0.m207458a();
                        return;
                    }
                    m205547p(ig60Var);
                }
            } else if (m205537i(ig60Var, this.f187952c.m139815e(), 10)) {
                m205546o();
            }
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: b */
    public void mo108400b() {
        this.f187968s = -9223372036854775807L;
        m205548q();
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: d */
    public void mo108402d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f187968s = j;
        }
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: e */
    public void mo108403e(bsf bsfVar, jkj0.C17969d c17969d) {
        c17969d.m145854a();
        this.f187954e = c17969d.m145855b();
        qfj0 qfj0VarMo11416b = bsfVar.mo11416b(c17969d.m145856c(), 1);
        this.f187955f = qfj0VarMo11416b;
        this.f187969t = qfj0VarMo11416b;
        if (!this.f187950a) {
            this.f187956g = new rfe();
            return;
        }
        c17969d.m145854a();
        qfj0 qfj0VarMo11416b2 = bsfVar.mo11416b(c17969d.m145856c(), 5);
        this.f187956g = qfj0VarMo11416b2;
        qfj0VarMo11416b2.mo11164b(new C1894k.b().m10388U(c17969d.m145855b()).m10400g0("application/id3").m10374G());
    }

    @EnsuresNonNull({"output", "currentOutput", "id3Output"})
    /* JADX INFO: renamed from: f */
    public final void m205539f() {
        w11.m204369e(this.f187955f);
        bmk0.m105144j(this.f187969t);
        bmk0.m105144j(this.f187956g);
    }

    /* JADX INFO: renamed from: g */
    public final void m205540g(ig60 ig60Var) {
        if (ig60Var.m139811a() == 0) {
            return;
        }
        this.f187951b.f109369a[0] = ig60Var.m139815e()[ig60Var.m139816f()];
        this.f187951b.m134913p(2);
        int iM134905h = this.f187951b.m134905h(4);
        int i = this.f187963n;
        if (i != -1 && iM134905h != i) {
            m205548q();
            return;
        }
        if (!this.f187961l) {
            this.f187961l = true;
            this.f187962m = this.f187964o;
            this.f187963n = iM134905h;
        }
        m205551t();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m205541h(ig60 ig60Var, int i) {
        ig60Var.m139808U(i + 1);
        if (!m205554w(ig60Var, this.f187951b.f109369a, 1)) {
            return false;
        }
        this.f187951b.m134913p(4);
        int iM134905h = this.f187951b.m134905h(1);
        int i2 = this.f187962m;
        if (i2 != -1 && iM134905h != i2) {
            return false;
        }
        if (this.f187963n != -1) {
            if (!m205554w(ig60Var, this.f187951b.f109369a, 1)) {
                return true;
            }
            this.f187951b.m134913p(2);
            if (this.f187951b.m134905h(4) != this.f187963n) {
                return false;
            }
            ig60Var.m139808U(i + 2);
        }
        if (!m205554w(ig60Var, this.f187951b.f109369a, 4)) {
            return true;
        }
        this.f187951b.m134913p(14);
        int iM134905h2 = this.f187951b.m134905h(13);
        if (iM134905h2 < 7) {
            return false;
        }
        byte[] bArrM139815e = ig60Var.m139815e();
        int iM139817g = ig60Var.m139817g();
        int i3 = i + iM134905h2;
        if (i3 >= iM139817g) {
            return true;
        }
        byte b = bArrM139815e[i3];
        if (b == -1) {
            int i4 = i3 + 1;
            if (i4 == iM139817g) {
                return true;
            }
            return m205544l((byte) -1, bArrM139815e[i4]) && ((bArrM139815e[i4] & 8) >> 3) == iM134905h;
        }
        if (b != 73) {
            return false;
        }
        int i5 = i3 + 1;
        if (i5 == iM139817g) {
            return true;
        }
        if (bArrM139815e[i5] != 68) {
            return false;
        }
        int i6 = i3 + 2;
        return i6 == iM139817g || bArrM139815e[i6] == 51;
    }

    /* JADX INFO: renamed from: j */
    public final void m205542j(ig60 ig60Var) {
        byte[] bArrM139815e = ig60Var.m139815e();
        int iM139816f = ig60Var.m139816f();
        int iM139817g = ig60Var.m139817g();
        while (iM139816f < iM139817g) {
            int i = iM139816f + 1;
            byte b = bArrM139815e[iM139816f];
            int i2 = b & 255;
            if (this.f187959j == 512 && m205544l((byte) -1, (byte) i2) && (this.f187961l || m205541h(ig60Var, iM139816f - 1))) {
                this.f187964o = (b & 8) >> 3;
                this.f187960k = (b & 1) == 0;
                if (this.f187961l) {
                    m205551t();
                } else {
                    m205549r();
                }
                ig60Var.m139808U(i);
                return;
            }
            int i3 = this.f187959j;
            int i4 = i2 | i3;
            if (i4 == 329) {
                this.f187959j = 768;
            } else if (i4 == 511) {
                this.f187959j = 512;
            } else if (i4 == 836) {
                this.f187959j = 1024;
            } else if (i4 == 1075) {
                m205552u();
                ig60Var.m139808U(i);
                return;
            } else if (i3 != 256) {
                this.f187959j = 256;
            }
            iM139816f = i;
        }
        ig60Var.m139808U(iM139816f);
    }

    /* JADX INFO: renamed from: k */
    public long m205543k() {
        return this.f187966q;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m205544l(byte b, byte b2) {
        return m205538m(((b & 255) << 8) | (b2 & 255));
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: n */
    public final void m205545n() throws ParserException {
        this.f187951b.m134913p(0);
        boolean z = this.f187965p;
        hg60 hg60Var = this.f187951b;
        if (z) {
            hg60Var.m134915r(10);
        } else {
            int i = 2;
            int iM134905h = hg60Var.m134905h(2) + 1;
            if (iM134905h != 2) {
                kyv.m152151i("AdtsReader", "Detected audio object type: " + iM134905h + ", but assuming AAC LC.");
            } else {
                i = iM134905h;
            }
            this.f187951b.m134915r(5);
            byte[] bArrM218267b = C21738z1.m218267b(i, this.f187963n, this.f187951b.m134905h(3));
            C21738z1.b bVarM218271f = C21738z1.m218271f(bArrM218267b);
            C1894k c1894kM10374G = new C1894k.b().m10388U(this.f187954e).m10400g0("audio/mp4a-latm").m10378K(bVarM218271f.f202475c).m10377J(bVarM218271f.f202474b).m10401h0(bVarM218271f.f202473a).m10389V(Collections.singletonList(bArrM218267b)).m10391X(this.f187953d).m10374G();
            this.f187966q = 1024000000 / ((long) c1894kM10374G.f7799z);
            this.f187955f.mo11164b(c1894kM10374G);
            this.f187965p = true;
        }
        this.f187951b.m134915r(4);
        int iM134905h2 = this.f187951b.m134905h(13);
        int i2 = iM134905h2 - 7;
        if (this.f187960k) {
            i2 = iM134905h2 - 9;
        }
        m205553v(this.f187955f, this.f187966q, 0, i2);
    }

    @RequiresNonNull({"id3Output"})
    /* JADX INFO: renamed from: o */
    public final void m205546o() {
        this.f187956g.m176370d(this.f187952c, 10);
        this.f187952c.m139808U(6);
        m205553v(this.f187956g, 0L, 10, this.f187952c.m139794G() + 10);
    }

    @RequiresNonNull({"currentOutput"})
    /* JADX INFO: renamed from: p */
    public final void m205547p(ig60 ig60Var) {
        int iMin = Math.min(ig60Var.m139811a(), this.f187967r - this.f187958i);
        this.f187969t.m176370d(ig60Var, iMin);
        int i = this.f187958i + iMin;
        this.f187958i = i;
        int i2 = this.f187967r;
        if (i == i2) {
            long j = this.f187968s;
            if (j != -9223372036854775807L) {
                this.f187969t.mo11163a(j, 1, i2, 0, null);
                this.f187968s += this.f187970u;
            }
            m205550s();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m205548q() {
        this.f187961l = false;
        m205550s();
    }

    /* JADX INFO: renamed from: r */
    public final void m205549r() {
        this.f187957h = 1;
        this.f187958i = 0;
    }

    /* JADX INFO: renamed from: s */
    public final void m205550s() {
        this.f187957h = 0;
        this.f187958i = 0;
        this.f187959j = 256;
    }

    /* JADX INFO: renamed from: t */
    public final void m205551t() {
        this.f187957h = 3;
        this.f187958i = 0;
    }

    /* JADX INFO: renamed from: u */
    public final void m205552u() {
        this.f187957h = 2;
        this.f187958i = f187949v.length;
        this.f187967r = 0;
        this.f187952c.m139808U(0);
    }

    /* JADX INFO: renamed from: v */
    public final void m205553v(qfj0 qfj0Var, long j, int i, int i2) {
        this.f187957h = 4;
        this.f187958i = i;
        this.f187969t = qfj0Var;
        this.f187970u = j;
        this.f187967r = i2;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m205554w(ig60 ig60Var, byte[] bArr, int i) {
        if (ig60Var.m139811a() < i) {
            return false;
        }
        ig60Var.m139822l(bArr, 0, i);
        return true;
    }

    @Override // p153l.hte
    /* JADX INFO: renamed from: c */
    public void mo108401c() {
    }

    public w90(boolean z) {
        this(z, null);
    }
}
