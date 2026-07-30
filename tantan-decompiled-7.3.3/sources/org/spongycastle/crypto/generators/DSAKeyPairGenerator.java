package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.DSAKeyGenerationParameters;
import org.spongycastle.crypto.params.DSAParameters;
import org.spongycastle.crypto.params.DSAPrivateKeyParameters;
import org.spongycastle.crypto.params.DSAPublicKeyParameters;
import org.spongycastle.math.p135ec.WNafUtil;
import org.spongycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes3.dex */
public class DSAKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private DSAKeyGenerationParameters param;

    private static BigInteger calculatePublicKey(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return bigInteger2.modPow(bigInteger3, bigInteger);
    }

    private static BigInteger generatePrivateKey(BigInteger bigInteger, SecureRandom secureRandom) {
        BigInteger bigIntegerCreateRandomInRange;
        int iBitLength = bigInteger.bitLength() >>> 2;
        do {
            BigInteger bigInteger2 = ONE;
            bigIntegerCreateRandomInRange = BigIntegers.createRandomInRange(bigInteger2, bigInteger.subtract(bigInteger2), secureRandom);
        } while (WNafUtil.getNafWeight(bigIntegerCreateRandomInRange) < iBitLength);
        return bigIntegerCreateRandomInRange;
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        DSAParameters parameters = this.param.getParameters();
        BigInteger bigIntegerGeneratePrivateKey = generatePrivateKey(parameters.getQ(), this.param.getRandom());
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new DSAPublicKeyParameters(calculatePublicKey(parameters.getP(), parameters.getG(), bigIntegerGeneratePrivateKey), parameters), (AsymmetricKeyParameter) new DSAPrivateKeyParameters(bigIntegerGeneratePrivateKey, parameters));
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.param = (DSAKeyGenerationParameters) keyGenerationParameters;
    }
}
