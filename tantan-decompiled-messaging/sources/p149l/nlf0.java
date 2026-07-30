package p149l;

import com.tencent.liteav.TXLiteAVCode;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class nlf0 {

    /* JADX INFO: renamed from: a */
    public final int f139523a;

    /* JADX INFO: renamed from: b */
    public final int f139524b;

    /* JADX INFO: renamed from: c */
    public final float f139525c;

    /* JADX INFO: renamed from: d */
    public final float f139526d;

    /* JADX INFO: renamed from: e */
    public final float f139527e;

    /* JADX INFO: renamed from: f */
    public final int f139528f;

    /* JADX INFO: renamed from: g */
    public final int f139529g;

    /* JADX INFO: renamed from: h */
    public final int f139530h;

    /* JADX INFO: renamed from: i */
    public final short[] f139531i;

    /* JADX INFO: renamed from: j */
    public short[] f139532j;

    /* JADX INFO: renamed from: k */
    public int f139533k;

    /* JADX INFO: renamed from: l */
    public short[] f139534l;

    /* JADX INFO: renamed from: m */
    public int f139535m;

    /* JADX INFO: renamed from: n */
    public short[] f139536n;

    /* JADX INFO: renamed from: o */
    public int f139537o;

    /* JADX INFO: renamed from: p */
    public int f139538p;

    /* JADX INFO: renamed from: q */
    public int f139539q;

    /* JADX INFO: renamed from: r */
    public int f139540r;

    /* JADX INFO: renamed from: s */
    public int f139541s;

    /* JADX INFO: renamed from: t */
    public int f139542t;

    /* JADX INFO: renamed from: u */
    public int f139543u;

    /* JADX INFO: renamed from: v */
    public int f139544v;

    public nlf0(int i, int i2, float f, float f2, int i3) {
        this.f139523a = i;
        this.f139524b = i2;
        this.f139525c = f;
        this.f139526d = f2;
        this.f139527e = i / i3;
        this.f139528f = i / 400;
        int i4 = i / 65;
        this.f139529g = i4;
        int i5 = i4 * 2;
        this.f139530h = i5;
        this.f139531i = new short[i5];
        this.f139532j = new short[i5 * i2];
        this.f139534l = new short[i5 * i2];
        this.f139536n = new short[i5 * i2];
    }

    /* JADX INFO: renamed from: p */
    public static void m160020p(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m160021a(float f, int i) {
        int i2;
        int i3;
        if (this.f139535m == i) {
            return;
        }
        int i4 = this.f139523a;
        int i5 = (int) (i4 / f);
        while (true) {
            if (i5 <= 16384 && i4 <= 16384) {
                break;
            }
            i5 /= 2;
            i4 /= 2;
        }
        m160035o(i);
        int i6 = 0;
        while (true) {
            int i7 = this.f139537o;
            if (i6 >= i7 - 1) {
                m160040u(i7 - 1);
                return;
            }
            while (true) {
                i2 = this.f139538p;
                int i8 = (i2 + 1) * i5;
                i3 = this.f139539q;
                if (i8 <= i3 * i4) {
                    break;
                }
                this.f139534l = m160026f(this.f139534l, this.f139535m, 1);
                int i9 = 0;
                while (true) {
                    int i10 = this.f139524b;
                    if (i9 < i10) {
                        this.f139534l[(this.f139535m * i10) + i9] = m160034n(this.f139536n, (i10 * i6) + i9, i4, i5);
                        i9++;
                    }
                }
                this.f139539q++;
                this.f139535m++;
            }
            int i11 = i2 + 1;
            this.f139538p = i11;
            if (i11 == i4) {
                this.f139538p = 0;
                p11.m167013g(i3 == i5);
                this.f139539q = 0;
            }
            i6++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m160022b(float f) {
        int iM160042w;
        int i = this.f139533k;
        if (i < this.f139530h) {
            return;
        }
        int i2 = 0;
        do {
            if (this.f139540r > 0) {
                iM160042w = m160023c(i2);
            } else {
                int iM160027g = m160027g(this.f139532j, i2);
                double d = f;
                short[] sArr = this.f139532j;
                iM160042w = d > 1.0d ? iM160027g + m160042w(sArr, i2, f, iM160027g) : m160033m(sArr, i2, f, iM160027g);
            }
            i2 += iM160042w;
        } while (this.f139530h + i2 <= i);
        m160041v(i2);
    }

    /* JADX INFO: renamed from: c */
    public final int m160023c(int i) {
        int iMin = Math.min(this.f139530h, this.f139540r);
        m160024d(this.f139532j, i, iMin);
        this.f139540r -= iMin;
        return iMin;
    }

    /* JADX INFO: renamed from: d */
    public final void m160024d(short[] sArr, int i, int i2) {
        short[] sArrM160026f = m160026f(this.f139534l, this.f139535m, i2);
        this.f139534l = sArrM160026f;
        int i3 = this.f139524b;
        System.arraycopy(sArr, i * i3, sArrM160026f, this.f139535m * i3, i3 * i2);
        this.f139535m += i2;
    }

    /* JADX INFO: renamed from: e */
    public final void m160025e(short[] sArr, int i, int i2) {
        int i3 = this.f139530h / i2;
        int i4 = this.f139524b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f139531i[i7] = (short) (i8 / i5);
        }
    }

    /* JADX INFO: renamed from: f */
    public final short[] m160026f(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f139524b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* JADX INFO: renamed from: g */
    public final int m160027g(short[] sArr, int i) {
        int iM160028h;
        int i2 = this.f139523a;
        int i3 = i2 > 4000 ? i2 / TXLiteAVCode.WARNING_START_CAPTURE_IGNORED : 1;
        if (this.f139524b == 1 && i3 == 1) {
            iM160028h = m160028h(sArr, i, this.f139528f, this.f139529g);
        } else {
            m160025e(sArr, i, i3);
            int iM160028h2 = m160028h(this.f139531i, 0, this.f139528f / i3, this.f139529g / i3);
            if (i3 != 1) {
                int i4 = iM160028h2 * i3;
                int i5 = i3 * 4;
                int i6 = i4 - i5;
                int i7 = i4 + i5;
                int i8 = this.f139528f;
                if (i6 < i8) {
                    i6 = i8;
                }
                int i9 = this.f139529g;
                if (i7 > i9) {
                    i7 = i9;
                }
                if (this.f139524b == 1) {
                    iM160028h = m160028h(sArr, i, i6, i7);
                } else {
                    m160025e(sArr, i, 1);
                    iM160028h = m160028h(this.f139531i, 0, i6, i7);
                }
            } else {
                iM160028h = iM160028h2;
            }
        }
        int i10 = m160036q(this.f139543u, this.f139544v) ? this.f139541s : iM160028h;
        this.f139542t = this.f139543u;
        this.f139541s = iM160028h;
        return i10;
    }

    /* JADX INFO: renamed from: h */
    public final int m160028h(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f139524b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i6 * i2) {
                i7 = i2;
                i6 = iAbs;
            }
            if (iAbs * i5 > i8 * i2) {
                i5 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.f139543u = i6 / i7;
        this.f139544v = i8 / i5;
        return i7;
    }

    /* JADX INFO: renamed from: i */
    public void m160029i() {
        this.f139533k = 0;
        this.f139535m = 0;
        this.f139537o = 0;
        this.f139538p = 0;
        this.f139539q = 0;
        this.f139540r = 0;
        this.f139541s = 0;
        this.f139542t = 0;
        this.f139543u = 0;
        this.f139544v = 0;
    }

    /* JADX INFO: renamed from: j */
    public void m160030j(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f139524b, this.f139535m);
        shortBuffer.put(this.f139534l, 0, this.f139524b * iMin);
        int i = this.f139535m - iMin;
        this.f139535m = i;
        short[] sArr = this.f139534l;
        int i2 = this.f139524b;
        System.arraycopy(sArr, iMin * i2, sArr, 0, i * i2);
    }

    /* JADX INFO: renamed from: k */
    public int m160031k() {
        return this.f139535m * this.f139524b * 2;
    }

    /* JADX INFO: renamed from: l */
    public int m160032l() {
        return this.f139533k * this.f139524b * 2;
    }

    /* JADX INFO: renamed from: m */
    public final int m160033m(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((i2 * f) / (1.0f - f));
        } else {
            this.f139540r = (int) ((i2 * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] sArrM160026f = m160026f(this.f139534l, this.f139535m, i4);
        this.f139534l = sArrM160026f;
        int i5 = this.f139524b;
        System.arraycopy(sArr, i * i5, sArrM160026f, this.f139535m * i5, i5 * i2);
        m160020p(i3, this.f139524b, this.f139534l, this.f139535m + i2, sArr, i + i2, sArr, i);
        this.f139535m += i4;
        return i3;
    }

    /* JADX INFO: renamed from: n */
    public final short m160034n(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.f139524b];
        int i4 = this.f139539q * i2;
        int i5 = this.f139538p;
        int i6 = i5 * i3;
        int i7 = (i5 + 1) * i3;
        int i8 = i7 - i4;
        int i9 = i7 - i6;
        return (short) (((s * i8) + ((i9 - i8) * s2)) / i9);
    }

    /* JADX INFO: renamed from: o */
    public final void m160035o(int i) {
        int i2 = this.f139535m - i;
        short[] sArrM160026f = m160026f(this.f139536n, this.f139537o, i2);
        this.f139536n = sArrM160026f;
        short[] sArr = this.f139534l;
        int i3 = this.f139524b;
        System.arraycopy(sArr, i * i3, sArrM160026f, this.f139537o * i3, i3 * i2);
        this.f139535m = i;
        this.f139537o += i2;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m160036q(int i, int i2) {
        return i != 0 && this.f139541s != 0 && i2 <= i * 3 && i * 2 > this.f139542t * 3;
    }

    /* JADX INFO: renamed from: r */
    public final void m160037r() {
        int i = this.f139535m;
        float f = this.f139525c;
        float f2 = this.f139526d;
        float f3 = f / f2;
        float f4 = this.f139527e * f2;
        double d = f3;
        if (d > 1.00001d || d < 0.99999d) {
            m160022b(f3);
        } else {
            m160024d(this.f139532j, 0, this.f139533k);
            this.f139533k = 0;
        }
        if (f4 != 1.0f) {
            m160021a(f4, i);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m160038s() {
        int i;
        int i2 = this.f139533k;
        float f = this.f139525c;
        float f2 = this.f139526d;
        int i3 = this.f139535m + ((int) ((((i2 / (f / f2)) + this.f139537o) / (this.f139527e * f2)) + 0.5f));
        this.f139532j = m160026f(this.f139532j, i2, (this.f139530h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.f139530h;
            int i5 = this.f139524b;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.f139532j[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.f139533k += i * 2;
        m160037r();
        if (this.f139535m > i3) {
            this.f139535m = i3;
        }
        this.f139533k = 0;
        this.f139540r = 0;
        this.f139537o = 0;
    }

    /* JADX INFO: renamed from: t */
    public void m160039t(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.f139524b;
        int i2 = iRemaining / i;
        short[] sArrM160026f = m160026f(this.f139532j, this.f139533k, i2);
        this.f139532j = sArrM160026f;
        shortBuffer.get(sArrM160026f, this.f139533k * this.f139524b, ((i * i2) * 2) / 2);
        this.f139533k += i2;
        m160037r();
    }

    /* JADX INFO: renamed from: u */
    public final void m160040u(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.f139536n;
        int i2 = this.f139524b;
        System.arraycopy(sArr, i * i2, sArr, 0, (this.f139537o - i) * i2);
        this.f139537o -= i;
    }

    /* JADX INFO: renamed from: v */
    public final void m160041v(int i) {
        int i2 = this.f139533k - i;
        short[] sArr = this.f139532j;
        int i3 = this.f139524b;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.f139533k = i2;
    }

    /* JADX INFO: renamed from: w */
    public final int m160042w(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (i2 / (f - 1.0f));
        } else {
            this.f139540r = (int) ((i2 * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        short[] sArrM160026f = m160026f(this.f139534l, this.f139535m, i3);
        this.f139534l = sArrM160026f;
        m160020p(i3, this.f139524b, sArrM160026f, this.f139535m, sArr, i, sArr, i + i2);
        this.f139535m += i3;
        return i3;
    }
}
