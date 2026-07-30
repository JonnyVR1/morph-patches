package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class dkr0 implements blr0 {

    /* JADX INFO: renamed from: a */
    public final ckr0 f86696a;

    /* JADX INFO: renamed from: b */
    public final v6w0 f86697b = new v6w0(32);

    /* JADX INFO: renamed from: c */
    public int f86698c;

    /* JADX INFO: renamed from: d */
    public int f86699d;

    /* JADX INFO: renamed from: e */
    public boolean f86700e;

    /* JADX INFO: renamed from: f */
    public boolean f86701f;

    public dkr0(ckr0 ckr0Var) {
        this.f86696a = ckr0Var;
    }

    @Override // p149l.blr0
    /* JADX INFO: renamed from: a */
    public final void mo102558a(hew0 hew0Var, m5r0 m5r0Var, alr0 alr0Var) {
        this.f86696a.mo107427a(hew0Var, m5r0Var, alr0Var);
        this.f86701f = true;
    }

    @Override // p149l.blr0
    /* JADX INFO: renamed from: b */
    public final void mo102559b(v6w0 v6w0Var, int i) {
        int iM197270s;
        int i2 = i & 1;
        if (i2 != 0) {
            iM197270s = v6w0Var.m197270s() + v6w0Var.m197238B();
        } else {
            iM197270s = -1;
        }
        if (this.f86701f) {
            if (i2 == 0) {
                return;
            }
            this.f86701f = false;
            v6w0Var.m197262k(iM197270s);
            this.f86699d = 0;
        }
        while (v6w0Var.m197268q() > 0) {
            int i3 = this.f86699d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iM197238B = v6w0Var.m197238B();
                    v6w0Var.m197262k(v6w0Var.m197270s() - 1);
                    if (iM197238B == 255) {
                        this.f86701f = true;
                        return;
                    }
                }
                int iMin = Math.min(v6w0Var.m197268q(), 3 - this.f86699d);
                v6w0Var.m197258g(this.f86697b.m197264m(), this.f86699d, iMin);
                int i4 = this.f86699d + iMin;
                this.f86699d = i4;
                if (i4 == 3) {
                    this.f86697b.m197262k(0);
                    this.f86697b.m197261j(3);
                    this.f86697b.m197263l(1);
                    v6w0 v6w0Var2 = this.f86697b;
                    int iM197238B2 = v6w0Var2.m197238B();
                    boolean z = (iM197238B2 & 128) != 0;
                    int iM197238B3 = v6w0Var2.m197238B();
                    this.f86700e = z;
                    this.f86698c = (iM197238B3 | ((iM197238B2 & 15) << 8)) + 3;
                    int iM197269r = this.f86697b.m197269r();
                    int i5 = this.f86698c;
                    if (iM197269r < i5) {
                        int iM197269r2 = this.f86697b.m197269r();
                        this.f86697b.m197256e(Math.min(4098, Math.max(i5, iM197269r2 + iM197269r2)));
                    }
                }
            } else {
                int iMin2 = Math.min(v6w0Var.m197268q(), this.f86698c - i3);
                v6w0Var.m197258g(this.f86697b.m197264m(), this.f86699d, iMin2);
                int i6 = this.f86699d + iMin2;
                this.f86699d = i6;
                int i7 = this.f86698c;
                if (i6 == i7) {
                    boolean z2 = this.f86700e;
                    v6w0 v6w0Var3 = this.f86697b;
                    if (!z2) {
                        v6w0Var3.m197261j(i7);
                    } else {
                        if (ggw0.m126077s(v6w0Var3.m197264m(), 0, i7, -1) != 0) {
                            this.f86701f = true;
                            return;
                        }
                        this.f86697b.m197261j(this.f86698c - 4);
                    }
                    this.f86697b.m197262k(0);
                    this.f86696a.mo107428b(this.f86697b);
                    this.f86699d = 0;
                } else {
                    continue;
                }
            }
        }
    }

    @Override // p149l.blr0
    public final void zzc() {
        this.f86701f = true;
    }
}
