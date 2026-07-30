package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.DHKeyGenerationParameters;
import org.spongycastle.crypto.params.DHParameters;
import org.spongycastle.crypto.params.DHPrivateKeyParameters;
import org.spongycastle.crypto.params.DHPublicKeyParameters;

/* JADX INFO: loaded from: classes3.dex */
public class DHBasicKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private DHKeyGenerationParameters param;

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        DHKeyGeneratorHelper dHKeyGeneratorHelper = DHKeyGeneratorHelper.INSTANCE;
        DHParameters parameters = this.param.getParameters();
        BigInteger bigIntegerCalculatePrivate = dHKeyGeneratorHelper.calculatePrivate(parameters, this.param.getRandom());
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new DHPublicKeyParameters(dHKeyGeneratorHelper.calculatePublic(parameters, bigIntegerCalculatePrivate), parameters), (AsymmetricKeyParameter) new DHPrivateKeyParameters(bigIntegerCalculatePrivate, parameters));
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.param = (DHKeyGenerationParameters) keyGenerationParameters;
    }
}
