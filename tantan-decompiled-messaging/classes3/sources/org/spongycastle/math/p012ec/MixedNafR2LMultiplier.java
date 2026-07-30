package org.spongycastle.math.p012ec;

import java.math.BigInteger;
import l.ctq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MixedNafR2LMultiplier extends AbstractECMultiplier {
    protected int additionCoord;
    protected int doublingCoord;

    public MixedNafR2LMultiplier(int i, int i2) {
        this.additionCoord = i;
        this.doublingCoord = i2;
    }

    public ECCurve configureCurve(ECCurve eCCurve, int i) {
        if (eCCurve.getCoordinateSystem() == i) {
            return eCCurve;
        }
        if (eCCurve.supportsCoordinateSystem(i)) {
            return eCCurve.configure().setCoordinateSystem(i).create();
        }
        ctq0.a("Coordinate system ", i, " not supported by this curve");
        return null;
    }

    @Override // org.spongycastle.math.p012ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECCurve curve = eCPoint.getCurve();
        ECCurve eCCurveConfigureCurve = configureCurve(curve, this.additionCoord);
        ECCurve eCCurveConfigureCurve2 = configureCurve(curve, this.doublingCoord);
        int[] iArrGenerateCompactNaf = WNafUtil.generateCompactNaf(bigInteger);
        ECPoint infinity = eCCurveConfigureCurve.getInfinity();
        ECPoint eCPointImportPoint = eCCurveConfigureCurve2.importPoint(eCPoint);
        int i = 0;
        ECPoint eCPointAdd = infinity;
        int i2 = 0;
        while (i < iArrGenerateCompactNaf.length) {
            int i3 = iArrGenerateCompactNaf[i];
            int i4 = i3 >> 16;
            eCPointImportPoint = eCPointImportPoint.timesPow2(i2 + (i3 & 65535));
            ECPoint eCPointImportPoint2 = eCCurveConfigureCurve.importPoint(eCPointImportPoint);
            if (i4 < 0) {
                eCPointImportPoint2 = eCPointImportPoint2.negate();
            }
            eCPointAdd = eCPointAdd.add(eCPointImportPoint2);
            i++;
            i2 = 1;
        }
        return curve.importPoint(eCPointAdd);
    }

    public MixedNafR2LMultiplier() {
        this(2, 4);
    }
}
