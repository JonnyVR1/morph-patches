package org.spongycastle.crypto.p010ec;

import java.math.BigInteger;
import java.security.SecureRandom;
import l.ig3;
import l.qkq0;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.math.p012ec.ECMultiplier;
import org.spongycastle.math.p012ec.ECPoint;
import org.spongycastle.math.p012ec.FixedPointCombMultiplier;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ECNewPublicKeyTransform implements ECPairTransform {
    private ECPublicKeyParameters key;
    private SecureRandom random;

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.spongycastle.crypto.p010ec.ECPairTransform
    public void init(CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithRandom)) {
            if (!(cipherParameters instanceof ECPublicKeyParameters)) {
                ig3.a("ECPublicKeyParameters are required for new public key transform.");
                return;
            } else {
                this.key = (ECPublicKeyParameters) cipherParameters;
                this.random = new SecureRandom();
                return;
            }
        }
        ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
        if (!(parametersWithRandom.getParameters() instanceof ECPublicKeyParameters)) {
            ig3.a("ECPublicKeyParameters are required for new public key transform.");
        } else {
            this.key = (ECPublicKeyParameters) parametersWithRandom.getParameters();
            this.random = parametersWithRandom.getRandom();
        }
    }

    @Override // org.spongycastle.crypto.p010ec.ECPairTransform
    public ECPair transform(ECPair eCPair) {
        ECPublicKeyParameters eCPublicKeyParameters = this.key;
        if (eCPublicKeyParameters == null) {
            qkq0.a("ECNewPublicKeyTransform not initialised");
            return null;
        }
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        BigInteger n = parameters.getN();
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        BigInteger bigIntegerGenerateK = ECUtil.generateK(n, this.random);
        ECPoint[] eCPointArr = {eCMultiplierCreateBasePointMultiplier.multiply(parameters.getG(), bigIntegerGenerateK), this.key.getQ().multiply(bigIntegerGenerateK).add(eCPair.getY())};
        parameters.getCurve().normalizeAll(eCPointArr);
        return new ECPair(eCPointArr[0], eCPointArr[1]);
    }
}
