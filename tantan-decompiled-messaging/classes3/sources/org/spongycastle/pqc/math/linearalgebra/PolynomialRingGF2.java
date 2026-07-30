package org.spongycastle.pqc.math.linearalgebra;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class PolynomialRingGF2 {
    private PolynomialRingGF2() {
    }

    public static int add(int i, int i2) {
        return i ^ i2;
    }

    public static int degree(long j) {
        int i = 0;
        while (j != 0) {
            i++;
            j >>>= 1;
        }
        return i - 1;
    }

    public static int gcd(int i, int i2) {
        while (true) {
            int i3 = i2;
            int i4 = i;
            i = i3;
            if (i == 0) {
                return i4;
            }
            i2 = remainder(i4, i);
        }
    }

    public static int getIrreduciblePolynomial(int i) {
        if (i < 0) {
            System.err.println("The Degree is negative");
            return 0;
        }
        if (i > 31) {
            System.err.println("The Degree is more then 31");
            return 0;
        }
        if (i == 0) {
            return 1;
        }
        int i2 = 1 << (i + 1);
        for (int i3 = (1 << i) + 1; i3 < i2; i3 += 2) {
            if (isIrreducible(i3)) {
                return i3;
            }
        }
        return 0;
    }

    public static boolean isIrreducible(int i) {
        if (i == 0) {
            return false;
        }
        int iDegree = degree(i) >>> 1;
        int iModMultiply = 2;
        for (int i2 = 0; i2 < iDegree; i2++) {
            iModMultiply = modMultiply(iModMultiply, iModMultiply, i);
            if (gcd(iModMultiply ^ 2, i) != 1) {
                return false;
            }
        }
        return true;
    }

    public static int modMultiply(int i, int i2, int i3) {
        int iRemainder = remainder(i, i3);
        int iRemainder2 = remainder(i2, i3);
        int i4 = 0;
        if (iRemainder2 != 0) {
            int iDegree = 1 << degree(i3);
            while (iRemainder != 0) {
                if (((byte) (iRemainder & 1)) == 1) {
                    i4 ^= iRemainder2;
                }
                iRemainder >>>= 1;
                iRemainder2 <<= 1;
                if (iRemainder2 >= iDegree) {
                    iRemainder2 ^= i3;
                }
            }
        }
        return i4;
    }

    public static long multiply(int i, int i2) {
        long j = 0;
        if (i2 != 0) {
            long j2 = ((long) i2) & 4294967295L;
            while (i != 0) {
                if (((byte) (i & 1)) == 1) {
                    j ^= j2;
                }
                i >>>= 1;
                j2 <<= 1;
            }
        }
        return j;
    }

    public static int remainder(int i, int i2) {
        if (i2 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (degree(i) >= degree(i2)) {
            i ^= i2 << (degree(i) - degree(i2));
        }
        return i;
    }

    public static int rest(long j, int i) {
        if (i == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        long j2 = ((long) i) & 4294967295L;
        while ((j >>> 32) != 0) {
            j ^= j2 << (degree(j) - degree(j2));
        }
        int iDegree = (int) j;
        while (degree(iDegree) >= degree(i)) {
            iDegree ^= i << (degree(iDegree) - degree(i));
        }
        return iDegree;
    }

    public static int degree(int i) {
        int i2 = -1;
        while (i != 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }
}
