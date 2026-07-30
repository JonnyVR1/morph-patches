package org.spongycastle.math.p012ec.custom.sec;

import l.ig3;
import org.spongycastle.math.p012ec.ECCurve;
import org.spongycastle.math.p012ec.ECFieldElement;
import org.spongycastle.math.p012ec.ECPoint;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat160;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SecP160R2Point extends ECPoint.AbstractFp {
    public SecP160R2Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
        if ((eCFieldElement == null) == (eCFieldElement2 == null)) {
            this.withCompression = z;
        } else {
            ig3.a("Exactly one of the field elements is null");
            throw null;
        }
    }

    @Override // org.spongycastle.math.p012ec.ECPoint
    public ECPoint add(ECPoint eCPoint) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return this;
        }
        if (this == eCPoint) {
            return twice();
        }
        ECCurve curve = getCurve();
        SecP160R2FieldElement secP160R2FieldElement = (SecP160R2FieldElement) this.f10410x;
        SecP160R2FieldElement secP160R2FieldElement2 = (SecP160R2FieldElement) this.f10411y;
        SecP160R2FieldElement secP160R2FieldElement3 = (SecP160R2FieldElement) eCPoint.getXCoord();
        SecP160R2FieldElement secP160R2FieldElement4 = (SecP160R2FieldElement) eCPoint.getYCoord();
        SecP160R2FieldElement secP160R2FieldElement5 = (SecP160R2FieldElement) this.f10412zs[0];
        SecP160R2FieldElement secP160R2FieldElement6 = (SecP160R2FieldElement) eCPoint.getZCoord(0);
        int[] iArrCreateExt = Nat160.createExt();
        int[] iArrCreate = Nat160.create();
        int[] iArrCreate2 = Nat160.create();
        int[] iArrCreate3 = Nat160.create();
        boolean zIsOne = secP160R2FieldElement5.isOne();
        if (zIsOne) {
            iArr = secP160R2FieldElement3.f10438x;
            iArr2 = secP160R2FieldElement4.f10438x;
        } else {
            SecP160R2Field.square(secP160R2FieldElement5.f10438x, iArrCreate2);
            SecP160R2Field.multiply(iArrCreate2, secP160R2FieldElement3.f10438x, iArrCreate);
            SecP160R2Field.multiply(iArrCreate2, secP160R2FieldElement5.f10438x, iArrCreate2);
            SecP160R2Field.multiply(iArrCreate2, secP160R2FieldElement4.f10438x, iArrCreate2);
            iArr = iArrCreate;
            iArr2 = iArrCreate2;
        }
        boolean zIsOne2 = secP160R2FieldElement6.isOne();
        if (zIsOne2) {
            iArr3 = secP160R2FieldElement.f10438x;
            iArr4 = secP160R2FieldElement2.f10438x;
        } else {
            SecP160R2Field.square(secP160R2FieldElement6.f10438x, iArrCreate3);
            SecP160R2Field.multiply(iArrCreate3, secP160R2FieldElement.f10438x, iArrCreateExt);
            SecP160R2Field.multiply(iArrCreate3, secP160R2FieldElement6.f10438x, iArrCreate3);
            SecP160R2Field.multiply(iArrCreate3, secP160R2FieldElement2.f10438x, iArrCreate3);
            iArr3 = iArrCreateExt;
            iArr4 = iArrCreate3;
        }
        int[] iArrCreate4 = Nat160.create();
        SecP160R2Field.subtract(iArr3, iArr, iArrCreate4);
        SecP160R2Field.subtract(iArr4, iArr2, iArrCreate);
        if (Nat160.isZero(iArrCreate4)) {
            return Nat160.isZero(iArrCreate) ? twice() : curve.getInfinity();
        }
        SecP160R2Field.square(iArrCreate4, iArrCreate2);
        int[] iArrCreate5 = Nat160.create();
        SecP160R2Field.multiply(iArrCreate2, iArrCreate4, iArrCreate5);
        SecP160R2Field.multiply(iArrCreate2, iArr3, iArrCreate2);
        SecP160R2Field.negate(iArrCreate5, iArrCreate5);
        Nat160.mul(iArr4, iArrCreate5, iArrCreateExt);
        SecP160R2Field.reduce32(Nat160.addBothTo(iArrCreate2, iArrCreate2, iArrCreate5), iArrCreate5);
        SecP160R2FieldElement secP160R2FieldElement7 = new SecP160R2FieldElement(iArrCreate3);
        SecP160R2Field.square(iArrCreate, secP160R2FieldElement7.f10438x);
        int[] iArr5 = secP160R2FieldElement7.f10438x;
        SecP160R2Field.subtract(iArr5, iArrCreate5, iArr5);
        SecP160R2FieldElement secP160R2FieldElement8 = new SecP160R2FieldElement(iArrCreate5);
        SecP160R2Field.subtract(iArrCreate2, secP160R2FieldElement7.f10438x, secP160R2FieldElement8.f10438x);
        SecP160R2Field.multiplyAddToExt(secP160R2FieldElement8.f10438x, iArrCreate, iArrCreateExt);
        SecP160R2Field.reduce(iArrCreateExt, secP160R2FieldElement8.f10438x);
        SecP160R2FieldElement secP160R2FieldElement9 = new SecP160R2FieldElement(iArrCreate4);
        if (!zIsOne) {
            int[] iArr6 = secP160R2FieldElement9.f10438x;
            SecP160R2Field.multiply(iArr6, secP160R2FieldElement5.f10438x, iArr6);
        }
        if (!zIsOne2) {
            int[] iArr7 = secP160R2FieldElement9.f10438x;
            SecP160R2Field.multiply(iArr7, secP160R2FieldElement6.f10438x, iArr7);
        }
        return new SecP160R2Point(curve, secP160R2FieldElement7, secP160R2FieldElement8, new ECFieldElement[]{secP160R2FieldElement9}, this.withCompression);
    }

    @Override // org.spongycastle.math.p012ec.ECPoint
    public ECPoint detach() {
        return new SecP160R2Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.spongycastle.math.p012ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP160R2Point(this.curve, this.f10410x, this.f10411y.negate(), this.f10412zs, this.withCompression);
    }

    @Override // org.spongycastle.math.p012ec.ECPoint
    public ECPoint threeTimes() {
        return (isInfinity() || this.f10411y.isZero()) ? this : twice().add(this);
    }

    @Override // org.spongycastle.math.p012ec.ECPoint
    public ECPoint twice() {
        if (isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        SecP160R2FieldElement secP160R2FieldElement = (SecP160R2FieldElement) this.f10411y;
        if (secP160R2FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP160R2FieldElement secP160R2FieldElement2 = (SecP160R2FieldElement) this.f10410x;
        SecP160R2FieldElement secP160R2FieldElement3 = (SecP160R2FieldElement) this.f10412zs[0];
        int[] iArrCreate = Nat160.create();
        int[] iArrCreate2 = Nat160.create();
        int[] iArrCreate3 = Nat160.create();
        SecP160R2Field.square(secP160R2FieldElement.f10438x, iArrCreate3);
        int[] iArrCreate4 = Nat160.create();
        SecP160R2Field.square(iArrCreate3, iArrCreate4);
        boolean zIsOne = secP160R2FieldElement3.isOne();
        int[] iArr = secP160R2FieldElement3.f10438x;
        if (!zIsOne) {
            SecP160R2Field.square(iArr, iArrCreate2);
            iArr = iArrCreate2;
        }
        SecP160R2Field.subtract(secP160R2FieldElement2.f10438x, iArr, iArrCreate);
        SecP160R2Field.add(secP160R2FieldElement2.f10438x, iArr, iArrCreate2);
        SecP160R2Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP160R2Field.reduce32(Nat160.addBothTo(iArrCreate2, iArrCreate2, iArrCreate2), iArrCreate2);
        SecP160R2Field.multiply(iArrCreate3, secP160R2FieldElement2.f10438x, iArrCreate3);
        SecP160R2Field.reduce32(Nat.shiftUpBits(5, iArrCreate3, 2, 0), iArrCreate3);
        SecP160R2Field.reduce32(Nat.shiftUpBits(5, iArrCreate4, 3, 0, iArrCreate), iArrCreate);
        SecP160R2FieldElement secP160R2FieldElement4 = new SecP160R2FieldElement(iArrCreate4);
        SecP160R2Field.square(iArrCreate2, secP160R2FieldElement4.f10438x);
        int[] iArr2 = secP160R2FieldElement4.f10438x;
        SecP160R2Field.subtract(iArr2, iArrCreate3, iArr2);
        int[] iArr3 = secP160R2FieldElement4.f10438x;
        SecP160R2Field.subtract(iArr3, iArrCreate3, iArr3);
        SecP160R2FieldElement secP160R2FieldElement5 = new SecP160R2FieldElement(iArrCreate3);
        SecP160R2Field.subtract(iArrCreate3, secP160R2FieldElement4.f10438x, secP160R2FieldElement5.f10438x);
        int[] iArr4 = secP160R2FieldElement5.f10438x;
        SecP160R2Field.multiply(iArr4, iArrCreate2, iArr4);
        int[] iArr5 = secP160R2FieldElement5.f10438x;
        SecP160R2Field.subtract(iArr5, iArrCreate, iArr5);
        SecP160R2FieldElement secP160R2FieldElement6 = new SecP160R2FieldElement(iArrCreate2);
        SecP160R2Field.twice(secP160R2FieldElement.f10438x, secP160R2FieldElement6.f10438x);
        if (!zIsOne) {
            int[] iArr6 = secP160R2FieldElement6.f10438x;
            SecP160R2Field.multiply(iArr6, secP160R2FieldElement3.f10438x, iArr6);
        }
        return new SecP160R2Point(curve, secP160R2FieldElement4, secP160R2FieldElement5, new ECFieldElement[]{secP160R2FieldElement6}, this.withCompression);
    }

    @Override // org.spongycastle.math.p012ec.ECPoint
    public ECPoint twicePlus(ECPoint eCPoint) {
        if (this == eCPoint) {
            return threeTimes();
        }
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return twice();
        }
        return this.f10411y.isZero() ? eCPoint : twice().add(eCPoint);
    }

    public SecP160R2Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        this(eCCurve, eCFieldElement, eCFieldElement2, false);
    }

    public SecP160R2Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        this.withCompression = z;
    }
}
