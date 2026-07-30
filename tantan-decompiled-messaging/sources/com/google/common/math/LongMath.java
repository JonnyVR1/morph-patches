package com.google.common.math;

import com.google.android.gms.common.api.Api;
import com.google.common.primitives.UnsignedLongs;
import java.math.RoundingMode;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.hex;
import p149l.sf80;
import p149l.shg0;

/* JADX INFO: loaded from: classes7.dex */
public final class LongMath {

    /* JADX INFO: renamed from: a */
    public static final byte[] f11259a = {19, 18, 18, 18, 18, 17, 17, 17, Tnaf.POW_2_WIDTH, Tnaf.POW_2_WIDTH, Tnaf.POW_2_WIDTH, 15, 15, 15, 15, 14, 14, 14, HttpTokens.CARRIAGE_RETURN, HttpTokens.CARRIAGE_RETURN, HttpTokens.CARRIAGE_RETURN, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};

    /* JADX INFO: renamed from: b */
    public static final long[] f11260b = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    /* JADX INFO: renamed from: c */
    public static final long[] f11261c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};

    /* JADX INFO: renamed from: d */
    public static final long[] f11262d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};

    /* JADX INFO: renamed from: e */
    public static final int[] f11263e = {Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};

    /* JADX INFO: renamed from: f */
    public static final int[] f11264f = {Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, 214, 169, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};

    /* JADX INFO: renamed from: g */
    public static final long[][] f11265g = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    /* JADX INFO: renamed from: com.google.common.math.LongMath$a */
    public static /* synthetic */ class C3011a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11266a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f11266a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11266a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11266a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11266a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11266a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11266a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11266a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11266a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m16367a(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        hex.m130713c(iNumberOfLeadingZeros >= 64, "checkedMultiply", j, j2);
        hex.m130713c((j >= 0) | (j2 != Long.MIN_VALUE), "checkedMultiply", j, j2);
        long j3 = j * j2;
        hex.m130713c(j == 0 || j3 / j == j2, "checkedMultiply", j, j2);
        return j3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: b */
    public static long m16368b(long j, long j2, RoundingMode roundingMode) {
        sf80.m183894p(roundingMode);
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (C3011a.f11266a[roundingMode.ordinal()]) {
            case 1:
                hex.m130715e(j4 == 0);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            case 4:
                return j3 + ((long) i);
            case 5:
                if (i <= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            default:
                shg0.m184191a();
                return 0L;
        }
    }

    public enum MillerRabinTester {
        SMALL { // from class: com.google.common.math.LongMath.MillerRabinTester.1
            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long mulMod(long j, long j2, long j3) {
                return (j * j2) % j3;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long squareMod(long j, long j2) {
                return (j * j) % j2;
            }
        },
        LARGE { // from class: com.google.common.math.LongMath.MillerRabinTester.2
            private long plusMod(long j, long j2, long j3) {
                long j4 = j + j2;
                return j >= j3 - j2 ? j4 - j3 : j4;
            }

            private long times2ToThe32Mod(long j, long j2) {
                int i = 32;
                do {
                    int iMin = Math.min(i, Long.numberOfLeadingZeros(j));
                    j = UnsignedLongs.m16499e(j << iMin, j2);
                    i -= iMin;
                } while (i > 0);
                return j;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long mulMod(long j, long j2, long j3) {
                long j4 = j >>> 32;
                long j5 = j2 >>> 32;
                long j6 = j & 4294967295L;
                long j7 = j2 & 4294967295L;
                long jTimes2ToThe32Mod = times2ToThe32Mod(j4 * j5, j3) + (j4 * j7);
                if (jTimes2ToThe32Mod < 0) {
                    jTimes2ToThe32Mod = UnsignedLongs.m16499e(jTimes2ToThe32Mod, j3);
                }
                return plusMod(times2ToThe32Mod(jTimes2ToThe32Mod + (j5 * j6), j3), UnsignedLongs.m16499e(j6 * j7, j3), j3);
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long squareMod(long j, long j2) {
                long j3 = j >>> 32;
                long j4 = j & 4294967295L;
                long jTimes2ToThe32Mod = times2ToThe32Mod(j3 * j3, j2);
                long jM16499e = j3 * j4 * 2;
                if (jM16499e < 0) {
                    jM16499e = UnsignedLongs.m16499e(jM16499e, j2);
                }
                return plusMod(times2ToThe32Mod(jTimes2ToThe32Mod + jM16499e, j2), UnsignedLongs.m16499e(j4 * j4, j2), j2);
            }
        };

        private long powMod(long j, long j2, long j3) {
            long jSquareMod = j;
            long jMulMod = 1;
            for (long j4 = j2; j4 != 0; j4 >>= 1) {
                if ((j4 & 1) != 0) {
                    jMulMod = mulMod(jMulMod, jSquareMod, j3);
                }
                jSquareMod = squareMod(jSquareMod, j3);
            }
            return jMulMod;
        }

        public static boolean test(long j, long j2) {
            return (j2 <= 3037000499L ? SMALL : LARGE).testWitness(j, j2);
        }

        private boolean testWitness(long j, long j2) {
            long j3 = j2 - 1;
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
            long j4 = j3 >> iNumberOfTrailingZeros;
            long j5 = j % j2;
            if (j5 == 0) {
                return true;
            }
            long jPowMod = powMod(j5, j4, j2);
            if (jPowMod == 1) {
                return true;
            }
            int i = 0;
            while (jPowMod != j3) {
                i++;
                if (i == iNumberOfTrailingZeros) {
                    return false;
                }
                jPowMod = squareMod(jPowMod, j2);
            }
            return true;
        }

        public abstract long mulMod(long j, long j2, long j3);

        public abstract long squareMod(long j, long j2);

        /* synthetic */ MillerRabinTester(C3011a c3011a) {
            this();
        }
    }
}
