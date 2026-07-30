package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class qir0 implements sir0 {

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f154799b;

    /* JADX INFO: renamed from: c */
    public String f154800c;

    /* JADX INFO: renamed from: d */
    public m7r0 f154801d;

    /* JADX INFO: renamed from: f */
    public int f154803f;

    /* JADX INFO: renamed from: g */
    public int f154804g;

    /* JADX INFO: renamed from: h */
    public long f154805h;

    /* JADX INFO: renamed from: i */
    public mhr0 f154806i;

    /* JADX INFO: renamed from: j */
    public int f154807j;

    /* JADX INFO: renamed from: a */
    public final v6w0 f154798a = new v6w0(new byte[18]);

    /* JADX INFO: renamed from: e */
    public int f154802e = 0;

    /* JADX INFO: renamed from: k */
    public long f154808k = -9223372036854775807L;

    public qir0(@Nullable String str) {
        this.f154799b = str;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:34:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0108  */
    /* JADX WARN: Code duplicated, block: B:39:0x0114  */
    /* JADX WARN: Code duplicated, block: B:41:0x011d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0124  */
    @Override // p149l.sir0
    /* JADX INFO: renamed from: b */
    public final void mo121626b(v6w0 v6w0Var) {
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
        f5v0.m119531b(this.f154801d);
        while (v6w0Var.m197268q() > 0) {
            int i7 = this.f154802e;
            if (i7 == 0) {
                while (v6w0Var.m197268q() > 0) {
                    int i8 = this.f154804g << 8;
                    this.f154804g = i8;
                    int iM197238B = i8 | v6w0Var.m197238B();
                    this.f154804g = iM197238B;
                    int[] iArr = g5r0.f101187a;
                    if (iM197238B == 2147385345 || iM197238B == -25230976 || iM197238B == 536864768 || iM197238B == -14745368) {
                        byte[] bArrM197264m = this.f154798a.m197264m();
                        int i9 = this.f154804g;
                        bArrM197264m[0] = (byte) ((i9 >> 24) & 255);
                        bArrM197264m[1] = (byte) ((i9 >> 16) & 255);
                        bArrM197264m[2] = (byte) ((i9 >> 8) & 255);
                        bArrM197264m[3] = (byte) (i9 & 255);
                        this.f154803f = 4;
                        this.f154804g = 0;
                        this.f154802e = 1;
                        break;
                    }
                }
            } else if (i7 != 1) {
                int iMin = Math.min(v6w0Var.m197268q(), this.f154807j - this.f154803f);
                this.f154801d.mo134533f(v6w0Var, iMin);
                int i10 = this.f154803f + iMin;
                this.f154803f = i10;
                if (i10 == this.f154807j) {
                    f5v0.m119535f(this.f154808k != -9223372036854775807L);
                    this.f154801d.mo134530c(this.f154808k, 1, this.f154807j, 0, null);
                    this.f154808k += this.f154805h;
                    this.f154802e = 0;
                }
            } else {
                byte[] bArrM197264m2 = this.f154798a.m197264m();
                int iMin2 = Math.min(v6w0Var.m197268q(), 18 - this.f154803f);
                v6w0Var.m197258g(bArrM197264m2, this.f154803f, iMin2);
                int i11 = this.f154803f + iMin2;
                this.f154803f = i11;
                if (i11 == 18) {
                    byte[] bArrM197264m3 = this.f154798a.m197264m();
                    if (this.f154806i == null) {
                        mhr0 mhr0VarM124533a = g5r0.m124533a(bArrM197264m3, this.f154800c, this.f154799b, null);
                        this.f154806i = mhr0VarM124533a;
                        this.f154801d.mo134531d(mhr0VarM124533a);
                    }
                    int[] iArr2 = g5r0.f101187a;
                    byte b4 = bArrM197264m3[0];
                    if (b4 != -2) {
                        if (b4 == -1) {
                            i6 = ((bArrM197264m3[7] & 3) << 12) | ((bArrM197264m3[6] & 255) << 4) | ((bArrM197264m3[9] & 60) >> 2);
                        } else if (b4 != 31) {
                            i = (bArrM197264m3[5] & 3) << 12;
                            i2 = (bArrM197264m3[6] & 255) << 4;
                            b = bArrM197264m3[7];
                        } else {
                            i6 = ((bArrM197264m3[8] & 60) >> 2) | ((3 & bArrM197264m3[6]) << 12) | ((bArrM197264m3[7] & 255) << 4);
                        }
                        i3 = i6 + 1;
                        z = true;
                        if (z) {
                            i3 = (i3 * 16) / 14;
                        }
                        this.f154807j = i3;
                        if (b4 != -2) {
                            if (b4 != -1) {
                                i4 = (bArrM197264m3[4] & 7) << 4;
                                b3 = bArrM197264m3[7];
                            } else if (b4 != 31) {
                                i4 = (bArrM197264m3[4] & 1) << 6;
                                b2 = bArrM197264m3[r14];
                            } else {
                                i4 = (bArrM197264m3[r14] & 7) << 4;
                                b3 = bArrM197264m3[6];
                            }
                            i5 = b3 & 60;
                            this.f154805h = (int) ((((long) ((((i5 >> 2) | i4) + 1) * 32)) * 1000000) / ((long) this.f154806i.f133906z));
                            this.f154798a.m197262k(0);
                            this.f154801d.mo134533f(this.f154798a, 18);
                            this.f154802e = 2;
                        } else {
                            i4 = (bArrM197264m3[r14] & 1) << 6;
                            b2 = bArrM197264m3[4];
                        }
                        i5 = b2 & 252;
                        this.f154805h = (int) ((((long) ((((i5 >> 2) | i4) + 1) * 32)) * 1000000) / ((long) this.f154806i.f133906z));
                        this.f154798a.m197262k(0);
                        this.f154801d.mo134533f(this.f154798a, 18);
                        this.f154802e = 2;
                    } else {
                        i = (bArrM197264m3[4] & 3) << 12;
                        i2 = (bArrM197264m3[7] & 255) << 4;
                        b = bArrM197264m3[6];
                    }
                    i3 = (i | i2 | ((b & 240) >> 4)) + 1;
                    z = false;
                    if (z) {
                        i3 = (i3 * 16) / 14;
                    }
                    this.f154807j = i3;
                    if (b4 != -2) {
                        if (b4 != -1) {
                            i4 = (bArrM197264m3[4] & 7) << 4;
                            b3 = bArrM197264m3[7];
                        } else if (b4 != 31) {
                            i4 = (bArrM197264m3[4] & 1) << 6;
                            b2 = bArrM197264m3[r14];
                        } else {
                            i4 = (bArrM197264m3[r14] & 7) << 4;
                            b3 = bArrM197264m3[6];
                        }
                        i5 = b3 & 60;
                        this.f154805h = (int) ((((long) ((((i5 >> 2) | i4) + 1) * 32)) * 1000000) / ((long) this.f154806i.f133906z));
                        this.f154798a.m197262k(0);
                        this.f154801d.mo134533f(this.f154798a, 18);
                        this.f154802e = 2;
                    } else {
                        i4 = (bArrM197264m3[r14] & 1) << 6;
                        b2 = bArrM197264m3[4];
                    }
                    i5 = b2 & 252;
                    this.f154805h = (int) ((((long) ((((i5 >> 2) | i4) + 1) * 32)) * 1000000) / ((long) this.f154806i.f133906z));
                    this.f154798a.m197262k(0);
                    this.f154801d.mo134533f(this.f154798a, 18);
                    this.f154802e = 2;
                }
            }
        }
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: c */
    public final void mo121627c(long j, int i) {
        this.f154808k = j;
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: d */
    public final void mo121628d(m5r0 m5r0Var, alr0 alr0Var) {
        alr0Var.m97444c();
        this.f154800c = alr0Var.m97443b();
        this.f154801d = m5r0Var.mo129454i(alr0Var.m97442a(), 1);
    }

    @Override // p149l.sir0
    public final void zze() {
        this.f154802e = 0;
        this.f154803f = 0;
        this.f154804g = 0;
        this.f154808k = -9223372036854775807L;
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: a */
    public final void mo121625a(boolean z) {
    }
}
