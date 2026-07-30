package org.spongycastle.math.p131ec;

import java.math.BigInteger;
import org.spongycastle.math.p131ec.endo.GLVEndomorphism;
import p149l.ig3;
import p149l.ohg0;

/* JADX INFO: loaded from: classes3.dex */
public class GLVMultiplier extends AbstractECMultiplier {
    protected final ECCurve curve;
    protected final GLVEndomorphism glvEndomorphism;

    public GLVMultiplier(ECCurve eCCurve, GLVEndomorphism gLVEndomorphism) {
        if (eCCurve == null || eCCurve.getOrder() == null) {
            ig3.m135964a("Need curve with known group order");
            throw null;
        }
        this.curve = eCCurve;
        this.glvEndomorphism = gLVEndomorphism;
    }

    @Override // org.spongycastle.math.p131ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        if (!this.curve.equals(eCPoint.getCurve())) {
            ohg0.m164364a();
            return null;
        }
        BigInteger[] bigIntegerArrDecomposeScalar = this.glvEndomorphism.decomposeScalar(bigInteger.mod(eCPoint.getCurve().getOrder()));
        BigInteger bigInteger2 = bigIntegerArrDecomposeScalar[0];
        BigInteger bigInteger3 = bigIntegerArrDecomposeScalar[1];
        ECPointMap pointMap = this.glvEndomorphism.getPointMap();
        return this.glvEndomorphism.hasEfficientPointMap() ? ECAlgorithms.implShamirsTrickWNaf(eCPoint, bigInteger2, pointMap, bigInteger3) : ECAlgorithms.implShamirsTrickWNaf(eCPoint, bigInteger2, pointMap.map(eCPoint), bigInteger3);
    }
}
