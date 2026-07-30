package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class rrr0 implements yrr0 {

    /* JADX INFO: renamed from: a */
    public final dfw0 f164602a;

    /* JADX INFO: renamed from: b */
    public final bgw0 f164603b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f164604c;

    /* JADX INFO: renamed from: d */
    public String f164605d;

    /* JADX INFO: renamed from: e */
    public sgr0 f164606e;

    /* JADX INFO: renamed from: f */
    public int f164607f;

    /* JADX INFO: renamed from: g */
    public int f164608g;

    /* JADX INFO: renamed from: h */
    public boolean f164609h;

    /* JADX INFO: renamed from: i */
    public long f164610i;

    /* JADX INFO: renamed from: j */
    public sqr0 f164611j;

    /* JADX INFO: renamed from: k */
    public int f164612k;

    /* JADX INFO: renamed from: l */
    public long f164613l;

    public rrr0(@Nullable String str) {
        dfw0 dfw0Var = new dfw0(new byte[16], 16);
        this.f164602a = dfw0Var;
        this.f164603b = new bgw0(dfw0Var.f88231a);
        this.f164607f = 0;
        this.f164608g = 0;
        this.f164609h = false;
        this.f164613l = -9223372036854775807L;
        this.f164604c = str;
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: b */
    public final void mo155729b(bgw0 bgw0Var) {
        lev0.m153954b(this.f164606e);
        while (bgw0Var.m104275q() > 0) {
            int i = this.f164607f;
            if (i == 0) {
                while (true) {
                    if (bgw0Var.m104275q() > 0) {
                        if (this.f164609h) {
                            int iM104245B = bgw0Var.m104245B();
                            this.f164609h = iM104245B == 172;
                            if (iM104245B != 64) {
                                if (iM104245B == 65) {
                                    iM104245B = 65;
                                }
                            }
                            this.f164607f = 1;
                            bgw0 bgw0Var2 = this.f164603b;
                            bgw0Var2.m104271m()[0] = -84;
                            bgw0Var2.m104271m()[1] = iM104245B == 65 ? (byte) 65 : (byte) 64;
                            this.f164608g = 2;
                        } else {
                            this.f164609h = bgw0Var.m104245B() == 172;
                        }
                    }
                }
            } else if (i != 1) {
                int iMin = Math.min(bgw0Var.m104275q(), this.f164612k - this.f164608g);
                this.f164606e.mo99375f(bgw0Var, iMin);
                int i2 = this.f164608g + iMin;
                this.f164608g = i2;
                if (i2 == this.f164612k) {
                    lev0.m153958f(this.f164613l != -9223372036854775807L);
                    this.f164606e.mo99372c(this.f164613l, 1, this.f164612k, 0, null);
                    this.f164613l += this.f164610i;
                    this.f164607f = 0;
                }
            } else {
                byte[] bArrM104271m = this.f164603b.m104271m();
                int iMin2 = Math.min(bgw0Var.m104275q(), 16 - this.f164608g);
                bgw0Var.m104265g(bArrM104271m, this.f164608g, iMin2);
                int i3 = this.f164608g + iMin2;
                this.f164608g = i3;
                if (i3 == 16) {
                    this.f164602a.m115559k(0);
                    hdr0 hdr0VarM139541a = idr0.m139541a(this.f164602a);
                    sqr0 sqr0Var = this.f164611j;
                    if (sqr0Var == null || sqr0Var.f170264y != 2 || hdr0VarM139541a.f109035a != sqr0Var.f170265z || !"audio/ac4".equals(sqr0Var.f170251l)) {
                        znr0 znr0Var = new znr0();
                        znr0Var.m220658k(this.f164605d);
                        znr0Var.m220672w("audio/ac4");
                        znr0Var.m220659k0(2);
                        znr0Var.m220673x(hdr0VarM139541a.f109035a);
                        znr0Var.m220663n(this.f164604c);
                        sqr0 sqr0VarM220645D = znr0Var.m220645D();
                        this.f164611j = sqr0VarM220645D;
                        this.f164606e.mo99373d(sqr0VarM220645D);
                    }
                    this.f164612k = hdr0VarM139541a.f109036b;
                    this.f164610i = (((long) hdr0VarM139541a.f109037c) * 1000000) / ((long) this.f164611j.f170265z);
                    this.f164603b.m104269k(0);
                    this.f164606e.mo99375f(this.f164603b, 16);
                    this.f164607f = 2;
                }
            }
        }
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: c */
    public final void mo155730c(long j, int i) {
        this.f164613l = j;
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: d */
    public final void mo155731d(ser0 ser0Var, gur0 gur0Var) {
        gur0Var.m132386c();
        this.f164605d = gur0Var.m132385b();
        this.f164606e = ser0Var.mo101550i(gur0Var.m132384a(), 1);
    }

    @Override // p153l.yrr0
    public final void zze() {
        this.f164607f = 0;
        this.f164608g = 0;
        this.f164609h = false;
        this.f164613l = -9223372036854775807L;
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: a */
    public final void mo155728a(boolean z) {
    }

    public rrr0() {
        this(null);
    }
}
