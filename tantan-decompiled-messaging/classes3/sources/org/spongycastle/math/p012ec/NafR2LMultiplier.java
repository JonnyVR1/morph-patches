package org.spongycastle.math.p012ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NafR2LMultiplier extends AbstractECMultiplier {
    @Override // org.spongycastle.math.p012ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        int[] iArrGenerateCompactNaf = WNafUtil.generateCompactNaf(bigInteger);
        ECPoint infinity = eCPoint.getCurve().getInfinity();
        int i = 0;
        int i2 = 0;
        while (i < iArrGenerateCompactNaf.length) {
            int i3 = iArrGenerateCompactNaf[i];
            int i4 = i3 >> 16;
            eCPoint = eCPoint.timesPow2(i2 + (i3 & 65535));
            infinity = infinity.add(i4 < 0 ? eCPoint.negate() : eCPoint);
            i++;
            i2 = 1;
        }
        return infinity;
    }
}
