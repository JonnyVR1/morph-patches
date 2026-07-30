package org.spongycastle.math.p135ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.p135ec.ECCurve;
import org.spongycastle.math.p135ec.ECFieldElement;
import org.spongycastle.math.p135ec.ECMultiplier;
import org.spongycastle.math.p135ec.ECPoint;
import org.spongycastle.math.p135ec.WTauNafMultiplier;
import org.spongycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes3.dex */
public class SecT571K1Curve extends ECCurve.AbstractF2m {
    private static final int SecT571K1_DEFAULT_COORDS = 6;
    protected SecT571K1Point infinity;

    public SecT571K1Curve() {
        super(571, 2, 5, 10);
        this.infinity = new SecT571K1Point(this, null, null);
        this.f207692a = fromBigInteger(BigInteger.valueOf(0L));
        this.f207693b = fromBigInteger(BigInteger.valueOf(1L));
        this.order = new BigInteger(1, Hex.decode("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
        this.cofactor = BigInteger.valueOf(4L);
        this.coord = 6;
    }

    @Override // org.spongycastle.math.p135ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecT571K1Curve();
    }

    @Override // org.spongycastle.math.p135ec.ECCurve
    public ECMultiplier createDefaultMultiplier() {
        return new WTauNafMultiplier();
    }

    @Override // org.spongycastle.math.p135ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        return new SecT571K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z);
    }

    @Override // org.spongycastle.math.p135ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT571FieldElement(bigInteger);
    }

    @Override // org.spongycastle.math.p135ec.ECCurve
    public int getFieldSize() {
        return 571;
    }

    @Override // org.spongycastle.math.p135ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 2;
    }

    public int getK2() {
        return 5;
    }

    public int getK3() {
        return 10;
    }

    public int getM() {
        return 571;
    }

    @Override // org.spongycastle.math.ec.ECCurve.AbstractF2m
    public boolean isKoblitz() {
        return true;
    }

    public boolean isTrinomial() {
        return false;
    }

    @Override // org.spongycastle.math.p135ec.ECCurve
    public boolean supportsCoordinateSystem(int i) {
        return i == 6;
    }

    @Override // org.spongycastle.math.p135ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        return new SecT571K1Point(this, eCFieldElement, eCFieldElement2, z);
    }
}
