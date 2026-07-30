package org.spongycastle.pqc.math.ntru.polynomial;

import org.spongycastle.util.Arrays;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class LongPolynomial2 {
    private long[] coeffs;
    private int numCoeffs;

    public LongPolynomial2(IntegerPolynomial integerPolynomial) {
        long j;
        int length = integerPolynomial.coeffs.length;
        this.numCoeffs = length;
        this.coeffs = new long[(length + 1) / 2];
        int i = 0;
        int i2 = 0;
        while (i < this.numCoeffs) {
            int i3 = i + 1;
            int i4 = integerPolynomial.coeffs[i];
            while (i4 < 0) {
                i4 += 2048;
            }
            if (i3 < this.numCoeffs) {
                i += 2;
                j = integerPolynomial.coeffs[i3];
            } else {
                i = i3;
                j = 0;
            }
            while (j < 0) {
                j += 2048;
            }
            this.coeffs[i2] = ((long) i4) + (j << 24);
            i2++;
        }
    }

    private void add(LongPolynomial2 longPolynomial2) {
        long[] jArr = longPolynomial2.coeffs;
        int length = jArr.length;
        long[] jArr2 = this.coeffs;
        if (length > jArr2.length) {
            this.coeffs = Arrays.copyOf(jArr2, jArr.length);
        }
        int i = 0;
        while (true) {
            long[] jArr3 = longPolynomial2.coeffs;
            if (i >= jArr3.length) {
                return;
            }
            long[] jArr4 = this.coeffs;
            jArr4[i] = (jArr4[i] + jArr3[i]) & 34342963199L;
            i++;
        }
    }

    private LongPolynomial2 multRecursive(LongPolynomial2 longPolynomial2) {
        long[] jArr = this.coeffs;
        long[] jArr2 = longPolynomial2.coeffs;
        int length = jArr2.length;
        int i = 0;
        if (length <= 32) {
            int i2 = length * 2;
            LongPolynomial2 longPolynomial3 = new LongPolynomial2(new long[i2]);
            for (int i3 = 0; i3 < i2; i3++) {
                for (int iMax = Math.max(0, (i3 - length) + 1); iMax <= Math.min(i3, length - 1); iMax++) {
                    long j = jArr[i3 - iMax] * jArr2[iMax];
                    long[] jArr3 = longPolynomial3.coeffs;
                    jArr3[i3] = (jArr3[i3] + (j & ((j & 2047) + 34342961152L))) & 34342963199L;
                    int i4 = i3 + 1;
                    jArr3[i4] = (jArr3[i4] + ((j >>> 48) & 2047)) & 34342963199L;
                }
            }
            return longPolynomial3;
        }
        int i5 = length / 2;
        LongPolynomial2 longPolynomial4 = new LongPolynomial2(Arrays.copyOf(jArr, i5));
        LongPolynomial2 longPolynomial5 = new LongPolynomial2(Arrays.copyOfRange(jArr, i5, length));
        LongPolynomial2 longPolynomial6 = new LongPolynomial2(Arrays.copyOf(jArr2, i5));
        LongPolynomial2 longPolynomial7 = new LongPolynomial2(Arrays.copyOfRange(jArr2, i5, length));
        LongPolynomial2 longPolynomial8 = (LongPolynomial2) longPolynomial4.clone();
        longPolynomial8.add(longPolynomial5);
        LongPolynomial2 longPolynomial9 = (LongPolynomial2) longPolynomial6.clone();
        longPolynomial9.add(longPolynomial7);
        LongPolynomial2 longPolynomial2MultRecursive = longPolynomial4.multRecursive(longPolynomial6);
        LongPolynomial2 longPolynomial2MultRecursive2 = longPolynomial5.multRecursive(longPolynomial7);
        LongPolynomial2 longPolynomial2MultRecursive3 = longPolynomial8.multRecursive(longPolynomial9);
        longPolynomial2MultRecursive3.sub(longPolynomial2MultRecursive);
        longPolynomial2MultRecursive3.sub(longPolynomial2MultRecursive2);
        LongPolynomial2 longPolynomial10 = new LongPolynomial2(length * 2);
        int i6 = 0;
        while (true) {
            long[] jArr4 = longPolynomial2MultRecursive.coeffs;
            if (i6 >= jArr4.length) {
                break;
            }
            longPolynomial10.coeffs[i6] = jArr4[i6] & 34342963199L;
            i6++;
        }
        int i7 = 0;
        while (true) {
            long[] jArr5 = longPolynomial2MultRecursive3.coeffs;
            if (i7 >= jArr5.length) {
                break;
            }
            long[] jArr6 = longPolynomial10.coeffs;
            int i8 = i5 + i7;
            jArr6[i8] = (jArr6[i8] + jArr5[i7]) & 34342963199L;
            i7++;
        }
        while (true) {
            long[] jArr7 = longPolynomial2MultRecursive2.coeffs;
            if (i >= jArr7.length) {
                return longPolynomial10;
            }
            long[] jArr8 = longPolynomial10.coeffs;
            int i9 = (i5 * 2) + i;
            jArr8[i9] = (jArr8[i9] + jArr7[i]) & 34342963199L;
            i++;
        }
    }

    private void sub(LongPolynomial2 longPolynomial2) {
        long[] jArr = longPolynomial2.coeffs;
        int length = jArr.length;
        long[] jArr2 = this.coeffs;
        if (length > jArr2.length) {
            this.coeffs = Arrays.copyOf(jArr2, jArr.length);
        }
        int i = 0;
        while (true) {
            long[] jArr3 = longPolynomial2.coeffs;
            if (i >= jArr3.length) {
                return;
            }
            long[] jArr4 = this.coeffs;
            jArr4[i] = 34342963199L & ((jArr4[i] + 140737496743936L) - jArr3[i]);
            i++;
        }
    }

    public Object clone() {
        LongPolynomial2 longPolynomial2 = new LongPolynomial2((long[]) this.coeffs.clone());
        longPolynomial2.numCoeffs = this.numCoeffs;
        return longPolynomial2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LongPolynomial2) {
            return Arrays.areEqual(this.coeffs, ((LongPolynomial2) obj).coeffs);
        }
        return false;
    }

    public LongPolynomial2 mult(LongPolynomial2 longPolynomial2) {
        long[] jArr;
        long[] jArr2;
        int length = this.coeffs.length;
        if (longPolynomial2.coeffs.length != length || this.numCoeffs != longPolynomial2.numCoeffs) {
            wg3.m206174a("Number of coefficients must be the same");
            return null;
        }
        LongPolynomial2 longPolynomial2MultRecursive = multRecursive(longPolynomial2);
        if (longPolynomial2MultRecursive.coeffs.length > length) {
            if (this.numCoeffs % 2 == 0) {
                int i = length;
                while (true) {
                    jArr2 = longPolynomial2MultRecursive.coeffs;
                    if (i >= jArr2.length) {
                        break;
                    }
                    int i2 = i - length;
                    jArr2[i2] = (jArr2[i2] + jArr2[i]) & 34342963199L;
                    i++;
                }
                longPolynomial2MultRecursive.coeffs = Arrays.copyOf(jArr2, length);
            } else {
                int i3 = length;
                while (true) {
                    jArr = longPolynomial2MultRecursive.coeffs;
                    if (i3 >= jArr.length) {
                        break;
                    }
                    int i4 = i3 - length;
                    long j = jArr[i4] + (jArr[i3 - 1] >> 24);
                    jArr[i4] = j;
                    long j2 = j + ((2047 & jArr[i3]) << 24);
                    jArr[i4] = j2;
                    jArr[i4] = j2 & 34342963199L;
                    i3++;
                }
                long[] jArrCopyOf = Arrays.copyOf(jArr, length);
                longPolynomial2MultRecursive.coeffs = jArrCopyOf;
                int length2 = jArrCopyOf.length - 1;
                jArrCopyOf[length2] = jArrCopyOf[length2] & 2047;
            }
        }
        LongPolynomial2 longPolynomial3 = new LongPolynomial2(longPolynomial2MultRecursive.coeffs);
        longPolynomial3.numCoeffs = this.numCoeffs;
        return longPolynomial3;
    }

    public void mult2And(int i) {
        long j = i;
        long j2 = (j << 24) + j;
        int i2 = 0;
        while (true) {
            long[] jArr = this.coeffs;
            if (i2 >= jArr.length) {
                return;
            }
            jArr[i2] = (jArr[i2] << 1) & j2;
            i2++;
        }
    }

    public void subAnd(LongPolynomial2 longPolynomial2, int i) {
        long j = i;
        long j2 = (j << 24) + j;
        int i2 = 0;
        while (true) {
            long[] jArr = longPolynomial2.coeffs;
            if (i2 >= jArr.length) {
                return;
            }
            long[] jArr2 = this.coeffs;
            jArr2[i2] = ((jArr2[i2] + 140737496743936L) - jArr[i2]) & j2;
            i2++;
        }
    }

    public IntegerPolynomial toIntegerPolynomial() {
        int[] iArr = new int[this.numCoeffs];
        int i = 0;
        int i2 = 0;
        while (true) {
            long[] jArr = this.coeffs;
            if (i >= jArr.length) {
                return new IntegerPolynomial(iArr);
            }
            int i3 = i2 + 1;
            long j = jArr[i];
            iArr[i2] = (int) (j & 2047);
            if (i3 < this.numCoeffs) {
                i2 += 2;
                iArr[i3] = (int) ((j >> 24) & 2047);
            } else {
                i2 = i3;
            }
            i++;
        }
    }

    private LongPolynomial2(long[] jArr) {
        this.coeffs = jArr;
    }

    private LongPolynomial2(int i) {
        this.coeffs = new long[i];
    }
}
