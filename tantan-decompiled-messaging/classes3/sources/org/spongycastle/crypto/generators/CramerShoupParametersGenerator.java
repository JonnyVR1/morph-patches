package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.params.CramerShoupParameters;
import org.spongycastle.crypto.params.DHParameters;
import org.spongycastle.util.BigIntegers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CramerShoupParametersGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private int certainty;
    private SecureRandom random;
    private int size;

    public static class ParametersHelper {
        private static final BigInteger TWO = BigInteger.valueOf(2);

        private ParametersHelper() {
        }

        public static BigInteger[] generateSafePrimes(int i, int i2, SecureRandom secureRandom) {
            BigInteger bigInteger;
            BigInteger bigIntegerAdd;
            int i3 = i - 1;
            while (true) {
                bigInteger = new BigInteger(i3, 2, secureRandom);
                bigIntegerAdd = bigInteger.shiftLeft(1).add(CramerShoupParametersGenerator.ONE);
                if (bigIntegerAdd.isProbablePrime(i2) && (i2 <= 2 || bigInteger.isProbablePrime(i2))) {
                    break;
                }
            }
            return new BigInteger[]{bigIntegerAdd, bigInteger};
        }

        public static BigInteger selectGenerator(BigInteger bigInteger, SecureRandom secureRandom) {
            BigInteger bigIntegerModPow;
            BigInteger bigIntegerSubtract = bigInteger.subtract(TWO);
            do {
                BigInteger bigInteger2 = TWO;
                bigIntegerModPow = BigIntegers.createRandomInRange(bigInteger2, bigIntegerSubtract, secureRandom).modPow(bigInteger2, bigInteger);
            } while (bigIntegerModPow.equals(CramerShoupParametersGenerator.ONE));
            return bigIntegerModPow;
        }
    }

    public CramerShoupParameters generateParameters() {
        BigInteger bigInteger = ParametersHelper.generateSafePrimes(this.size, this.certainty, this.random)[1];
        BigInteger bigIntegerSelectGenerator = ParametersHelper.selectGenerator(bigInteger, this.random);
        BigInteger bigIntegerSelectGenerator2 = ParametersHelper.selectGenerator(bigInteger, this.random);
        while (bigIntegerSelectGenerator.equals(bigIntegerSelectGenerator2)) {
            bigIntegerSelectGenerator2 = ParametersHelper.selectGenerator(bigInteger, this.random);
        }
        return new CramerShoupParameters(bigInteger, bigIntegerSelectGenerator, bigIntegerSelectGenerator2, new SHA256Digest());
    }

    public void init(int i, int i2, SecureRandom secureRandom) {
        this.size = i;
        this.certainty = i2;
        this.random = secureRandom;
    }

    public CramerShoupParameters generateParameters(DHParameters dHParameters) {
        BigInteger p = dHParameters.getP();
        BigInteger g = dHParameters.getG();
        BigInteger bigIntegerSelectGenerator = ParametersHelper.selectGenerator(p, this.random);
        while (g.equals(bigIntegerSelectGenerator)) {
            bigIntegerSelectGenerator = ParametersHelper.selectGenerator(p, this.random);
        }
        return new CramerShoupParameters(p, g, bigIntegerSelectGenerator, new SHA256Digest());
    }
}
