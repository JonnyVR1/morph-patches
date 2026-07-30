package p149l;

import com.tencent.liteav.TXLiteAVCode;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class bmu0 {

    /* JADX INFO: renamed from: a */
    public final int f76329a;

    /* JADX INFO: renamed from: b */
    public final int f76330b;

    /* JADX INFO: renamed from: c */
    public final float f76331c;

    /* JADX INFO: renamed from: d */
    public final float f76332d;

    /* JADX INFO: renamed from: e */
    public final float f76333e;

    /* JADX INFO: renamed from: f */
    public final int f76334f;

    /* JADX INFO: renamed from: g */
    public final int f76335g;

    /* JADX INFO: renamed from: h */
    public final int f76336h;

    /* JADX INFO: renamed from: i */
    public final short[] f76337i;

    /* JADX INFO: renamed from: j */
    public short[] f76338j;

    /* JADX INFO: renamed from: k */
    public int f76339k;

    /* JADX INFO: renamed from: l */
    public short[] f76340l;

    /* JADX INFO: renamed from: m */
    public int f76341m;

    /* JADX INFO: renamed from: n */
    public short[] f76342n;

    /* JADX INFO: renamed from: o */
    public int f76343o;

    /* JADX INFO: renamed from: p */
    public int f76344p;

    /* JADX INFO: renamed from: q */
    public int f76345q;

    /* JADX INFO: renamed from: r */
    public int f76346r;

    /* JADX INFO: renamed from: s */
    public int f76347s;

    /* JADX INFO: renamed from: t */
    public int f76348t;

    /* JADX INFO: renamed from: u */
    public int f76349u;

    /* JADX INFO: renamed from: v */
    public int f76350v;

    public bmu0(int i, int i2, float f, float f2, int i3) {
        this.f76329a = i;
        this.f76330b = i2;
        this.f76331c = f;
        this.f76332d = f2;
        this.f76333e = i / i3;
        this.f76334f = i / 400;
        int i4 = i / 65;
        this.f76335g = i4;
        int i5 = i4 + i4;
        this.f76336h = i5;
        this.f76337i = new short[i5];
        int i6 = i5 * i2;
        this.f76338j = new short[i6];
        this.f76340l = new short[i6];
        this.f76342n = new short[i6];
    }

    /* JADX INFO: renamed from: j */
    public static void m102699j(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m102700a() {
        int i = this.f76341m * this.f76330b;
        return i + i;
    }

    /* JADX INFO: renamed from: b */
    public final int m102701b() {
        int i = this.f76339k * this.f76330b;
        return i + i;
    }

    /* JADX INFO: renamed from: c */
    public final void m102702c() {
        this.f76339k = 0;
        this.f76341m = 0;
        this.f76343o = 0;
        this.f76344p = 0;
        this.f76345q = 0;
        this.f76346r = 0;
        this.f76347s = 0;
        this.f76348t = 0;
        this.f76349u = 0;
        this.f76350v = 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m102703d(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f76330b, this.f76341m);
        shortBuffer.put(this.f76340l, 0, this.f76330b * iMin);
        int i = this.f76341m - iMin;
        this.f76341m = i;
        int i2 = this.f76330b;
        short[] sArr = this.f76340l;
        System.arraycopy(sArr, iMin * i2, sArr, 0, i * i2);
    }

    /* JADX INFO: renamed from: e */
    public final void m102704e() {
        int i;
        int i2 = this.f76339k;
        int i3 = this.f76341m;
        float f = this.f76343o;
        float f2 = this.f76331c;
        float f3 = this.f76333e;
        float f4 = this.f76332d;
        int i4 = i3 + ((int) ((((i2 / (f2 / f4)) + f) / (f3 * f4)) + 0.5f));
        int i5 = this.f76336h;
        this.f76338j = m102710l(this.f76338j, i2, i5 + i5 + i2);
        int i6 = 0;
        while (true) {
            int i7 = this.f76336h;
            int i8 = this.f76330b;
            i = i7 + i7;
            if (i6 >= i * i8) {
                break;
            }
            this.f76338j[(i8 * i2) + i6] = 0;
            i6++;
        }
        this.f76339k += i;
        m102709k();
        if (this.f76341m > i4) {
            this.f76341m = i4;
        }
        this.f76339k = 0;
        this.f76346r = 0;
        this.f76343o = 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m102705f(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.f76330b;
        int i2 = iRemaining / i;
        int i3 = i * i2;
        short[] sArrM102710l = m102710l(this.f76338j, this.f76339k, i2);
        this.f76338j = sArrM102710l;
        shortBuffer.get(sArrM102710l, this.f76339k * this.f76330b, (i3 + i3) / 2);
        this.f76339k += i2;
        m102709k();
    }

    /* JADX INFO: renamed from: g */
    public final int m102706g(short[] sArr, int i, int i2, int i3) {
        int i4 = 1;
        int i5 = 255;
        int i6 = 0;
        int i7 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                int i9 = this.f76330b * i;
                iAbs += Math.abs(sArr[i9 + i8] - sArr[(i9 + i2) + i8]);
            }
            int i10 = iAbs * i6;
            int i11 = i4 * i2;
            if (i10 < i11) {
                i4 = iAbs;
            }
            if (i10 < i11) {
                i6 = i2;
            }
            int i12 = iAbs * i5;
            int i13 = i7 * i2;
            if (i12 > i13) {
                i7 = iAbs;
            }
            if (i12 > i13) {
                i5 = i2;
            }
            i2++;
        }
        this.f76349u = i4 / i6;
        this.f76350v = i7 / i5;
        return i6;
    }

    /* JADX INFO: renamed from: h */
    public final void m102707h(short[] sArr, int i, int i2) {
        short[] sArrM102710l = m102710l(this.f76340l, this.f76341m, i2);
        this.f76340l = sArrM102710l;
        int i3 = this.f76341m;
        int i4 = this.f76330b;
        System.arraycopy(sArr, i * i4, sArrM102710l, i3 * i4, i2 * i4);
        this.f76341m += i2;
    }

    /* JADX INFO: renamed from: i */
    public final void m102708i(short[] sArr, int i, int i2) {
        int i3;
        for (int i4 = 0; i4 < this.f76336h / i2; i4++) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.f76330b;
                i3 = i7 * i2;
                if (i5 < i3) {
                    i6 += sArr[(i7 * i) + (i3 * i4) + i5];
                    i5++;
                }
            }
            this.f76337i[i4] = (short) (i6 / i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0156 A[EDGE_INSN: B:108:0x0156->B:65:0x0156 BREAK  A[LOOP:4: B:13:0x0038->B:99:0x022d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x022d A[LOOP:4: B:13:0x0038->B:99:0x022d, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final void m102709k() {
        int iM102706g;
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        int i7;
        float f2 = this.f76331c / this.f76332d;
        double d = f2;
        int i8 = this.f76341m;
        float f3 = 1.0f;
        int i9 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i10 = this.f76339k;
            if (i10 >= this.f76336h) {
                int i11 = 0;
                while (true) {
                    int i12 = this.f76346r;
                    if (i12 > 0) {
                        int iMin = Math.min(this.f76336h, i12);
                        m102707h(this.f76338j, i11, iMin);
                        this.f76346r -= iMin;
                        i11 += iMin;
                    } else {
                        short[] sArr = this.f76338j;
                        int i13 = this.f76329a;
                        int i14 = i13 > 4000 ? i13 / TXLiteAVCode.WARNING_START_CAPTURE_IGNORED : i9;
                        if (this.f76330b == i9 && i14 == i9) {
                            iM102706g = m102706g(sArr, i11, this.f76334f, this.f76335g);
                        } else {
                            m102708i(sArr, i11, i14);
                            int iM102706g2 = m102706g(this.f76337i, 0, this.f76334f / i14, this.f76335g / i14);
                            if (i14 != i9) {
                                int i15 = iM102706g2 * i14;
                                int i16 = i14 * 4;
                                int i17 = this.f76334f;
                                int i18 = i15 - i16;
                                if (i18 >= i17) {
                                    i17 = i18;
                                }
                                int i19 = i15 + i16;
                                int i20 = this.f76335g;
                                if (i19 > i20) {
                                    i19 = i20;
                                }
                                if (this.f76330b == i9) {
                                    iM102706g = m102706g(sArr, i11, i17, i19);
                                } else {
                                    m102708i(sArr, i11, i9);
                                    iM102706g = m102706g(this.f76337i, 0, i17, i19);
                                }
                            } else {
                                iM102706g = iM102706g2;
                            }
                        }
                        int i21 = this.f76349u;
                        int i22 = (i21 == 0 || (i3 = this.f76347s) == 0 || this.f76350v > i21 * 3 || i21 + i21 <= this.f76348t * 3) ? iM102706g : i3;
                        int i23 = i11 + i22;
                        this.f76348t = i21;
                        this.f76347s = iM102706g;
                        float f4 = i22;
                        short[] sArr2 = this.f76338j;
                        if (d > 1.0d) {
                            float f5 = (-1.0f) + f2;
                            if (f2 >= 2.0f) {
                                i2 = (int) (f4 / f5);
                            } else {
                                this.f76346r = (int) ((f4 * (2.0f - f2)) / f5);
                                i2 = i22;
                            }
                            short[] sArrM102710l = m102710l(this.f76340l, this.f76341m, i2);
                            this.f76340l = sArrM102710l;
                            m102699j(i2, this.f76330b, sArrM102710l, this.f76341m, sArr2, i11, sArr2, i23);
                            this.f76341m += i2;
                            i11 += i22 + i2;
                        } else {
                            int i24 = i22;
                            float f6 = f3 - f2;
                            if (f2 < 0.5f) {
                                i = (int) ((f4 * f2) / f6);
                            } else {
                                this.f76346r = (int) ((f4 * ((f2 + f2) - 1.0f)) / f6);
                                i = i24;
                            }
                            int i25 = i24 + i;
                            short[] sArrM102710l2 = m102710l(this.f76340l, this.f76341m, i25);
                            this.f76340l = sArrM102710l2;
                            int i26 = this.f76330b;
                            System.arraycopy(sArr2, i11 * i26, sArrM102710l2, this.f76341m * i26, i26 * i24);
                            int i27 = i11;
                            m102699j(i, this.f76330b, this.f76340l, this.f76341m + i24, sArr2, i23, sArr2, i27);
                            this.f76341m += i25;
                            i11 = i27 + i;
                        }
                        if (this.f76336h + i11 > i10) {
                            break;
                        }
                        f3 = f3;
                        i9 = i9;
                    }
                    if (this.f76336h + i11 > i10) {
                        break;
                        break;
                    } else {
                        f3 = f3;
                        i9 = i9;
                    }
                }
                int i28 = this.f76339k - i11;
                short[] sArr3 = this.f76338j;
                int i29 = this.f76330b;
                System.arraycopy(sArr3, i11 * i29, sArr3, 0, i29 * i28);
                this.f76339k = i28;
            }
            f = this.f76333e * this.f76332d;
            if (f != f3 || this.f76341m == i8) {
            }
            int i30 = this.f76329a;
            int i31 = (int) (i30 / f);
            while (true) {
                if (i31 <= 16384 && i30 <= 16384) {
                    break;
                }
                i31 /= 2;
                i30 /= 2;
            }
            int i32 = this.f76341m - i8;
            short[] sArrM102710l3 = m102710l(this.f76342n, this.f76343o, i32);
            this.f76342n = sArrM102710l3;
            short[] sArr4 = this.f76340l;
            int i33 = this.f76330b;
            System.arraycopy(sArr4, i8 * i33, sArrM102710l3, this.f76343o * i33, i33 * i32);
            this.f76341m = i8;
            this.f76343o += i32;
            int i34 = 0;
            while (true) {
                i4 = this.f76343o;
                i5 = i4 - 1;
                if (i34 >= i5) {
                    break;
                }
                while (true) {
                    i6 = this.f76344p + 1;
                    int i35 = i6 * i31;
                    i7 = this.f76345q;
                    if (i35 <= i7 * i30) {
                        break;
                    }
                    this.f76340l = m102710l(this.f76340l, this.f76341m, i9);
                    int i36 = 0;
                    while (true) {
                        int i37 = this.f76330b;
                        if (i36 < i37) {
                            short[] sArr5 = this.f76340l;
                            int i38 = this.f76341m * i37;
                            short[] sArr6 = this.f76342n;
                            int i39 = (i34 * i37) + i36;
                            short s = sArr6[i39];
                            short s2 = sArr6[i39 + i37];
                            int i40 = this.f76345q * i30;
                            int i41 = this.f76344p;
                            int i42 = i41 * i31;
                            int i43 = (i41 + 1) * i31;
                            int i44 = i43 - i40;
                            int i45 = i43 - i42;
                            sArr5[i38 + i36] = (short) (((s * i44) + ((i45 - i44) * s2)) / i45);
                            i36++;
                        }
                    }
                    i9 = 1;
                    this.f76345q++;
                    this.f76341m++;
                }
                this.f76344p = i6;
                if (i6 == i30) {
                    this.f76344p = 0;
                    f5v0.m119535f(i7 == i31 ? i9 : 0);
                    this.f76345q = 0;
                }
                i34++;
            }
            if (i5 != 0) {
                short[] sArr7 = this.f76342n;
                int i46 = this.f76330b;
                System.arraycopy(sArr7, i5 * i46, sArr7, 0, (i4 - i5) * i46);
                this.f76343o -= i5;
                return;
            }
            return;
        }
        m102707h(this.f76338j, 0, this.f76339k);
        this.f76339k = 0;
        f3 = 1.0f;
        i9 = 1;
        f = this.f76333e * this.f76332d;
        if (f != f3) {
        }
    }

    /* JADX INFO: renamed from: l */
    public final short[] m102710l(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f76330b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }
}
