package org.spongycastle.math.p131ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.p131ec.ECConstants;
import org.spongycastle.math.p131ec.ECCurve;
import org.spongycastle.math.p131ec.ECFieldElement;
import org.spongycastle.math.p131ec.ECPoint;
import org.spongycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes3.dex */
public class SecP224K1Curve extends ECCurve.AbstractFp {
    private static final int SECP224K1_DEFAULT_COORDS = 2;

    /* JADX INFO: renamed from: q */
    public static final BigInteger f206825q = new BigInteger(1, Hex.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));
    protected SecP224K1Point infinity;

    public SecP224K1Curve() {
        super(f206825q);
        this.infinity = new SecP224K1Point(this, null, null);
        this.f206770a = fromBigInteger(ECConstants.ZERO);
        this.f206771b = fromBigInteger(BigInteger.valueOf(5L));
        this.order = new BigInteger(1, Hex.decode("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.spongycastle.math.p131ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecP224K1Curve();
    }

    @Override // org.spongycastle.math.p131ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        return new SecP224K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z);
    }

    @Override // org.spongycastle.math.p131ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP224K1FieldElement(bigInteger);
    }

    @Override // org.spongycastle.math.p131ec.ECCurve
    public int getFieldSize() {
        return f206825q.bitLength();
    }

    @Override // org.spongycastle.math.p131ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f206825q;
    }

    @Override // org.spongycastle.math.p131ec.ECCurve
    public boolean supportsCoordinateSystem(int i) {
        return i == 2;
    }

    @Override // org.spongycastle.math.p131ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        return new SecP224K1Point(this, eCFieldElement, eCFieldElement2, z);
    }
}
