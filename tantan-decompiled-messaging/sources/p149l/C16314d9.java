package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.d9 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C16314d9 implements dse {

    /* JADX INFO: renamed from: a */
    public final c860 f84917a;

    /* JADX INFO: renamed from: b */
    public final d860 f84918b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f84919c;

    /* JADX INFO: renamed from: d */
    public String f84920d;

    /* JADX INFO: renamed from: e */
    public m6j0 f84921e;

    /* JADX INFO: renamed from: f */
    public int f84922f;

    /* JADX INFO: renamed from: g */
    public int f84923g;

    /* JADX INFO: renamed from: h */
    public boolean f84924h;

    /* JADX INFO: renamed from: i */
    public long f84925i;

    /* JADX INFO: renamed from: j */
    public C1871k f84926j;

    /* JADX INFO: renamed from: k */
    public int f84927k;

    /* JADX INFO: renamed from: l */
    public long f84928l;

    public C16314d9(@Nullable String str) {
        c860 c860Var = new c860(new byte[128]);
        this.f84917a = c860Var;
        this.f84918b = new d860(c860Var.f79701a);
        this.f84922f = 0;
        this.f84928l = -9223372036854775807L;
        this.f84919c = str;
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: a */
    public void mo95480a(d860 d860Var) {
        p11.m167015i(this.f84921e);
        while (d860Var.m110295a() > 0) {
            int i = this.f84922f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(d860Var.m110295a(), this.f84927k - this.f84923g);
                        this.f84921e.m153238d(d860Var, iMin);
                        int i2 = this.f84923g + iMin;
                        this.f84923g = i2;
                        int i3 = this.f84927k;
                        if (i2 == i3) {
                            long j = this.f84928l;
                            if (j != -9223372036854775807L) {
                                this.f84921e.mo11109a(j, 1, i3, 0, null);
                                this.f84928l += this.f84925i;
                            }
                            this.f84922f = 0;
                        }
                    }
                } else if (m110401f(d860Var, this.f84918b.m110299e(), 128)) {
                    m110402g();
                    this.f84918b.m110292U(0);
                    this.f84921e.m153238d(this.f84918b, 128);
                    this.f84922f = 2;
                }
            } else if (m110403h(d860Var)) {
                this.f84922f = 1;
                this.f84918b.m110299e()[0] = 11;
                this.f84918b.m110299e()[1] = 119;
                this.f84923g = 2;
            }
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: b */
    public void mo95481b() {
        this.f84922f = 0;
        this.f84923g = 0;
        this.f84924h = false;
        this.f84928l = -9223372036854775807L;
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: d */
    public void mo95483d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f84928l = j;
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: e */
    public void mo95484e(uqf uqfVar, fbj0.C16793d c16793d) {
        c16793d.m120357a();
        this.f84920d = c16793d.m120358b();
        this.f84921e = uqfVar.mo11362b(c16793d.m120359c(), 1);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m110401f(d860 d860Var, byte[] bArr, int i) {
        int iMin = Math.min(d860Var.m110295a(), i - this.f84923g);
        d860Var.m110306l(bArr, this.f84923g, iMin);
        int i2 = this.f84923g + iMin;
        this.f84923g = i2;
        return i2 == i;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: g */
    public final void m110402g() {
        this.f84917a.m105672p(0);
        C16561e9.b bVarM115324f = C16561e9.m115324f(this.f84917a);
        C1871k c1871k = this.f84926j;
        if (c1871k == null || bVarM115324f.f89903d != c1871k.f7761y || bVarM115324f.f89902c != c1871k.f7762z || !vck0.m197845c(bVarM115324f.f89900a, c1871k.f7748l)) {
            C1871k.b bVarM10341b0 = new C1871k.b().m10334U(this.f84920d).m10346g0(bVarM115324f.f89900a).m10323J(bVarM115324f.f89903d).m10347h0(bVarM115324f.f89902c).m10337X(this.f84919c).m10341b0(bVarM115324f.f89906g);
            if ("audio/ac3".equals(bVarM115324f.f89900a)) {
                bVarM10341b0.m10322I(bVarM115324f.f89906g);
            }
            C1871k c1871kM10320G = bVarM10341b0.m10320G();
            this.f84926j = c1871kM10320G;
            this.f84921e.mo11110b(c1871kM10320G);
        }
        this.f84927k = bVarM115324f.f89904e;
        this.f84925i = (((long) bVarM115324f.f89905f) * 1000000) / ((long) this.f84926j.f7762z);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m110403h(d860 d860Var) {
        while (true) {
            if (d860Var.m110295a() <= 0) {
                return false;
            }
            if (this.f84924h) {
                int iM110279H = d860Var.m110279H();
                if (iM110279H == 119) {
                    this.f84924h = false;
                    return true;
                }
                this.f84924h = iM110279H == 11;
            } else {
                this.f84924h = d860Var.m110279H() == 11;
            }
        }
    }

    @Override // p149l.dse
    /* JADX INFO: renamed from: c */
    public void mo95482c() {
    }

    public C16314d9() {
        this(null);
    }
}
