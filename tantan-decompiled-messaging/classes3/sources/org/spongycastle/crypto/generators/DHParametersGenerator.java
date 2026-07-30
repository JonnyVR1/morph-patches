package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.params.DHParameters;
import org.spongycastle.crypto.params.DHValidationParameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DHParametersGenerator {
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private int certainty;
    private SecureRandom random;
    private int size;

    public DHParameters generateParameters() {
        BigInteger[] bigIntegerArrGenerateSafePrimes = DHParametersHelper.generateSafePrimes(this.size, this.certainty, this.random);
        BigInteger bigInteger = bigIntegerArrGenerateSafePrimes[0];
        BigInteger bigInteger2 = bigIntegerArrGenerateSafePrimes[1];
        return new DHParameters(bigInteger, DHParametersHelper.selectGenerator(bigInteger, bigInteger2, this.random), bigInteger2, TWO, (DHValidationParameters) null);
    }

    public void init(int i, int i2, SecureRandom secureRandom) {
        this.size = i;
        this.certainty = i2;
        this.random = secureRandom;
    }
}
