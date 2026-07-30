package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class sac0 {
    /* JADX INFO: renamed from: a */
    public static int m182907a(int i, int i2) {
        int i3 = i - i2;
        if (i3 <= i2) {
            i3 = i2;
            i2 = i3;
        }
        int i4 = 1;
        int i5 = 1;
        while (i > i3) {
            i4 *= i;
            if (i5 <= i2) {
                i4 /= i5;
                i5++;
            }
            i--;
        }
        while (i5 <= i2) {
            i4 /= i5;
            i5++;
        }
        return i4;
    }

    /* JADX INFO: renamed from: b */
    public static int m182908b(int[] iArr, int i, boolean z) {
        boolean z2;
        int[] iArr2 = iArr;
        int i2 = 0;
        for (int i3 : iArr2) {
            i2 += i3;
        }
        int length = iArr2.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = length - 1;
            if (i4 >= i7) {
                return i5;
            }
            int i8 = 1 << i4;
            i6 |= i8;
            int i9 = 1;
            while (i9 < iArr2[i4]) {
                int i10 = i2 - i9;
                int i11 = length - i4;
                int i12 = i11 - 2;
                int iM182907a = m182907a(i10 - 1, i12);
                if (z && i6 == 0) {
                    int i13 = i11 - 1;
                    if (i10 - i13 >= i13) {
                        iM182907a -= m182907a(i10 - i11, i12);
                    }
                }
                boolean z3 = true;
                if (i11 - 1 > 1) {
                    int i14 = i10 - i12;
                    int iM182907a2 = 0;
                    while (i14 > i) {
                        iM182907a2 += m182907a((i10 - i14) - 1, i11 - 3);
                        i14--;
                        z3 = z3;
                    }
                    z2 = z3;
                    iM182907a -= iM182907a2 * (i7 - i4);
                } else {
                    z2 = true;
                    if (i10 > i) {
                        iM182907a--;
                    }
                }
                i5 += iM182907a;
                i9++;
                i6 &= ~i8;
                iArr2 = iArr;
            }
            i2 -= i9;
            i4++;
            iArr2 = iArr;
        }
    }
}
