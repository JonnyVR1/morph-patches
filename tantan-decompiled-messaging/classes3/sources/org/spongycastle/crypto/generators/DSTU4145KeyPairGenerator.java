package org.spongycastle.crypto.generators;

import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.ECPublicKeyParameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DSTU4145KeyPairGenerator extends ECKeyPairGenerator {
    @Override // org.spongycastle.crypto.generators.ECKeyPairGenerator, org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = super.generateKeyPair();
        ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic();
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new ECPublicKeyParameters(eCPublicKeyParameters.getQ().negate(), eCPublicKeyParameters.getParameters()), asymmetricCipherKeyPairGenerateKeyPair.getPrivate());
    }
}
