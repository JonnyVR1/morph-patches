package p149l;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.tencent.rtmp.TXLiveConstants;

/* JADX INFO: loaded from: classes7.dex */
public final class hxd {

    /* JADX INFO: renamed from: g */
    public static final int[] f109851g = {3808, 476, TXLiveConstants.PLAY_WARNING_VIDEO_DISCONTINUITY, 1799};

    /* JADX INFO: renamed from: a */
    public final o03 f109852a;

    /* JADX INFO: renamed from: b */
    public boolean f109853b;

    /* JADX INFO: renamed from: c */
    public int f109854c;

    /* JADX INFO: renamed from: d */
    public int f109855d;

    /* JADX INFO: renamed from: e */
    public int f109856e;

    /* JADX INFO: renamed from: f */
    public int f109857f;

    /* JADX INFO: renamed from: l.hxd$a */
    public static final class C17426a {

        /* JADX INFO: renamed from: a */
        public final int f109858a;

        /* JADX INFO: renamed from: b */
        public final int f109859b;

        public C17426a(int i, int i2) {
            this.f109858a = i;
            this.f109859b = i2;
        }

        /* JADX INFO: renamed from: a */
        public int m133339a() {
            return this.f109858a;
        }

        /* JADX INFO: renamed from: b */
        public int m133340b() {
            return this.f109859b;
        }

        /* JADX INFO: renamed from: c */
        public pxc0 m133341c() {
            return new pxc0(m133339a(), m133340b());
        }

        public String toString() {
            return "<" + this.f109858a + ' ' + this.f109859b + '>';
        }
    }

    public hxd(o03 o03Var) {
        this.f109852a = o03Var;
    }

    /* JADX INFO: renamed from: b */
    public static float m133321b(C17426a c17426a, C17426a c17426a2) {
        return jex.m141163b(c17426a.m133339a(), c17426a.m133340b(), c17426a2.m133339a(), c17426a2.m133340b());
    }

    /* JADX INFO: renamed from: c */
    public static float m133322c(pxc0 pxc0Var, pxc0 pxc0Var2) {
        return jex.m141162a(pxc0Var.m171831c(), pxc0Var.m171832d(), pxc0Var2.m171831c(), pxc0Var2.m171832d());
    }

    /* JADX INFO: renamed from: d */
    public static pxc0[] m133323d(pxc0[] pxc0VarArr, int i, int i2) {
        float f = i2 / (i * 2.0f);
        float fM171831c = pxc0VarArr[0].m171831c() - pxc0VarArr[2].m171831c();
        float fM171832d = pxc0VarArr[0].m171832d() - pxc0VarArr[2].m171832d();
        float fM171831c2 = (pxc0VarArr[0].m171831c() + pxc0VarArr[2].m171831c()) / 2.0f;
        float fM171832d2 = (pxc0VarArr[0].m171832d() + pxc0VarArr[2].m171832d()) / 2.0f;
        float f2 = fM171831c * f;
        float f3 = fM171832d * f;
        pxc0 pxc0Var = new pxc0(fM171831c2 + f2, fM171832d2 + f3);
        pxc0 pxc0Var2 = new pxc0(fM171831c2 - f2, fM171832d2 - f3);
        float fM171831c3 = pxc0VarArr[1].m171831c() - pxc0VarArr[3].m171831c();
        float fM171832d3 = pxc0VarArr[1].m171832d() - pxc0VarArr[3].m171832d();
        float fM171831c4 = (pxc0VarArr[1].m171831c() + pxc0VarArr[3].m171831c()) / 2.0f;
        float fM171832d4 = (pxc0VarArr[1].m171832d() + pxc0VarArr[3].m171832d()) / 2.0f;
        float f4 = fM171831c3 * f;
        float f5 = f * fM171832d3;
        return new pxc0[]{pxc0Var, new pxc0(fM171831c4 + f4, fM171832d4 + f5), pxc0Var2, new pxc0(fM171831c4 - f4, fM171832d4 - f5)};
    }

