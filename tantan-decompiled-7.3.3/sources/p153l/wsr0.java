package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcc;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class wsr0 implements yrr0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f190669a;

    /* JADX INFO: renamed from: b */
    public final bgw0 f190670b;

    /* JADX INFO: renamed from: c */
    public final dfw0 f190671c;

    /* JADX INFO: renamed from: d */
    public sgr0 f190672d;

    /* JADX INFO: renamed from: e */
    public String f190673e;

    /* JADX INFO: renamed from: f */
    public sqr0 f190674f;

    /* JADX INFO: renamed from: g */
    public int f190675g;

    /* JADX INFO: renamed from: h */
    public int f190676h;

    /* JADX INFO: renamed from: i */
    public int f190677i;

    /* JADX INFO: renamed from: j */
    public int f190678j;

    /* JADX INFO: renamed from: k */
    public long f190679k;

    /* JADX INFO: renamed from: l */
    public boolean f190680l;

    /* JADX INFO: renamed from: m */
    public int f190681m;

    /* JADX INFO: renamed from: n */
    public int f190682n;

    /* JADX INFO: renamed from: o */
    public int f190683o;

    /* JADX INFO: renamed from: p */
    public boolean f190684p;

    /* JADX INFO: renamed from: q */
    public long f190685q;

    /* JADX INFO: renamed from: r */
    public int f190686r;

    /* JADX INFO: renamed from: s */
    public long f190687s;

    /* JADX INFO: renamed from: t */
    public int f190688t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public String f190689u;

    public wsr0(@Nullable String str) {
        this.f190669a = str;
        bgw0 bgw0Var = new bgw0(1024);
        this.f190670b = bgw0Var;
        byte[] bArrM104271m = bgw0Var.m104271m();
        this.f190671c = new dfw0(bArrM104271m, bArrM104271m.length);
        this.f190679k = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: f */
    public static long m207788f(dfw0 dfw0Var) {
        return dfw0Var.m115552d((dfw0Var.m115552d(2) + 1) * 8);
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: b */
    public final void mo155729b(bgw0 bgw0Var) throws zzcc {
        int i;
        int i2;
        int iM115552d;
        boolean zM115563o;
        lev0.m153954b(this.f190672d);
        while (bgw0Var.m104275q() > 0) {
            int i3 = this.f190675g;
            if (i3 != 0) {
                if (i3 == 1) {
                    int iM104245B = bgw0Var.m104245B();
                    if ((iM104245B & 224) == 224) {
                        this.f190678j = iM104245B;
                        this.f190675g = 2;
                    } else if (iM104245B != 86) {
                        this.f190675g = 0;
                    }
                } else if (i3 != 2) {
                    int iMin = Math.min(bgw0Var.m104275q(), this.f190677i - this.f190676h);
                    bgw0Var.m104265g(this.f190671c.f88231a, this.f190676h, iMin);
                    int i4 = this.f190676h + iMin;
                    this.f190676h = i4;
                    if (i4 == this.f190677i) {
                        this.f190671c.m115559k(0);
                        dfw0 dfw0Var = this.f190671c;
                        if (dfw0Var.m115563o()) {
                            if (this.f190680l) {
                            }
                            this.f190675g = 0;
                        } else {
                            this.f190680l = true;
                            int iM115552d2 = dfw0Var.m115552d(1);
                            if (iM115552d2 == 1) {
                                iM115552d = dfw0Var.m115552d(1);
                                i2 = 1;
                            } else {
                                i2 = iM115552d2;
                                iM115552d = 0;
                            }
                            this.f190681m = iM115552d;
                            if (iM115552d != 0) {
                                throw zzcc.zza(null, null);
                            }
                            if (i2 == 1) {
                                m207788f(dfw0Var);
                                i2 = 1;
                            }
                            if (!dfw0Var.m115563o()) {
                                throw zzcc.zza(null, null);
                            }
                            this.f190682n = dfw0Var.m115552d(6);
                            int iM115552d3 = dfw0Var.m115552d(4);
                            int iM115552d4 = dfw0Var.m115552d(3);
                            if (iM115552d3 != 0 || iM115552d4 != 0) {
                                throw zzcc.zza(null, null);
                            }
                            if (i2 == 0) {
                                int iM115551c = dfw0Var.m115551c();
                                int iM207789e = m207789e(dfw0Var);
                                dfw0Var.m115559k(iM115551c);
                                byte[] bArr = new byte[(iM207789e + 7) / 8];
                                dfw0Var.m115555g(bArr, 0, iM207789e);
                                znr0 znr0Var = new znr0();
                                znr0Var.m220658k(this.f190673e);
                                znr0Var.m220672w("audio/mp4a-latm");
                                znr0Var.m220661l0(this.f190689u);
                                znr0Var.m220659k0(this.f190688t);
                                znr0Var.m220673x(this.f190686r);
                                znr0Var.m220660l(Collections.singletonList(bArr));
                                znr0Var.m220663n(this.f190669a);
                                sqr0 sqr0VarM220645D = znr0Var.m220645D();
                                if (!sqr0VarM220645D.equals(this.f190674f)) {
                                    this.f190674f = sqr0VarM220645D;
                                    this.f190687s = 1024000000 / ((long) sqr0VarM220645D.f170265z);
                                    this.f190672d.mo99373d(sqr0VarM220645D);
                                }
                            } else {
                                dfw0Var.m115561m(((int) m207788f(dfw0Var)) - m207789e(dfw0Var));
                            }
                            int iM115552d5 = dfw0Var.m115552d(3);
                            this.f190683o = iM115552d5;
                            if (iM115552d5 == 0) {
                                dfw0Var.m115561m(8);
                            } else if (iM115552d5 == 1) {
                                dfw0Var.m115561m(9);
                            } else if (iM115552d5 == 3 || iM115552d5 == 4 || iM115552d5 == 5) {
                                dfw0Var.m115561m(6);
                            } else {
                                if (iM115552d5 != 6 && iM115552d5 != 7) {
                                    wpg0.m207458a();
                                    return;
                                }
                                dfw0Var.m115561m(1);
                            }
                            boolean zM115563o2 = dfw0Var.m115563o();
                            this.f190684p = zM115563o2;
                            this.f190685q = 0L;
                            if (zM115563o2) {
                                if (i2 != 1) {
                                    do {
                                        zM115563o = dfw0Var.m115563o();
                                        this.f190685q = (this.f190685q << 8) + ((long) dfw0Var.m115552d(8));
                                    } while (zM115563o);
                                } else {
                                    this.f190685q = m207788f(dfw0Var);
                                }
                            }
                            if (dfw0Var.m115563o()) {
                                dfw0Var.m115561m(8);
                            }
                        }
                        if (this.f190681m != 0) {
                            throw zzcc.zza(null, null);
                        }
                        if (this.f190682n != 0) {
                            throw zzcc.zza(null, null);
                        }
                        if (this.f190683o != 0) {
                            throw zzcc.zza(null, null);
                        }
                        int i5 = 0;
                        while (true) {
                            int iM115552d6 = dfw0Var.m115552d(8);
                            i = i5 + iM115552d6;
                            if (iM115552d6 != 255) {
                                break;
                            } else {
                                i5 = i;
                            }
                        }
                        int iM115551c2 = dfw0Var.m115551c();
                        int i6 = iM115551c2 & 7;
                        bgw0 bgw0Var2 = this.f190670b;
                        if (i6 == 0) {
                            bgw0Var2.m104269k(iM115551c2 >> 3);
                        } else {
                            dfw0Var.m115555g(bgw0Var2.m104271m(), 0, i * 8);
                            this.f190670b.m104269k(0);
                        }
                        this.f190672d.mo99375f(this.f190670b, i);
                        lev0.m153958f(this.f190679k != -9223372036854775807L);
                        this.f190672d.mo99372c(this.f190679k, 1, i, 0, null);
                        this.f190679k += this.f190687s;
                        if (this.f190684p) {
                            dfw0Var.m115561m((int) this.f190685q);
                        }
                        this.f190675g = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iM104245B2 = ((this.f190678j & (-225)) << 8) | bgw0Var.m104245B();
                    this.f190677i = iM104245B2;
                    bgw0 bgw0Var3 = this.f190670b;
                    if (iM104245B2 > bgw0Var3.m104271m().length) {
                        bgw0Var3.m104266h(iM104245B2);
                        dfw0 dfw0Var2 = this.f190671c;
                        byte[] bArrM104271m = this.f190670b.m104271m();
                        dfw0Var2.m115558j(bArrM104271m, bArrM104271m.length);
                    }
                    this.f190676h = 0;
                    this.f190675g = 3;
                }
            } else if (bgw0Var.m104245B() == 86) {
                this.f190675g = 1;
            }
        }
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: c */
    public final void mo155730c(long j, int i) {
        this.f190679k = j;
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: d */
    public final void mo155731d(ser0 ser0Var, gur0 gur0Var) {
        gur0Var.m132386c();
        this.f190672d = ser0Var.mo101550i(gur0Var.m132384a(), 1);
        this.f190673e = gur0Var.m132385b();
    }

    /* JADX INFO: renamed from: e */
    public final int m207789e(dfw0 dfw0Var) throws zzcc {
        int iM115549a = dfw0Var.m115549a();
        bdr0 bdr0VarM109235b = cdr0.m109235b(dfw0Var, true);
        this.f190689u = bdr0VarM109235b.f76293c;
        this.f190686r = bdr0VarM109235b.f76291a;
        this.f190688t = bdr0VarM109235b.f76292b;
        return iM115549a - dfw0Var.m115549a();
    }

    @Override // p153l.yrr0
    public final void zze() {
        this.f190675g = 0;
        this.f190679k = -9223372036854775807L;
        this.f190680l = false;
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: a */
    public final void mo155728a(boolean z) {
    }
}
