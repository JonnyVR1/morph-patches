package org.spongycastle.crypto.agreement;

import java.math.BigInteger;
import java.security.SecureRandom;
import l.ig3;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.generators.DHKeyPairGenerator;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.DHKeyGenerationParameters;
import org.spongycastle.crypto.params.DHParameters;
import org.spongycastle.crypto.params.DHPrivateKeyParameters;
import org.spongycastle.crypto.params.DHPublicKeyParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DHAgreement {
    private DHParameters dhParams;
    private DHPrivateKeyParameters key;
    private BigInteger privateValue;
    private SecureRandom random;

    public BigInteger calculateAgreement(DHPublicKeyParameters dHPublicKeyParameters, BigInteger bigInteger) {
        if (dHPublicKeyParameters.getParameters().equals(this.dhParams)) {
            BigInteger p = this.dhParams.getP();
            return bigInteger.modPow(this.key.getX(), p).multiply(dHPublicKeyParameters.getY().modPow(this.privateValue, p)).mod(p);
        }
        ig3.a("Diffie-Hellman public key has wrong parameters.");
        return null;
    }

    public BigInteger calculateMessage() {
        DHKeyPairGenerator dHKeyPairGenerator = new DHKeyPairGenerator();
        dHKeyPairGenerator.init(new DHKeyGenerationParameters(this.random, this.dhParams));
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = dHKeyPairGenerator.generateKeyPair();
        this.privateValue = ((DHPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()).getX();
        return ((DHPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()).getY();
    }

    public void init(CipherParameters cipherParameters) {
        AsymmetricKeyParameter asymmetricKeyParameter;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.random = parametersWithRandom.getRandom();
            asymmetricKeyParameter = (AsymmetricKeyParameter) parametersWithRandom.getParameters();
        } else {
            this.random = new SecureRandom();
            asymmetricKeyParameter = (AsymmetricKeyParameter) cipherParameters;
        }
        if (!(asymmetricKeyParameter instanceof DHPrivateKeyParameters)) {
            ig3.a("DHEngine expects DHPrivateKeyParameters");
            return;
        }
        DHPrivateKeyParameters dHPrivateKeyParameters = (DHPrivateKeyParameters) asymmetricKeyParameter;
        this.key = dHPrivateKeyParameters;
        this.dhParams = dHPrivateKeyParameters.getParameters();
    }
}
