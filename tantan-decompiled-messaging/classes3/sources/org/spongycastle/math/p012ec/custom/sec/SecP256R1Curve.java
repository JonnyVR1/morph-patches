package org.spongycastle.math.p012ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.p012ec.ECCurve;
import org.spongycastle.math.p012ec.ECFieldElement;
import org.spongycastle.math.p012ec.ECPoint;
import org.spongycastle.util.encoders.Hex;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SecP256R1Curve extends ECCurve.AbstractFp {
    private static final int SecP256R1_DEFAULT_COORDS = 2;

    /* JADX INFO: renamed from: q */
    public static final BigInteger f10466q = new BigInteger(1, Hex.decode("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"));
    protected SecP256R1Point infinity;

    public SecP256R1Curve() {
        super(f10466q);
        this.infinity = new SecP256R1Point(this, null, null);
        this.f10395a = fromBigInteger(new BigInteger(1, Hex.decode("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f10396b = fromBigInteger(new BigInteger(1, Hex.decode("5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B")));
        this.order = new BigInteger(1, Hex.decode("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecP256R1Curve();
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        return new SecP256R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z);
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP256R1FieldElement(bigInteger);
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public int getFieldSize() {
        return f10466q.bitLength();
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f10466q;
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public boolean supportsCoordinateSystem(int i) {
        return i == 2;
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        return new SecP256R1Point(this, eCFieldElement, eCFieldElement2, z);
    }
}
