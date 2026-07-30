package p153l;

import com.tencent.liteav.TXLiteAVCode;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class hvu0 {

    /* JADX INFO: renamed from: a */
    public final int f111819a;

    /* JADX INFO: renamed from: b */
    public final int f111820b;

    /* JADX INFO: renamed from: c */
    public final float f111821c;

    /* JADX INFO: renamed from: d */
    public final float f111822d;

    /* JADX INFO: renamed from: e */
    public final float f111823e;

    /* JADX INFO: renamed from: f */
    public final int f111824f;

    /* JADX INFO: renamed from: g */
    public final int f111825g;

    /* JADX INFO: renamed from: h */
    public final int f111826h;

    /* JADX INFO: renamed from: i */
    public final short[] f111827i;

    /* JADX INFO: renamed from: j */
    public short[] f111828j;

    /* JADX INFO: renamed from: k */
    public int f111829k;

    /* JADX INFO: renamed from: l */
    public short[] f111830l;

    /* JADX INFO: renamed from: m */
    public int f111831m;

    /* JADX INFO: renamed from: n */
    public short[] f111832n;

    /* JADX INFO: renamed from: o */
    public int f111833o;

    /* JADX INFO: renamed from: p */
    public int f111834p;

    /* JADX INFO: renamed from: q */
    public int f111835q;

    /* JADX INFO: renamed from: r */
    public int f111836r;

    /* JADX INFO: renamed from: s */
    public int f111837s;

    /* JADX INFO: renamed from: t */
    public int f111838t;

    /* JADX INFO: renamed from: u */
    public int f111839u;

    /* JADX INFO: renamed from: v */
    public int f111840v;

    public hvu0(int i, int i2, float f, float f2, int i3) {
        this.f111819a = i;
        this.f111820b = i2;
        this.f111821c = f;
        this.f111822d = f2;
        this.f111823e = i / i3;
        this.f111824f = i / 400;
        int i4 = i / 65;
        this.f111825g = i4;
        int i5 = i4 + i4;
        this.f111826h = i5;
        this.f111827i = new short[i5];
        int i6 = i5 * i2;
        this.f111828j = new short[i6];
        this.f111830l = new short[i6];
        this.f111832n = new short[i6];
    }

    /* JADX INFO: renamed from: j */
    public static void m137399j(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
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
    public final int m137400a() {
        int i = this.f111831m * this.f111820b;
        return i + i;
    }

    /* JADX INFO: renamed from: b */
    public final int m137401b() {
        int i = this.f111829k * this.f111820b;
        return i + i;
    }

    /* JADX INFO: renamed from: c */
    public final void m137402c() {
        this.f111829k = 0;
        this.f111831m = 0;
        this.f111833o = 0;
        this.f111834p = 0;
        this.f111835q = 0;
        this.f111836r = 0;
        this.f111837s = 0;
        this.f111838t = 0;
        this.f111839u = 0;
        this.f111840v = 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m137403d(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f111820b, this.f111831m);
        shortBuffer.put(this.f111830l, 0, this.f111820b * iMin);
        int i = this.f111831m - iMin;
        this.f111831m = i;
        int i2 = this.f111820b;
        short[] sArr = this.f111830l;
        System.arraycopy(sArr, iMin * i2, sArr, 0, i * i2);
    }

    /* JADX INFO: renamed from: e */
    public final void m137404e() {
        int i;
        int i2 = this.f111829k;
        int i3 = this.f111831m;
        float f = this.f111833o;
        float f2 = this.f111821c;
        float f3 = this.f111823e;
        float f4 = this.f111822d;
        int i4 = i3 + ((int) ((((i2 / (f2 / f4)) + f) / (f3 * f4)) + 0.5f));
        int i5 = this.f111826h;
        this.f111828j = m137410l(this.f111828j, i2, i5 + i5 + i2);
        int i6 = 0;
        while (true) {
            int i7 = this.f111826h;
            int i8 = this.f111820b;
            i = i7 + i7;
            if (i6 >= i * i8) {
                break;
            }
            this.f111828j[(i8 * i2) + i6] = 0;
            i6++;
        }
        this.f111829k += i;
        m137409k();
        if (this.f111831m > i4) {
            this.f111831m = i4;
        }
        this.f111829k = 0;
        this.f111836r = 0;
        this.f111833o = 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m137405f(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.f111820b;
        int i2 = iRemaining / i;
        int i3 = i * i2;
        short[] sArrM137410l = m137410l(this.f111828j, this.f111829k, i2);
        this.f111828j = sArrM137410l;
        shortBuffer.get(sArrM137410l, this.f111829k * this.f111820b, (i3 + i3) / 2);
        this.f111829k += i2;
        m137409k();
    }

    /* JADX INFO: renamed from: g */
    public final int m137406g(short[] sArr, int i, int i2, int i3) {
        int i4 = 1;
        int i5 = 255;
        int i6 = 0;
        int i7 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                int i9 = this.f111820b * i;
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
        this.f111839u = i4 / i6;
        this.f111840v = i7 / i5;
        return i6;
    }

    /* JADX INFO: renamed from: h */
    public final void m137407h(short[] sArr, int i, int i2) {
        short[] sArrM137410l = m137410l(this.f111830l, this.f111831m, i2);
        this.f111830l = sArrM137410l;
        int i3 = this.f111831m;
        int i4 = this.f111820b;
        System.arraycopy(sArr, i * i4, sArrM137410l, i3 * i4, i2 * i4);
        this.f111831m += i2;
    }

    /* JADX INFO: renamed from: i */
    public final void m137408i(short[] sArr, int i, int i2) {
        int i3;
        for (int i4 = 0; i4 < this.f111826h / i2; i4++) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.f111820b;
                i3 = i7 * i2;
                if (i5 < i3) {
                    i6 += sArr[(i7 * i) + (i3 * i4) + i5];
                    i5++;
                }
            }
            this.f111827i[i4] = (short) (i6 / i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0156 A[EDGE_INSN: B:108:0x0156->B:65:0x0156 BREAK  A[LOOP:4: B:13:0x0038->B:99:0x022d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x022d A[LOOP:4: B:13:0x0038->B:99:0x022d, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final void m137409k() {
        int iM137406g;
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        int i7;
        float f2 = this.f111821c / this.f111822d;
        double d = f2;
        int i8 = this.f111831m;
        float f3 = 1.0f;
        int i9 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i10 = this.f111829k;
            if (i10 >= this.f111826h) {
                int i11 = 0;
                while (true) {
                    int i12 = this.f111836r;
                    if (i12 > 0) {
                        int iMin = Math.min(this.f111826h, i12);
                        m137407h(this.f111828j, i11, iMin);
                        this.f111836r -= iMin;
                        i11 += iMin;
                    } else {
                        short[] sArr = this.f111828j;
                        int i13 = this.f111819a;
                        int i14 = i13 > 4000 ? i13 / TXLiteAVCode.WARNING_START_CAPTURE_IGNORED : i9;
                        if (this.f111820b == i9 && i14 == i9) {
                            iM137406g = m137406g(sArr, i11, this.f111824f, this.f111825g);
                        } else {
                            m137408i(sArr, i11, i14);
                            int iM137406g2 = m137406g(this.f111827i, 0, this.f111824f / i14, this.f111825g / i14);
                            if (i14 != i9) {
                                int i15 = iM137406g2 * i14;
                                int i16 = i14 * 4;
                                int i17 = this.f111824f;
                                int i18 = i15 - i16;
                                if (i18 >= i17) {
                                    i17 = i18;
                                }
                                int i19 = i15 + i16;
                                int i20 = this.f111825g;
                                if (i19 > i20) {
                                    i19 = i20;
                                }
                                if (this.f111820b == i9) {
                                    iM137406g = m137406g(sArr, i11, i17, i19);
                                } else {
                                    m137408i(sArr, i11, i9);
                                    iM137406g = m137406g(this.f111827i, 0, i17, i19);
                                }
                            } else {
                                iM137406g = iM137406g2;
                            }
                        }
                        int i21 = this.f111839u;
                        int i22 = (i21 == 0 || (i3 = this.f111837s) == 0 || this.f111840v > i21 * 3 || i21 + i21 <= this.f111838t * 3) ? iM137406g : i3;
                        int i23 = i11 + i22;
                        this.f111838t = i21;
                        this.f111837s = iM137406g;
                        float f4 = i22;
                        short[] sArr2 = this.f111828j;
                        if (d > 1.0d) {
                            float f5 = (-1.0f) + f2;
                            if (f2 >= 2.0f) {
                                i2 = (int) (f4 / f5);
                            } else {
                                this.f111836r = (int) ((f4 * (2.0f - f2)) / f5);
                                i2 = i22;
                            }
                            short[] sArrM137410l = m137410l(this.f111830l, this.f111831m, i2);
                            this.f111830l = sArrM137410l;
                            m137399j(i2, this.f111820b, sArrM137410l, this.f111831m, sArr2, i11, sArr2, i23);
                            this.f111831m += i2;
                            i11 += i22 + i2;
                        } else {
                            int i24 = i22;
                            float f6 = f3 - f2;
                            if (f2 < 0.5f) {
                                i = (int) ((f4 * f2) / f6);
                            } else {
                                this.f111836r = (int) ((f4 * ((f2 + f2) - 1.0f)) / f6);
                                i = i24;
                            }
                            int i25 = i24 + i;
                            short[] sArrM137410l2 = m137410l(this.f111830l, this.f111831m, i25);
                            this.f111830l = sArrM137410l2;
                            int i26 = this.f111820b;
                            System.arraycopy(sArr2, i11 * i26, sArrM137410l2, this.f111831m * i26, i26 * i24);
                            int i27 = i11;
                            m137399j(i, this.f111820b, this.f111830l, this.f111831m + i24, sArr2, i23, sArr2, i27);
                            this.f111831m += i25;
                            i11 = i27 + i;
                        }
                        if (this.f111826h + i11 > i10) {
                            break;
                        }
                        f3 = f3;
                        i9 = i9;
                    }
                    if (this.f111826h + i11 > i10) {
                        break;
                        break;
                    } else {
                        f3 = f3;
                        i9 = i9;
                    }
                }
                int i28 = this.f111829k - i11;
                short[] sArr3 = this.f111828j;
                int i29 = this.f111820b;
                System.arraycopy(sArr3, i11 * i29, sArr3, 0, i29 * i28);
                this.f111829k = i28;
            }
            f = this.f111823e * this.f111822d;
            if (f != f3 || this.f111831m == i8) {
            }
            int i30 = this.f111819a;
            int i31 = (int) (i30 / f);
            while (true) {
                if (i31 <= 16384 && i30 <= 16384) {
                    break;
                }
                i31 /= 2;
                i30 /= 2;
            }
            int i32 = this.f111831m - i8;
            short[] sArrM137410l3 = m137410l(this.f111832n, this.f111833o, i32);
            this.f111832n = sArrM137410l3;
            short[] sArr4 = this.f111830l;
            int i33 = this.f111820b;
            System.arraycopy(sArr4, i8 * i33, sArrM137410l3, this.f111833o * i33, i33 * i32);
            this.f111831m = i8;
            this.f111833o += i32;
            int i34 = 0;
            while (true) {
                i4 = this.f111833o;
                i5 = i4 - 1;
                if (i34 >= i5) {
                    break;
                }
                while (true) {
                    i6 = this.f111834p + 1;
                    int i35 = i6 * i31;
                    i7 = this.f111835q;
                    if (i35 <= i7 * i30) {
                        break;
                    }
                    this.f111830l = m137410l(this.f111830l, this.f111831m, i9);
                    int i36 = 0;
                    while (true) {
                        int i37 = this.f111820b;
                        if (i36 < i37) {
                            short[] sArr5 = this.f111830l;
                            int i38 = this.f111831m * i37;
                            short[] sArr6 = this.f111832n;
                            int i39 = (i34 * i37) + i36;
                            short s = sArr6[i39];
                            short s2 = sArr6[i39 + i37];
                            int i40 = this.f111835q * i30;
                            int i41 = this.f111834p;
                            int i42 = i41 * i31;
                            int i43 = (i41 + 1) * i31;
                            int i44 = i43 - i40;
                            int i45 = i43 - i42;
                            sArr5[i38 + i36] = (short) (((s * i44) + ((i45 - i44) * s2)) / i45);
                            i36++;
                        }
                    }
                    i9 = 1;
                    this.f111835q++;
                    this.f111831m++;
                }
                this.f111834p = i6;
                if (i6 == i30) {
                    this.f111834p = 0;
                    lev0.m153958f(i7 == i31 ? i9 : 0);
                    this.f111835q = 0;
                }
                i34++;
            }
            if (i5 != 0) {
                short[] sArr7 = this.f111832n;
                int i46 = this.f111820b;
                System.arraycopy(sArr7, i5 * i46, sArr7, 0, (i4 - i5) * i46);
                this.f111833o -= i5;
                return;
            }
            return;
        }
        m137407h(this.f111828j, 0, this.f111829k);
        this.f111829k = 0;
        f3 = 1.0f;
        i9 = 1;
        f = this.f111823e * this.f111822d;
        if (f != f3) {
        }
    }

    /* JADX INFO: renamed from: l */
    public final short[] m137410l(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f111820b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }
}
