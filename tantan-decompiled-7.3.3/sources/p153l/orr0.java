package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class orr0 implements yrr0 {

    /* JADX INFO: renamed from: a */
    public final dfw0 f148746a;

    /* JADX INFO: renamed from: b */
    public final bgw0 f148747b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f148748c;

    /* JADX INFO: renamed from: d */
    public String f148749d;

    /* JADX INFO: renamed from: e */
    public sgr0 f148750e;

    /* JADX INFO: renamed from: f */
    public int f148751f;

    /* JADX INFO: renamed from: g */
    public int f148752g;

    /* JADX INFO: renamed from: h */
    public boolean f148753h;

    /* JADX INFO: renamed from: i */
    public long f148754i;

    /* JADX INFO: renamed from: j */
    public sqr0 f148755j;

    /* JADX INFO: renamed from: k */
    public int f148756k;

    /* JADX INFO: renamed from: l */
    public long f148757l;

    public orr0(@Nullable String str) {
        dfw0 dfw0Var = new dfw0(new byte[128], 128);
        this.f148746a = dfw0Var;
        this.f148747b = new bgw0(dfw0Var.f88231a);
        this.f148751f = 0;
        this.f148757l = -9223372036854775807L;
        this.f148748c = str;
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: b */
    public final void mo155729b(bgw0 bgw0Var) {
        lev0.m153954b(this.f148750e);
        while (bgw0Var.m104275q() > 0) {
            int i = this.f148751f;
            if (i == 0) {
                while (bgw0Var.m104275q() > 0) {
                    if (this.f148753h) {
                        int iM104245B = bgw0Var.m104245B();
                        if (iM104245B == 119) {
                            this.f148753h = false;
                            this.f148751f = 1;
                            bgw0 bgw0Var2 = this.f148747b;
                            bgw0Var2.m104271m()[0] = 11;
                            bgw0Var2.m104271m()[1] = 119;
                            this.f148752g = 2;
                            break;
                        }
                        this.f148753h = iM104245B == 11;
                    } else {
                        this.f148753h = bgw0Var.m104245B() == 11;
                    }
                }
            } else if (i != 1) {
                int iMin = Math.min(bgw0Var.m104275q(), this.f148756k - this.f148752g);
                this.f148750e.mo99375f(bgw0Var, iMin);
                int i2 = this.f148752g + iMin;
                this.f148752g = i2;
                if (i2 == this.f148756k) {
                    lev0.m153958f(this.f148757l != -9223372036854775807L);
                    this.f148750e.mo99372c(this.f148757l, 1, this.f148756k, 0, null);
                    this.f148757l += this.f148754i;
                    this.f148751f = 0;
                }
            } else {
                byte[] bArrM104271m = this.f148747b.m104271m();
                int iMin2 = Math.min(bgw0Var.m104275q(), 128 - this.f148752g);
                bgw0Var.m104265g(bArrM104271m, this.f148752g, iMin2);
                int i3 = this.f148752g + iMin2;
                this.f148752g = i3;
                if (i3 == 128) {
                    this.f148746a.m115559k(0);
                    edr0 edr0VarM125133e = fdr0.m125133e(this.f148746a);
                    sqr0 sqr0Var = this.f148755j;
                    if (sqr0Var == null || edr0VarM125133e.f93574c != sqr0Var.f170264y || edr0VarM125133e.f93573b != sqr0Var.f170265z || !mpw0.m159408f(edr0VarM125133e.f93572a, sqr0Var.f170251l)) {
                        znr0 znr0Var = new znr0();
                        znr0Var.m220658k(this.f148749d);
                        znr0Var.m220672w(edr0VarM125133e.f93572a);
                        znr0Var.m220659k0(edr0VarM125133e.f93574c);
                        znr0Var.m220673x(edr0VarM125133e.f93573b);
                        znr0Var.m220663n(this.f148748c);
                        znr0Var.m220667r(edr0VarM125133e.f93577f);
                        if ("audio/ac3".equals(edr0VarM125133e.f93572a)) {
                            znr0Var.m220657j0(edr0VarM125133e.f93577f);
                        }
                        sqr0 sqr0VarM220645D = znr0Var.m220645D();
                        this.f148755j = sqr0VarM220645D;
                        this.f148750e.mo99373d(sqr0VarM220645D);
                    }
                    this.f148756k = edr0VarM125133e.f93575d;
                    this.f148754i = (((long) edr0VarM125133e.f93576e) * 1000000) / ((long) this.f148755j.f170265z);
                    this.f148747b.m104269k(0);
                    this.f148750e.mo99375f(this.f148747b, 128);
                    this.f148751f = 2;
                }
            }
        }
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: c */
    public final void mo155730c(long j, int i) {
        this.f148757l = j;
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: d */
    public final void mo155731d(ser0 ser0Var, gur0 gur0Var) {
        gur0Var.m132386c();
        this.f148749d = gur0Var.m132385b();
        this.f148750e = ser0Var.mo101550i(gur0Var.m132384a(), 1);
    }

    @Override // p153l.yrr0
    public final void zze() {
        this.f148751f = 0;
        this.f148752g = 0;
        this.f148753h = false;
        this.f148757l = -9223372036854775807L;
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: a */
    public final void mo155728a(boolean z) {
    }

    public orr0() {
        this(null);
    }
}
