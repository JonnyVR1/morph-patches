package org.spongycastle.math.p135ec;

import java.math.BigInteger;
import p153l.p7f;

/* JADX INFO: loaded from: classes3.dex */
public class NafL2RMultiplier extends AbstractECMultiplier {
    @Override // org.spongycastle.math.p135ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        int[] iArrGenerateCompactNaf = WNafUtil.generateCompactNaf(bigInteger);
        ECPoint eCPointNormalize = eCPoint.normalize();
        ECPoint eCPointNegate = eCPointNormalize.negate();
        ECPoint infinity = eCPoint.getCurve().getInfinity();
        int length = iArrGenerateCompactNaf.length;
        while (true) {
            length--;
            if (length < 0) {
                return infinity;
            }
            int i = iArrGenerateCompactNaf[length];
            infinity = infinity.twicePlus((i >> 16) < 0 ? eCPointNegate : eCPointNormalize).timesPow2(i & p7f.COLOR_SPACE_UNCALIBRATED);
        }
    }
}
