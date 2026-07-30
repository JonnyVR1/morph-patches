package org.spongycastle.math.p135ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class MontgomeryLadderMultiplier extends AbstractECMultiplier {
    @Override // org.spongycastle.math.p135ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECPoint[] eCPointArr = new ECPoint[2];
        eCPointArr[0] = eCPoint.getCurve().getInfinity();
        eCPointArr[1] = eCPoint;
        int iBitLength = bigInteger.bitLength();
        while (true) {
            iBitLength--;
            if (iBitLength < 0) {
                return eCPointArr[0];
            }
            boolean zTestBit = bigInteger.testBit(iBitLength);
            int i = 1 - (zTestBit ? 1 : 0);
            eCPointArr[i] = eCPointArr[i].add(eCPointArr[zTestBit ? 1 : 0]);
            eCPointArr[zTestBit ? 1 : 0] = eCPointArr[zTestBit ? 1 : 0].twice();
        }
    }
}
