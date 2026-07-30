package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECKeyGenerationParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.math.p135ec.ECConstants;
import org.spongycastle.math.p135ec.ECMultiplier;
import org.spongycastle.math.p135ec.FixedPointCombMultiplier;
import org.spongycastle.math.p135ec.WNafUtil;

/* JADX INFO: loaded from: classes3.dex */
public class ECKeyPairGenerator implements AsymmetricCipherKeyPairGenerator, ECConstants {
    ECDomainParameters params;
    SecureRandom random;

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        BigInteger n = this.params.getN();
        int iBitLength = n.bitLength();
        int i = iBitLength >>> 2;
        while (true) {
            BigInteger bigInteger = new BigInteger(iBitLength, this.random);
            if (bigInteger.compareTo(ECConstants.TWO) >= 0 && bigInteger.compareTo(n) < 0 && WNafUtil.getNafWeight(bigInteger) >= i) {
                return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new ECPublicKeyParameters(createBasePointMultiplier().multiply(this.params.getG(), bigInteger), this.params), (AsymmetricKeyParameter) new ECPrivateKeyParameters(bigInteger, this.params));
            }
        }
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        ECKeyGenerationParameters eCKeyGenerationParameters = (ECKeyGenerationParameters) keyGenerationParameters;
        this.random = eCKeyGenerationParameters.getRandom();
        this.params = eCKeyGenerationParameters.getDomainParameters();
        if (this.random == null) {
            this.random = new SecureRandom();
        }
    }
}
