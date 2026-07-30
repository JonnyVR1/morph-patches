package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class d7r implements dse {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f84764a;

    /* JADX INFO: renamed from: b */
    public final d860 f84765b;

    /* JADX INFO: renamed from: c */
    public final c860 f84766c;

    /* JADX INFO: renamed from: d */
    public m6j0 f84767d;

    /* JADX INFO: renamed from: e */
    public String f84768e;

    /* JADX INFO: renamed from: f */
    public C1871k f84769f;

    /* JADX INFO: renamed from: g */
    public int f84770g;

    /* JADX INFO: renamed from: h */
    public int f84771h;

    /* JADX INFO: renamed from: i */
    public int f84772i;

    /* JADX INFO: renamed from: j */
    public int f84773j;

    /* JADX INFO: renamed from: k */
    public long f84774k;

    /* JADX INFO: renamed from: l */
    public boolean f84775l;

    /* JADX INFO: renamed from: m */
    public int f84776m;

    /* JADX INFO: renamed from: n */
    public int f84777n;

    /* JADX INFO: renamed from: o */
    public int f84778o;

    /* JADX INFO: renamed from: p */
    public boolean f84779p;

    /* JADX INFO: renamed from: q */
    public long f84780q;

    /* JADX INFO: renamed from: r */
    public int f84781r;

    /* JADX INFO: renamed from: s */
    public long f84782s;

    /* JADX INFO: renamed from: t */
    public int f84783t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public String f84784u;

    public d7r(@Nullable String str) {
        this.f84764a = str;
        d860 d860Var = new d860(1024);
        this.f84765b = d860Var;
        this.f84766c = new c860(d860Var.m110299e());
        this.f84774k = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: f */
    public static long m110239f(c860 c860Var) {
        return c860Var.m105664h((c860Var.m105664h(2) + 1) * 8);
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: a */
    public void mo95480a(d860 d860Var) throws ParserException {
        p11.m167015i(this.f84767d);
        while (d860Var.m110295a() > 0) {
            int i = this.f84770g;
            if (i != 0) {
                if (i == 1) {
                    int iM110279H = d860Var.m110279H();
                    if ((iM110279H & 224) == 224) {
                        this.f84773j = iM110279H;
                        this.f84770g = 2;
                    } else if (iM110279H != 86) {
                        this.f84770g = 0;
                    }
                } else if (i == 2) {
                    int iM110279H2 = ((this.f84773j & (-225)) << 8) | d860Var.m110279H();
                    this.f84772i = iM110279H2;
                    if (iM110279H2 > this.f84765b.m110299e().length) {
                        m110246m(this.f84772i);
                    }
                    this.f84771h = 0;
                    this.f84770g = 3;
                } else {
                    if (i != 3) {
                        ohg0.m164364a();
                        return;
                    }
                    int iMin = Math.min(d860Var.m110295a(), this.f84772i - this.f84771h);
                    d860Var.m110306l(this.f84766c.f79701a, this.f84771h, iMin);
                    int i2 = this.f84771h + iMin;
                    this.f84771h = i2;
                    if (i2 == this.f84772i) {
                        this.f84766c.m105672p(0);
                        m110240g(this.f84766c);
                        this.f84770g = 0;
                    }
                }
            } else if (d860Var.m110279H() == 86) {
                this.f84770g = 1;
            }
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: b */
    public void mo95481b() {
        this.f84770g = 0;
        this.f84774k = -9223372036854775807L;
        this.f84775l = false;
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: d */
    public void mo95483d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f84774k = j;
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: e */
    public void mo95484e(uqf uqfVar, fbj0.C16793d c16793d) {
        c16793d.m120357a();
        this.f84767d = uqfVar.mo11362b(c16793d.m120359c(), 1);
        this.f84768e = c16793d.m120358b();
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: g */
    public final void m110240g(c860 c860Var) throws ParserException {
        if (!c860Var.m105663g()) {
            this.f84775l = true;
            m110245l(c860Var);
        } else if (!this.f84775l) {
            return;
        }
        if (this.f84776m != 0) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        if (this.f84777n != 0) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        m110244k(c860Var, m110243j(c860Var));
        if (this.f84779p) {
            c860Var.m105674r((int) this.f84780q);
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m110241h(c860 c860Var) throws ParserException {
        int iM105658b = c860Var.m105658b();
        C21594z1.b bVarM216777e = C21594z1.m216777e(c860Var, true);
        this.f84784u = bVarM216777e.f201036c;
        this.f84781r = bVarM216777e.f201034a;
        this.f84783t = bVarM216777e.f201035b;
        return iM105658b - c860Var.m105658b();
    }

    /* JADX INFO: renamed from: i */
    public final void m110242i(c860 c860Var) {
        int iM105664h = c860Var.m105664h(3);
        this.f84778o = iM105664h;
        if (iM105664h == 0) {
            c860Var.m105674r(8);
            return;
        }
        if (iM105664h == 1) {
            c860Var.m105674r(9);
            return;
        }
        if (iM105664h == 3 || iM105664h == 4 || iM105664h == 5) {
            c860Var.m105674r(6);
        } else if (iM105664h == 6 || iM105664h == 7) {
            c860Var.m105674r(1);
        } else {
            ohg0.m164364a();
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m110243j(c860 c860Var) throws ParserException {
        int iM105664h;
        if (this.f84778o != 0) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        int i = 0;
        do {
            iM105664h = c860Var.m105664h(8);
            i += iM105664h;
        } while (iM105664h == 255);
        return i;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: k */
    public final void m110244k(c860 c860Var, int i) {
        int iM105661e = c860Var.m105661e();
        int i2 = iM105661e & 7;
        d860 d860Var = this.f84765b;
        if (i2 == 0) {
            d860Var.m110292U(iM105661e >> 3);
        } else {
            c860Var.m105665i(d860Var.m110299e(), 0, i * 8);
            this.f84765b.m110292U(0);
        }
        this.f84767d.m153238d(this.f84765b, i);
        long j = this.f84774k;
        if (j != -9223372036854775807L) {
            this.f84767d.mo11109a(j, 1, i, 0, null);
            this.f84774k += this.f84782s;
        }
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: l */
    public final void m110245l(c860 c860Var) throws ParserException {
        boolean zM105663g;
        int iM105664h = c860Var.m105664h(1);
        int iM105664h2 = iM105664h == 1 ? c860Var.m105664h(1) : 0;
        this.f84776m = iM105664h2;
        if (iM105664h2 != 0) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        if (iM105664h == 1) {
            m110239f(c860Var);
        }
        if (!c860Var.m105663g()) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        this.f84777n = c860Var.m105664h(6);
        int iM105664h3 = c860Var.m105664h(4);
        int iM105664h4 = c860Var.m105664h(3);
        if (iM105664h3 != 0 || iM105664h4 != 0) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        if (iM105664h == 0) {
            int iM105661e = c860Var.m105661e();
            int iM110241h = m110241h(c860Var);
            c860Var.m105672p(iM105661e);
            byte[] bArr = new byte[(iM110241h + 7) / 8];
            c860Var.m105665i(bArr, 0, iM110241h);
            C1871k c1871kM10320G = new C1871k.b().m10334U(this.f84768e).m10346g0("audio/mp4a-latm").m10324K(this.f84784u).m10323J(this.f84783t).m10347h0(this.f84781r).m10335V(Collections.singletonList(bArr)).m10337X(this.f84764a).m10320G();
            if (!c1871kM10320G.equals(this.f84769f)) {
                this.f84769f = c1871kM10320G;
                this.f84782s = 1024000000 / ((long) c1871kM10320G.f7762z);
                this.f84767d.mo11110b(c1871kM10320G);
            }
        } else {
            c860Var.m105674r(((int) m110239f(c860Var)) - m110241h(c860Var));
        }
        m110242i(c860Var);
        boolean zM105663g2 = c860Var.m105663g();
        this.f84779p = zM105663g2;
        this.f84780q = 0L;
        if (zM105663g2) {
            if (iM105664h == 1) {
                this.f84780q = m110239f(c860Var);
            } else {
                do {
                    zM105663g = c860Var.m105663g();
                    this.f84780q = (this.f84780q << 8) + ((long) c860Var.m105664h(8));
                } while (zM105663g);
            }
        }
        if (c860Var.m105663g()) {
            c860Var.m105674r(8);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m110246m(int i) {
        this.f84765b.m110288Q(i);
        this.f84766c.m105670n(this.f84765b.m110299e());
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: c */
    public void mo95482c() {
    }
}
