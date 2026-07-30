package org.spongycastle.math.p135ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ZSignedDigitL2RMultiplier extends AbstractECMultiplier {
    @Override // org.spongycastle.math.p135ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECPoint eCPointNormalize = eCPoint.normalize();
        ECPoint eCPointNegate = eCPointNormalize.negate();
        int iBitLength = bigInteger.bitLength();
        int lowestSetBit = bigInteger.getLowestSetBit();
        ECPoint eCPointTwicePlus = eCPointNormalize;
        while (true) {
            iBitLength--;
            if (iBitLength <= lowestSetBit) {
                return eCPointTwicePlus.timesPow2(lowestSetBit);
            }
            eCPointTwicePlus = eCPointTwicePlus.twicePlus(bigInteger.testBit(iBitLength) ? eCPointNormalize : eCPointNegate);
        }
    }
}
