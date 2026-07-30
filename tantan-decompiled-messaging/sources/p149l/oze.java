package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class oze {

    /* JADX INFO: renamed from: a */
    public static final int[] f146420a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* JADX INFO: renamed from: a */
    public static int[] m166748a(m03 m03Var, int i, int i2) {
        int[] iArr = new int[i2];
        int iM152494m = m03Var.m152494m() / i;
        for (int i3 = 0; i3 < iM152494m; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 |= m03Var.m152490f((i3 * i) + i5) ? 1 << ((i - i5) - 1) : 0;
            }
            iArr[i3] = i4;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public static void m166749b(o03 o03Var, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    o03Var.m162118o(i5, i4);
                    o03Var.m162118o(i5, i6);
                    o03Var.m162118o(i4, i5);
                    o03Var.m162118o(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        o03Var.m162118o(i7, i7);
        int i8 = i7 + 1;
        o03Var.m162118o(i8, i7);
        o03Var.m162118o(i7, i8);
        int i9 = i + i2;
        o03Var.m162118o(i9, i7);
        o03Var.m162118o(i9, i8);
        o03Var.m162118o(i9, i9 - 1);
    }

    /* JADX INFO: renamed from: c */
    public static void m166750c(o03 o03Var, boolean z, int i, m03 m03Var) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (m03Var.m152490f(i3)) {
                    o03Var.m162118o(i4, i2 - 5);
                }
                if (m03Var.m152490f(i3 + 7)) {
                    o03Var.m162118o(i2 + 5, i4);
                }
                if (m03Var.m152490f(20 - i3)) {
                    o03Var.m162118o(i4, i2 + 5);
                }
                if (m03Var.m152490f(27 - i3)) {
                    o03Var.m162118o(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (m03Var.m152490f(i3)) {
                o03Var.m162118o(i5, i2 - 7);
            }
            if (m03Var.m152490f(i3 + 10)) {
                o03Var.m162118o(i2 + 7, i5);
            }
            if (m03Var.m152490f(29 - i3)) {
                o03Var.m162118o(i5, i2 + 7);
            }
            if (m03Var.m152490f(39 - i3)) {
                o03Var.m162118o(i2 - 7, i5);
            }
            i3++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static qp1 m166751d(byte[] bArr, int i, int i2) {
        m03 m03VarM166755h;
        int i3;
        boolean z;
        int iAbs;
        int iM166756i;
        int i4;
        m03 m03VarM134056a = new i2l(bArr).m134056a();
        int iM152494m = ((m03VarM134056a.m152494m() * i) / 100) + 11;
        int iM152494m2 = m03VarM134056a.m152494m() + iM152494m;
        int i5 = 1;
        if (i2 != 0) {
            boolean z2 = i2 < 0;
            iAbs = Math.abs(i2);
            if (iAbs > (z2 ? 4 : 32)) {
                dqi0.m113073a("Illegal value %s for layers", new Object[]{Integer.valueOf(i2)});
                return null;
            }
            iM166756i = m166756i(iAbs, z2);
            i3 = f146420a[iAbs];
            int i6 = iM166756i - (iM166756i % i3);
            m03VarM166755h = m166755h(m03VarM134056a, i3);
            if (m03VarM166755h.m152494m() + iM152494m > i6) {
                z = z2;
                ig3.m135964a("Data to large for user specified layer");
                return null;
            }
            if (z2) {
                z = z2;
                if (m03VarM166755h.m152494m() > (i3 << 6)) {
                    ig3.m135964a("Data to large for user specified layer");
                    return null;
                }
            }
        } else {
            m03 m03VarM166755h2 = null;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i7 > 32) {
                    ig3.m135964a("Data too large for an Aztec code");
                    return null;
                }
                boolean z3 = i7 <= 3 ? i5 : 0;
                int i9 = z3 != 0 ? i7 + 1 : i7;
                int iM166756i2 = m166756i(i9, z3);
                if (iM152494m2 <= iM166756i2) {
                    if (m03VarM166755h2 == null || i8 != f146420a[i9]) {
                        int i10 = f146420a[i9];
                        i8 = i10;
                        m03VarM166755h2 = m166755h(m03VarM134056a, i10);
                    }
                    int i11 = iM166756i2 - (iM166756i2 % i8);
                    if ((z3 == 0 || m03VarM166755h2.m152494m() <= (i8 << 6)) && m03VarM166755h2.m152494m() + iM152494m <= i11) {
                        m03VarM166755h = m03VarM166755h2;
                        i3 = i8;
                        z = z3;
                        iAbs = i9;
                        iM166756i = iM166756i2;
                        break;
                    }
                }
                i7++;
                i5 = i5;
            }
        }
        m03 m03VarM166752e = m166752e(m03VarM166755h, iM166756i, i3);
        int iM152494m3 = m03VarM166755h.m152494m() / i3;
        m03 m03VarM166753f = m166753f(z, iAbs, iM152494m3);
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
        o03 o03Var = new o03(i4);
        int i19 = 0;
        for (int i20 = 0; i20 < iAbs; i20++) {
            int i21 = ((iAbs - i20) << i13) + (z ? 9 : 12);
            for (int i22 = 0; i22 < i21; i22++) {
                int i23 = i22 << 1;
                int i24 = 0;
                while (i24 < i13) {
                    int i25 = i5;
                    if (m03VarM166752e.m152490f(i19 + i23 + i24)) {
                        int i26 = i20 << 1;
                        o03Var.m162118o(iArr[i26 + i24], iArr[i26 + i22]);
                    }
                    if (m03VarM166752e.m152490f((i21 << 1) + i19 + i23 + i24)) {
                        int i27 = i20 << 1;
                        o03Var.m162118o(iArr[i27 + i22], iArr[((i12 - 1) - i27) - i24]);
                    }
                    if (m03VarM166752e.m152490f((i21 << 2) + i19 + i23 + i24)) {
                        int i28 = (i12 - 1) - (i20 << 1);
                        o03Var.m162118o(iArr[i28 - i24], iArr[i28 - i22]);
                    }
                    if (m03VarM166752e.m152490f((i21 * 6) + i19 + i23 + i24)) {
                        int i29 = i20 << 1;
                        o03Var.m162118o(iArr[((i12 - 1) - i29) - i22], iArr[i29 + i24]);
                    }
                    i24++;
                    i13 = i13;
                    i5 = i25;
                }
            }
            i19 += i21 << 3;
        }
        m166750c(o03Var, z, i4, m03VarM166753f);
        if (z) {
            m166749b(o03Var, i4 / 2, 5);
        } else {
            int i30 = i4 / 2;
            m166749b(o03Var, i30, 7);
            int i31 = 0;
            int i32 = 0;
            while (i32 < (i12 / 2) - 1) {
                for (int i33 = i30 & 1; i33 < i4; i33 += 2) {
                    int i34 = i30 - i31;
                    o03Var.m162118o(i34, i33);
                    int i35 = i30 + i31;
                    o03Var.m162118o(i35, i33);
                    o03Var.m162118o(i33, i34);
                    o03Var.m162118o(i33, i35);
                }
                i32 += 15;
                i31 += 16;
            }
        }
        qp1 qp1Var = new qp1();
        qp1Var.m175791c(z);
        qp1Var.m175794f(i4);
        qp1Var.m175792d(iAbs);
        qp1Var.m175790b(iM152494m3);
        qp1Var.m175793e(o03Var);
        return qp1Var;
    }

    /* JADX INFO: renamed from: e */
    public static m03 m166752e(m03 m03Var, int i, int i2) {
        int iM152494m = m03Var.m152494m() / i2;
        zlc0 zlc0Var = new zlc0(m166754g(i2));
        int i3 = i / i2;
        int[] iArrM166748a = m166748a(m03Var, i2, i3);
        zlc0Var.m219274b(iArrM166748a, i3 - iM152494m);
        m03 m03Var2 = new m03();
        m03Var2.m152487c(0, i % i2);
        for (int i4 : iArrM166748a) {
            m03Var2.m152487c(i4, i2);
        }
        return m03Var2;
    }

    /* JADX INFO: renamed from: f */
    public static m03 m166753f(boolean z, int i, int i2) {
        m03 m03Var = new m03();
        if (z) {
            m03Var.m152487c(i - 1, 2);
            m03Var.m152487c(i2 - 1, 6);
            return m166752e(m03Var, 28, 4);
        }
        m03Var.m152487c(i - 1, 5);
        m03Var.m152487c(i2 - 1, 11);
        return m166752e(m03Var, 40, 4);
    }

    /* JADX INFO: renamed from: g */
    public static gjj m166754g(int i) {
        if (i == 4) {
            return gjj.f103073k;
        }
        if (i == 6) {
            return gjj.f103072j;
        }
        if (i == 8) {
            return gjj.f103076n;
        }
        if (i == 10) {
            return gjj.f103071i;
        }
        if (i == 12) {
            return gjj.f103070h;
        }
        ig3.m135964a("Unsupported word size ".concat(String.valueOf(i)));
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static m03 m166755h(m03 m03Var, int i) {
        m03 m03Var2 = new m03();
        int iM152494m = m03Var.m152494m();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < iM152494m) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= iM152494m || m03Var.m152490f(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 == i2) {
                m03Var2.m152487c(i7, i);
            } else {
                if (i7 == 0) {
                    m03Var2.m152487c(i4 | 1, i);
                } else {
                    m03Var2.m152487c(i4, i);
                }
                i3 += i;
            }
            i3--;
            i3 += i;
        }
        return m03Var2;
    }

    /* JADX INFO: renamed from: i */
    public static int m166756i(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }
}