    /* JADX INFO: renamed from: h */
    public static int m133324h(long j, boolean z) throws NotFoundException {
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
            new ylc0(gjj.f103073k).m215261a(iArr, i3);
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
    public static int m133325m(int[] iArr, int i) throws NotFoundException {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(f109851g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: a */
    public rp1 m133326a(boolean z) throws NotFoundException {
        pxc0[] pxc0VarArrM133328f = m133328f(m133332k());
        if (z) {
            pxc0 pxc0Var = pxc0VarArrM133328f[0];
            pxc0VarArrM133328f[0] = pxc0VarArrM133328f[2];
            pxc0VarArrM133328f[2] = pxc0Var;
        }
        m133327e(pxc0VarArrM133328f);
        o03 o03Var = this.f109852a;
        int i = this.f109857f;
        return new rp1(m133337q(o03Var, pxc0VarArrM133328f[i % 4], pxc0VarArrM133328f[(i + 1) % 4], pxc0VarArrM133328f[(i + 2) % 4], pxc0VarArrM133328f[(i + 3) % 4]), m133333l(pxc0VarArrM133328f), this.f109853b, this.f109855d, this.f109854c);
    }

    /* JADX INFO: renamed from: e */
    public final void m133327e(pxc0[] pxc0VarArr) throws NotFoundException {
        long j;
        long j2;
        if (!m133335o(pxc0VarArr[0]) || !m133335o(pxc0VarArr[1]) || !m133335o(pxc0VarArr[2]) || !m133335o(pxc0VarArr[3])) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i = this.f109856e * 2;
        int[] iArr = {m133338r(pxc0VarArr[0], pxc0VarArr[1], i), m133338r(pxc0VarArr[1], pxc0VarArr[2], i), m133338r(pxc0VarArr[2], pxc0VarArr[3], i), m133338r(pxc0VarArr[3], pxc0VarArr[0], i)};
        this.f109857f = m133325m(iArr, i);
        long j3 = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = iArr[(this.f109857f + i2) % 4];
            if (this.f109853b) {
                j = j3 << 7;
                j2 = (i3 >> 1) & 127;
            } else {
                j = j3 << 10;
                j2 = ((i3 >> 2) & 992) + ((i3 >> 1) & 31);
            }
            j3 = j + j2;
        }
        int iM133324h = m133324h(j3, this.f109853b);
        if (this.f109853b) {
            this.f109854c = (iM133324h >> 6) + 1;
            this.f109855d = (iM133324h & 63) + 1;
        } else {
            this.f109854c = (iM133324h >> 11) + 1;
            this.f109855d = (iM133324h & 2047) + 1;
        }
    }

    /* JADX INFO: renamed from: f */
    public final pxc0[] m133328f(C17426a c17426a) throws NotFoundException {
        this.f109856e = 1;
        C17426a c17426a2 = c17426a;
        C17426a c17426a3 = c17426a2;
        C17426a c17426a4 = c17426a3;
        boolean z = true;
        while (this.f109856e < 9) {
            C17426a c17426aM133331j = m133331j(c17426a, z, 1, -1);
            C17426a c17426aM133331j2 = m133331j(c17426a2, z, 1, 1);
            C17426a c17426aM133331j3 = m133331j(c17426a3, z, -1, 1);
            C17426a c17426aM133331j4 = m133331j(c17426a4, z, -1, -1);
            if (this.f109856e > 2) {
                double dM133321b = (m133321b(c17426aM133331j4, c17426aM133331j) * this.f109856e) / (m133321b(c17426a4, c17426a) * (this.f109856e + 2));
                if (dM133321b < 0.75d || dM133321b > 1.25d || !m133336p(c17426aM133331j, c17426aM133331j2, c17426aM133331j3, c17426aM133331j4)) {
                    break;
                }
            }
            z = !z;
            this.f109856e++;
            c17426a4 = c17426aM133331j4;
            c17426a = c17426aM133331j;
            c17426a2 = c17426aM133331j2;
            c17426a3 = c17426aM133331j3;
        }
        int i = this.f109856e;
        if (i != 5 && i != 7) {
            throw NotFoundException.getNotFoundInstance();
        }
        this.f109853b = i == 5;
        pxc0[] pxc0VarArr = {new pxc0(c17426a.m133339a() + 0.5f, c17426a.m133340b() - 0.5f), new pxc0(c17426a2.m133339a() + 0.5f, c17426a2.m133340b() + 0.5f), new pxc0(c17426a3.m133339a() - 0.5f, c17426a3.m133340b() + 0.5f), new pxc0(c17426a4.m133339a() - 0.5f, c17426a4.m133340b() - 0.5f)};
        int i2 = this.f109856e;
        return m133323d(pxc0VarArr, (i2 * 2) - 3, i2 * 2);
    }

    /* JADX INFO: renamed from: g */
    public final int m133329g(C17426a c17426a, C17426a c17426a2) {
        float fM133321b = m133321b(c17426a, c17426a2);
        float fM133339a = (c17426a2.m133339a() - c17426a.m133339a()) / fM133321b;
        float fM133340b = (c17426a2.m133340b() - c17426a.m133340b()) / fM133321b;
        float fM133339a2 = c17426a.m133339a();
        float fM133340b2 = c17426a.m133340b();
        boolean zM162110d = this.f109852a.m162110d(c17426a.m133339a(), c17426a.m133340b());
        int iCeil = (int) Math.ceil(fM133321b);
        int i = 0;
        for (int i2 = 0; i2 < iCeil; i2++) {
            fM133339a2 += fM133339a;
            fM133340b2 += fM133340b;
            if (this.f109852a.m162110d(jex.m141164c(fM133339a2), jex.m141164c(fM133340b2)) != zM162110d) {
                i++;
            }
        }
        float f = i / fM133321b;
        if (f <= 0.1f || f >= 0.9f) {
            return (f <= 0.1f) == zM162110d ? 1 : -1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public final int m133330i() {
        boolean z = this.f109853b;
        int i = this.f109854c;
        if (z) {
            return (i * 4) + 11;
        }
        return i <= 4 ? (i * 4) + 15 : (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    /* JADX INFO: renamed from: j */
    public final C17426a m133331j(C17426a c17426a, boolean z, int i, int i2) {
        int iM133339a = c17426a.m133339a() + i;
        int iM133340b = c17426a.m133340b();
        while (true) {
            iM133340b += i2;
            if (!m133334n(iM133339a, iM133340b) || this.f109852a.m162110d(iM133339a, iM133340b) != z) {
                break;
            }
            iM133339a += i;
        }
        int i3 = iM133339a - i;
        int i4 = iM133340b - i2;
        while (m133334n(i3, i4) && this.f109852a.m162110d(i3, i4) == z) {
            i3 += i;
        }
        int i5 = i3 - i;
        while (m133334n(i5, i4) && this.f109852a.m162110d(i5, i4) == z) {
            i4 += i2;
        }
        return new C17426a(i5, i4 - i2);
    }

    /* JADX INFO: renamed from: k */
    public final C17426a m133332k() {
        pxc0 pxc0VarM133341c;
        pxc0 pxc0Var;
        pxc0 pxc0Var2;
        pxc0 pxc0Var3;
        pxc0 pxc0VarM133341c2;
        pxc0 pxc0VarM133341c3;
        pxc0 pxc0VarM133341c4;
        pxc0 pxc0VarM133341c5;
        try {
            pxc0[] pxc0VarArrM100471c = new b6q0(this.f109852a).m100471c();
            pxc0Var2 = pxc0VarArrM100471c[0];
            pxc0Var3 = pxc0VarArrM100471c[1];
            pxc0Var = pxc0VarArrM100471c[2];
            pxc0VarM133341c = pxc0VarArrM100471c[3];
        } catch (NotFoundException unused) {
            int iM162116m = this.f109852a.m162116m() / 2;
            int iM162113j = this.f109852a.m162113j() / 2;
            int i = iM162116m + 7;
            int i2 = iM162113j - 7;
            pxc0 pxc0VarM133341c6 = m133331j(new C17426a(i, i2), false, 1, -1).m133341c();
            int i3 = iM162113j + 7;
            pxc0 pxc0VarM133341c7 = m133331j(new C17426a(i, i3), false, 1, 1).m133341c();
            int i4 = iM162116m - 7;
            pxc0 pxc0VarM133341c8 = m133331j(new C17426a(i4, i3), false, -1, 1).m133341c();
            pxc0VarM133341c = m133331j(new C17426a(i4, i2), false, -1, -1).m133341c();
            pxc0Var = pxc0VarM133341c8;
            pxc0Var2 = pxc0VarM133341c6;
            pxc0Var3 = pxc0VarM133341c7;
        }
        int iM141164c = jex.m141164c((((pxc0Var2.m171831c() + pxc0VarM133341c.m171831c()) + pxc0Var3.m171831c()) + pxc0Var.m171831c()) / 4.0f);
        int iM141164c2 = jex.m141164c((((pxc0Var2.m171832d() + pxc0VarM133341c.m171832d()) + pxc0Var3.m171832d()) + pxc0Var.m171832d()) / 4.0f);
        try {
            pxc0[] pxc0VarArrM100471c2 = new b6q0(this.f109852a, 15, iM141164c, iM141164c2).m100471c();
            pxc0VarM133341c2 = pxc0VarArrM100471c2[0];
            pxc0VarM133341c3 = pxc0VarArrM100471c2[1];
            pxc0VarM133341c4 = pxc0VarArrM100471c2[2];
            pxc0VarM133341c5 = pxc0VarArrM100471c2[3];
        } catch (NotFoundException unused2) {
            int i5 = iM141164c + 7;
            int i6 = iM141164c2 - 7;
            pxc0VarM133341c2 = m133331j(new C17426a(i5, i6), false, 1, -1).m133341c();
            int i7 = iM141164c2 + 7;
            pxc0VarM133341c3 = m133331j(new C17426a(i5, i7), false, 1, 1).m133341c();
            int i8 = iM141164c - 7;
            pxc0VarM133341c4 = m133331j(new C17426a(i8, i7), false, -1, 1).m133341c();
            pxc0VarM133341c5 = m133331j(new C17426a(i8, i6), false, -1, -1).m133341c();
        }
        return new C17426a(jex.m141164c((((pxc0VarM133341c2.m171831c() + pxc0VarM133341c5.m171831c()) + pxc0VarM133341c3.m171831c()) + pxc0VarM133341c4.m171831c()) / 4.0f), jex.m141164c((((pxc0VarM133341c2.m171832d() + pxc0VarM133341c5.m171832d()) + pxc0VarM133341c3.m171832d()) + pxc0VarM133341c4.m171832d()) / 4.0f));
    }

    /* JADX INFO: renamed from: l */
    public final pxc0[] m133333l(pxc0[] pxc0VarArr) {
        return m133323d(pxc0VarArr, this.f109856e * 2, m133330i());
    }

    /* JADX INFO: renamed from: n */
    public final boolean m133334n(int i, int i2) {
        return i >= 0 && i < this.f109852a.m162116m() && i2 > 0 && i2 < this.f109852a.m162113j();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m133335o(pxc0 pxc0Var) {
        return m133334n(jex.m141164c(pxc0Var.m171831c()), jex.m141164c(pxc0Var.m171832d()));
    }

    /* JADX INFO: renamed from: p */
    public final boolean m133336p(C17426a c17426a, C17426a c17426a2, C17426a c17426a3, C17426a c17426a4) {
        C17426a c17426a5 = new C17426a(c17426a.m133339a() - 3, c17426a.m133340b() + 3);
        C17426a c17426a6 = new C17426a(c17426a2.m133339a() - 3, c17426a2.m133340b() - 3);
        C17426a c17426a7 = new C17426a(c17426a3.m133339a() + 3, c17426a3.m133340b() - 3);
        C17426a c17426a8 = new C17426a(c17426a4.m133339a() + 3, c17426a4.m133340b() + 3);
        int iM133329g = m133329g(c17426a8, c17426a5);
        return iM133329g != 0 && m133329g(c17426a5, c17426a6) == iM133329g && m133329g(c17426a6, c17426a7) == iM133329g && m133329g(c17426a7, c17426a8) == iM133329g;
    }

    /* JADX INFO: renamed from: q */
    public final o03 m133337q(o03 o03Var, pxc0 pxc0Var, pxc0 pxc0Var2, pxc0 pxc0Var3, pxc0 pxc0Var4) throws NotFoundException {
        bbk bbkVarM100979b = bbk.m100979b();
        int iM133330i = m133330i();
        float f = iM133330i / 2.0f;
        int i = this.f109856e;
        float f2 = f - i;
        float f3 = f + i;
        return bbkVarM100979b.mo100980c(o03Var, iM133330i, iM133330i, f2, f2, f3, f2, f3, f3, f2, f3, pxc0Var.m171831c(), pxc0Var.m171832d(), pxc0Var2.m171831c(), pxc0Var2.m171832d(), pxc0Var3.m171831c(), pxc0Var3.m171832d(), pxc0Var4.m171831c(), pxc0Var4.m171832d());
    }

    /* JADX INFO: renamed from: r */
    public final int m133338r(pxc0 pxc0Var, pxc0 pxc0Var2, int i) {
        float fM133322c = m133322c(pxc0Var, pxc0Var2);
        float f = fM133322c / i;
        float fM171831c = pxc0Var.m171831c();
        float fM171832d = pxc0Var.m171832d();
        float fM171831c2 = ((pxc0Var2.m171831c() - pxc0Var.m171831c()) * f) / fM133322c;
        float fM171832d2 = (f * (pxc0Var2.m171832d() - pxc0Var.m171832d())) / fM133322c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = i3;
            if (this.f109852a.m162110d(jex.m141164c((f2 * fM171831c2) + fM171831c), jex.m141164c((f2 * fM171832d2) + fM171832d))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }
}
