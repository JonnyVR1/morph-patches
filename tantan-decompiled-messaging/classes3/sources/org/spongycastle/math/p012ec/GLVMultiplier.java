package org.spongycastle.math.p012ec;

import java.math.BigInteger;
import l.ig3;
import l.ohg0;
import org.spongycastle.math.p012ec.endo.GLVEndomorphism;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GLVMultiplier extends AbstractECMultiplier {
    protected final ECCurve curve;
    protected final GLVEndomorphism glvEndomorphism;

    public GLVMultiplier(ECCurve eCCurve, GLVEndomorphism gLVEndomorphism) {
        if (eCCurve == null || eCCurve.getOrder() == null) {
            ig3.a("Need curve with known group order");
            throw null;
        }
        this.curve = eCCurve;
        this.glvEndomorphism = gLVEndomorphism;
    }

    @Override // org.spongycastle.math.p012ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        if (!this.curve.equals(eCPoint.getCurve())) {
            ohg0.a();
            return null;
        }
        BigInteger[] bigIntegerArrDecomposeScalar = this.glvEndomorphism.decomposeScalar(bigInteger.mod(eCPoint.getCurve().getOrder()));
        BigInteger bigInteger2 = bigIntegerArrDecomposeScalar[0];
        BigInteger bigInteger3 = bigIntegerArrDecomposeScalar[1];
        ECPointMap pointMap = this.glvEndomorphism.getPointMap();
        return this.glvEndomorphism.hasEfficientPointMap() ? ECAlgorithms.implShamirsTrickWNaf(eCPoint, bigInteger2, pointMap, bigInteger3) : ECAlgorithms.implShamirsTrickWNaf(eCPoint, bigInteger2, pointMap.map(eCPoint), bigInteger3);
    }
}
