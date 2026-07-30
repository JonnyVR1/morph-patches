package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class xsr0 implements yrr0 {

    /* JADX INFO: renamed from: a */
    public final bgw0 f196122a;

    /* JADX INFO: renamed from: b */
    public final vfr0 f196123b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f196124c;

    /* JADX INFO: renamed from: d */
    public sgr0 f196125d;

    /* JADX INFO: renamed from: e */
    public String f196126e;

    /* JADX INFO: renamed from: f */
    public int f196127f;

    /* JADX INFO: renamed from: g */
    public int f196128g;

    /* JADX INFO: renamed from: h */
    public boolean f196129h;

    /* JADX INFO: renamed from: i */
    public boolean f196130i;

    /* JADX INFO: renamed from: j */
    public long f196131j;

    /* JADX INFO: renamed from: k */
    public int f196132k;

    /* JADX INFO: renamed from: l */
    public long f196133l;

    public xsr0(@Nullable String str) {
        this.f196127f = 0;
        bgw0 bgw0Var = new bgw0(4);
        this.f196122a = bgw0Var;
        bgw0Var.m104271m()[0] = -1;
        this.f196123b = new vfr0();
        this.f196133l = -9223372036854775807L;
        this.f196124c = str;
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: b */
    public final void mo155729b(bgw0 bgw0Var) {
        lev0.m153954b(this.f196125d);
        while (bgw0Var.m104275q() > 0) {
            int i = this.f196127f;
            if (i == 0) {
                byte[] bArrM104271m = bgw0Var.m104271m();
                int iM104277s = bgw0Var.m104277s();
                int iM104278t = bgw0Var.m104278t();
                while (true) {
                    if (iM104277s >= iM104278t) {
                        bgw0Var.m104269k(iM104278t);
                        break;
                    }
                    int i2 = iM104277s + 1;
                    byte b = bArrM104271m[iM104277s];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.f196130i && (b & 224) == 224;
                    this.f196130i = z;
                    if (z2) {
                        bgw0Var.m104269k(i2);
                        this.f196130i = false;
                        this.f196122a.m104271m()[1] = bArrM104271m[iM104277s];
                        this.f196128g = 2;
                        this.f196127f = 1;
                        break;
                    }
                    iM104277s = i2;
                }
            } else if (i != 1) {
                int iMin = Math.min(bgw0Var.m104275q(), this.f196132k - this.f196128g);
                this.f196125d.mo99375f(bgw0Var, iMin);
                int i3 = this.f196128g + iMin;
                this.f196128g = i3;
                if (i3 >= this.f196132k) {
                    lev0.m153958f(this.f196133l != -9223372036854775807L);
                    this.f196125d.mo99372c(this.f196133l, 1, this.f196132k, 0, null);
                    this.f196133l += this.f196131j;
                    this.f196128g = 0;
                    this.f196127f = 0;
                }
            } else {
                int iMin2 = Math.min(bgw0Var.m104275q(), 4 - this.f196128g);
                bgw0Var.m104265g(this.f196122a.m104271m(), this.f196128g, iMin2);
                int i4 = this.f196128g + iMin2;
                this.f196128g = i4;
                if (i4 >= 4) {
                    this.f196122a.m104269k(0);
                    if (this.f196123b.m201179a(this.f196122a.m104280v())) {
                        vfr0 vfr0Var = this.f196123b;
                        this.f196132k = vfr0Var.f183968c;
                        if (!this.f196129h) {
                            this.f196131j = (((long) vfr0Var.f183972g) * 1000000) / ((long) vfr0Var.f183969d);
                            znr0 znr0Var = new znr0();
                            znr0Var.m220658k(this.f196126e);
                            znr0Var.m220672w(this.f196123b.f183967b);
                            znr0Var.m220664o(4096);
                            znr0Var.m220659k0(this.f196123b.f183970e);
                            znr0Var.m220673x(this.f196123b.f183969d);
                            znr0Var.m220663n(this.f196124c);
                            this.f196125d.mo99373d(znr0Var.m220645D());
                            this.f196129h = true;
                        }
                        this.f196122a.m104269k(0);
                        this.f196125d.mo99375f(this.f196122a, 4);
                        this.f196127f = 2;
                    } else {
                        this.f196128g = 0;
                        this.f196127f = 1;
                    }
                }
            }
        }
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: c */
    public final void mo155730c(long j, int i) {
        this.f196133l = j;
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: d */
    public final void mo155731d(ser0 ser0Var, gur0 gur0Var) {
        gur0Var.m132386c();
        this.f196126e = gur0Var.m132385b();
        this.f196125d = ser0Var.mo101550i(gur0Var.m132384a(), 1);
    }

    @Override // p153l.yrr0
    public final void zze() {
        this.f196127f = 0;
        this.f196128g = 0;
        this.f196130i = false;
        this.f196133l = -9223372036854775807L;
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: a */
    public final void mo155728a(boolean z) {
    }

    public xsr0() {
        this(null);
    }
}
