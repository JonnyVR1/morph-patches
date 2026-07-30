package org.spongycastle.math.p131ec;

import java.math.BigInteger;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class WTauNafMultiplier extends AbstractECMultiplier {
    static final String PRECOMP_NAME = "bc_wtnaf";

    private static ECPoint.AbstractF2m multiplyFromWTnaf(ECPoint.AbstractF2m abstractF2m, byte[] bArr, PreCompInfo preCompInfo) {
        ECPoint.AbstractF2m[] preComp;
        ECCurve.AbstractF2m abstractF2m2 = (ECCurve.AbstractF2m) abstractF2m.getCurve();
        byte bByteValue = abstractF2m2.getA().toBigInteger().byteValue();
        if (preCompInfo == null || !(preCompInfo instanceof WTauNafPreCompInfo)) {
            preComp = Tnaf.getPreComp(abstractF2m, bByteValue);
            WTauNafPreCompInfo wTauNafPreCompInfo = new WTauNafPreCompInfo();
            wTauNafPreCompInfo.setPreComp(preComp);
            abstractF2m2.setPreCompInfo(abstractF2m, PRECOMP_NAME, wTauNafPreCompInfo);
        } else {
            preComp = ((WTauNafPreCompInfo) preCompInfo).getPreComp();
        }
        ECPoint.AbstractF2m[] abstractF2mArr = new ECPoint.AbstractF2m[preComp.length];
        for (int i = 0; i < preComp.length; i++) {
            abstractF2mArr[i] = (ECPoint.AbstractF2m) preComp[i].negate();
        }
        ECPoint.AbstractF2m abstractF2m3 = (ECPoint.AbstractF2m) abstractF2m.getCurve().getInfinity();
        int i2 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i2++;
            byte b = bArr[length];
            if (b != 0) {
                abstractF2m3 = (ECPoint.AbstractF2m) abstractF2m3.tauPow(i2).add(b > 0 ? preComp[b >>> 1] : abstractF2mArr[(-b) >>> 1]);
                i2 = 0;
            }
        }
        return i2 > 0 ? abstractF2m3.tauPow(i2) : abstractF2m3;
    }

    private ECPoint.AbstractF2m multiplyWTnaf(ECPoint.AbstractF2m abstractF2m, ZTauElement zTauElement, PreCompInfo preCompInfo, byte b, byte b2) {
        return multiplyFromWTnaf(abstractF2m, Tnaf.tauAdicWNaf(b2, zTauElement, (byte) 4, BigInteger.valueOf(16L), Tnaf.getTw(b2, 4), b == 0 ? Tnaf.alpha0 : Tnaf.alpha1), preCompInfo);
    }

    @Override // org.spongycastle.math.p131ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        if (!(eCPoint instanceof ECPoint.AbstractF2m)) {
            ig3.m135964a("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
            return null;
        }
        ECPoint.AbstractF2m abstractF2m = (ECPoint.AbstractF2m) eCPoint;
        ECCurve.AbstractF2m abstractF2m2 = (ECCurve.AbstractF2m) abstractF2m.getCurve();
        int fieldSize = abstractF2m2.getFieldSize();
        byte bByteValue = abstractF2m2.getA().toBigInteger().byteValue();
        byte mu = Tnaf.getMu(bByteValue);
        return multiplyWTnaf(abstractF2m, Tnaf.partModReduction(bigInteger, fieldSize, bByteValue, abstractF2m2.getSi(), mu, (byte) 10), abstractF2m2.getPreCompInfo(abstractF2m, PRECOMP_NAME), bByteValue, mu);
    }
}
