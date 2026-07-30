package org.spongycastle.math.p131ec.custom.sec;

import org.spongycastle.math.p131ec.ECCurve;
import org.spongycastle.math.p131ec.ECFieldElement;
import org.spongycastle.math.p131ec.ECPoint;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat224;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class SecP224K1Point extends ECPoint.AbstractFp {
    public SecP224K1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
        if ((eCFieldElement == null) == (eCFieldElement2 == null)) {
            this.withCompression = z;
        } else {
            ig3.m135964a("Exactly one of the field elements is null");
            throw null;
        }
    }

    @Override // org.spongycastle.math.p131ec.ECPoint
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
        SecP224K1FieldElement secP224K1FieldElement = (SecP224K1FieldElement) this.f206785x;
        SecP224K1FieldElement secP224K1FieldElement2 = (SecP224K1FieldElement) this.f206786y;
        SecP224K1FieldElement secP224K1FieldElement3 = (SecP224K1FieldElement) eCPoint.getXCoord();
        SecP224K1FieldElement secP224K1FieldElement4 = (SecP224K1FieldElement) eCPoint.getYCoord();
        SecP224K1FieldElement secP224K1FieldElement5 = (SecP224K1FieldElement) this.f206787zs[0];
        SecP224K1FieldElement secP224K1FieldElement6 = (SecP224K1FieldElement) eCPoint.getZCoord(0);
        int[] iArrCreateExt = Nat224.createExt();
        int[] iArrCreate = Nat224.create();
        int[] iArrCreate2 = Nat224.create();
        int[] iArrCreate3 = Nat224.create();
        boolean zIsOne = secP224K1FieldElement5.isOne();
        if (zIsOne) {
            iArr = secP224K1FieldElement3.f206829x;
            iArr2 = secP224K1FieldElement4.f206829x;
        } else {
            SecP224K1Field.square(secP224K1FieldElement5.f206829x, iArrCreate2);
            SecP224K1Field.multiply(iArrCreate2, secP224K1FieldElement3.f206829x, iArrCreate);
            SecP224K1Field.multiply(iArrCreate2, secP224K1FieldElement5.f206829x, iArrCreate2);
            SecP224K1Field.multiply(iArrCreate2, secP224K1FieldElement4.f206829x, iArrCreate2);
            iArr = iArrCreate;
            iArr2 = iArrCreate2;
        }
        boolean zIsOne2 = secP224K1FieldElement6.isOne();
        if (zIsOne2) {
            iArr3 = secP224K1FieldElement.f206829x;
            iArr4 = secP224K1FieldElement2.f206829x;
        } else {
            SecP224K1Field.square(secP224K1FieldElement6.f206829x, iArrCreate3);
            SecP224K1Field.multiply(iArrCreate3, secP224K1FieldElement.f206829x, iArrCreateExt);
            SecP224K1Field.multiply(iArrCreate3, secP224K1FieldElement6.f206829x, iArrCreate3);
            SecP224K1Field.multiply(iArrCreate3, secP224K1FieldElement2.f206829x, iArrCreate3);
            iArr3 = iArrCreateExt;
            iArr4 = iArrCreate3;
        }
        int[] iArrCreate4 = Nat224.create();
        SecP224K1Field.subtract(iArr3, iArr, iArrCreate4);
        SecP224K1Field.subtract(iArr4, iArr2, iArrCreate);
        if (Nat224.isZero(iArrCreate4)) {
            return Nat224.isZero(iArrCreate) ? twice() : curve.getInfinity();
        }
        SecP224K1Field.square(iArrCreate4, iArrCreate2);
        int[] iArrCreate5 = Nat224.create();
        SecP224K1Field.multiply(iArrCreate2, iArrCreate4, iArrCreate5);
        SecP224K1Field.multiply(iArrCreate2, iArr3, iArrCreate2);
        SecP224K1Field.negate(iArrCreate5, iArrCreate5);
        Nat224.mul(iArr4, iArrCreate5, iArrCreateExt);
        SecP224K1Field.reduce32(Nat224.addBothTo(iArrCreate2, iArrCreate2, iArrCreate5), iArrCreate5);
        SecP224K1FieldElement secP224K1FieldElement7 = new SecP224K1FieldElement(iArrCreate3);
        SecP224K1Field.square(iArrCreate, secP224K1FieldElement7.f206829x);
        int[] iArr5 = secP224K1FieldElement7.f206829x;
        SecP224K1Field.subtract(iArr5, iArrCreate5, iArr5);
        SecP224K1FieldElement secP224K1FieldElement8 = new SecP224K1FieldElement(iArrCreate5);
        SecP224K1Field.subtract(iArrCreate2, secP224K1FieldElement7.f206829x, secP224K1FieldElement8.f206829x);
        SecP224K1Field.multiplyAddToExt(secP224K1FieldElement8.f206829x, iArrCreate, iArrCreateExt);
        SecP224K1Field.reduce(iArrCreateExt, secP224K1FieldElement8.f206829x);
        SecP224K1FieldElement secP224K1FieldElement9 = new SecP224K1FieldElement(iArrCreate4);
        if (!zIsOne) {
            int[] iArr6 = secP224K1FieldElement9.f206829x;
            SecP224K1Field.multiply(iArr6, secP224K1FieldElement5.f206829x, iArr6);
        }
        if (!zIsOne2) {
            int[] iArr7 = secP224K1FieldElement9.f206829x;
            SecP224K1Field.multiply(iArr7, secP224K1FieldElement6.f206829x, iArr7);
        }
        return new SecP224K1Point(curve, secP224K1FieldElement7, secP224K1FieldElement8, new ECFieldElement[]{secP224K1FieldElement9}, this.withCompression);
    }

    @Override // org.spongycastle.math.p131ec.ECPoint
    public ECPoint detach() {
        return new SecP224K1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.spongycastle.math.p131ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP224K1Point(this.curve, this.f206785x, this.f206786y.negate(), this.f206787zs, this.withCompression);
    }

    @Override // org.spongycastle.math.p131ec.ECPoint
    public ECPoint threeTimes() {
        return (isInfinity() || this.f206786y.isZero()) ? this : twice().add(this);
    }

    @Override // org.spongycastle.math.p131ec.ECPoint
    public ECPoint twice() {
        if (isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        SecP224K1FieldElement secP224K1FieldElement = (SecP224K1FieldElement) this.f206786y;
        if (secP224K1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP224K1FieldElement secP224K1FieldElement2 = (SecP224K1FieldElement) this.f206785x;
        SecP224K1FieldElement secP224K1FieldElement3 = (SecP224K1FieldElement) this.f206787zs[0];
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.square(secP224K1FieldElement.f206829x, iArrCreate);
        int[] iArrCreate2 = Nat224.create();
        SecP224K1Field.square(iArrCreate, iArrCreate2);
        int[] iArrCreate3 = Nat224.create();
        SecP224K1Field.square(secP224K1FieldElement2.f206829x, iArrCreate3);
        SecP224K1Field.reduce32(Nat224.addBothTo(iArrCreate3, iArrCreate3, iArrCreate3), iArrCreate3);
        SecP224K1Field.multiply(iArrCreate, secP224K1FieldElement2.f206829x, iArrCreate);
        SecP224K1Field.reduce32(Nat.shiftUpBits(7, iArrCreate, 2, 0), iArrCreate);
        int[] iArrCreate4 = Nat224.create();
        SecP224K1Field.reduce32(Nat.shiftUpBits(7, iArrCreate2, 3, 0, iArrCreate4), iArrCreate4);
        SecP224K1FieldElement secP224K1FieldElement4 = new SecP224K1FieldElement(iArrCreate2);
        SecP224K1Field.square(iArrCreate3, secP224K1FieldElement4.f206829x);
        int[] iArr = secP224K1FieldElement4.f206829x;
        SecP224K1Field.subtract(iArr, iArrCreate, iArr);
        int[] iArr2 = secP224K1FieldElement4.f206829x;
        SecP224K1Field.subtract(iArr2, iArrCreate, iArr2);
        SecP224K1FieldElement secP224K1FieldElement5 = new SecP224K1FieldElement(iArrCreate);
        SecP224K1Field.subtract(iArrCreate, secP224K1FieldElement4.f206829x, secP224K1FieldElement5.f206829x);
        int[] iArr3 = secP224K1FieldElement5.f206829x;
        SecP224K1Field.multiply(iArr3, iArrCreate3, iArr3);
        int[] iArr4 = secP224K1FieldElement5.f206829x;
        SecP224K1Field.subtract(iArr4, iArrCreate4, iArr4);
        SecP224K1FieldElement secP224K1FieldElement6 = new SecP224K1FieldElement(iArrCreate3);
        SecP224K1Field.twice(secP224K1FieldElement.f206829x, secP224K1FieldElement6.f206829x);
        if (!secP224K1FieldElement3.isOne()) {
            int[] iArr5 = secP224K1FieldElement6.f206829x;
            SecP224K1Field.multiply(iArr5, secP224K1FieldElement3.f206829x, iArr5);
        }
        return new SecP224K1Point(curve, secP224K1FieldElement4, secP224K1FieldElement5, new ECFieldElement[]{secP224K1FieldElement6}, this.withCompression);
    }

    @Override // org.spongycastle.math.p131ec.ECPoint
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
        return this.f206786y.isZero() ? eCPoint : twice().add(eCPoint);
    }

    public SecP224K1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        this(eCCurve, eCFieldElement, eCFieldElement2, false);
    }

    public SecP224K1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        this.withCompression = z;
    }
}
