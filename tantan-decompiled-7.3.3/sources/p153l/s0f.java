package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class s0f {

    /* JADX INFO: renamed from: a */
    public static final int[] f165681a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* JADX INFO: renamed from: a */
    public static int[] m183927a(b13 b13Var, int i, int i2) {
        int[] iArr = new int[i2];
        int iM101402m = b13Var.m101402m() / i;
        for (int i3 = 0; i3 < iM101402m; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 |= b13Var.m101398f((i3 * i) + i5) ? 1 << ((i - i5) - 1) : 0;
            }
            iArr[i3] = i4;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public static void m183928b(d13 d13Var, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    d13Var.m113488o(i5, i4);
                    d13Var.m113488o(i5, i6);
                    d13Var.m113488o(i4, i5);
                    d13Var.m113488o(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        d13Var.m113488o(i7, i7);
        int i8 = i7 + 1;
        d13Var.m113488o(i8, i7);
        d13Var.m113488o(i7, i8);
        int i9 = i + i2;
        d13Var.m113488o(i9, i7);
        d13Var.m113488o(i9, i8);
        d13Var.m113488o(i9, i9 - 1);
    }

    /* JADX INFO: renamed from: c */
    public static void m183929c(d13 d13Var, boolean z, int i, b13 b13Var) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (b13Var.m101398f(i3)) {
                    d13Var.m113488o(i4, i2 - 5);
                }
                if (b13Var.m101398f(i3 + 7)) {
                    d13Var.m113488o(i2 + 5, i4);
                }
                if (b13Var.m101398f(20 - i3)) {
                    d13Var.m113488o(i4, i2 + 5);
                }
                if (b13Var.m101398f(27 - i3)) {
                    d13Var.m113488o(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (b13Var.m101398f(i3)) {
                d13Var.m113488o(i5, i2 - 7);
            }
            if (b13Var.m101398f(i3 + 10)) {
                d13Var.m113488o(i2 + 7, i5);
            }
            if (b13Var.m101398f(29 - i3)) {
                d13Var.m113488o(i5, i2 + 7);
            }
            if (b13Var.m101398f(39 - i3)) {
                d13Var.m113488o(i2 - 7, i5);
            }
            i3++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static xp1 m183930d(byte[] bArr, int i, int i2) {
        b13 b13VarM183934h;
        int i3;
        boolean z;
        int iAbs;
        int iM183935i;
        int i4;
        b13 b13VarM214239a = new y4l(bArr).m214239a();
        int iM101402m = ((b13VarM214239a.m101402m() * i) / 100) + 11;
        int iM101402m2 = b13VarM214239a.m101402m() + iM101402m;
        int i5 = 1;
        if (i2 != 0) {
            boolean z2 = i2 < 0;
            iAbs = Math.abs(i2);
            if (iAbs > (z2 ? 4 : 32)) {
                gzi0.m133102a("Illegal value %s for layers", new Object[]{Integer.valueOf(i2)});
                return null;
            }
            iM183935i = m183935i(iAbs, z2);
            i3 = f165681a[iAbs];
            int i6 = iM183935i - (iM183935i % i3);
            b13VarM183934h = m183934h(b13VarM214239a, i3);
            if (b13VarM183934h.m101402m() + iM101402m > i6) {
                z = z2;
                wg3.m206174a("Data to large for user specified layer");
                return null;
            }
            if (z2) {
                z = z2;
                if (b13VarM183934h.m101402m() > (i3 << 6)) {
                    wg3.m206174a("Data to large for user specified layer");
                    return null;
                }
            }
        } else {
            b13 b13VarM183934h2 = null;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i7 > 32) {
                    wg3.m206174a("Data too large for an Aztec code");
                    return null;
                }
                boolean z3 = i7 <= 3 ? i5 : 0;
                int i9 = z3 != 0 ? i7 + 1 : i7;
                int iM183935i2 = m183935i(i9, z3);
                if (iM101402m2 <= iM183935i2) {
                    if (b13VarM183934h2 == null || i8 != f165681a[i9]) {
                        int i10 = f165681a[i9];
                        i8 = i10;
                        b13VarM183934h2 = m183934h(b13VarM214239a, i10);
                    }
                    int i11 = iM183935i2 - (iM183935i2 % i8);
                    if ((z3 == 0 || b13VarM183934h2.m101402m() <= (i8 << 6)) && b13VarM183934h2.m101402m() + iM101402m <= i11) {
                        b13VarM183934h = b13VarM183934h2;
                        i3 = i8;
                        z = z3;
                        iAbs = i9;
                        iM183935i = iM183935i2;
                        break;
                    }
                }
                i7++;
                i5 = i5;
            }
        }
        b13 b13VarM183931e = m183931e(b13VarM183934h, iM183935i, i3);
        int iM101402m3 = b13VarM183934h.m101402m() / i3;
        b13 b13VarM183932f = m183932f(z, iAbs, iM101402m3);
        int i12 = (z ? 11 : 14) + (iAbs << 2);
        int[] iArr = new int[i12];
        int i13 = 2;
        if (z) {
            for (int i14 = 0; i14 < i12; i14++) {
                iArr[i14] = i14;
            }
            i4 = i12;
        } else {
            int i15 = i12 / 2;
            i4 = i12 + 1 + (((i15 - 1) / 15) * 2);
            int i16 = i4 / 2;
            for (int i17 = 0; i17 < i15; i17++) {
                int i18 = (i17 / 15) + i17;
                iArr[(i15 - i17) - i5] = (i16 - i18) - 1;
                iArr[i15 + i17] = i18 + i16 + i5;
            }
        }
        d13 d13Var = new d13(i4);
        int i19 = 0;
        for (int i20 = 0; i20 < iAbs; i20++) {
            int i21 = ((iAbs - i20) << i13) + (z ? 9 : 12);
            for (int i22 = 0; i22 < i21; i22++) {
                int i23 = i22 << 1;
                int i24 = 0;
                while (i24 < i13) {
                    int i25 = i5;
                    if (b13VarM183931e.m101398f(i19 + i23 + i24)) {
                        int i26 = i20 << 1;
                        d13Var.m113488o(iArr[i26 + i24], iArr[i26 + i22]);
                    }
                    if (b13VarM183931e.m101398f((i21 << 1) + i19 + i23 + i24)) {
                        int i27 = i20 << 1;
                        d13Var.m113488o(iArr[i27 + i22], iArr[((i12 - 1) - i27) - i24]);
                    }
                    if (b13VarM183931e.m101398f((i21 << 2) + i19 + i23 + i24)) {
                        int i28 = (i12 - 1) - (i20 << 1);
                        d13Var.m113488o(iArr[i28 - i24], iArr[i28 - i22]);
                    }
                    if (b13VarM183931e.m101398f((i21 * 6) + i19 + i23 + i24)) {
                        int i29 = i20 << 1;
                        d13Var.m113488o(iArr[((i12 - 1) - i29) - i22], iArr[i29 + i24]);
                    }
                    i24++;
                    i13 = i13;
                    i5 = i25;
                }
            }
            i19 += i21 << 3;
        }
        m183929c(d13Var, z, i4, b13VarM183932f);
        if (z) {
            m183928b(d13Var, i4 / 2, 5);
        } else {
            int i30 = i4 / 2;
            m183928b(d13Var, i30, 7);
            int i31 = 0;
            int i32 = 0;
            while (i32 < (i12 / 2) - 1) {
                for (int i33 = i30 & 1; i33 < i4; i33 += 2) {
                    int i34 = i30 - i31;
                    d13Var.m113488o(i34, i33);
                    int i35 = i30 + i31;
                    d13Var.m113488o(i35, i33);
                    d13Var.m113488o(i33, i34);
                    d13Var.m113488o(i33, i35);
                }
                i32 += 15;
                i31 += 16;
            }
        }
        xp1 xp1Var = new xp1();
        xp1Var.m212508c(z);
        xp1Var.m212511f(i4);
        xp1Var.m212509d(iAbs);
        xp1Var.m212507b(iM101402m3);
        xp1Var.m212510e(d13Var);
        return xp1Var;
    }

    /* JADX INFO: renamed from: e */
    public static b13 m183931e(b13 b13Var, int i, int i2) {
        int iM101402m = b13Var.m101402m() / i2;
        guc0 guc0Var = new guc0(m183933g(i2));
        int i3 = i / i2;
        int[] iArrM183927a = m183927a(b13Var, i2, i3);
        guc0Var.m132278b(iArrM183927a, i3 - iM101402m);
        b13 b13Var2 = new b13();
        b13Var2.m101395c(0, i % i2);
        for (int i4 : iArrM183927a) {
            b13Var2.m101395c(i4, i2);
        }
        return b13Var2;
    }

    /* JADX INFO: renamed from: f */
    public static b13 m183932f(boolean z, int i, int i2) {
        b13 b13Var = new b13();
        if (z) {
            b13Var.m101395c(i - 1, 2);
            b13Var.m101395c(i2 - 1, 6);
            return m183931e(b13Var, 28, 4);
        }
        b13Var.m101395c(i - 1, 5);
        b13Var.m101395c(i2 - 1, 11);
        return m183931e(b13Var, 40, 4);
    }

    /* JADX INFO: renamed from: g */
    public static zlj m183933g(int i) {
        if (i == 4) {
            return zlj.f204932k;
        }
        if (i == 6) {
            return zlj.f204931j;
        }
        if (i == 8) {
            return zlj.f204935n;
        }
        if (i == 10) {
            return zlj.f204930i;
        }
        if (i == 12) {
            return zlj.f204929h;
        }
        wg3.m206174a("Unsupported word size ".concat(String.valueOf(i)));
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static b13 m183934h(b13 b13Var, int i) {
        b13 b13Var2 = new b13();
        int iM101402m = b13Var.m101402m();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < iM101402m) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= iM101402m || b13Var.m101398f(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 == i2) {
                b13Var2.m101395c(i7, i);
            } else {
                if (i7 == 0) {
                    b13Var2.m101395c(i4 | 1, i);
                } else {
                    b13Var2.m101395c(i4, i);
                }
                i3 += i;
            }
            i3--;
            i3 += i;
        }
        return b13Var2;
    }

    /* JADX INFO: renamed from: i */
    public static int m183935i(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }
}
