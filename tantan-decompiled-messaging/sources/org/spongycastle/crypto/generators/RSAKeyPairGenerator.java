package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.RSAKeyGenerationParameters;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.spongycastle.math.Primes;
import org.spongycastle.math.p131ec.WNafUtil;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class RSAKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private int iterations;
    private RSAKeyGenerationParameters param;

    private static int getNumberOfIterations(int i, int i2) {
        if (i >= 1536) {
            if (i2 <= 100) {
                return 3;
            }
            if (i2 <= 128) {
                return 4;
            }
            return ((i2 - 127) / 2) + 4;
        }
        if (i >= 1024) {
            if (i2 <= 100) {
                return 4;
            }
            if (i2 <= 112) {
                return 5;
            }
            return ((i2 - 111) / 2) + 5;
        }
        if (i < 512) {
            if (i2 <= 80) {
                return 40;
            }
            return ((i2 - 79) / 2) + 40;
        }
        if (i2 <= 80) {
            return 5;
        }
        if (i2 <= 100) {
            return 7;
        }
        return ((i2 - 99) / 2) + 7;
    }

    public BigInteger chooseRandomPrime(int i, BigInteger bigInteger, BigInteger bigInteger2) {
        for (int i2 = 0; i2 != i * 5; i2++) {
            BigInteger bigInteger3 = new BigInteger(i, 1, this.param.getRandom());
            BigInteger bigIntegerMod = bigInteger3.mod(bigInteger);
            BigInteger bigInteger4 = ONE;
            if (!bigIntegerMod.equals(bigInteger4) && bigInteger3.multiply(bigInteger3).compareTo(bigInteger2) >= 0 && isProbablePrime(bigInteger3) && bigInteger.gcd(bigInteger3.subtract(bigInteger4)).equals(bigInteger4)) {
                return bigInteger3;
            }
        }
        qkq0.m175383a("unable to generate prime number for RSA key");
        return null;
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        BigInteger bigIntegerChooseRandomPrime;
        BigInteger bigIntegerMultiply;
        RSAKeyPairGenerator rSAKeyPairGenerator = this;
        int strength = rSAKeyPairGenerator.param.getStrength();
        int i = (strength + 1) / 2;
        int i2 = strength - i;
        int i3 = strength / 2;
        int i4 = i3 - 100;
        int i5 = strength / 3;
        if (i4 < i5) {
            i4 = i5;
        }
        int i6 = strength >> 2;
        BigInteger bigIntegerPow = BigInteger.valueOf(2L).pow(i3);
        BigInteger bigInteger = ONE;
        BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(strength - 1);
        BigInteger bigIntegerShiftLeft2 = bigInteger.shiftLeft(i4);
        AsymmetricCipherKeyPair asymmetricCipherKeyPair = null;
        boolean z = false;
        while (!z) {
            BigInteger publicExponent = rSAKeyPairGenerator.param.getPublicExponent();
            BigInteger bigIntegerChooseRandomPrime2 = rSAKeyPairGenerator.chooseRandomPrime(i, publicExponent, bigIntegerShiftLeft);
            while (true) {
                bigIntegerChooseRandomPrime = rSAKeyPairGenerator.chooseRandomPrime(i2, publicExponent, bigIntegerShiftLeft);
                BigInteger bigIntegerAbs = bigIntegerChooseRandomPrime.subtract(bigIntegerChooseRandomPrime2).abs();
                if (bigIntegerAbs.bitLength() >= i4 && bigIntegerAbs.compareTo(bigIntegerShiftLeft2) > 0) {
                    bigIntegerMultiply = bigIntegerChooseRandomPrime2.multiply(bigIntegerChooseRandomPrime);
                    if (bigIntegerMultiply.bitLength() == strength) {
                        if (WNafUtil.getNafWeight(bigIntegerMultiply) >= i6) {
                            break;
                        }
                        bigIntegerChooseRandomPrime2 = rSAKeyPairGenerator.chooseRandomPrime(i, publicExponent, bigIntegerShiftLeft);
                    } else {
                        bigIntegerChooseRandomPrime2 = bigIntegerChooseRandomPrime2.max(bigIntegerChooseRandomPrime);
                    }
                } else {
                    rSAKeyPairGenerator = this;
                    strength = strength;
                }
            }
            if (bigIntegerChooseRandomPrime2.compareTo(bigIntegerChooseRandomPrime) < 0) {
                bigIntegerChooseRandomPrime = bigIntegerChooseRandomPrime2;
                bigIntegerChooseRandomPrime2 = bigIntegerChooseRandomPrime;
            }
            BigInteger bigInteger2 = ONE;
            BigInteger bigIntegerSubtract = bigIntegerChooseRandomPrime2.subtract(bigInteger2);
            BigInteger bigIntegerSubtract2 = bigIntegerChooseRandomPrime.subtract(bigInteger2);
            int i7 = strength;
            BigInteger bigIntegerModInverse = publicExponent.modInverse(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2));
            if (bigIntegerModInverse.compareTo(bigIntegerPow) > 0) {
                asymmetricCipherKeyPair = new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new RSAKeyParameters(false, bigIntegerMultiply, publicExponent), (AsymmetricKeyParameter) new RSAPrivateCrtKeyParameters(bigIntegerMultiply, publicExponent, bigIntegerModInverse, bigIntegerChooseRandomPrime2, bigIntegerChooseRandomPrime, bigIntegerModInverse.remainder(bigIntegerSubtract), bigIntegerModInverse.remainder(bigIntegerSubtract2), bigIntegerChooseRandomPrime.modInverse(bigIntegerChooseRandomPrime2)));
                z = true;
            }
            rSAKeyPairGenerator = this;
            strength = i7;
        }
        return asymmetricCipherKeyPair;
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        RSAKeyGenerationParameters rSAKeyGenerationParameters = (RSAKeyGenerationParameters) keyGenerationParameters;
        this.param = rSAKeyGenerationParameters;
        this.iterations = getNumberOfIterations(rSAKeyGenerationParameters.getStrength(), this.param.getCertainty());
    }

    public boolean isProbablePrime(BigInteger bigInteger) {
        return !Primes.hasAnySmallFactors(bigInteger) && Primes.isMRProbablePrime(bigInteger, this.param.getRandom(), this.iterations);
    }
}
