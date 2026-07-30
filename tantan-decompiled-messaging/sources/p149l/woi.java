package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class woi implements sqf {

    /* JADX INFO: renamed from: o */
    public static final xqf f187415o = new xqf() { // from class: l.voi
        @Override // p149l.xqf
        /* JADX INFO: renamed from: b */
        public final sqf[] mo95334b() {
            return woi.m204808c();
        }
    };

    /* JADX INFO: renamed from: a */
    public final byte[] f187416a;

    /* JADX INFO: renamed from: b */
    public final d860 f187417b;

    /* JADX INFO: renamed from: c */
    public final boolean f187418c;

    /* JADX INFO: renamed from: d */
    public final xoi.C21194a f187419d;

    /* JADX INFO: renamed from: e */
    public uqf f187420e;

    /* JADX INFO: renamed from: f */
    public m6j0 f187421f;

    /* JADX INFO: renamed from: g */
    public int f187422g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Metadata f187423h;

    /* JADX INFO: renamed from: i */
    public bpi f187424i;

    /* JADX INFO: renamed from: j */
    public int f187425j;

    /* JADX INFO: renamed from: k */
    public int f187426k;

    /* JADX INFO: renamed from: l */
    public uoi f187427l;

    /* JADX INFO: renamed from: m */
    public int f187428m;

    /* JADX INFO: renamed from: n */
    public long f187429n;

    public woi(int i) {
        this.f187416a = new byte[42];
        this.f187417b = new d860(new byte[32768], 0);
        this.f187418c = (i & 1) != 0;
        this.f187419d = new xoi.C21194a();
        this.f187422g = 0;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ sqf[] m204808c() {
        return new sqf[]{new woi()};
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: a */
    public void mo10975a(long j, long j2) {
        if (j == 0) {
            this.f187422g = 0;
        } else {
            uoi uoiVar = this.f187427l;
            if (uoiVar != null) {
                uoiVar.m171788h(j2);
            }
        }
        this.f187429n = j2 != 0 ? -1L : 0L;
        this.f187428m = 0;
        this.f187417b.m110288Q(0);
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: b */
    public void mo10976b(uqf uqfVar) {
        this.f187420e = uqfVar;
        this.f187421f = uqfVar.mo11362b(0, 1);
        uqfVar.mo11371l();
    }

    /* JADX INFO: renamed from: d */
    public final long m204809d(d860 d860Var, boolean z) {
        boolean zM210422d;
        p11.m167011e(this.f187424i);
        int iM110300f = d860Var.m110300f();
        while (iM110300f <= d860Var.m110301g() - 16) {
            d860Var.m110292U(iM110300f);
            if (xoi.m210422d(d860Var, this.f187424i, this.f187426k, this.f187419d)) {
                d860Var.m110292U(iM110300f);
                return this.f187419d.f193846a;
            }
            iM110300f++;
        }
        if (!z) {
            d860Var.m110292U(iM110300f);
            return -1L;
        }
        while (iM110300f <= d860Var.m110301g() - this.f187425j) {
            d860Var.m110292U(iM110300f);
            try {
                zM210422d = xoi.m210422d(d860Var, this.f187424i, this.f187426k, this.f187419d);
            } catch (IndexOutOfBoundsException unused) {
                zM210422d = false;
            }
            if (d860Var.m110300f() <= d860Var.m110301g() ? zM210422d : false) {
                d860Var.m110292U(iM110300f);
                return this.f187419d.f193846a;
            }
            iM110300f++;
        }
        d860Var.m110292U(d860Var.m110301g());
        return -1L;
    }

    /* JADX INFO: renamed from: e */
    public final void m204810e(tqf tqfVar) throws IOException {
        this.f187426k = yoi.m215504b(tqfVar);
        ((uqf) vck0.m197866j(this.f187420e)).mo11370k(m204811g(tqfVar.getPosition(), tqfVar.getLength()));
        this.f187422g = 5;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: f */
    public boolean mo10977f(tqf tqfVar) throws Throwable {
        yoi.m215505c(tqfVar, false);
        return yoi.m215503a(tqfVar);
    }

    /* JADX INFO: renamed from: g */
    public final hce0 m204811g(long j, long j2) {
        p11.m167011e(this.f187424i);
        bpi bpiVar = this.f187424i;
        if (bpiVar.f76638k != null) {
            return new api(bpiVar, j);
        }
        if (j2 == -1 || bpiVar.f76637j <= 0) {
            return new hce0.C17275b(bpiVar.m103063f());
        }
        uoi uoiVar = new uoi(bpiVar, this.f187426k, j, j2);
        this.f187427l = uoiVar;
        return uoiVar.m171782b();
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: h */
    public int mo10978h(tqf tqfVar, fd80 fd80Var) throws IOException {
        int i = this.f187422g;
        if (i == 0) {
            m204815l(tqfVar);
            return 0;
        }
        if (i == 1) {
            m204812i(tqfVar);
            return 0;
        }
        if (i == 2) {
            m204817n(tqfVar);
            return 0;
        }
        if (i == 3) {
            m204816m(tqfVar);
            return 0;
        }
        if (i == 4) {
            m204810e(tqfVar);
            return 0;
        }
        if (i == 5) {
            return m204814k(tqfVar, fd80Var);
        }
        ohg0.m164364a();
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m204812i(tqf tqfVar) throws IOException {
        byte[] bArr = this.f187416a;
        tqfVar.mo150655f(bArr, 0, bArr.length);
        tqfVar.mo150657h();
        this.f187422g = 2;
    }

    /* JADX INFO: renamed from: j */
    public final void m204813j() {
        ((m6j0) vck0.m197866j(this.f187421f)).mo11109a((this.f187429n * 1000000) / ((long) ((bpi) vck0.m197866j(this.f187424i)).f76632e), 1, this.f187428m, 0, null);
    }

    /* JADX INFO: renamed from: k */
    public final int m204814k(tqf tqfVar, fd80 fd80Var) throws IOException {
        boolean z;
        p11.m167011e(this.f187421f);
        p11.m167011e(this.f187424i);
        uoi uoiVar = this.f187427l;
        if (uoiVar != null && uoiVar.m171784d()) {
            return this.f187427l.m171783c(tqfVar, fd80Var);
        }
        if (this.f187429n == -1) {
            this.f187429n = xoi.m210427i(tqfVar, this.f187424i);
            return 0;
        }
        int iM110301g = this.f187417b.m110301g();
        if (iM110301g < 32768) {
            int i = tqfVar.read(this.f187417b.m110299e(), iM110301g, 32768 - iM110301g);
            z = i == -1;
            d860 d860Var = this.f187417b;
            if (!z) {
                d860Var.m110291T(iM110301g + i);
            } else if (d860Var.m110295a() == 0) {
                m204813j();
                return -1;
            }
        } else {
            z = false;
        }
        int iM110300f = this.f187417b.m110300f();
        int i2 = this.f187428m;
        int i3 = this.f187425j;
        if (i2 < i3) {
            d860 d860Var2 = this.f187417b;
            d860Var2.m110293V(Math.min(i3 - i2, d860Var2.m110295a()));
        }
        long jM204809d = m204809d(this.f187417b, z);
        int iM110300f2 = this.f187417b.m110300f() - iM110300f;
        this.f187417b.m110292U(iM110300f);
        this.f187421f.m153238d(this.f187417b, iM110300f2);
        this.f187428m += iM110300f2;
        if (jM204809d != -1) {
            m204813j();
            this.f187428m = 0;
            this.f187429n = jM204809d;
        }
        if (this.f187417b.m110295a() < 16) {
            int iM110295a = this.f187417b.m110295a();
            System.arraycopy(this.f187417b.m110299e(), this.f187417b.m110300f(), this.f187417b.m110299e(), 0, iM110295a);
            this.f187417b.m110292U(0);
            this.f187417b.m110291T(iM110295a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public final void m204815l(tqf tqfVar) throws IOException {
        this.f187423h = yoi.m215506d(tqfVar, !this.f187418c);
        this.f187422g = 1;
    }

    /* JADX INFO: renamed from: m */
    public final void m204816m(tqf tqfVar) throws IOException {
        yoi.C21450a c21450a = new yoi.C21450a(this.f187424i);
        boolean zM215507e = false;
        while (!zM215507e) {
            zM215507e = yoi.m215507e(tqfVar, c21450a);
            this.f187424i = (bpi) vck0.m197866j(c21450a.f199294a);
        }
        p11.m167011e(this.f187424i);
        this.f187425j = Math.max(this.f187424i.f76630c, 6);
        ((m6j0) vck0.m197866j(this.f187421f)).mo11110b(this.f187424i.m103064g(this.f187416a, this.f187423h));
        this.f187422g = 4;
    }

    /* JADX INFO: renamed from: n */
    public final void m204817n(tqf tqfVar) throws IOException {
        yoi.m215511i(tqfVar);
        this.f187422g = 3;
    }

    @Override // p149l.sqf
    public void release() {
    }

    public woi() {
        this(0);
    }
}
