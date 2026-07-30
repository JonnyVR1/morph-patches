package org.spongycastle.math.p135ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractECMultiplier implements ECMultiplier {
    @Override // org.spongycastle.math.p135ec.ECMultiplier
    public ECPoint multiply(ECPoint eCPoint, BigInteger bigInteger) {
        int iSignum = bigInteger.signum();
        if (iSignum == 0 || eCPoint.isInfinity()) {
            return eCPoint.getCurve().getInfinity();
        }
        ECPoint eCPointMultiplyPositive = multiplyPositive(eCPoint, bigInteger.abs());
        if (iSignum <= 0) {
            eCPointMultiplyPositive = eCPointMultiplyPositive.negate();
        }
        return ECAlgorithms.validatePoint(eCPointMultiplyPositive);
    }

    public abstract ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger);
}
