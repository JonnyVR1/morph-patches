package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.crypto.params.RSAPrivateCrtKeyParameters;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class RSABlindingFactorGenerator {
    private RSAKeyParameters key;
    private SecureRandom random;
    private static BigInteger ZERO = BigInteger.valueOf(0);
    private static BigInteger ONE = BigInteger.valueOf(1);

    public BigInteger generateBlindingFactor() {
        RSAKeyParameters rSAKeyParameters = this.key;
        if (rSAKeyParameters == null) {
            wtq0.m207906a("generator not initialised");
            return null;
        }
        BigInteger modulus = rSAKeyParameters.getModulus();
        int iBitLength = modulus.bitLength() - 1;
        while (true) {
            BigInteger bigInteger = new BigInteger(iBitLength, this.random);
            BigInteger bigIntegerGcd = bigInteger.gcd(modulus);
            if (!bigInteger.equals(ZERO) && !bigInteger.equals(ONE) && bigIntegerGcd.equals(ONE)) {
                return bigInteger;
            }
        }
    }

    public void init(CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.key = (RSAKeyParameters) parametersWithRandom.getParameters();
            this.random = parametersWithRandom.getRandom();
        } else {
            this.key = (RSAKeyParameters) cipherParameters;
            this.random = new SecureRandom();
        }
        if (this.key instanceof RSAPrivateCrtKeyParameters) {
            wg3.m206174a("generator requires RSA public key");
        }
    }
}
