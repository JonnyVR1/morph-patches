package p149l;

import com.google.zxing.FormatException;

/* JADX INFO: loaded from: classes7.dex */
public final class q03 {

    /* JADX INFO: renamed from: a */
    public final o03 f151996a;

    /* JADX INFO: renamed from: b */
    public final o03 f151997b;

    /* JADX INFO: renamed from: c */
    public final i0l0 f151998c;

    public q03(o03 o03Var) throws FormatException {
        int iM162113j = o03Var.m162113j();
        if (iM162113j < 8 || iM162113j > 144 || (iM162113j & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        this.f151998c = m172275j(o03Var);
        o03 o03VarM172276a = m172276a(o03Var);
        this.f151996a = o03VarM172276a;
        this.f151997b = new o03(o03VarM172276a.m162116m(), o03VarM172276a.m162113j());
    }

    /* JADX INFO: renamed from: j */
    public static i0l0 m172275j(o03 o03Var) throws FormatException {
        return i0l0.m133890h(o03Var.m162113j(), o03Var.m162116m());
    }

    /* JADX INFO: renamed from: a */
    public final o03 m172276a(o03 o03Var) {
        int iM133895f = this.f151998c.m133895f();
        int iM133894e = this.f151998c.m133894e();
        if (o03Var.m162113j() != iM133895f) {
            ig3.m135964a("Dimension of bitMatrix must match the version size");
            return null;
        }
        int iM133892c = this.f151998c.m133892c();
        int iM133891b = this.f151998c.m133891b();
        int i = iM133895f / iM133892c;
        int i2 = iM133894e / iM133891b;
        o03 o03Var2 = new o03(i2 * iM133891b, i * iM133892c);
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 * iM133892c;
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = i5 * iM133891b;
                for (int i7 = 0; i7 < iM133892c; i7++) {
                    int i8 = ((iM133892c + 2) * i3) + 1 + i7;
                    int i9 = i4 + i7;
                    for (int i10 = 0; i10 < iM133891b; i10++) {
                        if (o03Var.m162110d(((iM133891b + 2) * i5) + 1 + i10, i8)) {
                            o03Var2.m162118o(i6 + i10, i9);
                        }
                    }
                }
            }
        }
        return o03Var2;
    }

    /* JADX INFO: renamed from: b */
    public i0l0 m172277b() {
        return this.f151998c;
    }

    /* JADX INFO: renamed from: c */
    public byte[] m172278c() throws FormatException {
        byte[] bArr = new byte[this.f151998c.m133896g()];
        int iM162113j = this.f151996a.m162113j();
        int iM162116m = this.f151996a.m162116m();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 4;
        while (true) {
            if (i3 == iM162113j && i == 0 && !z) {
                bArr[i2] = (byte) m172279d(iM162113j, iM162116m);
                i3 -= 2;
                i += 2;
                i2++;
                z = true;
            } else {
                int i4 = iM162113j - 2;
                if (i3 == i4 && i == 0 && (iM162116m & 3) != 0 && !z2) {
                    bArr[i2] = (byte) m172280e(iM162113j, iM162116m);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z2 = true;
                } else if (i3 == iM162113j + 4 && i == 2 && (iM162116m & 7) == 0 && !z3) {
                    bArr[i2] = (byte) m172281f(iM162113j, iM162116m);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z3 = true;
                } else if (i3 == i4 && i == 0 && (iM162116m & 7) == 4 && !z4) {
                    bArr[i2] = (byte) m172282g(iM162113j, iM162116m);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z4 = true;
                } else {
                    while (true) {
                        if (i3 < iM162113j && i >= 0 && !this.f151997b.m162110d(i, i3)) {
                            bArr[i2] = (byte) m172284i(i3, i, iM162113j, iM162116m);
                            i2++;
                        }
                        int i5 = i3 - 2;
                        int i6 = i + 2;
                        if (i5 < 0 || i6 >= iM162116m) {
                            break;
                        }
                        i3 = i5;
                        i = i6;
                    }
                    int i7 = i3 - 1;
                    int i8 = i + 5;
                    while (true) {
                        if (i7 >= 0 && i8 < iM162116m && !this.f151997b.m162110d(i8, i7)) {
                            bArr[i2] = (byte) m172284i(i7, i8, iM162113j, iM162116m);
                            i2++;
                        }
                        int i9 = i7 + 2;
                        int i10 = i8 - 2;
                        if (i9 >= iM162113j || i10 < 0) {
                            break;
                        }
                        i7 = i9;
                        i8 = i10;
                    }
                    i3 = i7 + 5;
                    i = i8 - 1;
                }
            }
            if (i3 >= iM162113j && i >= iM162116m) {
                break;
            }
        }
        if (i2 == this.f151998c.m133896g()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX INFO: renamed from: d */
    public final int m172279d(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m172283h(i3, 0, i, i2) ? 1 : 0) << 1;
        if (m172283h(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m172283h(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m172283h(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (m172283h(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (m172283h(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (m172283h(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        return m172283h(3, i8, i, i2) ? i11 | 1 : i11;
    }

    /* JADX INFO: renamed from: e */
    public final int m172280e(int i, int i2) {
        int i3 = (m172283h(i + (-3), 0, i, i2) ? 1 : 0) << 1;
        if (m172283h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m172283h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m172283h(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m172283h(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (m172283h(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (m172283h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        return m172283h(1, i9, i, i2) ? i10 | 1 : i10;
    }

    /* JADX INFO: renamed from: f */
    public final int m172281f(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m172283h(i3, 0, i, i2) ? 1 : 0) << 1;
        int i5 = i2 - 1;
        if (m172283h(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (m172283h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (m172283h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (m172283h(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (m172283h(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m172283h(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        return m172283h(1, i5, i, i2) ? i13 | 1 : i13;
    }

    /* JADX INFO: renamed from: g */
    public final int m172282g(int i, int i2) {
        int i3 = (m172283h(i + (-3), 0, i, i2) ? 1 : 0) << 1;
        if (m172283h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m172283h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m172283h(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (m172283h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (m172283h(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (m172283h(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        return m172283h(3, i7, i, i2) ? i10 | 1 : i10;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m172283h(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.f151997b.m162118o(i2, i);
        return this.f151996a.m162110d(i2, i);
    }

    /* JADX INFO: renamed from: i */
    public final int m172284i(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (m172283h(i5, i6, i3, i4) ? 1 : 0) << 1;
        int i8 = i2 - 1;
        if (m172283h(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (m172283h(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (m172283h(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m172283h(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (m172283h(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (m172283h(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return m172283h(i, i2, i3, i4) ? i15 | 1 : i15;
    }
}
