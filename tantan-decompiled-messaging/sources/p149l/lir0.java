package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class lir0 implements sir0 {

    /* JADX INFO: renamed from: a */
    public final x5w0 f128246a;

    /* JADX INFO: renamed from: b */
    public final v6w0 f128247b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f128248c;

    /* JADX INFO: renamed from: d */
    public String f128249d;

    /* JADX INFO: renamed from: e */
    public m7r0 f128250e;

    /* JADX INFO: renamed from: f */
    public int f128251f;

    /* JADX INFO: renamed from: g */
    public int f128252g;

    /* JADX INFO: renamed from: h */
    public boolean f128253h;

    /* JADX INFO: renamed from: i */
    public long f128254i;

    /* JADX INFO: renamed from: j */
    public mhr0 f128255j;

    /* JADX INFO: renamed from: k */
    public int f128256k;

    /* JADX INFO: renamed from: l */
    public long f128257l;

    public lir0(@Nullable String str) {
        x5w0 x5w0Var = new x5w0(new byte[16], 16);
        this.f128246a = x5w0Var;
        this.f128247b = new v6w0(x5w0Var.f191198a);
        this.f128251f = 0;
        this.f128252g = 0;
        this.f128253h = false;
        this.f128257l = -9223372036854775807L;
        this.f128248c = str;
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: b */
    public final void mo121626b(v6w0 v6w0Var) {
        f5v0.m119531b(this.f128250e);
        while (v6w0Var.m197268q() > 0) {
            int i = this.f128251f;
            if (i == 0) {
                while (true) {
                    if (v6w0Var.m197268q() > 0) {
                        if (this.f128253h) {
                            int iM197238B = v6w0Var.m197238B();
                            this.f128253h = iM197238B == 172;
                            if (iM197238B != 64) {
                                if (iM197238B == 65) {
                                    iM197238B = 65;
                                }
                            }
                            this.f128251f = 1;
                            v6w0 v6w0Var2 = this.f128247b;
                            v6w0Var2.m197264m()[0] = -84;
                            v6w0Var2.m197264m()[1] = iM197238B == 65 ? (byte) 65 : (byte) 64;
                            this.f128252g = 2;
                        } else {
                            this.f128253h = v6w0Var.m197238B() == 172;
                        }
                    }
                }
            } else if (i != 1) {
                int iMin = Math.min(v6w0Var.m197268q(), this.f128256k - this.f128252g);
                this.f128250e.mo134533f(v6w0Var, iMin);
                int i2 = this.f128252g + iMin;
                this.f128252g = i2;
                if (i2 == this.f128256k) {
                    f5v0.m119535f(this.f128257l != -9223372036854775807L);
                    this.f128250e.mo134530c(this.f128257l, 1, this.f128256k, 0, null);
                    this.f128257l += this.f128254i;
                    this.f128251f = 0;
                }
            } else {
                byte[] bArrM197264m = this.f128247b.m197264m();
                int iMin2 = Math.min(v6w0Var.m197268q(), 16 - this.f128252g);
                v6w0Var.m197258g(bArrM197264m, this.f128252g, iMin2);
                int i3 = this.f128252g + iMin2;
                this.f128252g = i3;
                if (i3 == 16) {
                    this.f128246a.m207157k(0);
                    b4r0 b4r0VarM105239a = c4r0.m105239a(this.f128246a);
                    mhr0 mhr0Var = this.f128255j;
                    if (mhr0Var == null || mhr0Var.f133905y != 2 || b4r0VarM105239a.f73399a != mhr0Var.f133906z || !"audio/ac4".equals(mhr0Var.f133892l)) {
                        ter0 ter0Var = new ter0();
                        ter0Var.m188604k(this.f128249d);
                        ter0Var.m188618w("audio/ac4");
                        ter0Var.m188605k0(2);
                        ter0Var.m188619x(b4r0VarM105239a.f73399a);
                        ter0Var.m188609n(this.f128248c);
                        mhr0 mhr0VarM188591D = ter0Var.m188591D();
                        this.f128255j = mhr0VarM188591D;
                        this.f128250e.mo134531d(mhr0VarM188591D);
                    }
                    this.f128256k = b4r0VarM105239a.f73400b;
                    this.f128254i = (((long) b4r0VarM105239a.f73401c) * 1000000) / ((long) this.f128255j.f133906z);
                    this.f128247b.m197262k(0);
                    this.f128250e.mo134533f(this.f128247b, 16);
                    this.f128251f = 2;
                }
            }
        }
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: c */
    public final void mo121627c(long j, int i) {
        this.f128257l = j;
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: d */
    public final void mo121628d(m5r0 m5r0Var, alr0 alr0Var) {
        alr0Var.m97444c();
        this.f128249d = alr0Var.m97443b();
        this.f128250e = m5r0Var.mo129454i(alr0Var.m97442a(), 1);
    }

    @Override // p149l.sir0
    public final void zze() {
        this.f128251f = 0;
        this.f128252g = 0;
        this.f128253h = false;
        this.f128257l = -9223372036854775807L;
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: a */
    public final void mo121625a(boolean z) {
    }

    public lir0() {
        this(null);
    }
}
