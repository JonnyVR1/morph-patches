package p153l;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.tencent.rtmp.TXLiveConstants;

/* JADX INFO: loaded from: classes7.dex */
public final class vyd {

    /* JADX INFO: renamed from: g */
    public static final int[] f186357g = {3808, 476, TXLiveConstants.PLAY_WARNING_VIDEO_DISCONTINUITY, 1799};

    /* JADX INFO: renamed from: a */
    public final d13 f186358a;

    /* JADX INFO: renamed from: b */
    public boolean f186359b;

    /* JADX INFO: renamed from: c */
    public int f186360c;

    /* JADX INFO: renamed from: d */
    public int f186361d;

    /* JADX INFO: renamed from: e */
    public int f186362e;

    /* JADX INFO: renamed from: f */
    public int f186363f;

    /* JADX INFO: renamed from: l.vyd$a */
    public static final class C20956a {

        /* JADX INFO: renamed from: a */
        public final int f186364a;

        /* JADX INFO: renamed from: b */
        public final int f186365b;

        public C20956a(int i, int i2) {
            this.f186364a = i;
            this.f186365b = i2;
        }

        /* JADX INFO: renamed from: a */
        public int m203987a() {
            return this.f186364a;
        }

        /* JADX INFO: renamed from: b */
        public int m203988b() {
            return this.f186365b;
        }

        /* JADX INFO: renamed from: c */
        public s5d0 m203989c() {
            return new s5d0(m203987a(), m203988b());
        }

        public String toString() {
            return "<" + this.f186364a + ' ' + this.f186365b + '>';
        }
    }

    public vyd(d13 d13Var) {
        this.f186358a = d13Var;
    }

    /* JADX INFO: renamed from: b */
    public static float m203969b(C20956a c20956a, C20956a c20956a2) {
        return ihx.m140044b(c20956a.m203987a(), c20956a.m203988b(), c20956a2.m203987a(), c20956a2.m203988b());
    }

    /* JADX INFO: renamed from: c */
    public static float m203970c(s5d0 s5d0Var, s5d0 s5d0Var2) {
        return ihx.m140043a(s5d0Var.m184657c(), s5d0Var.m184658d(), s5d0Var2.m184657c(), s5d0Var2.m184658d());
    }

    /* JADX INFO: renamed from: d */
    public static s5d0[] m203971d(s5d0[] s5d0VarArr, int i, int i2) {
        float f = i2 / (i * 2.0f);
        float fM184657c = s5d0VarArr[0].m184657c() - s5d0VarArr[2].m184657c();
        float fM184658d = s5d0VarArr[0].m184658d() - s5d0VarArr[2].m184658d();
        float fM184657c2 = (s5d0VarArr[0].m184657c() + s5d0VarArr[2].m184657c()) / 2.0f;
        float fM184658d2 = (s5d0VarArr[0].m184658d() + s5d0VarArr[2].m184658d()) / 2.0f;
        float f2 = fM184657c * f;
        float f3 = fM184658d * f;
        s5d0 s5d0Var = new s5d0(fM184657c2 + f2, fM184658d2 + f3);
        s5d0 s5d0Var2 = new s5d0(fM184657c2 - f2, fM184658d2 - f3);
        float fM184657c3 = s5d0VarArr[1].m184657c() - s5d0VarArr[3].m184657c();
        float fM184658d3 = s5d0VarArr[1].m184658d() - s5d0VarArr[3].m184658d();
        float fM184657c4 = (s5d0VarArr[1].m184657c() + s5d0VarArr[3].m184657c()) / 2.0f;
        float fM184658d4 = (s5d0VarArr[1].m184658d() + s5d0VarArr[3].m184658d()) / 2.0f;
        float f4 = fM184657c3 * f;
        float f5 = f * fM184658d3;
        return new s5d0[]{s5d0Var, new s5d0(fM184657c4 + f4, fM184658d4 + f5), s5d0Var2, new s5d0(fM184657c4 - f4, fM184658d4 - f5)};
    }

