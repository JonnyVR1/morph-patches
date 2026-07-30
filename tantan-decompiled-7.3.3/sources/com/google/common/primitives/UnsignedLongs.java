package com.google.common.primitives;

import java.math.BigInteger;
import java.util.Comparator;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class UnsignedLongs {

    public enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int iMin = Math.min(jArr.length, jArr2.length);
            for (int i = 0; i < iMin; i++) {
                long j = jArr[i];
                long j2 = jArr2[i];
                if (j != j2) {
                    return UnsignedLongs.m16550a(j, j2);
                }
            }
            return jArr.length - jArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }
    }

    /* JADX INFO: renamed from: com.google.common.primitives.UnsignedLongs$a */
    public static final class C3043a {

        /* JADX INFO: renamed from: a */
        public static final long[] f11318a = new long[37];

        /* JADX INFO: renamed from: b */
        public static final int[] f11319b = new int[37];

        /* JADX INFO: renamed from: c */
        public static final int[] f11320c = new int[37];

        static {
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i = 2; i <= 36; i++) {
                long j = i;
                f11318a[i] = UnsignedLongs.m16551b(-1L, j);
                f11319b[i] = (int) UnsignedLongs.m16554e(-1L, j);
                f11320c[i] = bigInteger.toString(i).length() - 1;
            }
        }

        /* JADX INFO: renamed from: a */
        public static boolean m16557a(long j, int i, int i2) {
            if (j < 0) {
                return true;
            }
            long j2 = f11318a[i2];
            if (j < j2) {
                return false;
            }
            return j > j2 || i > f11319b[i2];
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m16550a(long j, long j2) {
        return Longs.m16527c(m16552c(j), m16552c(j2));
    }

    /* JADX INFO: renamed from: b */
    public static long m16551b(long j, long j2) {
        if (j2 < 0) {
            return m16550a(j, j2) < 0 ? 0L : 1L;
        }
        if (j >= 0) {
            return j / j2;
        }
        long j3 = ((j >>> 1) / j2) << 1;
        return j3 + ((long) (m16550a(j - (j3 * j2), j2) < 0 ? 0 : 1));
    }

    /* JADX INFO: renamed from: c */
    public static long m16552c(long j) {
        return j ^ Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: d */
    public static long m16553d(String str, int i) {
        xn80.m212111p(str);
        if (str.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        if (i < 2 || i > 36) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("illegal radix: ");
            sb.append(i);
            throw new NumberFormatException(sb.toString());
        }
        int i2 = C3043a.f11320c[i] - 1;
        long j = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            int iDigit = Character.digit(str.charAt(i3), i);
            if (iDigit == -1) {
                throw new NumberFormatException(str);
            }
            if (i3 > i2 && C3043a.m16557a(j, iDigit, i)) {
                throw new NumberFormatException(str.length() != 0 ? "Too large for unsigned long: ".concat(str) : new String("Too large for unsigned long: "));
            }
            j = (j * ((long) i)) + ((long) iDigit);
        }
        return j;
    }

    /* JADX INFO: renamed from: e */
    public static long m16554e(long j, long j2) {
        if (j2 < 0) {
            return m16550a(j, j2) < 0 ? j : j - j2;
        }
        if (j >= 0) {
            return j % j2;
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if (m16550a(j3, j2) < 0) {
            j2 = 0;
        }
        return j3 - j2;
    }

    /* JADX INFO: renamed from: f */
    public static String m16555f(long j) {
        return m16556g(j, 10);
    }

    /* JADX INFO: renamed from: g */
    public static String m16556g(long j, int i) {
        xn80.m212101f(i >= 2 && i <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i);
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return Long.toString(j, i);
        }
        int i2 = 64;
        char[] cArr = new char[64];
        int i3 = i - 1;
        if ((i & i3) == 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            do {
                i2--;
                cArr[i2] = Character.forDigit(((int) j) & i3, i);
                j >>>= iNumberOfTrailingZeros;
            } while (j != 0);
        } else {
            long jM16551b = (i & 1) == 0 ? (j >>> 1) / ((long) (i >>> 1)) : m16551b(j, i);
            long j2 = i;
            int i4 = 63;
            cArr[63] = Character.forDigit((int) (j - (jM16551b * j2)), i);
            while (jM16551b > 0) {
                i4--;
                cArr[i4] = Character.forDigit((int) (jM16551b % j2), i);
                jM16551b /= j2;
            }
            i2 = i4;
        }
        return new String(cArr, i2, 64 - i2);
    }
}
