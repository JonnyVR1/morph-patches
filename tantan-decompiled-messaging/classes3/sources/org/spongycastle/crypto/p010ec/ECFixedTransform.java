package org.spongycastle.crypto.p010ec;

import java.math.BigInteger;
import l.ig3;
import l.qkq0;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.math.p012ec.ECMultiplier;
import org.spongycastle.math.p012ec.ECPoint;
import org.spongycastle.math.p012ec.FixedPointCombMultiplier;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ECFixedTransform implements ECPairFactorTransform {

    /* JADX INFO: renamed from: k */
    private BigInteger f10112k;
    private ECPublicKeyParameters key;

    public ECFixedTransform(BigInteger bigInteger) {
        this.f10112k = bigInteger;
    }

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.spongycastle.crypto.p010ec.ECPairFactorTransform
    public BigInteger getTransformValue() {
        return this.f10112k;
    }

    @Override // org.spongycastle.crypto.p010ec.ECPairTransform
    public void init(CipherParameters cipherParameters) {
        if (cipherParameters instanceof ECPublicKeyParameters) {
            this.key = (ECPublicKeyParameters) cipherParameters;
        } else {
            ig3.a("ECPublicKeyParameters are required for fixed transform.");
        }
    }

    @Override // org.spongycastle.crypto.p010ec.ECPairTransform
    public ECPair transform(ECPair eCPair) {
        ECPublicKeyParameters eCPublicKeyParameters = this.key;
        if (eCPublicKeyParameters == null) {
            qkq0.a("ECFixedTransform not initialised");
            return null;
        }
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        BigInteger n = parameters.getN();
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        BigInteger bigIntegerMod = this.f10112k.mod(n);
        ECPoint[] eCPointArr = {eCMultiplierCreateBasePointMultiplier.multiply(parameters.getG(), bigIntegerMod).add(eCPair.getX()), this.key.getQ().multiply(bigIntegerMod).add(eCPair.getY())};
        parameters.getCurve().normalizeAll(eCPointArr);
        return new ECPair(eCPointArr[0], eCPointArr[1]);
    }
}
