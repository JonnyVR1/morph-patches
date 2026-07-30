package p153l;

import com.google.zxing.FormatException;

/* JADX INFO: loaded from: classes7.dex */
public final class f13 {

    /* JADX INFO: renamed from: a */
    public final d13 f96764a;

    /* JADX INFO: renamed from: b */
    public final d13 f96765b;

    /* JADX INFO: renamed from: c */
    public final n9l0 f96766c;

    public f13(d13 d13Var) throws FormatException {
        int iM113483j = d13Var.m113483j();
        if (iM113483j < 8 || iM113483j > 144 || (iM113483j & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        this.f96766c = m123544j(d13Var);
        d13 d13VarM123545a = m123545a(d13Var);
        this.f96764a = d13VarM123545a;
        this.f96765b = new d13(d13VarM123545a.m113486m(), d13VarM123545a.m113483j());
    }

    /* JADX INFO: renamed from: j */
    public static n9l0 m123544j(d13 d13Var) throws FormatException {
        return n9l0.m161990h(d13Var.m113483j(), d13Var.m113486m());
    }

    /* JADX INFO: renamed from: a */
    public final d13 m123545a(d13 d13Var) {
        int iM161995f = this.f96766c.m161995f();
        int iM161994e = this.f96766c.m161994e();
        if (d13Var.m113483j() != iM161995f) {
            wg3.m206174a("Dimension of bitMatrix must match the version size");
            return null;
        }
        int iM161992c = this.f96766c.m161992c();
        int iM161991b = this.f96766c.m161991b();
        int i = iM161995f / iM161992c;
        int i2 = iM161994e / iM161991b;
        d13 d13Var2 = new d13(i2 * iM161991b, i * iM161992c);
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 * iM161992c;
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = i5 * iM161991b;
                for (int i7 = 0; i7 < iM161992c; i7++) {
                    int i8 = ((iM161992c + 2) * i3) + 1 + i7;
                    int i9 = i4 + i7;
                    for (int i10 = 0; i10 < iM161991b; i10++) {
                        if (d13Var.m113480d(((iM161991b + 2) * i5) + 1 + i10, i8)) {
                            d13Var2.m113488o(i6 + i10, i9);
                        }
                    }
                }
            }
        }
        return d13Var2;
    }

    /* JADX INFO: renamed from: b */
    public n9l0 m123546b() {
        return this.f96766c;
    }

    /* JADX INFO: renamed from: c */
    public byte[] m123547c() throws FormatException {
        byte[] bArr = new byte[this.f96766c.m161996g()];
        int iM113483j = this.f96764a.m113483j();
        int iM113486m = this.f96764a.m113486m();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 4;
        while (true) {
            if (i3 == iM113483j && i == 0 && !z) {
                bArr[i2] = (byte) m123548d(iM113483j, iM113486m);
                i3 -= 2;
                i += 2;
                i2++;
                z = true;
            } else {
                int i4 = iM113483j - 2;
                if (i3 == i4 && i == 0 && (iM113486m & 3) != 0 && !z2) {
                    bArr[i2] = (byte) m123549e(iM113483j, iM113486m);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z2 = true;
                } else if (i3 == iM113483j + 4 && i == 2 && (iM113486m & 7) == 0 && !z3) {
                    bArr[i2] = (byte) m123550f(iM113483j, iM113486m);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z3 = true;
                } else if (i3 == i4 && i == 0 && (iM113486m & 7) == 4 && !z4) {
                    bArr[i2] = (byte) m123551g(iM113483j, iM113486m);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z4 = true;
                } else {
                    while (true) {
                        if (i3 < iM113483j && i >= 0 && !this.f96765b.m113480d(i, i3)) {
                            bArr[i2] = (byte) m123553i(i3, i, iM113483j, iM113486m);
                            i2++;
                        }
                        int i5 = i3 - 2;
                        int i6 = i + 2;
                        if (i5 < 0 || i6 >= iM113486m) {
                            break;
                        }
                        i3 = i5;
                        i = i6;
                    }
                    int i7 = i3 - 1;
                    int i8 = i + 5;
                    while (true) {
                        if (i7 >= 0 && i8 < iM113486m && !this.f96765b.m113480d(i8, i7)) {
                            bArr[i2] = (byte) m123553i(i7, i8, iM113483j, iM113486m);
                            i2++;
                        }
                        int i9 = i7 + 2;
                        int i10 = i8 - 2;
                        if (i9 >= iM113483j || i10 < 0) {
                            break;
                        }
                        i7 = i9;
                        i8 = i10;
                    }
                    i3 = i7 + 5;
                    i = i8 - 1;
                }
            }
            if (i3 >= iM113483j && i >= iM113486m) {
                break;
            }
        }
        if (i2 == this.f96766c.m161996g()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX INFO: renamed from: d */
    public final int m123548d(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m123552h(i3, 0, i, i2) ? 1 : 0) << 1;
        if (m123552h(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m123552h(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m123552h(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (m123552h(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (m123552h(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (m123552h(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        return m123552h(3, i8, i, i2) ? i11 | 1 : i11;
    }

    /* JADX INFO: renamed from: e */
    public final int m123549e(int i, int i2) {
        int i3 = (m123552h(i + (-3), 0, i, i2) ? 1 : 0) << 1;
        if (m123552h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m123552h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m123552h(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m123552h(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (m123552h(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (m123552h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        return m123552h(1, i9, i, i2) ? i10 | 1 : i10;
    }

    /* JADX INFO: renamed from: f */
    public final int m123550f(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m123552h(i3, 0, i, i2) ? 1 : 0) << 1;
        int i5 = i2 - 1;
        if (m123552h(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (m123552h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (m123552h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (m123552h(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (m123552h(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m123552h(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        return m123552h(1, i5, i, i2) ? i13 | 1 : i13;
    }

    /* JADX INFO: renamed from: g */
    public final int m123551g(int i, int i2) {
        int i3 = (m123552h(i + (-3), 0, i, i2) ? 1 : 0) << 1;
        if (m123552h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m123552h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m123552h(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (m123552h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (m123552h(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (m123552h(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        return m123552h(3, i7, i, i2) ? i10 | 1 : i10;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m123552h(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.f96765b.m113488o(i2, i);
        return this.f96764a.m113480d(i2, i);
    }

    /* JADX INFO: renamed from: i */
    public final int m123553i(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (m123552h(i5, i6, i3, i4) ? 1 : 0) << 1;
        int i8 = i2 - 1;
        if (m123552h(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (m123552h(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (m123552h(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m123552h(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (m123552h(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (m123552h(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return m123552h(i, i2, i3, i4) ? i15 | 1 : i15;
    }
}
