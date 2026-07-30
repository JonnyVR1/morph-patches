package p153l;

import com.tencent.liteav.TXLiteAVCode;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class wtf0 {

    /* JADX INFO: renamed from: a */
    public final int f190757a;

    /* JADX INFO: renamed from: b */
    public final int f190758b;

    /* JADX INFO: renamed from: c */
    public final float f190759c;

    /* JADX INFO: renamed from: d */
    public final float f190760d;

    /* JADX INFO: renamed from: e */
    public final float f190761e;

    /* JADX INFO: renamed from: f */
    public final int f190762f;

    /* JADX INFO: renamed from: g */
    public final int f190763g;

    /* JADX INFO: renamed from: h */
    public final int f190764h;

    /* JADX INFO: renamed from: i */
    public final short[] f190765i;

    /* JADX INFO: renamed from: j */
    public short[] f190766j;

    /* JADX INFO: renamed from: k */
    public int f190767k;

    /* JADX INFO: renamed from: l */
    public short[] f190768l;

    /* JADX INFO: renamed from: m */
    public int f190769m;

    /* JADX INFO: renamed from: n */
    public short[] f190770n;

    /* JADX INFO: renamed from: o */
    public int f190771o;

    /* JADX INFO: renamed from: p */
    public int f190772p;

    /* JADX INFO: renamed from: q */
    public int f190773q;

    /* JADX INFO: renamed from: r */
    public int f190774r;

    /* JADX INFO: renamed from: s */
    public int f190775s;

    /* JADX INFO: renamed from: t */
    public int f190776t;

    /* JADX INFO: renamed from: u */
    public int f190777u;

    /* JADX INFO: renamed from: v */
    public int f190778v;

    public wtf0(int i, int i2, float f, float f2, int i3) {
        this.f190757a = i;
        this.f190758b = i2;
        this.f190759c = f;
        this.f190760d = f2;
        this.f190761e = i / i3;
        this.f190762f = i / 400;
        int i4 = i / 65;
        this.f190763g = i4;
        int i5 = i4 * 2;
        this.f190764h = i5;
        this.f190765i = new short[i5];
        this.f190766j = new short[i5 * i2];
        this.f190768l = new short[i5 * i2];
        this.f190770n = new short[i5 * i2];
    }

    /* JADX INFO: renamed from: p */
    public static void m207849p(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
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
    public final void m207850a(float f, int i) {
        int i2;
        int i3;
        if (this.f190769m == i) {
            return;
        }
        int i4 = this.f190757a;
        int i5 = (int) (i4 / f);
        while (true) {
            if (i5 <= 16384 && i4 <= 16384) {
                break;
            }
            i5 /= 2;
            i4 /= 2;
        }
        m207864o(i);
        int i6 = 0;
        while (true) {
            int i7 = this.f190771o;
            if (i6 >= i7 - 1) {
                m207869u(i7 - 1);
                return;
            }
            while (true) {
                i2 = this.f190772p;
                int i8 = (i2 + 1) * i5;
                i3 = this.f190773q;
                if (i8 <= i3 * i4) {
                    break;
                }
                this.f190768l = m207855f(this.f190768l, this.f190769m, 1);
                int i9 = 0;
                while (true) {
                    int i10 = this.f190758b;
                    if (i9 < i10) {
                        this.f190768l[(this.f190769m * i10) + i9] = m207863n(this.f190770n, (i10 * i6) + i9, i4, i5);
                        i9++;
                    }
                }
                this.f190773q++;
                this.f190769m++;
            }
            int i11 = i2 + 1;
            this.f190772p = i11;
            if (i11 == i4) {
                this.f190772p = 0;
                w11.m204371g(i3 == i5);
                this.f190773q = 0;
            }
            i6++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m207851b(float f) {
        int iM207871w;
        int i = this.f190767k;
        if (i < this.f190764h) {
            return;
        }
        int i2 = 0;
        do {
            if (this.f190774r > 0) {
                iM207871w = m207852c(i2);
            } else {
                int iM207856g = m207856g(this.f190766j, i2);
                double d = f;
                short[] sArr = this.f190766j;
                iM207871w = d > 1.0d ? iM207856g + m207871w(sArr, i2, f, iM207856g) : m207862m(sArr, i2, f, iM207856g);
            }
            i2 += iM207871w;
        } while (this.f190764h + i2 <= i);
        m207870v(i2);
    }

    /* JADX INFO: renamed from: c */
    public final int m207852c(int i) {
        int iMin = Math.min(this.f190764h, this.f190774r);
        m207853d(this.f190766j, i, iMin);
        this.f190774r -= iMin;
        return iMin;
    }

    /* JADX INFO: renamed from: d */
    public final void m207853d(short[] sArr, int i, int i2) {
        short[] sArrM207855f = m207855f(this.f190768l, this.f190769m, i2);
        this.f190768l = sArrM207855f;
        int i3 = this.f190758b;
        System.arraycopy(sArr, i * i3, sArrM207855f, this.f190769m * i3, i3 * i2);
        this.f190769m += i2;
    }

    /* JADX INFO: renamed from: e */
    public final void m207854e(short[] sArr, int i, int i2) {
        int i3 = this.f190764h / i2;
        int i4 = this.f190758b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f190765i[i7] = (short) (i8 / i5);
        }
    }

    /* JADX INFO: renamed from: f */
    public final short[] m207855f(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f190758b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* JADX INFO: renamed from: g */
    public final int m207856g(short[] sArr, int i) {
        int iM207857h;
        int i2 = this.f190757a;
        int i3 = i2 > 4000 ? i2 / TXLiteAVCode.WARNING_START_CAPTURE_IGNORED : 1;
        if (this.f190758b == 1 && i3 == 1) {
            iM207857h = m207857h(sArr, i, this.f190762f, this.f190763g);
        } else {
            m207854e(sArr, i, i3);
            int iM207857h2 = m207857h(this.f190765i, 0, this.f190762f / i3, this.f190763g / i3);
            if (i3 != 1) {
                int i4 = iM207857h2 * i3;
                int i5 = i3 * 4;
                int i6 = i4 - i5;
                int i7 = i4 + i5;
                int i8 = this.f190762f;
                if (i6 < i8) {
                    i6 = i8;
                }
                int i9 = this.f190763g;
                if (i7 > i9) {
                    i7 = i9;
                }
                if (this.f190758b == 1) {
                    iM207857h = m207857h(sArr, i, i6, i7);
                } else {
                    m207854e(sArr, i, 1);
                    iM207857h = m207857h(this.f190765i, 0, i6, i7);
                }
            } else {
                iM207857h = iM207857h2;
            }
        }
        int i10 = m207865q(this.f190777u, this.f190778v) ? this.f190775s : iM207857h;
        this.f190776t = this.f190777u;
        this.f190775s = iM207857h;
        return i10;
    }

    /* JADX INFO: renamed from: h */
    public final int m207857h(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f190758b;
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
        this.f190777u = i6 / i7;
        this.f190778v = i8 / i5;
        return i7;
    }

    /* JADX INFO: renamed from: i */
    public void m207858i() {
        this.f190767k = 0;
        this.f190769m = 0;
        this.f190771o = 0;
        this.f190772p = 0;
        this.f190773q = 0;
        this.f190774r = 0;
        this.f190775s = 0;
        this.f190776t = 0;
        this.f190777u = 0;
        this.f190778v = 0;
    }

    /* JADX INFO: renamed from: j */
    public void m207859j(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f190758b, this.f190769m);
        shortBuffer.put(this.f190768l, 0, this.f190758b * iMin);
        int i = this.f190769m - iMin;
        this.f190769m = i;
        short[] sArr = this.f190768l;
        int i2 = this.f190758b;
        System.arraycopy(sArr, iMin * i2, sArr, 0, i * i2);
    }

    /* JADX INFO: renamed from: k */
    public int m207860k() {
        return this.f190769m * this.f190758b * 2;
    }

    /* JADX INFO: renamed from: l */
    public int m207861l() {
        return this.f190767k * this.f190758b * 2;
    }

    /* JADX INFO: renamed from: m */
    public final int m207862m(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((i2 * f) / (1.0f - f));
        } else {
            this.f190774r = (int) ((i2 * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] sArrM207855f = m207855f(this.f190768l, this.f190769m, i4);
        this.f190768l = sArrM207855f;
        int i5 = this.f190758b;
        System.arraycopy(sArr, i * i5, sArrM207855f, this.f190769m * i5, i5 * i2);
        m207849p(i3, this.f190758b, this.f190768l, this.f190769m + i2, sArr, i + i2, sArr, i);
        this.f190769m += i4;
        return i3;
    }

    /* JADX INFO: renamed from: n */
    public final short m207863n(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.f190758b];
        int i4 = this.f190773q * i2;
        int i5 = this.f190772p;
        int i6 = i5 * i3;
        int i7 = (i5 + 1) * i3;
        int i8 = i7 - i4;
        int i9 = i7 - i6;
        return (short) (((s * i8) + ((i9 - i8) * s2)) / i9);
    }

    /* JADX INFO: renamed from: o */
    public final void m207864o(int i) {
        int i2 = this.f190769m - i;
        short[] sArrM207855f = m207855f(this.f190770n, this.f190771o, i2);
        this.f190770n = sArrM207855f;
        short[] sArr = this.f190768l;
        int i3 = this.f190758b;
        System.arraycopy(sArr, i * i3, sArrM207855f, this.f190771o * i3, i3 * i2);
        this.f190769m = i;
        this.f190771o += i2;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m207865q(int i, int i2) {
        return i != 0 && this.f190775s != 0 && i2 <= i * 3 && i * 2 > this.f190776t * 3;
    }

    /* JADX INFO: renamed from: r */
    public final void m207866r() {
        int i = this.f190769m;
        float f = this.f190759c;
        float f2 = this.f190760d;
        float f3 = f / f2;
        float f4 = this.f190761e * f2;
        double d = f3;
        if (d > 1.00001d || d < 0.99999d) {
            m207851b(f3);
        } else {
            m207853d(this.f190766j, 0, this.f190767k);
            this.f190767k = 0;
        }
        if (f4 != 1.0f) {
            m207850a(f4, i);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m207867s() {
        int i;
        int i2 = this.f190767k;
        float f = this.f190759c;
        float f2 = this.f190760d;
        int i3 = this.f190769m + ((int) ((((i2 / (f / f2)) + this.f190771o) / (this.f190761e * f2)) + 0.5f));
        this.f190766j = m207855f(this.f190766j, i2, (this.f190764h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.f190764h;
            int i5 = this.f190758b;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.f190766j[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.f190767k += i * 2;
        m207866r();
        if (this.f190769m > i3) {
            this.f190769m = i3;
        }
        this.f190767k = 0;
        this.f190774r = 0;
        this.f190771o = 0;
    }

    /* JADX INFO: renamed from: t */
    public void m207868t(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.f190758b;
        int i2 = iRemaining / i;
        short[] sArrM207855f = m207855f(this.f190766j, this.f190767k, i2);
        this.f190766j = sArrM207855f;
        shortBuffer.get(sArrM207855f, this.f190767k * this.f190758b, ((i * i2) * 2) / 2);
        this.f190767k += i2;
        m207866r();
    }

    /* JADX INFO: renamed from: u */
    public final void m207869u(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.f190770n;
        int i2 = this.f190758b;
        System.arraycopy(sArr, i * i2, sArr, 0, (this.f190771o - i) * i2);
        this.f190771o -= i;
    }

    /* JADX INFO: renamed from: v */
    public final void m207870v(int i) {
        int i2 = this.f190767k - i;
        short[] sArr = this.f190766j;
        int i3 = this.f190758b;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.f190767k = i2;
    }

    /* JADX INFO: renamed from: w */
    public final int m207871w(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (i2 / (f - 1.0f));
        } else {
            this.f190774r = (int) ((i2 * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        short[] sArrM207855f = m207855f(this.f190768l, this.f190769m, i3);
        this.f190768l = sArrM207855f;
        m207849p(i3, this.f190758b, sArrM207855f, this.f190769m, sArr, i, sArr, i + i2);
        this.f190769m += i3;
        return i3;
    }
}
