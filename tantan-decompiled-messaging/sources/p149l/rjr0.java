package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class rjr0 implements sir0 {

    /* JADX INFO: renamed from: a */
    public final v6w0 f159739a;

    /* JADX INFO: renamed from: b */
    public final p6r0 f159740b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f159741c;

    /* JADX INFO: renamed from: d */
    public m7r0 f159742d;

    /* JADX INFO: renamed from: e */
    public String f159743e;

    /* JADX INFO: renamed from: f */
    public int f159744f;

    /* JADX INFO: renamed from: g */
    public int f159745g;

    /* JADX INFO: renamed from: h */
    public boolean f159746h;

    /* JADX INFO: renamed from: i */
    public boolean f159747i;

    /* JADX INFO: renamed from: j */
    public long f159748j;

    /* JADX INFO: renamed from: k */
    public int f159749k;

    /* JADX INFO: renamed from: l */
    public long f159750l;

    public rjr0(@Nullable String str) {
        this.f159744f = 0;
        v6w0 v6w0Var = new v6w0(4);
        this.f159739a = v6w0Var;
        v6w0Var.m197264m()[0] = -1;
        this.f159740b = new p6r0();
        this.f159750l = -9223372036854775807L;
        this.f159741c = str;
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: b */
    public final void mo121626b(v6w0 v6w0Var) {
        f5v0.m119531b(this.f159742d);
        while (v6w0Var.m197268q() > 0) {
            int i = this.f159744f;
            if (i == 0) {
                byte[] bArrM197264m = v6w0Var.m197264m();
                int iM197270s = v6w0Var.m197270s();
                int iM197271t = v6w0Var.m197271t();
                while (true) {
                    if (iM197270s >= iM197271t) {
                        v6w0Var.m197262k(iM197271t);
                        break;
                    }
                    int i2 = iM197270s + 1;
                    byte b = bArrM197264m[iM197270s];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.f159747i && (b & 224) == 224;
                    this.f159747i = z;
                    if (z2) {
                        v6w0Var.m197262k(i2);
                        this.f159747i = false;
                        this.f159739a.m197264m()[1] = bArrM197264m[iM197270s];
                        this.f159745g = 2;
                        this.f159744f = 1;
                        break;
                    }
                    iM197270s = i2;
                }
            } else if (i != 1) {
                int iMin = Math.min(v6w0Var.m197268q(), this.f159749k - this.f159745g);
                this.f159742d.mo134533f(v6w0Var, iMin);
                int i3 = this.f159745g + iMin;
                this.f159745g = i3;
                if (i3 >= this.f159749k) {
                    f5v0.m119535f(this.f159750l != -9223372036854775807L);
                    this.f159742d.mo134530c(this.f159750l, 1, this.f159749k, 0, null);
                    this.f159750l += this.f159748j;
                    this.f159745g = 0;
                    this.f159744f = 0;
                }
            } else {
                int iMin2 = Math.min(v6w0Var.m197268q(), 4 - this.f159745g);
                v6w0Var.m197258g(this.f159739a.m197264m(), this.f159745g, iMin2);
                int i4 = this.f159745g + iMin2;
                this.f159745g = i4;
                if (i4 >= 4) {
                    this.f159739a.m197262k(0);
                    if (this.f159740b.m167689a(this.f159739a.m197273v())) {
                        p6r0 p6r0Var = this.f159740b;
                        this.f159749k = p6r0Var.f147431c;
                        if (!this.f159746h) {
                            this.f159748j = (((long) p6r0Var.f147435g) * 1000000) / ((long) p6r0Var.f147432d);
                            ter0 ter0Var = new ter0();
                            ter0Var.m188604k(this.f159743e);
                            ter0Var.m188618w(this.f159740b.f147430b);
                            ter0Var.m188610o(4096);
                            ter0Var.m188605k0(this.f159740b.f147433e);
                            ter0Var.m188619x(this.f159740b.f147432d);
                            ter0Var.m188609n(this.f159741c);
                            this.f159742d.mo134531d(ter0Var.m188591D());
                            this.f159746h = true;
                        }
                        this.f159739a.m197262k(0);
                        this.f159742d.mo134533f(this.f159739a, 4);
                        this.f159744f = 2;
                    } else {
                        this.f159745g = 0;
                        this.f159744f = 1;
                    }
                }
            }
        }
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: c */
    public final void mo121627c(long j, int i) {
        this.f159750l = j;
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: d */
    public final void mo121628d(m5r0 m5r0Var, alr0 alr0Var) {
        alr0Var.m97444c();
        this.f159743e = alr0Var.m97443b();
        this.f159742d = m5r0Var.mo129454i(alr0Var.m97442a(), 1);
    }

    @Override // p149l.sir0
    public final void zze() {
        this.f159744f = 0;
        this.f159745g = 0;
        this.f159747i = false;
        this.f159750l = -9223372036854775807L;
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: a */
    public final void mo121625a(boolean z) {
    }

    public rjr0() {
        this(null);
    }
}
