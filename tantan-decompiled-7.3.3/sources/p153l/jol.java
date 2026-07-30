package p153l;

import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes7.dex */
public final class jol extends i4k {

    /* JADX INFO: renamed from: e */
    public d13 f122036e;

    public jol(uhw uhwVar) {
        super(uhwVar);
    }

    /* JADX INFO: renamed from: i */
    public static int[][] m146470i(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = 8;
        int i6 = i4 - 8;
        int i7 = i3 - 8;
        char c = 2;
        boolean z = true;
        int i8 = 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i2, i);
        int i9 = 0;
        while (i9 < i2) {
            int i10 = i9 << 3;
            if (i10 > i6) {
                i10 = i6;
            }
            int i11 = i8;
            while (i11 < i) {
                int i12 = i11 << 3;
                if (i12 > i7) {
                    i12 = i7;
                }
                int i13 = (i10 * i3) + i12;
                char c2 = c;
                boolean z2 = z;
                int i14 = i8;
                int i15 = i14;
                int i16 = i15;
                int i17 = 255;
                while (i14 < i5) {
                    int i18 = i8;
                    int i19 = i16;
                    while (i18 < i5) {
                        int i20 = bArr[i13 + i18] & 255;
                        i15 += i20;
                        if (i20 < i17) {
                            i17 = i20;
                        }
                        if (i20 > i19) {
                            i19 = i20;
                        }
                        i18++;
                        i5 = 8;
                    }
                    if (i19 - i17 > 24) {
                        while (true) {
                            i14++;
                            i13 += i3;
                            if (i14 < 8) {
                                int i21 = 0;
                                for (int i22 = 8; i21 < i22; i22 = 8) {
                                    i15 += bArr[i13 + i21] & 255;
                                    i21++;
                                }
                            }
                        }
                    }
                    i14++;
                    i13 += i3;
                    i16 = i19;
                    i5 = 8;
                    i8 = 0;
                }
                int i23 = i15 >> 6;
                if (i16 - i17 <= 24) {
                    i23 = i17 / 2;
                    if (i9 > 0 && i11 > 0) {
                        int[] iArr2 = iArr[i9 - 1];
                        int i24 = i11 - 1;
                        int i25 = ((iArr2[i11] + (iArr[i9][i24] * 2)) + iArr2[i24]) / 4;
                        if (i17 < i25) {
                            i23 = i25;
                        }
                    }
                }
                iArr[i9][i11] = i23;
                i11++;
                c = c2;
                z = z2;
                i5 = 8;
                i8 = 0;
            }
            i9++;
            i5 = 8;
            i8 = 0;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: j */
    public static void m146471j(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, d13 d13Var) {
        int i5 = i4 - 8;
        int i6 = i3 - 8;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = i7 << 3;
            int i9 = i8 > i5 ? i5 : i8;
            int iM146472k = m146472k(i7, 2, i2 - 3);
            for (int i10 = 0; i10 < i; i10++) {
                int i11 = i10 << 3;
                int i12 = i11 > i6 ? i6 : i11;
                int iM146472k2 = m146472k(i10, 2, i - 3);
                int i13 = 0;
                for (int i14 = -2; i14 <= 2; i14++) {
                    int[] iArr2 = iArr[iM146472k + i14];
                    i13 += iArr2[iM146472k2 - 2] + iArr2[iM146472k2 - 1] + iArr2[iM146472k2] + iArr2[iM146472k2 + 1] + iArr2[iM146472k2 + 2];
                }
                m146473l(bArr, i12, i9, i13 / 25, i3, d13Var);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m146472k(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: l */
    public static void m146473l(byte[] bArr, int i, int i2, int i3, int i4, d13 d13Var) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    d13Var.m113488o(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    @Override // p153l.by2
    /* JADX INFO: renamed from: a */
    public by2 mo106955a(uhw uhwVar) {
        return new jol(uhwVar);
    }

    @Override // p153l.i4k, p153l.by2
    /* JADX INFO: renamed from: b */
    public d13 mo106956b() throws NotFoundException {
        d13 d13Var = this.f122036e;
        if (d13Var != null) {
            return d13Var;
        }
        uhw uhwVarM106959e = m106959e();
        int iM196129d = uhwVarM106959e.m196129d();
        int iM196126a = uhwVarM106959e.m196126a();
        if (iM196129d < 40 || iM196126a < 40) {
            this.f122036e = super.mo106956b();
        } else {
            byte[] bArrMo196127b = uhwVarM106959e.mo196127b();
            int i = iM196129d >> 3;
            if ((iM196129d & 7) != 0) {
                i++;
            }
            int i2 = i;
            int i3 = iM196126a >> 3;
            if ((iM196126a & 7) != 0) {
                i3++;
            }
            int i4 = i3;
            int[][] iArrM146470i = m146470i(bArrMo196127b, i2, i4, iM196129d, iM196126a);
            d13 d13Var2 = new d13(iM196129d, iM196126a);
            m146471j(bArrMo196127b, i2, i4, iM196129d, iM196126a, iArrM146470i, d13Var2);
            this.f122036e = d13Var2;
        }
        return this.f122036e;
    }
}
