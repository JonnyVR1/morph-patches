package org.spongycastle.crypto.p129ec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.math.p131ec.ECMultiplier;
import org.spongycastle.math.p131ec.ECPoint;
import org.spongycastle.math.p131ec.FixedPointCombMultiplier;
import p149l.ig3;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class ECNewRandomnessTransform implements ECPairFactorTransform {
    private ECPublicKeyParameters key;
    private BigInteger lastK;
    private SecureRandom random;

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.spongycastle.crypto.p129ec.ECPairFactorTransform
    public BigInteger getTransformValue() {
        return this.lastK;
    }

    @Override // org.spongycastle.crypto.p129ec.ECPairTransform
    public void init(CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithRandom)) {
            if (!(cipherParameters instanceof ECPublicKeyParameters)) {
                ig3.m135964a("ECPublicKeyParameters are required for new randomness transform.");
                return;
            } else {
                this.key = (ECPublicKeyParameters) cipherParameters;
                this.random = new SecureRandom();
                return;
            }
        }
        ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
        if (!(parametersWithRandom.getParameters() instanceof ECPublicKeyParameters)) {
            ig3.m135964a("ECPublicKeyParameters are required for new randomness transform.");
        } else {
            this.key = (ECPublicKeyParameters) parametersWithRandom.getParameters();
            this.random = parametersWithRandom.getRandom();
        }
    }

    @Override // org.spongycastle.crypto.p129ec.ECPairTransform
    public ECPair transform(ECPair eCPair) {
        ECPublicKeyParameters eCPublicKeyParameters = this.key;
        if (eCPublicKeyParameters == null) {
            qkq0.m175383a("ECNewRandomnessTransform not initialised");
            return null;
        }
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        BigInteger n = parameters.getN();
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        BigInteger bigIntegerGenerateK = ECUtil.generateK(n, this.random);
        ECPoint[] eCPointArr = {eCMultiplierCreateBasePointMultiplier.multiply(parameters.getG(), bigIntegerGenerateK).add(eCPair.getX()), this.key.getQ().multiply(bigIntegerGenerateK).add(eCPair.getY())};
        parameters.getCurve().normalizeAll(eCPointArr);
        this.lastK = bigIntegerGenerateK;
        return new ECPair(eCPointArr[0], eCPointArr[1]);
    }
}
