package org.spongycastle.math.p131ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.p131ec.ECCurve;
import org.spongycastle.math.p131ec.ECFieldElement;
import org.spongycastle.math.p131ec.ECPoint;
import org.spongycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes3.dex */
public class SecP160R2Curve extends ECCurve.AbstractFp {
    private static final int SecP160R2_DEFAULT_COORDS = 2;

    /* JADX INFO: renamed from: q */
    public static final BigInteger f206809q = new BigInteger(1, Hex.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));
    protected SecP160R2Point infinity;

    public SecP160R2Curve() {
        super(f206809q);
        this.infinity = new SecP160R2Point(this, null, null);
        this.f206770a = fromBigInteger(new BigInteger(1, Hex.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70")));
        this.f206771b = fromBigInteger(new BigInteger(1, Hex.decode("B4E134D3FB59EB8BAB57274904664D5AF50388BA")));
        this.order = new BigInteger(1, Hex.decode("0100000000000000000000351EE786A818F3A1A16B"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.spongycastle.math.p131ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecP160R2Curve();
    }

    @Override // org.spongycastle.math.p131ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        return new SecP160R2Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z);
    }

    @Override // org.spongycastle.math.p131ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP160R2FieldElement(bigInteger);
    }

    @Override // org.spongycastle.math.p131ec.ECCurve
    public int getFieldSize() {
        return f206809q.bitLength();
    }

    @Override // org.spongycastle.math.p131ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f206809q;
    }

    @Override // org.spongycastle.math.p131ec.ECCurve
    public boolean supportsCoordinateSystem(int i) {
        return i == 2;
    }

    @Override // org.spongycastle.math.p131ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        return new SecP160R2Point(this, eCFieldElement, eCFieldElement2, z);
    }
}
