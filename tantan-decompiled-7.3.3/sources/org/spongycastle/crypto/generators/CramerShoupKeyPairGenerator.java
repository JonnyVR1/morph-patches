package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.CramerShoupKeyGenerationParameters;
import org.spongycastle.crypto.params.CramerShoupParameters;
import org.spongycastle.crypto.params.CramerShoupPrivateKeyParameters;
import org.spongycastle.crypto.params.CramerShoupPublicKeyParameters;
import org.spongycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes3.dex */
public class CramerShoupKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private CramerShoupKeyGenerationParameters param;

    private CramerShoupPublicKeyParameters calculatePublicKey(CramerShoupParameters cramerShoupParameters, CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters) {
        BigInteger g1 = cramerShoupParameters.getG1();
        BigInteger g2 = cramerShoupParameters.getG2();
        BigInteger p = cramerShoupParameters.getP();
        return new CramerShoupPublicKeyParameters(cramerShoupParameters, g1.modPow(cramerShoupPrivateKeyParameters.getX1(), p).multiply(g2.modPow(cramerShoupPrivateKeyParameters.getX2(), p)), g1.modPow(cramerShoupPrivateKeyParameters.getY1(), p).multiply(g2.modPow(cramerShoupPrivateKeyParameters.getY2(), p)), g1.modPow(cramerShoupPrivateKeyParameters.getZ(), p));
    }

    private CramerShoupPrivateKeyParameters generatePrivateKey(SecureRandom secureRandom, CramerShoupParameters cramerShoupParameters) {
        BigInteger p = cramerShoupParameters.getP();
        return new CramerShoupPrivateKeyParameters(cramerShoupParameters, generateRandomElement(p, secureRandom), generateRandomElement(p, secureRandom), generateRandomElement(p, secureRandom), generateRandomElement(p, secureRandom), generateRandomElement(p, secureRandom));
    }

    private BigInteger generateRandomElement(BigInteger bigInteger, SecureRandom secureRandom) {
        BigInteger bigInteger2 = ONE;
        return BigIntegers.createRandomInRange(bigInteger2, bigInteger.subtract(bigInteger2), secureRandom);
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        CramerShoupParameters parameters = this.param.getParameters();
        CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParametersGeneratePrivateKey = generatePrivateKey(this.param.getRandom(), parameters);
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParametersCalculatePublicKey = calculatePublicKey(parameters, cramerShoupPrivateKeyParametersGeneratePrivateKey);
        cramerShoupPrivateKeyParametersGeneratePrivateKey.setPk(cramerShoupPublicKeyParametersCalculatePublicKey);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) cramerShoupPublicKeyParametersCalculatePublicKey, (AsymmetricKeyParameter) cramerShoupPrivateKeyParametersGeneratePrivateKey);
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.param = (CramerShoupKeyGenerationParameters) keyGenerationParameters;
    }
}
