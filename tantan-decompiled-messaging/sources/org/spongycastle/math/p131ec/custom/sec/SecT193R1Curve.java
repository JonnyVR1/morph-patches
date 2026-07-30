package org.spongycastle.math.p131ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.p131ec.ECCurve;
import org.spongycastle.math.p131ec.ECFieldElement;
import org.spongycastle.math.p131ec.ECPoint;
import org.spongycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes3.dex */
public class SecT193R1Curve extends ECCurve.AbstractF2m {
    private static final int SecT193R1_DEFAULT_COORDS = 6;
    protected SecT193R1Point infinity;

    public SecT193R1Curve() {
        super(193, 15, 0, 0);
        this.infinity = new SecT193R1Point(this, null, null);
        this.f206770a = fromBigInteger(new BigInteger(1, Hex.decode("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01")));
        this.f206771b = fromBigInteger(new BigInteger(1, Hex.decode("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814")));
        this.order = new BigInteger(1, Hex.decode("01000000000000000000000000C7F34A778F443ACC920EBA49"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    @Override // org.spongycastle.math.p131ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecT193R1Curve();
    }

    @Override // org.spongycastle.math.p131ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        return new SecT193R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z);
    }

    @Override // org.spongycastle.math.p131ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT193FieldElement(bigInteger);
    }

    @Override // org.spongycastle.math.p131ec.ECCurve
    public int getFieldSize() {
        return 193;
    }

    @Override // org.spongycastle.math.p131ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 15;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 193;
    }

    @Override // org.spongycastle.math.ec.ECCurve.AbstractF2m
    public boolean isKoblitz() {
        return false;
    }

    public boolean isTrinomial() {
        return true;
    }

    @Override // org.spongycastle.math.p131ec.ECCurve
    public boolean supportsCoordinateSystem(int i) {
        return i == 6;
    }

    @Override // org.spongycastle.math.p131ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        return new SecT193R1Point(this, eCFieldElement, eCFieldElement2, z);
    }
}
