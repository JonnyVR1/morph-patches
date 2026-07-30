package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class aa0 implements dse {

    /* JADX INFO: renamed from: v */
    public static final byte[] f68234v = {73, 68, 51};

    /* JADX INFO: renamed from: a */
    public final boolean f68235a;

    /* JADX INFO: renamed from: b */
    public final c860 f68236b;

    /* JADX INFO: renamed from: c */
    public final d860 f68237c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f68238d;

    /* JADX INFO: renamed from: e */
    public String f68239e;

    /* JADX INFO: renamed from: f */
    public m6j0 f68240f;

    /* JADX INFO: renamed from: g */
    public m6j0 f68241g;

    /* JADX INFO: renamed from: h */
    public int f68242h;

    /* JADX INFO: renamed from: i */
    public int f68243i;

    /* JADX INFO: renamed from: j */
    public int f68244j;

    /* JADX INFO: renamed from: k */
    public boolean f68245k;

    /* JADX INFO: renamed from: l */
    public boolean f68246l;

    /* JADX INFO: renamed from: m */
    public int f68247m;

    /* JADX INFO: renamed from: n */
    public int f68248n;

    /* JADX INFO: renamed from: o */
    public int f68249o;

    /* JADX INFO: renamed from: p */
    public boolean f68250p;

    /* JADX INFO: renamed from: q */
    public long f68251q;

    /* JADX INFO: renamed from: r */
    public int f68252r;

    /* JADX INFO: renamed from: s */
    public long f68253s;

    /* JADX INFO: renamed from: t */
    public m6j0 f68254t;

    /* JADX INFO: renamed from: u */
    public long f68255u;

    public aa0(boolean z, @Nullable String str) {
        this.f68236b = new c860(new byte[7]);
        this.f68237c = new d860(Arrays.copyOf(f68234v, 10));
        m95496s();
        this.f68247m = -1;
        this.f68248n = -1;
        this.f68251q = -9223372036854775807L;
        this.f68253s = -9223372036854775807L;
        this.f68235a = z;
        this.f68238d = str;
    }

    /* JADX INFO: renamed from: i */
    private boolean m95478i(d860 d860Var, byte[] bArr, int i) {
        int iMin = Math.min(d860Var.m110295a(), i - this.f68243i);
        d860Var.m110306l(bArr, this.f68243i, iMin);
        int i2 = this.f68243i + iMin;
        this.f68243i = i2;
        return i2 == i;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m95479m(int i) {
        return (i & 65526) == 65520;
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: a */
    public void mo95480a(d860 d860Var) throws ParserException {
        m95485f();
        while (d860Var.m110295a() > 0) {
            int i = this.f68242h;
            if (i == 0) {
                m95488j(d860Var);
            } else if (i == 1) {
                m95486g(d860Var);
            } else if (i != 2) {
                if (i == 3) {
                    if (m95478i(d860Var, this.f68236b.f79701a, this.f68245k ? 7 : 5)) {
                        m95491n();
                    }
                } else {
                    if (i != 4) {
                        ohg0.m164364a();
                        return;
                    }
                    m95493p(d860Var);
                }
            } else if (m95478i(d860Var, this.f68237c.m110299e(), 10)) {
                m95492o();
            }
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: b */
    public void mo95481b() {
        this.f68253s = -9223372036854775807L;
        m95494q();
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: d */
    public void mo95483d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f68253s = j;
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: e */
    public void mo95484e(uqf uqfVar, fbj0.C16793d c16793d) {
        c16793d.m120357a();
        this.f68239e = c16793d.m120358b();
        m6j0 m6j0VarMo11362b = uqfVar.mo11362b(c16793d.m120359c(), 1);
        this.f68240f = m6j0VarMo11362b;
        this.f68254t = m6j0VarMo11362b;
        if (!this.f68235a) {
            this.f68241g = new nee();
            return;
        }
        c16793d.m120357a();
        m6j0 m6j0VarMo11362b2 = uqfVar.mo11362b(c16793d.m120359c(), 5);
        this.f68241g = m6j0VarMo11362b2;
        m6j0VarMo11362b2.mo11110b(new C1871k.b().m10334U(c16793d.m120358b()).m10346g0("application/id3").m10320G());
    }

    @EnsuresNonNull({"output", "currentOutput", "id3Output"})
    /* JADX INFO: renamed from: f */
    public final void m95485f() {
        p11.m167011e(this.f68240f);
        vck0.m197866j(this.f68254t);
        vck0.m197866j(this.f68241g);
    }

    /* JADX INFO: renamed from: g */
    public final void m95486g(d860 d860Var) {
        if (d860Var.m110295a() == 0) {
            return;
        }
        this.f68236b.f79701a[0] = d860Var.m110299e()[d860Var.m110300f()];
        this.f68236b.m105672p(2);
        int iM105664h = this.f68236b.m105664h(4);
        int i = this.f68248n;
        if (i != -1 && iM105664h != i) {
            m95494q();
            return;
        }
        if (!this.f68246l) {
            this.f68246l = true;
            this.f68247m = this.f68249o;
            this.f68248n = iM105664h;
        }
        m95497t();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m95487h(d860 d860Var, int i) {
        d860Var.m110292U(i + 1);
        if (!m95500w(d860Var, this.f68236b.f79701a, 1)) {
            return false;
        }
        this.f68236b.m105672p(4);
        int iM105664h = this.f68236b.m105664h(1);
        int i2 = this.f68247m;
        if (i2 != -1 && iM105664h != i2) {
            return false;
        }
        if (this.f68248n != -1) {
            if (!m95500w(d860Var, this.f68236b.f79701a, 1)) {
                return true;
            }
            this.f68236b.m105672p(2);
            if (this.f68236b.m105664h(4) != this.f68248n) {
                return false;
            }
            d860Var.m110292U(i + 2);
        }
        if (!m95500w(d860Var, this.f68236b.f79701a, 4)) {
            return true;
        }
        this.f68236b.m105672p(14);
        int iM105664h2 = this.f68236b.m105664h(13);
        if (iM105664h2 < 7) {
            return false;
        }
        byte[] bArrM110299e = d860Var.m110299e();
        int iM110301g = d860Var.m110301g();
        int i3 = i + iM105664h2;
        if (i3 >= iM110301g) {
            return true;
        }
        byte b = bArrM110299e[i3];
        if (b == -1) {
            int i4 = i3 + 1;
            if (i4 == iM110301g) {
                return true;
            }
            return m95490l((byte) -1, bArrM110299e[i4]) && ((bArrM110299e[i4] & 8) >> 3) == iM105664h;
        }
        if (b != 73) {
            return false;
        }
        int i5 = i3 + 1;
        if (i5 == iM110301g) {
            return true;
        }
        if (bArrM110299e[i5] != 68) {
            return false;
        }
        int i6 = i3 + 2;
        return i6 == iM110301g || bArrM110299e[i6] == 51;
    }

    /* JADX INFO: renamed from: j */
    public final void m95488j(d860 d860Var) {
        byte[] bArrM110299e = d860Var.m110299e();
        int iM110300f = d860Var.m110300f();
        int iM110301g = d860Var.m110301g();
        while (iM110300f < iM110301g) {
            int i = iM110300f + 1;
            byte b = bArrM110299e[iM110300f];
            int i2 = b & 255;
            if (this.f68244j == 512 && m95490l((byte) -1, (byte) i2) && (this.f68246l || m95487h(d860Var, iM110300f - 1))) {
                this.f68249o = (b & 8) >> 3;
                this.f68245k = (b & 1) == 0;
                if (this.f68246l) {
                    m95497t();
                } else {
                    m95495r();
                }
                d860Var.m110292U(i);
                return;
            }
            int i3 = this.f68244j;
            int i4 = i2 | i3;
            if (i4 == 329) {
                this.f68244j = 768;
            } else if (i4 == 511) {
                this.f68244j = 512;
            } else if (i4 == 836) {
                this.f68244j = 1024;
            } else if (i4 == 1075) {
                m95498u();
                d860Var.m110292U(i);
                return;
            } else if (i3 != 256) {
                this.f68244j = 256;
            }
            iM110300f = i;
        }
        d860Var.m110292U(iM110300f);
    }

    /* JADX INFO: renamed from: k */
    public long m95489k() {
        return this.f68251q;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m95490l(byte b, byte b2) {
        return m95479m(((b & 255) << 8) | (b2 & 255));
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: n */
    public final void m95491n() throws ParserException {
        this.f68236b.m105672p(0);
        boolean z = this.f68250p;
        c860 c860Var = this.f68236b;
        if (z) {
            c860Var.m105674r(10);
        } else {
            int i = 2;
            int iM105664h = c860Var.m105664h(2) + 1;
            if (iM105664h != 2) {
                jwv.m143689i("AdtsReader", "Detected audio object type: " + iM105664h + ", but assuming AAC LC.");
            } else {
                i = iM105664h;
            }
            this.f68236b.m105674r(5);
            byte[] bArrM216774b = C21594z1.m216774b(i, this.f68248n, this.f68236b.m105664h(3));
            C21594z1.b bVarM216778f = C21594z1.m216778f(bArrM216774b);
            C1871k c1871kM10320G = new C1871k.b().m10334U(this.f68239e).m10346g0("audio/mp4a-latm").m10324K(bVarM216778f.f201036c).m10323J(bVarM216778f.f201035b).m10347h0(bVarM216778f.f201034a).m10335V(Collections.singletonList(bArrM216774b)).m10337X(this.f68238d).m10320G();
            this.f68251q = 1024000000 / ((long) c1871kM10320G.f7762z);
            this.f68240f.mo11110b(c1871kM10320G);
            this.f68250p = true;
        }
        this.f68236b.m105674r(4);
        int iM105664h2 = this.f68236b.m105664h(13);
        int i2 = iM105664h2 - 7;
        if (this.f68245k) {
            i2 = iM105664h2 - 9;
        }
        m95499v(this.f68240f, this.f68251q, 0, i2);
    }

    @RequiresNonNull({"id3Output"})
    /* JADX INFO: renamed from: o */
    public final void m95492o() {
        this.f68241g.m153238d(this.f68237c, 10);
        this.f68237c.m110292U(6);
        m95499v(this.f68241g, 0L, 10, this.f68237c.m110278G() + 10);
    }

    @RequiresNonNull({"currentOutput"})
    /* JADX INFO: renamed from: p */
    public final void m95493p(d860 d860Var) {
        int iMin = Math.min(d860Var.m110295a(), this.f68252r - this.f68243i);
        this.f68254t.m153238d(d860Var, iMin);
        int i = this.f68243i + iMin;
        this.f68243i = i;
        int i2 = this.f68252r;
        if (i == i2) {
            long j = this.f68253s;
            if (j != -9223372036854775807L) {
                this.f68254t.mo11109a(j, 1, i2, 0, null);
                this.f68253s += this.f68255u;
            }
            m95496s();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m95494q() {
        this.f68246l = false;
        m95496s();
    }

    /* JADX INFO: renamed from: r */
    public final void m95495r() {
        this.f68242h = 1;
        this.f68243i = 0;
    }

    /* JADX INFO: renamed from: s */
    public final void m95496s() {
        this.f68242h = 0;
        this.f68243i = 0;
        this.f68244j = 256;
    }

    /* JADX INFO: renamed from: t */
    public final void m95497t() {
        this.f68242h = 3;
        this.f68243i = 0;
    }

    /* JADX INFO: renamed from: u */
    public final void m95498u() {
        this.f68242h = 2;
        this.f68243i = f68234v.length;
        this.f68252r = 0;
        this.f68237c.m110292U(0);
    }

    /* JADX INFO: renamed from: v */
    public final void m95499v(m6j0 m6j0Var, long j, int i, int i2) {
        this.f68242h = 4;
        this.f68243i = i;
        this.f68254t = m6j0Var;
        this.f68255u = j;
        this.f68252r = i2;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m95500w(d860 d860Var, byte[] bArr, int i) {
        if (d860Var.m110295a() < i) {
            return false;
        }
        d860Var.m110306l(bArr, 0, i);
        return true;
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: c */
    public void mo95482c() {
    }

    public aa0(boolean z) {
        this(z, null);
    }
}
