package org.spongycastle.math.p131ec.endo;

import java.math.BigInteger;
import org.spongycastle.math.p131ec.ECConstants;
import org.spongycastle.math.p131ec.ECCurve;
import org.spongycastle.math.p131ec.ECPointMap;
import org.spongycastle.math.p131ec.ScaleXPointMap;

/* JADX INFO: loaded from: classes3.dex */
public class GLVTypeBEndomorphism implements GLVEndomorphism {
    protected final ECCurve curve;
    protected final GLVTypeBParameters parameters;
    protected final ECPointMap pointMap;

    public GLVTypeBEndomorphism(ECCurve eCCurve, GLVTypeBParameters gLVTypeBParameters) {
        this.curve = eCCurve;
        this.parameters = gLVTypeBParameters;
        this.pointMap = new ScaleXPointMap(eCCurve.fromBigInteger(gLVTypeBParameters.getBeta()));
    }

    public BigInteger calculateB(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        boolean z = bigInteger2.signum() < 0;
        BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger2.abs());
        boolean zTestBit = bigIntegerMultiply.testBit(i - 1);
        BigInteger bigIntegerShiftRight = bigIntegerMultiply.shiftRight(i);
        if (zTestBit) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(ECConstants.ONE);
        }
        return z ? bigIntegerShiftRight.negate() : bigIntegerShiftRight;
    }

    @Override // org.spongycastle.math.p131ec.endo.GLVEndomorphism
    public BigInteger[] decomposeScalar(BigInteger bigInteger) {
        int bits = this.parameters.getBits();
        BigInteger bigIntegerCalculateB = calculateB(bigInteger, this.parameters.getG1(), bits);
        BigInteger bigIntegerCalculateB2 = calculateB(bigInteger, this.parameters.getG2(), bits);
        GLVTypeBParameters gLVTypeBParameters = this.parameters;
        return new BigInteger[]{bigInteger.subtract(bigIntegerCalculateB.multiply(gLVTypeBParameters.getV1A()).add(bigIntegerCalculateB2.multiply(gLVTypeBParameters.getV2A()))), bigIntegerCalculateB.multiply(gLVTypeBParameters.getV1B()).add(bigIntegerCalculateB2.multiply(gLVTypeBParameters.getV2B())).negate()};
    }

    @Override // org.spongycastle.math.p131ec.endo.ECEndomorphism
    public ECPointMap getPointMap() {
        return this.pointMap;
    }

    @Override // org.spongycastle.math.p131ec.endo.ECEndomorphism
    public boolean hasEfficientPointMap() {
        return true;
    }
}
