package org.spongycastle.math.p012ec.custom.sec;

import l.ig3;
import org.spongycastle.math.p012ec.ECCurve;
import org.spongycastle.math.p012ec.ECFieldElement;
import org.spongycastle.math.p012ec.ECPoint;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat256;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SecP256K1Point extends ECPoint.AbstractFp {
    public SecP256K1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
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
        SecP256K1FieldElement secP256K1FieldElement = (SecP256K1FieldElement) this.f10410x;
        SecP256K1FieldElement secP256K1FieldElement2 = (SecP256K1FieldElement) this.f10411y;
        SecP256K1FieldElement secP256K1FieldElement3 = (SecP256K1FieldElement) eCPoint.getXCoord();
        SecP256K1FieldElement secP256K1FieldElement4 = (SecP256K1FieldElement) eCPoint.getYCoord();
        SecP256K1FieldElement secP256K1FieldElement5 = (SecP256K1FieldElement) this.f10412zs[0];
        SecP256K1FieldElement secP256K1FieldElement6 = (SecP256K1FieldElement) eCPoint.getZCoord(0);
        int[] iArrCreateExt = Nat256.createExt();
        int[] iArrCreate = Nat256.create();
        int[] iArrCreate2 = Nat256.create();
        int[] iArrCreate3 = Nat256.create();
        boolean zIsOne = secP256K1FieldElement5.isOne();
        if (zIsOne) {
            iArr = secP256K1FieldElement3.f10465x;
            iArr2 = secP256K1FieldElement4.f10465x;
        } else {
            SecP256K1Field.square(secP256K1FieldElement5.f10465x, iArrCreate2);
            SecP256K1Field.multiply(iArrCreate2, secP256K1FieldElement3.f10465x, iArrCreate);
            SecP256K1Field.multiply(iArrCreate2, secP256K1FieldElement5.f10465x, iArrCreate2);
            SecP256K1Field.multiply(iArrCreate2, secP256K1FieldElement4.f10465x, iArrCreate2);
            iArr = iArrCreate;
            iArr2 = iArrCreate2;
        }
        boolean zIsOne2 = secP256K1FieldElement6.isOne();
        if (zIsOne2) {
            iArr3 = secP256K1FieldElement.f10465x;
            iArr4 = secP256K1FieldElement2.f10465x;
        } else {
            SecP256K1Field.square(secP256K1FieldElement6.f10465x, iArrCreate3);
            SecP256K1Field.multiply(iArrCreate3, secP256K1FieldElement.f10465x, iArrCreateExt);
            SecP256K1Field.multiply(iArrCreate3, secP256K1FieldElement6.f10465x, iArrCreate3);
            SecP256K1Field.multiply(iArrCreate3, secP256K1FieldElement2.f10465x, iArrCreate3);
            iArr3 = iArrCreateExt;
            iArr4 = iArrCreate3;
        }
        int[] iArrCreate4 = Nat256.create();
        SecP256K1Field.subtract(iArr3, iArr, iArrCreate4);
        SecP256K1Field.subtract(iArr4, iArr2, iArrCreate);
        if (Nat256.isZero(iArrCreate4)) {
            return Nat256.isZero(iArrCreate) ? twice() : curve.getInfinity();
        }
        SecP256K1Field.square(iArrCreate4, iArrCreate2);
        int[] iArrCreate5 = Nat256.create();
        SecP256K1Field.multiply(iArrCreate2, iArrCreate4, iArrCreate5);
        SecP256K1Field.multiply(iArrCreate2, iArr3, iArrCreate2);
        SecP256K1Field.negate(iArrCreate5, iArrCreate5);
        Nat256.mul(iArr4, iArrCreate5, iArrCreateExt);
        SecP256K1Field.reduce32(Nat256.addBothTo(iArrCreate2, iArrCreate2, iArrCreate5), iArrCreate5);
        SecP256K1FieldElement secP256K1FieldElement7 = new SecP256K1FieldElement(iArrCreate3);
        SecP256K1Field.square(iArrCreate, secP256K1FieldElement7.f10465x);
        int[] iArr5 = secP256K1FieldElement7.f10465x;
        SecP256K1Field.subtract(iArr5, iArrCreate5, iArr5);
        SecP256K1FieldElement secP256K1FieldElement8 = new SecP256K1FieldElement(iArrCreate5);
        SecP256K1Field.subtract(iArrCreate2, secP256K1FieldElement7.f10465x, secP256K1FieldElement8.f10465x);
        SecP256K1Field.multiplyAddToExt(secP256K1FieldElement8.f10465x, iArrCreate, iArrCreateExt);
        SecP256K1Field.reduce(iArrCreateExt, secP256K1FieldElement8.f10465x);
        SecP256K1FieldElement secP256K1FieldElement9 = new SecP256K1FieldElement(iArrCreate4);
        if (!zIsOne) {
            int[] iArr6 = secP256K1FieldElement9.f10465x;
            SecP256K1Field.multiply(iArr6, secP256K1FieldElement5.f10465x, iArr6);
        }
        if (!zIsOne2) {
            int[] iArr7 = secP256K1FieldElement9.f10465x;
            SecP256K1Field.multiply(iArr7, secP256K1FieldElement6.f10465x, iArr7);
        }
        return new SecP256K1Point(curve, secP256K1FieldElement7, secP256K1FieldElement8, new ECFieldElement[]{secP256K1FieldElement9}, this.withCompression);
    }

    @Override // org.spongycastle.math.p012ec.ECPoint
    public ECPoint detach() {
        return new SecP256K1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.spongycastle.math.p012ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP256K1Point(this.curve, this.f10410x, this.f10411y.negate(), this.f10412zs, this.withCompression);
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
        SecP256K1FieldElement secP256K1FieldElement = (SecP256K1FieldElement) this.f10411y;
        if (secP256K1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP256K1FieldElement secP256K1FieldElement2 = (SecP256K1FieldElement) this.f10410x;
        SecP256K1FieldElement secP256K1FieldElement3 = (SecP256K1FieldElement) this.f10412zs[0];
        int[] iArrCreate = Nat256.create();
        SecP256K1Field.square(secP256K1FieldElement.f10465x, iArrCreate);
        int[] iArrCreate2 = Nat256.create();
        SecP256K1Field.square(iArrCreate, iArrCreate2);
        int[] iArrCreate3 = Nat256.create();
        SecP256K1Field.square(secP256K1FieldElement2.f10465x, iArrCreate3);
        SecP256K1Field.reduce32(Nat256.addBothTo(iArrCreate3, iArrCreate3, iArrCreate3), iArrCreate3);
        SecP256K1Field.multiply(iArrCreate, secP256K1FieldElement2.f10465x, iArrCreate);
        SecP256K1Field.reduce32(Nat.shiftUpBits(8, iArrCreate, 2, 0), iArrCreate);
        int[] iArrCreate4 = Nat256.create();
        SecP256K1Field.reduce32(Nat.shiftUpBits(8, iArrCreate2, 3, 0, iArrCreate4), iArrCreate4);
        SecP256K1FieldElement secP256K1FieldElement4 = new SecP256K1FieldElement(iArrCreate2);
        SecP256K1Field.square(iArrCreate3, secP256K1FieldElement4.f10465x);
        int[] iArr = secP256K1FieldElement4.f10465x;
        SecP256K1Field.subtract(iArr, iArrCreate, iArr);
        int[] iArr2 = secP256K1FieldElement4.f10465x;
        SecP256K1Field.subtract(iArr2, iArrCreate, iArr2);
        SecP256K1FieldElement secP256K1FieldElement5 = new SecP256K1FieldElement(iArrCreate);
        SecP256K1Field.subtract(iArrCreate, secP256K1FieldElement4.f10465x, secP256K1FieldElement5.f10465x);
        int[] iArr3 = secP256K1FieldElement5.f10465x;
        SecP256K1Field.multiply(iArr3, iArrCreate3, iArr3);
        int[] iArr4 = secP256K1FieldElement5.f10465x;
        SecP256K1Field.subtract(iArr4, iArrCreate4, iArr4);
        SecP256K1FieldElement secP256K1FieldElement6 = new SecP256K1FieldElement(iArrCreate3);
        SecP256K1Field.twice(secP256K1FieldElement.f10465x, secP256K1FieldElement6.f10465x);
        if (!secP256K1FieldElement3.isOne()) {
            int[] iArr5 = secP256K1FieldElement6.f10465x;
            SecP256K1Field.multiply(iArr5, secP256K1FieldElement3.f10465x, iArr5);
        }
        return new SecP256K1Point(curve, secP256K1FieldElement4, secP256K1FieldElement5, new ECFieldElement[]{secP256K1FieldElement6}, this.withCompression);
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

    public SecP256K1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        this(eCCurve, eCFieldElement, eCFieldElement2, false);
    }

    public SecP256K1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        this.withCompression = z;
    }
}
