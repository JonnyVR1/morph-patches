package org.spongycastle.crypto.p133ec;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.math.p135ec.ECMultiplier;
import org.spongycastle.math.p135ec.ECPoint;
import org.spongycastle.math.p135ec.FixedPointCombMultiplier;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class ECFixedTransform implements ECPairFactorTransform {

    /* JADX INFO: renamed from: k */
    private BigInteger f207409k;
    private ECPublicKeyParameters key;

    public ECFixedTransform(BigInteger bigInteger) {
        this.f207409k = bigInteger;
    }

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.spongycastle.crypto.p133ec.ECPairFactorTransform
    public BigInteger getTransformValue() {
        return this.f207409k;
    }

    @Override // org.spongycastle.crypto.p133ec.ECPairTransform
    public void init(CipherParameters cipherParameters) {
        if (cipherParameters instanceof ECPublicKeyParameters) {
            this.key = (ECPublicKeyParameters) cipherParameters;
        } else {
            wg3.m206174a("ECPublicKeyParameters are required for fixed transform.");
        }
    }

    @Override // org.spongycastle.crypto.p133ec.ECPairTransform
    public ECPair transform(ECPair eCPair) {
        ECPublicKeyParameters eCPublicKeyParameters = this.key;
        if (eCPublicKeyParameters == null) {
            wtq0.m207906a("ECFixedTransform not initialised");
            return null;
        }
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        BigInteger n = parameters.getN();
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        BigInteger bigIntegerMod = this.f207409k.mod(n);
        ECPoint[] eCPointArr = {eCMultiplierCreateBasePointMultiplier.multiply(parameters.getG(), bigIntegerMod).add(eCPair.getX()), this.key.getQ().multiply(bigIntegerMod).add(eCPair.getY())};
        parameters.getCurve().normalizeAll(eCPointArr);
        return new ECPair(eCPointArr[0], eCPointArr[1]);
    }
}
