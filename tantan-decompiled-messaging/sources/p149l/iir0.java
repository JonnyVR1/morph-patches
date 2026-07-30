package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class iir0 implements sir0 {

    /* JADX INFO: renamed from: a */
    public final x5w0 f113428a;

    /* JADX INFO: renamed from: b */
    public final v6w0 f113429b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f113430c;

    /* JADX INFO: renamed from: d */
    public String f113431d;

    /* JADX INFO: renamed from: e */
    public m7r0 f113432e;

    /* JADX INFO: renamed from: f */
    public int f113433f;

    /* JADX INFO: renamed from: g */
    public int f113434g;

    /* JADX INFO: renamed from: h */
    public boolean f113435h;

    /* JADX INFO: renamed from: i */
    public long f113436i;

    /* JADX INFO: renamed from: j */
    public mhr0 f113437j;

    /* JADX INFO: renamed from: k */
    public int f113438k;

    /* JADX INFO: renamed from: l */
    public long f113439l;

    public iir0(@Nullable String str) {
        x5w0 x5w0Var = new x5w0(new byte[128], 128);
        this.f113428a = x5w0Var;
        this.f113429b = new v6w0(x5w0Var.f191198a);
        this.f113433f = 0;
        this.f113439l = -9223372036854775807L;
        this.f113430c = str;
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: b */
    public final void mo121626b(v6w0 v6w0Var) {
        f5v0.m119531b(this.f113432e);
        while (v6w0Var.m197268q() > 0) {
            int i = this.f113433f;
            if (i == 0) {
                while (v6w0Var.m197268q() > 0) {
                    if (this.f113435h) {
                        int iM197238B = v6w0Var.m197238B();
                        if (iM197238B == 119) {
                            this.f113435h = false;
                            this.f113433f = 1;
                            v6w0 v6w0Var2 = this.f113429b;
                            v6w0Var2.m197264m()[0] = 11;
                            v6w0Var2.m197264m()[1] = 119;
                            this.f113434g = 2;
                            break;
                        }
                        this.f113435h = iM197238B == 11;
                    } else {
                        this.f113435h = v6w0Var.m197238B() == 11;
                    }
                }
            } else if (i != 1) {
                int iMin = Math.min(v6w0Var.m197268q(), this.f113438k - this.f113434g);
                this.f113432e.mo134533f(v6w0Var, iMin);
                int i2 = this.f113434g + iMin;
                this.f113434g = i2;
                if (i2 == this.f113438k) {
                    f5v0.m119535f(this.f113439l != -9223372036854775807L);
                    this.f113432e.mo134530c(this.f113439l, 1, this.f113438k, 0, null);
                    this.f113439l += this.f113436i;
                    this.f113433f = 0;
                }
            } else {
                byte[] bArrM197264m = this.f113429b.m197264m();
                int iMin2 = Math.min(v6w0Var.m197268q(), 128 - this.f113434g);
                v6w0Var.m197258g(bArrM197264m, this.f113434g, iMin2);
                int i3 = this.f113434g + iMin2;
                this.f113434g = i3;
                if (i3 == 128) {
                    this.f113428a.m207157k(0);
                    y3r0 y3r0VarM217058e = z3r0.m217058e(this.f113428a);
                    mhr0 mhr0Var = this.f113437j;
                    if (mhr0Var == null || y3r0VarM217058e.f195847c != mhr0Var.f133905y || y3r0VarM217058e.f195846b != mhr0Var.f133906z || !ggw0.m126064f(y3r0VarM217058e.f195845a, mhr0Var.f133892l)) {
                        ter0 ter0Var = new ter0();
                        ter0Var.m188604k(this.f113431d);
                        ter0Var.m188618w(y3r0VarM217058e.f195845a);
                        ter0Var.m188605k0(y3r0VarM217058e.f195847c);
                        ter0Var.m188619x(y3r0VarM217058e.f195846b);
                        ter0Var.m188609n(this.f113430c);
                        ter0Var.m188613r(y3r0VarM217058e.f195850f);
                        if ("audio/ac3".equals(y3r0VarM217058e.f195845a)) {
                            ter0Var.m188603j0(y3r0VarM217058e.f195850f);
                        }
                        mhr0 mhr0VarM188591D = ter0Var.m188591D();
                        this.f113437j = mhr0VarM188591D;
                        this.f113432e.mo134531d(mhr0VarM188591D);
                    }
                    this.f113438k = y3r0VarM217058e.f195848d;
                    this.f113436i = (((long) y3r0VarM217058e.f195849e) * 1000000) / ((long) this.f113437j.f133906z);
                    this.f113429b.m197262k(0);
                    this.f113432e.mo134533f(this.f113429b, 128);
                    this.f113433f = 2;
                }
            }
        }
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: c */
    public final void mo121627c(long j, int i) {
        this.f113439l = j;
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: d */
    public final void mo121628d(m5r0 m5r0Var, alr0 alr0Var) {
        alr0Var.m97444c();
        this.f113431d = alr0Var.m97443b();
        this.f113432e = m5r0Var.mo129454i(alr0Var.m97442a(), 1);
    }

    @Override // p149l.sir0
    public final void zze() {
        this.f113433f = 0;
        this.f113434g = 0;
        this.f113435h = false;
        this.f113439l = -9223372036854775807L;
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: a */
    public final void mo121625a(boolean z) {
    }

    public iir0() {
        this(null);
    }
}
