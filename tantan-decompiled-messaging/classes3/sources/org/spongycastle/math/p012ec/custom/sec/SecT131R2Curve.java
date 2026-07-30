package org.spongycastle.math.p012ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.p012ec.ECCurve;
import org.spongycastle.math.p012ec.ECFieldElement;
import org.spongycastle.math.p012ec.ECPoint;
import org.spongycastle.util.encoders.Hex;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SecT131R2Curve extends ECCurve.AbstractF2m {
    private static final int SecT131R2_DEFAULT_COORDS = 6;
    protected SecT131R2Point infinity;

    public SecT131R2Curve() {
        super(131, 2, 3, 8);
        this.infinity = new SecT131R2Point(this, null, null);
        this.f10395a = fromBigInteger(new BigInteger(1, Hex.decode("03E5A88919D7CAFCBF415F07C2176573B2")));
        this.f10396b = fromBigInteger(new BigInteger(1, Hex.decode("04B8266A46C55657AC734CE38F018F2192")));
        this.order = new BigInteger(1, Hex.decode("0400000000000000016954A233049BA98F"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecT131R2Curve();
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        return new SecT131R2Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z);
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT131FieldElement(bigInteger);
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public int getFieldSize() {
        return 131;
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 2;
    }

    public int getK2() {
        return 3;
    }

    public int getK3() {
        return 8;
    }

    public int getM() {
        return 131;
    }

    @Override // org.spongycastle.math.ec.ECCurve.AbstractF2m
    public boolean isKoblitz() {
        return false;
    }

    public boolean isTrinomial() {
        return false;
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public boolean supportsCoordinateSystem(int i) {
        return i == 6;
    }

    @Override // org.spongycastle.math.p012ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        return new SecT131R2Point(this, eCFieldElement, eCFieldElement2, z);
    }
}
