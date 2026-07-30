package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class wrr0 implements yrr0 {

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f190547b;

    /* JADX INFO: renamed from: c */
    public String f190548c;

    /* JADX INFO: renamed from: d */
    public sgr0 f190549d;

    /* JADX INFO: renamed from: f */
    public int f190551f;

    /* JADX INFO: renamed from: g */
    public int f190552g;

    /* JADX INFO: renamed from: h */
    public long f190553h;

    /* JADX INFO: renamed from: i */
    public sqr0 f190554i;

    /* JADX INFO: renamed from: j */
    public int f190555j;

    /* JADX INFO: renamed from: a */
    public final bgw0 f190546a = new bgw0(new byte[18]);

    /* JADX INFO: renamed from: e */
    public int f190550e = 0;

    /* JADX INFO: renamed from: k */
    public long f190556k = -9223372036854775807L;

    public wrr0(@Nullable String str) {
        this.f190547b = str;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:34:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0108  */
    /* JADX WARN: Code duplicated, block: B:39:0x0114  */
    /* JADX WARN: Code duplicated, block: B:41:0x011d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0124  */
    @Override // p153l.yrr0
    /* JADX INFO: renamed from: b */
    public final void mo155729b(bgw0 bgw0Var) {
        int i;
        int i2;
        byte b;
        boolean z;
        int i3;
        int i4;
        byte b2;
        int i5;
        byte b3;
        int i6;
        lev0.m153954b(this.f190549d);
        while (bgw0Var.m104275q() > 0) {
            int i7 = this.f190550e;
            if (i7 == 0) {
                while (bgw0Var.m104275q() > 0) {
                    int i8 = this.f190552g << 8;
                    this.f190552g = i8;
                    int iM104245B = i8 | bgw0Var.m104245B();
                    this.f190552g = iM104245B;
                    int[] iArr = mer0.f136560a;
                    if (iM104245B == 2147385345 || iM104245B == -25230976 || iM104245B == 536864768 || iM104245B == -14745368) {
                        byte[] bArrM104271m = this.f190546a.m104271m();
                        int i9 = this.f190552g;
                        bArrM104271m[0] = (byte) ((i9 >> 24) & 255);
                        bArrM104271m[1] = (byte) ((i9 >> 16) & 255);
                        bArrM104271m[2] = (byte) ((i9 >> 8) & 255);
                        bArrM104271m[3] = (byte) (i9 & 255);
                        this.f190551f = 4;
                        this.f190552g = 0;
                        this.f190550e = 1;
                        break;
                    }
                }
            } else if (i7 != 1) {
                int iMin = Math.min(bgw0Var.m104275q(), this.f190555j - this.f190551f);
                this.f190549d.mo99375f(bgw0Var, iMin);
                int i10 = this.f190551f + iMin;
                this.f190551f = i10;
                if (i10 == this.f190555j) {
                    lev0.m153958f(this.f190556k != -9223372036854775807L);
                    this.f190549d.mo99372c(this.f190556k, 1, this.f190555j, 0, null);
                    this.f190556k += this.f190553h;
                    this.f190550e = 0;
                }
            } else {
                byte[] bArrM104271m2 = this.f190546a.m104271m();
                int iMin2 = Math.min(bgw0Var.m104275q(), 18 - this.f190551f);
                bgw0Var.m104265g(bArrM104271m2, this.f190551f, iMin2);
                int i11 = this.f190551f + iMin2;
                this.f190551f = i11;
                if (i11 == 18) {
                    byte[] bArrM104271m3 = this.f190546a.m104271m();
                    if (this.f190554i == null) {
                        sqr0 sqr0VarM158076a = mer0.m158076a(bArrM104271m3, this.f190548c, this.f190547b, null);
                        this.f190554i = sqr0VarM158076a;
                        this.f190549d.mo99373d(sqr0VarM158076a);
                    }
                    int[] iArr2 = mer0.f136560a;
                    byte b4 = bArrM104271m3[0];
                    if (b4 != -2) {
                        if (b4 == -1) {
                            i6 = ((bArrM104271m3[7] & 3) << 12) | ((bArrM104271m3[6] & 255) << 4) | ((bArrM104271m3[9] & 60) >> 2);
                        } else if (b4 != 31) {
                            i = (bArrM104271m3[5] & 3) << 12;
                            i2 = (bArrM104271m3[6] & 255) << 4;
                            b = bArrM104271m3[7];
                        } else {
                            i6 = ((bArrM104271m3[8] & 60) >> 2) | ((3 & bArrM104271m3[6]) << 12) | ((bArrM104271m3[7] & 255) << 4);
                        }
                        i3 = i6 + 1;
                        z = true;
                        if (z) {
                            i3 = (i3 * 16) / 14;
                        }
                        this.f190555j = i3;
                        if (b4 != -2) {
                            if (b4 != -1) {
                                i4 = (bArrM104271m3[4] & 7) << 4;
                                b3 = bArrM104271m3[7];
                            } else if (b4 != 31) {
                                i4 = (bArrM104271m3[4] & 1) << 6;
                                b2 = bArrM104271m3[r14];
                            } else {
                                i4 = (bArrM104271m3[r14] & 7) << 4;
                                b3 = bArrM104271m3[6];
                            }
                            i5 = b3 & 60;
                            this.f190553h = (int) ((((long) ((((i5 >> 2) | i4) + 1) * 32)) * 1000000) / ((long) this.f190554i.f170265z));
                            this.f190546a.m104269k(0);
                            this.f190549d.mo99375f(this.f190546a, 18);
                            this.f190550e = 2;
                        } else {
                            i4 = (bArrM104271m3[r14] & 1) << 6;
                            b2 = bArrM104271m3[4];
                        }
                        i5 = b2 & 252;
                        this.f190553h = (int) ((((long) ((((i5 >> 2) | i4) + 1) * 32)) * 1000000) / ((long) this.f190554i.f170265z));
                        this.f190546a.m104269k(0);
                        this.f190549d.mo99375f(this.f190546a, 18);
                        this.f190550e = 2;
                    } else {
                        i = (bArrM104271m3[4] & 3) << 12;
                        i2 = (bArrM104271m3[7] & 255) << 4;
                        b = bArrM104271m3[6];
                    }
                    i3 = (i | i2 | ((b & 240) >> 4)) + 1;
                    z = false;
                    if (z) {
                        i3 = (i3 * 16) / 14;
                    }
                    this.f190555j = i3;
                    if (b4 != -2) {
                        if (b4 != -1) {
                            i4 = (bArrM104271m3[4] & 7) << 4;
                            b3 = bArrM104271m3[7];
                        } else if (b4 != 31) {
                            i4 = (bArrM104271m3[4] & 1) << 6;
                            b2 = bArrM104271m3[r14];
                        } else {
                            i4 = (bArrM104271m3[r14] & 7) << 4;
                            b3 = bArrM104271m3[6];
                        }
                        i5 = b3 & 60;
                        this.f190553h = (int) ((((long) ((((i5 >> 2) | i4) + 1) * 32)) * 1000000) / ((long) this.f190554i.f170265z));
                        this.f190546a.m104269k(0);
                        this.f190549d.mo99375f(this.f190546a, 18);
                        this.f190550e = 2;
                    } else {
                        i4 = (bArrM104271m3[r14] & 1) << 6;
                        b2 = bArrM104271m3[4];
                    }
                    i5 = b2 & 252;
                    this.f190553h = (int) ((((long) ((((i5 >> 2) | i4) + 1) * 32)) * 1000000) / ((long) this.f190554i.f170265z));
                    this.f190546a.m104269k(0);
                    this.f190549d.mo99375f(this.f190546a, 18);
                    this.f190550e = 2;
                }
            }
        }
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: c */
    public final void mo155730c(long j, int i) {
        this.f190556k = j;
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: d */
    public final void mo155731d(ser0 ser0Var, gur0 gur0Var) {
        gur0Var.m132386c();
        this.f190548c = gur0Var.m132385b();
        this.f190549d = ser0Var.mo101550i(gur0Var.m132384a(), 1);
    }

    @Override // p153l.yrr0
    public final void zze() {
        this.f190550e = 0;
        this.f190551f = 0;
        this.f190552g = 0;
        this.f190556k = -9223372036854775807L;
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: a */
    public final void mo155728a(boolean z) {
    }
}
