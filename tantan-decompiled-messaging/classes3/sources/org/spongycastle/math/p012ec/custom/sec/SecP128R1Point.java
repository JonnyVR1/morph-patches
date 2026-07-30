package org.spongycastle.math.p012ec.custom.sec;

import l.ig3;
import org.spongycastle.math.p012ec.ECCurve;
import org.spongycastle.math.p012ec.ECFieldElement;
import org.spongycastle.math.p012ec.ECPoint;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat128;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SecP128R1Point extends ECPoint.AbstractFp {
    public SecP128R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
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
        SecP128R1FieldElement secP128R1FieldElement = (SecP128R1FieldElement) this.f10410x;
        SecP128R1FieldElement secP128R1FieldElement2 = (SecP128R1FieldElement) this.f10411y;
        SecP128R1FieldElement secP128R1FieldElement3 = (SecP128R1FieldElement) eCPoint.getXCoord();
        SecP128R1FieldElement secP128R1FieldElement4 = (SecP128R1FieldElement) eCPoint.getYCoord();
        SecP128R1FieldElement secP128R1FieldElement5 = (SecP128R1FieldElement) this.f10412zs[0];
        SecP128R1FieldElement secP128R1FieldElement6 = (SecP128R1FieldElement) eCPoint.getZCoord(0);
        int[] iArrCreateExt = Nat128.createExt();
        int[] iArrCreate = Nat128.create();
        int[] iArrCreate2 = Nat128.create();
        int[] iArrCreate3 = Nat128.create();
        boolean zIsOne = secP128R1FieldElement5.isOne();
        if (zIsOne) {
            iArr = secP128R1FieldElement3.f10426x;
            iArr2 = secP128R1FieldElement4.f10426x;
        } else {
            SecP128R1Field.square(secP128R1FieldElement5.f10426x, iArrCreate2);
            SecP128R1Field.multiply(iArrCreate2, secP128R1FieldElement3.f10426x, iArrCreate);
            SecP128R1Field.multiply(iArrCreate2, secP128R1FieldElement5.f10426x, iArrCreate2);
            SecP128R1Field.multiply(iArrCreate2, secP128R1FieldElement4.f10426x, iArrCreate2);
            iArr = iArrCreate;
            iArr2 = iArrCreate2;
        }
        boolean zIsOne2 = secP128R1FieldElement6.isOne();
        if (zIsOne2) {
            iArr3 = secP128R1FieldElement.f10426x;
            iArr4 = secP128R1FieldElement2.f10426x;
        } else {
            SecP128R1Field.square(secP128R1FieldElement6.f10426x, iArrCreate3);
            SecP128R1Field.multiply(iArrCreate3, secP128R1FieldElement.f10426x, iArrCreateExt);
            SecP128R1Field.multiply(iArrCreate3, secP128R1FieldElement6.f10426x, iArrCreate3);
            SecP128R1Field.multiply(iArrCreate3, secP128R1FieldElement2.f10426x, iArrCreate3);
            iArr3 = iArrCreateExt;
            iArr4 = iArrCreate3;
        }
        int[] iArrCreate4 = Nat128.create();
        SecP128R1Field.subtract(iArr3, iArr, iArrCreate4);
        SecP128R1Field.subtract(iArr4, iArr2, iArrCreate);
        if (Nat128.isZero(iArrCreate4)) {
            return Nat128.isZero(iArrCreate) ? twice() : curve.getInfinity();
        }
        SecP128R1Field.square(iArrCreate4, iArrCreate2);
        int[] iArrCreate5 = Nat128.create();
        SecP128R1Field.multiply(iArrCreate2, iArrCreate4, iArrCreate5);
        SecP128R1Field.multiply(iArrCreate2, iArr3, iArrCreate2);
        SecP128R1Field.negate(iArrCreate5, iArrCreate5);
        Nat128.mul(iArr4, iArrCreate5, iArrCreateExt);
        SecP128R1Field.reduce32(Nat128.addBothTo(iArrCreate2, iArrCreate2, iArrCreate5), iArrCreate5);
        SecP128R1FieldElement secP128R1FieldElement7 = new SecP128R1FieldElement(iArrCreate3);
        SecP128R1Field.square(iArrCreate, secP128R1FieldElement7.f10426x);
        int[] iArr5 = secP128R1FieldElement7.f10426x;
        SecP128R1Field.subtract(iArr5, iArrCreate5, iArr5);
        SecP128R1FieldElement secP128R1FieldElement8 = new SecP128R1FieldElement(iArrCreate5);
        SecP128R1Field.subtract(iArrCreate2, secP128R1FieldElement7.f10426x, secP128R1FieldElement8.f10426x);
        SecP128R1Field.multiplyAddToExt(secP128R1FieldElement8.f10426x, iArrCreate, iArrCreateExt);
        SecP128R1Field.reduce(iArrCreateExt, secP128R1FieldElement8.f10426x);
        SecP128R1FieldElement secP128R1FieldElement9 = new SecP128R1FieldElement(iArrCreate4);
        if (!zIsOne) {
            int[] iArr6 = secP128R1FieldElement9.f10426x;
            SecP128R1Field.multiply(iArr6, secP128R1FieldElement5.f10426x, iArr6);
        }
        if (!zIsOne2) {
            int[] iArr7 = secP128R1FieldElement9.f10426x;
            SecP128R1Field.multiply(iArr7, secP128R1FieldElement6.f10426x, iArr7);
        }
        return new SecP128R1Point(curve, secP128R1FieldElement7, secP128R1FieldElement8, new ECFieldElement[]{secP128R1FieldElement9}, this.withCompression);
    }

    @Override // org.spongycastle.math.p012ec.ECPoint
    public ECPoint detach() {
        return new SecP128R1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.spongycastle.math.p012ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP128R1Point(this.curve, this.f10410x, this.f10411y.negate(), this.f10412zs, this.withCompression);
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
        SecP128R1FieldElement secP128R1FieldElement = (SecP128R1FieldElement) this.f10411y;
        if (secP128R1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP128R1FieldElement secP128R1FieldElement2 = (SecP128R1FieldElement) this.f10410x;
        SecP128R1FieldElement secP128R1FieldElement3 = (SecP128R1FieldElement) this.f10412zs[0];
        int[] iArrCreate = Nat128.create();
        int[] iArrCreate2 = Nat128.create();
        int[] iArrCreate3 = Nat128.create();
        SecP128R1Field.square(secP128R1FieldElement.f10426x, iArrCreate3);
        int[] iArrCreate4 = Nat128.create();
        SecP128R1Field.square(iArrCreate3, iArrCreate4);
        boolean zIsOne = secP128R1FieldElement3.isOne();
        int[] iArr = secP128R1FieldElement3.f10426x;
        if (!zIsOne) {
            SecP128R1Field.square(iArr, iArrCreate2);
            iArr = iArrCreate2;
        }
        SecP128R1Field.subtract(secP128R1FieldElement2.f10426x, iArr, iArrCreate);
        SecP128R1Field.add(secP128R1FieldElement2.f10426x, iArr, iArrCreate2);
        SecP128R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP128R1Field.reduce32(Nat128.addBothTo(iArrCreate2, iArrCreate2, iArrCreate2), iArrCreate2);
        SecP128R1Field.multiply(iArrCreate3, secP128R1FieldElement2.f10426x, iArrCreate3);
        SecP128R1Field.reduce32(Nat.shiftUpBits(4, iArrCreate3, 2, 0), iArrCreate3);
        SecP128R1Field.reduce32(Nat.shiftUpBits(4, iArrCreate4, 3, 0, iArrCreate), iArrCreate);
        SecP128R1FieldElement secP128R1FieldElement4 = new SecP128R1FieldElement(iArrCreate4);
        SecP128R1Field.square(iArrCreate2, secP128R1FieldElement4.f10426x);
        int[] iArr2 = secP128R1FieldElement4.f10426x;
        SecP128R1Field.subtract(iArr2, iArrCreate3, iArr2);
        int[] iArr3 = secP128R1FieldElement4.f10426x;
        SecP128R1Field.subtract(iArr3, iArrCreate3, iArr3);
        SecP128R1FieldElement secP128R1FieldElement5 = new SecP128R1FieldElement(iArrCreate3);
        SecP128R1Field.subtract(iArrCreate3, secP128R1FieldElement4.f10426x, secP128R1FieldElement5.f10426x);
        int[] iArr4 = secP128R1FieldElement5.f10426x;
        SecP128R1Field.multiply(iArr4, iArrCreate2, iArr4);
        int[] iArr5 = secP128R1FieldElement5.f10426x;
        SecP128R1Field.subtract(iArr5, iArrCreate, iArr5);
        SecP128R1FieldElement secP128R1FieldElement6 = new SecP128R1FieldElement(iArrCreate2);
        SecP128R1Field.twice(secP128R1FieldElement.f10426x, secP128R1FieldElement6.f10426x);
        if (!zIsOne) {
            int[] iArr6 = secP128R1FieldElement6.f10426x;
            SecP128R1Field.multiply(iArr6, secP128R1FieldElement3.f10426x, iArr6);
        }
        return new SecP128R1Point(curve, secP128R1FieldElement4, secP128R1FieldElement5, new ECFieldElement[]{secP128R1FieldElement6}, this.withCompression);
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

    public SecP128R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        this(eCCurve, eCFieldElement, eCFieldElement2, false);
    }

    public SecP128R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        this.withCompression = z;
    }
}
