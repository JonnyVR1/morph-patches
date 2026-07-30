package org.spongycastle.math;

import com.alibaba.fastjson.asm.Opcodes;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.BigIntegers;
import p153l.v1d0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Primes {
    public static final int SMALL_FACTOR_LIMIT = 211;
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private static final BigInteger THREE = BigInteger.valueOf(3);

    public static class MROutput {
        private BigInteger factor;
        private boolean provablyComposite;

        private MROutput(boolean z, BigInteger bigInteger) {
            this.provablyComposite = z;
            this.factor = bigInteger;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static MROutput probablyPrime() {
            return new MROutput(false, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static MROutput provablyCompositeNotPrimePower() {
            return new MROutput(true, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static MROutput provablyCompositeWithFactor(BigInteger bigInteger) {
            return new MROutput(true, bigInteger);
        }

        public BigInteger getFactor() {
            return this.factor;
        }

        public boolean isNotPrimePower() {
            return this.provablyComposite && this.factor == null;
        }

        public boolean isProvablyComposite() {
            return this.provablyComposite;
        }
    }

    public static class STOutput {
        private BigInteger prime;
        private int primeGenCounter;
        private byte[] primeSeed;

        private STOutput(BigInteger bigInteger, byte[] bArr, int i) {
            this.prime = bigInteger;
            this.primeSeed = bArr;
            this.primeGenCounter = i;
        }

        public BigInteger getPrime() {
            return this.prime;
        }

        public int getPrimeGenCounter() {
            return this.primeGenCounter;
        }

        public byte[] getPrimeSeed() {
            return this.primeSeed;
        }
    }

    private static void checkCandidate(BigInteger bigInteger, String str) {
        if (bigInteger == null || bigInteger.signum() < 1 || bigInteger.bitLength() < 2) {
            v1d0.m199002a("'", str, "' must be non-null and >= 2");
        }
    }

    public static MROutput enhancedMRProbablePrimeTest(BigInteger bigInteger, SecureRandom secureRandom, int i) {
        boolean z;
        BigInteger bigIntegerModPow;
        checkCandidate(bigInteger, "candidate");
        if (secureRandom == null) {
            wg3.m206174a("'random' cannot be null");
            return null;
        }
        if (i < 1) {
            wg3.m206174a("'iterations' must be > 0");
            return null;
        }
        if (bigInteger.bitLength() == 2) {
            return MROutput.probablyPrime();
        }
        if (!bigInteger.testBit(0)) {
            return MROutput.provablyCompositeWithFactor(TWO);
        }
        BigInteger bigIntegerSubtract = bigInteger.subtract(ONE);
        BigInteger bigIntegerSubtract2 = bigInteger.subtract(TWO);
        int lowestSetBit = bigIntegerSubtract.getLowestSetBit();
        BigInteger bigIntegerShiftRight = bigIntegerSubtract.shiftRight(lowestSetBit);
        for (int i2 = 0; i2 < i; i2++) {
            BigInteger bigIntegerCreateRandomInRange = BigIntegers.createRandomInRange(TWO, bigIntegerSubtract2, secureRandom);
            BigInteger bigIntegerGcd = bigIntegerCreateRandomInRange.gcd(bigInteger);
            BigInteger bigInteger2 = ONE;
            if (bigIntegerGcd.compareTo(bigInteger2) > 0) {
                return MROutput.provablyCompositeWithFactor(bigIntegerGcd);
            }
            BigInteger bigIntegerModPow2 = bigIntegerCreateRandomInRange.modPow(bigIntegerShiftRight, bigInteger);
            if (!bigIntegerModPow2.equals(bigInteger2) && !bigIntegerModPow2.equals(bigIntegerSubtract)) {
                int i3 = 1;
                while (true) {
                    if (i3 >= lowestSetBit) {
                        z = false;
                        bigIntegerModPow = bigIntegerModPow2;
                        break;
                    }
                    bigIntegerModPow = bigIntegerModPow2.modPow(TWO, bigInteger);
                    if (bigIntegerModPow.equals(bigIntegerSubtract)) {
                        z = true;
                        break;
                    }
                    if (bigIntegerModPow.equals(ONE)) {
                        z = false;
                        break;
                    }
                    i3++;
                    bigIntegerModPow2 = bigIntegerModPow;
                }
                if (!z) {
                    BigInteger bigInteger3 = ONE;
                    if (!bigIntegerModPow.equals(bigInteger3)) {
                        bigIntegerModPow2 = bigIntegerModPow.modPow(TWO, bigInteger);
                        if (bigIntegerModPow2.equals(bigInteger3)) {
                            bigIntegerModPow2 = bigIntegerModPow;
                        }
                    }
                    BigInteger bigIntegerGcd2 = bigIntegerModPow2.subtract(bigInteger3).gcd(bigInteger);
                    return bigIntegerGcd2.compareTo(bigInteger3) > 0 ? MROutput.provablyCompositeWithFactor(bigIntegerGcd2) : MROutput.provablyCompositeNotPrimePower();
                }
            }
        }
        return MROutput.probablyPrime();
    }

    private static int extract32(byte[] bArr) {
        int iMin = Math.min(4, bArr.length);
        int i = 0;
        int i2 = 0;
        while (i < iMin) {
            int i3 = i + 1;
            i2 |= (bArr[bArr.length - i3] & 255) << (i * 8);
            i = i3;
        }
        return i2;
    }

    public static STOutput generateSTRandomPrime(Digest digest, int i, byte[] bArr) {
        if (digest == null) {
            wg3.m206174a("'hash' cannot be null");
            return null;
        }
        if (i < 2) {
            wg3.m206174a("'length' must be >= 2");
            return null;
        }
        if (bArr != null && bArr.length != 0) {
            return implSTRandomPrime(digest, i, Arrays.clone(bArr));
        }
        wg3.m206174a("'inputSeed' cannot be null or empty");
        return null;
    }

    public static boolean hasAnySmallFactors(BigInteger bigInteger) {
        checkCandidate(bigInteger, "candidate");
        return implHasAnySmallFactors(bigInteger);
    }

    private static void hash(Digest digest, byte[] bArr, byte[] bArr2, int i) {
        digest.update(bArr, 0, bArr.length);
        digest.doFinal(bArr2, i);
    }

    private static BigInteger hashGen(Digest digest, byte[] bArr, int i) {
        int digestSize = digest.getDigestSize();
        int i2 = i * digestSize;
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i; i3++) {
            i2 -= digestSize;
            hash(digest, bArr, bArr2, i2);
            inc(bArr, 1);
        }
        return new BigInteger(1, bArr2);
    }

    private static boolean implHasAnySmallFactors(BigInteger bigInteger) {
        int iIntValue = bigInteger.mod(BigInteger.valueOf(223092870L)).intValue();
        if (iIntValue % 2 != 0 && iIntValue % 3 != 0 && iIntValue % 5 != 0 && iIntValue % 7 != 0 && iIntValue % 11 != 0 && iIntValue % 13 != 0 && iIntValue % 17 != 0 && iIntValue % 19 != 0 && iIntValue % 23 != 0) {
            int iIntValue2 = bigInteger.mod(BigInteger.valueOf(58642669L)).intValue();
            if (iIntValue2 % 29 != 0 && iIntValue2 % 31 != 0 && iIntValue2 % 37 != 0 && iIntValue2 % 41 != 0 && iIntValue2 % 43 != 0) {
                int iIntValue3 = bigInteger.mod(BigInteger.valueOf(600662303L)).intValue();
                if (iIntValue3 % 47 != 0 && iIntValue3 % 53 != 0 && iIntValue3 % 59 != 0 && iIntValue3 % 61 != 0 && iIntValue3 % 67 != 0) {
                    int iIntValue4 = bigInteger.mod(BigInteger.valueOf(33984931L)).intValue();
                    if (iIntValue4 % 71 != 0 && iIntValue4 % 73 != 0 && iIntValue4 % 79 != 0 && iIntValue4 % 83 != 0) {
                        int iIntValue5 = bigInteger.mod(BigInteger.valueOf(89809099L)).intValue();
                        if (iIntValue5 % 89 != 0 && iIntValue5 % 97 != 0 && iIntValue5 % 101 != 0 && iIntValue5 % 103 != 0) {
                            int iIntValue6 = bigInteger.mod(BigInteger.valueOf(167375713L)).intValue();
                            if (iIntValue6 % 107 != 0 && iIntValue6 % 109 != 0 && iIntValue6 % 113 != 0 && iIntValue6 % 127 != 0) {
                                int iIntValue7 = bigInteger.mod(BigInteger.valueOf(371700317L)).intValue();
                                if (iIntValue7 % 131 != 0 && iIntValue7 % CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA != 0 && iIntValue7 % CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA != 0 && iIntValue7 % 149 != 0) {
                                    int iIntValue8 = bigInteger.mod(BigInteger.valueOf(645328247L)).intValue();
                                    if (iIntValue8 % 151 != 0 && iIntValue8 % 157 != 0 && iIntValue8 % 163 != 0 && iIntValue8 % 167 != 0) {
                                        int iIntValue9 = bigInteger.mod(BigInteger.valueOf(1070560157L)).intValue();
                                        if (iIntValue9 % CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 != 0 && iIntValue9 % CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 != 0 && iIntValue9 % 181 != 0 && iIntValue9 % CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256 != 0) {
                                            int iIntValue10 = bigInteger.mod(BigInteger.valueOf(1596463769L)).intValue();
                                            if (iIntValue10 % 193 != 0 && iIntValue10 % CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256 != 0 && iIntValue10 % Opcodes.IFNONNULL != 0 && iIntValue10 % SMALL_FACTOR_LIMIT != 0) {
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private static boolean implMRProbablePrimeToBase(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, BigInteger bigInteger4) {
        BigInteger bigIntegerModPow = bigInteger4.modPow(bigInteger3, bigInteger);
        if (bigIntegerModPow.equals(ONE) || bigIntegerModPow.equals(bigInteger2)) {
            return true;
        }
        for (int i2 = 1; i2 < i; i2++) {
            bigIntegerModPow = bigIntegerModPow.modPow(TWO, bigInteger);
            if (bigIntegerModPow.equals(bigInteger2)) {
                return true;
            }
            if (bigIntegerModPow.equals(ONE)) {
                return false;
            }
        }
        return false;
    }

    private static STOutput implSTRandomPrime(Digest digest, int i, byte[] bArr) {
        int digestSize = digest.getDigestSize();
        int i2 = 1;
        if (i < 33) {
            byte[] bArr2 = new byte[digestSize];
            byte[] bArr3 = new byte[digestSize];
            int i3 = 0;
            do {
                hash(digest, bArr, bArr2, 0);
                inc(bArr, 1);
                hash(digest, bArr, bArr3, 0);
                inc(bArr, 1);
                i3++;
                long jExtract32 = ((long) (((extract32(bArr2) ^ extract32(bArr3)) & ((-1) >>> (32 - i))) | (1 << (i - 1)) | 1)) & 4294967295L;
                if (isPrime32(jExtract32)) {
                    return new STOutput(BigInteger.valueOf(jExtract32), bArr, i3);
                }
            } while (i3 <= i * 4);
            wtq0.m207906a("Too many iterations in Shawe-Taylor Random_Prime Routine");
            return null;
        }
        STOutput sTOutputImplSTRandomPrime = implSTRandomPrime(digest, (i + 3) / 2, bArr);
        BigInteger prime = sTOutputImplSTRandomPrime.getPrime();
        byte[] primeSeed = sTOutputImplSTRandomPrime.getPrimeSeed();
        int primeGenCounter = sTOutputImplSTRandomPrime.getPrimeGenCounter();
        int i4 = i - 1;
        int i5 = (i4 / (digestSize * 8)) + 1;
        BigInteger bigIntegerHashGen = hashGen(digest, primeSeed, i5);
        BigInteger bigInteger = ONE;
        BigInteger bit = bigIntegerHashGen.mod(bigInteger.shiftLeft(i4)).setBit(i4);
        BigInteger bigIntegerShiftLeft = prime.shiftLeft(1);
        BigInteger bigIntegerShiftLeft2 = bit.subtract(bigInteger).divide(bigIntegerShiftLeft).add(bigInteger).shiftLeft(1);
        BigInteger bigIntegerAdd = bigIntegerShiftLeft2.multiply(prime).add(bigInteger);
        int i6 = primeGenCounter;
        int i7 = 0;
        while (true) {
            if (bigIntegerAdd.bitLength() > i) {
                BigInteger bigInteger2 = ONE;
                bigIntegerShiftLeft2 = bigInteger2.shiftLeft(i4).subtract(bigInteger2).divide(bigIntegerShiftLeft).add(bigInteger2).shiftLeft(i2);
                bigIntegerAdd = bigIntegerShiftLeft2.multiply(prime).add(bigInteger2);
            }
            i6 += i2;
            if (implHasAnySmallFactors(bigIntegerAdd)) {
                inc(primeSeed, i5);
            } else {
                BigInteger bigIntegerAdd2 = hashGen(digest, primeSeed, i5).mod(bigIntegerAdd.subtract(THREE)).add(TWO);
                BigInteger bigIntegerAdd3 = bigIntegerShiftLeft2.add(BigInteger.valueOf(i7));
                BigInteger bigIntegerModPow = bigIntegerAdd2.modPow(bigIntegerAdd3, bigIntegerAdd);
                BigInteger bigInteger3 = ONE;
                if (bigIntegerAdd.gcd(bigIntegerModPow.subtract(bigInteger3)).equals(bigInteger3) && bigIntegerModPow.modPow(prime, bigIntegerAdd).equals(bigInteger3)) {
                    return new STOutput(bigIntegerAdd, primeSeed, i6);
                }
                bigIntegerShiftLeft2 = bigIntegerAdd3;
                i7 = 0;
            }
            if (i6 >= (i * 4) + primeGenCounter) {
                wtq0.m207906a("Too many iterations in Shawe-Taylor Random_Prime Routine");
                return null;
            }
            i7 += 2;
            bigIntegerAdd = bigIntegerAdd.add(bigIntegerShiftLeft);
            i2 = 1;
        }
    }

    private static void inc(byte[] bArr, int i) {
        int length = bArr.length;
        while (i > 0) {
            length--;
            if (length < 0) {
                return;
            }
            int i2 = i + (bArr[length] & 255);
            bArr[length] = (byte) i2;
            i = i2 >>> 8;
        }
    }

    public static boolean isMRProbablePrime(BigInteger bigInteger, SecureRandom secureRandom, int i) {
        checkCandidate(bigInteger, "candidate");
        if (secureRandom == null) {
            wg3.m206174a("'random' cannot be null");
            return false;
        }
        if (i < 1) {
            wg3.m206174a("'iterations' must be > 0");
            return false;
        }
        if (bigInteger.bitLength() == 2) {
            return true;
        }
        if (!bigInteger.testBit(0)) {
            return false;
        }
        BigInteger bigIntegerSubtract = bigInteger.subtract(ONE);
        BigInteger bigIntegerSubtract2 = bigInteger.subtract(TWO);
        int lowestSetBit = bigIntegerSubtract.getLowestSetBit();
        BigInteger bigIntegerShiftRight = bigIntegerSubtract.shiftRight(lowestSetBit);
        for (int i2 = 0; i2 < i; i2++) {
            if (!implMRProbablePrimeToBase(bigInteger, bigIntegerSubtract, bigIntegerShiftRight, lowestSetBit, BigIntegers.createRandomInRange(TWO, bigIntegerSubtract2, secureRandom))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isMRProbablePrimeToBase(BigInteger bigInteger, BigInteger bigInteger2) {
        checkCandidate(bigInteger, "candidate");
        checkCandidate(bigInteger2, "base");
        BigInteger bigInteger3 = ONE;
        if (bigInteger2.compareTo(bigInteger.subtract(bigInteger3)) >= 0) {
            wg3.m206174a("'base' must be < ('candidate' - 1)");
            return false;
        }
        if (bigInteger.bitLength() == 2) {
            return true;
        }
        BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger3);
        int lowestSetBit = bigIntegerSubtract.getLowestSetBit();
        return implMRProbablePrimeToBase(bigInteger, bigIntegerSubtract, bigIntegerSubtract.shiftRight(lowestSetBit), lowestSetBit, bigInteger2);
    }

    private static boolean isPrime32(long j) {
        if ((j >>> 32) != 0) {
            wg3.m206174a("Size limit exceeded");
            return false;
        }
        if (j <= 5) {
            return j == 2 || j == 3 || j == 5;
        }
        if ((1 & j) == 0 || j % 3 == 0 || j % 5 == 0) {
            return false;
        }
        long[] jArr = {1, 7, 11, 13, 17, 19, 23, 29};
        long j2 = 0;
        int i = 1;
        while (true) {
            if (i >= 8) {
                j2 += 30;
                if (j2 * j2 >= j) {
                    return true;
                }
                i = 0;
            } else {
                if (j % (jArr[i] + j2) == 0) {
                    return j < 30;
                }
                i++;
            }
        }
    }
}
