package org.spongycastle.math.p135ec;

import java.math.BigInteger;
import org.spongycastle.math.p135ec.endo.GLVEndomorphism;
import p153l.wg3;
import p153l.wpg0;

/* JADX INFO: loaded from: classes3.dex */
public class GLVMultiplier extends AbstractECMultiplier {
    protected final ECCurve curve;
    protected final GLVEndomorphism glvEndomorphism;

    public GLVMultiplier(ECCurve eCCurve, GLVEndomorphism gLVEndomorphism) {
        if (eCCurve == null || eCCurve.getOrder() == null) {
            wg3.m206174a("Need curve with known group order");
            throw null;
        }
        this.curve = eCCurve;
        this.glvEndomorphism = gLVEndomorphism;
    }

    @Override // org.spongycastle.math.p135ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        if (!this.curve.equals(eCPoint.getCurve())) {
            wpg0.m207458a();
            return null;
        }
        BigInteger[] bigIntegerArrDecomposeScalar = this.glvEndomorphism.decomposeScalar(bigInteger.mod(eCPoint.getCurve().getOrder()));
        BigInteger bigInteger2 = bigIntegerArrDecomposeScalar[0];
        BigInteger bigInteger3 = bigIntegerArrDecomposeScalar[1];
        ECPointMap pointMap = this.glvEndomorphism.getPointMap();
        return this.glvEndomorphism.hasEfficientPointMap() ? ECAlgorithms.implShamirsTrickWNaf(eCPoint, bigInteger2, pointMap, bigInteger3) : ECAlgorithms.implShamirsTrickWNaf(eCPoint, bigInteger2, pointMap.map(eCPoint), bigInteger3);
    }
}
