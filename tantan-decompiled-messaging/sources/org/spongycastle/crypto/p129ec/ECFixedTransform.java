package org.spongycastle.crypto.p129ec;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.math.p131ec.ECMultiplier;
import org.spongycastle.math.p131ec.ECPoint;
import org.spongycastle.math.p131ec.FixedPointCombMultiplier;
import p149l.ig3;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class ECFixedTransform implements ECPairFactorTransform {

    /* JADX INFO: renamed from: k */
    private BigInteger f206487k;
    private ECPublicKeyParameters key;

    public ECFixedTransform(BigInteger bigInteger) {
        this.f206487k = bigInteger;
    }

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.spongycastle.crypto.p129ec.ECPairFactorTransform
    public BigInteger getTransformValue() {
        return this.f206487k;
    }

    @Override // org.spongycastle.crypto.p129ec.ECPairTransform
    public void init(CipherParameters cipherParameters) {
        if (cipherParameters instanceof ECPublicKeyParameters) {
            this.key = (ECPublicKeyParameters) cipherParameters;
        } else {
            ig3.m135964a("ECPublicKeyParameters are required for fixed transform.");
        }
    }

    @Override // org.spongycastle.crypto.p129ec.ECPairTransform
    public ECPair transform(ECPair eCPair) {
        ECPublicKeyParameters eCPublicKeyParameters = this.key;
        if (eCPublicKeyParameters == null) {
            qkq0.m175383a("ECFixedTransform not initialised");
            return null;
        }
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        BigInteger n = parameters.getN();
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        BigInteger bigIntegerMod = this.f206487k.mod(n);
        ECPoint[] eCPointArr = {eCMultiplierCreateBasePointMultiplier.multiply(parameters.getG(), bigIntegerMod).add(eCPair.getX()), this.key.getQ().multiply(bigIntegerMod).add(eCPair.getY())};
        parameters.getCurve().normalizeAll(eCPointArr);
        return new ECPair(eCPointArr[0], eCPointArr[1]);
    }
}
