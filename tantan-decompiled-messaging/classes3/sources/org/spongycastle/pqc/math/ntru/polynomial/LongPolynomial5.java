package org.spongycastle.pqc.math.ntru.polynomial;

import java.lang.reflect.Array;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class LongPolynomial5 {
    private long[] coeffs;
    private int numCoeffs;

    public LongPolynomial5(IntegerPolynomial integerPolynomial) {
        int length = integerPolynomial.coeffs.length;
        this.numCoeffs = length;
        this.coeffs = new long[(length + 4) / 5];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.numCoeffs; i3++) {
            long[] jArr = this.coeffs;
            jArr[i] = jArr[i] | (((long) integerPolynomial.coeffs[i3]) << i2);
            i2 += 12;
            if (i2 >= 60) {
                i++;
                i2 = 0;
            }
        }
    }

    public LongPolynomial5 mult(TernaryPolynomial ternaryPolynomial) {
        long j;
        int i;
        long[][] jArr = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 5, (this.coeffs.length + ((ternaryPolynomial.size() + 4) / 5)) - 1);
        int[] ones = ternaryPolynomial.getOnes();
        for (int i2 = 0; i2 != ones.length; i2++) {
            int i3 = ones[i2];
            int i4 = i3 / 5;
            int i5 = i3 - (i4 * 5);
            int i6 = 0;
            while (true) {
                long[] jArr2 = this.coeffs;
                if (i6 < jArr2.length) {
                    long[] jArr3 = jArr[i5];
                    jArr3[i4] = (jArr3[i4] + jArr2[i6]) & 576319980446939135L;
                    i4++;
                    i6++;
                }
            }
        }
        int[] negOnes = ternaryPolynomial.getNegOnes();
        for (int i7 = 0; i7 != negOnes.length; i7++) {
            int i8 = negOnes[i7];
            int i9 = i8 / 5;
            int i10 = i8 - (i9 * 5);
            int i11 = 0;
            while (true) {
                long[] jArr4 = this.coeffs;
                if (i11 < jArr4.length) {
                    long[] jArr5 = jArr[i10];
                    jArr5[i9] = ((jArr5[i9] + 576601524159907840L) - jArr4[i11]) & 576319980446939135L;
                    i9++;
                    i11++;
                }
            }
        }
        long[] jArr6 = jArr[0];
        long[] jArrCopyOf = Arrays.copyOf(jArr6, jArr6.length + 1);
        for (int i12 = 1; i12 <= 4; i12++) {
            int i13 = i12 * 12;
            int i14 = 60 - i13;
            long j2 = (1 << i14) - 1;
            int length = jArr[i12].length;
            int i15 = 0;
            while (i15 < length) {
                long j3 = jArr[i12][i15];
                jArrCopyOf[i15] = (jArrCopyOf[i15] + ((j3 & j2) << i13)) & 576319980446939135L;
                i15++;
                jArrCopyOf[i15] = (jArrCopyOf[i15] + (j3 >> i14)) & 576319980446939135L;
            }
        }
        int i16 = (this.numCoeffs % 5) * 12;
        for (int length2 = this.coeffs.length - 1; length2 < jArrCopyOf.length; length2++) {
            long[] jArr7 = this.coeffs;
            if (length2 == jArr7.length - 1) {
                j = this.numCoeffs == 5 ? 0L : jArrCopyOf[length2] >> i16;
                i = 0;
            } else {
                j = jArrCopyOf[length2];
                i = (length2 * 5) - this.numCoeffs;
            }
            int i17 = i / 5;
            int i18 = i - (i17 * 5);
            long j4 = j << (i18 * 12);
            long j5 = j >> ((5 - i18) * 12);
            jArrCopyOf[i17] = (jArrCopyOf[i17] + j4) & 576319980446939135L;
            int i19 = i17 + 1;
            if (i19 < jArr7.length) {
                jArrCopyOf[i19] = (jArrCopyOf[i19] + j5) & 576319980446939135L;
            }
        }
        return new LongPolynomial5(jArrCopyOf, this.numCoeffs);
    }

    public IntegerPolynomial toIntegerPolynomial() {
        int[] iArr = new int[this.numCoeffs];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.numCoeffs; i3++) {
            iArr[i3] = (int) ((this.coeffs[i] >> i2) & 2047);
            i2 += 12;
            if (i2 >= 60) {
                i++;
                i2 = 0;
            }
        }
        return new IntegerPolynomial(iArr);
    }

    private LongPolynomial5(long[] jArr, int i) {
        this.coeffs = jArr;
        this.numCoeffs = i;
    }
}
