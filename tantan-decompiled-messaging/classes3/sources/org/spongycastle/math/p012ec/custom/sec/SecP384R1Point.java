package org.spongycastle.math.p012ec.custom.sec;

import l.ig3;
import org.spongycastle.math.p012ec.ECCurve;
import org.spongycastle.math.p012ec.ECFieldElement;
import org.spongycastle.math.p012ec.ECPoint;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat384;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SecP384R1Point extends ECPoint.AbstractFp {
    public SecP384R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
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
        SecP384R1FieldElement secP384R1FieldElement = (SecP384R1FieldElement) this.f10410x;
        SecP384R1FieldElement secP384R1FieldElement2 = (SecP384R1FieldElement) this.f10411y;
        SecP384R1FieldElement secP384R1FieldElement3 = (SecP384R1FieldElement) eCPoint.getXCoord();
        SecP384R1FieldElement secP384R1FieldElement4 = (SecP384R1FieldElement) eCPoint.getYCoord();
        SecP384R1FieldElement secP384R1FieldElement5 = (SecP384R1FieldElement) this.f10412zs[0];
        SecP384R1FieldElement secP384R1FieldElement6 = (SecP384R1FieldElement) eCPoint.getZCoord(0);
        int[] iArrCreate = Nat.create(24);
        int[] iArrCreate2 = Nat.create(24);
        int[] iArrCreate3 = Nat.create(12);
        int[] iArrCreate4 = Nat.create(12);
        boolean zIsOne = secP384R1FieldElement5.isOne();
        if (zIsOne) {
            iArr = secP384R1FieldElement3.f10476x;
            iArr2 = secP384R1FieldElement4.f10476x;
        } else {
            SecP384R1Field.square(secP384R1FieldElement5.f10476x, iArrCreate3);
            SecP384R1Field.multiply(iArrCreate3, secP384R1FieldElement3.f10476x, iArrCreate2);
            SecP384R1Field.multiply(iArrCreate3, secP384R1FieldElement5.f10476x, iArrCreate3);
            SecP384R1Field.multiply(iArrCreate3, secP384R1FieldElement4.f10476x, iArrCreate3);
            iArr = iArrCreate2;
            iArr2 = iArrCreate3;
        }
        boolean zIsOne2 = secP384R1FieldElement6.isOne();
        if (zIsOne2) {
            iArr3 = secP384R1FieldElement.f10476x;
            iArr4 = secP384R1FieldElement2.f10476x;
        } else {
            SecP384R1Field.square(secP384R1FieldElement6.f10476x, iArrCreate4);
            SecP384R1Field.multiply(iArrCreate4, secP384R1FieldElement.f10476x, iArrCreate);
            SecP384R1Field.multiply(iArrCreate4, secP384R1FieldElement6.f10476x, iArrCreate4);
            SecP384R1Field.multiply(iArrCreate4, secP384R1FieldElement2.f10476x, iArrCreate4);
            iArr3 = iArrCreate;
            iArr4 = iArrCreate4;
        }
        int[] iArrCreate5 = Nat.create(12);
        SecP384R1Field.subtract(iArr3, iArr, iArrCreate5);
        int[] iArrCreate6 = Nat.create(12);
        SecP384R1Field.subtract(iArr4, iArr2, iArrCreate6);
        if (Nat.isZero(12, iArrCreate5)) {
            return Nat.isZero(12, iArrCreate6) ? twice() : curve.getInfinity();
        }
        SecP384R1Field.square(iArrCreate5, iArrCreate3);
        int[] iArrCreate7 = Nat.create(12);
        SecP384R1Field.multiply(iArrCreate3, iArrCreate5, iArrCreate7);
        SecP384R1Field.multiply(iArrCreate3, iArr3, iArrCreate3);
        SecP384R1Field.negate(iArrCreate7, iArrCreate7);
        Nat384.mul(iArr4, iArrCreate7, iArrCreate);
        SecP384R1Field.reduce32(Nat.addBothTo(12, iArrCreate3, iArrCreate3, iArrCreate7), iArrCreate7);
        SecP384R1FieldElement secP384R1FieldElement7 = new SecP384R1FieldElement(iArrCreate4);
        SecP384R1Field.square(iArrCreate6, secP384R1FieldElement7.f10476x);
        int[] iArr5 = secP384R1FieldElement7.f10476x;
        SecP384R1Field.subtract(iArr5, iArrCreate7, iArr5);
        SecP384R1FieldElement secP384R1FieldElement8 = new SecP384R1FieldElement(iArrCreate7);
        SecP384R1Field.subtract(iArrCreate3, secP384R1FieldElement7.f10476x, secP384R1FieldElement8.f10476x);
        Nat384.mul(secP384R1FieldElement8.f10476x, iArrCreate6, iArrCreate2);
        SecP384R1Field.addExt(iArrCreate, iArrCreate2, iArrCreate);
        SecP384R1Field.reduce(iArrCreate, secP384R1FieldElement8.f10476x);
        SecP384R1FieldElement secP384R1FieldElement9 = new SecP384R1FieldElement(iArrCreate5);
        if (!zIsOne) {
            int[] iArr6 = secP384R1FieldElement9.f10476x;
            SecP384R1Field.multiply(iArr6, secP384R1FieldElement5.f10476x, iArr6);
        }
        if (!zIsOne2) {
            int[] iArr7 = secP384R1FieldElement9.f10476x;
            SecP384R1Field.multiply(iArr7, secP384R1FieldElement6.f10476x, iArr7);
        }
        return new SecP384R1Point(curve, secP384R1FieldElement7, secP384R1FieldElement8, new ECFieldElement[]{secP384R1FieldElement9}, this.withCompression);
    }

    @Override // org.spongycastle.math.p012ec.ECPoint
    public ECPoint detach() {
        return new SecP384R1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.spongycastle.math.p012ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP384R1Point(this.curve, this.f10410x, this.f10411y.negate(), this.f10412zs, this.withCompression);
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
        SecP384R1FieldElement secP384R1FieldElement = (SecP384R1FieldElement) this.f10411y;
        if (secP384R1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP384R1FieldElement secP384R1FieldElement2 = (SecP384R1FieldElement) this.f10410x;
        SecP384R1FieldElement secP384R1FieldElement3 = (SecP384R1FieldElement) this.f10412zs[0];
        int[] iArrCreate = Nat.create(12);
        int[] iArrCreate2 = Nat.create(12);
        int[] iArrCreate3 = Nat.create(12);
        SecP384R1Field.square(secP384R1FieldElement.f10476x, iArrCreate3);
        int[] iArrCreate4 = Nat.create(12);
        SecP384R1Field.square(iArrCreate3, iArrCreate4);
        boolean zIsOne = secP384R1FieldElement3.isOne();
        int[] iArr = secP384R1FieldElement3.f10476x;
        if (!zIsOne) {
            SecP384R1Field.square(iArr, iArrCreate2);
            iArr = iArrCreate2;
        }
        SecP384R1Field.subtract(secP384R1FieldElement2.f10476x, iArr, iArrCreate);
        SecP384R1Field.add(secP384R1FieldElement2.f10476x, iArr, iArrCreate2);
        SecP384R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP384R1Field.reduce32(Nat.addBothTo(12, iArrCreate2, iArrCreate2, iArrCreate2), iArrCreate2);
        SecP384R1Field.multiply(iArrCreate3, secP384R1FieldElement2.f10476x, iArrCreate3);
        SecP384R1Field.reduce32(Nat.shiftUpBits(12, iArrCreate3, 2, 0), iArrCreate3);
        SecP384R1Field.reduce32(Nat.shiftUpBits(12, iArrCreate4, 3, 0, iArrCreate), iArrCreate);
        SecP384R1FieldElement secP384R1FieldElement4 = new SecP384R1FieldElement(iArrCreate4);
        SecP384R1Field.square(iArrCreate2, secP384R1FieldElement4.f10476x);
        int[] iArr2 = secP384R1FieldElement4.f10476x;
        SecP384R1Field.subtract(iArr2, iArrCreate3, iArr2);
        int[] iArr3 = secP384R1FieldElement4.f10476x;
        SecP384R1Field.subtract(iArr3, iArrCreate3, iArr3);
        SecP384R1FieldElement secP384R1FieldElement5 = new SecP384R1FieldElement(iArrCreate3);
        SecP384R1Field.subtract(iArrCreate3, secP384R1FieldElement4.f10476x, secP384R1FieldElement5.f10476x);
        int[] iArr4 = secP384R1FieldElement5.f10476x;
        SecP384R1Field.multiply(iArr4, iArrCreate2, iArr4);
        int[] iArr5 = secP384R1FieldElement5.f10476x;
        SecP384R1Field.subtract(iArr5, iArrCreate, iArr5);
        SecP384R1FieldElement secP384R1FieldElement6 = new SecP384R1FieldElement(iArrCreate2);
        SecP384R1Field.twice(secP384R1FieldElement.f10476x, secP384R1FieldElement6.f10476x);
        if (!zIsOne) {
            int[] iArr6 = secP384R1FieldElement6.f10476x;
            SecP384R1Field.multiply(iArr6, secP384R1FieldElement3.f10476x, iArr6);
        }
        return new SecP384R1Point(curve, secP384R1FieldElement4, secP384R1FieldElement5, new ECFieldElement[]{secP384R1FieldElement6}, this.withCompression);
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

    public SecP384R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        this(eCCurve, eCFieldElement, eCFieldElement2, false);
    }

    public SecP384R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        this.withCompression = z;
    }
}
