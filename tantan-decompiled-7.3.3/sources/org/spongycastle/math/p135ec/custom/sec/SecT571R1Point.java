package org.spongycastle.math.p135ec.custom.sec;

import org.spongycastle.math.p135ec.ECConstants;
import org.spongycastle.math.p135ec.ECCurve;
import org.spongycastle.math.p135ec.ECFieldElement;
import org.spongycastle.math.p135ec.ECPoint;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class SecT571R1Point extends ECPoint.AbstractF2m {
    public SecT571R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
        if ((eCFieldElement == null) == (eCFieldElement2 == null)) {
            this.withCompression = z;
        } else {
            wg3.m206174a("Exactly one of the field elements is null");
            throw null;
        }
    }

    @Override // org.spongycastle.math.p135ec.ECPoint
    public ECPoint add(ECPoint eCPoint) {
        ECFieldElement eCFieldElementMultiply;
        ECFieldElement eCFieldElementMultiply2;
        ECFieldElement eCFieldElementMultiply3;
        ECFieldElement eCFieldElementAddOne;
        ECFieldElement eCFieldElement;
        ECFieldElement eCFieldElementFromBigInteger;
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        ECFieldElement eCFieldElementMultiply4 = this.f207707x;
        ECFieldElement rawXCoord = eCPoint.getRawXCoord();
        if (eCFieldElementMultiply4.isZero()) {
            return rawXCoord.isZero() ? curve.getInfinity() : eCPoint.add(this);
        }
        ECFieldElement eCFieldElement2 = this.f207708y;
        ECFieldElement eCFieldElement3 = this.f207709zs[0];
        ECFieldElement rawYCoord = eCPoint.getRawYCoord();
        ECFieldElement zCoord = eCPoint.getZCoord(0);
        boolean zIsOne = eCFieldElement3.isOne();
        if (zIsOne) {
            eCFieldElementMultiply = rawXCoord;
            eCFieldElementMultiply2 = rawYCoord;
        } else {
            eCFieldElementMultiply = rawXCoord.multiply(eCFieldElement3);
            eCFieldElementMultiply2 = rawYCoord.multiply(eCFieldElement3);
        }
        boolean zIsOne2 = zCoord.isOne();
        if (zIsOne2) {
            eCFieldElementMultiply3 = eCFieldElement2;
        } else {
            eCFieldElementMultiply4 = eCFieldElementMultiply4.multiply(zCoord);
            eCFieldElementMultiply3 = eCFieldElement2.multiply(zCoord);
        }
        ECFieldElement eCFieldElementAdd = eCFieldElementMultiply3.add(eCFieldElementMultiply2);
        ECFieldElement eCFieldElementAdd2 = eCFieldElementMultiply4.add(eCFieldElementMultiply);
        if (eCFieldElementAdd2.isZero()) {
            return eCFieldElementAdd.isZero() ? twice() : curve.getInfinity();
        }
        if (rawXCoord.isZero()) {
            ECPoint eCPointNormalize = normalize();
            ECFieldElement xCoord = eCPointNormalize.getXCoord();
            ECFieldElement yCoord = eCPointNormalize.getYCoord();
            ECFieldElement eCFieldElementDivide = yCoord.add(rawYCoord).divide(xCoord);
            eCFieldElementAddOne = eCFieldElementDivide.square().add(eCFieldElementDivide).add(xCoord).addOne();
            if (eCFieldElementAddOne.isZero()) {
                return new SecT571R1Point(curve, eCFieldElementAddOne, SecT571R1Curve.SecT571R1_B_SQRT, this.withCompression);
            }
            ECFieldElement eCFieldElementAdd3 = eCFieldElementDivide.multiply(xCoord.add(eCFieldElementAddOne)).add(eCFieldElementAddOne).add(yCoord).divide(eCFieldElementAddOne).add(eCFieldElementAddOne);
            eCFieldElementFromBigInteger = curve.fromBigInteger(ECConstants.ONE);
            eCFieldElement = eCFieldElementAdd3;
        } else {
            ECFieldElement eCFieldElementSquare = eCFieldElementAdd2.square();
            ECFieldElement eCFieldElementMultiply5 = eCFieldElementAdd.multiply(eCFieldElementMultiply4);
            ECFieldElement eCFieldElementMultiply6 = eCFieldElementAdd.multiply(eCFieldElementMultiply);
            ECFieldElement eCFieldElementMultiply7 = eCFieldElementMultiply5.multiply(eCFieldElementMultiply6);
            if (eCFieldElementMultiply7.isZero()) {
                return new SecT571R1Point(curve, eCFieldElementMultiply7, SecT571R1Curve.SecT571R1_B_SQRT, this.withCompression);
            }
            ECFieldElement eCFieldElementMultiply8 = eCFieldElementAdd.multiply(eCFieldElementSquare);
            ECFieldElement eCFieldElementMultiply9 = !zIsOne2 ? eCFieldElementMultiply8.multiply(zCoord) : eCFieldElementMultiply8;
            ECFieldElement eCFieldElementSquarePlusProduct = eCFieldElementMultiply6.add(eCFieldElementSquare).squarePlusProduct(eCFieldElementMultiply9, eCFieldElement2.add(eCFieldElement3));
            if (!zIsOne) {
                eCFieldElementMultiply9 = eCFieldElementMultiply9.multiply(eCFieldElement3);
            }
            eCFieldElementAddOne = eCFieldElementMultiply7;
            eCFieldElement = eCFieldElementSquarePlusProduct;
            eCFieldElementFromBigInteger = eCFieldElementMultiply9;
        }
        return new SecT571R1Point(curve, eCFieldElementAddOne, eCFieldElement, new ECFieldElement[]{eCFieldElementFromBigInteger}, this.withCompression);
    }

    @Override // org.spongycastle.math.p135ec.ECPoint
    public ECPoint detach() {
        return new SecT571R1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.spongycastle.math.p135ec.ECPoint
    public boolean getCompressionYTilde() {
        ECFieldElement rawXCoord = getRawXCoord();
        return (rawXCoord.isZero() || getRawYCoord().testBitZero() == rawXCoord.testBitZero()) ? false : true;
    }

    @Override // org.spongycastle.math.p135ec.ECPoint
    public ECFieldElement getYCoord() {
        ECFieldElement eCFieldElement = this.f207707x;
        ECFieldElement eCFieldElement2 = this.f207708y;
        if (isInfinity() || eCFieldElement.isZero()) {
            return eCFieldElement2;
        }
        ECFieldElement eCFieldElementMultiply = eCFieldElement2.add(eCFieldElement).multiply(eCFieldElement);
        ECFieldElement eCFieldElement3 = this.f207709zs[0];
        return !eCFieldElement3.isOne() ? eCFieldElementMultiply.divide(eCFieldElement3) : eCFieldElementMultiply;
    }

    @Override // org.spongycastle.math.p135ec.ECPoint
    public ECPoint negate() {
        if (!isInfinity()) {
            ECFieldElement eCFieldElement = this.f207707x;
            if (!eCFieldElement.isZero()) {
                ECFieldElement eCFieldElement2 = this.f207708y;
                ECFieldElement eCFieldElement3 = this.f207709zs[0];
                return new SecT571R1Point(this.curve, eCFieldElement, eCFieldElement2.add(eCFieldElement3), new ECFieldElement[]{eCFieldElement3}, this.withCompression);
            }
        }
        return this;
    }

    @Override // org.spongycastle.math.p135ec.ECPoint
    public ECPoint twice() {
        if (isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        ECFieldElement eCFieldElementMultiply = this.f207707x;
        if (eCFieldElementMultiply.isZero()) {
            return curve.getInfinity();
        }
        ECFieldElement eCFieldElement = this.f207708y;
        ECFieldElement eCFieldElement2 = this.f207709zs[0];
        boolean zIsOne = eCFieldElement2.isOne();
        ECFieldElement eCFieldElementMultiply2 = zIsOne ? eCFieldElement : eCFieldElement.multiply(eCFieldElement2);
        ECFieldElement eCFieldElementSquare = zIsOne ? eCFieldElement2 : eCFieldElement2.square();
        ECFieldElement eCFieldElementAdd = eCFieldElement.square().add(eCFieldElementMultiply2).add(eCFieldElementSquare);
        if (eCFieldElementAdd.isZero()) {
            return new SecT571R1Point(curve, eCFieldElementAdd, SecT571R1Curve.SecT571R1_B_SQRT, this.withCompression);
        }
        ECFieldElement eCFieldElementSquare2 = eCFieldElementAdd.square();
        ECFieldElement eCFieldElementMultiply3 = zIsOne ? eCFieldElementAdd : eCFieldElementAdd.multiply(eCFieldElementSquare);
        if (!zIsOne) {
            eCFieldElementMultiply = eCFieldElementMultiply.multiply(eCFieldElement2);
        }
        return new SecT571R1Point(curve, eCFieldElementSquare2, eCFieldElementMultiply.squarePlusProduct(eCFieldElementAdd, eCFieldElementMultiply2).add(eCFieldElementSquare2).add(eCFieldElementMultiply3), new ECFieldElement[]{eCFieldElementMultiply3}, this.withCompression);
    }

    @Override // org.spongycastle.math.p135ec.ECPoint
    public ECPoint twicePlus(ECPoint eCPoint) {
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return twice();
        }
        ECCurve curve = getCurve();
        ECFieldElement eCFieldElement = this.f207707x;
        if (eCFieldElement.isZero()) {
            return eCPoint;
        }
        ECFieldElement rawXCoord = eCPoint.getRawXCoord();
        ECFieldElement zCoord = eCPoint.getZCoord(0);
        if (rawXCoord.isZero() || !zCoord.isOne()) {
            return twice().add(eCPoint);
        }
        ECFieldElement eCFieldElement2 = this.f207708y;
        ECFieldElement eCFieldElement3 = this.f207709zs[0];
        ECFieldElement rawYCoord = eCPoint.getRawYCoord();
        ECFieldElement eCFieldElementSquare = eCFieldElement.square();
        ECFieldElement eCFieldElementSquare2 = eCFieldElement2.square();
        ECFieldElement eCFieldElementSquare3 = eCFieldElement3.square();
        ECFieldElement eCFieldElementAdd = eCFieldElementSquare3.add(eCFieldElementSquare2).add(eCFieldElement2.multiply(eCFieldElement3));
        ECFieldElement eCFieldElementAddOne = rawYCoord.addOne();
        ECFieldElement eCFieldElementMultiplyPlusProduct = rawYCoord.multiply(eCFieldElementSquare3).add(eCFieldElementSquare2).multiplyPlusProduct(eCFieldElementAdd, eCFieldElementSquare, eCFieldElementSquare3);
        ECFieldElement eCFieldElementMultiply = rawXCoord.multiply(eCFieldElementSquare3);
        ECFieldElement eCFieldElementSquare4 = eCFieldElementMultiply.add(eCFieldElementAdd).square();
        if (eCFieldElementSquare4.isZero()) {
            return eCFieldElementMultiplyPlusProduct.isZero() ? eCPoint.twice() : curve.getInfinity();
        }
        if (eCFieldElementMultiplyPlusProduct.isZero()) {
            return new SecT571R1Point(curve, eCFieldElementMultiplyPlusProduct, SecT571R1Curve.SecT571R1_B_SQRT, this.withCompression);
        }
        ECFieldElement eCFieldElementMultiply2 = eCFieldElementMultiplyPlusProduct.square().multiply(eCFieldElementMultiply);
        ECFieldElement eCFieldElementMultiply3 = eCFieldElementMultiplyPlusProduct.multiply(eCFieldElementSquare4).multiply(eCFieldElementSquare3);
        return new SecT571R1Point(curve, eCFieldElementMultiply2, eCFieldElementMultiplyPlusProduct.add(eCFieldElementSquare4).square().multiplyPlusProduct(eCFieldElementAdd, eCFieldElementAddOne, eCFieldElementMultiply3), new ECFieldElement[]{eCFieldElementMultiply3}, this.withCompression);
    }

    public SecT571R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        this(eCCurve, eCFieldElement, eCFieldElement2, false);
    }

    public SecT571R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        this.withCompression = z;
    }
}
