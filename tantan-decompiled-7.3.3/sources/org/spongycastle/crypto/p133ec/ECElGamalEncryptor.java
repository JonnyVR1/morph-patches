package org.spongycastle.crypto.p133ec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.math.p135ec.ECMultiplier;
import org.spongycastle.math.p135ec.ECPoint;
import org.spongycastle.math.p135ec.FixedPointCombMultiplier;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class ECElGamalEncryptor implements ECEncryptor {
    private ECPublicKeyParameters key;
    private SecureRandom random;

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.spongycastle.crypto.p133ec.ECEncryptor
    public ECPair encrypt(ECPoint eCPoint) {
        ECPublicKeyParameters eCPublicKeyParameters = this.key;
        if (eCPublicKeyParameters == null) {
            wtq0.m207906a("ECElGamalEncryptor not initialised");
            return null;
        }
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        BigInteger bigIntegerGenerateK = ECUtil.generateK(parameters.getN(), this.random);
        ECPoint[] eCPointArr = {createBasePointMultiplier().multiply(parameters.getG(), bigIntegerGenerateK), this.key.getQ().multiply(bigIntegerGenerateK).add(eCPoint)};
        parameters.getCurve().normalizeAll(eCPointArr);
        return new ECPair(eCPointArr[0], eCPointArr[1]);
    }

    @Override // org.spongycastle.crypto.p133ec.ECEncryptor
    public void init(CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithRandom)) {
            if (!(cipherParameters instanceof ECPublicKeyParameters)) {
                wg3.m206174a("ECPublicKeyParameters are required for encryption.");
                return;
            } else {
                this.key = (ECPublicKeyParameters) cipherParameters;
                this.random = new SecureRandom();
                return;
            }
        }
        ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
        if (!(parametersWithRandom.getParameters() instanceof ECPublicKeyParameters)) {
            wg3.m206174a("ECPublicKeyParameters are required for encryption.");
        } else {
            this.key = (ECPublicKeyParameters) parametersWithRandom.getParameters();
            this.random = parametersWithRandom.getRandom();
        }
    }
}
