package org.spongycastle.math.p135ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.p135ec.ECCurve;
import org.spongycastle.math.p135ec.ECFieldElement;
import org.spongycastle.math.p135ec.ECPoint;
import org.spongycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes3.dex */
public class SecP128R1Curve extends ECCurve.AbstractFp {
    private static final int SecP128R1_DEFAULT_COORDS = 2;

    /* JADX INFO: renamed from: q */
    public static final BigInteger f207718q = new BigInteger(1, Hex.decode("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));
    protected SecP128R1Point infinity;

    public SecP128R1Curve() {
        super(f207718q);
        this.infinity = new SecP128R1Point(this, null, null);
        this.f207692a = fromBigInteger(new BigInteger(1, Hex.decode("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f207693b = fromBigInteger(new BigInteger(1, Hex.decode("E87579C11079F43DD824993C2CEE5ED3")));
        this.order = new BigInteger(1, Hex.decode("FFFFFFFE0000000075A30D1B9038A115"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.spongycastle.math.p135ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecP128R1Curve();
    }

    @Override // org.spongycastle.math.p135ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        return new SecP128R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z);
    }

    @Override // org.spongycastle.math.p135ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP128R1FieldElement(bigInteger);
    }

    @Override // org.spongycastle.math.p135ec.ECCurve
    public int getFieldSize() {
        return f207718q.bitLength();
    }

    @Override // org.spongycastle.math.p135ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f207718q;
    }

    @Override // org.spongycastle.math.p135ec.ECCurve
    public boolean supportsCoordinateSystem(int i) {
        return i == 2;
    }

    @Override // org.spongycastle.math.p135ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        return new SecP128R1Point(this, eCFieldElement, eCFieldElement2, z);
    }
}
