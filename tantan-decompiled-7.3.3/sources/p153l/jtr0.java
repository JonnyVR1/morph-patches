package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class jtr0 implements hur0 {

    /* JADX INFO: renamed from: a */
    public final itr0 f122613a;

    /* JADX INFO: renamed from: b */
    public final bgw0 f122614b = new bgw0(32);

    /* JADX INFO: renamed from: c */
    public int f122615c;

    /* JADX INFO: renamed from: d */
    public int f122616d;

    /* JADX INFO: renamed from: e */
    public boolean f122617e;

    /* JADX INFO: renamed from: f */
    public boolean f122618f;

    public jtr0(itr0 itr0Var) {
        this.f122613a = itr0Var;
    }

    @Override // p153l.hur0
    /* JADX INFO: renamed from: a */
    public final void mo100239a(nnw0 nnw0Var, ser0 ser0Var, gur0 gur0Var) {
        this.f122613a.mo100403a(nnw0Var, ser0Var, gur0Var);
        this.f122618f = true;
    }

    @Override // p153l.hur0
    /* JADX INFO: renamed from: b */
    public final void mo100240b(bgw0 bgw0Var, int i) {
        int iM104277s;
        int i2 = i & 1;
        if (i2 != 0) {
            iM104277s = bgw0Var.m104277s() + bgw0Var.m104245B();
        } else {
            iM104277s = -1;
        }
        if (this.f122618f) {
            if (i2 == 0) {
                return;
            }
            this.f122618f = false;
            bgw0Var.m104269k(iM104277s);
            this.f122616d = 0;
        }
        while (bgw0Var.m104275q() > 0) {
            int i3 = this.f122616d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iM104245B = bgw0Var.m104245B();
                    bgw0Var.m104269k(bgw0Var.m104277s() - 1);
                    if (iM104245B == 255) {
                        this.f122618f = true;
                        return;
                    }
                }
                int iMin = Math.min(bgw0Var.m104275q(), 3 - this.f122616d);
                bgw0Var.m104265g(this.f122614b.m104271m(), this.f122616d, iMin);
                int i4 = this.f122616d + iMin;
                this.f122616d = i4;
                if (i4 == 3) {
                    this.f122614b.m104269k(0);
                    this.f122614b.m104268j(3);
                    this.f122614b.m104270l(1);
                    bgw0 bgw0Var2 = this.f122614b;
                    int iM104245B2 = bgw0Var2.m104245B();
                    boolean z = (iM104245B2 & 128) != 0;
                    int iM104245B3 = bgw0Var2.m104245B();
                    this.f122617e = z;
                    this.f122615c = (iM104245B3 | ((iM104245B2 & 15) << 8)) + 3;
                    int iM104276r = this.f122614b.m104276r();
                    int i5 = this.f122615c;
                    if (iM104276r < i5) {
                        int iM104276r2 = this.f122614b.m104276r();
                        this.f122614b.m104263e(Math.min(4098, Math.max(i5, iM104276r2 + iM104276r2)));
                    }
                }
            } else {
                int iMin2 = Math.min(bgw0Var.m104275q(), this.f122615c - i3);
                bgw0Var.m104265g(this.f122614b.m104271m(), this.f122616d, iMin2);
                int i6 = this.f122616d + iMin2;
                this.f122616d = i6;
                int i7 = this.f122615c;
                if (i6 == i7) {
                    boolean z2 = this.f122617e;
                    bgw0 bgw0Var3 = this.f122614b;
                    if (!z2) {
                        bgw0Var3.m104268j(i7);
                    } else {
                        if (mpw0.m159421s(bgw0Var3.m104271m(), 0, i7, -1) != 0) {
                            this.f122618f = true;
                            return;
                        }
                        this.f122614b.m104268j(this.f122615c - 4);
                    }
                    this.f122614b.m104269k(0);
                    this.f122613a.mo100404b(this.f122614b);
                    this.f122616d = 0;
                } else {
                    continue;
                }
            }
        }
    }

    @Override // p153l.hur0
    public final void zzc() {
        this.f122618f = true;
    }
}
