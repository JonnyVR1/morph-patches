package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcc;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class urr0 implements yrr0 {

    /* JADX INFO: renamed from: v */
    public static final byte[] f180678v = {73, 68, 51};

    /* JADX INFO: renamed from: a */
    public final boolean f180679a;

    /* JADX INFO: renamed from: b */
    public final dfw0 f180680b = new dfw0(new byte[7], 7);

    /* JADX INFO: renamed from: c */
    public final bgw0 f180681c = new bgw0(Arrays.copyOf(f180678v, 10));

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f180682d;

    /* JADX INFO: renamed from: e */
    public String f180683e;

    /* JADX INFO: renamed from: f */
    public sgr0 f180684f;

    /* JADX INFO: renamed from: g */
    public sgr0 f180685g;

    /* JADX INFO: renamed from: h */
    public int f180686h;

    /* JADX INFO: renamed from: i */
    public int f180687i;

    /* JADX INFO: renamed from: j */
    public int f180688j;

    /* JADX INFO: renamed from: k */
    public boolean f180689k;

    /* JADX INFO: renamed from: l */
    public boolean f180690l;

    /* JADX INFO: renamed from: m */
    public int f180691m;

    /* JADX INFO: renamed from: n */
    public int f180692n;

    /* JADX INFO: renamed from: o */
    public int f180693o;

    /* JADX INFO: renamed from: p */
    public boolean f180694p;

    /* JADX INFO: renamed from: q */
    public long f180695q;

    /* JADX INFO: renamed from: r */
    public int f180696r;

    /* JADX INFO: renamed from: s */
    public long f180697s;

    /* JADX INFO: renamed from: t */
    public sgr0 f180698t;

    /* JADX INFO: renamed from: u */
    public long f180699u;

    public urr0(boolean z, @Nullable String str) {
        m197661g();
        this.f180691m = -1;
        this.f180692n = -1;
        this.f180695q = -9223372036854775807L;
        this.f180697s = -9223372036854775807L;
        this.f180679a = z;
        this.f180682d = str;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m197657e(int i) {
        return (i & 65526) == 65520;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m197658k(byte b, byte b2) {
        return m197657e((b2 & 255) | 65280);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m197659l(bgw0 bgw0Var, byte[] bArr, int i) {
        if (bgw0Var.m104275q() < i) {
            return false;
        }
        bgw0Var.m104265g(bArr, 0, i);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x027f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0283  */
    /* JADX WARN: Code duplicated, block: B:111:0x0287  */
    /* JADX WARN: Code duplicated, block: B:113:0x028b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:62:0x01db  */
    /* JADX WARN: Code duplicated, block: B:73:0x020b  */
    /* JADX WARN: Code duplicated, block: B:75:0x021b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0226  */
    /* JADX WARN: Code duplicated, block: B:79:0x022a  */
    /* JADX WARN: Code duplicated, block: B:81:0x022e  */
    /* JADX WARN: Code duplicated, block: B:86:0x023d  */
    @Override // p153l.yrr0
    /* JADX INFO: renamed from: b */
    public final void mo155729b(bgw0 bgw0Var) throws zzcc {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        int iM115552d;
        byte[] bArrM104271m;
        int iM104278t;
        int i5;
        byte b;
        int i6;
        int i7;
        int i8;
        byte b2;
        this.f180684f.getClass();
        int i9 = mpw0.f137957a;
        while (bgw0Var.m104275q() > 0) {
            int i10 = this.f180686h;
            int i11 = 13;
            char c = 7;
            int i12 = 3;
            int i13 = 2;
            if (i10 == 0) {
                byte[] bArrM104271m2 = bgw0Var.m104271m();
                int iM104277s = bgw0Var.m104277s();
                int iM104278t2 = bgw0Var.m104278t();
                while (true) {
                    if (iM104277s < iM104278t2) {
                        int i14 = iM104277s + 1;
                        byte b3 = bArrM104271m2[iM104277s];
                        int i15 = b3 & 255;
                        int i16 = i12;
                        if (this.f180688j == 512 && m197658k((byte) -1, (byte) i15)) {
                            if (!this.f180690l) {
                                int i17 = iM104277s - 1;
                                bgw0Var.m104269k(iM104277s);
                                if (m197659l(bgw0Var, this.f180680b.f88231a, 1)) {
                                    this.f180680b.m115559k(4);
                                    int iM115552d2 = this.f180680b.m115552d(1);
                                    int i18 = this.f180691m;
                                    if (i18 != -1 && iM115552d2 != i18) {
                                        c = 7;
                                    } else if (this.f180692n == -1) {
                                        if (m197659l(bgw0Var, this.f180680b.f88231a, 4)) {
                                            this.f180680b.m115559k(14);
                                            iM115552d = this.f180680b.m115552d(i11);
                                            c = 7;
                                            if (iM115552d >= 7) {
                                                bArrM104271m = bgw0Var.m104271m();
                                                iM104278t = bgw0Var.m104278t();
                                                i5 = i17 + iM115552d;
                                                if (i5 >= iM104278t) {
                                                    b = bArrM104271m[i5];
                                                    if (b == -1) {
                                                        i8 = i5 + 1;
                                                        if (i8 != iM104278t) {
                                                            b2 = bArrM104271m[i8];
                                                            if (m197658k((byte) -1, b2) || ((b2 & 8) >> 3) != iM115552d2) {
                                                            }
                                                        }
                                                    } else if (b == 73 || ((i6 = i5 + 1) != iM104278t && (bArrM104271m[i6] != 68 || ((i7 = i5 + 2) != iM104278t && bArrM104271m[i7] != 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else if (m197659l(bgw0Var, this.f180680b.f88231a, 1)) {
                                        this.f180680b.m115559k(i13);
                                        if (this.f180680b.m115552d(4) == this.f180692n) {
                                            bgw0Var.m104269k(iM104277s + 1);
                                            if (m197659l(bgw0Var, this.f180680b.f88231a, 4)) {
                                                this.f180680b.m115559k(14);
                                                iM115552d = this.f180680b.m115552d(i11);
                                                c = 7;
                                                if (iM115552d >= 7) {
                                                    bArrM104271m = bgw0Var.m104271m();
                                                    iM104278t = bgw0Var.m104278t();
                                                    i5 = i17 + iM115552d;
                                                    if (i5 >= iM104278t) {
                                                        b = bArrM104271m[i5];
                                                        if (b == -1) {
                                                            i8 = i5 + 1;
                                                            if (i8 != iM104278t) {
                                                                b2 = bArrM104271m[i8];
                                                                if (m197658k((byte) -1, b2)) {
                                                                }
                                                            }
                                                        } else if (b == 73) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            c = 7;
                                        }
                                    }
                                } else {
                                    c = c;
                                }
                                i = this.f180688j;
                                i2 = i | i15;
                                if (i2 != 329) {
                                    i3 = 2;
                                    z = false;
                                    i4 = 768;
                                } else if (i2 != 511) {
                                    i3 = 2;
                                    z = false;
                                    i4 = 512;
                                } else if (i2 != 836) {
                                    i3 = 2;
                                    z = false;
                                    i4 = 1024;
                                } else if (i2 != 1075) {
                                    this.f180686h = 2;
                                    this.f180687i = i16;
                                    this.f180696r = 0;
                                    this.f180681c.m104269k(0);
                                    bgw0Var.m104269k(i14);
                                } else if (i != 256) {
                                    this.f180688j = 256;
                                    i12 = i16;
                                    i11 = 13;
                                    i13 = 2;
                                } else {
                                    i16 = i16;
                                    i3 = 2;
                                    z = false;
                                    iM104277s = i14;
                                    i12 = i16;
                                    i13 = i3;
                                    i11 = 13;
                                }
                                this.f180688j = i4;
                                iM104277s = i14;
                                i12 = i16;
                                i13 = i3;
                                i11 = 13;
                            }
                            this.f180693o = (b3 & 8) >> 3;
                            this.f180689k = 1 == ((b3 & 1) ^ 1);
                            if (this.f180690l) {
                                m197662h();
                            } else {
                                this.f180686h = 1;
                                this.f180687i = 0;
                            }
                            bgw0Var.m104269k(i14);
                        } else {
                            c = c;
                            i = this.f180688j;
                            i2 = i | i15;
                            if (i2 != 329) {
                                i3 = 2;
                                z = false;
                                i4 = 768;
                            } else if (i2 != 511) {
                                i3 = 2;
                                z = false;
                                i4 = 512;
                            } else if (i2 != 836) {
                                i3 = 2;
                                z = false;
                                i4 = 1024;
                            } else if (i2 != 1075) {
                                this.f180686h = 2;
                                this.f180687i = i16;
                                this.f180696r = 0;
                                this.f180681c.m104269k(0);
                                bgw0Var.m104269k(i14);
                            } else if (i != 256) {
                                this.f180688j = 256;
                                i12 = i16;
                                i11 = 13;
                                i13 = 2;
                            } else {
                                i16 = i16;
                                i3 = 2;
                                z = false;
                                iM104277s = i14;
                                i12 = i16;
                                i13 = i3;
                                i11 = 13;
                            }
                            this.f180688j = i4;
                            iM104277s = i14;
                            i12 = i16;
                            i13 = i3;
                            i11 = 13;
                        }
                    } else {
                        bgw0Var.m104269k(iM104277s);
                    }
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        int iMin = Math.min(bgw0Var.m104275q(), this.f180696r - this.f180687i);
                        this.f180698t.mo99375f(bgw0Var, iMin);
                        int i19 = this.f180687i + iMin;
                        this.f180687i = i19;
                        if (i19 == this.f180696r) {
                            lev0.m153958f(this.f180697s != -9223372036854775807L);
                            this.f180698t.mo99372c(this.f180697s, 1, this.f180696r, 0, null);
                            this.f180697s += this.f180699u;
                            m197661g();
                        }
                    } else {
                        if (m197664j(bgw0Var, this.f180680b.f88231a, true != this.f180689k ? 5 : 7)) {
                            this.f180680b.m115559k(0);
                            boolean z2 = this.f180694p;
                            dfw0 dfw0Var = this.f180680b;
                            if (z2) {
                                dfw0Var.m115561m(10);
                            } else {
                                int iM115552d3 = dfw0Var.m115552d(2) + 1;
                                if (iM115552d3 != 2) {
                                    y4w0.m214278f("AdtsReader", "Detected audio object type: " + iM115552d3 + ", but assuming AAC LC.");
                                }
                                this.f180680b.m115561m(5);
                                int iM115552d4 = this.f180680b.m115552d(3);
                                int i20 = this.f180692n;
                                byte[] bArr = {(byte) (((i20 >> 1) & 7) | 16), (byte) (((iM115552d4 << 3) & 120) | ((i20 << 7) & 128))};
                                bdr0 bdr0VarM109234a = cdr0.m109234a(bArr);
                                znr0 znr0Var = new znr0();
                                znr0Var.m220658k(this.f180683e);
                                znr0Var.m220672w("audio/mp4a-latm");
                                znr0Var.m220661l0(bdr0VarM109234a.f76293c);
                                znr0Var.m220659k0(bdr0VarM109234a.f76292b);
                                znr0Var.m220673x(bdr0VarM109234a.f76291a);
                                znr0Var.m220660l(Collections.singletonList(bArr));
                                znr0Var.m220663n(this.f180682d);
                                sqr0 sqr0VarM220645D = znr0Var.m220645D();
                                this.f180695q = 1024000000 / ((long) sqr0VarM220645D.f170265z);
                                this.f180684f.mo99373d(sqr0VarM220645D);
                                this.f180694p = true;
                            }
                            this.f180680b.m115561m(4);
                            int iM115552d5 = this.f180680b.m115552d(13);
                            int i21 = iM115552d5 - 7;
                            if (this.f180689k) {
                                i21 = iM115552d5 - 9;
                            }
                            m197663i(this.f180684f, this.f180695q, 0, i21);
                        }
                    }
                } else if (m197664j(bgw0Var, this.f180681c.m104271m(), 10)) {
                    this.f180685g.mo99375f(this.f180681c, 10);
                    this.f180681c.m104269k(6);
                    m197663i(this.f180685g, 0L, 10, this.f180681c.m104244A() + 10);
                }
            } else if (bgw0Var.m104275q() != 0) {
                dfw0 dfw0Var2 = this.f180680b;
                dfw0Var2.f88231a[0] = bgw0Var.m104271m()[bgw0Var.m104277s()];
                dfw0Var2.m115559k(2);
                int iM115552d6 = this.f180680b.m115552d(4);
                int i22 = this.f180692n;
                if (i22 == -1 || iM115552d6 == i22) {
                    if (!this.f180690l) {
                        this.f180690l = true;
                        this.f180691m = this.f180693o;
                        this.f180692n = iM115552d6;
                    }
                    m197662h();
                } else {
                    m197660f();
                }
            }
        }
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: c */
    public final void mo155730c(long j, int i) {
        this.f180697s = j;
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: d */
    public final void mo155731d(ser0 ser0Var, gur0 gur0Var) {
        gur0Var.m132386c();
        this.f180683e = gur0Var.m132385b();
        sgr0 sgr0VarMo101550i = ser0Var.mo101550i(gur0Var.m132384a(), 1);
        this.f180684f = sgr0VarMo101550i;
        this.f180698t = sgr0VarMo101550i;
        if (!this.f180679a) {
            this.f180685g = new oer0();
            return;
        }
        gur0Var.m132386c();
        sgr0 sgr0VarMo101550i2 = ser0Var.mo101550i(gur0Var.m132384a(), 5);
        this.f180685g = sgr0VarMo101550i2;
        znr0 znr0Var = new znr0();
        znr0Var.m220658k(gur0Var.m132385b());
        znr0Var.m220672w("application/id3");
        sgr0VarMo101550i2.mo99373d(znr0Var.m220645D());
    }

    /* JADX INFO: renamed from: f */
    public final void m197660f() {
        this.f180690l = false;
        m197661g();
    }

    /* JADX INFO: renamed from: g */
    public final void m197661g() {
        this.f180686h = 0;
        this.f180687i = 0;
        this.f180688j = 256;
    }

    /* JADX INFO: renamed from: h */
    public final void m197662h() {
        this.f180686h = 3;
        this.f180687i = 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m197663i(sgr0 sgr0Var, long j, int i, int i2) {
        this.f180686h = 4;
        this.f180687i = i;
        this.f180698t = sgr0Var;
        this.f180699u = j;
        this.f180696r = i2;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m197664j(bgw0 bgw0Var, byte[] bArr, int i) {
        int iMin = Math.min(bgw0Var.m104275q(), i - this.f180687i);
        bgw0Var.m104265g(bArr, this.f180687i, iMin);
        int i2 = this.f180687i + iMin;
        this.f180687i = i2;
        return i2 == i;
    }

    @Override // p153l.yrr0
    public final void zze() {
        this.f180697s = -9223372036854775807L;
        m197660f();
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: a */
    public final void mo155728a(boolean z) {
    }
}
