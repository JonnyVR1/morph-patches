package org.spongycastle.math.p131ec;

import java.math.BigInteger;
import p149l.j6f;

/* JADX INFO: loaded from: classes3.dex */
public class WNafL2RMultiplier extends AbstractECMultiplier {
    public int getWindowSize(int i) {
        return WNafUtil.getWindowSize(i);
    }

    @Override // org.spongycastle.math.p131ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECPoint eCPointAdd;
        int iMax = Math.max(2, Math.min(16, getWindowSize(bigInteger.bitLength())));
        WNafPreCompInfo wNafPreCompInfoPrecompute = WNafUtil.precompute(eCPoint, iMax, true);
        ECPoint[] preComp = wNafPreCompInfoPrecompute.getPreComp();
        ECPoint[] preCompNeg = wNafPreCompInfoPrecompute.getPreCompNeg();
        int[] iArrGenerateCompactWindowNaf = WNafUtil.generateCompactWindowNaf(iMax, bigInteger);
        ECPoint infinity = eCPoint.getCurve().getInfinity();
        int length = iArrGenerateCompactWindowNaf.length;
        if (length > 1) {
            length--;
            int i = iArrGenerateCompactWindowNaf[length];
            int i2 = i >> 16;
            int i3 = i & j6f.COLOR_SPACE_UNCALIBRATED;
            int iAbs = Math.abs(i2);
            ECPoint[] eCPointArr = i2 < 0 ? preCompNeg : preComp;
            if ((iAbs << 2) < (1 << iMax)) {
                byte b = LongArray.bitLengths[iAbs];
                int i4 = iMax - b;
                eCPointAdd = eCPointArr[((1 << (iMax - 1)) - 1) >>> 1].add(eCPointArr[(((iAbs ^ (1 << (b - 1))) << i4) + 1) >>> 1]);
                i3 -= i4;
            } else {
                eCPointAdd = eCPointArr[iAbs >>> 1];
            }
            infinity = eCPointAdd.timesPow2(i3);
        }
        while (length > 0) {
            length--;
            int i5 = iArrGenerateCompactWindowNaf[length];
            int i6 = i5 >> 16;
            infinity = infinity.twicePlus((i6 < 0 ? preCompNeg : preComp)[Math.abs(i6) >>> 1]).timesPow2(i5 & j6f.COLOR_SPACE_UNCALIBRATED);
        }
        return infinity;
    }
}
