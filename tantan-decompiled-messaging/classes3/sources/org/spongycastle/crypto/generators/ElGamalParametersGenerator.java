package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.params.ElGamalParameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ElGamalParametersGenerator {
    private int certainty;
    private SecureRandom random;
    private int size;

    public ElGamalParameters generateParameters() {
        BigInteger[] bigIntegerArrGenerateSafePrimes = DHParametersHelper.generateSafePrimes(this.size, this.certainty, this.random);
        BigInteger bigInteger = bigIntegerArrGenerateSafePrimes[0];
        return new ElGamalParameters(bigInteger, DHParametersHelper.selectGenerator(bigInteger, bigIntegerArrGenerateSafePrimes[1], this.random));
    }

    public void init(int i, int i2, SecureRandom secureRandom) {
        this.size = i;
        this.certainty = i2;
        this.random = secureRandom;
    }
}
