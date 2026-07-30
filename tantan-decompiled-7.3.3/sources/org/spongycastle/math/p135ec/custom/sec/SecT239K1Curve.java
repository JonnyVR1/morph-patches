package org.spongycastle.math.p135ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.p135ec.ECCurve;
import org.spongycastle.math.p135ec.ECFieldElement;
import org.spongycastle.math.p135ec.ECMultiplier;
import org.spongycastle.math.p135ec.ECPoint;
import org.spongycastle.math.p135ec.WTauNafMultiplier;
import org.spongycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes3.dex */
public class SecT239K1Curve extends ECCurve.AbstractF2m {
    private static final int SecT239K1_DEFAULT_COORDS = 6;
    protected SecT239K1Point infinity;

    public SecT239K1Curve() {
        super(239, 158, 0, 0);
        this.infinity = new SecT239K1Point(this, null, null);
        this.f207692a = fromBigInteger(BigInteger.valueOf(0L));
        this.f207693b = fromBigInteger(BigInteger.valueOf(1L));
        this.order = new BigInteger(1, Hex.decode("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
        this.cofactor = BigInteger.valueOf(4L);
        this.coord = 6;
    }

    @Override // org.spongycastle.math.p135ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecT239K1Curve();
    }

    @Override // org.spongycastle.math.p135ec.ECCurve
    public ECMultiplier createDefaultMultiplier() {
        return new WTauNafMultiplier();
    }

    @Override // org.spongycastle.math.p135ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        return new SecT239K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z);
    }

    @Override // org.spongycastle.math.p135ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT239FieldElement(bigInteger);
    }

    @Override // org.spongycastle.math.p135ec.ECCurve
    public int getFieldSize() {
        return 239;
    }

    @Override // org.spongycastle.math.p135ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 158;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 239;
    }

    @Override // org.spongycastle.math.ec.ECCurve.AbstractF2m
    public boolean isKoblitz() {
        return true;
    }

    public boolean isTrinomial() {
        return true;
    }

    @Override // org.spongycastle.math.p135ec.ECCurve
    public boolean supportsCoordinateSystem(int i) {
        return i == 6;
    }

    @Override // org.spongycastle.math.p135ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        return new SecT239K1Point(this, eCFieldElement, eCFieldElement2, z);
    }
}
