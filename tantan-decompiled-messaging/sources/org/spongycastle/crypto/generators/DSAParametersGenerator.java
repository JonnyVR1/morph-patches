package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.params.DSAParameterGenerationParameters;
import org.spongycastle.crypto.params.DSAParameters;
import org.spongycastle.crypto.params.DSAValidationParameters;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.BigIntegers;
import org.spongycastle.util.encoders.Hex;
import p149l.ig3;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class DSAParametersGenerator {

    /* JADX INFO: renamed from: L */
    private int f206604L;

    /* JADX INFO: renamed from: N */
    private int f206605N;
    private int certainty;
    private Digest digest;
    private int iterations;
    private SecureRandom random;
    private int usageIndex;
    private boolean use186_3;
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    public DSAParametersGenerator() {
        this(new SHA1Digest());
    }

    private static BigInteger calculateGenerator_FIPS186_2(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger bigIntegerModPow;
        BigInteger bigIntegerDivide = bigInteger.subtract(ONE).divide(bigInteger2);
        BigInteger bigIntegerSubtract = bigInteger.subtract(TWO);
        do {
            bigIntegerModPow = BigIntegers.createRandomInRange(TWO, bigIntegerSubtract, secureRandom).modPow(bigIntegerDivide, bigInteger);
        } while (bigIntegerModPow.bitLength() <= 1);
        return bigIntegerModPow;
    }

    private static BigInteger calculateGenerator_FIPS186_3_Unverifiable(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        return calculateGenerator_FIPS186_2(bigInteger, bigInteger2, secureRandom);
    }

    private static BigInteger calculateGenerator_FIPS186_3_Verifiable(Digest digest, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, int i) {
        BigInteger bigIntegerDivide = bigInteger.subtract(ONE).divide(bigInteger2);
        byte[] bArrDecode = Hex.decode("6767656E");
        int length = bArr.length + bArrDecode.length;
        byte[] bArr2 = new byte[length + 3];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(bArrDecode, 0, bArr2, bArr.length, bArrDecode.length);
        bArr2[length] = (byte) i;
        byte[] bArr3 = new byte[digest.getDigestSize()];
        for (int i2 = 1; i2 < 65536; i2++) {
            inc(bArr2);
            hash(digest, bArr2, bArr3, 0);
            BigInteger bigIntegerModPow = new BigInteger(1, bArr3).modPow(bigIntegerDivide, bigInteger);
            if (bigIntegerModPow.compareTo(TWO) >= 0) {
                return bigIntegerModPow;
            }
        }
        return null;
    }

    private DSAParameters generateParameters_FIPS186_2() {
        int i = 20;
        byte[] bArr = new byte[20];
        byte[] bArr2 = new byte[20];
        byte[] bArr3 = new byte[20];
        byte[] bArr4 = new byte[20];
        int i2 = this.f206604L;
        int i3 = (i2 - 1) / 160;
        int i4 = i2 / 8;
        byte[] bArr5 = new byte[i4];
        if (!(this.digest instanceof SHA1Digest)) {
            qkq0.m175383a("can only use SHA-1 for generating FIPS 186-2 parameters");
            return null;
        }
        while (true) {
            this.random.nextBytes(bArr);
            hash(this.digest, bArr, bArr2, 0);
            System.arraycopy(bArr, 0, bArr3, 0, i);
            inc(bArr3);
            hash(this.digest, bArr3, bArr3, 0);
            for (int i5 = 0; i5 != i; i5++) {
                bArr4[i5] = (byte) (bArr2[i5] ^ bArr3[i5]);
            }
            bArr4[0] = (byte) (bArr4[0] | (-128));
            bArr4[19] = (byte) (bArr4[19] | 1);
            BigInteger bigInteger = new BigInteger(1, bArr4);
            if (isProbablePrime(bigInteger)) {
                byte[] bArrClone = Arrays.clone(bArr);
                inc(bArrClone);
                int i6 = 0;
                while (i6 < 4096) {
                    for (int i7 = 1; i7 <= i3; i7++) {
                        inc(bArrClone);
                        hash(this.digest, bArrClone, bArr5, i4 - (i7 * 20));
                    }
                    int i8 = i4 - (i3 * 20);
                    inc(bArrClone);
                    hash(this.digest, bArrClone, bArr2, 0);
                    System.arraycopy(bArr2, 20 - i8, bArr5, 0, i8);
                    bArr5[0] = (byte) (bArr5[0] | (-128));
                    BigInteger bigInteger2 = new BigInteger(1, bArr5);
                    BigInteger bigIntegerSubtract = bigInteger2.subtract(bigInteger2.mod(bigInteger.shiftLeft(1)).subtract(ONE));
                    if (bigIntegerSubtract.bitLength() == this.f206604L && isProbablePrime(bigIntegerSubtract)) {
                        return new DSAParameters(bigIntegerSubtract, bigInteger, calculateGenerator_FIPS186_2(bigIntegerSubtract, bigInteger, this.random), new DSAValidationParameters(bArr, i6));
                    }
                    i6++;
                    i = 20;
                }
            }
        }
    }

    private DSAParameters generateParameters_FIPS186_3() {
        BigInteger bit;
        int i;
        BigInteger bigIntegerSubtract;
        BigInteger bigIntegerCalculateGenerator_FIPS186_3_Verifiable;
        Digest digest = this.digest;
        int digestSize = digest.getDigestSize() * 8;
        byte[] bArr = new byte[this.f206605N / 8];
        int i2 = this.f206604L;
        int i3 = (i2 - 1) / digestSize;
        int i4 = (i2 - 1) % digestSize;
        int i5 = i2 / 8;
        byte[] bArr2 = new byte[i5];
        int digestSize2 = digest.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        loop0: while (true) {
            this.random.nextBytes(bArr);
            int i6 = 0;
            hash(digest, bArr, bArr3, 0);
            bit = new BigInteger(1, bArr3).mod(ONE.shiftLeft(this.f206605N - 1)).setBit(0).setBit(this.f206605N - 1);
            if (isProbablePrime(bit)) {
                byte[] bArrClone = Arrays.clone(bArr);
                int i7 = this.f206604L * 4;
                i = 0;
                while (i < i7) {
                    for (int i8 = 1; i8 <= i3; i8++) {
                        inc(bArrClone);
                        hash(digest, bArrClone, bArr2, i5 - (i8 * digestSize2));
                    }
                    int i9 = i5 - (i3 * digestSize2);
                    inc(bArrClone);
                    hash(digest, bArrClone, bArr3, i6);
                    System.arraycopy(bArr3, digestSize2 - i9, bArr2, i6, i9);
                    bArr2[i6] = (byte) (bArr2[i6] | (-128));
                    BigInteger bigInteger = new BigInteger(1, bArr2);
                    bigIntegerSubtract = bigInteger.subtract(bigInteger.mod(bit.shiftLeft(1)).subtract(ONE));
                    if (bigIntegerSubtract.bitLength() == this.f206604L && isProbablePrime(bigIntegerSubtract)) {
                        break loop0;
                    }
                    i++;
                    i6 = 0;
                }
            }
        }
        int i10 = this.usageIndex;
        return (i10 < 0 || (bigIntegerCalculateGenerator_FIPS186_3_Verifiable = calculateGenerator_FIPS186_3_Verifiable(digest, bigIntegerSubtract, bit, bArr, i10)) == null) ? new DSAParameters(bigIntegerSubtract, bit, calculateGenerator_FIPS186_3_Unverifiable(bigIntegerSubtract, bit, this.random), new DSAValidationParameters(bArr, i)) : new DSAParameters(bigIntegerSubtract, bit, bigIntegerCalculateGenerator_FIPS186_3_Verifiable, new DSAValidationParameters(bArr, i, this.usageIndex));
    }

    private static int getDefaultN(int i) {
        return i > 1024 ? 256 : 160;
    }

    private static int getMinimumIterations(int i) {
        if (i <= 1024) {
            return 40;
        }
        return (((i - 1) / 1024) * 8) + 48;
    }

    private static void hash(Digest digest, byte[] bArr, byte[] bArr2, int i) {
        digest.update(bArr, 0, bArr.length);
        digest.doFinal(bArr2, i);
    }

    private static void inc(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b = (byte) ((bArr[length] + 1) & 255);
            bArr[length] = b;
            if (b != 0) {
                return;
            }
        }
    }

    private boolean isProbablePrime(BigInteger bigInteger) {
        return bigInteger.isProbablePrime(this.certainty);
    }

    public DSAParameters generateParameters() {
        return this.use186_3 ? generateParameters_FIPS186_3() : generateParameters_FIPS186_2();
    }

    public void init(DSAParameterGenerationParameters dSAParameterGenerationParameters) {
        int l2 = dSAParameterGenerationParameters.getL();
        int n = dSAParameterGenerationParameters.getN();
        if (l2 < 1024 || l2 > 3072 || l2 % 1024 != 0) {
            ig3.m135964a("L values must be between 1024 and 3072 and a multiple of 1024");
            return;
        }
        if (l2 == 1024 && n != 160) {
            ig3.m135964a("N must be 160 for L = 1024");
            return;
        }
        if (l2 == 2048 && n != 224 && n != 256) {
            ig3.m135964a("N must be 224 or 256 for L = 2048");
            return;
        }
        if (l2 == 3072 && n != 256) {
            ig3.m135964a("N must be 256 for L = 3072");
            return;
        }
        if (this.digest.getDigestSize() * 8 < n) {
            qkq0.m175383a("Digest output size too small for value of N");
            return;
        }
        this.f206604L = l2;
        this.f206605N = n;
        this.certainty = dSAParameterGenerationParameters.getCertainty();
        this.iterations = Math.max(getMinimumIterations(l2), (this.certainty + 1) / 2);
        this.random = dSAParameterGenerationParameters.getRandom();
        this.use186_3 = true;
        this.usageIndex = dSAParameterGenerationParameters.getUsageIndex();
    }

    public DSAParametersGenerator(Digest digest) {
        this.digest = digest;
    }

    public void init(int i, int i2, SecureRandom secureRandom) {
        this.f206604L = i;
        this.f206605N = getDefaultN(i);
        this.certainty = i2;
        this.iterations = Math.max(getMinimumIterations(this.f206604L), (i2 + 1) / 2);
        this.random = secureRandom;
        this.use186_3 = false;
        this.usageIndex = -1;
    }
}