    /* JADX INFO: renamed from: h */
    public static int m203972h(long j, boolean z) throws NotFoundException {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new fuc0(zlj.f204932k).m127454a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (ReedSolomonException unused) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    /* JADX INFO: renamed from: m */
    public static int m203973m(int[] iArr, int i) throws NotFoundException {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(f186357g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: a */
    public yp1 m203974a(boolean z) throws NotFoundException {
        s5d0[] s5d0VarArrM203976f = m203976f(m203980k());
        if (z) {
            s5d0 s5d0Var = s5d0VarArrM203976f[0];
            s5d0VarArrM203976f[0] = s5d0VarArrM203976f[2];
            s5d0VarArrM203976f[2] = s5d0Var;
        }
        m203975e(s5d0VarArrM203976f);
        d13 d13Var = this.f186358a;
        int i = this.f186363f;
        return new yp1(m203985q(d13Var, s5d0VarArrM203976f[i % 4], s5d0VarArrM203976f[(i + 1) % 4], s5d0VarArrM203976f[(i + 2) % 4], s5d0VarArrM203976f[(i + 3) % 4]), m203981l(s5d0VarArrM203976f), this.f186359b, this.f186361d, this.f186360c);
    }

    /* JADX INFO: renamed from: e */
    public final void m203975e(s5d0[] s5d0VarArr) throws NotFoundException {
        long j;
        long j2;
        if (!m203983o(s5d0VarArr[0]) || !m203983o(s5d0VarArr[1]) || !m203983o(s5d0VarArr[2]) || !m203983o(s5d0VarArr[3])) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i = this.f186362e * 2;
        int[] iArr = {m203986r(s5d0VarArr[0], s5d0VarArr[1], i), m203986r(s5d0VarArr[1], s5d0VarArr[2], i), m203986r(s5d0VarArr[2], s5d0VarArr[3], i), m203986r(s5d0VarArr[3], s5d0VarArr[0], i)};
        this.f186363f = m203973m(iArr, i);
        long j3 = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = iArr[(this.f186363f + i2) % 4];
            if (this.f186359b) {
                j = j3 << 7;
                j2 = (i3 >> 1) & 127;
            } else {
                j = j3 << 10;
                j2 = ((i3 >> 2) & 992) + ((i3 >> 1) & 31);
            }
            j3 = j + j2;
        }
        int iM203972h = m203972h(j3, this.f186359b);
        if (this.f186359b) {
            this.f186360c = (iM203972h >> 6) + 1;
            this.f186361d = (iM203972h & 63) + 1;
        } else {
            this.f186360c = (iM203972h >> 11) + 1;
            this.f186361d = (iM203972h & 2047) + 1;
        }
    }

    /* JADX INFO: renamed from: f */
    public final s5d0[] m203976f(C20956a c20956a) throws NotFoundException {
        this.f186362e = 1;
        C20956a c20956a2 = c20956a;
        C20956a c20956a3 = c20956a2;
        C20956a c20956a4 = c20956a3;
        boolean z = true;
        while (this.f186362e < 9) {
            C20956a c20956aM203979j = m203979j(c20956a, z, 1, -1);
            C20956a c20956aM203979j2 = m203979j(c20956a2, z, 1, 1);
            C20956a c20956aM203979j3 = m203979j(c20956a3, z, -1, 1);
            C20956a c20956aM203979j4 = m203979j(c20956a4, z, -1, -1);
            if (this.f186362e > 2) {
                double dM203969b = (m203969b(c20956aM203979j4, c20956aM203979j) * this.f186362e) / (m203969b(c20956a4, c20956a) * (this.f186362e + 2));
                if (dM203969b < 0.75d || dM203969b > 1.25d || !m203984p(c20956aM203979j, c20956aM203979j2, c20956aM203979j3, c20956aM203979j4)) {
                    break;
                }
            }
            z = !z;
            this.f186362e++;
            c20956a4 = c20956aM203979j4;
            c20956a = c20956aM203979j;
            c20956a2 = c20956aM203979j2;
            c20956a3 = c20956aM203979j3;
        }
        int i = this.f186362e;
        if (i != 5 && i != 7) {
            throw NotFoundException.getNotFoundInstance();
        }
        this.f186359b = i == 5;
        s5d0[] s5d0VarArr = {new s5d0(c20956a.m203987a() + 0.5f, c20956a.m203988b() - 0.5f), new s5d0(c20956a2.m203987a() + 0.5f, c20956a2.m203988b() + 0.5f), new s5d0(c20956a3.m203987a() - 0.5f, c20956a3.m203988b() + 0.5f), new s5d0(c20956a4.m203987a() - 0.5f, c20956a4.m203988b() - 0.5f)};
        int i2 = this.f186362e;
        return m203971d(s5d0VarArr, (i2 * 2) - 3, i2 * 2);
    }

    /* JADX INFO: renamed from: g */
    public final int m203977g(C20956a c20956a, C20956a c20956a2) {
        float fM203969b = m203969b(c20956a, c20956a2);
        float fM203987a = (c20956a2.m203987a() - c20956a.m203987a()) / fM203969b;
        float fM203988b = (c20956a2.m203988b() - c20956a.m203988b()) / fM203969b;
        float fM203987a2 = c20956a.m203987a();
        float fM203988b2 = c20956a.m203988b();
        boolean zM113480d = this.f186358a.m113480d(c20956a.m203987a(), c20956a.m203988b());
        int iCeil = (int) Math.ceil(fM203969b);
        int i = 0;
        for (int i2 = 0; i2 < iCeil; i2++) {
            fM203987a2 += fM203987a;
            fM203988b2 += fM203988b;
            if (this.f186358a.m113480d(ihx.m140045c(fM203987a2), ihx.m140045c(fM203988b2)) != zM113480d) {
                i++;
            }
        }
        float f = i / fM203969b;
        if (f <= 0.1f || f >= 0.9f) {
            return (f <= 0.1f) == zM113480d ? 1 : -1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public final int m203978i() {
        boolean z = this.f186359b;
        int i = this.f186360c;
        if (z) {
            return (i * 4) + 11;
        }
        return i <= 4 ? (i * 4) + 15 : (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    /* JADX INFO: renamed from: j */
    public final C20956a m203979j(C20956a c20956a, boolean z, int i, int i2) {
        int iM203987a = c20956a.m203987a() + i;
        int iM203988b = c20956a.m203988b();
        while (true) {
            iM203988b += i2;
            if (!m203982n(iM203987a, iM203988b) || this.f186358a.m113480d(iM203987a, iM203988b) != z) {
                break;
            }
            iM203987a += i;
        }
        int i3 = iM203987a - i;
        int i4 = iM203988b - i2;
        while (m203982n(i3, i4) && this.f186358a.m113480d(i3, i4) == z) {
            i3 += i;
        }
        int i5 = i3 - i;
        while (m203982n(i5, i4) && this.f186358a.m113480d(i5, i4) == z) {
            i4 += i2;
        }
        return new C20956a(i5, i4 - i2);
    }

    /* JADX INFO: renamed from: k */
    public final C20956a m203980k() {
        s5d0 s5d0VarM203989c;
        s5d0 s5d0Var;
        s5d0 s5d0Var2;
        s5d0 s5d0Var3;
        s5d0 s5d0VarM203989c2;
        s5d0 s5d0VarM203989c3;
        s5d0 s5d0VarM203989c4;
        s5d0 s5d0VarM203989c5;
        try {
            s5d0[] s5d0VarArrM125412c = new ffq0(this.f186358a).m125412c();
            s5d0Var2 = s5d0VarArrM125412c[0];
            s5d0Var3 = s5d0VarArrM125412c[1];
            s5d0Var = s5d0VarArrM125412c[2];
            s5d0VarM203989c = s5d0VarArrM125412c[3];
        } catch (NotFoundException unused) {
            int iM113486m = this.f186358a.m113486m() / 2;
            int iM113483j = this.f186358a.m113483j() / 2;
            int i = iM113486m + 7;
            int i2 = iM113483j - 7;
            s5d0 s5d0VarM203989c6 = m203979j(new C20956a(i, i2), false, 1, -1).m203989c();
            int i3 = iM113483j + 7;
            s5d0 s5d0VarM203989c7 = m203979j(new C20956a(i, i3), false, 1, 1).m203989c();
            int i4 = iM113486m - 7;
            s5d0 s5d0VarM203989c8 = m203979j(new C20956a(i4, i3), false, -1, 1).m203989c();
            s5d0VarM203989c = m203979j(new C20956a(i4, i2), false, -1, -1).m203989c();
            s5d0Var = s5d0VarM203989c8;
            s5d0Var2 = s5d0VarM203989c6;
            s5d0Var3 = s5d0VarM203989c7;
        }
        int iM140045c = ihx.m140045c((((s5d0Var2.m184657c() + s5d0VarM203989c.m184657c()) + s5d0Var3.m184657c()) + s5d0Var.m184657c()) / 4.0f);
        int iM140045c2 = ihx.m140045c((((s5d0Var2.m184658d() + s5d0VarM203989c.m184658d()) + s5d0Var3.m184658d()) + s5d0Var.m184658d()) / 4.0f);
        try {
            s5d0[] s5d0VarArrM125412c2 = new ffq0(this.f186358a, 15, iM140045c, iM140045c2).m125412c();
            s5d0VarM203989c2 = s5d0VarArrM125412c2[0];
            s5d0VarM203989c3 = s5d0VarArrM125412c2[1];
            s5d0VarM203989c4 = s5d0VarArrM125412c2[2];
            s5d0VarM203989c5 = s5d0VarArrM125412c2[3];
        } catch (NotFoundException unused2) {
            int i5 = iM140045c + 7;
            int i6 = iM140045c2 - 7;
            s5d0VarM203989c2 = m203979j(new C20956a(i5, i6), false, 1, -1).m203989c();
            int i7 = iM140045c2 + 7;
            s5d0VarM203989c3 = m203979j(new C20956a(i5, i7), false, 1, 1).m203989c();
            int i8 = iM140045c - 7;
            s5d0VarM203989c4 = m203979j(new C20956a(i8, i7), false, -1, 1).m203989c();
            s5d0VarM203989c5 = m203979j(new C20956a(i8, i6), false, -1, -1).m203989c();
        }
        return new C20956a(ihx.m140045c((((s5d0VarM203989c2.m184657c() + s5d0VarM203989c5.m184657c()) + s5d0VarM203989c3.m184657c()) + s5d0VarM203989c4.m184657c()) / 4.0f), ihx.m140045c((((s5d0VarM203989c2.m184658d() + s5d0VarM203989c5.m184658d()) + s5d0VarM203989c3.m184658d()) + s5d0VarM203989c4.m184658d()) / 4.0f));
    }

    /* JADX INFO: renamed from: l */
    public final s5d0[] m203981l(s5d0[] s5d0VarArr) {
        return m203971d(s5d0VarArr, this.f186362e * 2, m203978i());
    }

    /* JADX INFO: renamed from: n */
    public final boolean m203982n(int i, int i2) {
        return i >= 0 && i < this.f186358a.m113486m() && i2 > 0 && i2 < this.f186358a.m113483j();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m203983o(s5d0 s5d0Var) {
        return m203982n(ihx.m140045c(s5d0Var.m184657c()), ihx.m140045c(s5d0Var.m184658d()));
    }

    /* JADX INFO: renamed from: p */
    public final boolean m203984p(C20956a c20956a, C20956a c20956a2, C20956a c20956a3, C20956a c20956a4) {
        C20956a c20956a5 = new C20956a(c20956a.m203987a() - 3, c20956a.m203988b() + 3);
        C20956a c20956a6 = new C20956a(c20956a2.m203987a() - 3, c20956a2.m203988b() - 3);
        C20956a c20956a7 = new C20956a(c20956a3.m203987a() + 3, c20956a3.m203988b() - 3);
        C20956a c20956a8 = new C20956a(c20956a4.m203987a() + 3, c20956a4.m203988b() + 3);
        int iM203977g = m203977g(c20956a8, c20956a5);
        return iM203977g != 0 && m203977g(c20956a5, c20956a6) == iM203977g && m203977g(c20956a6, c20956a7) == iM203977g && m203977g(c20956a7, c20956a8) == iM203977g;
    }

    /* JADX INFO: renamed from: q */
    public final d13 m203985q(d13 d13Var, s5d0 s5d0Var, s5d0 s5d0Var2, s5d0 s5d0Var3, s5d0 s5d0Var4) throws NotFoundException {
        rdk rdkVarM180860b = rdk.m180860b();
        int iM203978i = m203978i();
        float f = iM203978i / 2.0f;
        int i = this.f186362e;
        float f2 = f - i;
        float f3 = f + i;
        return rdkVarM180860b.mo180861c(d13Var, iM203978i, iM203978i, f2, f2, f3, f2, f3, f3, f2, f3, s5d0Var.m184657c(), s5d0Var.m184658d(), s5d0Var2.m184657c(), s5d0Var2.m184658d(), s5d0Var3.m184657c(), s5d0Var3.m184658d(), s5d0Var4.m184657c(), s5d0Var4.m184658d());
    }

    /* JADX INFO: renamed from: r */
    public final int m203986r(s5d0 s5d0Var, s5d0 s5d0Var2, int i) {
        float fM203970c = m203970c(s5d0Var, s5d0Var2);
        float f = fM203970c / i;
        float fM184657c = s5d0Var.m184657c();
        float fM184658d = s5d0Var.m184658d();
        float fM184657c2 = ((s5d0Var2.m184657c() - s5d0Var.m184657c()) * f) / fM203970c;
        float fM184658d2 = (f * (s5d0Var2.m184658d() - s5d0Var.m184658d())) / fM203970c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = i3;
            if (this.f186358a.m113480d(ihx.m140045c((f2 * fM184657c2) + fM184657c), ihx.m140045c((f2 * fM184658d2) + fM184658d))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }
}
